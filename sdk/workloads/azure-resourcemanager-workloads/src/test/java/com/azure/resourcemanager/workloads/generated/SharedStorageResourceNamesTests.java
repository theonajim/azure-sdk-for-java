// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SharedStorageResourceNames;
import org.junit.jupiter.api.Assertions;

public final class SharedStorageResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedStorageResourceNames model =
            BinaryData
                .fromString(
                    "{\"sharedStorageAccountName\":\"hhavgrvkffovjz\",\"sharedStorageAccountPrivateEndPointName\":\"jbibg\"}")
                .toObject(SharedStorageResourceNames.class);
        Assertions.assertEquals("hhavgrvkffovjz", model.sharedStorageAccountName());
        Assertions.assertEquals("jbibg", model.sharedStorageAccountPrivateEndPointName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedStorageResourceNames model =
            new SharedStorageResourceNames()
                .withSharedStorageAccountName("hhavgrvkffovjz")
                .withSharedStorageAccountPrivateEndPointName("jbibg");
        model = BinaryData.fromObject(model).toObject(SharedStorageResourceNames.class);
        Assertions.assertEquals("hhavgrvkffovjz", model.sharedStorageAccountName());
        Assertions.assertEquals("jbibg", model.sharedStorageAccountPrivateEndPointName());
    }
}
