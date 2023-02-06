// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/** An instance of this class provides access to all the operations defined in ConfigurationAssignmentsClient. */
public interface ConfigurationAssignmentsClient {
    /**
     * Create configuration assignment
     *
     * <p>Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationAssignmentInner> createOrUpdateParentWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context);

    /**
     * Create configuration assignment
     *
     * <p>Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationAssignmentInner createOrUpdateParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment);

    /**
     * Unregister configuration for resource
     *
     * <p>Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationAssignmentInner> deleteParentWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        Context context);

    /**
     * Unregister configuration for resource
     *
     * <p>Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationAssignmentInner deleteParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName);

    /**
     * Create configuration assignment
     *
     * <p>Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationAssignmentInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context);

    /**
     * Create configuration assignment
     *
     * <p>Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationAssignmentInner createOrUpdate(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment);

    /**
     * Unregister configuration for resource
     *
     * <p>Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationAssignmentInner> deleteWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        Context context);

    /**
     * Unregister configuration for resource
     *
     * <p>Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationAssignmentInner delete(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName);

    /**
     * List configurationAssignments for resource
     *
     * <p>List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationAssignmentInner> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName);

    /**
     * List configurationAssignments for resource
     *
     * <p>List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationAssignmentInner> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        Context context);

    /**
     * List configurationAssignments for resource
     *
     * <p>List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationAssignmentInner> list(
        String resourceGroupName, String providerName, String resourceType, String resourceName);

    /**
     * List configurationAssignments for resource
     *
     * <p>List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationAssignmentInner> list(
        String resourceGroupName, String providerName, String resourceType, String resourceName, Context context);
}
