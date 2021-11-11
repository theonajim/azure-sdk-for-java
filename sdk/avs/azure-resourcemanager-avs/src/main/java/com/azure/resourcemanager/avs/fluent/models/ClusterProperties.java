// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.CommonClusterProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The properties of a cluster. */
@Fluent
public final class ClusterProperties extends CommonClusterProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterProperties.class);

    /** {@inheritDoc} */
    @Override
    public ClusterProperties withClusterSize(Integer clusterSize) {
        super.withClusterSize(clusterSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterProperties withHosts(List<String> hosts) {
        super.withHosts(hosts);
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
