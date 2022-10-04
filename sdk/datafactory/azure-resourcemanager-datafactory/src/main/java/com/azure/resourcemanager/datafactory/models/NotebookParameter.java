// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Notebook parameter. */
@Fluent
public final class NotebookParameter {
    /*
     * Notebook parameter value. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * Notebook parameter type.
     */
    @JsonProperty(value = "type")
    private NotebookParameterType type;

    /**
     * Get the value property: Notebook parameter value. Type: string (or Expression with resultType string).
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Notebook parameter value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set.
     * @return the NotebookParameter object itself.
     */
    public NotebookParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the type property: Notebook parameter type.
     *
     * @return the type value.
     */
    public NotebookParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: Notebook parameter type.
     *
     * @param type the type value to set.
     * @return the NotebookParameter object itself.
     */
    public NotebookParameter withType(NotebookParameterType type) {
        this.type = type;
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
