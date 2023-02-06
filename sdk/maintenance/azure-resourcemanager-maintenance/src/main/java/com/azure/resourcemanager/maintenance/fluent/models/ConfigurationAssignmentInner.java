// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration Assignment. */
@Fluent
public final class ConfigurationAssignmentInner extends ProxyResource {
    /*
     * Location of the resource
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Properties of the configuration assignment
     */
    @JsonProperty(value = "properties")
    private ConfigurationAssignmentProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ConfigurationAssignmentInner class. */
    public ConfigurationAssignmentInner() {
    }

    /**
     * Get the location property: Location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the resource.
     *
     * @param location the location value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the configuration assignment.
     *
     * @return the innerProperties value.
     */
    private ConfigurationAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the maintenanceConfigurationId property: The maintenance configuration Id.
     *
     * @return the maintenanceConfigurationId value.
     */
    public String maintenanceConfigurationId() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceConfigurationId();
    }

    /**
     * Set the maintenanceConfigurationId property: The maintenance configuration Id.
     *
     * @param maintenanceConfigurationId the maintenanceConfigurationId value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationAssignmentProperties();
        }
        this.innerProperties().withMaintenanceConfigurationId(maintenanceConfigurationId);
        return this;
    }

    /**
     * Get the resourceId property: The unique resourceId.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The unique resourceId.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConfigurationAssignmentInner object itself.
     */
    public ConfigurationAssignmentInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationAssignmentProperties();
        }
        this.innerProperties().withResourceId(resourceId);
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
