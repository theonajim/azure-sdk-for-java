// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.securityinsights.models.FileImportContentType;
import com.azure.resourcemanager.securityinsights.models.FileImportState;
import com.azure.resourcemanager.securityinsights.models.FileMetadata;
import com.azure.resourcemanager.securityinsights.models.IngestionMode;
import com.azure.resourcemanager.securityinsights.models.ValidationError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a file import in Azure Security Insights. */
@Fluent
public final class FileImportInner extends ProxyResource {
    /*
     * File import properties
     */
    @JsonProperty(value = "properties")
    private FileImportProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: File import properties.
     *
     * @return the innerProperties value.
     */
    private FileImportProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the ingestionMode property: Describes how to ingest the records in the file.
     *
     * @return the ingestionMode value.
     */
    public IngestionMode ingestionMode() {
        return this.innerProperties() == null ? null : this.innerProperties().ingestionMode();
    }

    /**
     * Set the ingestionMode property: Describes how to ingest the records in the file.
     *
     * @param ingestionMode the ingestionMode value to set.
     * @return the FileImportInner object itself.
     */
    public FileImportInner withIngestionMode(IngestionMode ingestionMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileImportProperties();
        }
        this.innerProperties().withIngestionMode(ingestionMode);
        return this;
    }

    /**
     * Get the contentType property: The content type of this file.
     *
     * @return the contentType value.
     */
    public FileImportContentType contentType() {
        return this.innerProperties() == null ? null : this.innerProperties().contentType();
    }

    /**
     * Set the contentType property: The content type of this file.
     *
     * @param contentType the contentType value to set.
     * @return the FileImportInner object itself.
     */
    public FileImportInner withContentType(FileImportContentType contentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileImportProperties();
        }
        this.innerProperties().withContentType(contentType);
        return this;
    }

    /**
     * Get the createdTimeUtc property: The time the file was imported.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTimeUtc();
    }

    /**
     * Get the errorFile property: Represents the error file (if the import was ingested with errors or failed the
     * validation).
     *
     * @return the errorFile value.
     */
    public FileMetadata errorFile() {
        return this.innerProperties() == null ? null : this.innerProperties().errorFile();
    }

    /**
     * Get the errorsPreview property: An ordered list of some of the errors that were encountered during validation.
     *
     * @return the errorsPreview value.
     */
    public List<ValidationError> errorsPreview() {
        return this.innerProperties() == null ? null : this.innerProperties().errorsPreview();
    }

    /**
     * Get the importFile property: Represents the imported file.
     *
     * @return the importFile value.
     */
    public FileMetadata importFile() {
        return this.innerProperties() == null ? null : this.innerProperties().importFile();
    }

    /**
     * Set the importFile property: Represents the imported file.
     *
     * @param importFile the importFile value to set.
     * @return the FileImportInner object itself.
     */
    public FileImportInner withImportFile(FileMetadata importFile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileImportProperties();
        }
        this.innerProperties().withImportFile(importFile);
        return this;
    }

    /**
     * Get the ingestedRecordCount property: The number of records that have been successfully ingested.
     *
     * @return the ingestedRecordCount value.
     */
    public Integer ingestedRecordCount() {
        return this.innerProperties() == null ? null : this.innerProperties().ingestedRecordCount();
    }

    /**
     * Get the source property: The source for the data in the file.
     *
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The source for the data in the file.
     *
     * @param source the source value to set.
     * @return the FileImportInner object itself.
     */
    public FileImportInner withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FileImportProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the state property: The state of the file import.
     *
     * @return the state value.
     */
    public FileImportState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the totalRecordCount property: The number of records in the file.
     *
     * @return the totalRecordCount value.
     */
    public Integer totalRecordCount() {
        return this.innerProperties() == null ? null : this.innerProperties().totalRecordCount();
    }

    /**
     * Get the validRecordCount property: The number of records that have passed validation.
     *
     * @return the validRecordCount value.
     */
    public Integer validRecordCount() {
        return this.innerProperties() == null ? null : this.innerProperties().validRecordCount();
    }

    /**
     * Get the filesValidUntilTimeUtc property: The time the files associated with this import are deleted from the
     * storage account.
     *
     * @return the filesValidUntilTimeUtc value.
     */
    public OffsetDateTime filesValidUntilTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().filesValidUntilTimeUtc();
    }

    /**
     * Get the importValidUntilTimeUtc property: The time the file import record is soft deleted from the database and
     * history.
     *
     * @return the importValidUntilTimeUtc value.
     */
    public OffsetDateTime importValidUntilTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().importValidUntilTimeUtc();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
