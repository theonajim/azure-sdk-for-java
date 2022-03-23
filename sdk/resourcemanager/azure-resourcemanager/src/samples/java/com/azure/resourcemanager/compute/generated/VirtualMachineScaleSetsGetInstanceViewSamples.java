// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSets GetInstanceView. */
public final class VirtualMachineScaleSetsGetInstanceViewSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSets_GetInstanceView_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_GetInstanceView_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsGetInstanceViewMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .getInstanceViewWithResponse("rgcompute", "aaaaaaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-11-01/examples/compute/VirtualMachineScaleSets_GetInstanceView_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_GetInstanceView_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsGetInstanceViewMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .getInstanceViewWithResponse("rgcompute", "aaaaaaaaaaaaaaa", Context.NONE);
    }
}
