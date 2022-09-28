// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/** A policy that defines actions to execute when exception are triggered. */
@Fluent
public final class ExceptionPolicy {
    /*
     * The Id of the exception policy
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * (Optional) The name of the exception policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * (Optional) A dictionary collection of exception rules on the exception
     * policy. Key is the Id of each exception rule.
     */
    @JsonProperty(value = "exceptionRules")
    private Map<String, ExceptionRule> exceptionRules;

    /**
     * Get the id property: The Id of the exception policy.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: (Optional) The name of the exception policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: (Optional) The name of the exception policy.
     *
     * @param name the name value to set.
     * @return the ExceptionPolicy object itself.
     */
    public ExceptionPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the exceptionRules property: (Optional) A dictionary collection of exception rules on the exception policy.
     * Key is the Id of each exception rule.
     *
     * @return the exceptionRules value.
     */
    public Map<String, ExceptionRule> getExceptionRules() {
        return this.exceptionRules;
    }

    /**
     * Set the exceptionRules property: (Optional) A dictionary collection of exception rules on the exception policy.
     * Key is the Id of each exception rule.
     *
     * @param exceptionRules the exceptionRules value to set.
     * @return the ExceptionPolicy object itself.
     */
    public ExceptionPolicy setExceptionRules(Map<String, ExceptionRule> exceptionRules) {
        this.exceptionRules = exceptionRules;
        return this;
    }
}
