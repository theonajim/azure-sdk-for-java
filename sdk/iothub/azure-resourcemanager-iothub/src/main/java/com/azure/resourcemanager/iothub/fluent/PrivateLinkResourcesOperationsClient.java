// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.fluent.models.PrivateLinkResourcesInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesOperationsClient. */
public interface PrivateLinkResourcesOperationsClient {
    /**
     * List private link resources for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for an IotHub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourcesInner list(String resourceGroupName, String resourceName);

    /**
     * List private link resources for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for an IotHub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourcesInner> listWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified private link resource for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param groupId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given IotHub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupIdInformationInner get(String resourceGroupName, String resourceName, String groupId);

    /**
     * Get the specified private link resource for the given IotHub.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param groupId The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given IotHub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GroupIdInformationInner> getWithResponse(
        String resourceGroupName, String resourceName, String groupId, Context context);
}
