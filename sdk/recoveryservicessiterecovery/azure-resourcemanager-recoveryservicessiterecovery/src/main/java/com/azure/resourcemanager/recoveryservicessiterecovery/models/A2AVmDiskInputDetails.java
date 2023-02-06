// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A2A disk input details. */
@Fluent
public final class A2AVmDiskInputDetails {
    /*
     * The disk Uri.
     */
    @JsonProperty(value = "diskUri", required = true)
    private String diskUri;

    /*
     * The recovery VHD storage account Id.
     */
    @JsonProperty(value = "recoveryAzureStorageAccountId", required = true)
    private String recoveryAzureStorageAccountId;

    /*
     * The primary staging storage account Id.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId", required = true)
    private String primaryStagingAzureStorageAccountId;

    /** Creates an instance of A2AVmDiskInputDetails class. */
    public A2AVmDiskInputDetails() {
    }

    /**
     * Get the diskUri property: The disk Uri.
     *
     * @return the diskUri value.
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the diskUri property: The disk Uri.
     *
     * @param diskUri the diskUri value to set.
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the recoveryAzureStorageAccountId property: The recovery VHD storage account Id.
     *
     * @return the recoveryAzureStorageAccountId value.
     */
    public String recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId;
    }

    /**
     * Set the recoveryAzureStorageAccountId property: The recovery VHD storage account Id.
     *
     * @param recoveryAzureStorageAccountId the recoveryAzureStorageAccountId value to set.
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withRecoveryAzureStorageAccountId(String recoveryAzureStorageAccountId) {
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        return this;
    }

    /**
     * Get the primaryStagingAzureStorageAccountId property: The primary staging storage account Id.
     *
     * @return the primaryStagingAzureStorageAccountId value.
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primaryStagingAzureStorageAccountId property: The primary staging storage account Id.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set.
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withPrimaryStagingAzureStorageAccountId(String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property diskUri in model A2AVmDiskInputDetails"));
        }
        if (recoveryAzureStorageAccountId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryAzureStorageAccountId in model A2AVmDiskInputDetails"));
        }
        if (primaryStagingAzureStorageAccountId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property primaryStagingAzureStorageAccountId in model"
                            + " A2AVmDiskInputDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2AVmDiskInputDetails.class);
}
