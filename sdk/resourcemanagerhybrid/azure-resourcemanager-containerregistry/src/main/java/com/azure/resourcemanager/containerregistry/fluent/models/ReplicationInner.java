// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An object that represents a replication for a container registry. */
@Fluent
public final class ReplicationInner extends Resource {
    /*
     * The properties of the replication.
     */
    @JsonProperty(value = "properties")
    private ReplicationProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the replication.
     *
     * @return the innerProperties value.
     */
    private ReplicationProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ReplicationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ReplicationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the replication at the time the operation was
     * called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The status of the replication at the time the operation was called.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
