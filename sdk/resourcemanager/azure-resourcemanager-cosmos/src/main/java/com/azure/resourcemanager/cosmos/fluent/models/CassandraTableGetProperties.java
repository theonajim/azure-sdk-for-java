// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.CassandraTableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.CassandraTableGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB Cassandra table. */
@Fluent
public final class CassandraTableGetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraTableGetProperties.class);

    /*
     * The resource property.
     */
    @JsonProperty(value = "resource")
    private CassandraTableGetPropertiesResource resource;

    /*
     * The options property.
     */
    @JsonProperty(value = "options")
    private CassandraTableGetPropertiesOptions options;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public CassandraTableGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the CassandraTableGetProperties object itself.
     */
    public CassandraTableGetProperties withResource(CassandraTableGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public CassandraTableGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the CassandraTableGetProperties object itself.
     */
    public CassandraTableGetProperties withOptions(CassandraTableGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}
