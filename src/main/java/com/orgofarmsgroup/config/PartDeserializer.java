package com.orgofarmsgroup.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import jakarta.servlet.http.Part;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PartDeserializer extends JsonDeserializer<Part> {

    @Override
    public Part deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return null;
    }
}