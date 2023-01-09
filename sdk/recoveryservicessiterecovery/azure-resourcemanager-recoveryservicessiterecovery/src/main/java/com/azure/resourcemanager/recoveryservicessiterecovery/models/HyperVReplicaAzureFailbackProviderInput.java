// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** HyperVReplicaAzureFailback specific planned failover input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzureFailback")
@Fluent
public final class HyperVReplicaAzureFailbackProviderInput extends PlannedFailoverProviderSpecificFailoverInput {
    /*
     * Data sync option.
     */
    @JsonProperty(value = "dataSyncOption")
    private String dataSyncOption;

    /*
     * ALR options to create alternate recovery.
     */
    @JsonProperty(value = "recoveryVmCreationOption")
    private String recoveryVmCreationOption;

    /*
     * Provider Id for alternate location.
     */
    @JsonProperty(value = "providerIdForAlternateRecovery")
    private String providerIdForAlternateRecovery;

    /** Creates an instance of HyperVReplicaAzureFailbackProviderInput class. */
    public HyperVReplicaAzureFailbackProviderInput() {
    }

    /**
     * Get the dataSyncOption property: Data sync option.
     *
     * @return the dataSyncOption value.
     */
    public String dataSyncOption() {
        return this.dataSyncOption;
    }

    /**
     * Set the dataSyncOption property: Data sync option.
     *
     * @param dataSyncOption the dataSyncOption value to set.
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withDataSyncOption(String dataSyncOption) {
        this.dataSyncOption = dataSyncOption;
        return this;
    }

    /**
     * Get the recoveryVmCreationOption property: ALR options to create alternate recovery.
     *
     * @return the recoveryVmCreationOption value.
     */
    public String recoveryVmCreationOption() {
        return this.recoveryVmCreationOption;
    }

    /**
     * Set the recoveryVmCreationOption property: ALR options to create alternate recovery.
     *
     * @param recoveryVmCreationOption the recoveryVmCreationOption value to set.
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withRecoveryVmCreationOption(String recoveryVmCreationOption) {
        this.recoveryVmCreationOption = recoveryVmCreationOption;
        return this;
    }

    /**
     * Get the providerIdForAlternateRecovery property: Provider Id for alternate location.
     *
     * @return the providerIdForAlternateRecovery value.
     */
    public String providerIdForAlternateRecovery() {
        return this.providerIdForAlternateRecovery;
    }

    /**
     * Set the providerIdForAlternateRecovery property: Provider Id for alternate location.
     *
     * @param providerIdForAlternateRecovery the providerIdForAlternateRecovery value to set.
     * @return the HyperVReplicaAzureFailbackProviderInput object itself.
     */
    public HyperVReplicaAzureFailbackProviderInput withProviderIdForAlternateRecovery(
        String providerIdForAlternateRecovery) {
        this.providerIdForAlternateRecovery = providerIdForAlternateRecovery;
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
    }
}
