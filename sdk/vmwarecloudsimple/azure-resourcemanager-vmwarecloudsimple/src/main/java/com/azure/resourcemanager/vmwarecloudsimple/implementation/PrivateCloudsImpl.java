// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.PrivateCloudsClient;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.PrivateCloudInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.PrivateCloud;
import com.azure.resourcemanager.vmwarecloudsimple.models.PrivateClouds;

public final class PrivateCloudsImpl implements PrivateClouds {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateCloudsImpl.class);

    private final PrivateCloudsClient innerClient;

    private final com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager;

    public PrivateCloudsImpl(
        PrivateCloudsClient innerClient,
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateCloud> list(String regionId) {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().list(regionId);
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateCloud> list(String regionId, Context context) {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().list(regionId, context);
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public Response<PrivateCloud> getWithResponse(String pcName, String regionId, Context context) {
        Response<PrivateCloudInner> inner = this.serviceClient().getWithResponse(pcName, regionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateCloudImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateCloud get(String pcName, String regionId) {
        PrivateCloudInner inner = this.serviceClient().get(pcName, regionId);
        if (inner != null) {
            return new PrivateCloudImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateCloudsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager() {
        return this.serviceManager;
    }
}
