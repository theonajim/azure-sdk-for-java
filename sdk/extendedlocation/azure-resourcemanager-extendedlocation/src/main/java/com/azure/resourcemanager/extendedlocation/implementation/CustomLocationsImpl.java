// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.extendedlocation.fluent.CustomLocationsClient;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationFindTargetResourceGroupResultInner;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationInner;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationOperationInner;
import com.azure.resourcemanager.extendedlocation.fluent.models.EnabledResourceTypeInner;
import com.azure.resourcemanager.extendedlocation.models.CustomLocation;
import com.azure.resourcemanager.extendedlocation.models.CustomLocationFindTargetResourceGroupProperties;
import com.azure.resourcemanager.extendedlocation.models.CustomLocationFindTargetResourceGroupResult;
import com.azure.resourcemanager.extendedlocation.models.CustomLocationOperation;
import com.azure.resourcemanager.extendedlocation.models.CustomLocations;
import com.azure.resourcemanager.extendedlocation.models.EnabledResourceType;

public final class CustomLocationsImpl implements CustomLocations {
    private static final ClientLogger LOGGER = new ClientLogger(CustomLocationsImpl.class);

    private final CustomLocationsClient innerClient;

    private final com.azure.resourcemanager.extendedlocation.CustomLocationsManager serviceManager;

    public CustomLocationsImpl(
        CustomLocationsClient innerClient,
        com.azure.resourcemanager.extendedlocation.CustomLocationsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CustomLocationOperation> listOperations() {
        PagedIterable<CustomLocationOperationInner> inner = this.serviceClient().listOperations();
        return Utils.mapPage(inner, inner1 -> new CustomLocationOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomLocationOperation> listOperations(Context context) {
        PagedIterable<CustomLocationOperationInner> inner = this.serviceClient().listOperations(context);
        return Utils.mapPage(inner, inner1 -> new CustomLocationOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomLocation> list() {
        PagedIterable<CustomLocationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CustomLocationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomLocation> list(Context context) {
        PagedIterable<CustomLocationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CustomLocationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomLocation> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CustomLocationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CustomLocationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomLocation> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CustomLocationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CustomLocationImpl(inner1, this.manager()));
    }

    public CustomLocation getByResourceGroup(String resourceGroupName, String resourceName) {
        CustomLocationInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new CustomLocationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomLocation> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<CustomLocationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomLocationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, context);
    }

    public PagedIterable<EnabledResourceType> listEnabledResourceTypes(String resourceGroupName, String resourceName) {
        PagedIterable<EnabledResourceTypeInner> inner =
            this.serviceClient().listEnabledResourceTypes(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new EnabledResourceTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<EnabledResourceType> listEnabledResourceTypes(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<EnabledResourceTypeInner> inner =
            this.serviceClient().listEnabledResourceTypes(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new EnabledResourceTypeImpl(inner1, this.manager()));
    }

    public CustomLocationFindTargetResourceGroupResult findTargetResourceGroup(
        String resourceGroupName, String resourceName, CustomLocationFindTargetResourceGroupProperties parameters) {
        CustomLocationFindTargetResourceGroupResultInner inner =
            this.serviceClient().findTargetResourceGroup(resourceGroupName, resourceName, parameters);
        if (inner != null) {
            return new CustomLocationFindTargetResourceGroupResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomLocationFindTargetResourceGroupResult> findTargetResourceGroupWithResponse(
        String resourceGroupName,
        String resourceName,
        CustomLocationFindTargetResourceGroupProperties parameters,
        Context context) {
        Response<CustomLocationFindTargetResourceGroupResultInner> inner =
            this
                .serviceClient()
                .findTargetResourceGroupWithResponse(resourceGroupName, resourceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomLocationFindTargetResourceGroupResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CustomLocation getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "customLocations");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customLocations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<CustomLocation> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "customLocations");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customLocations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "customLocations");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customLocations'.", id)));
        }
        this.delete(resourceGroupName, resourceName, Context.NONE);
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
        String resourceName = Utils.getValueFromIdByName(id, "customLocations");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'customLocations'.", id)));
        }
        this.delete(resourceGroupName, resourceName, context);
    }

    private CustomLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.extendedlocation.CustomLocationsManager manager() {
        return this.serviceManager;
    }

    public CustomLocationImpl define(String name) {
        return new CustomLocationImpl(name, this.manager());
    }
}
