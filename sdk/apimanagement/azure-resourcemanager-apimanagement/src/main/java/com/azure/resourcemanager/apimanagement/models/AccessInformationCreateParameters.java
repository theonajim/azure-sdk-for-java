// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.AccessInformationCreateParameterProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tenant access information update parameters. */
@Fluent
public final class AccessInformationCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessInformationCreateParameters.class);

    /*
     * Tenant access information update parameter properties.
     */
    @JsonProperty(value = "properties")
    private AccessInformationCreateParameterProperties innerProperties;

    /**
     * Get the innerProperties property: Tenant access information update parameter properties.
     *
     * @return the innerProperties value.
     */
    private AccessInformationCreateParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalId property: Principal (User) Identifier.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: Principal (User) Identifier.
     *
     * @param principalId the principalId value to set.
     * @return the AccessInformationCreateParameters object itself.
     */
    public AccessInformationCreateParameters withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationCreateParameterProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the primaryKey property: Primary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryKey();
    }

    /**
     * Set the primaryKey property: Primary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the AccessInformationCreateParameters object itself.
     */
    public AccessInformationCreateParameters withPrimaryKey(String primaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationCreateParameterProperties();
        }
        this.innerProperties().withPrimaryKey(primaryKey);
        return this;
    }

    /**
     * Get the secondaryKey property: Secondary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryKey();
    }

    /**
     * Set the secondaryKey property: Secondary access key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the AccessInformationCreateParameters object itself.
     */
    public AccessInformationCreateParameters withSecondaryKey(String secondaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationCreateParameterProperties();
        }
        this.innerProperties().withSecondaryKey(secondaryKey);
        return this;
    }

    /**
     * Get the enabled property: Determines whether direct access is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Determines whether direct access is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the AccessInformationCreateParameters object itself.
     */
    public AccessInformationCreateParameters withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessInformationCreateParameterProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
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
