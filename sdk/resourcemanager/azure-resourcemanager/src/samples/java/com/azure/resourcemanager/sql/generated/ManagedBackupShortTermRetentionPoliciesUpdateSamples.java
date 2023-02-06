// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName;

/** Samples for ManagedBackupShortTermRetentionPolicies Update. */
public final class ManagedBackupShortTermRetentionPoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/UpdateManagedShortTermRetentionPolicy.json
     */
    /**
     * Sample code: Update the short term retention policy for the database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTheShortTermRetentionPolicyForTheDatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedBackupShortTermRetentionPolicies()
            .update(
                "resourceGroup",
                "testsvr",
                "testdb",
                ManagedShortTermRetentionPolicyName.DEFAULT,
                new ManagedBackupShortTermRetentionPolicyInner().withRetentionDays(14),
                Context.NONE);
    }
}
