package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

import static eu.javaca.playground.challengenentry.util.ClassUtil.getUnderlyingClass;

/**
 * Instantiator for {@link Map} types.
 */
public class MapInstantiator implements TypeInstantiator {
    private static final Logger LOG = LoggerFactory.getLogger(MapInstantiator.class);

    private final Supplier<Integer> mapEntryLengthSupplier;


    /**
     * Creates a {@link Map} instantiator that generates maps with a random number of entries between [0,5).
     */
    public MapInstantiator() {
        mapEntryLengthSupplier = () -> new Random().nextInt(5);
    }

    /**
     * Creates a {@link Map} instantiator that generates maps a number of entries provided by {@code mapEntryLengthSupplier}.
     *
     * @param mapEntryLengthSupplier to provide the number of map entries
     */
    public MapInstantiator(Supplier<Integer> mapEntryLengthSupplier) {
        this.mapEntryLengthSupplier = mapEntryLengthSupplier;
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        Type rawType;
        if (type instanceof ParameterizedType) {
            rawType = ((ParameterizedType) type).getRawType();
        } else if (getMapInstance(type).isPresent()) {
            LOG.info("Cannot determine entry type of to raw typed Map, creating only an empty Map!");
            return Optional.of(new HashMap());
        } else {
            return Optional.empty();
        }

        Optional<Object> mapInstance = getMapInstance(rawType);
        if (mapInstance.isEmpty()) {
            return mapInstance;
        }

        Type keyType = ((ParameterizedType) type).getActualTypeArguments()[0];
        Type valueType = ((ParameterizedType) type).getActualTypeArguments()[1];

        Map map = (Map) mapInstance.get();
        int mapEntries = mapEntryLengthSupplier.get();
        for (int i = 0; i < mapEntries; i++) {
            Optional<Object> keyInstance = typeCreator.apply(keyType);
            Optional<Object> valueInstance = typeCreator.apply(valueType);

            keyInstance.ifPresent(o -> map.put(o, valueInstance.orElse(null)));
        }

        return Optional.of(map);
    }

    private Optional<Object> getMapInstance(Type type) {
        Class<?> aClass = getUnderlyingClass(type);

        if (aClass == null) {
            return Optional.empty();
        }

        if (Map.class.isAssignableFrom(aClass)) {
            return Optional.of(new HashMap<>());
        }

        return Optional.empty();
    }
}
