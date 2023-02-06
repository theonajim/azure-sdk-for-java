// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.regex.Pattern;

/**
 * Defines the OS configuration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "osType", defaultImpl = OSConfiguration.class)
@JsonTypeName("OSConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Windows", value = WindowsConfiguration.class),
    @JsonSubTypes.Type(name = "Linux", value = LinuxConfiguration.class)
})
@Immutable
public class OSConfiguration {
    /**
     * Creates an instance of OSConfiguration class.
     */
    public OSConfiguration() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
