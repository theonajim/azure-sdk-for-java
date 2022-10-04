// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties that define the scope private link mode settings exclusion item. This setting applies to a specific
 * private endpoint connection and overrides the default settings for that private endpoint connection.
 */
@Fluent
public final class AccessModeSettingsExclusion {
    /*
     * The private endpoint connection name associated to the private endpoint on which we want to apply the specific
     * access mode settings.
     */
    @JsonProperty(value = "privateEndpointConnectionName")
    private String privateEndpointConnectionName;

    /*
     * Specifies the access mode of queries through the specified private endpoint connection in the exclusion.
     */
    @JsonProperty(value = "queryAccessMode")
    private AccessMode queryAccessMode;

    /*
     * Specifies the access mode of ingestion through the specified private endpoint connection in the exclusion.
     */
    @JsonProperty(value = "ingestionAccessMode")
    private AccessMode ingestionAccessMode;

    /**
     * Get the privateEndpointConnectionName property: The private endpoint connection name associated to the private
     * endpoint on which we want to apply the specific access mode settings.
     *
     * @return the privateEndpointConnectionName value.
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Set the privateEndpointConnectionName property: The private endpoint connection name associated to the private
     * endpoint on which we want to apply the specific access mode settings.
     *
     * @param privateEndpointConnectionName the privateEndpointConnectionName value to set.
     * @return the AccessModeSettingsExclusion object itself.
     */
    public AccessModeSettingsExclusion withPrivateEndpointConnectionName(String privateEndpointConnectionName) {
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        return this;
    }

    /**
     * Get the queryAccessMode property: Specifies the access mode of queries through the specified private endpoint
     * connection in the exclusion.
     *
     * @return the queryAccessMode value.
     */
    public AccessMode queryAccessMode() {
        return this.queryAccessMode;
    }

    /**
     * Set the queryAccessMode property: Specifies the access mode of queries through the specified private endpoint
     * connection in the exclusion.
     *
     * @param queryAccessMode the queryAccessMode value to set.
     * @return the AccessModeSettingsExclusion object itself.
     */
    public AccessModeSettingsExclusion withQueryAccessMode(AccessMode queryAccessMode) {
        this.queryAccessMode = queryAccessMode;
        return this;
    }

    /**
     * Get the ingestionAccessMode property: Specifies the access mode of ingestion through the specified private
     * endpoint connection in the exclusion.
     *
     * @return the ingestionAccessMode value.
     */
    public AccessMode ingestionAccessMode() {
        return this.ingestionAccessMode;
    }

    /**
     * Set the ingestionAccessMode property: Specifies the access mode of ingestion through the specified private
     * endpoint connection in the exclusion.
     *
     * @param ingestionAccessMode the ingestionAccessMode value to set.
     * @return the AccessModeSettingsExclusion object itself.
     */
    public AccessModeSettingsExclusion withIngestionAccessMode(AccessMode ingestionAccessMode) {
        this.ingestionAccessMode = ingestionAccessMode;
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
