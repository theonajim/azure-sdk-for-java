// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner;

/**
 * An instance of this class provides access to all the operations defined in ConfigurationProfileHciAssignmentsClient.
 */
public interface ConfigurationProfileHciAssignmentsClient {
    /**
     * Creates an association between a AzureStackHCI cluster and Automanage configuration profile.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment. Only default is
     *     supported.
     * @param parameters Parameters supplied to the create or update configuration profile assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration profile assignment is an association between a VM and automanage profile configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationProfileAssignmentInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String configurationProfileAssignmentName,
        ConfigurationProfileAssignmentInner parameters);

    /**
     * Creates an association between a AzureStackHCI cluster and Automanage configuration profile.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment. Only default is
     *     supported.
     * @param parameters Parameters supplied to the create or update configuration profile assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration profile assignment is an association between a VM and automanage profile configuration
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationProfileAssignmentInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String clusterName,
        String configurationProfileAssignmentName,
        ConfigurationProfileAssignmentInner parameters,
        Context context);

    /**
     * Get information about a configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationProfileAssignmentInner get(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName);

    /**
     * Get information about a configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName The configuration profile assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationProfileAssignmentInner> getWithResponse(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, Context context);

    /**
     * Delete a configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String configurationProfileAssignmentName);

    /**
     * Delete a configuration profile assignment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Arc machine.
     * @param configurationProfileAssignmentName Name of the configuration profile assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String clusterName, String configurationProfileAssignmentName, Context context);
}
