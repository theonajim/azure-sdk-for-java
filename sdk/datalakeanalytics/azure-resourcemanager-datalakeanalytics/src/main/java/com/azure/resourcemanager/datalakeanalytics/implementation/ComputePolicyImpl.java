// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.ComputePolicyInner;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import com.azure.resourcemanager.datalakeanalytics.models.ComputePolicy;
import com.azure.resourcemanager.datalakeanalytics.models.CreateOrUpdateComputePolicyParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateComputePolicyParameters;
import java.util.UUID;

public final class ComputePolicyImpl implements ComputePolicy, ComputePolicy.Definition, ComputePolicy.Update {
    private ComputePolicyInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public UUID objectId() {
        return this.innerModel().objectId();
    }

    public AadObjectType objectType() {
        return this.innerModel().objectType();
    }

    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerModel().maxDegreeOfParallelismPerJob();
    }

    public Integer minPriorityPerJob() {
        return this.innerModel().minPriorityPerJob();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ComputePolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String computePolicyName;

    private CreateOrUpdateComputePolicyParameters createParameters;

    private UpdateComputePolicyParameters updateParameters;

    public ComputePolicyImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public ComputePolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, computePolicyName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ComputePolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, computePolicyName, createParameters, context)
                .getValue();
        return this;
    }

    ComputePolicyImpl(
        String name, com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = new ComputePolicyInner();
        this.serviceManager = serviceManager;
        this.computePolicyName = name;
        this.createParameters = new CreateOrUpdateComputePolicyParameters();
    }

    public ComputePolicyImpl update() {
        this.updateParameters = new UpdateComputePolicyParameters();
        return this;
    }

    public ComputePolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .updateWithResponse(resourceGroupName, accountName, computePolicyName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ComputePolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .updateWithResponse(resourceGroupName, accountName, computePolicyName, updateParameters, context)
                .getValue();
        return this;
    }

    ComputePolicyImpl(
        ComputePolicyInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.computePolicyName = Utils.getValueFromIdByName(innerObject.id(), "computePolicies");
    }

    public ComputePolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .getWithResponse(resourceGroupName, accountName, computePolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public ComputePolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getComputePolicies()
                .getWithResponse(resourceGroupName, accountName, computePolicyName, context)
                .getValue();
        return this;
    }

    public ComputePolicyImpl withObjectId(UUID objectId) {
        if (isInCreateMode()) {
            this.createParameters.withObjectId(objectId);
            return this;
        } else {
            this.updateParameters.withObjectId(objectId);
            return this;
        }
    }

    public ComputePolicyImpl withObjectType(AadObjectType objectType) {
        if (isInCreateMode()) {
            this.createParameters.withObjectType(objectType);
            return this;
        } else {
            this.updateParameters.withObjectType(objectType);
            return this;
        }
    }

    public ComputePolicyImpl withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (isInCreateMode()) {
            this.createParameters.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
            return this;
        } else {
            this.updateParameters.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
            return this;
        }
    }

    public ComputePolicyImpl withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (isInCreateMode()) {
            this.createParameters.withMinPriorityPerJob(minPriorityPerJob);
            return this;
        } else {
            this.updateParameters.withMinPriorityPerJob(minPriorityPerJob);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
