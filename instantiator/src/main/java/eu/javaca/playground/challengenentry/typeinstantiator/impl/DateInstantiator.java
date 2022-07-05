package eu.javaca.playground.challengenentry.typeinstantiator.impl;

import eu.javaca.playground.challengenentry.typeinstantiator.TypeInstantiator;

import java.lang.reflect.Type;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

import static eu.javaca.playground.challengenentry.util.ClassUtil.getUnderlyingClass;

/**
 * Creates a temporal type instantiator that can generate random instances of the following list and their subclasses:
 * <ul>
 *     <li>{@link Date}</li>
 *     <li>{@link LocalDate}</li>
 *     <li>{@link LocalTime}</li>
 *     <li>{@link LocalDateTime}</li>
 *     <li>{@link OffsetDateTime}</li>
 * </ul>
 */
public class DateInstantiator implements TypeInstantiator {
    @Override
    public Optional<Object> createInstance(Type type, Function<Type, Optional<Object>> typeCreator) {
        if (!(type instanceof Class)) {
            return Optional.empty();
        }

        return getDateInstance(type);
    }

    private Optional<Object> getDateInstance(Type type) {
        Class<?> aClass = getUnderlyingClass(type);

        if (aClass == null) {
            return Optional.empty();
        }

        if (Date.class.isAssignableFrom(aClass)) {
            int year = ThreadLocalRandom.current().nextInt(1910, 2467);
            int month = ThreadLocalRandom.current().nextInt(0, 12);
            int day = ThreadLocalRandom.current().nextInt(1, 32);
            Calendar instance = Calendar.getInstance();
            instance.set(year, month, day);
            return Optional.of(instance.getTime());
        }

        int year = ThreadLocalRandom.current().nextInt(1910, 2467);
        int month = ThreadLocalRandom.current().nextInt(1, 13);
        int day = ThreadLocalRandom.current().nextInt(1, 28); // mitigate leap years
        if (LocalDate.class.isAssignableFrom(aClass)) {
            return Optional.of(LocalDate.of(year, month, day));
        }

        if (LocalTime.class.isAssignableFrom(aClass)) {
            return Optional.of(LocalTime.ofSecondOfDay(ThreadLocalRandom.current().nextInt(24 * 60 * 60 - 1)));
        }

        int hour = ThreadLocalRandom.current().nextInt(0, 24);
        int minute = ThreadLocalRandom.current().nextInt(0, 60);
        if (LocalDateTime.class.isAssignableFrom(aClass)) {
            return Optional.of(LocalDateTime.of(year, month, day, hour, minute));
        }

        int second = ThreadLocalRandom.current().nextInt(0, 60);
        if (OffsetDateTime.class.isAssignableFrom(aClass)) {
            return Optional.of(OffsetDateTime.of(year, month, day, hour, minute, second, second, ZoneOffset.UTC));
        }

        return Optional.empty();
    }
}
