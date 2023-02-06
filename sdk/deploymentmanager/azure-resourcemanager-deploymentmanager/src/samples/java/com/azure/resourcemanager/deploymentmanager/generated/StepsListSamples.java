// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

/** Samples for Steps List. */
public final class StepsListSamples {
    /*
     * x-ms-original-file: specification/deploymentmanager/resource-manager/Microsoft.DeploymentManager/preview/2019-11-01-preview/examples/steps_list.json
     */
    /**
     * Sample code: List steps.
     *
     * @param manager Entry point to DeploymentManager.
     */
    public static void listSteps(com.azure.resourcemanager.deploymentmanager.DeploymentManager manager) {
        manager.steps().listWithResponse("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
