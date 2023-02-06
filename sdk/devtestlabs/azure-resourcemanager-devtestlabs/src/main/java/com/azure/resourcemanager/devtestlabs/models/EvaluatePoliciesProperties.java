// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for evaluating a policy set. */
@Fluent
public final class EvaluatePoliciesProperties {
    /*
     * The fact name.
     */
    @JsonProperty(value = "factName")
    private String factName;

    /*
     * The fact data.
     */
    @JsonProperty(value = "factData")
    private String factData;

    /*
     * The value offset.
     */
    @JsonProperty(value = "valueOffset")
    private String valueOffset;

    /*
     * The user for which policies will be evaluated
     */
    @JsonProperty(value = "userObjectId")
    private String userObjectId;

    /** Creates an instance of EvaluatePoliciesProperties class. */
    public EvaluatePoliciesProperties() {
    }

    /**
     * Get the factName property: The fact name.
     *
     * @return the factName value.
     */
    public String factName() {
        return this.factName;
    }

    /**
     * Set the factName property: The fact name.
     *
     * @param factName the factName value to set.
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withFactName(String factName) {
        this.factName = factName;
        return this;
    }

    /**
     * Get the factData property: The fact data.
     *
     * @return the factData value.
     */
    public String factData() {
        return this.factData;
    }

    /**
     * Set the factData property: The fact data.
     *
     * @param factData the factData value to set.
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withFactData(String factData) {
        this.factData = factData;
        return this;
    }

    /**
     * Get the valueOffset property: The value offset.
     *
     * @return the valueOffset value.
     */
    public String valueOffset() {
        return this.valueOffset;
    }

    /**
     * Set the valueOffset property: The value offset.
     *
     * @param valueOffset the valueOffset value to set.
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withValueOffset(String valueOffset) {
        this.valueOffset = valueOffset;
        return this;
    }

    /**
     * Get the userObjectId property: The user for which policies will be evaluated.
     *
     * @return the userObjectId value.
     */
    public String userObjectId() {
        return this.userObjectId;
    }

    /**
     * Set the userObjectId property: The user for which policies will be evaluated.
     *
     * @param userObjectId the userObjectId value to set.
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withUserObjectId(String userObjectId) {
        this.userObjectId = userObjectId;
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
