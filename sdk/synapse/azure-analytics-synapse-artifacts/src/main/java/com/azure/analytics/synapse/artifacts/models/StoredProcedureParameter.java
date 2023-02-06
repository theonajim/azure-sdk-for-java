// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SQL stored procedure parameter. */
@Fluent
public final class StoredProcedureParameter {
    /*
     * Stored procedure parameter value. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * Stored procedure parameter type.
     */
    @JsonProperty(value = "type")
    private StoredProcedureParameterType type;

    /** Creates an instance of StoredProcedureParameter class. */
    public StoredProcedureParameter() {}

    /**
     * Get the value property: Stored procedure parameter value. Type: string (or Expression with resultType string).
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: Stored procedure parameter value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set.
     * @return the StoredProcedureParameter object itself.
     */
    public StoredProcedureParameter setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the type property: Stored procedure parameter type.
     *
     * @return the type value.
     */
    public StoredProcedureParameterType getType() {
        return this.type;
    }

    /**
     * Set the type property: Stored procedure parameter type.
     *
     * @param type the type value to set.
     * @return the StoredProcedureParameter object itself.
     */
    public StoredProcedureParameter setType(StoredProcedureParameterType type) {
        this.type = type;
        return this;
    }
}
