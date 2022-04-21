// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.fluent.models.WaitStatisticInner;
import com.azure.resourcemanager.mysql.models.WaitStatisticsInput;

/** An instance of this class provides access to all the operations defined in WaitStatisticsClient. */
public interface WaitStatisticsClient {
    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Wait Statistic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WaitStatisticInner get(String resourceGroupName, String serverName, String waitStatisticsId);

    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Wait Statistic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WaitStatisticInner> getWithResponse(
        String resourceGroupName, String serverName, String waitStatisticsId, Context context);

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of wait statistics.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WaitStatisticInner> listByServer(
        String resourceGroupName, String serverName, WaitStatisticsInput parameters);

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of wait statistics.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WaitStatisticInner> listByServer(
        String resourceGroupName, String serverName, WaitStatisticsInput parameters, Context context);
}
