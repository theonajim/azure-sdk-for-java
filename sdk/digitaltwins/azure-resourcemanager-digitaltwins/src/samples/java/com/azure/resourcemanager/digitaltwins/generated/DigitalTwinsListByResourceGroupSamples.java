// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.Context;

/** Samples for DigitalTwins ListByResourceGroup. */
public final class DigitalTwinsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2022-05-31/examples/DigitalTwinsListByResourceGroup_example.json
     */
    /**
     * Sample code: Get DigitalTwinsInstance resources by resource group.
     *
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void getDigitalTwinsInstanceResourcesByResourceGroup(
        com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager.digitalTwins().listByResourceGroup("resRg", Context.NONE);
    }
}
