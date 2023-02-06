// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveProtectionContainerMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProviderContainerUnmappingInput;

/** Samples for ReplicationProtectionContainerMappings Delete. */
public final class ReplicationProtectionContainerMappingsDeleteSam {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectionContainerMappings_Delete.json
     */
    /**
     * Sample code: Remove protection container mapping.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void removeProtectionContainerMapping(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainerMappings()
            .delete(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "cloud1protectionprofile1",
                new RemoveProtectionContainerMappingInput()
                    .withProperties(
                        new RemoveProtectionContainerMappingInputProperties()
                            .withProviderSpecificInput(new ReplicationProviderContainerUnmappingInput())),
                com.azure.core.util.Context.NONE);
    }
}
