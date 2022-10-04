// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a database service objective. */
@Fluent
public final class ServiceObjectiveInner extends ProxyResource {
    /*
     * Represents the properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ServiceObjectiveProperties innerProperties;

    /**
     * Get the innerProperties property: Represents the properties of the resource.
     *
     * @return the innerProperties value.
     */
    private ServiceObjectiveProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceObjectiveName property: The name for the service objective.
     *
     * @return the serviceObjectiveName value.
     */
    public String serviceObjectiveName() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceObjectiveName();
    }

    /**
     * Get the isDefault property: Gets whether the service level objective is the default service objective.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefault();
    }

    /**
     * Get the isSystem property: Gets whether the service level objective is a system service objective.
     *
     * @return the isSystem value.
     */
    public Boolean isSystem() {
        return this.innerProperties() == null ? null : this.innerProperties().isSystem();
    }

    /**
     * Get the description property: The description for the service level objective.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the enabled property: Gets whether the service level objective is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
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
