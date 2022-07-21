// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** The ParticipantsUpdatedEvent model. */
@Fluent
public final class ParticipantsUpdatedEvent extends CallingServerEventBase {
    /*
     * List of current participants in the call.
     */
    @JsonProperty(value = "participants")
    private List<CommunicationIdentifier> participants;

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private AcsEventType type;

    /*
     * Call connection ID.
     */
    @JsonProperty(value = "callConnectionId")
    private String callConnectionId;

    /*
     * Server call ID.
     */
    @JsonProperty(value = "serverCallId")
    private String serverCallId;

    /*
     * Correlation ID for event to call correlation. Also called ChainId for
     * skype chain ID.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * Get the participants property: List of current participants in the call.
     *
     * @return the participants value.
     */
    public List<CommunicationIdentifier> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: List of current participants in the call.
     *
     * @param participants the participants value to set.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setParticipants(List<CommunicationIdentifier> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public AcsEventType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setType(AcsEventType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the callConnectionId property: Call connection ID.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Set the callConnectionId property: Call connection ID.
     *
     * @param callConnectionId the callConnectionId value to set.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setCallConnectionId(String callConnectionId) {
        this.callConnectionId = callConnectionId;
        return this;
    }

    /**
     * Get the serverCallId property: Server call ID.
     *
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Set the serverCallId property: Server call ID.
     *
     * @param serverCallId the serverCallId value to set.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setServerCallId(String serverCallId) {
        this.serverCallId = serverCallId;
        return this;
    }

    /**
     * Get the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype chain
     * ID.
     *
     * @param correlationId the correlationId value to set.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
}
