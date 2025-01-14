// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExportJobsOperationResults. */
public interface ExportJobsOperationResults {
    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API along with {@link Response}.
     */
    Response<ExportJobsResult> getWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context);

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    ExportJobsResult get(String resourceGroupName, String vaultName, String operationId);
}
