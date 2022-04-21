// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for BatchManagement class. */
public interface BatchManagement {
    /**
     * Gets The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the BatchAccountsClient object to access its operations.
     *
     * @return the BatchAccountsClient object.
     */
    BatchAccountsClient getBatchAccounts();

    /**
     * Gets the ApplicationPackagesClient object to access its operations.
     *
     * @return the ApplicationPackagesClient object.
     */
    ApplicationPackagesClient getApplicationPackages();

    /**
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    LocationsClient getLocations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the CertificatesClient object to access its operations.
     *
     * @return the CertificatesClient object.
     */
    CertificatesClient getCertificates();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PoolsClient object to access its operations.
     *
     * @return the PoolsClient object.
     */
    PoolsClient getPools();
}
