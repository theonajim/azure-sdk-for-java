// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner;

/** An instance of this class provides access to all the operations defined in ReplicationLogicalNetworksClient. */
public interface ReplicationLogicalNetworksClient {
    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogicalNetworkInner> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName);

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogicalNetworkInner> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context);

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogicalNetworkInner> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName, Context context);

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogicalNetworkInner get(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName);
}
