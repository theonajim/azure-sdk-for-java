// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.SharesClient;
import com.azure.resourcemanager.databoxedge.fluent.models.ShareInner;
import com.azure.resourcemanager.databoxedge.models.Share;
import com.azure.resourcemanager.databoxedge.models.Shares;

public final class SharesImpl implements Shares {
    private static final ClientLogger LOGGER = new ClientLogger(SharesImpl.class);

    private final SharesClient innerClient;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public SharesImpl(
        SharesClient innerClient, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Share> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<ShareInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ShareImpl(inner1, this.manager()));
    }

    public PagedIterable<Share> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<ShareInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ShareImpl(inner1, this.manager()));
    }

    public Response<Share> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<ShareInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ShareImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Share get(String deviceName, String name, String resourceGroupName) {
        ShareInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new ShareImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().delete(deviceName, name, resourceGroupName);
    }

    public void delete(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, name, resourceGroupName, context);
    }

    public void refresh(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().refresh(deviceName, name, resourceGroupName);
    }

    public void refresh(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().refresh(deviceName, name, resourceGroupName, context);
    }

    public Share getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "shares");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
    }

    public Response<Share> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "shares");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "shares");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "shares");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'shares'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, context);
    }

    private SharesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public ShareImpl define(String name) {
        return new ShareImpl(name, this.manager());
    }
}
