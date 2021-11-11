// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.synapse.fluent.models.KustoPoolInner;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.FollowerDatabaseDefinition;
import com.azure.resourcemanager.synapse.models.KustoPool;
import com.azure.resourcemanager.synapse.models.KustoPoolUpdate;
import com.azure.resourcemanager.synapse.models.LanguageExtension;
import com.azure.resourcemanager.synapse.models.LanguageExtensionsList;
import com.azure.resourcemanager.synapse.models.OptimizedAutoscale;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.State;
import java.util.Collections;
import java.util.Map;

public final class KustoPoolImpl implements KustoPool, KustoPool.Definition, KustoPool.Update {
    private KustoPoolInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

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

    public AzureSku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public State state() {
        return this.innerModel().state();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String dataIngestionUri() {
        return this.innerModel().dataIngestionUri();
    }

    public String stateReason() {
        return this.innerModel().stateReason();
    }

    public OptimizedAutoscale optimizedAutoscale() {
        return this.innerModel().optimizedAutoscale();
    }

    public Boolean enableStreamingIngest() {
        return this.innerModel().enableStreamingIngest();
    }

    public Boolean enablePurge() {
        return this.innerModel().enablePurge();
    }

    public LanguageExtensionsList languageExtensions() {
        return this.innerModel().languageExtensions();
    }

    public String workspaceUid() {
        return this.innerModel().workspaceUid();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public KustoPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String workspaceName;

    private String resourceGroupName;

    private String kustoPoolName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private KustoPoolUpdate updateParameters;

    public KustoPoolImpl withExistingWorkspace(String workspaceName, String resourceGroupName) {
        this.workspaceName = workspaceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public KustoPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .createOrUpdate(
                    workspaceName,
                    resourceGroupName,
                    kustoPoolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE);
        return this;
    }

    public KustoPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .createOrUpdate(
                    workspaceName,
                    resourceGroupName,
                    kustoPoolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context);
        return this;
    }

    KustoPoolImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new KustoPoolInner();
        this.serviceManager = serviceManager;
        this.kustoPoolName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public KustoPoolImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new KustoPoolUpdate();
        return this;
    }

    public KustoPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .update(workspaceName, resourceGroupName, kustoPoolName, updateParameters, updateIfMatch, Context.NONE);
        return this;
    }

    public KustoPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .update(workspaceName, resourceGroupName, kustoPoolName, updateParameters, updateIfMatch, context);
        return this;
    }

    KustoPoolImpl(KustoPoolInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.kustoPoolName = Utils.getValueFromIdByName(innerObject.id(), "kustoPools");
    }

    public KustoPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .getWithResponse(workspaceName, kustoPoolName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public KustoPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .getWithResponse(workspaceName, kustoPoolName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public void stop() {
        serviceManager.kustoPools().stop(workspaceName, kustoPoolName, resourceGroupName);
    }

    public void stop(Context context) {
        serviceManager.kustoPools().stop(workspaceName, kustoPoolName, resourceGroupName, context);
    }

    public void start() {
        serviceManager.kustoPools().start(workspaceName, kustoPoolName, resourceGroupName);
    }

    public void start(Context context) {
        serviceManager.kustoPools().start(workspaceName, kustoPoolName, resourceGroupName, context);
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions() {
        return serviceManager.kustoPools().listLanguageExtensions(workspaceName, kustoPoolName, resourceGroupName);
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions(Context context) {
        return serviceManager
            .kustoPools()
            .listLanguageExtensions(workspaceName, kustoPoolName, resourceGroupName, context);
    }

    public void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd) {
        serviceManager
            .kustoPools()
            .addLanguageExtensions(workspaceName, kustoPoolName, resourceGroupName, languageExtensionsToAdd);
    }

    public void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd, Context context) {
        serviceManager
            .kustoPools()
            .addLanguageExtensions(workspaceName, kustoPoolName, resourceGroupName, languageExtensionsToAdd, context);
    }

    public void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove) {
        serviceManager
            .kustoPools()
            .removeLanguageExtensions(workspaceName, kustoPoolName, resourceGroupName, languageExtensionsToRemove);
    }

    public void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove, Context context) {
        serviceManager
            .kustoPools()
            .removeLanguageExtensions(
                workspaceName, kustoPoolName, resourceGroupName, languageExtensionsToRemove, context);
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases() {
        return serviceManager.kustoPools().listFollowerDatabases(workspaceName, kustoPoolName, resourceGroupName);
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(Context context) {
        return serviceManager
            .kustoPools()
            .listFollowerDatabases(workspaceName, kustoPoolName, resourceGroupName, context);
    }

    public void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove) {
        serviceManager
            .kustoPools()
            .detachFollowerDatabases(workspaceName, kustoPoolName, resourceGroupName, followerDatabaseToRemove);
    }

    public void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove, Context context) {
        serviceManager
            .kustoPools()
            .detachFollowerDatabases(
                workspaceName, kustoPoolName, resourceGroupName, followerDatabaseToRemove, context);
    }

    public KustoPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public KustoPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public KustoPoolImpl withSku(AzureSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public KustoPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public KustoPoolImpl withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale) {
        if (isInCreateMode()) {
            this.innerModel().withOptimizedAutoscale(optimizedAutoscale);
            return this;
        } else {
            this.updateParameters.withOptimizedAutoscale(optimizedAutoscale);
            return this;
        }
    }

    public KustoPoolImpl withEnableStreamingIngest(Boolean enableStreamingIngest) {
        if (isInCreateMode()) {
            this.innerModel().withEnableStreamingIngest(enableStreamingIngest);
            return this;
        } else {
            this.updateParameters.withEnableStreamingIngest(enableStreamingIngest);
            return this;
        }
    }

    public KustoPoolImpl withEnablePurge(Boolean enablePurge) {
        if (isInCreateMode()) {
            this.innerModel().withEnablePurge(enablePurge);
            return this;
        } else {
            this.updateParameters.withEnablePurge(enablePurge);
            return this;
        }
    }

    public KustoPoolImpl withWorkspaceUid(String workspaceUid) {
        if (isInCreateMode()) {
            this.innerModel().withWorkspaceUid(workspaceUid);
            return this;
        } else {
            this.updateParameters.withWorkspaceUid(workspaceUid);
            return this;
        }
    }

    public KustoPoolImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public KustoPoolImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
