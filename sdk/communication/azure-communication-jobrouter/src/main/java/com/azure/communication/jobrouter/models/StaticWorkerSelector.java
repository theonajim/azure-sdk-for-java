// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a label selector that will always be attached. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Fluent
public final class StaticWorkerSelector extends WorkerSelectorAttachment {
    /*
     * Describes a condition that must be met against a set of labels for
     * worker selection
     */
    @JsonProperty(value = "labelSelector", required = true)
    private WorkerSelector labelSelector;

    /**
     * Get the labelSelector property: Describes a condition that must be met against a set of labels for worker
     * selection.
     *
     * @return the labelSelector value.
     */
    public WorkerSelector getLabelSelector() {
        return this.labelSelector;
    }

    /**
     * Set the labelSelector property: Describes a condition that must be met against a set of labels for worker
     * selection.
     *
     * @param labelSelector the labelSelector value to set.
     * @return the StaticWorkerSelector object itself.
     */
    public StaticWorkerSelector setLabelSelector(WorkerSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
}
