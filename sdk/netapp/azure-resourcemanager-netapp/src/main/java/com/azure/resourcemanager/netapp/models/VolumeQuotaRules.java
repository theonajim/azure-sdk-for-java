// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VolumeQuotaRules. */
public interface VolumeQuotaRules {
    /**
     * Get all quota rules for a volume
     *
     * <p>List all quota rules associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volume Quota Rules as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VolumeQuotaRule> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Get all quota rules for a volume
     *
     * <p>List all quota rules associated with the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volume Quota Rules as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VolumeQuotaRule> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context);

    /**
     * Describe a quota rule
     *
     * <p>Get details of the specified quota rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param volumeQuotaRuleName The name of volume quota rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified quota rule.
     */
    VolumeQuotaRule get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String volumeQuotaRuleName);

    /**
     * Describe a quota rule
     *
     * <p>Get details of the specified quota rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param volumeQuotaRuleName The name of volume quota rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified quota rule along with {@link Response}.
     */
    Response<VolumeQuotaRule> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String volumeQuotaRuleName,
        Context context);

    /**
     * Delete a quota rule
     *
     * <p>Delete quota rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param volumeQuotaRuleName The name of volume quota rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String volumeQuotaRuleName);

    /**
     * Delete a quota rule
     *
     * <p>Delete quota rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param volumeQuotaRuleName The name of volume quota rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String volumeQuotaRuleName,
        Context context);

    /**
     * Describe a quota rule
     *
     * <p>Get details of the specified quota rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified quota rule along with {@link Response}.
     */
    VolumeQuotaRule getById(String id);

    /**
     * Describe a quota rule
     *
     * <p>Get details of the specified quota rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified quota rule along with {@link Response}.
     */
    Response<VolumeQuotaRule> getByIdWithResponse(String id, Context context);

    /**
     * Delete a quota rule
     *
     * <p>Delete quota rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a quota rule
     *
     * <p>Delete quota rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VolumeQuotaRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new VolumeQuotaRule definition.
     */
    VolumeQuotaRule.DefinitionStages.Blank define(String name);
}
