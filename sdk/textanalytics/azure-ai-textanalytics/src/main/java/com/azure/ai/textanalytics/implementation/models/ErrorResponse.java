// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error response. */
@Fluent
public final class ErrorResponse {
    /*
     * The error object.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: The error object.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(Error error) {
        this.error = error;
        return this;
    }
}
