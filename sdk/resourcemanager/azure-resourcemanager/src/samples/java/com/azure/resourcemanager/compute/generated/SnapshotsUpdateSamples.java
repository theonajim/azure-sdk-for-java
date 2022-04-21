// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.SnapshotUpdate;
import java.util.HashMap;
import java.util.Map;

/** Samples for Snapshots Update. */
public final class SnapshotsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/UpdateASnapshot.json
     */
    /**
     * Sample code: Update a snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateASnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .update(
                "myResourceGroup",
                "mySnapshot",
                new SnapshotUpdate()
                    .withTags(mapOf("department", "Development", "project", "UpdateSnapshots"))
                    .withDiskSizeGB(20),
                Context.NONE);
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
