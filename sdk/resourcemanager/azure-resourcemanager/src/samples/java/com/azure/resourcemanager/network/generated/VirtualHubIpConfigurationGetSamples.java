// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubIpConfiguration Get. */
public final class VirtualHubIpConfigurationGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualHubIpConfigurationGet.json
     */
    /**
     * Sample code: VirtualHubVirtualHubRouteTableV2Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubVirtualHubRouteTableV2Get(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubIpConfigurations()
            .getWithResponse("rg1", "hub1", "ipconfig1", Context.NONE);
    }
}
