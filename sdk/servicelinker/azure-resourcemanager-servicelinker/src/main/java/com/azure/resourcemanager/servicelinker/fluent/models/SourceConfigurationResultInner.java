// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicelinker.models.SourceConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configurations for source resource, include appSettings, connectionString and serviceBindings. */
@Fluent
public final class SourceConfigurationResultInner {
    /*
     * The configuration properties for source resource.
     */
    @JsonProperty(value = "configurations")
    private List<SourceConfiguration> configurations;

    /**
     * Get the configurations property: The configuration properties for source resource.
     *
     * @return the configurations value.
     */
    public List<SourceConfiguration> configurations() {
        return this.configurations;
    }

    /**
     * Set the configurations property: The configuration properties for source resource.
     *
     * @param configurations the configurations value to set.
     * @return the SourceConfigurationResultInner object itself.
     */
    public SourceConfigurationResultInner withConfigurations(List<SourceConfiguration> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurations() != null) {
            configurations().forEach(e -> e.validate());
        }
    }
}
