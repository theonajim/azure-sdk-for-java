// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses List. */
public final class PublicIpAddressesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/PublicIpAddressListAll.json
     */
    /**
     * Sample code: List all public IP addresses.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllPublicIPAddresses(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPublicIpAddresses().list(Context.NONE);
    }
}
