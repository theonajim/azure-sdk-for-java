// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationAccountMaps. */
public interface IntegrationAccountMaps {
    /**
     * Gets a list of integration account maps.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account maps as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationAccountMap> list(String resourceGroupName, String integrationAccountName);

    /**
     * Gets a list of integration account maps.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: MapType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account maps as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationAccountMap> list(
        String resourceGroupName, String integrationAccountName, Integer top, String filter, Context context);

    /**
     * Gets an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map along with {@link Response}.
     */
    Response<IntegrationAccountMap> getWithResponse(
        String resourceGroupName, String integrationAccountName, String mapName, Context context);

    /**
     * Gets an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map.
     */
    IntegrationAccountMap get(String resourceGroupName, String integrationAccountName, String mapName);

    /**
     * Deletes an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String mapName, Context context);

    /**
     * Deletes an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String integrationAccountName, String mapName);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param listContentCallbackUrl The callback url parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url along with {@link Response}.
     */
    Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String mapName,
        GetCallbackUrlParameters listContentCallbackUrl,
        Context context);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param listContentCallbackUrl The callback url parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    WorkflowTriggerCallbackUrl listContentCallbackUrl(
        String resourceGroupName,
        String integrationAccountName,
        String mapName,
        GetCallbackUrlParameters listContentCallbackUrl);

    /**
     * Gets an integration account map.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map along with {@link Response}.
     */
    IntegrationAccountMap getById(String id);

    /**
     * Gets an integration account map.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map along with {@link Response}.
     */
    Response<IntegrationAccountMap> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an integration account map.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an integration account map.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IntegrationAccountMap resource.
     *
     * @param name resource name.
     * @return the first stage of the new IntegrationAccountMap definition.
     */
    IntegrationAccountMap.DefinitionStages.Blank define(String name);
}
