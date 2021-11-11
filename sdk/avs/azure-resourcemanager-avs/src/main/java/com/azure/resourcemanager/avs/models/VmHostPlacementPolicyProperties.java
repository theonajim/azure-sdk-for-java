// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VM-Host placement policy properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("VmHost")
@Fluent
public final class VmHostPlacementPolicyProperties extends PlacementPolicyProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VmHostPlacementPolicyProperties.class);

    /*
     * Virtual machine members list
     */
    @JsonProperty(value = "vmMembers", required = true)
    private List<String> vmMembers;

    /*
     * Host members list
     */
    @JsonProperty(value = "hostMembers", required = true)
    private List<String> hostMembers;

    /*
     * placement policy affinity type
     */
    @JsonProperty(value = "affinityType", required = true)
    private AffinityType affinityType;

    /**
     * Get the vmMembers property: Virtual machine members list.
     *
     * @return the vmMembers value.
     */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    /**
     * Set the vmMembers property: Virtual machine members list.
     *
     * @param vmMembers the vmMembers value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withVmMembers(List<String> vmMembers) {
        this.vmMembers = vmMembers;
        return this;
    }

    /**
     * Get the hostMembers property: Host members list.
     *
     * @return the hostMembers value.
     */
    public List<String> hostMembers() {
        return this.hostMembers;
    }

    /**
     * Set the hostMembers property: Host members list.
     *
     * @param hostMembers the hostMembers value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withHostMembers(List<String> hostMembers) {
        this.hostMembers = hostMembers;
        return this;
    }

    /**
     * Get the affinityType property: placement policy affinity type.
     *
     * @return the affinityType value.
     */
    public AffinityType affinityType() {
        return this.affinityType;
    }

    /**
     * Set the affinityType property: placement policy affinity type.
     *
     * @param affinityType the affinityType value to set.
     * @return the VmHostPlacementPolicyProperties object itself.
     */
    public VmHostPlacementPolicyProperties withAffinityType(AffinityType affinityType) {
        this.affinityType = affinityType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmHostPlacementPolicyProperties withState(PlacementPolicyState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmHostPlacementPolicyProperties withDisplayName(String displayName) {
        super.withDisplayName(displayName);
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
        if (vmMembers() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vmMembers in model VmHostPlacementPolicyProperties"));
        }
        if (hostMembers() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostMembers in model VmHostPlacementPolicyProperties"));
        }
        if (affinityType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property affinityType in model VmHostPlacementPolicyProperties"));
        }
    }
}
