// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request to failover a process server. */
@Fluent
public final class FailoverProcessServerRequest {
    /*
     * The properties of the PS Failover request.
     */
    @JsonProperty(value = "properties")
    private FailoverProcessServerRequestProperties properties;

    /** Creates an instance of FailoverProcessServerRequest class. */
    public FailoverProcessServerRequest() {
    }

    /**
     * Get the properties property: The properties of the PS Failover request.
     *
     * @return the properties value.
     */
    public FailoverProcessServerRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the PS Failover request.
     *
     * @param properties the properties value to set.
     * @return the FailoverProcessServerRequest object itself.
     */
    public FailoverProcessServerRequest withProperties(FailoverProcessServerRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
