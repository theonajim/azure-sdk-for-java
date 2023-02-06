// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a lab's announcement banner. */
@Fluent
public final class LabAnnouncementProperties {
    /*
     * The plain text title for the lab announcement
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     */
    @JsonProperty(value = "markdown")
    private String markdown;

    /*
     * Is the lab announcement active/enabled at this time?
     */
    @JsonProperty(value = "enabled")
    private EnableStatus enabled;

    /*
     * The time at which the announcement expires (null for never)
     */
    @JsonProperty(value = "expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Has this announcement expired?
     */
    @JsonProperty(value = "expired")
    private Boolean expired;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /** Creates an instance of LabAnnouncementProperties class. */
    public LabAnnouncementProperties() {
    }

    /**
     * Get the title property: The plain text title for the lab announcement.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The plain text title for the lab announcement.
     *
     * @param title the title value to set.
     * @return the LabAnnouncementProperties object itself.
     */
    public LabAnnouncementProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the markdown property: The markdown text (if any) that this lab displays in the UI. If left empty/null,
     * nothing will be shown.
     *
     * @return the markdown value.
     */
    public String markdown() {
        return this.markdown;
    }

    /**
     * Set the markdown property: The markdown text (if any) that this lab displays in the UI. If left empty/null,
     * nothing will be shown.
     *
     * @param markdown the markdown value to set.
     * @return the LabAnnouncementProperties object itself.
     */
    public LabAnnouncementProperties withMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }

    /**
     * Get the enabled property: Is the lab announcement active/enabled at this time?.
     *
     * @return the enabled value.
     */
    public EnableStatus enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is the lab announcement active/enabled at this time?.
     *
     * @param enabled the enabled value to set.
     * @return the LabAnnouncementProperties object itself.
     */
    public LabAnnouncementProperties withEnabled(EnableStatus enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the expirationDate property: The time at which the announcement expires (null for never).
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: The time at which the announcement expires (null for never).
     *
     * @param expirationDate the expirationDate value to set.
     * @return the LabAnnouncementProperties object itself.
     */
    public LabAnnouncementProperties withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the expired property: Has this announcement expired?.
     *
     * @return the expired value.
     */
    public Boolean expired() {
        return this.expired;
    }

    /**
     * Set the expired property: Has this announcement expired?.
     *
     * @param expired the expired value to set.
     * @return the LabAnnouncementProperties object itself.
     */
    public LabAnnouncementProperties withExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
