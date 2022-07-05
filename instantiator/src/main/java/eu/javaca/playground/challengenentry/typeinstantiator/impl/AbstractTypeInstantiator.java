package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;
import eu.javaca.playground.challengenentry.util.ClassUtil;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

public class AbstractTypeInstantiator implements TypeInstantiator {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractTypeInstantiator.class);
    private final Random random;
    private final ScanResult scanResult;

    /**
     * Instantiator that creates objects for {@code abstract} or {@code interface} types by scanning the classpath for implementations using {@link ClassGraph}.
     */
    public AbstractTypeInstantiator() {
        random = new Random();
        scanResult = new ClassGraph().enableSystemJarsAndModules().enableClassInfo().scan();
    }

    /**
     * Scans the classpath and tries to provide an instance for the abstract or interface type, selected at random.
     *
     * @param type        to instantiate
     * @param typeCreator function to instantiate types needed to create this type
     * @return Abstract or interface implementation or {@code Optional.empty} if type cannot be instantiated
     */
    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        Class<?> underlyingClass = ClassUtil.getUnderlyingClass(type);

        if (underlyingClass == null) {
            return Optional.empty();
        }

        int modifiers = underlyingClass.getModifiers();

        if (!Modifier.isAbstract(modifiers) && !Modifier.isInterface(modifiers)) {
            return Optional.empty();
        }

        ClassInfoList subTypes = null;
        if (Modifier.isAbstract(modifiers)) {
            subTypes = scanResult.getSubclasses(underlyingClass);
        }
        if (Modifier.isInterface(modifiers)) {
            subTypes = scanResult.getClassesImplementing(underlyingClass);
        }

        if (subTypes == null || subTypes.isEmpty()) {
            LOG.warn("Cannot determine subtypes of {}", type.getTypeName());
            return Optional.empty();
        }

        List<Class<?>> loadedSubTypes = subTypes
                .filter(ClassInfo::isPublic)
                .filter(subType -> !subType.isAbstract())
                .loadClasses(true);
        return typeCreator.apply(loadedSubTypes.get(random.nextInt(loadedSubTypes.size())));
    }
}
