// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.SecretInner;
import com.azure.resourcemanager.devtestlabs.models.SecretFragment;

/** An instance of this class provides access to all the operations defined in SecretsClient. */
public interface SecretsClient {
    /**
     * List secrets in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> list(String resourceGroupName, String labName, String username);

    /**
     * List secrets in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param expand Specify the $expand query. Example: 'properties($select=value)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecretInner> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param expand Specify the $expand query. Example: 'properties($select=value)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secret along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context);

    /**
     * Get secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner get(String resourceGroupName, String labName, String username, String name);

    /**
     * Create or replace an existing secret. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a secret.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String username, String name, SecretInner secret);

    /**
     * Create or replace an existing secret. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a secret.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SecretInner>, SecretInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String username, String name, SecretInner secret, Context context);

    /**
     * Create or replace an existing secret. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner createOrUpdate(
        String resourceGroupName, String labName, String username, String name, SecretInner secret);

    /**
     * Create or replace an existing secret. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner createOrUpdate(
        String resourceGroupName, String labName, String username, String name, SecretInner secret, Context context);

    /**
     * Delete secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String labName, String username, String name, Context context);

    /**
     * Delete secret.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String username, String name);

    /**
     * Allows modifying tags of secrets. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a secret along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretInner> updateWithResponse(
        String resourceGroupName, String labName, String username, String name, SecretFragment secret, Context context);

    /**
     * Allows modifying tags of secrets. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the secret.
     * @param secret A secret.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretInner update(String resourceGroupName, String labName, String username, String name, SecretFragment secret);
}
