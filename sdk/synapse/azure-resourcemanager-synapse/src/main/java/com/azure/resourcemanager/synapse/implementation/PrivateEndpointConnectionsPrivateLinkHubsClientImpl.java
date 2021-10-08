// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.PrivateEndpointConnectionsPrivateLinkHubsClient;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionForPrivateLinkHubInner;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PrivateEndpointConnectionsPrivateLinkHubsClient.
 */
public final class PrivateEndpointConnectionsPrivateLinkHubsClientImpl
    implements PrivateEndpointConnectionsPrivateLinkHubsClient {
    private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsPrivateLinkHubsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionsPrivateLinkHubsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsPrivateLinkHubsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionsPrivateLinkHubsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionsPrivateLinkHubsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientPrivateEndpointConnectionsPrivateLinkHubs to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface PrivateEndpointConnectionsPrivateLinkHubsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse"
                + "/privateLinkHubs/{privateLinkHubName}/privateEndpointConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("privateLinkHubName") String privateLinkHubName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse"
                + "/privateLinkHubs/{privateLinkHubName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionForPrivateLinkHubInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("privateLinkHubName") String privateLinkHubName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionForPrivateLinkHubResourceCollectionResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>> listSinglePageAsync(
        String resourceGroupName, String privateLinkHubName) {
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
        if (privateLinkHubName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateLinkHubName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            privateLinkHubName,
                            accept,
                            context))
            .<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>> listSinglePageAsync(
        String resourceGroupName, String privateLinkHubName, Context context) {
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
        if (privateLinkHubName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateLinkHubName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                privateLinkHubName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateEndpointConnectionForPrivateLinkHubInner> listAsync(
        String resourceGroupName, String privateLinkHubName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, privateLinkHubName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateEndpointConnectionForPrivateLinkHubInner> listAsync(
        String resourceGroupName, String privateLinkHubName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, privateLinkHubName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionForPrivateLinkHubInner> list(
        String resourceGroupName, String privateLinkHubName) {
        return new PagedIterable<>(listAsync(resourceGroupName, privateLinkHubName));
    }

    /**
     * Get all PrivateEndpointConnections in the PrivateLinkHub.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnections in the PrivateLinkHub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionForPrivateLinkHubInner> list(
        String resourceGroupName, String privateLinkHubName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, privateLinkHubName, context));
    }

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionForPrivateLinkHubInner>> getWithResponseAsync(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName) {
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
        if (privateLinkHubName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateLinkHubName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            privateLinkHubName,
                            privateEndpointConnectionName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionForPrivateLinkHubInner>> getWithResponseAsync(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName, Context context) {
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
        if (privateLinkHubName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter privateLinkHubName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                privateLinkHubName,
                privateEndpointConnectionName,
                accept,
                context);
    }

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionForPrivateLinkHubInner> getAsync(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, privateLinkHubName, privateEndpointConnectionName)
            .flatMap(
                (Response<PrivateEndpointConnectionForPrivateLinkHubInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionForPrivateLinkHubInner get(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, privateLinkHubName, privateEndpointConnectionName).block();
    }

    /**
     * Get all PrivateEndpointConnection in the PrivateLinkHub by name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateLinkHubName Name of the privateLinkHub.
     * @param privateEndpointConnectionName Name of the privateEndpointConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all PrivateEndpointConnection in the PrivateLinkHub by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionForPrivateLinkHubInner> getWithResponse(
        String resourceGroupName, String privateLinkHubName, String privateEndpointConnectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, privateLinkHubName, privateEndpointConnectionName, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>> listNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionForPrivateLinkHubInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
