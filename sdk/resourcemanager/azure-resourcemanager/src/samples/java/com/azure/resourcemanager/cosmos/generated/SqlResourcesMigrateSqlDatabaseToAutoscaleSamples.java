// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources MigrateSqlDatabaseToAutoscale. */
public final class SqlResourcesMigrateSqlDatabaseToAutoscaleSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-08-15/examples/CosmosDBSqlDatabaseMigrateToAutoscale.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseMigrateToAutoscale.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlDatabaseMigrateToAutoscale(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .migrateSqlDatabaseToAutoscale("rg1", "ddb1", "databaseName", Context.NONE);
    }
}
