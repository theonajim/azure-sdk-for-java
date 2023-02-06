// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Clusters. */
public interface Clusters {
    /**
     * Gets a Service Fabric cluster resource.
     *
     * <p>Get a Service Fabric cluster resource created or in the process of being created in the specified resource
     * group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group along with {@link Response}.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a Service Fabric cluster resource.
     *
     * <p>Get a Service Fabric cluster resource created or in the process of being created in the specified resource
     * group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes a Service Fabric cluster resource.
     *
     * <p>Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Deletes a Service Fabric cluster resource.
     *
     * <p>Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets the list of Service Fabric cluster resources created in the specified resource group.
     *
     * <p>Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group
     *     along with {@link Response}.
     */
    Response<ClusterListResult> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Gets the list of Service Fabric cluster resources created in the specified resource group.
     *
     * <p>Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group.
     */
    ClusterListResult listByResourceGroup(String resourceGroupName);

    /**
     * Gets the list of Service Fabric cluster resources created in the specified subscription.
     *
     * <p>Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription along
     *     with {@link Response}.
     */
    Response<ClusterListResult> listWithResponse(Context context);

    /**
     * Gets the list of Service Fabric cluster resources created in the specified subscription.
     *
     * <p>Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription.
     */
    ClusterListResult list();

    /**
     * Operation to get the minimum and maximum upgradable version from the current cluster version, or the required
     * path to get to the an specific target version.
     *
     * <p>If a target is not provided, it will get the minimum and maximum versions available from the current cluster
     * version. If a target is given, it will provide the required path to get from the current cluster version to the
     * target version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param versionsDescription The upgrade path description with target version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of intermediate cluster code versions for an upgrade or downgrade along with {@link Response}.
     */
    Response<UpgradableVersionPathResult> listUpgradableVersionsWithResponse(
        String resourceGroupName,
        String clusterName,
        UpgradableVersionsDescription versionsDescription,
        Context context);

    /**
     * Operation to get the minimum and maximum upgradable version from the current cluster version, or the required
     * path to get to the an specific target version.
     *
     * <p>If a target is not provided, it will get the minimum and maximum versions available from the current cluster
     * version. If a target is given, it will provide the required path to get from the current cluster version to the
     * target version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of intermediate cluster code versions for an upgrade or downgrade.
     */
    UpgradableVersionPathResult listUpgradableVersions(String resourceGroupName, String clusterName);

    /**
     * Gets a Service Fabric cluster resource.
     *
     * <p>Get a Service Fabric cluster resource created or in the process of being created in the specified resource
     * group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group along with {@link Response}.
     */
    Cluster getById(String id);

    /**
     * Gets a Service Fabric cluster resource.
     *
     * <p>Get a Service Fabric cluster resource created or in the process of being created in the specified resource
     * group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group along with {@link Response}.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Service Fabric cluster resource.
     *
     * <p>Delete a Service Fabric cluster resource with the specified name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Service Fabric cluster resource.
     *
     * <p>Delete a Service Fabric cluster resource with the specified name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}
