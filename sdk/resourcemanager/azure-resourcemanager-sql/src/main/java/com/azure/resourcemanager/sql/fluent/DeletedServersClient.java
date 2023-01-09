// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.DeletedServerInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedServersClient. */
public interface DeletedServersClient {
    /**
     * Gets a list of all deleted servers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all deleted servers in a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DeletedServerInner> listAsync();

    /**
     * Gets a list of all deleted servers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all deleted servers in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedServerInner> list();

    /**
     * Gets a list of all deleted servers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all deleted servers in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedServerInner> list(Context context);

    /**
     * Gets a list of deleted servers for a location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted servers for a location as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DeletedServerInner> listByLocationAsync(String locationName);

    /**
     * Gets a list of deleted servers for a location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted servers for a location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedServerInner> listByLocation(String locationName);

    /**
     * Gets a list of deleted servers for a location.
     *
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted servers for a location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedServerInner> listByLocation(String locationName, Context context);

    /**
     * Gets a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DeletedServerInner>> getWithResponseAsync(String locationName, String deletedServerName);

    /**
     * Gets a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DeletedServerInner> getAsync(String locationName, String deletedServerName);

    /**
     * Gets a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedServerInner> getWithResponse(String locationName, String deletedServerName, Context context);

    /**
     * Gets a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedServerInner get(String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> recoverWithResponseAsync(String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a deleted server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<DeletedServerInner>, DeletedServerInner> beginRecoverAsync(
        String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a deleted server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeletedServerInner>, DeletedServerInner> beginRecover(
        String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a deleted server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DeletedServerInner>, DeletedServerInner> beginRecover(
        String locationName, String deletedServerName, Context context);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DeletedServerInner> recoverAsync(String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedServerInner recover(String locationName, String deletedServerName);

    /**
     * Recovers a deleted server.
     *
     * @param locationName The name of the region where the resource is located.
     * @param deletedServerName The name of the deleted server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedServerInner recover(String locationName, String deletedServerName, Context context);
}
