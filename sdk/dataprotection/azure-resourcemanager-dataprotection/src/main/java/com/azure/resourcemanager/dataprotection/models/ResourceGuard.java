// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceGuard model. */
@Fluent
public final class ResourceGuard {
    /*
     * Provisioning state of the BackupVault resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceGuardProvisioningState provisioningState;

    /*
     * This flag indicates whether auto approval is allowed or not.
     */
    @JsonProperty(value = "allowAutoApprovals", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean allowAutoApprovals;

    /*
     * {readonly} List of operation details those are protected by the ResourceGuard resource
     */
    @JsonProperty(value = "resourceGuardOperations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceGuardOperation> resourceGuardOperations;

    /*
     * List of critical operations which are not protected by this resourceGuard
     */
    @JsonProperty(value = "vaultCriticalOperationExclusionList")
    private List<String> vaultCriticalOperationExclusionList;

    /*
     * Description about the pre-req steps to perform all the critical operations.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /** Creates an instance of ResourceGuard class. */
    public ResourceGuard() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the BackupVault resource.
     *
     * @return the provisioningState value.
     */
    public ResourceGuardProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the allowAutoApprovals property: This flag indicates whether auto approval is allowed or not.
     *
     * @return the allowAutoApprovals value.
     */
    public Boolean allowAutoApprovals() {
        return this.allowAutoApprovals;
    }

    /**
     * Get the resourceGuardOperations property: {readonly} List of operation details those are protected by the
     * ResourceGuard resource.
     *
     * @return the resourceGuardOperations value.
     */
    public List<ResourceGuardOperation> resourceGuardOperations() {
        return this.resourceGuardOperations;
    }

    /**
     * Get the vaultCriticalOperationExclusionList property: List of critical operations which are not protected by this
     * resourceGuard.
     *
     * @return the vaultCriticalOperationExclusionList value.
     */
    public List<String> vaultCriticalOperationExclusionList() {
        return this.vaultCriticalOperationExclusionList;
    }

    /**
     * Set the vaultCriticalOperationExclusionList property: List of critical operations which are not protected by this
     * resourceGuard.
     *
     * @param vaultCriticalOperationExclusionList the vaultCriticalOperationExclusionList value to set.
     * @return the ResourceGuard object itself.
     */
    public ResourceGuard withVaultCriticalOperationExclusionList(List<String> vaultCriticalOperationExclusionList) {
        this.vaultCriticalOperationExclusionList = vaultCriticalOperationExclusionList;
        return this;
    }

    /**
     * Get the description property: Description about the pre-req steps to perform all the critical operations.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceGuardOperations() != null) {
            resourceGuardOperations().forEach(e -> e.validate());
        }
    }
}
