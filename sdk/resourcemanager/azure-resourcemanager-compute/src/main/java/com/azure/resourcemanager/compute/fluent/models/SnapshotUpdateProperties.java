// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Snapshot resource update properties. */
@Fluent
public final class SnapshotUpdateProperties {
    /*
     * the Operating System type.
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "diskAccessId")
    private String diskAccessId;

    /*
     * Indicates the OS on a snapshot supports hibernation.
     */
    @JsonProperty(value = "supportsHibernation")
    private Boolean supportsHibernation;

    /*
     * Policy for controlling export on the disk.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Additional authentication requirements when exporting or uploading to a
     * disk or snapshot.
     */
    @JsonProperty(value = "dataAccessAuthMode")
    private DataAccessAuthMode dataAccessAuthMode;

    /*
     * List of supported capabilities for the image from which the OS disk was
     * created.
     */
    @JsonProperty(value = "supportedCapabilities")
    private SupportedCapabilities supportedCapabilities;

    /**
     * Get the osType property: the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withEncryptionSettingsCollection(
        EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.supportsHibernation;
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withSupportsHibernation(Boolean supportsHibernation) {
        this.supportsHibernation = supportsHibernation;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.dataAccessAuthMode;
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        this.dataAccessAuthMode = dataAccessAuthMode;
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.supportedCapabilities;
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the SnapshotUpdateProperties object itself.
     */
    public SnapshotUpdateProperties withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        this.supportedCapabilities = supportedCapabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (supportedCapabilities() != null) {
            supportedCapabilities().validate();
        }
    }
}
