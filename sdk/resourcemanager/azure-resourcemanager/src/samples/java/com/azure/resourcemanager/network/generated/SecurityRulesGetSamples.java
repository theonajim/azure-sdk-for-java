// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for SecurityRules Get. */
public final class SecurityRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkSecurityGroupRuleGet.json
     */
    /**
     * Sample code: Get network security rule in network security group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkSecurityRuleInNetworkSecurityGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSecurityRules()
            .getWithResponse("rg1", "testnsg", "rule1", Context.NONE);
    }
}
