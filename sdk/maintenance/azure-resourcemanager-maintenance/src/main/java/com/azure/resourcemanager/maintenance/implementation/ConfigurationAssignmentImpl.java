// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;

public final class ConfigurationAssignmentImpl implements ConfigurationAssignment {
    private ConfigurationAssignmentInner innerObject;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    ConfigurationAssignmentImpl(
        ConfigurationAssignmentInner innerObject,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String maintenanceConfigurationId() {
        return this.innerModel().maintenanceConfigurationId();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public ConfigurationAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }
}
