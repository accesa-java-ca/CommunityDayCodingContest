package eu.javaca.playground;

import eu.javaca.playground.challengenentry.mother.ObjectMother;
import eu.javaca.playground.challengenentry.typeinstantiator.impl.*;
import eu.javaca.playground.pojos.DatePojo;
import eu.javaca.playground.pojos.EverythingPojo;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectMotherTest {
    @Test
    void motherEverythingTest() {
        ObjectMother objectMother = new ObjectMother();

        Optional<Object> instantiate = objectMother.instantiate(EverythingPojo.class);

        EverythingPojo everythingPojo = (EverythingPojo) instantiate.get();

        assertThat(everythingPojo).isNotNull();
        assertThat(everythingPojo.address).hasSizeGreaterThan(0);
        assertThat(everythingPojo.amount).isNotZero();
        assertThat(everythingPojo.dateMap).isNotNull();
        assertThat(everythingPojo.intArray).isNotNull();
        assertThat(everythingPojo.target).isNotNull();
        assertThat(everythingPojo.workerList).isNotNull();
        assertThat(everythingPojo.worker).isNotNull();
    }

    @Test
    void configuredMotherTest() {
        ObjectMother objectMother = new ObjectMother();
        objectMother.addInstantiator(new ArrayInstantiator(() -> 10));
        objectMother.addInstantiator(new CollectionInstantiator(() -> 10));
        objectMother.addInstantiator(new StringInstantiator(() -> "configured"));
        objectMother.addInstantiator(new MapInstantiator(() -> 10));

        Optional<Object> instantiate = objectMother.instantiate(EverythingPojo.class);

        EverythingPojo everythingPojo = (EverythingPojo) instantiate.get();

        assertThat(everythingPojo).isNotNull();
        assertThat(everythingPojo.address).isEqualTo("configured");
        assertThat(everythingPojo.amount).isNotZero();
        assertThat(everythingPojo.dateMap.entrySet()).hasSize(1);
        assertThat(everythingPojo.dateMap.get("configured")).isNotNull();
        assertThat(everythingPojo.intArray).hasSize(10);
        assertThat(everythingPojo.workerList).hasSize(10);
        assertThat(everythingPojo.worker).isNotNull();
    }

    @Test
    void motherDatesTest() {
        ObjectMother objectMother = new ObjectMother(new DateInstantiator());

        Optional<Object> instantiate = objectMother.instantiate(DatePojo.class);

        DatePojo d = (DatePojo) instantiate.get();

        assertThat(d).isNotNull();
        assertThat(d.d).isNotNull();
        assertThat(d.d2).isNotNull();
        assertThat(d.d3).isNotNull();
        assertThat(d.d4).isNotNull();
        assertThat(d.d5).isNotNull();
        assertThat(d.d6).isNotNull();
        assertThat(d.s).isNull();
    }
}
