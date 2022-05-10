// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.NamespacesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.appcontainers.models.Namespaces;

public final class NamespacesImpl implements Namespaces {
    private static final ClientLogger LOGGER = new ClientLogger(NamespacesImpl.class);

    private final NamespacesClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public NamespacesImpl(
        NamespacesClient innerClient, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResponse checkNameAvailability(
        String resourceGroupName,
        String managedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        CheckNameAvailabilityResponseInner inner =
            this
                .serviceClient()
                .checkNameAvailability(resourceGroupName, managedEnvironmentName, checkNameAvailabilityRequest);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String managedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest,
        Context context) {
        Response<CheckNameAvailabilityResponseInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    resourceGroupName, managedEnvironmentName, checkNameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
