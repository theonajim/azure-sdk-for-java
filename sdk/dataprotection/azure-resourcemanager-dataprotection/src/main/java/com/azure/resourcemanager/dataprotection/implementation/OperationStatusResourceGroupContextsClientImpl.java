// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.dataprotection.fluent.OperationStatusResourceGroupContextsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * OperationStatusResourceGroupContextsClient.
 */
public final class OperationStatusResourceGroupContextsClientImpl
    implements OperationStatusResourceGroupContextsClient {
    /** The proxy service used to perform REST calls. */
    private final OperationStatusResourceGroupContextsService service;

    /** The service client containing this operation class. */
    private final DataProtectionClientImpl client;

    /**
     * Initializes an instance of OperationStatusResourceGroupContextsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationStatusResourceGroupContextsClientImpl(DataProtectionClientImpl client) {
        this.service =
            RestProxy
                .create(
                    OperationStatusResourceGroupContextsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataProtectionClientOperationStatusResourceGroupContexts to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataProtectionClient")
    public interface OperationStatusResourceGroupContextsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataProtection"
                + "/operationStatus/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationResourceInner>> getByResourceGroup(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the operation status for an operation over a ResourceGroup's context.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for an operation over a ResourceGroup's context along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationResourceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByResourceGroup(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the operation status for an operation over a ResourceGroup's context.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for an operation over a ResourceGroup's context along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationResourceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByResourceGroup(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceGroupName,
                this.client.getSubscriptionId(),
                operationId,
                accept,
                context);
    }

    /**
     * Gets the operation status for an operation over a ResourceGroup's context.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for an operation over a ResourceGroup's context on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResourceInner> getByResourceGroupAsync(String resourceGroupName, String operationId) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the operation status for an operation over a ResourceGroup's context.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for an operation over a ResourceGroup's context along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String operationId, Context context) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, operationId, context).block();
    }

    /**
     * Gets the operation status for an operation over a ResourceGroup's context.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for an operation over a ResourceGroup's context.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationResourceInner getByResourceGroup(String resourceGroupName, String operationId) {
        return getByResourceGroupWithResponse(resourceGroupName, operationId, Context.NONE).getValue();
    }
}
