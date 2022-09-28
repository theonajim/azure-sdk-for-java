// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Magento server linked service properties. */
@Fluent
public final class MagentoLinkedServiceTypeProperties {
    /*
     * The URL of the Magento instance. (i.e. 192.168.222.110/magento3)
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The access token from Magento.
     */
    @JsonProperty(value = "accessToken")
    private SecretBase accessToken;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     *
     * @param host the host value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the accessToken property: The access token from Magento.
     *
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The access token from Magento.
     *
     * @param accessToken the accessToken value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the MagentoLinkedServiceTypeProperties object itself.
     */
    public MagentoLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model MagentoLinkedServiceTypeProperties"));
        }
        if (accessToken() != null) {
            accessToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MagentoLinkedServiceTypeProperties.class);
}
