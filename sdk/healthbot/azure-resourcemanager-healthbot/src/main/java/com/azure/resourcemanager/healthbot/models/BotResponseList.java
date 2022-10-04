// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.healthbot.fluent.models.HealthBotInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of Healthbot operation response. */
@Immutable
public final class BotResponseList {
    /*
     * The link used to get the next page of bot service resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Gets the list of Healthbot results and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<HealthBotInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of bot service resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Gets the list of Healthbot results and their properties.
     *
     * @return the value value.
     */
    public List<HealthBotInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
