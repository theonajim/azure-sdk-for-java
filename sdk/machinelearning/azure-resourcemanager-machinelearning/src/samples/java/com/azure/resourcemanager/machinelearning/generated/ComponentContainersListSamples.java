// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/** Samples for ComponentContainers List. */
public final class ComponentContainersListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/ComponentContainer/list.json
     */
    /**
     * Sample code: List Component Container.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listComponentContainer(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.componentContainers().list("test-rg", "my-aml-workspace", null, null, com.azure.core.util.Context.NONE);
    }
}
