// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Azure File Share workload specific backup copy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureFileShareRecoveryPoint")
@Fluent
public final class AzureFileShareRecoveryPoint extends RecoveryPoint {
    /*
     * Type of the backup copy. Specifies whether it is a crash consistent backup or app consistent.
     */
    @JsonProperty(value = "recoveryPointType")
    private String recoveryPointType;

    /*
     * Time at which this backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime")
    private OffsetDateTime recoveryPointTime;

    /*
     * Contains Url to the snapshot of fileshare, if applicable
     */
    @JsonProperty(value = "fileShareSnapshotUri")
    private String fileShareSnapshotUri;

    /*
     * Contains recovery point size
     */
    @JsonProperty(value = "recoveryPointSizeInGB")
    private Integer recoveryPointSizeInGB;

    /*
     * Properties of Recovery Point
     */
    @JsonProperty(value = "recoveryPointProperties")
    private RecoveryPointProperties recoveryPointProperties;

    /** Creates an instance of AzureFileShareRecoveryPoint class. */
    public AzureFileShareRecoveryPoint() {
    }

    /**
     * Get the recoveryPointType property: Type of the backup copy. Specifies whether it is a crash consistent backup or
     * app consistent.
     *
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: Type of the backup copy. Specifies whether it is a crash consistent backup or
     * app consistent.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the recoveryPointTime property: Time at which this backup copy was created.
     *
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recoveryPointTime property: Time at which this backup copy was created.
     *
     * @param recoveryPointTime the recoveryPointTime value to set.
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointTime(OffsetDateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get the fileShareSnapshotUri property: Contains Url to the snapshot of fileshare, if applicable.
     *
     * @return the fileShareSnapshotUri value.
     */
    public String fileShareSnapshotUri() {
        return this.fileShareSnapshotUri;
    }

    /**
     * Set the fileShareSnapshotUri property: Contains Url to the snapshot of fileshare, if applicable.
     *
     * @param fileShareSnapshotUri the fileShareSnapshotUri value to set.
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withFileShareSnapshotUri(String fileShareSnapshotUri) {
        this.fileShareSnapshotUri = fileShareSnapshotUri;
        return this;
    }

    /**
     * Get the recoveryPointSizeInGB property: Contains recovery point size.
     *
     * @return the recoveryPointSizeInGB value.
     */
    public Integer recoveryPointSizeInGB() {
        return this.recoveryPointSizeInGB;
    }

    /**
     * Set the recoveryPointSizeInGB property: Contains recovery point size.
     *
     * @param recoveryPointSizeInGB the recoveryPointSizeInGB value to set.
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointSizeInGB(Integer recoveryPointSizeInGB) {
        this.recoveryPointSizeInGB = recoveryPointSizeInGB;
        return this;
    }

    /**
     * Get the recoveryPointProperties property: Properties of Recovery Point.
     *
     * @return the recoveryPointProperties value.
     */
    public RecoveryPointProperties recoveryPointProperties() {
        return this.recoveryPointProperties;
    }

    /**
     * Set the recoveryPointProperties property: Properties of Recovery Point.
     *
     * @param recoveryPointProperties the recoveryPointProperties value to set.
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointProperties(RecoveryPointProperties recoveryPointProperties) {
        this.recoveryPointProperties = recoveryPointProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (recoveryPointProperties() != null) {
            recoveryPointProperties().validate();
        }
    }
}
