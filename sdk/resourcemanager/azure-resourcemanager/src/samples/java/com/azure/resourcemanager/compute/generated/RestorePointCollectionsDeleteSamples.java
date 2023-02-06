// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for RestorePointCollections Delete. */
public final class RestorePointCollectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/restorePointExamples/RestorePointCollections_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: RestorePointCollections_Delete_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void restorePointCollectionsDeleteMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePointCollections()
            .delete("rgcompute", "aaaaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/restorePointExamples/RestorePointCollections_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: RestorePointCollections_Delete_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void restorePointCollectionsDeleteMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePointCollections()
            .delete("rgcompute", "aaaaaaaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }
}
