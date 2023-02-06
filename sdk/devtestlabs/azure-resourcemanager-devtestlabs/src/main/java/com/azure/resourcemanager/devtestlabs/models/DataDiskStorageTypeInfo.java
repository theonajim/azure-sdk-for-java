// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage information about the data disks present in the custom image. */
@Fluent
public final class DataDiskStorageTypeInfo {
    /*
     * Disk Lun
     */
    @JsonProperty(value = "lun")
    private String lun;

    /*
     * Disk Storage Type
     */
    @JsonProperty(value = "storageType")
    private StorageType storageType;

    /** Creates an instance of DataDiskStorageTypeInfo class. */
    public DataDiskStorageTypeInfo() {
    }

    /**
     * Get the lun property: Disk Lun.
     *
     * @return the lun value.
     */
    public String lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Disk Lun.
     *
     * @param lun the lun value to set.
     * @return the DataDiskStorageTypeInfo object itself.
     */
    public DataDiskStorageTypeInfo withLun(String lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the storageType property: Disk Storage Type.
     *
     * @return the storageType value.
     */
    public StorageType storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Disk Storage Type.
     *
     * @param storageType the storageType value to set.
     * @return the DataDiskStorageTypeInfo object itself.
     */
    public DataDiskStorageTypeInfo withStorageType(StorageType storageType) {
        this.storageType = storageType;
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
