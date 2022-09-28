// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.PrivateEndpointProperty;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointPropertyTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointProperty model =
            BinaryData.fromString("{\"id\":\"ckwhds\"}").toObject(PrivateEndpointProperty.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpointProperty model = new PrivateEndpointProperty();
        model = BinaryData.fromObject(model).toObject(PrivateEndpointProperty.class);
    }
}
