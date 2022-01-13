// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for KubeEnvironments GetByResourceGroup. */
public final class KubeEnvironmentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/KubeEnvironments_Get.json
     */
    /**
     * Sample code: Get kube environments by name.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getKubeEnvironmentsByName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getKubeEnvironments()
            .getByResourceGroupWithResponse("examplerg", "jlaw-demo1", Context.NONE);
    }
}
