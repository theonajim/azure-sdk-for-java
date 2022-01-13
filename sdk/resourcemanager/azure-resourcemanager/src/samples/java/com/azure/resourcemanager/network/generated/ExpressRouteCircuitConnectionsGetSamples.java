// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitConnections Get. */
public final class ExpressRouteCircuitConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteCircuitConnectionGet.json
     */
    /**
     * Sample code: ExpressRouteCircuitConnectionGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteCircuitConnectionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuitConnections()
            .getWithResponse(
                "rg1", "ExpressRouteARMCircuitA", "AzurePrivatePeering", "circuitConnectionUSAUS", Context.NONE);
    }
}
