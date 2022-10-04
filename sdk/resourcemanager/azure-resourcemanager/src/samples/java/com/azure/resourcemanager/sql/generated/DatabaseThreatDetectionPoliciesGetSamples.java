// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyName;

/** Samples for DatabaseThreatDetectionPolicies Get. */
public final class DatabaseThreatDetectionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DatabaseSecurityAlertGet.json
     */
    /**
     * Sample code: Get database security alert policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDatabaseSecurityAlertPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseThreatDetectionPolicies()
            .getWithResponse(
                "securityalert-6852", "securityalert-2080", "testdb", SecurityAlertPolicyName.DEFAULT, Context.NONE);
    }
}
