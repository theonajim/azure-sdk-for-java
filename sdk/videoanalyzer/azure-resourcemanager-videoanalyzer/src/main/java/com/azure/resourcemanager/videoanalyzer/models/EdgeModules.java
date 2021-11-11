// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EdgeModules. */
public interface EdgeModules {
    /**
     * List all existing edge module resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EdgeModuleEntity items.
     */
    PagedIterable<EdgeModuleEntity> list(String resourceGroupName, String accountName);

    /**
     * List all existing edge module resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EdgeModuleEntity items.
     */
    PagedIterable<EdgeModuleEntity> list(String resourceGroupName, String accountName, Integer top, Context context);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    EdgeModuleEntity get(String resourceGroupName, String accountName, String edgeModuleName);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    Response<EdgeModuleEntity> getWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String edgeModuleName);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties.
     */
    EdgeModuleProvisioningToken listProvisioningToken(
        String resourceGroupName, String accountName, String edgeModuleName, ListProvisioningTokenInput parameters);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties.
     */
    Response<EdgeModuleProvisioningToken> listProvisioningTokenWithResponse(
        String resourceGroupName,
        String accountName,
        String edgeModuleName,
        ListProvisioningTokenInput parameters,
        Context context);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    EdgeModuleEntity getById(String id);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    Response<EdgeModuleEntity> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EdgeModuleEntity resource.
     *
     * @param name resource name.
     * @return the first stage of the new EdgeModuleEntity definition.
     */
    EdgeModuleEntity.DefinitionStages.Blank define(String name);
}
