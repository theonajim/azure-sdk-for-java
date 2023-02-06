// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for MigrationRecoveryPoints Get. */
public final class MigrationRecoveryPointsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/MigrationRecoveryPoints_Get.json
     */
    /**
     * Sample code: Gets a recovery point for a migration item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsARecoveryPointForAMigrationItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .migrationRecoveryPoints()
            .getWithResponse(
                "migrationvault",
                "resourcegroup1",
                "vmwarefabric1",
                "vmwareContainer1",
                "virtualmachine1",
                "b22134ea-620c-474b-9fa5-3c1cb47708e3",
                com.azure.core.util.Context.NONE);
    }
}
