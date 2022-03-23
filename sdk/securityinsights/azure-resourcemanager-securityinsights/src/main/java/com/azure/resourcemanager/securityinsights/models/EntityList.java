// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all the entities. */
@Fluent
public final class EntityList {
    /*
     * URL to fetch the next set of entities.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of entities.
     */
    @JsonProperty(value = "value", required = true)
    private List<EntityInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of entities.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of entities.
     *
     * @return the value value.
     */
    public List<EntityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of entities.
     *
     * @param value the value value to set.
     * @return the EntityList object itself.
     */
    public EntityList withValue(List<EntityInner> value) {
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
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model EntityList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EntityList.class);
}
