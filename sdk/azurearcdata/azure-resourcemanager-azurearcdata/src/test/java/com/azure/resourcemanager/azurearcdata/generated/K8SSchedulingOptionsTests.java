// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurearcdata.models.K8SResourceRequirements;
import com.azure.resourcemanager.azurearcdata.models.K8SSchedulingOptions;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class K8SSchedulingOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        K8SSchedulingOptions model =
            BinaryData
                .fromString(
                    "{\"resources\":{\"requests\":{\"suesnzw\":\"adehxnltyfsopp\",\"avo\":\"ej\",\"vudwx\":\"xzdmohctb\",\"gujjugwdkcglh\":\"ndnvo\"},\"limits\":{\"yggdtjixh\":\"zj\",\"evfyexfwhybcib\":\"kuofqweykhme\"},\"\":{\"ynnaam\":\"datadcsi\",\"qsc\":\"dataectehf\",\"hcjrefovgmk\":\"dataeypvhezrkg\"}},\"\":{\"pngjcrcczsqpjhvm\":\"dataeyyvxyqjpkcat\",\"a\":\"dataajvnysounqe\"}}")
                .toObject(K8SSchedulingOptions.class);
        Assertions.assertEquals("adehxnltyfsopp", model.resources().requests().get("suesnzw"));
        Assertions.assertEquals("zj", model.resources().limits().get("yggdtjixh"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        K8SSchedulingOptions model =
            new K8SSchedulingOptions()
                .withResources(
                    new K8SResourceRequirements()
                        .withRequests(
                            mapOf(
                                "suesnzw",
                                "adehxnltyfsopp",
                                "avo",
                                "ej",
                                "vudwx",
                                "xzdmohctb",
                                "gujjugwdkcglh",
                                "ndnvo"))
                        .withLimits(mapOf("yggdtjixh", "zj", "evfyexfwhybcib", "kuofqweykhme"))
                        .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(K8SSchedulingOptions.class);
        Assertions.assertEquals("adehxnltyfsopp", model.resources().requests().get("suesnzw"));
        Assertions.assertEquals("zj", model.resources().limits().get("yggdtjixh"));
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
