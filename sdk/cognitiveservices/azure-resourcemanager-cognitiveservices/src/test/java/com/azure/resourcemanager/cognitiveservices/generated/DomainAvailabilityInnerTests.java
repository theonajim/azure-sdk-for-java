// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DomainAvailabilityInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DomainAvailabilityInnerTests {
    @Test
    public void testDeserialize() {
        DomainAvailabilityInner model =
            BinaryData
                .fromString(
                    "{\"isSubdomainAvailable\":true,\"reason\":\"yhz\",\"subdomainName\":\"uojgj\",\"type\":\"jueiotwmcdytd\",\"kind\":\"it\"}")
                .toObject(DomainAvailabilityInner.class);
        Assertions.assertEquals(true, model.isSubdomainAvailable());
        Assertions.assertEquals("yhz", model.reason());
        Assertions.assertEquals("uojgj", model.subdomainName());
        Assertions.assertEquals("jueiotwmcdytd", model.type());
        Assertions.assertEquals("it", model.kind());
    }

    @Test
    public void testSerialize() {
        DomainAvailabilityInner model =
            new DomainAvailabilityInner()
                .withIsSubdomainAvailable(true)
                .withReason("yhz")
                .withSubdomainName("uojgj")
                .withType("jueiotwmcdytd")
                .withKind("it");
        model = BinaryData.fromObject(model).toObject(DomainAvailabilityInner.class);
        Assertions.assertEquals(true, model.isSubdomainAvailable());
        Assertions.assertEquals("yhz", model.reason());
        Assertions.assertEquals("uojgj", model.subdomainName());
        Assertions.assertEquals("jueiotwmcdytd", model.type());
        Assertions.assertEquals("it", model.kind());
    }
}
