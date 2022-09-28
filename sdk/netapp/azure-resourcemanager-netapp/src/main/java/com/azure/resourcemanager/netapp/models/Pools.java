// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Pools. */
public interface Pools {
    /**
     * Describe all Capacity Pools
     *
     * <p>List all capacity pools in the NetApp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of capacity pool resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CapacityPool> list(String resourceGroupName, String accountName);

    /**
     * Describe all Capacity Pools
     *
     * <p>List all capacity pools in the NetApp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of capacity pool resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CapacityPool> list(String resourceGroupName, String accountName, Context context);

    /**
     * Describe a Capacity Pool
     *
     * <p>Get details of the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool.
     */
    CapacityPool get(String resourceGroupName, String accountName, String poolName);

    /**
     * Describe a Capacity Pool
     *
     * <p>Get details of the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool along with {@link Response}.
     */
    Response<CapacityPool> getWithResponse(
        String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Delete a capacity pool
     *
     * <p>Delete the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String poolName);

    /**
     * Delete a capacity pool
     *
     * <p>Delete the specified capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Describe a Capacity Pool
     *
     * <p>Get details of the specified capacity pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool along with {@link Response}.
     */
    CapacityPool getById(String id);

    /**
     * Describe a Capacity Pool
     *
     * <p>Get details of the specified capacity pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool along with {@link Response}.
     */
    Response<CapacityPool> getByIdWithResponse(String id, Context context);

    /**
     * Delete a capacity pool
     *
     * <p>Delete the specified capacity pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a capacity pool
     *
     * <p>Delete the specified capacity pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CapacityPool resource.
     *
     * @param name resource name.
     * @return the first stage of the new CapacityPool definition.
     */
    CapacityPool.DefinitionStages.Blank define(String name);
}
