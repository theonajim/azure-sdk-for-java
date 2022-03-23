// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for LocalUsersOperation Delete. */
public final class LocalUsersOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-08-01/examples/LocalUserDelete.json
     */
    /**
     * Sample code: DeleteLocalUser.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteLocalUser(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .deleteWithResponse("res6977", "sto2527", "user1", Context.NONE);
    }
}
