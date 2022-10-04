// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner;
import com.azure.resourcemanager.security.models.AdditionalWorkspacesProperties;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import com.azure.resourcemanager.security.models.UpdateIotSecuritySolutionData;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IoTSecuritySolutionModelImpl
    implements IoTSecuritySolutionModel, IoTSecuritySolutionModel.Definition, IoTSecuritySolutionModel.Update {
    private IoTSecuritySolutionModelInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String workspace() {
        return this.innerModel().workspace();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public SecuritySolutionStatus status() {
        return this.innerModel().status();
    }

    public List<ExportData> export() {
        List<ExportData> inner = this.innerModel().export();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DataSource> disabledDataSources() {
        List<DataSource> inner = this.innerModel().disabledDataSources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> iotHubs() {
        List<String> inner = this.innerModel().iotHubs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UserDefinedResourcesProperties userDefinedResources() {
        return this.innerModel().userDefinedResources();
    }

    public List<String> autoDiscoveredResources() {
        List<String> inner = this.innerModel().autoDiscoveredResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RecommendationConfigurationProperties> recommendationsConfiguration() {
        List<RecommendationConfigurationProperties> inner = this.innerModel().recommendationsConfiguration();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UnmaskedIpLoggingStatus unmaskedIpLoggingStatus() {
        return this.innerModel().unmaskedIpLoggingStatus();
    }

    public List<AdditionalWorkspacesProperties> additionalWorkspaces() {
        List<AdditionalWorkspacesProperties> inner = this.innerModel().additionalWorkspaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public IoTSecuritySolutionModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String solutionName;

    private UpdateIotSecuritySolutionData updateUpdateIotSecuritySolutionData;

    public IoTSecuritySolutionModelImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IoTSecuritySolutionModel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .createOrUpdateWithResponse(resourceGroupName, solutionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IoTSecuritySolutionModel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .createOrUpdateWithResponse(resourceGroupName, solutionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IoTSecuritySolutionModelImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new IoTSecuritySolutionModelInner();
        this.serviceManager = serviceManager;
        this.solutionName = name;
    }

    public IoTSecuritySolutionModelImpl update() {
        this.updateUpdateIotSecuritySolutionData = new UpdateIotSecuritySolutionData();
        return this;
    }

    public IoTSecuritySolutionModel apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .updateWithResponse(resourceGroupName, solutionName, updateUpdateIotSecuritySolutionData, Context.NONE)
                .getValue();
        return this;
    }

    public IoTSecuritySolutionModel apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .updateWithResponse(resourceGroupName, solutionName, updateUpdateIotSecuritySolutionData, context)
                .getValue();
        return this;
    }

    IoTSecuritySolutionModelImpl(
        IoTSecuritySolutionModelInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.solutionName = Utils.getValueFromIdByName(innerObject.id(), "iotSecuritySolutions");
    }

    public IoTSecuritySolutionModel refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .getByResourceGroupWithResponse(resourceGroupName, solutionName, Context.NONE)
                .getValue();
        return this;
    }

    public IoTSecuritySolutionModel refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIotSecuritySolutions()
                .getByResourceGroupWithResponse(resourceGroupName, solutionName, context)
                .getValue();
        return this;
    }

    public IoTSecuritySolutionModelImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IoTSecuritySolutionModelImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IoTSecuritySolutionModelImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateUpdateIotSecuritySolutionData.withTags(tags);
            return this;
        }
    }

    public IoTSecuritySolutionModelImpl withWorkspace(String workspace) {
        this.innerModel().withWorkspace(workspace);
        return this;
    }

    public IoTSecuritySolutionModelImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public IoTSecuritySolutionModelImpl withStatus(SecuritySolutionStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public IoTSecuritySolutionModelImpl withExport(List<ExportData> export) {
        this.innerModel().withExport(export);
        return this;
    }

    public IoTSecuritySolutionModelImpl withDisabledDataSources(List<DataSource> disabledDataSources) {
        this.innerModel().withDisabledDataSources(disabledDataSources);
        return this;
    }

    public IoTSecuritySolutionModelImpl withIotHubs(List<String> iotHubs) {
        this.innerModel().withIotHubs(iotHubs);
        return this;
    }

    public IoTSecuritySolutionModelImpl withUserDefinedResources(UserDefinedResourcesProperties userDefinedResources) {
        if (isInCreateMode()) {
            this.innerModel().withUserDefinedResources(userDefinedResources);
            return this;
        } else {
            this.updateUpdateIotSecuritySolutionData.withUserDefinedResources(userDefinedResources);
            return this;
        }
    }

    public IoTSecuritySolutionModelImpl withRecommendationsConfiguration(
        List<RecommendationConfigurationProperties> recommendationsConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withRecommendationsConfiguration(recommendationsConfiguration);
            return this;
        } else {
            this.updateUpdateIotSecuritySolutionData.withRecommendationsConfiguration(recommendationsConfiguration);
            return this;
        }
    }

    public IoTSecuritySolutionModelImpl withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus unmaskedIpLoggingStatus) {
        this.innerModel().withUnmaskedIpLoggingStatus(unmaskedIpLoggingStatus);
        return this;
    }

    public IoTSecuritySolutionModelImpl withAdditionalWorkspaces(
        List<AdditionalWorkspacesProperties> additionalWorkspaces) {
        this.innerModel().withAdditionalWorkspaces(additionalWorkspaces);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
