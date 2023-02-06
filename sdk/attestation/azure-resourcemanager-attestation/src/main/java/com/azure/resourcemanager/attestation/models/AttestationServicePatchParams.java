// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters for patching an attestation provider. */
@Fluent
public final class AttestationServicePatchParams {
    /*
     * The tags that will be assigned to the attestation provider.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of AttestationServicePatchParams class. */
    public AttestationServicePatchParams() {
    }

    /**
     * Get the tags property: The tags that will be assigned to the attestation provider.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the attestation provider.
     *
     * @param tags the tags value to set.
     * @return the AttestationServicePatchParams object itself.
     */
    public AttestationServicePatchParams withTags(Map<String, String> tags) {
        this.tags = tags;
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
