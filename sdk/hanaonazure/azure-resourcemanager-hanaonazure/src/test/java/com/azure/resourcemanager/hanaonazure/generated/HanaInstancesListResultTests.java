// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hanaonazure.fluent.models.HanaInstanceInner;
import com.azure.resourcemanager.hanaonazure.models.HanaInstancesListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HanaInstancesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HanaInstancesListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"hanaInstanceId\":\"hab\",\"powerState\":\"unknown\",\"proximityPlacementGroup\":\"kxwczbyscnpqxuhi\",\"hwRevision\":\"qniwbybrkxvdumj\",\"partnerNodeId\":\"tfwvukxgaudc\",\"provisioningState\":\"Succeeded\"},\"location\":\"h\",\"tags\":{\"zw\":\"nyejhkryhtnap\",\"kkvnipjox\":\"okjye\",\"podmailzydehojwy\":\"jnchgej\",\"qwixjspro\":\"huxinpmqnj\"},\"id\":\"vcputegj\",\"name\":\"wmfdatscmdvpjhul\",\"type\":\"uuvmkjozkrwfnd\"}],\"nextLink\":\"djpslw\"}")
                .toObject(HanaInstancesListResult.class);
        Assertions.assertEquals("h", model.value().get(0).location());
        Assertions.assertEquals("nyejhkryhtnap", model.value().get(0).tags().get("zw"));
        Assertions.assertEquals("tfwvukxgaudc", model.value().get(0).partnerNodeId());
        Assertions.assertEquals("djpslw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HanaInstancesListResult model =
            new HanaInstancesListResult()
                .withValue(
                    Arrays
                        .asList(
                            new HanaInstanceInner()
                                .withLocation("h")
                                .withTags(
                                    mapOf(
                                        "zw",
                                        "nyejhkryhtnap",
                                        "kkvnipjox",
                                        "okjye",
                                        "podmailzydehojwy",
                                        "jnchgej",
                                        "qwixjspro",
                                        "huxinpmqnj"))
                                .withPartnerNodeId("tfwvukxgaudc")))
                .withNextLink("djpslw");
        model = BinaryData.fromObject(model).toObject(HanaInstancesListResult.class);
        Assertions.assertEquals("h", model.value().get(0).location());
        Assertions.assertEquals("nyejhkryhtnap", model.value().get(0).tags().get("zw"));
        Assertions.assertEquals("tfwvukxgaudc", model.value().get(0).partnerNodeId());
        Assertions.assertEquals("djpslw", model.nextLink());
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
