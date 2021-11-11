// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.models.WnsCredentialProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a NotificationHub WnsCredential. */
@Fluent
public final class WnsCredential {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WnsCredential.class);

    /*
     * Properties of NotificationHub WnsCredential.
     */
    @JsonProperty(value = "properties")
    private WnsCredentialProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of NotificationHub WnsCredential.
     *
     * @return the innerProperties value.
     */
    private WnsCredentialProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the packageSid property: The package ID for this credential.
     *
     * @return the packageSid value.
     */
    public String packageSid() {
        return this.innerProperties() == null ? null : this.innerProperties().packageSid();
    }

    /**
     * Set the packageSid property: The package ID for this credential.
     *
     * @param packageSid the packageSid value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withPackageSid(String packageSid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WnsCredentialProperties();
        }
        this.innerProperties().withPackageSid(packageSid);
        return this;
    }

    /**
     * Get the secretKey property: The secret key.
     *
     * @return the secretKey value.
     */
    public String secretKey() {
        return this.innerProperties() == null ? null : this.innerProperties().secretKey();
    }

    /**
     * Set the secretKey property: The secret key.
     *
     * @param secretKey the secretKey value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withSecretKey(String secretKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WnsCredentialProperties();
        }
        this.innerProperties().withSecretKey(secretKey);
        return this;
    }

    /**
     * Get the windowsLiveEndpoint property: The Windows Live endpoint.
     *
     * @return the windowsLiveEndpoint value.
     */
    public String windowsLiveEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().windowsLiveEndpoint();
    }

    /**
     * Set the windowsLiveEndpoint property: The Windows Live endpoint.
     *
     * @param windowsLiveEndpoint the windowsLiveEndpoint value to set.
     * @return the WnsCredential object itself.
     */
    public WnsCredential withWindowsLiveEndpoint(String windowsLiveEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WnsCredentialProperties();
        }
        this.innerProperties().withWindowsLiveEndpoint(windowsLiveEndpoint);
        return this;
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
