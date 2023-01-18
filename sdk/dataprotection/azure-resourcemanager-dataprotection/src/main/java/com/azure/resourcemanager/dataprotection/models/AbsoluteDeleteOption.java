// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AbsoluteDeleteOption
 *
 * <p>Delete option with duration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AbsoluteDeleteOption")
@Fluent
public final class AbsoluteDeleteOption extends DeleteOption {
    /** Creates an instance of AbsoluteDeleteOption class. */
    public AbsoluteDeleteOption() {
    }

    /** {@inheritDoc} */
    @Override
    public AbsoluteDeleteOption withDuration(String duration) {
        super.withDuration(duration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
