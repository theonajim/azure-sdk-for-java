// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import com.azure.resourcemanager.servicenetworking.models.AssociationUpdate;
import com.azure.resourcemanager.servicenetworking.models.AssociationUpdateProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AssociationUpdateTests {
    @Test
    public void testDeserialize() {
        AssociationUpdate model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"gbquxigj\":\"bhtqqrolfpfpsa\",\"lnerkujysvleju\":\"jgzjaoyfhrtx\",\"kcprbnw\":\"fqawrlyxw\",\"ysszdnrujqguh\":\"xgjvtbv\"},\"properties\":{\"associationType\":\"subnets\",\"subnet\":{\"id\":\"f\"}}}")
                .toObject(AssociationUpdate.class);
        Assertions.assertEquals("bhtqqrolfpfpsa", model.tags().get("gbquxigj"));
        Assertions.assertEquals(AssociationType.SUBNETS, model.properties().associationType());
        Assertions.assertEquals("f", model.properties().subnet().id());
    }

    @Test
    public void testSerialize() {
        AssociationUpdate model =
            new AssociationUpdate()
                .withTags(
                    mapOf(
                        "gbquxigj",
                        "bhtqqrolfpfpsa",
                        "lnerkujysvleju",
                        "jgzjaoyfhrtx",
                        "kcprbnw",
                        "fqawrlyxw",
                        "ysszdnrujqguh",
                        "xgjvtbv"))
                .withProperties(
                    new AssociationUpdateProperties()
                        .withAssociationType(AssociationType.SUBNETS)
                        .withSubnet(new AssociationSubnet().withId("f")));
        model = BinaryData.fromObject(model).toObject(AssociationUpdate.class);
        Assertions.assertEquals("bhtqqrolfpfpsa", model.tags().get("gbquxigj"));
        Assertions.assertEquals(AssociationType.SUBNETS, model.properties().associationType());
        Assertions.assertEquals("f", model.properties().subnet().id());
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
