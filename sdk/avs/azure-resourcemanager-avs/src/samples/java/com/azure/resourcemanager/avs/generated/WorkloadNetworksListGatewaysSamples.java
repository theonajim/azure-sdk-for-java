// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks ListGateways. */
public final class WorkloadNetworksListGatewaysSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/WorkloadNetworks_ListGateways.json
     */
    /**
     * Sample code: WorkloadNetworks_ListGateways.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksListGateways(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().listGateways("group1", "cloud1", Context.NONE);
    }
}
