// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.AdministratorPropertiesForAdd;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an Active Directory administrator. */
@Fluent
public final class ActiveDirectoryAdministratorAdd {
    /*
     * Properties of the active directory administrator.
     */
    @JsonProperty(value = "properties")
    private AdministratorPropertiesForAdd innerProperties;

    /** Creates an instance of ActiveDirectoryAdministratorAdd class. */
    public ActiveDirectoryAdministratorAdd() {
    }

    /**
     * Get the innerProperties property: Properties of the active directory administrator.
     *
     * @return the innerProperties value.
     */
    private AdministratorPropertiesForAdd innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalType property: The principal type used to represent the type of Active Directory Administrator.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: The principal type used to represent the type of Active Directory Administrator.
     *
     * @param principalType the principalType value to set.
     * @return the ActiveDirectoryAdministratorAdd object itself.
     */
    public ActiveDirectoryAdministratorAdd withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorPropertiesForAdd();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the principalName property: Active Directory administrator principal name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Set the principalName property: Active Directory administrator principal name.
     *
     * @param principalName the principalName value to set.
     * @return the ActiveDirectoryAdministratorAdd object itself.
     */
    public ActiveDirectoryAdministratorAdd withPrincipalName(String principalName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorPropertiesForAdd();
        }
        this.innerProperties().withPrincipalName(principalName);
        return this;
    }

    /**
     * Get the tenantId property: The tenantId of the Active Directory administrator.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenantId of the Active Directory administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the ActiveDirectoryAdministratorAdd object itself.
     */
    public ActiveDirectoryAdministratorAdd withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorPropertiesForAdd();
        }
        this.innerProperties().withTenantId(tenantId);
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
