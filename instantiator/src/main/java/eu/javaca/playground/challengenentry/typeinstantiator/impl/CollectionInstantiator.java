package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import static eu.javaca.playground.challengenentry.util.ClassUtil.getUnderlyingClass;

/**
 * Instantiator for {@link Collection} types.
 */
public class CollectionInstantiator implements TypeInstantiator {
    private static final Logger LOG = LoggerFactory.getLogger(MapInstantiator.class);

    private final Supplier<Integer> collectionSizeSupplier;

    /**
     * Creates a {@link Collection} instantiator that generates {@link List} and {@link Set} implementations with a random number of elements between [0,5).
     */
    public CollectionInstantiator() {
        collectionSizeSupplier = () -> new Random().nextInt(5);
    }

    /**
     * Creates a {@link Collection} instantiator that generates {@link List} and {@link Set} implementations with a number of elements provided by {@code collectionSizeSupplier}.
     *
     * @param collectionSizeSupplier to provide the number of collection elements
     */
    public CollectionInstantiator(Supplier<Integer> collectionSizeSupplier) {
        this.collectionSizeSupplier = collectionSizeSupplier;
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        Type rawType;

        if (type instanceof ParameterizedType) {
            rawType = ((ParameterizedType) type).getRawType();
        } else if (getCollectionInstance(type).isPresent()) {
            LOG.info("Cannot determine element type of to raw typed Collection, creating only an empty Collection!");
            return getCollectionInstance(type);
        } else {
            return Optional.empty();
        }

        Optional<Object> optional = getCollectionInstance(rawType);
        if (optional.isEmpty()) {
            return optional;
        }

        Type actualTypeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];

        Collection collection = (Collection) optional.get();
        int collectionSize = collectionSizeSupplier.get();
        for (int i = 0; i < collectionSize; i++) {
            Optional<Object> instance = typeCreator.apply(actualTypeArgument);
            instance.ifPresent(collection::add);
        }

        return Optional.of(collection);
    }

    private Optional<Object> getCollectionInstance(Type collectionType) {
        Class<?> aClass = getUnderlyingClass(collectionType);

        if (aClass == null) {
            return Optional.empty();
        }

        if (List.class.isAssignableFrom(aClass)) {
            return Optional.of(new ArrayList<>());
        }

        if (Set.class.isAssignableFrom(aClass)) {
            return Optional.of(new HashSet<>());
        }

        return Optional.empty();
    }
}
