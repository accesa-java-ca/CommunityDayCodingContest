package eu.javaca.playground.instantiators;

import eu.javaca.playground.challengenentry.typeinstantiator.impl.StringInstantiator;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class StringInstantiatorTest {

    @Test
    public void defaultStringInstantiatorTest() {
        StringInstantiator stringInstantiator = new StringInstantiator();
        String s = (String) stringInstantiator.createInstance(String.class, null).get();

        assertThat(s).isNotNull();
        assertThat(s).hasSizeGreaterThan(0);

        Optional<Object> instance = stringInstantiator.createInstance(StringInstantiatorTest.class, null);

        assertThat(instance).isEmpty();
    }

    @Test
    public void customStringInstantiatorTest() {
        StringInstantiator stringInstantiator = new StringInstantiator(() -> "test");
        String s = (String) stringInstantiator.createInstance(String.class, null).get();

        assertThat(s).isEqualTo("test");
    }
}
