// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.OperationStatusesClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetTrackOperationStatusInner;
import com.azure.resourcemanager.mediaservices.models.AssetTrackOperationStatus;
import com.azure.resourcemanager.mediaservices.models.OperationStatuses;

public final class OperationStatusesImpl implements OperationStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(OperationStatusesImpl.class);

    private final OperationStatusesClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public OperationStatusesImpl(
        OperationStatusesClient innerClient,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AssetTrackOperationStatus get(
        String resourceGroupName, String accountName, String assetName, String trackName, String operationId) {
        AssetTrackOperationStatusInner inner =
            this.serviceClient().get(resourceGroupName, accountName, assetName, trackName, operationId);
        if (inner != null) {
            return new AssetTrackOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AssetTrackOperationStatus> getWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        String trackName,
        String operationId,
        Context context) {
        Response<AssetTrackOperationStatusInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, assetName, trackName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssetTrackOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
