// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.callingserver.implementation.models.ResultInformation;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CallTransferAcceptedEvent model. */
@Fluent
public final class CallTransferAcceptedEvent extends CallingServerEventBase {
    /*
     * Operation context
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The resultInfo property.
     */
    @JsonProperty(value = "resultInfo")
    private ResultInformation resultInfo;

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
     * Get the operationContext property: Operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the resultInfo property: The resultInfo property.
     *
     * @return the resultInfo value.
     */
    public ResultInformation getResultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: The resultInfo property.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setResultInfo(ResultInformation resultInfo) {
        this.resultInfo = resultInfo;
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
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setType(AcsEventType type) {
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
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setCallConnectionId(String callConnectionId) {
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
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setServerCallId(String serverCallId) {
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
     * @return the CallTransferAcceptedEvent object itself.
     */
    public CallTransferAcceptedEvent setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
}
