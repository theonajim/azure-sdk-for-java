// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This represents path associated with the subvolume. */
@Fluent
public final class SubvolumeProperties {
    /*
     * path
     *
     * Path to the subvolume
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * size
     *
     * Truncate subvolume to the provided size in bytes
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * name
     *
     * parent path to the subvolume
     */
    @JsonProperty(value = "parentPath")
    private String parentPath;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @param path the path value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the size property: size
     *
     * <p>Truncate subvolume to the provided size in bytes.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: size
     *
     * <p>Truncate subvolume to the provided size in bytes.
     *
     * @param size the size value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the parentPath property: name
     *
     * <p>parent path to the subvolume.
     *
     * @return the parentPath value.
     */
    public String parentPath() {
        return this.parentPath;
    }

    /**
     * Set the parentPath property: name
     *
     * <p>parent path to the subvolume.
     *
     * @param parentPath the parentPath value to set.
     * @return the SubvolumeProperties object itself.
     */
    public SubvolumeProperties withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
