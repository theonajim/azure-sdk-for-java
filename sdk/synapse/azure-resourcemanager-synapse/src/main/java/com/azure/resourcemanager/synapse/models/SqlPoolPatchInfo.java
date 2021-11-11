// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** SQL pool patch info A SQL Analytics pool patch info. */
@Fluent
public final class SqlPoolPatchInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolPatchInfo.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Sku SQL pool SKU
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * SQL pool properties
     */
    @JsonProperty(value = "properties")
    private SqlPoolResourceProperties innerProperties;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sku property: Sku SQL pool SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku SQL pool SKU.
     *
     * @param sku the sku value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: SQL pool properties.
     *
     * @return the innerProperties value.
     */
    private SqlPoolResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the maxSizeBytes property: Maximum size in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeBytes();
    }

    /**
     * Set the maxSizeBytes property: Maximum size in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withMaxSizeBytes(Long maxSizeBytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withMaxSizeBytes(maxSizeBytes);
        return this;
    }

    /**
     * Get the collation property: Collation mode.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.innerProperties() == null ? null : this.innerProperties().collation();
    }

    /**
     * Set the collation property: Collation mode.
     *
     * @param collation the collation value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCollation(String collation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withCollation(collation);
        return this;
    }

    /**
     * Get the sourceDatabaseId property: Source database to create from.
     *
     * @return the sourceDatabaseId value.
     */
    public String sourceDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDatabaseId();
    }

    /**
     * Set the sourceDatabaseId property: Source database to create from.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSourceDatabaseId(String sourceDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withSourceDatabaseId(sourceDatabaseId);
        return this;
    }

    /**
     * Get the recoverableDatabaseId property: Backup database to restore from.
     *
     * @return the recoverableDatabaseId value.
     */
    public String recoverableDatabaseId() {
        return this.innerProperties() == null ? null : this.innerProperties().recoverableDatabaseId();
    }

    /**
     * Set the recoverableDatabaseId property: Backup database to restore from.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withRecoverableDatabaseId(recoverableDatabaseId);
        return this;
    }

    /**
     * Get the provisioningState property: Resource state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Resource state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the status property: Resource status.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Resource status.
     *
     * @param status the status value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withStatus(String status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the restorePointInTime property: Snapshot time to restore.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePointInTime();
    }

    /**
     * Set the restorePointInTime property: Snapshot time to restore.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withRestorePointInTime(OffsetDateTime restorePointInTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withRestorePointInTime(restorePointInTime);
        return this;
    }

    /**
     * Get the createMode property: Specifies the mode of sql pool creation.
     *
     * <p>Default: regular sql pool creation.
     *
     * <p>PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool.
     * sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverableDatabaseId to restore.
     *
     * <p>Restore: Creates a sql pool by restoring a backup of a deleted sql pool. SourceDatabaseId should be the sql
     * pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.innerProperties() == null ? null : this.innerProperties().createMode();
    }

    /**
     * Set the createMode property: Specifies the mode of sql pool creation.
     *
     * <p>Default: regular sql pool creation.
     *
     * <p>PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool.
     * sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverableDatabaseId to restore.
     *
     * <p>Restore: Creates a sql pool by restoring a backup of a deleted sql pool. SourceDatabaseId should be the sql
     * pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     *
     * @param createMode the createMode value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreateMode(CreateMode createMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withCreateMode(createMode);
        return this;
    }

    /**
     * Get the creationDate property: Date the SQL pool was created.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Set the creationDate property: Date the SQL pool was created.
     *
     * @param creationDate the creationDate value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withCreationDate(OffsetDateTime creationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withCreationDate(creationDate);
        return this;
    }

    /**
     * Get the storageAccountType property: The storage account type used to store backups for this sql pool.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountType();
    }

    /**
     * Set the storageAccountType property: The storage account type used to store backups for this sql pool.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withStorageAccountType(StorageAccountType storageAccountType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withStorageAccountType(storageAccountType);
        return this;
    }

    /**
     * Get the sourceDatabaseDeletionDate property: Specifies the time that the sql pool was deleted.
     *
     * @return the sourceDatabaseDeletionDate value.
     */
    public OffsetDateTime sourceDatabaseDeletionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceDatabaseDeletionDate();
    }

    /**
     * Set the sourceDatabaseDeletionDate property: Specifies the time that the sql pool was deleted.
     *
     * @param sourceDatabaseDeletionDate the sourceDatabaseDeletionDate value to set.
     * @return the SqlPoolPatchInfo object itself.
     */
    public SqlPoolPatchInfo withSourceDatabaseDeletionDate(OffsetDateTime sourceDatabaseDeletionDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolResourceProperties();
        }
        this.innerProperties().withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
