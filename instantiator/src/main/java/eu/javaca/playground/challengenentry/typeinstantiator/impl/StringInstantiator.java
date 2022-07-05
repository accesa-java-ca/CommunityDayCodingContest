package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import com.github.javafaker.Faker;
import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class StringInstantiator implements TypeInstantiator {

    private final Supplier<String> stringSupplier;

    /**
     * Creates a {@link String} type instantiator that generates random strings using {@link Faker}.
     */
    public StringInstantiator() {
        stringSupplier = new FakerStringGenerator().getRandomStringSupplier();
    }

    /**
     * Creates a {@link String} type instantiator that generates strings using the provided {@code String} {@link Supplier}.
     *
     * @param stringSupplier used to get {@link String} values from
     */
    public StringInstantiator(Supplier<String> stringSupplier) {
        this.stringSupplier = stringSupplier;
    }

    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class<?>)) {
            return Optional.empty();
        }

        if (!String.class.equals(type)) {
            return Optional.empty();
        }

        return Optional.ofNullable(stringSupplier.get());
    }

    private static class FakerStringGenerator {
        private final ArrayList<Supplier<String>> stringGenerators;
        private final Random random;
        private final Faker faker;

        public FakerStringGenerator() {
            stringGenerators = new ArrayList<>();
            faker = new Faker();
            random = new Random();

            stringGenerators.add(() -> faker.book().title());
            stringGenerators.add(() -> faker.witcher().witcher());
            stringGenerators.add(() -> faker.artist().name());
            stringGenerators.add(() -> faker.cat().breed());
            stringGenerators.add(() -> faker.beer().name());
            stringGenerators.add(() -> faker.dune().character());
            stringGenerators.add(() -> faker.lordOfTheRings().character());
        }

        public Supplier<String> getRandomStringSupplier() {
            return () -> stringGenerators.get(random.nextInt(stringGenerators.size())).get();
        }
    }
}
