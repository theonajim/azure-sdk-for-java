// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.agrifood.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkServiceConnectionStateTests {
    @Test
    public void testDeserialize() {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString("{\"status\":\"Pending\",\"description\":\"vsnb\",\"actionsRequired\":\"qabnmoc\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("vsnb", model.description());
        Assertions.assertEquals("qabnmoc", model.actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                .withDescription("vsnb")
                .withActionsRequired("qabnmoc");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("vsnb", model.description());
        Assertions.assertEquals("qabnmoc", model.actionsRequired());
    }
}
