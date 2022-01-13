// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for Features List. */
public final class FeaturesListSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Features/stable/2021-07-01/examples/listProviderFeatures.json
     */
    /**
     * Sample code: List provider Features.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listProviderFeatures(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .featureClient()
            .getFeatures()
            .list("Resource Provider Namespace", Context.NONE);
    }
}
