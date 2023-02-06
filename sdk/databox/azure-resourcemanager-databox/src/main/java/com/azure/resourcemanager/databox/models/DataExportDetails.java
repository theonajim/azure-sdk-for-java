// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the data to be used for exporting data from azure. */
@Fluent
public final class DataExportDetails {
    /*
     * Configuration for the data transfer.
     */
    @JsonProperty(value = "transferConfiguration", required = true)
    private TransferConfiguration transferConfiguration;

    /*
     * Level of the logs to be collected.
     */
    @JsonProperty(value = "logCollectionLevel")
    private LogCollectionLevel logCollectionLevel;

    /*
     * Account details of the data to be transferred
     */
    @JsonProperty(value = "accountDetails", required = true)
    private DataAccountDetails accountDetails;

    /** Creates an instance of DataExportDetails class. */
    public DataExportDetails() {
    }

    /**
     * Get the transferConfiguration property: Configuration for the data transfer.
     *
     * @return the transferConfiguration value.
     */
    public TransferConfiguration transferConfiguration() {
        return this.transferConfiguration;
    }

    /**
     * Set the transferConfiguration property: Configuration for the data transfer.
     *
     * @param transferConfiguration the transferConfiguration value to set.
     * @return the DataExportDetails object itself.
     */
    public DataExportDetails withTransferConfiguration(TransferConfiguration transferConfiguration) {
        this.transferConfiguration = transferConfiguration;
        return this;
    }

    /**
     * Get the logCollectionLevel property: Level of the logs to be collected.
     *
     * @return the logCollectionLevel value.
     */
    public LogCollectionLevel logCollectionLevel() {
        return this.logCollectionLevel;
    }

    /**
     * Set the logCollectionLevel property: Level of the logs to be collected.
     *
     * @param logCollectionLevel the logCollectionLevel value to set.
     * @return the DataExportDetails object itself.
     */
    public DataExportDetails withLogCollectionLevel(LogCollectionLevel logCollectionLevel) {
        this.logCollectionLevel = logCollectionLevel;
        return this;
    }

    /**
     * Get the accountDetails property: Account details of the data to be transferred.
     *
     * @return the accountDetails value.
     */
    public DataAccountDetails accountDetails() {
        return this.accountDetails;
    }

    /**
     * Set the accountDetails property: Account details of the data to be transferred.
     *
     * @param accountDetails the accountDetails value to set.
     * @return the DataExportDetails object itself.
     */
    public DataExportDetails withAccountDetails(DataAccountDetails accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transferConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property transferConfiguration in model DataExportDetails"));
        } else {
            transferConfiguration().validate();
        }
        if (accountDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountDetails in model DataExportDetails"));
        } else {
            accountDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataExportDetails.class);
}
