package eu.javaca.playground.instantiators;

import eu.javaca.playground.challengenentry.typeinstantiator.impl.NumberInstantiator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberInstantiatorTest {

    @Test
    public void defaultNumberInstantiatorTest() {
        NumberInstantiator numberInstantiator = new NumberInstantiator();
        BigDecimal bd = (BigDecimal) numberInstantiator.createInstance(BigDecimal.class, null).get();

        assertThat(bd).isNotNull();
        Optional<Object> instance = numberInstantiator.createInstance(String.class, null);

        assertThat(instance).isEmpty();
    }
}
