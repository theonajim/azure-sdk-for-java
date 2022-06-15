// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.workloads.fluent.models.PhpWorkloadResourceInner;
import com.azure.resourcemanager.workloads.models.PatchResourceRequestBody;

/** An instance of this class provides access to all the operations defined in PhpWorkloadsClient. */
public interface PhpWorkloadsClient {
    /**
     * Lists PHP workload resources for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PhpWorkloadResourceInner> list();

    /**
     * Lists PHP workload resources for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PhpWorkloadResourceInner> list(Context context);

    /**
     * Lists PHP workload resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PhpWorkloadResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists PHP workload resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PhpWorkloadResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PhpWorkloadResourceInner getByResourceGroup(String resourceGroupName, String phpWorkloadName);

    /**
     * Gets the PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PhpWorkloadResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String phpWorkloadName, Context context);

    /**
     * Create or updated PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param phpWorkloadResource Resource create or update request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of php workload resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PhpWorkloadResourceInner>, PhpWorkloadResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String phpWorkloadName, PhpWorkloadResourceInner phpWorkloadResource);

    /**
     * Create or updated PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param phpWorkloadResource Resource create or update request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of php workload resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PhpWorkloadResourceInner>, PhpWorkloadResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String phpWorkloadName,
        PhpWorkloadResourceInner phpWorkloadResource,
        Context context);

    /**
     * Create or updated PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param phpWorkloadResource Resource create or update request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PhpWorkloadResourceInner createOrUpdate(
        String resourceGroupName, String phpWorkloadName, PhpWorkloadResourceInner phpWorkloadResource);

    /**
     * Create or updated PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param phpWorkloadResource Resource create or update request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PhpWorkloadResourceInner createOrUpdate(
        String resourceGroupName,
        String phpWorkloadName,
        PhpWorkloadResourceInner phpWorkloadResource,
        Context context);

    /**
     * Update PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param resourcePatchRequestBody Workload resource update data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PhpWorkloadResourceInner update(
        String resourceGroupName, String phpWorkloadName, PatchResourceRequestBody resourcePatchRequestBody);

    /**
     * Update PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param resourcePatchRequestBody Workload resource update data.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PhpWorkloadResourceInner> updateWithResponse(
        String resourceGroupName,
        String phpWorkloadName,
        PatchResourceRequestBody resourcePatchRequestBody,
        Context context);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String phpWorkloadName, String deleteInfra);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String phpWorkloadName, String deleteInfra, Context context);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String phpWorkloadName, String deleteInfra);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String phpWorkloadName);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String phpWorkloadName, String deleteInfra, Context context);
}
