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
import com.azure.resourcemanager.network.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkSecurityGroupsClient. */
public interface NetworkSecurityGroupsClient
    extends InnerSupportsGet<NetworkSecurityGroupInner>,
        InnerSupportsListing<NetworkSecurityGroupInner>,
        InnerSupportsDelete<Void> {
    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Deletes the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkSecurityGroupName, Context context);

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkSecurityGroupInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String networkSecurityGroupName, String expand);

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkSecurityGroupInner> getByResourceGroupAsync(
        String resourceGroupName, String networkSecurityGroupName, String expand);

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkSecurityGroupInner> getByResourceGroupAsync(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner getByResourceGroup(String resourceGroupName, String networkSecurityGroupName);

    /**
     * Gets the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network security group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkSecurityGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkSecurityGroupName, String expand, Context context);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        NetworkSecurityGroupInner parameters,
        Context context);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkSecurityGroupInner> createOrUpdateAsync(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner createOrUpdate(
        String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroupInner parameters);

    /**
     * Creates or updates a network security group in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create or update network security group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner createOrUpdate(
        String resourceGroupName,
        String networkSecurityGroupName,
        NetworkSecurityGroupInner parameters,
        Context context);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateTagsWithResponseAsync(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginUpdateTagsAsync(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginUpdateTags(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkSecurityGroupInner>, NetworkSecurityGroupInner> beginUpdateTags(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters, Context context);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkSecurityGroupInner> updateTagsAsync(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner updateTags(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters);

    /**
     * Updates a network security group tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to update network security group tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkSecurityGroup resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSecurityGroupInner updateTags(
        String resourceGroupName, String networkSecurityGroupName, TagsObject parameters, Context context);

    /**
     * Gets all network security groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkSecurityGroupInner> listAsync();

    /**
     * Gets all network security groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> list();

    /**
     * Gets all network security groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> list(Context context);

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkSecurityGroupInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkSecurityGroupInner> listByResourceGroup(String resourceGroupName, Context context);
}
