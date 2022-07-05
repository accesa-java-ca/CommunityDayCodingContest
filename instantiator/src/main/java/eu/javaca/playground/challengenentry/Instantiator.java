package eu.javaca.playground.challengenentry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import eu.javaca.playground.Instantiable;
import eu.javaca.playground.Target;
import eu.javaca.playground.challengenentry.mother.ObjectMother;

import java.util.Objects;
import java.util.Optional;

public class Instantiator implements Instantiable {
    private final ObjectMother objectMother;
    private final JsonMapper mapper;
    private final XmlMapper xmlMapper;

    public Instantiator() {
        objectMother = new ObjectMother();
        mapper = JsonMapper
                .builder()
                .addModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .build();
        xmlMapper = new XmlMapper();
    }

    @Override
    public String instantiate(Class any, Target target) {
        Objects.requireNonNull(any, "Class to instantiate cannot be null!");
        Objects.requireNonNull(target, "Target format cannot be null!");

        Optional<Object> instance = objectMother.instantiate(any);

        if (instance.isEmpty()) {
            throw new RuntimeException("Could not instantiate " + any.getName());
        }

        return serializeInstance(instance.get(), target);
    }

    private String serializeInstance(Object instance, Target target) {
        switch (target) {
            case JSON:
                return toJson(instance);
            case XML:
                return toXML(instance);
            default:
                throw new IllegalArgumentException();
        }
    }

    private String toJson(Object instance) {
        try {
            return mapper.writeValueAsString(instance);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    private String toXML(Object instance) {
        try {
            return xmlMapper.writeValueAsString(instance);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
