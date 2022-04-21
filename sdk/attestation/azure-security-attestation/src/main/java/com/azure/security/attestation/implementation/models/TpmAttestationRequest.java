// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Attestation request for Trusted Platform Module (TPM) attestation. */
@Fluent
public final class TpmAttestationRequest {
    /*
     * Protocol data containing artifacts for attestation.
     */
    @JsonProperty(value = "data")
    private Base64Url data;

    /**
     * Get the data property: Protocol data containing artifacts for attestation.
     *
     * @return the data value.
     */
    public byte[] getData() {
        if (this.data == null) {
            return null;
        }
        return this.data.decodedBytes();
    }

    /**
     * Set the data property: Protocol data containing artifacts for attestation.
     *
     * @param data the data value to set.
     * @return the TpmAttestationRequest object itself.
     */
    public TpmAttestationRequest setData(byte[] data) {
        if (data == null) {
            this.data = null;
        } else {
            this.data = Base64Url.encode(CoreUtils.clone(data));
        }
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
