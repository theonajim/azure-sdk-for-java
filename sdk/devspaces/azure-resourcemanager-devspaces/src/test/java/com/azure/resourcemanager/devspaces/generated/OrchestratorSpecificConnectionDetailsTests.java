// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devspaces.models.OrchestratorSpecificConnectionDetails;

public final class OrchestratorSpecificConnectionDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrchestratorSpecificConnectionDetails model =
            BinaryData
                .fromString("{\"instanceType\":\"OrchestratorSpecificConnectionDetails\"}")
                .toObject(OrchestratorSpecificConnectionDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrchestratorSpecificConnectionDetails model = new OrchestratorSpecificConnectionDetails();
        model = BinaryData.fromObject(model).toObject(OrchestratorSpecificConnectionDetails.class);
    }
}
