// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for DeletedWorkspaces ListByResourceGroup. */
public final class DeletedWorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/preview/2021-12-01-preview/examples/WorkspacesListByResourceGroup.json
     */
    /**
     * Sample code: WorkspacesGet.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void workspacesGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.deletedWorkspaces().listByResourceGroup("oiautorest6685", Context.NONE);
    }
}
