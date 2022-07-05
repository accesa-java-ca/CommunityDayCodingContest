package eu.javaca.playground.challengenentry.typeinstantiator;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.function.Function;

/**
 * An instantiator for a given Java type.
 */
public interface TypeInstantiator {

    /**
     * Instantiates the given {@link Type}.
     * If the Type that the instantiator can instantiate is complex, having fields or generic arguments that need to be handled,
     * the instantiator can delegate the creation of those fields to the {@code typeCreator} function.
     *
     * @param type        to instantiate
     * @param typeCreator function to instantiate types needed to create this type
     * @return {@code Optional} containing an instance of the given {@link Type} or {@code Optional.empty} if the type could not be instantiated
     */
    Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator);
}
