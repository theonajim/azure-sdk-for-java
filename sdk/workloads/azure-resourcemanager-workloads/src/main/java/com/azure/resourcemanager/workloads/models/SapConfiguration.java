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
 * The SAP Configuration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "configurationType", defaultImpl = SapConfiguration.class)
@JsonTypeName("SapConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Discovery", value = DiscoveryConfiguration.class),
    @JsonSubTypes.Type(name = "Deployment", value = DeploymentConfiguration.class),
    @JsonSubTypes.Type(name = "DeploymentWithOSConfig", value = DeploymentWithOSConfiguration.class)
})
@Immutable
public class SapConfiguration {
    /**
     * Creates an instance of SapConfiguration class.
     */
    public SapConfiguration() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
