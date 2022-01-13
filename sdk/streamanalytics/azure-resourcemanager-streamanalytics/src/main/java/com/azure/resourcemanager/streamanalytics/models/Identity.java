// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes how identity is verified. */
@Fluent
public class Identity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Identity.class);

    /*
     * The identity tenantId
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The identity principal ID
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The identity type
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the tenantId property: The identity tenantId.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The identity tenantId.
     *
     * @param tenantId the tenantId value to set.
     * @return the Identity object itself.
     */
    public Identity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalId property: The identity principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The identity principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the Identity object itself.
     */
    public Identity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
