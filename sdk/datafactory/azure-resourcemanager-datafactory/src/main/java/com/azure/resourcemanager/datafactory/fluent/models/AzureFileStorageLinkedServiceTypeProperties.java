// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure File Storage linked service properties. */
@Fluent
public final class AzureFileStorageLinkedServiceTypeProperties {
    /*
     * Host name of the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "host")
    private Object host;

    /*
     * User ID to logon the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userId")
    private Object userId;

    /*
     * Password to logon the server.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /*
     * SAS URI of the Azure File resource. It is mutually exclusive with connectionString property. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "sasUri")
    private Object sasUri;

    /*
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /*
     * The azure file share name. It is required when auth with accountKey/sasToken. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileShare")
    private Object fileShare;

    /*
     * The azure file share snapshot version. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "snapshot")
    private Object snapshot;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value.
     */
    public Object userId() {
        return this.userId;
    }

    /**
     * Set the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the password property: Password to logon the server.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the server.
     *
     * @param password the password value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure File resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object sasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of the Azure File resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference sasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the fileShare property: The azure file share name. It is required when auth with accountKey/sasToken. Type:
     * string (or Expression with resultType string).
     *
     * @return the fileShare value.
     */
    public Object fileShare() {
        return this.fileShare;
    }

    /**
     * Set the fileShare property: The azure file share name. It is required when auth with accountKey/sasToken. Type:
     * string (or Expression with resultType string).
     *
     * @param fileShare the fileShare value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withFileShare(Object fileShare) {
        this.fileShare = fileShare;
        return this;
    }

    /**
     * Get the snapshot property: The azure file share snapshot version. Type: string (or Expression with resultType
     * string).
     *
     * @return the snapshot value.
     */
    public Object snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The azure file share snapshot version. Type: string (or Expression with resultType
     * string).
     *
     * @param snapshot the snapshot value to set.
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withSnapshot(Object snapshot) {
        this.snapshot = snapshot;
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
     * @return the AzureFileStorageLinkedServiceTypeProperties object itself.
     */
    public AzureFileStorageLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
        if (accountKey() != null) {
            accountKey().validate();
        }
        if (sasToken() != null) {
            sasToken().validate();
        }
    }
}
