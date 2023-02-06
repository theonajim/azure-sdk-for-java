// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for SimPolicies ListByMobileNetwork. */
public final class SimPoliciesListByMobileNetworkSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2022-11-01/examples/SimPolicyListByMobileNetwork.json
     */
    /**
     * Sample code: List SIM policies in a mobile network.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listSIMPoliciesInAMobileNetwork(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager
            .simPolicies()
            .listByMobileNetwork("testResourceGroupName", "testMobileNetwork", com.azure.core.util.Context.NONE);
    }
}
