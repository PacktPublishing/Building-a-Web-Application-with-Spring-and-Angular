package com.example.validationservice;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Base64;

/**
 * Created by magemello on 17/08/2017.
 */
public class PasswordBase64 extends JsonSerializer<String> {

    @Override
    public void serialize(String value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("value", new String(Base64.getDecoder().decode(value),"UTF-8"));
        jsonGenerator.writeEndObject();
    }
}
