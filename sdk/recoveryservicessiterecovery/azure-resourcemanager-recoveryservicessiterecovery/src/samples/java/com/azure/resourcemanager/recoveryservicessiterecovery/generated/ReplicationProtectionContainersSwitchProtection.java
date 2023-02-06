// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2ASwitchProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInputProperties;

/** Samples for ReplicationProtectionContainers SwitchProtection. */
public final class ReplicationProtectionContainersSwitchProtection {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectionContainers_SwitchProtection.json
     */
    /**
     * Sample code: Switches protection from one container to another or one replication provider to another.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void switchesProtectionFromOneContainerToAnotherOrOneReplicationProviderToAnother(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainers()
            .switchProtection(
                "priyanponeboxvault",
                "priyanprg",
                "CentralUSCanSite",
                "CentralUSCancloud",
                new SwitchProtectionInput()
                    .withProperties(
                        new SwitchProtectionInputProperties()
                            .withProviderSpecificDetails(new A2ASwitchProtectionInput())),
                com.azure.core.util.Context.NONE);
    }
}
