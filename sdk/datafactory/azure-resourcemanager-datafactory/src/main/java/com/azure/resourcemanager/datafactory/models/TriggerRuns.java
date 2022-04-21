// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TriggerRuns. */
public interface TriggerRuns {
    /**
     * Rerun single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rerun(String resourceGroupName, String factoryName, String triggerName, String runId);

    /**
     * Rerun single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> rerunWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String runId, Context context);

    /**
     * Cancel a single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String factoryName, String triggerName, String runId);

    /**
     * Cancel a single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> cancelWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String runId, Context context);

    /**
     * Query trigger runs.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    TriggerRunsQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters);

    /**
     * Query trigger runs.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of trigger runs.
     */
    Response<TriggerRunsQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters, Context context);
}
