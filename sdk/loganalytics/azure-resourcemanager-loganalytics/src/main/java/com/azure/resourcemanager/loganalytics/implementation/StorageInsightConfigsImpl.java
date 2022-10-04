// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.StorageInsightConfigsClient;
import com.azure.resourcemanager.loganalytics.fluent.models.StorageInsightInner;
import com.azure.resourcemanager.loganalytics.models.StorageInsight;
import com.azure.resourcemanager.loganalytics.models.StorageInsightConfigs;

public final class StorageInsightConfigsImpl implements StorageInsightConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(StorageInsightConfigsImpl.class);

    private final StorageInsightConfigsClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public StorageInsightConfigsImpl(
        StorageInsightConfigsClient innerClient,
        com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public StorageInsight get(String resourceGroupName, String workspaceName, String storageInsightName) {
        StorageInsightInner inner = this.serviceClient().get(resourceGroupName, workspaceName, storageInsightName);
        if (inner != null) {
            return new StorageInsightImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StorageInsight> getWithResponse(
        String resourceGroupName, String workspaceName, String storageInsightName, Context context) {
        Response<StorageInsightInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, storageInsightName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageInsightImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String storageInsightName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, storageInsightName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String storageInsightName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, storageInsightName, context);
    }

    public PagedIterable<StorageInsight> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<StorageInsightInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new StorageInsightImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageInsight> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<StorageInsightInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new StorageInsightImpl(inner1, this.manager()));
    }

    public StorageInsight getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String storageInsightName = Utils.getValueFromIdByName(id, "storageInsightConfigs");
        if (storageInsightName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageInsightConfigs'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, storageInsightName, Context.NONE).getValue();
    }

    public Response<StorageInsight> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String storageInsightName = Utils.getValueFromIdByName(id, "storageInsightConfigs");
        if (storageInsightName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageInsightConfigs'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, storageInsightName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String storageInsightName = Utils.getValueFromIdByName(id, "storageInsightConfigs");
        if (storageInsightName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageInsightConfigs'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, storageInsightName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String storageInsightName = Utils.getValueFromIdByName(id, "storageInsightConfigs");
        if (storageInsightName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageInsightConfigs'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, storageInsightName, context);
    }

    private StorageInsightConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public StorageInsightImpl define(String name) {
        return new StorageInsightImpl(name, this.manager());
    }
}
