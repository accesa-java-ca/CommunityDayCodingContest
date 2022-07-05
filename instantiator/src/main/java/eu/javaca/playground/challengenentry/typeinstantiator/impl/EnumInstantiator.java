package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

/**
 * Instantiator for {@link Enum} types with random enum constant values.
 */
public class EnumInstantiator implements TypeInstantiator {
    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class<?>)) {
            return Optional.empty();
        }

        Class<?> c = (Class<?>) type;
        if (!c.isEnum()) {
            return Optional.empty();
        }

        Object[] enumConstants = c.getEnumConstants();
        return Optional.of(enumConstants[new Random().nextInt(enumConstants.length)]);
    }
}
