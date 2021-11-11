// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.fluent.models.SqlStoredProcedureCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB storedProcedure. */
@Fluent
public final class SqlStoredProcedureCreateUpdateParameters extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlStoredProcedureCreateUpdateParameters.class);

    /*
     * Properties to create and update Azure Cosmos DB storedProcedure.
     */
    @JsonProperty(value = "properties", required = true)
    private SqlStoredProcedureCreateUpdateProperties innerProperties = new SqlStoredProcedureCreateUpdateProperties();

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB storedProcedure.
     *
     * @return the innerProperties value.
     */
    private SqlStoredProcedureCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SqlStoredProcedureCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlStoredProcedureCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a storedProcedure.
     *
     * @return the resource value.
     */
    public SqlStoredProcedureResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a storedProcedure.
     *
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withResource(SqlStoredProcedureResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlStoredProcedureCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlStoredProcedureCreateUpdateProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model SqlStoredProcedureCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }
}
