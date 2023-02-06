// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.SwaggerExternalDocumentation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SwaggerExternalDocumentationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwaggerExternalDocumentation model =
            BinaryData
                .fromString(
                    "{\"description\":\"pzaamrdixtreki\",\"uri\":\"wyskbruffgll\",\"extensions\":{\"qhvmblcouqe\":\"datautvlxhr\",\"randoypmb\":\"databhbcdszir\",\"ormkfqlwxldyk\":\"datat\"}}")
                .toObject(SwaggerExternalDocumentation.class);
        Assertions.assertEquals("pzaamrdixtreki", model.description());
        Assertions.assertEquals("wyskbruffgll", model.uri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwaggerExternalDocumentation model =
            new SwaggerExternalDocumentation()
                .withDescription("pzaamrdixtreki")
                .withUri("wyskbruffgll")
                .withExtensions(
                    mapOf("qhvmblcouqe", "datautvlxhr", "randoypmb", "databhbcdszir", "ormkfqlwxldyk", "datat"));
        model = BinaryData.fromObject(model).toObject(SwaggerExternalDocumentation.class);
        Assertions.assertEquals("pzaamrdixtreki", model.description());
        Assertions.assertEquals("wyskbruffgll", model.uri());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
