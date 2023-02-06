// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DistributedAvailabilityGroupInner;

/** Samples for DistributedAvailabilityGroups CreateOrUpdate. */
public final class DistributedAvailabilityGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DistributedAvailabilityGroupsCreate.json
     */
    /**
     * Sample code: Create a distributed availability group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADistributedAvailabilityGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDistributedAvailabilityGroups()
            .createOrUpdate(
                "testrg",
                "testcl",
                "dag",
                new DistributedAvailabilityGroupInner()
                    .withTargetDatabase("testdb")
                    .withSourceEndpoint("TCP://SERVER:7022")
                    .withPrimaryAvailabilityGroupName("BoxLocalAg1")
                    .withSecondaryAvailabilityGroupName("testcl"),
                Context.NONE);
    }
}
