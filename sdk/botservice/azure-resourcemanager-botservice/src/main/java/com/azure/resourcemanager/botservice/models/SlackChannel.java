// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Slack channel definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "channelName")
@JsonTypeName("SlackChannel")
@Fluent
public final class SlackChannel extends Channel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SlackChannel.class);

    /*
     * The set of properties specific to Slack channel resource
     */
    @JsonProperty(value = "properties")
    private SlackChannelProperties properties;

    /**
     * Get the properties property: The set of properties specific to Slack channel resource.
     *
     * @return the properties value.
     */
    public SlackChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Slack channel resource.
     *
     * @param properties the properties value to set.
     * @return the SlackChannel object itself.
     */
    public SlackChannel withProperties(SlackChannelProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SlackChannel withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SlackChannel withLocation(String location) {
        super.withLocation(location);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
