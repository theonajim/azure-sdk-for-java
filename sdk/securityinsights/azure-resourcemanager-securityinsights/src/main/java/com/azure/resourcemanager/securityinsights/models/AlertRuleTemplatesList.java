// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleTemplateInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List all the alert rule templates. */
@Fluent
public final class AlertRuleTemplatesList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertRuleTemplatesList.class);

    /*
     * URL to fetch the next set of alert rule templates.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of alert rule templates.
     */
    @JsonProperty(value = "value", required = true)
    private List<AlertRuleTemplateInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of alert rule templates.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of alert rule templates.
     *
     * @return the value value.
     */
    public List<AlertRuleTemplateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of alert rule templates.
     *
     * @param value the value value to set.
     * @return the AlertRuleTemplatesList object itself.
     */
    public AlertRuleTemplatesList withValue(List<AlertRuleTemplateInner> value) {
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
                    new IllegalArgumentException("Missing required property value in model AlertRuleTemplatesList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}