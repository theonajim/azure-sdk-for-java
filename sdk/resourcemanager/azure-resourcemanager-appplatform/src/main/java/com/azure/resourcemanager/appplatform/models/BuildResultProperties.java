// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Build result resource properties payload. */
@Fluent
public final class BuildResultProperties {
    /*
     * The name of this build result
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Provisioning state of the KPack build result
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BuildResultProvisioningState provisioningState;

    /*
     * The build pod name which can be used to get the build log streaming.
     */
    @JsonProperty(value = "buildPodName")
    private String buildPodName;

    /*
     * All of the build stage (init-container and container) resources in build pod.
     */
    @JsonProperty(value = "buildStages", access = JsonProperty.Access.WRITE_ONLY)
    private List<BuildStageProperties> buildStages;

    /**
     * Get the name property: The name of this build result.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of this build result.
     *
     * @param name the name value to set.
     * @return the BuildResultProperties object itself.
     */
    public BuildResultProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the KPack build result.
     *
     * @return the provisioningState value.
     */
    public BuildResultProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the buildPodName property: The build pod name which can be used to get the build log streaming.
     *
     * @return the buildPodName value.
     */
    public String buildPodName() {
        return this.buildPodName;
    }

    /**
     * Set the buildPodName property: The build pod name which can be used to get the build log streaming.
     *
     * @param buildPodName the buildPodName value to set.
     * @return the BuildResultProperties object itself.
     */
    public BuildResultProperties withBuildPodName(String buildPodName) {
        this.buildPodName = buildPodName;
        return this;
    }

    /**
     * Get the buildStages property: All of the build stage (init-container and container) resources in build pod.
     *
     * @return the buildStages value.
     */
    public List<BuildStageProperties> buildStages() {
        return this.buildStages;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (buildStages() != null) {
            buildStages().forEach(e -> e.validate());
        }
    }
}
