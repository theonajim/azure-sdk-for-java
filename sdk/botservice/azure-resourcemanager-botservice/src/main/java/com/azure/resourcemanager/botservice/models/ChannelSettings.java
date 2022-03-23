// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Channel settings definition. */
@Fluent
public final class ChannelSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ChannelSettings.class);

    /*
     * The extensionKey1
     */
    @JsonProperty(value = "extensionKey1")
    private String extensionKey1;

    /*
     * The extensionKey2
     */
    @JsonProperty(value = "extensionKey2")
    private String extensionKey2;

    /*
     * The list of sites
     */
    @JsonProperty(value = "sites")
    private List<Site> sites;

    /*
     * The channel id
     */
    @JsonProperty(value = "channelId")
    private String channelId;

    /*
     * The channel display name
     */
    @JsonProperty(value = "channelDisplayName")
    private String channelDisplayName;

    /*
     * The bot id
     */
    @JsonProperty(value = "botId")
    private String botId;

    /*
     * The bot icon url
     */
    @JsonProperty(value = "botIconUrl")
    private String botIconUrl;

    /*
     * Whether this channel is enabled for the bot
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /**
     * Get the extensionKey1 property: The extensionKey1.
     *
     * @return the extensionKey1 value.
     */
    public String extensionKey1() {
        return this.extensionKey1;
    }

    /**
     * Set the extensionKey1 property: The extensionKey1.
     *
     * @param extensionKey1 the extensionKey1 value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withExtensionKey1(String extensionKey1) {
        this.extensionKey1 = extensionKey1;
        return this;
    }

    /**
     * Get the extensionKey2 property: The extensionKey2.
     *
     * @return the extensionKey2 value.
     */
    public String extensionKey2() {
        return this.extensionKey2;
    }

    /**
     * Set the extensionKey2 property: The extensionKey2.
     *
     * @param extensionKey2 the extensionKey2 value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withExtensionKey2(String extensionKey2) {
        this.extensionKey2 = extensionKey2;
        return this;
    }

    /**
     * Get the sites property: The list of sites.
     *
     * @return the sites value.
     */
    public List<Site> sites() {
        return this.sites;
    }

    /**
     * Set the sites property: The list of sites.
     *
     * @param sites the sites value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withSites(List<Site> sites) {
        this.sites = sites;
        return this;
    }

    /**
     * Get the channelId property: The channel id.
     *
     * @return the channelId value.
     */
    public String channelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channel id.
     *
     * @param channelId the channelId value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the channelDisplayName property: The channel display name.
     *
     * @return the channelDisplayName value.
     */
    public String channelDisplayName() {
        return this.channelDisplayName;
    }

    /**
     * Set the channelDisplayName property: The channel display name.
     *
     * @param channelDisplayName the channelDisplayName value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withChannelDisplayName(String channelDisplayName) {
        this.channelDisplayName = channelDisplayName;
        return this;
    }

    /**
     * Get the botId property: The bot id.
     *
     * @return the botId value.
     */
    public String botId() {
        return this.botId;
    }

    /**
     * Set the botId property: The bot id.
     *
     * @param botId the botId value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withBotId(String botId) {
        this.botId = botId;
        return this;
    }

    /**
     * Get the botIconUrl property: The bot icon url.
     *
     * @return the botIconUrl value.
     */
    public String botIconUrl() {
        return this.botIconUrl;
    }

    /**
     * Set the botIconUrl property: The bot icon url.
     *
     * @param botIconUrl the botIconUrl value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withBotIconUrl(String botIconUrl) {
        this.botIconUrl = botIconUrl;
        return this;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled for the bot.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled for the bot.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the ChannelSettings object itself.
     */
    public ChannelSettings withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sites() != null) {
            sites().forEach(e -> e.validate());
        }
    }
}
