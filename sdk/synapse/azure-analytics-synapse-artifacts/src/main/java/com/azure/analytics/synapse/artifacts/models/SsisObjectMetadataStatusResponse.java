// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the operation. */
@Fluent
public final class SsisObjectMetadataStatusResponse {
    /*
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private String properties;

    /*
     * The operation error message.
     */
    @JsonProperty(value = "error")
    private String error;

    /** Creates an instance of SsisObjectMetadataStatusResponse class. */
    public SsisObjectMetadataStatusResponse() {}

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the SsisObjectMetadataStatusResponse object itself.
     */
    public SsisObjectMetadataStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the SsisObjectMetadataStatusResponse object itself.
     */
    public SsisObjectMetadataStatusResponse setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The operation properties.
     *
     * @return the properties value.
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The operation properties.
     *
     * @param properties the properties value to set.
     * @return the SsisObjectMetadataStatusResponse object itself.
     */
    public SsisObjectMetadataStatusResponse setProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the error property: The operation error message.
     *
     * @return the error value.
     */
    public String getError() {
        return this.error;
    }

    /**
     * Set the error property: The operation error message.
     *
     * @param error the error value to set.
     * @return the SsisObjectMetadataStatusResponse object itself.
     */
    public SsisObjectMetadataStatusResponse setError(String error) {
        this.error = error;
        return this;
    }
}
