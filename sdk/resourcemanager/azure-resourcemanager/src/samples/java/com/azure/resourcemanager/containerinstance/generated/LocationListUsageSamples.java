// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated;

import com.azure.core.util.Context;

/** Samples for Location ListUsage. */
public final class LocationListUsageSamples {
    /*
     * x-ms-original-file: specification/containerinstance/resource-manager/Microsoft.ContainerInstance/stable/2021-09-01/examples/ContainerGroupUsage.json
     */
    /**
     * Sample code: ContainerUsage.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void containerUsage(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerGroups().manager().serviceClient().getLocations().listUsage("westcentralus", Context.NONE);
    }
}
