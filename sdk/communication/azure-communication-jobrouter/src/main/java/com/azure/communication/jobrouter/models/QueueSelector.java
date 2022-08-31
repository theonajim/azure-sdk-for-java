// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a condition that must be met against a set of labels for queue selection. */
@Fluent
public final class QueueSelector {
    /*
     * The label key to query against
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Describes how the value of the label is compared to the value defined on
     * the label selector
     */
    @JsonProperty(value = "labelOperator", required = true)
    private LabelOperator labelOperator;

    /*
     * The value to compare against the actual label value with the given
     * operator
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The label key to query against.
     *
     * @param key the key value to set.
     * @return the QueueSelector object itself.
     */
    public QueueSelector setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @return the labelOperator value.
     */
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Set the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @param labelOperator the labelOperator value to set.
     * @return the QueueSelector object itself.
     */
    public QueueSelector setLabelOperator(LabelOperator labelOperator) {
        this.labelOperator = labelOperator;
        return this;
    }

    /**
     * Get the value property: The value to compare against the actual label value with the given operator.
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare against the actual label value with the given operator.
     *
     * @param value the value value to set.
     * @return the QueueSelector object itself.
     */
    public QueueSelector setValue(Object value) {
        this.value = value;
        return this;
    }
}
