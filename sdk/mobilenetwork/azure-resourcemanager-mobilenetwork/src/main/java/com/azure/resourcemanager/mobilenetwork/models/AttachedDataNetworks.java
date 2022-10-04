// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AttachedDataNetworks. */
public interface AttachedDataNetworks {
    /**
     * Deletes the specified attached data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param attachedDataNetworkName The name of the attached data network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName);

    /**
     * Deletes the specified attached data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param attachedDataNetworkName The name of the attached data network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName,
        Context context);

    /**
     * Gets information about the specified attached data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param attachedDataNetworkName The name of the attached data network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified attached data network.
     */
    AttachedDataNetwork get(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName);

    /**
     * Gets information about the specified attached data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param attachedDataNetworkName The name of the attached data network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified attached data network along with {@link Response}.
     */
    Response<AttachedDataNetwork> getWithResponse(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName,
        Context context);

    /**
     * Gets all the attached data networks associated with a packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the attached data networks associated with a packet core data plane as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<AttachedDataNetwork> listByPacketCoreDataPlane(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName);

    /**
     * Gets all the attached data networks associated with a packet core data plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param packetCoreDataPlaneName The name of the packet core data plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the attached data networks associated with a packet core data plane as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<AttachedDataNetwork> listByPacketCoreDataPlane(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context);

    /**
     * Gets information about the specified attached data network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified attached data network along with {@link Response}.
     */
    AttachedDataNetwork getById(String id);

    /**
     * Gets information about the specified attached data network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified attached data network along with {@link Response}.
     */
    Response<AttachedDataNetwork> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified attached data network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified attached data network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AttachedDataNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new AttachedDataNetwork definition.
     */
    AttachedDataNetwork.DefinitionStages.Blank define(String name);
}
