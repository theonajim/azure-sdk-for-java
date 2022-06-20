// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.datafactory.fluent.PrivateEndpointConnectionOperationsClient;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequestResource;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnectionOperationsClient.
 */
public final class PrivateEndpointConnectionOperationsClientImpl implements PrivateEndpointConnectionOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionOperationsService service;

    /** The service client containing this operation class. */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionOperationsClientImpl(DataFactoryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientPrivateEndpointConnectionOperations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    private interface PrivateEndpointConnectionOperationsService {
        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionResourceInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-Match") String ifMatch,
            @BodyParam("application/json") PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-None-Match") String ifNoneMatch,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @param ifMatch ETag of the private endpoint connection entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionResourceInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
        String ifMatch) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (privateEndpointWrapper == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter privateEndpointWrapper is required and cannot be null."));
        } else {
            privateEndpointWrapper.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            ifMatch,
                            privateEndpointWrapper,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @param ifMatch ETag of the private endpoint connection entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionResourceInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
        String ifMatch,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (privateEndpointWrapper == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter privateEndpointWrapper is required and cannot be null."));
        } else {
            privateEndpointWrapper.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                ifMatch,
                privateEndpointWrapper,
                accept,
                context);
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @param ifMatch ETag of the private endpoint connection entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionResourceInner> createOrUpdateAsync(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
        String ifMatch) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, factoryName, privateEndpointConnectionName, privateEndpointWrapper, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionResourceInner> createOrUpdateAsync(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper) {
        final String ifMatch = null;
        return createOrUpdateWithResponseAsync(
                resourceGroupName, factoryName, privateEndpointConnectionName, privateEndpointWrapper, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionResourceInner createOrUpdate(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper) {
        final String ifMatch = null;
        return createOrUpdateAsync(
                resourceGroupName, factoryName, privateEndpointConnectionName, privateEndpointWrapper, ifMatch)
            .block();
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @param ifMatch ETag of the private endpoint connection entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
        String ifMatch,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, factoryName, privateEndpointConnectionName, privateEndpointWrapper, ifMatch, context)
            .block();
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionResourceInner>> getWithResponseAsync(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            ifNoneMatch,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionResourceInner>> getWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        String ifNoneMatch,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                ifNoneMatch,
                accept,
                context);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionResourceInner> getAsync(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch) {
        return getWithResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionResourceInner> getAsync(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        final String ifNoneMatch = null;
        return getWithResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionResourceInner get(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        final String ifNoneMatch = null;
        return getAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch).block();
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionResourceInner> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        String ifNoneMatch,
        Context context) {
        return getWithResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch, context)
            .block();
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, factoryName, privateEndpointConnectionName).block();
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, context).block();
    }
}
