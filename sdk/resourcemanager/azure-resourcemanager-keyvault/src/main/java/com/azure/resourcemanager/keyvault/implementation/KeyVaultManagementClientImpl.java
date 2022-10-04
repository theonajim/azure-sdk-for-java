// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.keyvault.fluent.KeyVaultManagementClient;
import com.azure.resourcemanager.keyvault.fluent.ManagedHsmsClient;
import com.azure.resourcemanager.keyvault.fluent.MhsmPrivateEndpointConnectionsClient;
import com.azure.resourcemanager.keyvault.fluent.MhsmPrivateLinkResourcesClient;
import com.azure.resourcemanager.keyvault.fluent.OperationsClient;
import com.azure.resourcemanager.keyvault.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.keyvault.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.keyvault.fluent.VaultsClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the KeyVaultManagementClientImpl type. */
@ServiceClient(builder = KeyVaultManagementClientBuilder.class)
public final class KeyVaultManagementClientImpl extends AzureServiceClient implements KeyVaultManagementClient {
    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The VaultsClient object to access its operations. */
    private final VaultsClient vaults;

    /**
     * Gets the VaultsClient object to access its operations.
     *
     * @return the VaultsClient object.
     */
    public VaultsClient getVaults() {
        return this.vaults;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The ManagedHsmsClient object to access its operations. */
    private final ManagedHsmsClient managedHsms;

    /**
     * Gets the ManagedHsmsClient object to access its operations.
     *
     * @return the ManagedHsmsClient object.
     */
    public ManagedHsmsClient getManagedHsms() {
        return this.managedHsms;
    }

    /** The MhsmPrivateEndpointConnectionsClient object to access its operations. */
    private final MhsmPrivateEndpointConnectionsClient mhsmPrivateEndpointConnections;

    /**
     * Gets the MhsmPrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the MhsmPrivateEndpointConnectionsClient object.
     */
    public MhsmPrivateEndpointConnectionsClient getMhsmPrivateEndpointConnections() {
        return this.mhsmPrivateEndpointConnections;
    }

    /** The MhsmPrivateLinkResourcesClient object to access its operations. */
    private final MhsmPrivateLinkResourcesClient mhsmPrivateLinkResources;

    /**
     * Gets the MhsmPrivateLinkResourcesClient object to access its operations.
     *
     * @return the MhsmPrivateLinkResourcesClient object.
     */
    public MhsmPrivateLinkResourcesClient getMhsmPrivateLinkResources() {
        return this.mhsmPrivateLinkResources;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * Initializes an instance of KeyVaultManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    KeyVaultManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2021-10-01";
        this.vaults = new VaultsClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.managedHsms = new ManagedHsmsClientImpl(this);
        this.mhsmPrivateEndpointConnections = new MhsmPrivateEndpointConnectionsClientImpl(this);
        this.mhsmPrivateLinkResources = new MhsmPrivateLinkResourcesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
    }
}
