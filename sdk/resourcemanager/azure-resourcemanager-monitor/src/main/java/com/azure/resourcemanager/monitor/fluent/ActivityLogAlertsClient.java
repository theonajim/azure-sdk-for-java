// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.ActivityLogAlertResourceInner;
import com.azure.resourcemanager.monitor.models.AlertRulePatchObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ActivityLogAlertsClient. */
public interface ActivityLogAlertsClient
    extends InnerSupportsGet<ActivityLogAlertResourceInner>,
        InnerSupportsListing<ActivityLogAlertResourceInner>,
        InnerSupportsDelete<Void> {
    /**
     * Create a new Activity Log Alert rule or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRule The Activity Log Alert rule to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ActivityLogAlertResourceInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlertRule);

    /**
     * Create a new Activity Log Alert rule or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRule The Activity Log Alert rule to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ActivityLogAlertResourceInner> createOrUpdateAsync(
        String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlertRule);

    /**
     * Create a new Activity Log Alert rule or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRule The Activity Log Alert rule to create or use for the update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner createOrUpdate(
        String resourceGroupName, String activityLogAlertName, ActivityLogAlertResourceInner activityLogAlertRule);

    /**
     * Create a new Activity Log Alert rule or update an existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRule The Activity Log Alert rule to create or use for the update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String activityLogAlertName,
        ActivityLogAlertResourceInner activityLogAlertRule,
        Context context);

    /**
     * Get an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ActivityLogAlertResourceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String activityLogAlertName);

    /**
     * Get an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ActivityLogAlertResourceInner> getByResourceGroupAsync(String resourceGroupName, String activityLogAlertName);

    /**
     * Get an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner getByResourceGroup(String resourceGroupName, String activityLogAlertName);

    /**
     * Get an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String activityLogAlertName, Context context);

    /**
     * Delete an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String activityLogAlertName);

    /**
     * Delete an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String activityLogAlertName);

    /**
     * Delete an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String activityLogAlertName);

    /**
     * Delete an Activity Log Alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String activityLogAlertName, Context context);

    /**
     * Updates 'tags' and 'enabled' fields in an existing Alert rule. This method is used to update the Alert rule tags,
     * and to enable or disable the Alert rule. To update other fields use CreateOrUpdate operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRulePatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ActivityLogAlertResourceInner>> updateWithResponseAsync(
        String resourceGroupName, String activityLogAlertName, AlertRulePatchObject activityLogAlertRulePatch);

    /**
     * Updates 'tags' and 'enabled' fields in an existing Alert rule. This method is used to update the Alert rule tags,
     * and to enable or disable the Alert rule. To update other fields use CreateOrUpdate operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRulePatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ActivityLogAlertResourceInner> updateAsync(
        String resourceGroupName, String activityLogAlertName, AlertRulePatchObject activityLogAlertRulePatch);

    /**
     * Updates 'tags' and 'enabled' fields in an existing Alert rule. This method is used to update the Alert rule tags,
     * and to enable or disable the Alert rule. To update other fields use CreateOrUpdate operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRulePatch Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActivityLogAlertResourceInner update(
        String resourceGroupName, String activityLogAlertName, AlertRulePatchObject activityLogAlertRulePatch);

    /**
     * Updates 'tags' and 'enabled' fields in an existing Alert rule. This method is used to update the Alert rule tags,
     * and to enable or disable the Alert rule. To update other fields use CreateOrUpdate operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param activityLogAlertName The name of the Activity Log Alert rule.
     * @param activityLogAlertRulePatch Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Activity Log Alert rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActivityLogAlertResourceInner> updateWithResponse(
        String resourceGroupName,
        String activityLogAlertName,
        AlertRulePatchObject activityLogAlertRulePatch,
        Context context);

    /**
     * Get a list of all Activity Log Alert rules in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ActivityLogAlertResourceInner> listAsync();

    /**
     * Get a list of all Activity Log Alert rules in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> list();

    /**
     * Get a list of all Activity Log Alert rules in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> list(Context context);

    /**
     * Get a list of all Activity Log Alert rules in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a resource group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ActivityLogAlertResourceInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get a list of all Activity Log Alert rules in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all Activity Log Alert rules in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Activity Log Alert rules in a resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActivityLogAlertResourceInner> listByResourceGroup(String resourceGroupName, Context context);
}
