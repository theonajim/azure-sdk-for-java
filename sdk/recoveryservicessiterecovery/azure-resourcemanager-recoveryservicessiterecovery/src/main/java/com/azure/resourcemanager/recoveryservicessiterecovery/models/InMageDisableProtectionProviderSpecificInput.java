// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** InMage disable protection provider specific input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
@Fluent
public final class InMageDisableProtectionProviderSpecificInput extends DisableProtectionProviderSpecificInput {
    /*
     * A value indicating whether the replica VM should be destroyed or retained. Values from Delete and Retain.
     */
    @JsonProperty(value = "replicaVmDeletionStatus")
    private String replicaVmDeletionStatus;

    /** Creates an instance of InMageDisableProtectionProviderSpecificInput class. */
    public InMageDisableProtectionProviderSpecificInput() {
    }

    /**
     * Get the replicaVmDeletionStatus property: A value indicating whether the replica VM should be destroyed or
     * retained. Values from Delete and Retain.
     *
     * @return the replicaVmDeletionStatus value.
     */
    public String replicaVmDeletionStatus() {
        return this.replicaVmDeletionStatus;
    }

    /**
     * Set the replicaVmDeletionStatus property: A value indicating whether the replica VM should be destroyed or
     * retained. Values from Delete and Retain.
     *
     * @param replicaVmDeletionStatus the replicaVmDeletionStatus value to set.
     * @return the InMageDisableProtectionProviderSpecificInput object itself.
     */
    public InMageDisableProtectionProviderSpecificInput withReplicaVmDeletionStatus(String replicaVmDeletionStatus) {
        this.replicaVmDeletionStatus = replicaVmDeletionStatus;
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
