// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.EncryptionProtectorName;

/** Samples for ManagedInstanceEncryptionProtectors Revalidate. */
public final class ManagedInstanceEncryptionProtectorsRevalidateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceEncryptionProtectorRevalidate.json
     */
    /**
     * Sample code: Revalidates the encryption protector.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void revalidatesTheEncryptionProtector(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceEncryptionProtectors()
            .revalidate("sqlcrudtest-7398", "sqlcrudtest-4645", EncryptionProtectorName.CURRENT, Context.NONE);
    }
}
