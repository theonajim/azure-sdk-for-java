// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the size configuration under the lab account. */
@Fluent
public final class SizeConfigurationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SizeConfigurationProperties.class);

    /*
     * Represents a list of size categories supported by this Lab Account
     * (Small, Medium, Large)
     */
    @JsonProperty(value = "environmentSizes")
    private List<EnvironmentSize> environmentSizes;

    /**
     * Get the environmentSizes property: Represents a list of size categories supported by this Lab Account (Small,
     * Medium, Large).
     *
     * @return the environmentSizes value.
     */
    public List<EnvironmentSize> environmentSizes() {
        return this.environmentSizes;
    }

    /**
     * Set the environmentSizes property: Represents a list of size categories supported by this Lab Account (Small,
     * Medium, Large).
     *
     * @param environmentSizes the environmentSizes value to set.
     * @return the SizeConfigurationProperties object itself.
     */
    public SizeConfigurationProperties withEnvironmentSizes(List<EnvironmentSize> environmentSizes) {
        this.environmentSizes = environmentSizes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (environmentSizes() != null) {
            environmentSizes().forEach(e -> e.validate());
        }
    }
}
