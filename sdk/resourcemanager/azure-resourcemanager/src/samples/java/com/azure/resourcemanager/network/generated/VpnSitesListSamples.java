// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VpnSites List. */
public final class VpnSitesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VpnSiteList.json
     */
    /**
     * Sample code: VpnSiteList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVpnSites().list(Context.NONE);
    }
}
