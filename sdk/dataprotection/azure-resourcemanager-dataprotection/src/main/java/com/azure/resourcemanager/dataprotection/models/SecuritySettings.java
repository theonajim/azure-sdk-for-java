// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class containing security settings of vault. */
@Fluent
public final class SecuritySettings {
    /*
     * Soft delete related settings
     */
    @JsonProperty(value = "softDeleteSettings")
    private SoftDeleteSettings softDeleteSettings;

    /*
     * Immutability Settings at vault level
     */
    @JsonProperty(value = "immutabilitySettings")
    private ImmutabilitySettings immutabilitySettings;

    /** Creates an instance of SecuritySettings class. */
    public SecuritySettings() {
    }

    /**
     * Get the softDeleteSettings property: Soft delete related settings.
     *
     * @return the softDeleteSettings value.
     */
    public SoftDeleteSettings softDeleteSettings() {
        return this.softDeleteSettings;
    }

    /**
     * Set the softDeleteSettings property: Soft delete related settings.
     *
     * @param softDeleteSettings the softDeleteSettings value to set.
     * @return the SecuritySettings object itself.
     */
    public SecuritySettings withSoftDeleteSettings(SoftDeleteSettings softDeleteSettings) {
        this.softDeleteSettings = softDeleteSettings;
        return this;
    }

    /**
     * Get the immutabilitySettings property: Immutability Settings at vault level.
     *
     * @return the immutabilitySettings value.
     */
    public ImmutabilitySettings immutabilitySettings() {
        return this.immutabilitySettings;
    }

    /**
     * Set the immutabilitySettings property: Immutability Settings at vault level.
     *
     * @param immutabilitySettings the immutabilitySettings value to set.
     * @return the SecuritySettings object itself.
     */
    public SecuritySettings withImmutabilitySettings(ImmutabilitySettings immutabilitySettings) {
        this.immutabilitySettings = immutabilitySettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (softDeleteSettings() != null) {
            softDeleteSettings().validate();
        }
        if (immutabilitySettings() != null) {
            immutabilitySettings().validate();
        }
    }
}
