package eu.javaca.playground.instantiators;

import eu.javaca.playground.Target;
import eu.javaca.playground.challengenentry.typeinstantiator.impl.EnumInstantiator;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumInstantiatorTest {
    @Test
    public void enumInstantiatorTest() {
        EnumInstantiator enumInstantiator = new EnumInstantiator();

        Target t = (Target) enumInstantiator.createInstance(Target.class, null).get();
        assertThat(t).isNotNull();
        Consumer<Target> isJson = e -> assertThat(e).isEqualTo(Target.JSON);
        Consumer<Target> isXml = e -> assertThat(e).isEqualTo(Target.XML);
        assertThat(t).satisfiesAnyOf(isJson, isXml);

        Optional<Object> instance = enumInstantiator.createInstance(String.class, null);
        assertThat(instance).isEmpty();
    }
}
