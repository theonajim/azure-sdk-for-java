// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.core.util.Context;

/** Samples for Registries ListByResourceGroup. */
public final class RegistriesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2021-09-01/examples/RegistryListByResourceGroup.json
     */
    /**
     * Sample code: RegistryListByResourceGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryListByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
