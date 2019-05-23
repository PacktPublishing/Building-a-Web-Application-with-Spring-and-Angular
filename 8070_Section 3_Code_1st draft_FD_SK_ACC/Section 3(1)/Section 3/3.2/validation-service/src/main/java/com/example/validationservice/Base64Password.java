package com.example.validationservice;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by magemello on 14/06/2017.
 */
class Base64Password extends JsonDeserializer<String> {

    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);

        return new BASE64Encoder().encode(node.asText().getBytes());
    }
}

