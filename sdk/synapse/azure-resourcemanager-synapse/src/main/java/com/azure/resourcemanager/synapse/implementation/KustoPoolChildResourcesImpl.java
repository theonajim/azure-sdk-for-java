// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.KustoPoolChildResourcesClient;
import com.azure.resourcemanager.synapse.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.synapse.models.CheckNameResult;
import com.azure.resourcemanager.synapse.models.DatabaseCheckNameRequest;
import com.azure.resourcemanager.synapse.models.KustoPoolChildResources;

public final class KustoPoolChildResourcesImpl implements KustoPoolChildResources {
    private static final ClientLogger LOGGER = new ClientLogger(KustoPoolChildResourcesImpl.class);

    private final KustoPoolChildResourcesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public KustoPoolChildResourcesImpl(
        KustoPoolChildResourcesClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameResult checkNameAvailability(
        String workspaceName, String kustoPoolName, String resourceGroupName, DatabaseCheckNameRequest resourceName) {
        CheckNameResultInner inner =
            this.serviceClient().checkNameAvailability(workspaceName, kustoPoolName, resourceGroupName, resourceName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String workspaceName,
        String kustoPoolName,
        String resourceGroupName,
        DatabaseCheckNameRequest resourceName,
        Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    workspaceName, kustoPoolName, resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private KustoPoolChildResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
