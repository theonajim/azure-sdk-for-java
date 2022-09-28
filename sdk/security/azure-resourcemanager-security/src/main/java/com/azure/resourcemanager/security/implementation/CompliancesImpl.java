// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.CompliancesClient;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;
import com.azure.resourcemanager.security.models.Compliance;
import com.azure.resourcemanager.security.models.Compliances;

public final class CompliancesImpl implements Compliances {
    private static final ClientLogger LOGGER = new ClientLogger(CompliancesImpl.class);

    private final CompliancesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public CompliancesImpl(
        CompliancesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Compliance> list(String scope) {
        PagedIterable<ComplianceInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new ComplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<Compliance> list(String scope, Context context) {
        PagedIterable<ComplianceInner> inner = this.serviceClient().list(scope, context);
        return Utils.mapPage(inner, inner1 -> new ComplianceImpl(inner1, this.manager()));
    }

    public Compliance get(String scope, String complianceName) {
        ComplianceInner inner = this.serviceClient().get(scope, complianceName);
        if (inner != null) {
            return new ComplianceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Compliance> getWithResponse(String scope, String complianceName, Context context) {
        Response<ComplianceInner> inner = this.serviceClient().getWithResponse(scope, complianceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ComplianceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CompliancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
