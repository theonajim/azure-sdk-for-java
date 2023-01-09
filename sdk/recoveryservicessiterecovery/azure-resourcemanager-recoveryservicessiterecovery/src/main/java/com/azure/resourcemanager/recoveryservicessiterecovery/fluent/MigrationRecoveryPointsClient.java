// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationRecoveryPointInner;

/** An instance of this class provides access to all the operations defined in MigrationRecoveryPointsClient. */
public interface MigrationRecoveryPointsClient {
    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MigrationRecoveryPointInner> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName);

    /**
     * Gets the recovery points for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the recovery points for a migration item as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MigrationRecoveryPointInner> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context);

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MigrationRecoveryPointInner> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName,
        Context context);

    /**
     * Gets a recovery point for a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrationRecoveryPointName The migration recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recovery point for a migration item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MigrationRecoveryPointInner get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName);
}
