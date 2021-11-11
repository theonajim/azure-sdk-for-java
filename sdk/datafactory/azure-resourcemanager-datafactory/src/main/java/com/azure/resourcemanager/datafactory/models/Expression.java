// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Data Factory expression definition. */
@Fluent
public final class Expression {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Expression.class);

    /*
     * Expression type.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "Expression";

    /*
     * Expression value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /** Creates an instance of Expression class. */
    public Expression() {
        type = "Expression";
    }

    /**
     * Get the type property: Expression type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Expression type.
     *
     * @param type the type value to set.
     * @return the Expression object itself.
     */
    public Expression withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Expression value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Expression value.
     *
     * @param value the value value to set.
     * @return the Expression object itself.
     */
    public Expression withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model Expression"));
        }
    }
}
