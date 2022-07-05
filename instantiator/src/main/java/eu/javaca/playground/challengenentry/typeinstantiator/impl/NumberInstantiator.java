package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

/**
 * Instantiator for {@link Number} types.
 */
public class NumberInstantiator implements TypeInstantiator {
    private final Random random;

    /**
     * Creates a new {@link Number} instantiator that generates {@link BigInteger} and {@link BigDecimal} implementations with random values.
     */
    public NumberInstantiator() {
        random = new Random();
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class<?>)) {
            return Optional.empty();
        }

        if (!Number.class.isAssignableFrom((Class<?>) type)) {
            return Optional.empty();
        }

        if (BigInteger.class.isAssignableFrom((Class<?>) type)) {
            return Optional.of(BigInteger.valueOf(random.nextInt()));
        } else if (BigDecimal.class.isAssignableFrom((Class<?>) type)) {
            return Optional.of(BigDecimal.valueOf(random.nextDouble()));
        } else {
            return Optional.of(0);
        }
    }
}
