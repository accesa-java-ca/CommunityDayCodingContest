package eu.javaca.playground.instantiators;

import eu.javaca.playground.challengenentry.typeinstantiator.impl.ArrayInstantiator;
import eu.javaca.playground.challengenentry.typeinstantiator.impl.StringInstantiator;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayInstantiatorTest {

    @Test
    public void defaultArrayInstantiatorTest() {
        ArrayInstantiator arrayInstantiator = new ArrayInstantiator();
        StringInstantiator stringInstantiator = new StringInstantiator();
        String[] sArray = (String[]) arrayInstantiator.createInstance(String[].class, (s) -> stringInstantiator.createInstance(s, null)).get();

        assertThat(sArray).isNotNull();

        Optional<Object> instance = arrayInstantiator.createInstance(String.class, null);
        assertThat(instance).isEmpty();
    }

    @Test
    public void customArrayInstantiatorTest() {
        ArrayInstantiator arrayInstantiator = new ArrayInstantiator(() -> 2);
        StringInstantiator stringInstantiator = new StringInstantiator(() -> "test");
        String[] sArray = (String[]) arrayInstantiator.createInstance(String[].class, (s) -> stringInstantiator.createInstance(s, null)).get();

        assertThat(sArray).isNotNull();
        assertThat(sArray).hasSize(2);
        assertThat(sArray[0]).isEqualTo("test");
        assertThat(sArray[1]).isEqualTo("test");
    }
}
