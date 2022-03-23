// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate used for https. */
@Fluent
public class Certificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Certificate.class);

    /*
     * The type of the secret resource.
     */
    @JsonProperty(value = "type")
    private SecretType type;

    /*
     * Subject name in the certificate.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String expirationDate;

    /**
     * Get the type property: The type of the secret resource.
     *
     * @return the type value.
     */
    public SecretType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the secret resource.
     *
     * @param type the type value to set.
     * @return the Certificate object itself.
     */
    public Certificate withType(SecretType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subject property: Subject name in the certificate.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
