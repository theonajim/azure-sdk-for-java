// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** imageInfo. */
@Fluent
public final class MicrosoftGraphImageInfo {
    /*
     * Optional; parameter used to indicate the server is able to render image
     * dynamically in response to parameterization. For example – a high
     * contrast image
     */
    @JsonProperty(value = "addImageQuery")
    private Boolean addImageQuery;

    /*
     * Optional; alt-text accessible content for the image
     */
    @JsonProperty(value = "alternateText")
    private String alternateText;

    /*
     * The alternativeText property.
     */
    @JsonProperty(value = "alternativeText")
    private String alternativeText;

    /*
     * Optional; URI that points to an icon which represents the application
     * used to generate the activity
     */
    @JsonProperty(value = "iconUrl")
    private String iconUrl;

    /*
     * imageInfo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the addImageQuery property: Optional; parameter used to indicate the server is able to render image
     * dynamically in response to parameterization. For example – a high contrast image.
     *
     * @return the addImageQuery value.
     */
    public Boolean addImageQuery() {
        return this.addImageQuery;
    }

    /**
     * Set the addImageQuery property: Optional; parameter used to indicate the server is able to render image
     * dynamically in response to parameterization. For example – a high contrast image.
     *
     * @param addImageQuery the addImageQuery value to set.
     * @return the MicrosoftGraphImageInfo object itself.
     */
    public MicrosoftGraphImageInfo withAddImageQuery(Boolean addImageQuery) {
        this.addImageQuery = addImageQuery;
        return this;
    }

    /**
     * Get the alternateText property: Optional; alt-text accessible content for the image.
     *
     * @return the alternateText value.
     */
    public String alternateText() {
        return this.alternateText;
    }

    /**
     * Set the alternateText property: Optional; alt-text accessible content for the image.
     *
     * @param alternateText the alternateText value to set.
     * @return the MicrosoftGraphImageInfo object itself.
     */
    public MicrosoftGraphImageInfo withAlternateText(String alternateText) {
        this.alternateText = alternateText;
        return this;
    }

    /**
     * Get the alternativeText property: The alternativeText property.
     *
     * @return the alternativeText value.
     */
    public String alternativeText() {
        return this.alternativeText;
    }

    /**
     * Set the alternativeText property: The alternativeText property.
     *
     * @param alternativeText the alternativeText value to set.
     * @return the MicrosoftGraphImageInfo object itself.
     */
    public MicrosoftGraphImageInfo withAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
        return this;
    }

    /**
     * Get the iconUrl property: Optional; URI that points to an icon which represents the application used to generate
     * the activity.
     *
     * @return the iconUrl value.
     */
    public String iconUrl() {
        return this.iconUrl;
    }

    /**
     * Set the iconUrl property: Optional; URI that points to an icon which represents the application used to generate
     * the activity.
     *
     * @param iconUrl the iconUrl value to set.
     * @return the MicrosoftGraphImageInfo object itself.
     */
    public MicrosoftGraphImageInfo withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: imageInfo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: imageInfo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphImageInfo object itself.
     */
    public MicrosoftGraphImageInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
