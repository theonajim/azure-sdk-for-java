// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reason for cancellation. */
@Fluent
public final class CancellationReason {
    /*
     * Reason for cancellation.
     */
    @JsonProperty(value = "reason", required = true)
    private String reason;

    /** Creates an instance of CancellationReason class. */
    public CancellationReason() {
    }

    /**
     * Get the reason property: Reason for cancellation.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason for cancellation.
     *
     * @param reason the reason value to set.
     * @return the CancellationReason object itself.
     */
    public CancellationReason withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (reason() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property reason in model CancellationReason"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CancellationReason.class);
}
