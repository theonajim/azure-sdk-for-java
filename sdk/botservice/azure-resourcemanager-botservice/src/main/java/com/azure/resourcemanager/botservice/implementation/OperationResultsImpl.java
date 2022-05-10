// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.botservice.fluent.OperationResultsClient;
import com.azure.resourcemanager.botservice.fluent.models.OperationResultsDescriptionInner;
import com.azure.resourcemanager.botservice.models.OperationResults;
import com.azure.resourcemanager.botservice.models.OperationResultsDescription;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

    public OperationResultsImpl(
        OperationResultsClient innerClient, com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationResultsDescription get(String operationResultId) {
        OperationResultsDescriptionInner inner = this.serviceClient().get(operationResultId);
        if (inner != null) {
            return new OperationResultsDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationResultsDescription get(String operationResultId, Context context) {
        OperationResultsDescriptionInner inner = this.serviceClient().get(operationResultId, context);
        if (inner != null) {
            return new OperationResultsDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }
}
