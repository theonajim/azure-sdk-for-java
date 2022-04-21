// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.CheckVirtualNetworkSubnetUsagesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.VirtualNetworkSubnetUsageResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.CheckVirtualNetworkSubnetUsages;
import com.azure.resourcemanager.mysqlflexibleserver.models.VirtualNetworkSubnetUsageParameter;
import com.azure.resourcemanager.mysqlflexibleserver.models.VirtualNetworkSubnetUsageResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CheckVirtualNetworkSubnetUsagesImpl implements CheckVirtualNetworkSubnetUsages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckVirtualNetworkSubnetUsagesImpl.class);

    private final CheckVirtualNetworkSubnetUsagesClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public CheckVirtualNetworkSubnetUsagesImpl(
        CheckVirtualNetworkSubnetUsagesClient innerClient,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualNetworkSubnetUsageResult execute(String locationName, VirtualNetworkSubnetUsageParameter parameters) {
        VirtualNetworkSubnetUsageResultInner inner = this.serviceClient().execute(locationName, parameters);
        if (inner != null) {
            return new VirtualNetworkSubnetUsageResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkSubnetUsageResult> executeWithResponse(
        String locationName, VirtualNetworkSubnetUsageParameter parameters, Context context) {
        Response<VirtualNetworkSubnetUsageResultInner> inner =
            this.serviceClient().executeWithResponse(locationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkSubnetUsageResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CheckVirtualNetworkSubnetUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
