// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel;

public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"DatabaseLevelOutput\",\"databaseName\":\"efajpj\",\"startedOn\":\"2021-01-18T23:13:43Z\",\"endedOn\":\"2021-02-18T14:41:58Z\",\"migrationState\":\"COMPLETE\",\"incomingChanges\":2209487539876489237,\"appliedChanges\":569920546864694854,\"cdcInsertCounter\":7478255577198949749,\"cdcDeleteCounter\":8746671564071573242,\"cdcUpdateCounter\":4439293869891812483,\"fullLoadCompletedTables\":832256681574398756,\"fullLoadLoadingTables\":6708049852163844600,\"fullLoadQueuedTables\":8328263583849174000,\"fullLoadErroredTables\":8580947848622831444,\"initializationCompleted\":true,\"latency\":2539867767446398216,\"id\":\"bjxbkzbzk\"}")
                .toObject(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel model =
            new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel();
        model =
            BinaryData
                .fromObject(model)
                .toObject(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseLevel.class);
    }
}
