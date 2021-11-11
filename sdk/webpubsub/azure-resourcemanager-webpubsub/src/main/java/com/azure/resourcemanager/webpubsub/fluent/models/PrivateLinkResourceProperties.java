// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Private link resource properties. */
@Fluent
public final class PrivateLinkResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceProperties.class);

    /*
     * Group Id of the private link resource
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * Required members of the private link resource
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /*
     * Required private DNS zone names
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /*
     * The list of resources that are onboarded to private link service
     */
    @JsonProperty(value = "shareablePrivateLinkResourceTypes")
    private List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes;

    /**
     * Get the groupId property: Group Id of the private link resource.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: Group Id of the private link resource.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requiredMembers property: Required members of the private link resource.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: Required members of the private link resource.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the requiredZoneNames property: Required private DNS zone names.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: Required private DNS zone names.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
        return this;
    }

    /**
     * Get the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     *
     * @return the shareablePrivateLinkResourceTypes value.
     */
    public List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes() {
        return this.shareablePrivateLinkResourceTypes;
    }

    /**
     * Set the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     *
     * @param shareablePrivateLinkResourceTypes the shareablePrivateLinkResourceTypes value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withShareablePrivateLinkResourceTypes(
        List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes) {
        this.shareablePrivateLinkResourceTypes = shareablePrivateLinkResourceTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (shareablePrivateLinkResourceTypes() != null) {
            shareablePrivateLinkResourceTypes().forEach(e -> e.validate());
        }
    }
}
