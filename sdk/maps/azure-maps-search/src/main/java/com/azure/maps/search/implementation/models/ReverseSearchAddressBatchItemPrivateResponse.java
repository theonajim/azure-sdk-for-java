// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.ResponseError;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of the query. SearchAddressReverseResponse if the query completed successfully, ErrorResponse otherwise.
 */
@Fluent
public final class ReverseSearchAddressBatchItemPrivateResponse extends ReverseSearchAddressResult {
    /*
     * The error object.
     */
    @JsonProperty(value = "error")
    private ErrorDetail error;

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    public ResponseError getError() {
        if (this.error == null) {
            return new ResponseError("", "");
        }
        return new ResponseError(this.error.getCode(), this.error.getMessage());
    }

    /**
     * Set the error property: The error object.
     *
     * @param error the error value to set.
     * @return the ReverseSearchAddressBatchItemPrivateResponse object itself.
     */
    public ReverseSearchAddressBatchItemPrivateResponse setError(ResponseError error) {
        this.error = new ErrorDetail().setCode(error.getCode()).setMessage(error.getMessage());
        return this;
    }
}
