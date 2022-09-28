// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of CMK for the factory. */
@Fluent
public final class EncryptionConfiguration {
    /*
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /*
     * The url of the Azure Key Vault used for CMK.
     */
    @JsonProperty(value = "vaultBaseUrl", required = true)
    private String vaultBaseUrl;

    /*
     * The version of the key used for CMK. If not provided, latest version will be used.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /*
     * User assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity
     * will be used.
     */
    @JsonProperty(value = "identity")
    private CmkIdentityDefinition identity;

    /**
     * Get the keyName property: The name of the key in Azure Key Vault to use as Customer Managed Key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the key in Azure Key Vault to use as Customer Managed Key.
     *
     * @param keyName the keyName value to set.
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the vaultBaseUrl property: The url of the Azure Key Vault used for CMK.
     *
     * @return the vaultBaseUrl value.
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    /**
     * Set the vaultBaseUrl property: The url of the Azure Key Vault used for CMK.
     *
     * @param vaultBaseUrl the vaultBaseUrl value to set.
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withVaultBaseUrl(String vaultBaseUrl) {
        this.vaultBaseUrl = vaultBaseUrl;
        return this;
    }

    /**
     * Get the keyVersion property: The version of the key used for CMK. If not provided, latest version will be used.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of the key used for CMK. If not provided, latest version will be used.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the identity property: User assigned identity to use to authenticate to customer's key vault. If not provided
     * Managed Service Identity will be used.
     *
     * @return the identity value.
     */
    public CmkIdentityDefinition identity() {
        return this.identity;
    }

    /**
     * Set the identity property: User assigned identity to use to authenticate to customer's key vault. If not provided
     * Managed Service Identity will be used.
     *
     * @param identity the identity value to set.
     * @return the EncryptionConfiguration object itself.
     */
    public EncryptionConfiguration withIdentity(CmkIdentityDefinition identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyName in model EncryptionConfiguration"));
        }
        if (vaultBaseUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vaultBaseUrl in model EncryptionConfiguration"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionConfiguration.class);
}
