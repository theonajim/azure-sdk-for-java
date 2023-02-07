// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.


package com.azure.communication.callautomation.models;

import java.util.Map;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.MicrosoftTeamsUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;

/**
 *  Call invitee details.
 */
public class CallInvite {
    private final CommunicationIdentifier target;
    private final PhoneNumberIdentifier sourceCallIdNumber;
    private String sourceDisplayName;
    private final Map<String, String> sipHeaders;
    private final Map<String, String> voipHeaders;
    
    /**
     *  Create a CallInvite object with PhoneNumberIdentifierr 
     * @param targetPhoneNumberIdentity Target's PhoneNumberIdentifier
     * @param callerIdNumber Caller's phone number identifier
     */
    public CallInvite(PhoneNumberIdentifier targetPhoneNumberIdentity, PhoneNumberIdentifier callerIdNumber) {
        target = targetPhoneNumberIdentity;
        sourceCallIdNumber = callerIdNumber;
        sipHeaders = null;
        voipHeaders = null;
    }
    
    /**
     *  Create a CallInvite object with PhoneNumberIdentifierr 
     * @param targetPhoneNumberIdentity Target's PhoneNumberIdentifier
     * @param callerIdNumber Caller's phone number identifier
     * @param sipHeaders custom context for pstn
     */
    public CallInvite(PhoneNumberIdentifier targetPhoneNumberIdentity, PhoneNumberIdentifier callerIdNumber, Map<String, String> sipHeaders) {
        target = targetPhoneNumberIdentity;
        sourceCallIdNumber = callerIdNumber;
        this.sipHeaders = sipHeaders;
        voipHeaders = null;
    }
    
    /**
     * Create a CallInvite object with CommunicationUserIdentifier
     * @param targetIdentity Target's CommunicationUserIdentifier
     */
    public CallInvite(CommunicationUserIdentifier targetIdentity) {
        target = targetIdentity;
        sourceCallIdNumber = null;
        sipHeaders = null;
        voipHeaders = null;
    }
    
    /**
     * Create a CallInvite object with CommunicationUserIdentifier
     * @param targetIdentity Target's CommunicationUserIdentifier
     * @param voipHeaders custom context for voip 
     */
    public CallInvite(CommunicationUserIdentifier targetIdentity, Map<String, String> voipHeaders) {
        target = targetIdentity;
        sourceCallIdNumber = null;
        sipHeaders = null;
        this.voipHeaders = voipHeaders;
    }
    
    /**
     * Create a CallInvite object with MicrosoftTeamsUserIdentifier
     * @param targetIdentity Target's MicrosoftTeamsUserIdentifier
     */
    public CallInvite(MicrosoftTeamsUserIdentifier targetIdentity) {
        target = targetIdentity;
        sourceCallIdNumber = null;
        sipHeaders = null;
        voipHeaders = null;
    }
    
    /**
     * Create a CallInvite object with MicrosoftTeamsUserIdentifier
     * @param targetIdentity Target's MicrosoftTeamsUserIdentifier
     * @param voipHeaders custom context for voip 
     */
    public CallInvite(MicrosoftTeamsUserIdentifier targetIdentity, Map<String, String> voipHeaders) {
        target = targetIdentity;
        sourceCallIdNumber = null;
        sipHeaders = null;
        this.voipHeaders = voipHeaders;
    }

    /**
     * Get target's CommunicationIdentifier
     * @return target's CommunicationIdentifier
     */
    public CommunicationIdentifier getTarget() {
        return target;
    }
    
    /**
     * get caller's display name
     * @return display name for caller 
     */
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }
    
    /**
     * set display name for caller
     * @param sourceDisplayName display name for caller
     * @return the CallInvite object itself
     */
    public CallInvite setSourceDisplayName(String sourceDisplayName) {
        this.sourceDisplayName = sourceDisplayName;
        return this;
    }
    
    /** 
     *  get list of custom context to pstn target
     * @return list of custom context to pstn target
     */
    public Map<String, String> getSipHeaders() {
        return sipHeaders;
    }
    
    /** 
     *  get list of custom context to voip target
     * @return list of custom context to voip target
     */
    public Map<String, String> getVoipHeaders() {
        return voipHeaders;
    }
    
    /**
     * get PhoneNumberIdentifier for caller
     * @return PhoneNumberIdentifierr for caller 
     */
    public PhoneNumberIdentifier getSourceCallIdNumber() {
        return sourceCallIdNumber;
    }
    
    
}
