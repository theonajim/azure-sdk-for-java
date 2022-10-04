// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The gcpOrganization data for the member account. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "organizationMembershipType")
@JsonTypeName("Member")
@Fluent
public final class GcpOrganizationalDataMember extends GcpOrganizationalData {
    /*
     * If the multi cloud account is not of membership type organization, this will be the ID of the project's parent
     */
    @JsonProperty(value = "parentHierarchyId")
    private String parentHierarchyId;

    /*
     * The GCP management project number from organizational onboarding
     */
    @JsonProperty(value = "managementProjectNumber")
    private String managementProjectNumber;

    /**
     * Get the parentHierarchyId property: If the multi cloud account is not of membership type organization, this will
     * be the ID of the project's parent.
     *
     * @return the parentHierarchyId value.
     */
    public String parentHierarchyId() {
        return this.parentHierarchyId;
    }

    /**
     * Set the parentHierarchyId property: If the multi cloud account is not of membership type organization, this will
     * be the ID of the project's parent.
     *
     * @param parentHierarchyId the parentHierarchyId value to set.
     * @return the GcpOrganizationalDataMember object itself.
     */
    public GcpOrganizationalDataMember withParentHierarchyId(String parentHierarchyId) {
        this.parentHierarchyId = parentHierarchyId;
        return this;
    }

    /**
     * Get the managementProjectNumber property: The GCP management project number from organizational onboarding.
     *
     * @return the managementProjectNumber value.
     */
    public String managementProjectNumber() {
        return this.managementProjectNumber;
    }

    /**
     * Set the managementProjectNumber property: The GCP management project number from organizational onboarding.
     *
     * @param managementProjectNumber the managementProjectNumber value to set.
     * @return the GcpOrganizationalDataMember object itself.
     */
    public GcpOrganizationalDataMember withManagementProjectNumber(String managementProjectNumber) {
        this.managementProjectNumber = managementProjectNumber;
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
