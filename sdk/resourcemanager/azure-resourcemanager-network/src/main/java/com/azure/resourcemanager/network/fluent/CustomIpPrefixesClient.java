// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CustomIpPrefixesClient. */
public interface CustomIpPrefixesClient
    extends InnerSupportsGet<CustomIpPrefixInner>,
        InnerSupportsListing<CustomIpPrefixInner>,
        InnerSupportsDelete<Void> {
    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String customIpPrefixName, Context context);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String customIpPrefixName, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CustomIpPrefixInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String customIpPrefixName, String expand);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CustomIpPrefixInner> getByResourceGroupAsync(
        String resourceGroupName, String customIpPrefixName, String expand);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CustomIpPrefixInner> getByResourceGroupAsync(String resourceGroupName, String customIpPrefixName);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner getByResourceGroup(String resourceGroupName, String customIpPrefixName);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomIpPrefixInner> getByResourceGroupWithResponse(
        String resourceGroupName, String customIpPrefixName, String expand, Context context);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<CustomIpPrefixInner>, CustomIpPrefixInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomIpPrefixInner>, CustomIpPrefixInner> beginCreateOrUpdate(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomIpPrefixInner>, CustomIpPrefixInner> beginCreateOrUpdate(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters, Context context);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CustomIpPrefixInner> createOrUpdateAsync(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner createOrUpdate(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters);

    /**
     * Creates or updates a custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to the create or update custom IP prefix operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner createOrUpdate(
        String resourceGroupName, String customIpPrefixName, CustomIpPrefixInner parameters, Context context);

    /**
     * Updates custom IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CustomIpPrefixInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String customIpPrefixName, TagsObject parameters);

    /**
     * Updates custom IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CustomIpPrefixInner> updateTagsAsync(
        String resourceGroupName, String customIpPrefixName, TagsObject parameters);

    /**
     * Updates custom IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomIpPrefixInner updateTags(String resourceGroupName, String customIpPrefixName, TagsObject parameters);

    /**
     * Updates custom IP prefix tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param parameters Parameters supplied to update custom IP prefix tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return custom IP prefix resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomIpPrefixInner> updateTagsWithResponse(
        String resourceGroupName, String customIpPrefixName, TagsObject parameters, Context context);

    /**
     * Gets all the custom IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CustomIpPrefixInner> listAsync();

    /**
     * Gets all the custom IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> list();

    /**
     * Gets all the custom IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> list(Context context);

    /**
     * Gets all custom IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CustomIpPrefixInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all custom IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all custom IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomIpPrefixInner> listByResourceGroup(String resourceGroupName, Context context);
}
