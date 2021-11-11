// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ArmProxyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A notebook workspace resource. */
@Fluent
public final class NotebookWorkspaceInner extends ArmProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotebookWorkspaceInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private NotebookWorkspaceProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NotebookWorkspaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().notebookServerEndpoint();
    }

    /**
     * Get the status property: Status of the notebook workspace. Possible values are: Creating, Online, Deleting,
     * Failed, Updating.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
