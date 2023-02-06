// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Renew Certificate input properties. */
@Fluent
public final class RenewCertificateInputProperties {
    /*
     * Renew certificate type.
     */
    @JsonProperty(value = "renewCertificateType")
    private String renewCertificateType;

    /** Creates an instance of RenewCertificateInputProperties class. */
    public RenewCertificateInputProperties() {
    }

    /**
     * Get the renewCertificateType property: Renew certificate type.
     *
     * @return the renewCertificateType value.
     */
    public String renewCertificateType() {
        return this.renewCertificateType;
    }

    /**
     * Set the renewCertificateType property: Renew certificate type.
     *
     * @param renewCertificateType the renewCertificateType value to set.
     * @return the RenewCertificateInputProperties object itself.
     */
    public RenewCertificateInputProperties withRenewCertificateType(String renewCertificateType) {
        this.renewCertificateType = renewCertificateType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
