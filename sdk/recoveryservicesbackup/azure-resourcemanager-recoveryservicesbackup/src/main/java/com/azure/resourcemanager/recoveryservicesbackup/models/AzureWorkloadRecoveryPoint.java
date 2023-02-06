// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Workload specific recovery point, specifically encapsulates full/diff recovery point. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureWorkloadRecoveryPoint.class)
@JsonTypeName("AzureWorkloadRecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadPointInTimeRecoveryPoint",
        value = AzureWorkloadPointInTimeRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSAPHanaRecoveryPoint", value = AzureWorkloadSapHanaRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSQLRecoveryPoint", value = AzureWorkloadSqlRecoveryPoint.class)
})
@Fluent
public class AzureWorkloadRecoveryPoint extends RecoveryPoint {
    /*
     * UTC time at which recovery point was created
     */
    @JsonProperty(value = "recoveryPointTimeInUTC")
    private OffsetDateTime recoveryPointTimeInUtc;

    /*
     * Type of restore point
     */
    @JsonProperty(value = "type")
    private RestorePointType type;

    /*
     * Recovery point tier information.
     */
    @JsonProperty(value = "recoveryPointTierDetails")
    private List<RecoveryPointTierInformationV2> recoveryPointTierDetails;

    /*
     * Eligibility of RP to be moved to another tier
     */
    @JsonProperty(value = "recoveryPointMoveReadinessInfo")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo;

    /*
     * Properties of Recovery Point
     */
    @JsonProperty(value = "recoveryPointProperties")
    private RecoveryPointProperties recoveryPointProperties;

    /** Creates an instance of AzureWorkloadRecoveryPoint class. */
    public AzureWorkloadRecoveryPoint() {
    }

    /**
     * Get the recoveryPointTimeInUtc property: UTC time at which recovery point was created.
     *
     * @return the recoveryPointTimeInUtc value.
     */
    public OffsetDateTime recoveryPointTimeInUtc() {
        return this.recoveryPointTimeInUtc;
    }

    /**
     * Set the recoveryPointTimeInUtc property: UTC time at which recovery point was created.
     *
     * @param recoveryPointTimeInUtc the recoveryPointTimeInUtc value to set.
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withRecoveryPointTimeInUtc(OffsetDateTime recoveryPointTimeInUtc) {
        this.recoveryPointTimeInUtc = recoveryPointTimeInUtc;
        return this;
    }

    /**
     * Get the type property: Type of restore point.
     *
     * @return the type value.
     */
    public RestorePointType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of restore point.
     *
     * @param type the type value to set.
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withType(RestorePointType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @return the recoveryPointTierDetails value.
     */
    public List<RecoveryPointTierInformationV2> recoveryPointTierDetails() {
        return this.recoveryPointTierDetails;
    }

    /**
     * Set the recoveryPointTierDetails property: Recovery point tier information.
     *
     * @param recoveryPointTierDetails the recoveryPointTierDetails value to set.
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withRecoveryPointTierDetails(
        List<RecoveryPointTierInformationV2> recoveryPointTierDetails) {
        this.recoveryPointTierDetails = recoveryPointTierDetails;
        return this;
    }

    /**
     * Get the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     *
     * @return the recoveryPointMoveReadinessInfo value.
     */
    public Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo() {
        return this.recoveryPointMoveReadinessInfo;
    }

    /**
     * Set the recoveryPointMoveReadinessInfo property: Eligibility of RP to be moved to another tier.
     *
     * @param recoveryPointMoveReadinessInfo the recoveryPointMoveReadinessInfo value to set.
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withRecoveryPointMoveReadinessInfo(
        Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        this.recoveryPointMoveReadinessInfo = recoveryPointMoveReadinessInfo;
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
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withRecoveryPointProperties(RecoveryPointProperties recoveryPointProperties) {
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
        if (recoveryPointTierDetails() != null) {
            recoveryPointTierDetails().forEach(e -> e.validate());
        }
        if (recoveryPointMoveReadinessInfo() != null) {
            recoveryPointMoveReadinessInfo()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (recoveryPointProperties() != null) {
            recoveryPointProperties().validate();
        }
    }
}
