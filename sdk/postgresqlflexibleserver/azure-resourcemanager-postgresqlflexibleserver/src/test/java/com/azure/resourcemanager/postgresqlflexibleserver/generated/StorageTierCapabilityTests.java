// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StorageTierCapability;

public final class StorageTierCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTierCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"zw\",\"tierName\":\"g\",\"iops\":4520848990140400139,\"isBaseline\":false,\"status\":\"zga\"}")
                .toObject(StorageTierCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTierCapability model = new StorageTierCapability();
        model = BinaryData.fromObject(model).toObject(StorageTierCapability.class);
    }
}
