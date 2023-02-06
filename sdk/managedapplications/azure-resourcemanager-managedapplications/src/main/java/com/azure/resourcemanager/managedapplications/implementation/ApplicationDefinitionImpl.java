// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionInner;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifact;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinition;
import com.azure.resourcemanager.managedapplications.models.ApplicationLockLevel;
import com.azure.resourcemanager.managedapplications.models.ApplicationProviderAuthorization;
import com.azure.resourcemanager.managedapplications.models.Identity;
import com.azure.resourcemanager.managedapplications.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationDefinitionImpl
    implements ApplicationDefinition, ApplicationDefinition.Definition, ApplicationDefinition.Update {
    private ApplicationDefinitionInner innerObject;

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

    public ApplicationLockLevel lockLevel() {
        return this.innerModel().lockLevel();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String isEnabled() {
        return this.innerModel().isEnabled();
    }

    public List<ApplicationProviderAuthorization> authorizations() {
        List<ApplicationProviderAuthorization> inner = this.innerModel().authorizations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationArtifact> artifacts() {
        List<ApplicationArtifact> inner = this.innerModel().artifacts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public String packageFileUri() {
        return this.innerModel().packageFileUri();
    }

    public Object mainTemplate() {
        return this.innerModel().mainTemplate();
    }

    public Object createUiDefinition() {
        return this.innerModel().createUiDefinition();
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

    public ApplicationDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managedapplications.ApplicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String applicationDefinitionName;

    public ApplicationDefinitionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ApplicationDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .createOrUpdate(resourceGroupName, applicationDefinitionName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .createOrUpdate(resourceGroupName, applicationDefinitionName, this.innerModel(), context);
        return this;
    }

    ApplicationDefinitionImpl(
        String name, com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager) {
        this.innerObject = new ApplicationDefinitionInner();
        this.serviceManager = serviceManager;
        this.applicationDefinitionName = name;
    }

    public ApplicationDefinitionImpl update() {
        return this;
    }

    public ApplicationDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .createOrUpdate(resourceGroupName, applicationDefinitionName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .createOrUpdate(resourceGroupName, applicationDefinitionName, this.innerModel(), context);
        return this;
    }

    ApplicationDefinitionImpl(
        ApplicationDefinitionInner innerObject,
        com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.applicationDefinitionName = Utils.getValueFromIdByName(innerObject.id(), "applicationDefinitions");
    }

    public ApplicationDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .getByResourceGroupWithResponse(resourceGroupName, applicationDefinitionName, Context.NONE)
                .getValue();
        return this;
    }

    public ApplicationDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationDefinitions()
                .getByResourceGroupWithResponse(resourceGroupName, applicationDefinitionName, context)
                .getValue();
        return this;
    }

    public ApplicationDefinitionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationDefinitionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationDefinitionImpl withLockLevel(ApplicationLockLevel lockLevel) {
        this.innerModel().withLockLevel(lockLevel);
        return this;
    }

    public ApplicationDefinitionImpl withAuthorizations(List<ApplicationProviderAuthorization> authorizations) {
        this.innerModel().withAuthorizations(authorizations);
        return this;
    }

    public ApplicationDefinitionImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ApplicationDefinitionImpl withManagedBy(String managedBy) {
        this.innerModel().withManagedBy(managedBy);
        return this;
    }

    public ApplicationDefinitionImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ApplicationDefinitionImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ApplicationDefinitionImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public ApplicationDefinitionImpl withIsEnabled(String isEnabled) {
        this.innerModel().withIsEnabled(isEnabled);
        return this;
    }

    public ApplicationDefinitionImpl withArtifacts(List<ApplicationArtifact> artifacts) {
        this.innerModel().withArtifacts(artifacts);
        return this;
    }

    public ApplicationDefinitionImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ApplicationDefinitionImpl withPackageFileUri(String packageFileUri) {
        this.innerModel().withPackageFileUri(packageFileUri);
        return this;
    }

    public ApplicationDefinitionImpl withMainTemplate(Object mainTemplate) {
        this.innerModel().withMainTemplate(mainTemplate);
        return this;
    }

    public ApplicationDefinitionImpl withCreateUiDefinition(Object createUiDefinition) {
        this.innerModel().withCreateUiDefinition(createUiDefinition);
        return this;
    }
}
