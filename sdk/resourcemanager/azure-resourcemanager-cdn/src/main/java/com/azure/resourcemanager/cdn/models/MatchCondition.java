// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Define match conditions. */
@Fluent
public final class MatchCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MatchCondition.class);

    /*
     * Match variable to compare against.
     */
    @JsonProperty(value = "matchVariable", required = true)
    private WafMatchVariable matchVariable;

    /*
     * Selector can used to match a specific key for QueryString, Cookies,
     * RequestHeader or PostArgs.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /*
     * Describes operator to be matched
     */
    @JsonProperty(value = "operator", required = true)
    private Operator operator;

    /*
     * Describes if the result of this condition should be negated.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /*
     * List of possible match values.
     */
    @JsonProperty(value = "matchValue", required = true)
    private List<String> matchValue;

    /*
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<TransformType> transforms;

    /**
     * Get the matchVariable property: Match variable to compare against.
     *
     * @return the matchVariable value.
     */
    public WafMatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the matchVariable property: Match variable to compare against.
     *
     * @param matchVariable the matchVariable value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariable(WafMatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get the selector property: Selector can used to match a specific key for QueryString, Cookies, RequestHeader or
     * PostArgs.
     *
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Selector can used to match a specific key for QueryString, Cookies, RequestHeader or
     * PostArgs.
     *
     * @param selector the selector value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     *
     * @return the operator value.
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     *
     * @param operator the operator value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if the result of this condition should be negated.
     *
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if the result of this condition should be negated.
     *
     * @param negateCondition the negateCondition value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValue property: List of possible match values.
     *
     * @return the matchValue value.
     */
    public List<String> matchValue() {
        return this.matchValue;
    }

    /**
     * Set the matchValue property: List of possible match values.
     *
     * @param matchValue the matchValue value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValue(List<String> matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     *
     * @return the transforms value.
     */
    public List<TransformType> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     *
     * @param transforms the transforms value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withTransforms(List<TransformType> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariable() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property matchVariable in model MatchCondition"));
        }
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model MatchCondition"));
        }
        if (matchValue() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property matchValue in model MatchCondition"));
        }
    }
}
