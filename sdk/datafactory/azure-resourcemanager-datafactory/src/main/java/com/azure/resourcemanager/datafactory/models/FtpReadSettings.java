// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Ftp read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FtpReadSettings")
@Fluent
public final class FtpReadSettings extends StoreReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FtpReadSettings.class);

    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Ftp wildcardFolderPath. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * Ftp wildcardFileName. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "deleteFilesAfterCompletion")
    private Object deleteFilesAfterCompletion;

    /*
     * Point to a text file that lists each file (relative path to the path
     * configured in the dataset) that you want to copy. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /*
     * Specify whether to use binary transfer mode for FTP stores.
     */
    @JsonProperty(value = "useBinaryTransfer")
    private Boolean useBinaryTransfer;

    /*
     * If true, disable parallel reading within each file. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "disableChunking")
    private Object disableChunking;

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Ftp wildcardFileName. Type: string (or Expression with resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value.
     */
    public Boolean enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @param fileListPath the fileListPath value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores.
     *
     * @return the useBinaryTransfer value.
     */
    public Boolean useBinaryTransfer() {
        return this.useBinaryTransfer;
    }

    /**
     * Set the useBinaryTransfer property: Specify whether to use binary transfer mode for FTP stores.
     *
     * @param useBinaryTransfer the useBinaryTransfer value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withUseBinaryTransfer(Boolean useBinaryTransfer) {
        this.useBinaryTransfer = useBinaryTransfer;
        return this;
    }

    /**
     * Get the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the disableChunking value.
     */
    public Object disableChunking() {
        return this.disableChunking;
    }

    /**
     * Set the disableChunking property: If true, disable parallel reading within each file. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param disableChunking the disableChunking value to set.
     * @return the FtpReadSettings object itself.
     */
    public FtpReadSettings withDisableChunking(Object disableChunking) {
        this.disableChunking = disableChunking;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FtpReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FtpReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
