// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Use custom models to classify text into multi label taxonomy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("CustomMultiLabelClassification")
@Fluent
public final class CustomMultiLabelClassificationLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for a Custom Multi Classification task.
     */
    @JsonProperty(value = "parameters")
    private CustomMultiLabelClassificationTaskParameters parameters;

    /**
     * Get the parameters property: Supported parameters for a Custom Multi Classification task.
     *
     * @return the parameters value.
     */
    public CustomMultiLabelClassificationTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a Custom Multi Classification task.
     *
     * @param parameters the parameters value to set.
     * @return the CustomMultiLabelClassificationLROTask object itself.
     */
    public CustomMultiLabelClassificationLROTask setParameters(
            CustomMultiLabelClassificationTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomMultiLabelClassificationLROTask setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }
}
