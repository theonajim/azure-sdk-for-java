// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Metric computation method to use for validation metrics in image tasks. */
public final class ValidationMetricType extends ExpandableStringEnum<ValidationMetricType> {
    /** Static value None for ValidationMetricType. */
    public static final ValidationMetricType NONE = fromString("None");

    /** Static value Coco for ValidationMetricType. */
    public static final ValidationMetricType COCO = fromString("Coco");

    /** Static value Voc for ValidationMetricType. */
    public static final ValidationMetricType VOC = fromString("Voc");

    /** Static value CocoVoc for ValidationMetricType. */
    public static final ValidationMetricType COCO_VOC = fromString("CocoVoc");

    /**
     * Creates a new instance of ValidationMetricType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ValidationMetricType() {
    }

    /**
     * Creates or finds a ValidationMetricType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValidationMetricType.
     */
    @JsonCreator
    public static ValidationMetricType fromString(String name) {
        return fromString(name, ValidationMetricType.class);
    }

    /**
     * Gets known ValidationMetricType values.
     *
     * @return known ValidationMetricType values.
     */
    public static Collection<ValidationMetricType> values() {
        return values(ValidationMetricType.class);
    }
}
