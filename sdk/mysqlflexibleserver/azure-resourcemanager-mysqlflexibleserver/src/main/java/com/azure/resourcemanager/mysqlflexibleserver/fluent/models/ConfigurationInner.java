// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsConfigPendingRestart;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsDynamicConfig;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Configuration. */
@Fluent
public final class ConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationInner.class);

    /*
     * The properties of a configuration.
     */
    @JsonProperty(value = "properties")
    private ConfigurationProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The properties of a configuration.
     *
     * @return the innerProperties value.
     */
    private ConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the value property: Value of the configuration.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Value of the configuration.
     *
     * @param value the value value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the description property: Description of the configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultValue();
    }

    /**
     * Get the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.innerProperties() == null ? null : this.innerProperties().dataType();
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    public String allowedValues() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedValues();
    }

    /**
     * Get the source property: Source of the configuration.
     *
     * @return the source value.
     */
    public ConfigurationSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source of the configuration.
     *
     * @param source the source value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withSource(ConfigurationSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the isReadOnly property: If is the configuration read only.
     *
     * @return the isReadOnly value.
     */
    public IsReadOnly isReadOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().isReadOnly();
    }

    /**
     * Get the isConfigPendingRestart property: If is the configuration pending restart or not.
     *
     * @return the isConfigPendingRestart value.
     */
    public IsConfigPendingRestart isConfigPendingRestart() {
        return this.innerProperties() == null ? null : this.innerProperties().isConfigPendingRestart();
    }

    /**
     * Get the isDynamicConfig property: If is the configuration dynamic.
     *
     * @return the isDynamicConfig value.
     */
    public IsDynamicConfig isDynamicConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().isDynamicConfig();
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
