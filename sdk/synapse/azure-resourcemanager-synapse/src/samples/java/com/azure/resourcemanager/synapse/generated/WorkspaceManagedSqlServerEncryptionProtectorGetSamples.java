// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.EncryptionProtectorName;

/** Samples for WorkspaceManagedSqlServerEncryptionProtector Get. */
public final class WorkspaceManagedSqlServerEncryptionProtectorGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/GetWorkspaceManagedSqlServerEncryptionProtector.json
     */
    /**
     * Sample code: Get workspace managed sql Server's encryption protector.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getWorkspaceManagedSqlServerSEncryptionProtector(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .workspaceManagedSqlServerEncryptionProtectors()
            .getWithResponse("wsg-7398", "testWorkspace", EncryptionProtectorName.CURRENT, Context.NONE);
    }
}
