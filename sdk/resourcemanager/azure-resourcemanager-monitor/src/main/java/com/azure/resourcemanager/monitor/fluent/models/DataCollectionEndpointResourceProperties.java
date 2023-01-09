// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.models.DataCollectionEndpoint;
import com.azure.resourcemanager.monitor.models.DataCollectionEndpointConfigurationAccess;
import com.azure.resourcemanager.monitor.models.DataCollectionEndpointLogsIngestion;
import com.azure.resourcemanager.monitor.models.DataCollectionEndpointNetworkAcls;

/** Resource properties. */
@Fluent
public final class DataCollectionEndpointResourceProperties extends DataCollectionEndpoint {
    /** Creates an instance of DataCollectionEndpointResourceProperties class. */
    public DataCollectionEndpointResourceProperties() {
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceProperties withImmutableId(String immutableId) {
        super.withImmutableId(immutableId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceProperties withConfigurationAccess(
        DataCollectionEndpointConfigurationAccess configurationAccess) {
        super.withConfigurationAccess(configurationAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceProperties withLogsIngestion(
        DataCollectionEndpointLogsIngestion logsIngestion) {
        super.withLogsIngestion(logsIngestion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceProperties withNetworkAcls(DataCollectionEndpointNetworkAcls networkAcls) {
        super.withNetworkAcls(networkAcls);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
