// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/** Samples for VirtualMachines ListApplicableSchedules. */
public final class VirtualMachinesListApplicableSchedulesSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/VirtualMachines_ListApplicableSchedules.json
     */
    /**
     * Sample code: VirtualMachines_ListApplicableSchedules.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void virtualMachinesListApplicableSchedules(
        com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .virtualMachines()
            .listApplicableSchedulesWithResponse(
                "resourceGroupName", "{labName}", "{vmName}", com.azure.core.util.Context.NONE);
    }
}
