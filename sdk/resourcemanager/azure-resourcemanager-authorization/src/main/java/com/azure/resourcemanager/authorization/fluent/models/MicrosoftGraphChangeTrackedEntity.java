// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** changeTrackedEntity. */
@Fluent
public class MicrosoftGraphChangeTrackedEntity extends MicrosoftGraphEntity {
    /*
     * The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * identitySet
     */
    @JsonProperty(value = "lastModifiedBy")
    private MicrosoftGraphIdentitySet lastModifiedBy;

    /*
     * The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1,
     * 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * changeTrackedEntity
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the createdDateTime property: The Timestamp type represents date and time information using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The Timestamp type represents date and time information using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphChangeTrackedEntity object itself.
     */
    public MicrosoftGraphChangeTrackedEntity withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastModifiedBy property: identitySet.
     *
     * @return the lastModifiedBy value.
     */
    public MicrosoftGraphIdentitySet lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: identitySet.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the MicrosoftGraphChangeTrackedEntity object itself.
     */
    public MicrosoftGraphChangeTrackedEntity withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The Timestamp type represents date and time information using ISO 8601
     * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphChangeTrackedEntity object itself.
     */
    public MicrosoftGraphChangeTrackedEntity withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: changeTrackedEntity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: changeTrackedEntity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChangeTrackedEntity object itself.
     */
    public MicrosoftGraphChangeTrackedEntity withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphChangeTrackedEntity withId(String id) {
        super.withId(id);
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
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
    }
}
