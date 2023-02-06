// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.CodeContainerInner;
import com.azure.resourcemanager.machinelearning.models.CodeContainerProperties;
import com.azure.resourcemanager.machinelearning.models.CodeContainerResourceArmPaginatedResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CodeContainerResourceArmPaginatedResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CodeContainerResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"kojvd\",\"value\":[{\"properties\":{\"isArchived\":true,\"latestVersion\":\"ouicybxarzgszu\",\"nextVersion\":\"x\",\"description\":\"q\",\"properties\":{},\"tags\":{}},\"id\":\"oamciodh\",\"name\":\"haz\",\"type\":\"khnzbonlw\"},{\"properties\":{\"isArchived\":true,\"latestVersion\":\"gokdwbwhks\",\"nextVersion\":\"cmrvexzt\",\"description\":\"t\",\"properties\":{},\"tags\":{}},\"id\":\"ra\",\"name\":\"yzkoowtlmngu\",\"type\":\"aw\"},{\"properties\":{\"isArchived\":true,\"latestVersion\":\"syuuximerq\",\"nextVersion\":\"bw\",\"description\":\"nkbykutwpfhp\",\"properties\":{},\"tags\":{}},\"id\":\"r\",\"name\":\"kdsnfdsdoakgtdl\",\"type\":\"kkze\"},{\"properties\":{\"isArchived\":false,\"latestVersion\":\"ewpusdsttwvogvb\",\"nextVersion\":\"jdcngqqm\",\"description\":\"kufgmj\",\"properties\":{},\"tags\":{}},\"id\":\"dgrtwaenuuzkopbm\",\"name\":\"nrfdw\",\"type\":\"yuhhziu\"}]}")
                .toObject(CodeContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("kojvd", model.nextLink());
        Assertions.assertEquals("q", model.value().get(0).properties().description());
        Assertions.assertEquals(true, model.value().get(0).properties().isArchived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CodeContainerResourceArmPaginatedResult model =
            new CodeContainerResourceArmPaginatedResult()
                .withNextLink("kojvd")
                .withValue(
                    Arrays
                        .asList(
                            new CodeContainerInner()
                                .withProperties(
                                    new CodeContainerProperties()
                                        .withDescription("q")
                                        .withProperties(mapOf())
                                        .withTags(mapOf())
                                        .withIsArchived(true)),
                            new CodeContainerInner()
                                .withProperties(
                                    new CodeContainerProperties()
                                        .withDescription("t")
                                        .withProperties(mapOf())
                                        .withTags(mapOf())
                                        .withIsArchived(true)),
                            new CodeContainerInner()
                                .withProperties(
                                    new CodeContainerProperties()
                                        .withDescription("nkbykutwpfhp")
                                        .withProperties(mapOf())
                                        .withTags(mapOf())
                                        .withIsArchived(true)),
                            new CodeContainerInner()
                                .withProperties(
                                    new CodeContainerProperties()
                                        .withDescription("kufgmj")
                                        .withProperties(mapOf())
                                        .withTags(mapOf())
                                        .withIsArchived(false))));
        model = BinaryData.fromObject(model).toObject(CodeContainerResourceArmPaginatedResult.class);
        Assertions.assertEquals("kojvd", model.nextLink());
        Assertions.assertEquals("q", model.value().get(0).properties().description());
        Assertions.assertEquals(true, model.value().get(0).properties().isArchived());
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
