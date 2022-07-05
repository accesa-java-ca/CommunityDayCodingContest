package eu.javaca.playground;

import eu.javaca.playground.challengenentry.Instantiator;
import eu.javaca.playground.challengenentry.mother.ObjectMother;
import eu.javaca.playground.simple.example.SimpleTestClass;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InstantiableTest {

    @Test
    void instantiatorNullArgumentsTest() {
        Instantiator instantiator = new Instantiator();
        NullPointerException npeClass = assertThrows(NullPointerException.class, () -> instantiator.instantiate(null, Target.JSON));
        assertEquals(npeClass.getMessage(), "Class to instantiate cannot be null!");

        NullPointerException npeTarget = assertThrows(NullPointerException.class, () -> instantiator.instantiate(InstantiableTest.class, null));
        assertEquals(npeTarget.getMessage(), "Target format cannot be null!");
    }

    @Test
    void instantiatorSimpleTestClassTest() {
        ObjectMother objectMother = new ObjectMother();

        Optional<Object> instantiate = objectMother.instantiate(SimpleTestClass.class);

        SimpleTestClass stc = (SimpleTestClass) instantiate.get();

        assertThat(stc).isNotNull();
        assertThat(stc.age).isNotNull();
        assertThat(stc.hobbies).isNotNull();
        assertThat(stc.name).hasSizeGreaterThan(0);
        assertThat(stc.favouriteBook).isNotNull();
        assertThat(stc.favouriteBook.name).hasSizeGreaterThan(0);
        assertThat(stc.favouriteBook.ISBN).hasSizeGreaterThan(0);
        assertThat(stc.workplace.workers).isNotNull();
    }
}