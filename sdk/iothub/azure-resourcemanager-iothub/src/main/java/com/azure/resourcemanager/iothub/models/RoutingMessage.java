// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Routing message. */
@Fluent
public final class RoutingMessage {
    /*
     * Body of routing message
     */
    @JsonProperty(value = "body")
    private String body;

    /*
     * App properties
     */
    @JsonProperty(value = "appProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> appProperties;

    /*
     * System properties
     */
    @JsonProperty(value = "systemProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> systemProperties;

    /**
     * Get the body property: Body of routing message.
     *
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Body of routing message.
     *
     * @param body the body value to set.
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get the appProperties property: App properties.
     *
     * @return the appProperties value.
     */
    public Map<String, String> appProperties() {
        return this.appProperties;
    }

    /**
     * Set the appProperties property: App properties.
     *
     * @param appProperties the appProperties value to set.
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withAppProperties(Map<String, String> appProperties) {
        this.appProperties = appProperties;
        return this;
    }

    /**
     * Get the systemProperties property: System properties.
     *
     * @return the systemProperties value.
     */
    public Map<String, String> systemProperties() {
        return this.systemProperties;
    }

    /**
     * Set the systemProperties property: System properties.
     *
     * @param systemProperties the systemProperties value to set.
     * @return the RoutingMessage object itself.
     */
    public RoutingMessage withSystemProperties(Map<String, String> systemProperties) {
        this.systemProperties = systemProperties;
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
