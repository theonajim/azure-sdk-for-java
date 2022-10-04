// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourcePropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"sxlzevgbmqj\",\"requiredMembers\":[\"c\",\"pmivkwlzu\"],\"requiredZoneNames\":[\"fwnfnb\"]}")
                .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("fwnfnb", model.requiredZoneNames().get(0));
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceProperties model =
            new PrivateLinkResourceProperties().withRequiredZoneNames(Arrays.asList("fwnfnb"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("fwnfnb", model.requiredZoneNames().get(0));
    }
}
