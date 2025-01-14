// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.ReplicationRole;
import com.azure.resourcemanager.synapse.models.ReplicationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a Sql pool replication link. */
@Fluent
public final class ReplicationLinkInner extends ProxyResource {
    /*
     * Location of the workspace that contains this firewall rule.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The properties representing the resource.
     */
    @JsonProperty(value = "properties")
    private ReplicationLinkProperties innerProperties;

    /**
     * Get the location property: Location of the workspace that contains this firewall rule.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: The properties representing the resource.
     *
     * @return the innerProperties value.
     */
    private ReplicationLinkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isTerminationAllowed property: Legacy value indicating whether termination is allowed. Currently always
     * returns true.
     *
     * @return the isTerminationAllowed value.
     */
    public Boolean isTerminationAllowed() {
        return this.innerProperties() == null ? null : this.innerProperties().isTerminationAllowed();
    }

    /**
     * Get the replicationMode property: Replication mode of this replication link.
     *
     * @return the replicationMode value.
     */
    public String replicationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationMode();
    }

    /**
     * Get the partnerServer property: The name of the workspace hosting the partner Sql pool.
     *
     * @return the partnerServer value.
     */
    public String partnerServer() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerServer();
    }

    /**
     * Get the partnerDatabase property: The name of the partner Sql pool.
     *
     * @return the partnerDatabase value.
     */
    public String partnerDatabase() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDatabase();
    }

    /**
     * Get the partnerLocation property: The Azure Region of the partner Sql pool.
     *
     * @return the partnerLocation value.
     */
    public String partnerLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerLocation();
    }

    /**
     * Get the role property: The role of the Sql pool in the replication link.
     *
     * @return the role value.
     */
    public ReplicationRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Get the partnerRole property: The role of the partner Sql pool in the replication link.
     *
     * @return the partnerRole value.
     */
    public ReplicationRole partnerRole() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRole();
    }

    /**
     * Get the startTime property: The start time for the replication link.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the percentComplete property: The percentage of seeding complete for the replication link.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.innerProperties() == null ? null : this.innerProperties().percentComplete();
    }

    /**
     * Get the replicationState property: The replication state for the replication link.
     *
     * @return the replicationState value.
     */
    public ReplicationState replicationState() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationState();
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
