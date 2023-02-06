// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Preferences related to the order. */
@Fluent
public final class Preferences {
    /*
     * Preferred data center region.
     */
    @JsonProperty(value = "preferredDataCenterRegion")
    private List<String> preferredDataCenterRegion;

    /*
     * Preferences related to the shipment logistics of the sku.
     */
    @JsonProperty(value = "transportPreferences")
    private TransportPreferences transportPreferences;

    /*
     * Preferences related to the Encryption.
     */
    @JsonProperty(value = "encryptionPreferences")
    private EncryptionPreferences encryptionPreferences;

    /** Creates an instance of Preferences class. */
    public Preferences() {
    }

    /**
     * Get the preferredDataCenterRegion property: Preferred data center region.
     *
     * @return the preferredDataCenterRegion value.
     */
    public List<String> preferredDataCenterRegion() {
        return this.preferredDataCenterRegion;
    }

    /**
     * Set the preferredDataCenterRegion property: Preferred data center region.
     *
     * @param preferredDataCenterRegion the preferredDataCenterRegion value to set.
     * @return the Preferences object itself.
     */
    public Preferences withPreferredDataCenterRegion(List<String> preferredDataCenterRegion) {
        this.preferredDataCenterRegion = preferredDataCenterRegion;
        return this;
    }

    /**
     * Get the transportPreferences property: Preferences related to the shipment logistics of the sku.
     *
     * @return the transportPreferences value.
     */
    public TransportPreferences transportPreferences() {
        return this.transportPreferences;
    }

    /**
     * Set the transportPreferences property: Preferences related to the shipment logistics of the sku.
     *
     * @param transportPreferences the transportPreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withTransportPreferences(TransportPreferences transportPreferences) {
        this.transportPreferences = transportPreferences;
        return this;
    }

    /**
     * Get the encryptionPreferences property: Preferences related to the Encryption.
     *
     * @return the encryptionPreferences value.
     */
    public EncryptionPreferences encryptionPreferences() {
        return this.encryptionPreferences;
    }

    /**
     * Set the encryptionPreferences property: Preferences related to the Encryption.
     *
     * @param encryptionPreferences the encryptionPreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withEncryptionPreferences(EncryptionPreferences encryptionPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transportPreferences() != null) {
            transportPreferences().validate();
        }
        if (encryptionPreferences() != null) {
            encryptionPreferences().validate();
        }
    }
}
