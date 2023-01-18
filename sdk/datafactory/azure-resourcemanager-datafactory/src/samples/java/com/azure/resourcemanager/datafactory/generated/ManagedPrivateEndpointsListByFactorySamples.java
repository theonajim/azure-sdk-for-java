// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/** Samples for ManagedPrivateEndpoints ListByFactory. */
public final class ManagedPrivateEndpointsListByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/ManagedPrivateEndpoints_ListByFactory.json
     */
    /**
     * Sample code: ManagedPrivateEndpoints_ListByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void managedPrivateEndpointsListByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .managedPrivateEndpoints()
            .listByFactory(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleManagedVirtualNetworkName",
                com.azure.core.util.Context.NONE);
    }
}
