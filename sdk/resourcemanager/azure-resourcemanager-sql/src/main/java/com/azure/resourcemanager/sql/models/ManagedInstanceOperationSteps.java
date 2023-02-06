// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The steps of a managed instance operation. */
@Immutable
public final class ManagedInstanceOperationSteps {
    /*
     * The total number of operation steps.
     */
    @JsonProperty(value = "totalSteps", access = JsonProperty.Access.WRITE_ONLY)
    private String totalSteps;

    /*
     * The number of current operation steps.
     */
    @JsonProperty(value = "currentStep", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentStep;

    /*
     * The operation steps list.
     */
    @JsonProperty(value = "stepsList", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpsertManagedServerOperationStepWithEstimatesAndDuration> stepsList;

    /** Creates an instance of ManagedInstanceOperationSteps class. */
    public ManagedInstanceOperationSteps() {
    }

    /**
     * Get the totalSteps property: The total number of operation steps.
     *
     * @return the totalSteps value.
     */
    public String totalSteps() {
        return this.totalSteps;
    }

    /**
     * Get the currentStep property: The number of current operation steps.
     *
     * @return the currentStep value.
     */
    public Integer currentStep() {
        return this.currentStep;
    }

    /**
     * Get the stepsList property: The operation steps list.
     *
     * @return the stepsList value.
     */
    public List<UpsertManagedServerOperationStepWithEstimatesAndDuration> stepsList() {
        return this.stepsList;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stepsList() != null) {
            stepsList().forEach(e -> e.validate());
        }
    }
}
