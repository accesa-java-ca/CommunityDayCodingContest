package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Instantiator for {@code Array} types.
 */
public class ArrayInstantiator implements TypeInstantiator {
    private final Supplier<Integer> arrayLengthSupplier;

    /**
     * Creates an {@code n} dimension {@code Array} instantiator that generates arrays of random length between [0,5).
     */
    public ArrayInstantiator() {
        arrayLengthSupplier = () -> new Random().nextInt(5);
    }

    /**
     * Creates an {@code n} dimension {@code Array} instantiator that generates arrays of length provided by {@code arrayLengthSupplier}.
     *
     * @param arrayLengthSupplier to provide array lengths
     */
    public ArrayInstantiator(Supplier<Integer> arrayLengthSupplier) {
        this.arrayLengthSupplier = arrayLengthSupplier;
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class<?>)) {
            return Optional.empty();
        }

        Class<?> c = (Class<?>) type;
        if (!c.isArray()) {
            return Optional.empty();
        }

        int arrayLength = arrayLengthSupplier.get();
        Class<?> componentType = c.getComponentType();
        Object arrayInstance = Array.newInstance(componentType, arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            Optional<Object> baseTypeInstance = typeCreator.apply(componentType);
            Array.set(arrayInstance, i, baseTypeInstance.orElse(null));
        }

        return Optional.of(arrayInstance);
    }
}
