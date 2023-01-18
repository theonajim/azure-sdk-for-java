// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.RegisteredPrefixesClient;
import com.azure.resourcemanager.peering.fluent.models.PeeringRegisteredPrefixInner;
import com.azure.resourcemanager.peering.models.PeeringRegisteredPrefix;
import com.azure.resourcemanager.peering.models.RegisteredPrefixes;

public final class RegisteredPrefixesImpl implements RegisteredPrefixes {
    private static final ClientLogger LOGGER = new ClientLogger(RegisteredPrefixesImpl.class);

    private final RegisteredPrefixesClient innerClient;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public RegisteredPrefixesImpl(
        RegisteredPrefixesClient innerClient, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PeeringRegisteredPrefix> getWithResponse(
        String resourceGroupName, String peeringName, String registeredPrefixName, Context context) {
        Response<PeeringRegisteredPrefixInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, peeringName, registeredPrefixName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PeeringRegisteredPrefixImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PeeringRegisteredPrefix get(String resourceGroupName, String peeringName, String registeredPrefixName) {
        PeeringRegisteredPrefixInner inner =
            this.serviceClient().get(resourceGroupName, peeringName, registeredPrefixName);
        if (inner != null) {
            return new PeeringRegisteredPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String peeringName, String registeredPrefixName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, peeringName, registeredPrefixName, context);
    }

    public void delete(String resourceGroupName, String peeringName, String registeredPrefixName) {
        this.serviceClient().delete(resourceGroupName, peeringName, registeredPrefixName);
    }

    public PagedIterable<PeeringRegisteredPrefix> listByPeering(String resourceGroupName, String peeringName) {
        PagedIterable<PeeringRegisteredPrefixInner> inner =
            this.serviceClient().listByPeering(resourceGroupName, peeringName);
        return Utils.mapPage(inner, inner1 -> new PeeringRegisteredPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PeeringRegisteredPrefix> listByPeering(
        String resourceGroupName, String peeringName, Context context) {
        PagedIterable<PeeringRegisteredPrefixInner> inner =
            this.serviceClient().listByPeering(resourceGroupName, peeringName, context);
        return Utils.mapPage(inner, inner1 -> new PeeringRegisteredPrefixImpl(inner1, this.manager()));
    }

    public PeeringRegisteredPrefix getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredPrefixName = Utils.getValueFromIdByName(id, "registeredPrefixes");
        if (registeredPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registeredPrefixes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, peeringName, registeredPrefixName, Context.NONE).getValue();
    }

    public Response<PeeringRegisteredPrefix> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredPrefixName = Utils.getValueFromIdByName(id, "registeredPrefixes");
        if (registeredPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registeredPrefixes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, peeringName, registeredPrefixName, context);
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
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredPrefixName = Utils.getValueFromIdByName(id, "registeredPrefixes");
        if (registeredPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registeredPrefixes'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, peeringName, registeredPrefixName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        String registeredPrefixName = Utils.getValueFromIdByName(id, "registeredPrefixes");
        if (registeredPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registeredPrefixes'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, peeringName, registeredPrefixName, context);
    }

    private RegisteredPrefixesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    public PeeringRegisteredPrefixImpl define(String name) {
        return new PeeringRegisteredPrefixImpl(name, this.manager());
    }
}
