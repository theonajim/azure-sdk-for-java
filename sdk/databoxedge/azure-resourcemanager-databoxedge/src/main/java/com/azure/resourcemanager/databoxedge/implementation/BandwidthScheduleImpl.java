// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.BandwidthScheduleInner;
import com.azure.resourcemanager.databoxedge.models.BandwidthSchedule;
import com.azure.resourcemanager.databoxedge.models.DayOfWeek;
import java.util.Collections;
import java.util.List;

public final class BandwidthScheduleImpl
    implements BandwidthSchedule, BandwidthSchedule.Definition, BandwidthSchedule.Update {
    private BandwidthScheduleInner innerObject;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String start() {
        return this.innerModel().start();
    }

    public String stop() {
        return this.innerModel().stop();
    }

    public int rateInMbps() {
        return this.innerModel().rateInMbps();
    }

    public List<DayOfWeek> days() {
        List<DayOfWeek> inner = this.innerModel().days();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BandwidthScheduleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String name;

    private String resourceGroupName;

    public BandwidthScheduleImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public BandwidthSchedule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public BandwidthSchedule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    BandwidthScheduleImpl(String name, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = new BandwidthScheduleInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public BandwidthScheduleImpl update() {
        return this;
    }

    public BandwidthSchedule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public BandwidthSchedule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    BandwidthScheduleImpl(
        BandwidthScheduleInner innerObject, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "bandwidthSchedules");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public BandwidthSchedule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .getWithResponse(deviceName, name, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public BandwidthSchedule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBandwidthSchedules()
                .getWithResponse(deviceName, name, resourceGroupName, context)
                .getValue();
        return this;
    }

    public BandwidthScheduleImpl withStart(String start) {
        this.innerModel().withStart(start);
        return this;
    }

    public BandwidthScheduleImpl withStop(String stop) {
        this.innerModel().withStop(stop);
        return this;
    }

    public BandwidthScheduleImpl withRateInMbps(int rateInMbps) {
        this.innerModel().withRateInMbps(rateInMbps);
        return this;
    }

    public BandwidthScheduleImpl withDays(List<DayOfWeek> days) {
        this.innerModel().withDays(days);
        return this;
    }
}
