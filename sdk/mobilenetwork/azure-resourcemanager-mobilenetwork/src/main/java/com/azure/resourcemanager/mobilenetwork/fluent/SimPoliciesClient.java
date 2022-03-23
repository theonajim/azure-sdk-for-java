// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in SimPoliciesClient. */
public interface SimPoliciesClient {
    /**
     * Deletes the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String mobileNetworkName, String simPolicyName);

    /**
     * Deletes the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, Context context);

    /**
     * Deletes the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName, String simPolicyName);

    /**
     * Deletes the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mobileNetworkName, String simPolicyName, Context context);

    /**
     * Gets information about the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sim policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimPolicyInner get(String resourceGroupName, String mobileNetworkName, String simPolicyName);

    /**
     * Gets information about the specified sim policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sim policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SimPolicyInner> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, Context context);

    /**
     * Creates or updates a SimPolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to the create or update sim policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sim policy resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimPolicyInner>, SimPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, SimPolicyInner parameters);

    /**
     * Creates or updates a SimPolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to the create or update sim policy operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sim policy resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimPolicyInner>, SimPolicyInner> beginCreateOrUpdate(
        String resourceGroupName,
        String mobileNetworkName,
        String simPolicyName,
        SimPolicyInner parameters,
        Context context);

    /**
     * Creates or updates a SimPolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to the create or update sim policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sim policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimPolicyInner createOrUpdate(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, SimPolicyInner parameters);

    /**
     * Creates or updates a SimPolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to the create or update sim policy operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sim policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimPolicyInner createOrUpdate(
        String resourceGroupName,
        String mobileNetworkName,
        String simPolicyName,
        SimPolicyInner parameters,
        Context context);

    /**
     * Update sim policy tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to update Sim Policy tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sim policy resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimPolicyInner updateTags(
        String resourceGroupName, String mobileNetworkName, String simPolicyName, TagsObject parameters);

    /**
     * Update sim policy tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param simPolicyName The name of the SIM policy.
     * @param parameters Parameters supplied to update Sim Policy tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sim policy resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SimPolicyInner> updateTagsWithResponse(
        String resourceGroupName,
        String mobileNetworkName,
        String simPolicyName,
        TagsObject parameters,
        Context context);

    /**
     * Gets all the simPolicies in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the simPolicies in a mobile network as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimPolicyInner> listByMobileNetwork(String resourceGroupName, String mobileNetworkName);

    /**
     * Gets all the simPolicies in a mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the simPolicies in a mobile network as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimPolicyInner> listByMobileNetwork(
        String resourceGroupName, String mobileNetworkName, Context context);
}
