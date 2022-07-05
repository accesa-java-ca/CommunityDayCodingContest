package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Optional;
import java.util.function.Function;

/**
 * Instantiator for bounded {@link TypeVariable}s, like {@code T extends MyClass}.
 */
public class BoundedTypeVariableInstantiator implements TypeInstantiator {
    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        Class<?> underlyingClass = null;

        if (type instanceof TypeVariable) {
            try {
                underlyingClass = Class.forName(((TypeVariable<?>) type).getBounds()[0].getTypeName());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else if (type instanceof WildcardType) {
            underlyingClass = (Class<?>) ((WildcardType) type).getLowerBounds()[0];
        }

        if (underlyingClass == null) {
            return Optional.empty();
        }

        return typeCreator.apply(underlyingClass);
    }
}
