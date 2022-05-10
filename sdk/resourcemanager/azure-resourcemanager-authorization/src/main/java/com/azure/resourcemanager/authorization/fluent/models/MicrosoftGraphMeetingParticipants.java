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
import java.util.List;
import java.util.Map;

/** meetingParticipants. */
@Fluent
public final class MicrosoftGraphMeetingParticipants {
    /*
     * The attendees property.
     */
    @JsonProperty(value = "attendees")
    private List<MicrosoftGraphMeetingParticipantInfo> attendees;

    /*
     * meetingParticipantInfo
     */
    @JsonProperty(value = "organizer")
    private MicrosoftGraphMeetingParticipantInfo organizer;

    /*
     * meetingParticipants
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the attendees property: The attendees property.
     *
     * @return the attendees value.
     */
    public List<MicrosoftGraphMeetingParticipantInfo> attendees() {
        return this.attendees;
    }

    /**
     * Set the attendees property: The attendees property.
     *
     * @param attendees the attendees value to set.
     * @return the MicrosoftGraphMeetingParticipants object itself.
     */
    public MicrosoftGraphMeetingParticipants withAttendees(List<MicrosoftGraphMeetingParticipantInfo> attendees) {
        this.attendees = attendees;
        return this;
    }

    /**
     * Get the organizer property: meetingParticipantInfo.
     *
     * @return the organizer value.
     */
    public MicrosoftGraphMeetingParticipantInfo organizer() {
        return this.organizer;
    }

    /**
     * Set the organizer property: meetingParticipantInfo.
     *
     * @param organizer the organizer value to set.
     * @return the MicrosoftGraphMeetingParticipants object itself.
     */
    public MicrosoftGraphMeetingParticipants withOrganizer(MicrosoftGraphMeetingParticipantInfo organizer) {
        this.organizer = organizer;
        return this;
    }

    /**
     * Get the additionalProperties property: meetingParticipants.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: meetingParticipants.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphMeetingParticipants object itself.
     */
    public MicrosoftGraphMeetingParticipants withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (attendees() != null) {
            attendees().forEach(e -> e.validate());
        }
        if (organizer() != null) {
            organizer().validate();
        }
    }
}
