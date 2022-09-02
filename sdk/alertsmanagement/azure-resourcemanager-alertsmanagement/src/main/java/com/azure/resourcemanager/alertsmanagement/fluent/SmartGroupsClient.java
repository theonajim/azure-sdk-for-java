// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.alertsmanagement.fluent.models.SmartGroupInner;
import com.azure.resourcemanager.alertsmanagement.fluent.models.SmartGroupModificationInner;
import com.azure.resourcemanager.alertsmanagement.models.AlertState;
import com.azure.resourcemanager.alertsmanagement.models.MonitorCondition;
import com.azure.resourcemanager.alertsmanagement.models.MonitorService;
import com.azure.resourcemanager.alertsmanagement.models.Severity;
import com.azure.resourcemanager.alertsmanagement.models.SmartGroupsChangeStateResponse;
import com.azure.resourcemanager.alertsmanagement.models.SmartGroupsGetByIdResponse;
import com.azure.resourcemanager.alertsmanagement.models.SmartGroupsSortByFields;
import com.azure.resourcemanager.alertsmanagement.models.SortOrder;
import com.azure.resourcemanager.alertsmanagement.models.TimeRange;

/** An instance of this class provides access to all the operations defined in SmartGroupsClient. */
public interface SmartGroupsClient {
    /**
     * Get all Smart Groups within a specified subscription
     *
     * <p>List all the Smart Groups within a specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list the alerts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SmartGroupInner> list();

    /**
     * Get all Smart Groups within a specified subscription
     *
     * <p>List all the Smart Groups within a specified subscription.
     *
     * @param targetResource Filter by target resource( which is full ARM ID) Default value is select all.
     * @param targetResourceGroup Filter by target resource group name. Default value is select all.
     * @param targetResourceType Filter by target resource type. Default value is select all.
     * @param monitorService Filter by monitor service which generates the alert instance. Default value is select all.
     * @param monitorCondition Filter by monitor condition which is either 'Fired' or 'Resolved'. Default value is to
     *     select all.
     * @param severity Filter by severity. Default value is select all.
     * @param smartGroupState Filter by state of the smart group. Default value is to select all.
     * @param timeRange Filter by time range by below listed values. Default value is 1 day.
     * @param pageCount Determines number of alerts returned per page in response. Permissible value is between 1 to
     *     250. When the "includeContent" filter is selected, maximum value allowed is 25. Default value is 25.
     * @param sortBy Sort the query results by input field. Default value is sort by 'lastModifiedDateTime'.
     * @param sortOrder Sort the query results order in either ascending or descending. Default value is 'desc' for time
     *     fields and 'asc' for others.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list the alerts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SmartGroupInner> list(
        String targetResource,
        String targetResourceGroup,
        String targetResourceType,
        MonitorService monitorService,
        MonitorCondition monitorCondition,
        Severity severity,
        AlertState smartGroupState,
        TimeRange timeRange,
        Long pageCount,
        SmartGroupsSortByFields sortBy,
        SortOrder sortOrder,
        Context context);

    /**
     * Get information related to a specific Smart Group.
     *
     * @param smartGroupId Smart group unique id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information related to a specific Smart Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SmartGroupInner getById(String smartGroupId);

    /**
     * Get information related to a specific Smart Group.
     *
     * @param smartGroupId Smart group unique id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information related to a specific Smart Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SmartGroupsGetByIdResponse getByIdWithResponse(String smartGroupId, Context context);

    /**
     * Change the state of a Smart Group.
     *
     * @param smartGroupId Smart group unique id.
     * @param newState New state of the alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return set of related alerts grouped together smartly by AMS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SmartGroupInner changeState(String smartGroupId, AlertState newState);

    /**
     * Change the state of a Smart Group.
     *
     * @param smartGroupId Smart group unique id.
     * @param newState New state of the alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return set of related alerts grouped together smartly by AMS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SmartGroupsChangeStateResponse changeStateWithResponse(String smartGroupId, AlertState newState, Context context);

    /**
     * Get the history a smart group, which captures any Smart Group state changes (New/Acknowledged/Closed) .
     *
     * @param smartGroupId Smart group unique id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the history a smart group, which captures any Smart Group state changes (New/Acknowledged/Closed).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SmartGroupModificationInner getHistory(String smartGroupId);

    /**
     * Get the history a smart group, which captures any Smart Group state changes (New/Acknowledged/Closed) .
     *
     * @param smartGroupId Smart group unique id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the history a smart group, which captures any Smart Group state changes (New/Acknowledged/Closed) along
     *     with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SmartGroupModificationInner> getHistoryWithResponse(String smartGroupId, Context context);
}
