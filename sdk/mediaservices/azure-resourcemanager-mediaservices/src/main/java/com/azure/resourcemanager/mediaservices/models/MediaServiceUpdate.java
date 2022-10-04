// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.fluent.models.MediaServiceProperties;
import com.azure.resourcemanager.mediaservices.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** A Media Services account update. */
@Fluent
public final class MediaServiceUpdate {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private MediaServiceProperties innerProperties;

    /*
     * The Managed Identity for the Media Services account.
     */
    @JsonProperty(value = "identity")
    private MediaServiceIdentity identity;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The resource properties.
     *
     * @return the innerProperties value.
     */
    private MediaServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The Managed Identity for the Media Services account.
     *
     * @return the identity value.
     */
    public MediaServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Managed Identity for the Media Services account.
     *
     * @param identity the identity value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withIdentity(MediaServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the mediaServiceId property: The Media Services account ID.
     *
     * @return the mediaServiceId value.
     */
    public UUID mediaServiceId() {
        return this.innerProperties() == null ? null : this.innerProperties().mediaServiceId();
    }

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccounts();
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withStorageAccounts(List<StorageAccount> storageAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaServiceProperties();
        }
        this.innerProperties().withStorageAccounts(storageAccounts);
        return this;
    }

    /**
     * Get the storageAuthentication property: The storageAuthentication property.
     *
     * @return the storageAuthentication value.
     */
    public StorageAuthentication storageAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAuthentication();
    }

    /**
     * Set the storageAuthentication property: The storageAuthentication property.
     *
     * @param storageAuthentication the storageAuthentication value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withStorageAuthentication(StorageAuthentication storageAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaServiceProperties();
        }
        this.innerProperties().withStorageAuthentication(storageAuthentication);
        return this;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withEncryption(AccountEncryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaServiceProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @return the keyDelivery value.
     */
    public KeyDelivery keyDelivery() {
        return this.innerProperties() == null ? null : this.innerProperties().keyDelivery();
    }

    /**
     * Set the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @param keyDelivery the keyDelivery value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withKeyDelivery(KeyDelivery keyDelivery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaServiceProperties();
        }
        this.innerProperties().withKeyDelivery(keyDelivery);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Media Services account.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Media Services account.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the MediaServiceUpdate object itself.
     */
    public MediaServiceUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaServiceProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Media Services account.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpointConnections property: The Private Endpoint Connections created for the Media Service
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
