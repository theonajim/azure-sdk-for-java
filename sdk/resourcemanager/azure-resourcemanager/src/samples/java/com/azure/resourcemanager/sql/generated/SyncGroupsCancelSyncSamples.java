// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for SyncGroups CancelSync. */
public final class SyncGroupsCancelSyncSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SyncGroupCancelSync.json
     */
    /**
     * Sample code: Cancel a sync group synchronization.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cancelASyncGroupSynchronization(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getSyncGroups()
            .cancelSyncWithResponse(
                "syncgroupcrud-65440", "syncgroupcrud-8475", "syncgroupcrud-4328", "syncgroupcrud-3187", Context.NONE);
    }
}
