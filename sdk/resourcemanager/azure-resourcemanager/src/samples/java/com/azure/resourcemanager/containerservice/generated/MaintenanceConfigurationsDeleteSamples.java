// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for MaintenanceConfigurations Delete. */
public final class MaintenanceConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-11-01/examples/MaintenanceConfigurationsDelete.json
     */
    /**
     * Sample code: Delete Maintenance Configuration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteMaintenanceConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getMaintenanceConfigurations()
            .deleteWithResponse("rg1", "clustername1", "default", com.azure.core.util.Context.NONE);
    }
}
