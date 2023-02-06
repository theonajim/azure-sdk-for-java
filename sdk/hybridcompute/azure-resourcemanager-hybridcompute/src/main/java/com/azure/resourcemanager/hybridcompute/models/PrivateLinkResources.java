// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByPrivateLinkScope(String resourceGroupName, String scopeName);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope as paginated
     *     response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByPrivateLinkScope(
        String resourceGroupName, String scopeName, Context context);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope along with {@link
     *     Response}.
     */
    Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String scopeName, String groupName, Context context);

    /**
     * Gets the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Azure Monitor PrivateLinkScope.
     */
    PrivateLinkResource get(String resourceGroupName, String scopeName, String groupName);
}
