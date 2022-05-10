// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ValidateOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationResults;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationsResponse;

public final class ValidateOperationResultsImpl implements ValidateOperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(ValidateOperationResultsImpl.class);

    private final ValidateOperationResultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ValidateOperationResultsImpl(
        ValidateOperationResultsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ValidateOperationsResponse get(String vaultName, String resourceGroupName, String operationId) {
        ValidateOperationsResponseInner inner = this.serviceClient().get(vaultName, resourceGroupName, operationId);
        if (inner != null) {
            return new ValidateOperationsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateOperationsResponse> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context) {
        Response<ValidateOperationsResponseInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateOperationsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ValidateOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
