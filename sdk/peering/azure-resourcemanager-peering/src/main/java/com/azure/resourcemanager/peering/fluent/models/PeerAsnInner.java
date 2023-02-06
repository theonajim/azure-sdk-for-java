// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.peering.models.ContactDetail;
import com.azure.resourcemanager.peering.models.ValidationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The essential information related to the peer's ASN. */
@Fluent
public final class PeerAsnInner extends ProxyResource {
    /*
     * The properties that define a peer's ASN.
     */
    @JsonProperty(value = "properties")
    private PeerAsnProperties innerProperties;

    /** Creates an instance of PeerAsnInner class. */
    public PeerAsnInner() {
    }

    /**
     * Get the innerProperties property: The properties that define a peer's ASN.
     *
     * @return the innerProperties value.
     */
    private PeerAsnProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the peerAsn property: The Autonomous System Number (ASN) of the peer.
     *
     * @return the peerAsn value.
     */
    public Integer peerAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().peerAsn();
    }

    /**
     * Set the peerAsn property: The Autonomous System Number (ASN) of the peer.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the PeerAsnInner object itself.
     */
    public PeerAsnInner withPeerAsn(Integer peerAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerAsnProperties();
        }
        this.innerProperties().withPeerAsn(peerAsn);
        return this;
    }

    /**
     * Get the peerContactDetail property: The contact details of the peer.
     *
     * @return the peerContactDetail value.
     */
    public List<ContactDetail> peerContactDetail() {
        return this.innerProperties() == null ? null : this.innerProperties().peerContactDetail();
    }

    /**
     * Set the peerContactDetail property: The contact details of the peer.
     *
     * @param peerContactDetail the peerContactDetail value to set.
     * @return the PeerAsnInner object itself.
     */
    public PeerAsnInner withPeerContactDetail(List<ContactDetail> peerContactDetail) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerAsnProperties();
        }
        this.innerProperties().withPeerContactDetail(peerContactDetail);
        return this;
    }

    /**
     * Get the peerName property: The name of the peer.
     *
     * @return the peerName value.
     */
    public String peerName() {
        return this.innerProperties() == null ? null : this.innerProperties().peerName();
    }

    /**
     * Set the peerName property: The name of the peer.
     *
     * @param peerName the peerName value to set.
     * @return the PeerAsnInner object itself.
     */
    public PeerAsnInner withPeerName(String peerName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerAsnProperties();
        }
        this.innerProperties().withPeerName(peerName);
        return this;
    }

    /**
     * Get the validationState property: The validation state of the ASN associated with the peer.
     *
     * @return the validationState value.
     */
    public ValidationState validationState() {
        return this.innerProperties() == null ? null : this.innerProperties().validationState();
    }

    /**
     * Set the validationState property: The validation state of the ASN associated with the peer.
     *
     * @param validationState the validationState value to set.
     * @return the PeerAsnInner object itself.
     */
    public PeerAsnInner withValidationState(ValidationState validationState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PeerAsnProperties();
        }
        this.innerProperties().withValidationState(validationState);
        return this;
    }

    /**
     * Get the errorMessage property: The error message for the validation state.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
