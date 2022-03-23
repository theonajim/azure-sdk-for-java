// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkLinks Get. */
public final class VirtualNetworkLinksGetSamples {
    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2018-09-01/examples/VirtualNetworkLinkGet.json
     */
    /**
     * Sample code: GET Private DNS Zone Virtual Network Link.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gETPrivateDNSZoneVirtualNetworkLink(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getVirtualNetworkLinks()
            .getWithResponse("resourceGroup1", "privatezone1.com", "virtualNetworkLink1", Context.NONE);
    }
}
