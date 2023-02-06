// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for AgentPools Get. */
public final class AgentPoolsGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-11-01/examples/AgentPoolsGet.json
     */
    /**
     * Sample code: Get Agent Pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAgentPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getAgentPools()
            .getWithResponse("rg1", "clustername1", "agentpool1", com.azure.core.util.Context.NONE);
    }
}
