// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.videoanalyzer.fluent.models.PrivateEndpointConnectionListResultInner;
import com.azure.resourcemanager.videoanalyzer.models.PrivateEndpointConnection;
import com.azure.resourcemanager.videoanalyzer.models.PrivateEndpointConnectionListResult;
import com.azure.resourcemanager.videoanalyzer.models.PrivateEndpointConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateEndpointConnectionListResult list(String resourceGroupName, String accountName) {
        PrivateEndpointConnectionListResultInner inner = this.serviceClient().list(resourceGroupName, accountName);
        if (inner != null) {
            return new PrivateEndpointConnectionListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnectionListResult> listWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<PrivateEndpointConnectionListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection get(String resourceGroupName, String accountName, String name) {
        PrivateEndpointConnectionInner inner = this.serviceClient().get(resourceGroupName, accountName, name);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String accountName, String name, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String name) {
        this.serviceClient().delete(resourceGroupName, accountName, name);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, name, context);
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, name, Context.NONE).getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, name, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, name, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
