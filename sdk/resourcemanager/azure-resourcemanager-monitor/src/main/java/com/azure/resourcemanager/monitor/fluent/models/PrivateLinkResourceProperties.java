// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a private link resource. */
@Fluent
public final class PrivateLinkResourceProperties {
    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * The private link resource required member names.
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * The private link resource Private link DNS zone name.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /** Creates an instance of PrivateLinkResourceProperties class. */
    public PrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
