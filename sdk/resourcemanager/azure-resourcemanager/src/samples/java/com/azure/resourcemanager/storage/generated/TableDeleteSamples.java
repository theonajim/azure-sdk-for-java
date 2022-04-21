// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for Table Delete. */
public final class TableDeleteSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-04-01/examples/TableOperationDelete.json
     */
    /**
     * Sample code: TableOperationDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tableOperationDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getTables()
            .deleteWithResponse("res3376", "sto328", "table6185", Context.NONE);
    }
}
