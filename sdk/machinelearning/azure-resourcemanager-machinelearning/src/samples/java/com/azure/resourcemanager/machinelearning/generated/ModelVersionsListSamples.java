// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/** Samples for ModelVersions List. */
public final class ModelVersionsListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/ModelVersion/list.json
     */
    /**
     * Sample code: List Model Version.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listModelVersion(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .modelVersions()
            .list(
                "test-rg",
                "my-aml-workspace",
                "string",
                null,
                "string",
                1,
                "string",
                "string",
                1,
                "string",
                "string",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
