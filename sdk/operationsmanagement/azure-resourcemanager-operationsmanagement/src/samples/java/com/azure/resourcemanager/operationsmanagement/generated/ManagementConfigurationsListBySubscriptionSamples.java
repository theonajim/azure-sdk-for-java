// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

/** Samples for ManagementConfigurations ListBySubscription. */
public final class ManagementConfigurationsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/operationsmanagement/resource-manager/Microsoft.OperationsManagement/preview/2015-11-01-preview/examples/ManagementConfigurationListForSubscription.json
     */
    /**
     * Sample code: SolutionList.
     *
     * @param manager Entry point to OperationsManagementManager.
     */
    public static void solutionList(
        com.azure.resourcemanager.operationsmanagement.OperationsManagementManager manager) {
        manager.managementConfigurations().listBySubscriptionWithResponse(com.azure.core.util.Context.NONE);
    }
}
