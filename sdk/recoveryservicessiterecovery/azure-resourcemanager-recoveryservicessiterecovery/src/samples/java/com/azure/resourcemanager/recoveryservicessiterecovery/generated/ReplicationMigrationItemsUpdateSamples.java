// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMigrationItemInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtUpdateMigrationItemInput;

/** Samples for ReplicationMigrationItems Update. */
public final class ReplicationMigrationItemsUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationMigrationItems_Update.json
     */
    /**
     * Sample code: Updates migration item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void updatesMigrationItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        MigrationItem resource =
            manager
                .replicationMigrationItems()
                .getWithResponse(
                    "migrationvault",
                    "resourcegroup1",
                    "vmwarefabric1",
                    "vmwareContainer1",
                    "virtualmachine1",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new UpdateMigrationItemInputProperties()
                    .withProviderSpecificDetails(new VMwareCbtUpdateMigrationItemInput()))
            .apply();
    }
}
