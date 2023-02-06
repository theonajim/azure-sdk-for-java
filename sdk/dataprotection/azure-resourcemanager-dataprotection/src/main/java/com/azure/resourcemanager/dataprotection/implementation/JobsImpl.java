// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.JobsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupJobResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupJobResource;
import com.azure.resourcemanager.dataprotection.models.Jobs;

public final class JobsImpl implements Jobs {
    private static final ClientLogger LOGGER = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public JobsImpl(
        JobsClient innerClient, com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName) {
        PagedIterable<AzureBackupJobResourceInner> inner = this.serviceClient().list(resourceGroupName, vaultName);
        return Utils.mapPage(inner, inner1 -> new AzureBackupJobResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName, Context context) {
        PagedIterable<AzureBackupJobResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName, context);
        return Utils.mapPage(inner, inner1 -> new AzureBackupJobResourceImpl(inner1, this.manager()));
    }

    public Response<AzureBackupJobResource> getWithResponse(
        String resourceGroupName, String vaultName, String jobId, Context context) {
        Response<AzureBackupJobResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vaultName, jobId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureBackupJobResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureBackupJobResource get(String resourceGroupName, String vaultName, String jobId) {
        AzureBackupJobResourceInner inner = this.serviceClient().get(resourceGroupName, vaultName, jobId);
        if (inner != null) {
            return new AzureBackupJobResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
