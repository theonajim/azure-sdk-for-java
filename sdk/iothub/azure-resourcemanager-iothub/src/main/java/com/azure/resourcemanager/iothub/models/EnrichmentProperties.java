// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of an enrichment that your IoT hub applies to messages delivered to endpoints. */
@Fluent
public final class EnrichmentProperties {
    /*
     * The key or name for the enrichment property.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * The value for the enrichment property.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * The list of endpoints for which the enrichment is applied to the message.
     */
    @JsonProperty(value = "endpointNames", required = true)
    private List<String> endpointNames;

    /**
     * Get the key property: The key or name for the enrichment property.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The key or name for the enrichment property.
     *
     * @param key the key value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value for the enrichment property.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value for the enrichment property.
     *
     * @param value the value value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the endpointNames property: The list of endpoints for which the enrichment is applied to the message.
     *
     * @return the endpointNames value.
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the endpointNames property: The list of endpoints for which the enrichment is applied to the message.
     *
     * @param endpointNames the endpointNames value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property key in model EnrichmentProperties"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model EnrichmentProperties"));
        }
        if (endpointNames() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endpointNames in model EnrichmentProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnrichmentProperties.class);
}
