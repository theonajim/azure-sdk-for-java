// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for credential objects. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@type",
    defaultImpl = CredentialsBase.class)
@JsonTypeName("CredentialsBase")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "#Microsoft.VideoAnalyzer.UsernamePasswordCredentials",
        value = UsernamePasswordCredentials.class)
})
@Immutable
public class CredentialsBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CredentialsBase.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
