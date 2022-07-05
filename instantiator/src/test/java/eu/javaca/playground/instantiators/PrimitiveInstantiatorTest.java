package eu.javaca.playground.instantiators;

import eu.javaca.playground.challengenentry.typeinstantiator.impl.PrimitiveInstantiator;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimitiveInstantiatorTest {

    @Test
    public void defaultPrimitiveInstantiatorTest() {
        PrimitiveInstantiator primitiveInstantiator = new PrimitiveInstantiator();
        Float f = (Float) primitiveInstantiator.createInstance(Float.class, null).get();

        assertThat(f).isNotNull();

        Optional<Object> instance = primitiveInstantiator.createInstance(String.class, null);

        assertThat(instance).isEmpty();
    }
}
