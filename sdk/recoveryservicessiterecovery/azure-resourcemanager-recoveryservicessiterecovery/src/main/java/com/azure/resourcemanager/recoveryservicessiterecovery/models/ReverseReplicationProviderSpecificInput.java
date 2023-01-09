// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific reverse replication input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ReverseReplicationProviderSpecificInput.class)
@JsonTypeName("ReverseReplicationProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AReprotectInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureReprotectInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2ReprotectInput.class),
    @JsonSubTypes.Type(name = "InMageRcmFailback", value = InMageRcmFailbackReprotectInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmReprotectInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMageReprotectInput.class)
})
@Immutable
public class ReverseReplicationProviderSpecificInput {
    /** Creates an instance of ReverseReplicationProviderSpecificInput class. */
    public ReverseReplicationProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
