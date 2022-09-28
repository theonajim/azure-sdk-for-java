// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMs RetrieveBootDiagnosticsData. */
public final class VirtualMachineScaleSetVMsRetrieveBootDiagnosticsDataSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-08-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_RetrieveBootDiagnosticsData.json
     */
    /**
     * Sample code: RetrieveBootDiagnosticsData of a virtual machine.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveBootDiagnosticsDataOfAVirtualMachine(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSetVMs()
            .retrieveBootDiagnosticsDataWithResponse("ResourceGroup", "myvmScaleSet", "0", 60, Context.NONE);
    }
}
