// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.RetargetScheduleProperties;

/** Samples for GlobalSchedules Retarget. */
public final class GlobalSchedulesRetargetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/GlobalSchedules_Retarget.json
     */
    /**
     * Sample code: GlobalSchedules_Retarget.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void globalSchedulesRetarget(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .globalSchedules()
            .retarget(
                "resourceGroupName",
                "{scheduleName}",
                new RetargetScheduleProperties()
                    .withCurrentResourceId(
                        "/subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{targetLab}")
                    .withTargetResourceId(
                        "/subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{currentLab}"),
                com.azure.core.util.Context.NONE);
    }
}
