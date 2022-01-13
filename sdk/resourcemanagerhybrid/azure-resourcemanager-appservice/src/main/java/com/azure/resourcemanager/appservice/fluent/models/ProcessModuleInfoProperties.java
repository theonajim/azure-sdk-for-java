// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ProcessModuleInfo resource specific properties. */
@Fluent
public final class ProcessModuleInfoProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProcessModuleInfoProperties.class);

    /*
     * Base address. Used as module identifier in ARM resource URI.
     */
    @JsonProperty(value = "base_address")
    private String baseAddress;

    /*
     * File name.
     */
    @JsonProperty(value = "file_name")
    private String fileName;

    /*
     * HRef URI.
     */
    @JsonProperty(value = "href")
    private String href;

    /*
     * File path.
     */
    @JsonProperty(value = "file_path")
    private String filePath;

    /*
     * Module memory size.
     */
    @JsonProperty(value = "module_memory_size")
    private Integer moduleMemorySize;

    /*
     * File version.
     */
    @JsonProperty(value = "file_version")
    private String fileVersion;

    /*
     * File description.
     */
    @JsonProperty(value = "file_description")
    private String fileDescription;

    /*
     * Product name.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * Product version.
     */
    @JsonProperty(value = "product_version")
    private String productVersion;

    /*
     * Is debug?
     */
    @JsonProperty(value = "is_debug")
    private Boolean isDebug;

    /*
     * Module language (locale).
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Get the baseAddress property: Base address. Used as module identifier in ARM resource URI.
     *
     * @return the baseAddress value.
     */
    public String baseAddress() {
        return this.baseAddress;
    }

    /**
     * Set the baseAddress property: Base address. Used as module identifier in ARM resource URI.
     *
     * @param baseAddress the baseAddress value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
        return this;
    }

    /**
     * Get the fileName property: File name.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: File name.
     *
     * @param fileName the fileName value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the href property: HRef URI.
     *
     * @return the href value.
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href property: HRef URI.
     *
     * @param href the href value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the filePath property: File path.
     *
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: File path.
     *
     * @param filePath the filePath value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the moduleMemorySize property: Module memory size.
     *
     * @return the moduleMemorySize value.
     */
    public Integer moduleMemorySize() {
        return this.moduleMemorySize;
    }

    /**
     * Set the moduleMemorySize property: Module memory size.
     *
     * @param moduleMemorySize the moduleMemorySize value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withModuleMemorySize(Integer moduleMemorySize) {
        this.moduleMemorySize = moduleMemorySize;
        return this;
    }

    /**
     * Get the fileVersion property: File version.
     *
     * @return the fileVersion value.
     */
    public String fileVersion() {
        return this.fileVersion;
    }

    /**
     * Set the fileVersion property: File version.
     *
     * @param fileVersion the fileVersion value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }

    /**
     * Get the fileDescription property: File description.
     *
     * @return the fileDescription value.
     */
    public String fileDescription() {
        return this.fileDescription;
    }

    /**
     * Set the fileDescription property: File description.
     *
     * @param fileDescription the fileDescription value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }

    /**
     * Get the product property: Product name.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Product name.
     *
     * @param product the product value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the productVersion property: Product version.
     *
     * @return the productVersion value.
     */
    public String productVersion() {
        return this.productVersion;
    }

    /**
     * Set the productVersion property: Product version.
     *
     * @param productVersion the productVersion value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    /**
     * Get the isDebug property: Is debug?.
     *
     * @return the isDebug value.
     */
    public Boolean isDebug() {
        return this.isDebug;
    }

    /**
     * Set the isDebug property: Is debug?.
     *
     * @param isDebug the isDebug value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withIsDebug(Boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }

    /**
     * Get the language property: Module language (locale).
     *
     * @return the language value.
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language property: Module language (locale).
     *
     * @param language the language value to set.
     * @return the ProcessModuleInfoProperties object itself.
     */
    public ProcessModuleInfoProperties withLanguage(String language) {
        this.language = language;
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
