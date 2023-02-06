// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.workloads.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.workloads.fluent.models.ProviderInstanceInner;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ProviderInstancesClient.
 */
public interface ProviderInstancesClient {
    /**
     * Gets a list of provider instances in the specified SAP monitor.
     * 
     * Gets a list of provider instances in the specified SAP monitor. The operations returns various properties of each provider instances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of provider instances in the specified SAP monitor as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInstanceInner> list(String resourceGroupName, String monitorName);

    /**
     * Gets a list of provider instances in the specified SAP monitor.
     * 
     * Gets a list of provider instances in the specified SAP monitor. The operations returns various properties of each provider instances.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of provider instances in the specified SAP monitor as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProviderInstanceInner> list(String resourceGroupName, String monitorName, Context context);

    /**
     * Gets properties of a provider instance.
     * 
     * Gets properties of a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a provider instance for the specified subscription, resource group, SAP monitor name, and resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProviderInstanceInner> getWithResponse(String resourceGroupName, String monitorName, String providerInstanceName, Context context);

    /**
     * Gets properties of a provider instance.
     * 
     * Gets properties of a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInstanceInner get(String resourceGroupName, String monitorName, String providerInstanceName);

    /**
     * Creates a provider instance.
     * 
     * Creates a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param providerInstanceParameter Request body representing a provider instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a provider instance associated with SAP monitor.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProviderInstanceInner>, ProviderInstanceInner> beginCreate(String resourceGroupName, String monitorName, String providerInstanceName, ProviderInstanceInner providerInstanceParameter);

    /**
     * Creates a provider instance.
     * 
     * Creates a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param providerInstanceParameter Request body representing a provider instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a provider instance associated with SAP monitor.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProviderInstanceInner>, ProviderInstanceInner> beginCreate(String resourceGroupName, String monitorName, String providerInstanceName, ProviderInstanceInner providerInstanceParameter, Context context);

    /**
     * Creates a provider instance.
     * 
     * Creates a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param providerInstanceParameter Request body representing a provider instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a provider instance associated with SAP monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInstanceInner create(String resourceGroupName, String monitorName, String providerInstanceName, ProviderInstanceInner providerInstanceParameter);

    /**
     * Creates a provider instance.
     * 
     * Creates a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param providerInstanceParameter Request body representing a provider instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a provider instance associated with SAP monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProviderInstanceInner create(String resourceGroupName, String monitorName, String providerInstanceName, ProviderInstanceInner providerInstanceParameter, Context context);

    /**
     * Deletes a provider instance.
     * 
     * Deletes a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(String resourceGroupName, String monitorName, String providerInstanceName);

    /**
     * Deletes a provider instance.
     * 
     * Deletes a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<OperationStatusResultInner>, OperationStatusResultInner> beginDelete(String resourceGroupName, String monitorName, String providerInstanceName, Context context);

    /**
     * Deletes a provider instance.
     * 
     * Deletes a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(String resourceGroupName, String monitorName, String providerInstanceName);

    /**
     * Deletes a provider instance.
     * 
     * Deletes a provider instance for the specified subscription, resource group, SAP monitor name, and resource name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param providerInstanceName Name of the provider instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusResultInner delete(String resourceGroupName, String monitorName, String providerInstanceName, Context context);
}
