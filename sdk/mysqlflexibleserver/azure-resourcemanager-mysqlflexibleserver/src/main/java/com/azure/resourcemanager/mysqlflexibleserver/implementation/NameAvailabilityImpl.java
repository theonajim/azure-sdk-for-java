// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    NameAvailabilityImpl(
        NameAvailabilityInner innerObject, com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String message() {
        return this.innerModel().message();
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
