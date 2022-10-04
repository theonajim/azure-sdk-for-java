// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Defender for servers connection configuration. */
@Fluent
public final class DefenderForServersGcpOfferingDefenderForServers {
    /*
     * The workload identity provider id in GCP for this feature
     */
    @JsonProperty(value = "workloadIdentityProviderId")
    private String workloadIdentityProviderId;

    /*
     * The service account email address in GCP for this feature
     */
    @JsonProperty(value = "serviceAccountEmailAddress")
    private String serviceAccountEmailAddress;

    /**
     * Get the workloadIdentityProviderId property: The workload identity provider id in GCP for this feature.
     *
     * @return the workloadIdentityProviderId value.
     */
    public String workloadIdentityProviderId() {
        return this.workloadIdentityProviderId;
    }

    /**
     * Set the workloadIdentityProviderId property: The workload identity provider id in GCP for this feature.
     *
     * @param workloadIdentityProviderId the workloadIdentityProviderId value to set.
     * @return the DefenderForServersGcpOfferingDefenderForServers object itself.
     */
    public DefenderForServersGcpOfferingDefenderForServers withWorkloadIdentityProviderId(
        String workloadIdentityProviderId) {
        this.workloadIdentityProviderId = workloadIdentityProviderId;
        return this;
    }

    /**
     * Get the serviceAccountEmailAddress property: The service account email address in GCP for this feature.
     *
     * @return the serviceAccountEmailAddress value.
     */
    public String serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }

    /**
     * Set the serviceAccountEmailAddress property: The service account email address in GCP for this feature.
     *
     * @param serviceAccountEmailAddress the serviceAccountEmailAddress value to set.
     * @return the DefenderForServersGcpOfferingDefenderForServers object itself.
     */
    public DefenderForServersGcpOfferingDefenderForServers withServiceAccountEmailAddress(
        String serviceAccountEmailAddress) {
        this.serviceAccountEmailAddress = serviceAccountEmailAddress;
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
