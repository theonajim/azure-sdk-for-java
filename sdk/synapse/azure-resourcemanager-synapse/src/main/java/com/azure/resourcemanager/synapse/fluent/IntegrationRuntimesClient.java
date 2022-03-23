// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStatusResponseInner;
import com.azure.resourcemanager.synapse.models.UpdateIntegrationRuntimeRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IntegrationRuntimesClient. */
public interface IntegrationRuntimesClient {
    /**
     * Update an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param updateIntegrationRuntimeRequest The parameters for updating an integration runtime.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeResourceInner update(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        UpdateIntegrationRuntimeRequest updateIntegrationRuntimeRequest);

    /**
     * Update an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param updateIntegrationRuntimeRequest The parameters for updating an integration runtime.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeResourceInner> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        UpdateIntegrationRuntimeRequest updateIntegrationRuntimeRequest,
        Context context);

    /**
     * Get an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeResourceInner get(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Get an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param ifNoneMatch ETag of the integration runtime entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeResourceInner> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String ifNoneMatch,
        Context context);

    /**
     * Create an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntime Integration runtime resource definition.
     * @param ifMatch ETag of the integration runtime entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IntegrationRuntimeResourceInner>, IntegrationRuntimeResourceInner> beginCreate(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeResourceInner integrationRuntime,
        String ifMatch);

    /**
     * Create an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntime Integration runtime resource definition.
     * @param ifMatch ETag of the integration runtime entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IntegrationRuntimeResourceInner>, IntegrationRuntimeResourceInner> beginCreate(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeResourceInner integrationRuntime,
        String ifMatch,
        Context context);

    /**
     * Create an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntime Integration runtime resource definition.
     * @param ifMatch ETag of the integration runtime entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeResourceInner create(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeResourceInner integrationRuntime,
        String ifMatch);

    /**
     * Create an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntime Integration runtime resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeResourceInner create(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeResourceInner integrationRuntime);

    /**
     * Create an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param integrationRuntime Integration runtime resource definition.
     * @param ifMatch ETag of the integration runtime entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeResourceInner create(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeResourceInner integrationRuntime,
        String ifMatch,
        Context context);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Delete an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Upgrade an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void upgrade(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Upgrade an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> upgradeWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * List all integration runtimes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationRuntimeResourceInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * List all integration runtimes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationRuntimeResourceInner> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IntegrationRuntimeStatusResponseInner>, IntegrationRuntimeStatusResponseInner> beginStart(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IntegrationRuntimeStatusResponseInner>, IntegrationRuntimeStatusResponseInner> beginStart(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeStatusResponseInner start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Start an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeStatusResponseInner start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Stop an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner>
        listOutboundNetworkDependenciesEndpointsWithResponse(
            String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Enable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName);

    /**
     * Disable interactive query in integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);
}
