package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;

/**
 * Instantiator for primitive types and their wrapper classes with random values.
 */
public class PrimitiveInstantiator implements TypeInstantiator {
    private final Map<Type, Function<Type, Object>> classFunctionMap;

    /**
     * Creates a primitive type instantiator that can also generate primitive wrapper types.
     */
    public PrimitiveInstantiator() {
        classFunctionMap = new HashMap<>();
        Random random = new Random();

        Function booleanValue = o -> random.nextBoolean();
        classFunctionMap.put(Boolean.TYPE, booleanValue);
        classFunctionMap.put(Boolean.class, booleanValue);

        Function int128Value = o -> random.nextInt(128);
        classFunctionMap.put(Character.TYPE, int128Value);
        classFunctionMap.put(Character.class, int128Value);
        classFunctionMap.put(Byte.TYPE, int128Value);
        classFunctionMap.put(Byte.class, int128Value);

        Function int1024Value = o -> random.nextInt(1024);
        classFunctionMap.put(Short.TYPE, int1024Value);
        classFunctionMap.put(Short.class, int1024Value);

        Function intValue = o -> random.nextInt();
        classFunctionMap.put(Integer.TYPE, intValue);
        classFunctionMap.put(Integer.class, intValue);

        Function longValue = o -> random.nextLong();
        classFunctionMap.put(Long.TYPE, longValue);
        classFunctionMap.put(Long.class, longValue);

        Function floatValue = o -> random.nextFloat();
        classFunctionMap.put(Float.TYPE, floatValue);
        classFunctionMap.put(Float.class, floatValue);

        Function doubleValue = o -> random.nextDouble();
        classFunctionMap.put(Double.TYPE, doubleValue);
        classFunctionMap.put(Double.class, doubleValue);
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class<?>)) {
            return Optional.empty();
        }

        Function<Type, Object> function = classFunctionMap.get(type);

        if (function == null) {
            return Optional.empty();
        }

        return Optional.of(function.apply(type));
    }
}
