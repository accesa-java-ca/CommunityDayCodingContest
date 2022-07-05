package eu.javaca.playground.challengenentry.mother;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;
import eu.javaca.playground.challengenentry.typeinstantiator.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static eu.javaca.playground.challengenentry.util.ClassUtil.*;

public class ObjectMother {
    private static final Logger LOG = LoggerFactory.getLogger(ObjectMother.class);
    private final Map<Class<? extends TypeInstantiator>, TypeInstantiator> instantiators = new LinkedHashMap<>();

    private final ThreadLocal<AtomicInteger> stackDepth = ThreadLocal.withInitial(AtomicInteger::new);
    private final int MAX_STACK_DEPTH = 1000;

    /**
     * Creates an {@code ObjectMother} configured with default {@link TypeInstantiator}s.
     */
    public ObjectMother() {
        instantiators.put(PrimitiveInstantiator.class, new PrimitiveInstantiator());
        instantiators.put(StringInstantiator.class, new StringInstantiator());
        instantiators.put(ArrayInstantiator.class, new ArrayInstantiator());
        instantiators.put(EnumInstantiator.class, new EnumInstantiator());
        instantiators.put(CollectionInstantiator.class, new CollectionInstantiator());
        instantiators.put(MapInstantiator.class, new MapInstantiator());
        instantiators.put(NumberInstantiator.class, new NumberInstantiator());
        instantiators.put(AbstractTypeInstantiator.class, new AbstractTypeInstantiator());
        instantiators.put(BoundedTypeVariableInstantiator.class, new BoundedTypeVariableInstantiator());
        instantiators.put(DateInstantiator.class, new DateInstantiator());
    }

    /**
     * Creates an {@code ObjectMother} configured with the {@link TypeInstantiator}s provided as arguments.
     */
    public ObjectMother(TypeInstantiator... instantiators) {
        Arrays.stream(instantiators).forEach(i -> this.instantiators.put(i.getClass(), i));
    }

    /**
     * Adds the provided instantiator to the list of available type instantiators. If an instantiator of the given type already exists, then it's replaced by the provided instantiator.
     *
     * @param instantiator to add
     */
    public void addInstantiator(TypeInstantiator instantiator) {
        instantiators.put(instantiator.getClass(), instantiator);
    }

    /**
     * Instantiates an object of the given {@link Type} by trying to get an instance from the configured {@link TypeInstantiator}s. If no value supplied by instantiators, will instantiate the {@code Type} using Reflection and try to supply a value for each field using the configured instantiators.
     *
     * @param type to instantiate
     * @return object instance
     */
    public Optional<Object> instantiate(Type type) {
        if (stackDepth.get().intValue() > MAX_STACK_DEPTH) {
            LOG.error("Hit maximum stack depth, aborting...");
            return Optional.empty();
        }

        stackDepth.get().incrementAndGet();

        if (type == null) {
            return Optional.empty();
        }

        Optional<Object> objectFromInstantiators = getFromInstantiators(type);
        if (objectFromInstantiators.isPresent()) {
            return objectFromInstantiators;
        }

        Class<?> clz = getUnderlyingClass(type);
        if (clz == null) {
            return Optional.empty();
        }

        if (!canInstantiateClass(clz)) {
            return Optional.empty();
        }

        try {
            return createNewObject(clz);
        } catch (Exception e) {
            LOG.error("Exception while instantiating {}", clz.getName(), e);
            return Optional.empty();
        }
    }

    /**
     * Loops though the list of configured instantiators trying to get an instance for the {@code Type} argument.
     *
     * @param type to get an instance for from the list of instantiators
     * @return object instance or {@code Optional.empty} if none was provided by instantiators
     */
    private Optional<Object> getFromInstantiators(Type type) {
        for (TypeInstantiator ins : instantiators.values()) { // TODO: go through the list in reverse order so that recently added instantiators take precedence over existing ones
            Optional<Object> random = ins.createInstance(type, this::instantiate);
            if (random.isPresent()) {
                return random;
            }
        }

        return Optional.empty();
    }

    /**
     * Instantiates a {@code class} and all it's fields, including ones inherited from superclasses.
     *
     * @param clz to instantiate
     * @return object instance or {@code Optional.empty} if object cannot be instantiated
     * @throws IllegalAccessException if a field cannot be set
     */
    private Optional<Object> createNewObject(Class<?> clz) throws IllegalAccessException {
        Object instance = callDeclaredConstructor(clz);

        if (instance == null) {
            return Optional.empty();
        }

        List<Field> declaredFields = getTypeFields(clz);
        for (Field f : declaredFields) {
            Type genericType = f.getGenericType();
            LOG.info("Instantiating field {}, of type {}", f.getName(), genericType.getTypeName());
            Optional<Object> random = getFromInstantiators(genericType);
            if (random.isPresent()) {
                f.setAccessible(true);
                f.set(instance, random.get());
            } else {
                Optional<Object> randomObject = instantiate(genericType);
                f.setAccessible(true);
                f.set(instance, randomObject.orElse(null));
            }
        }
        return Optional.of(instance);
    }
}
