// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Job details for update. */
@Fluent
public final class UpdateJobDetails {
    /*
     * Contact details for notification and shipping.
     */
    @JsonProperty(value = "contactDetails")
    private ContactDetails contactDetails;

    /*
     * Shipping address of the customer.
     */
    @JsonProperty(value = "shippingAddress")
    private ShippingAddress shippingAddress;

    /*
     * Key encryption key for the job.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyEncryptionKey keyEncryptionKey;

    /** Creates an instance of UpdateJobDetails class. */
    public UpdateJobDetails() {
    }

    /**
     * Get the contactDetails property: Contact details for notification and shipping.
     *
     * @return the contactDetails value.
     */
    public ContactDetails contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set the contactDetails property: Contact details for notification and shipping.
     *
     * @param contactDetails the contactDetails value to set.
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get the shippingAddress property: Shipping address of the customer.
     *
     * @return the shippingAddress value.
     */
    public ShippingAddress shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set the shippingAddress property: Shipping address of the customer.
     *
     * @param shippingAddress the shippingAddress value to set.
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get the keyEncryptionKey property: Key encryption key for the job.
     *
     * @return the keyEncryptionKey value.
     */
    public KeyEncryptionKey keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey property: Key encryption key for the job.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set.
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withKeyEncryptionKey(KeyEncryptionKey keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactDetails() != null) {
            contactDetails().validate();
        }
        if (shippingAddress() != null) {
            shippingAddress().validate();
        }
        if (keyEncryptionKey() != null) {
            keyEncryptionKey().validate();
        }
    }
}
