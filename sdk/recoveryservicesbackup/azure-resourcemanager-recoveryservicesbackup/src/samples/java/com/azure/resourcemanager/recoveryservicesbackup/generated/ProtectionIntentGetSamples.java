// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ProtectionIntent Get. */
public final class ProtectionIntentGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-07-01/examples/AzureWorkload/BackupProtectionIntent_Get.json
     */
    /**
     * Sample code: Get ProtectionIntent for an item.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectionIntentForAnItem(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionIntents()
            .getWithResponse("myVault", "myRG", "Azure", "249D9B07-D2EF-4202-AA64-65F35418564E", Context.NONE);
    }
}
