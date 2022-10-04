// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.implementation;

import com.azure.resourcemanager.orbital.fluent.models.AvailableContactsInner;
import com.azure.resourcemanager.orbital.models.AvailableContacts;
import com.azure.resourcemanager.orbital.models.AvailableContactsSpacecraft;

public final class AvailableContactsImpl implements AvailableContacts {
    private AvailableContactsInner innerObject;

    private final com.azure.resourcemanager.orbital.OrbitalManager serviceManager;

    AvailableContactsImpl(
        AvailableContactsInner innerObject, com.azure.resourcemanager.orbital.OrbitalManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public AvailableContactsSpacecraft spacecraft() {
        return this.innerModel().spacecraft();
    }

    public String groundStationName() {
        return this.innerModel().groundStationName();
    }

    public AvailableContactsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.orbital.OrbitalManager manager() {
        return this.serviceManager;
    }
}
