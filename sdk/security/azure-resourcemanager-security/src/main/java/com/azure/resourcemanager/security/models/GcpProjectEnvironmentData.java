// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The GCP project connector environment data. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "environmentType")
@JsonTypeName("GcpProject")
@Fluent
public final class GcpProjectEnvironmentData extends EnvironmentData {
    /*
     * The Gcp project's organizational data
     */
    @JsonProperty(value = "organizationalData")
    private GcpOrganizationalData organizationalData;

    /*
     * The Gcp project's details
     */
    @JsonProperty(value = "projectDetails")
    private GcpProjectDetails projectDetails;

    /**
     * Get the organizationalData property: The Gcp project's organizational data.
     *
     * @return the organizationalData value.
     */
    public GcpOrganizationalData organizationalData() {
        return this.organizationalData;
    }

    /**
     * Set the organizationalData property: The Gcp project's organizational data.
     *
     * @param organizationalData the organizationalData value to set.
     * @return the GcpProjectEnvironmentData object itself.
     */
    public GcpProjectEnvironmentData withOrganizationalData(GcpOrganizationalData organizationalData) {
        this.organizationalData = organizationalData;
        return this;
    }

    /**
     * Get the projectDetails property: The Gcp project's details.
     *
     * @return the projectDetails value.
     */
    public GcpProjectDetails projectDetails() {
        return this.projectDetails;
    }

    /**
     * Set the projectDetails property: The Gcp project's details.
     *
     * @param projectDetails the projectDetails value to set.
     * @return the GcpProjectEnvironmentData object itself.
     */
    public GcpProjectEnvironmentData withProjectDetails(GcpProjectDetails projectDetails) {
        this.projectDetails = projectDetails;
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
        if (organizationalData() != null) {
            organizationalData().validate();
        }
        if (projectDetails() != null) {
            projectDetails().validate();
        }
    }
}
