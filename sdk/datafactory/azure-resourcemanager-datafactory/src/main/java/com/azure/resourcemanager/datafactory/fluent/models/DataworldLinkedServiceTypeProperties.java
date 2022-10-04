// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dataworld linked service type properties. */
@Fluent
public final class DataworldLinkedServiceTypeProperties {
    /*
     * The api token for the Dataworld source.
     */
    @JsonProperty(value = "apiToken", required = true)
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the apiToken property: The api token for the Dataworld source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the Dataworld source.
     *
     * @param apiToken the apiToken value to set.
     * @return the DataworldLinkedServiceTypeProperties object itself.
     */
    public DataworldLinkedServiceTypeProperties withApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the DataworldLinkedServiceTypeProperties object itself.
     */
    public DataworldLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (apiToken() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property apiToken in model DataworldLinkedServiceTypeProperties"));
        } else {
            apiToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataworldLinkedServiceTypeProperties.class);
}
