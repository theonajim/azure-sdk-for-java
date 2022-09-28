// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourcePropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"rzpwvlqdqgbiq\",\"requiredMembers\":[\"hkaetcktvfc\",\"vf\",\"nkymuctqhjfbebrj\"],\"requiredZoneNames\":[\"rfuwutt\",\"xfvjrbirp\",\"xepcyvahfn\"]}")
                .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("rfuwutt", model.requiredZoneNames().get(0));
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceProperties model =
            new PrivateLinkResourceProperties()
                .withRequiredZoneNames(Arrays.asList("rfuwutt", "xfvjrbirp", "xepcyvahfn"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("rfuwutt", model.requiredZoneNames().get(0));
    }
}
