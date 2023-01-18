// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationInner;
import com.azure.resourcemanager.managedapplications.models.Application;
import com.azure.resourcemanager.managedapplications.models.ApplicationPatchable;
import com.azure.resourcemanager.managedapplications.models.Identity;
import com.azure.resourcemanager.managedapplications.models.Plan;
import com.azure.resourcemanager.managedapplications.models.PlanPatchable;
import com.azure.resourcemanager.managedapplications.models.ProvisioningState;
import com.azure.resourcemanager.managedapplications.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class ApplicationImpl implements Application, Application.Definition, Application.Update {
    private ApplicationInner innerObject;

    private final com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String managedResourceGroupId() {
        return this.innerModel().managedResourceGroupId();
    }

    public String applicationDefinitionId() {
        return this.innerModel().applicationDefinitionId();
    }

    public Object parameters() {
        return this.innerModel().parameters();
    }

    public Object outputs() {
        return this.innerModel().outputs();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ApplicationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managedapplications.ApplicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String applicationName;

    private ApplicationPatchable updateParameters;

    public ApplicationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Application create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdate(resourceGroupName, applicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Application create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdate(resourceGroupName, applicationName, this.innerModel(), context);
        return this;
    }

    ApplicationImpl(String name, com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager) {
        this.innerObject = new ApplicationInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public ApplicationImpl update() {
        this.updateParameters = new ApplicationPatchable();
        return this;
    }

    public Application apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(resourceGroupName, applicationName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Application apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(resourceGroupName, applicationName, updateParameters, context)
                .getValue();
        return this;
    }

    ApplicationImpl(
        ApplicationInner innerObject, com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.applicationName = Utils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public Application refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getByResourceGroupWithResponse(resourceGroupName, applicationName, Context.NONE)
                .getValue();
        return this;
    }

    public Application refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getByResourceGroupWithResponse(resourceGroupName, applicationName, context)
                .getValue();
        return this;
    }

    public ApplicationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateParameters.withKind(kind);
            return this;
        }
    }

    public ApplicationImpl withManagedResourceGroupId(String managedResourceGroupId) {
        if (isInCreateMode()) {
            this.innerModel().withManagedResourceGroupId(managedResourceGroupId);
            return this;
        } else {
            this.updateParameters.withManagedResourceGroupId(managedResourceGroupId);
            return this;
        }
    }

    public ApplicationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ApplicationImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.innerModel().withManagedBy(managedBy);
            return this;
        } else {
            this.updateParameters.withManagedBy(managedBy);
            return this;
        }
    }

    public ApplicationImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ApplicationImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ApplicationImpl withPlan(Plan plan) {
        this.innerModel().withPlan(plan);
        return this;
    }

    public ApplicationImpl withApplicationDefinitionId(String applicationDefinitionId) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationDefinitionId(applicationDefinitionId);
            return this;
        } else {
            this.updateParameters.withApplicationDefinitionId(applicationDefinitionId);
            return this;
        }
    }

    public ApplicationImpl withParameters(Object parameters) {
        if (isInCreateMode()) {
            this.innerModel().withParameters(parameters);
            return this;
        } else {
            this.updateParameters.withParameters(parameters);
            return this;
        }
    }

    public ApplicationImpl withPlan(PlanPatchable plan) {
        this.updateParameters.withPlan(plan);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
