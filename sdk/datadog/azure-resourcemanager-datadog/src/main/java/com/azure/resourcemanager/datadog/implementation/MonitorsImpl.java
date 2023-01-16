// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.fluent.MonitorsClient;
import com.azure.resourcemanager.datadog.fluent.models.DatadogApiKeyInner;
import com.azure.resourcemanager.datadog.fluent.models.DatadogHostInner;
import com.azure.resourcemanager.datadog.fluent.models.DatadogMonitorResourceInner;
import com.azure.resourcemanager.datadog.fluent.models.DatadogSetPasswordLinkInner;
import com.azure.resourcemanager.datadog.fluent.models.LinkedResourceInner;
import com.azure.resourcemanager.datadog.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.datadog.models.DatadogApiKey;
import com.azure.resourcemanager.datadog.models.DatadogHost;
import com.azure.resourcemanager.datadog.models.DatadogMonitorResource;
import com.azure.resourcemanager.datadog.models.DatadogSetPasswordLink;
import com.azure.resourcemanager.datadog.models.LinkedResource;
import com.azure.resourcemanager.datadog.models.MonitoredResource;
import com.azure.resourcemanager.datadog.models.Monitors;

public final class MonitorsImpl implements Monitors {
    private static final ClientLogger LOGGER = new ClientLogger(MonitorsImpl.class);

    private final MonitorsClient innerClient;

    private final com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager;

    public MonitorsImpl(
        MonitorsClient innerClient, com.azure.resourcemanager.datadog.MicrosoftDatadogManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatadogApiKey> listApiKeys(String resourceGroupName, String monitorName) {
        PagedIterable<DatadogApiKeyInner> inner = this.serviceClient().listApiKeys(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new DatadogApiKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogApiKey> listApiKeys(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<DatadogApiKeyInner> inner =
            this.serviceClient().listApiKeys(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new DatadogApiKeyImpl(inner1, this.manager()));
    }

    public Response<DatadogApiKey> getDefaultKeyWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<DatadogApiKeyInner> inner =
            this.serviceClient().getDefaultKeyWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatadogApiKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatadogApiKey getDefaultKey(String resourceGroupName, String monitorName) {
        DatadogApiKeyInner inner = this.serviceClient().getDefaultKey(resourceGroupName, monitorName);
        if (inner != null) {
            return new DatadogApiKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> setDefaultKeyWithResponse(
        String resourceGroupName, String monitorName, DatadogApiKeyInner body, Context context) {
        return this.serviceClient().setDefaultKeyWithResponse(resourceGroupName, monitorName, body, context);
    }

    public void setDefaultKey(String resourceGroupName, String monitorName) {
        this.serviceClient().setDefaultKey(resourceGroupName, monitorName);
    }

    public PagedIterable<DatadogHost> listHosts(String resourceGroupName, String monitorName) {
        PagedIterable<DatadogHostInner> inner = this.serviceClient().listHosts(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new DatadogHostImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogHost> listHosts(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<DatadogHostInner> inner = this.serviceClient().listHosts(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new DatadogHostImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkedResource> listLinkedResources(String resourceGroupName, String monitorName) {
        PagedIterable<LinkedResourceInner> inner =
            this.serviceClient().listLinkedResources(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new LinkedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkedResource> listLinkedResources(
        String resourceGroupName, String monitorName, Context context) {
        PagedIterable<LinkedResourceInner> inner =
            this.serviceClient().listLinkedResources(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new LinkedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoredResource> listMonitoredResources(String resourceGroupName, String monitorName) {
        PagedIterable<MonitoredResourceInner> inner =
            this.serviceClient().listMonitoredResources(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoredResource> listMonitoredResources(
        String resourceGroupName, String monitorName, Context context) {
        PagedIterable<MonitoredResourceInner> inner =
            this.serviceClient().listMonitoredResources(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogMonitorResource> list() {
        PagedIterable<DatadogMonitorResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DatadogMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogMonitorResource> list(Context context) {
        PagedIterable<DatadogMonitorResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DatadogMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogMonitorResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DatadogMonitorResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DatadogMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatadogMonitorResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DatadogMonitorResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DatadogMonitorResourceImpl(inner1, this.manager()));
    }

    public Response<DatadogMonitorResource> getByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<DatadogMonitorResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatadogMonitorResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatadogMonitorResource getByResourceGroup(String resourceGroupName, String monitorName) {
        DatadogMonitorResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, monitorName);
        if (inner != null) {
            return new DatadogMonitorResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String monitorName) {
        this.serviceClient().delete(resourceGroupName, monitorName);
    }

    public void delete(String resourceGroupName, String monitorName, Context context) {
        this.serviceClient().delete(resourceGroupName, monitorName, context);
    }

    public Response<DatadogSetPasswordLink> refreshSetPasswordLinkWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<DatadogSetPasswordLinkInner> inner =
            this.serviceClient().refreshSetPasswordLinkWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatadogSetPasswordLinkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatadogSetPasswordLink refreshSetPasswordLink(String resourceGroupName, String monitorName) {
        DatadogSetPasswordLinkInner inner = this.serviceClient().refreshSetPasswordLink(resourceGroupName, monitorName);
        if (inner != null) {
            return new DatadogSetPasswordLinkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DatadogMonitorResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitorName, Context.NONE).getValue();
    }

    public Response<DatadogMonitorResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        this.delete(resourceGroupName, monitorName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        this.delete(resourceGroupName, monitorName, context);
    }

    private MonitorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }

    public DatadogMonitorResourceImpl define(String name) {
        return new DatadogMonitorResourceImpl(name, this.manager());
    }
}
