// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookTemplateInner;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplate;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateGallery;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateLocalizedGallery;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateUpdateParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WorkbookTemplateImpl
    implements WorkbookTemplate, WorkbookTemplate.Definition, WorkbookTemplate.Update {
    private WorkbookTemplateInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

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

    public Integer priority() {
        return this.innerModel().priority();
    }

    public String author() {
        return this.innerModel().author();
    }

    public Object templateData() {
        return this.innerModel().templateData();
    }

    public List<WorkbookTemplateGallery> galleries() {
        List<WorkbookTemplateGallery> inner = this.innerModel().galleries();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, List<WorkbookTemplateLocalizedGallery>> localized() {
        Map<String, List<WorkbookTemplateLocalizedGallery>> inner = this.innerModel().localized();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
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

    public WorkbookTemplateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private WorkbookTemplateUpdateParameters updateWorkbookTemplateUpdateParameters;

    public WorkbookTemplateImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public WorkbookTemplate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public WorkbookTemplate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    WorkbookTemplateImpl(
        String name, com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = new WorkbookTemplateInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public WorkbookTemplateImpl update() {
        this.updateWorkbookTemplateUpdateParameters = new WorkbookTemplateUpdateParameters();
        return this;
    }

    public WorkbookTemplate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .updateWithResponse(
                    resourceGroupName, resourceName, updateWorkbookTemplateUpdateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public WorkbookTemplate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .updateWithResponse(resourceGroupName, resourceName, updateWorkbookTemplateUpdateParameters, context)
                .getValue();
        return this;
    }

    WorkbookTemplateImpl(
        WorkbookTemplateInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "workbooktemplates");
    }

    public WorkbookTemplate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public WorkbookTemplate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkbookTemplates()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public WorkbookTemplateImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkbookTemplateImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkbookTemplateImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withTags(tags);
            return this;
        }
    }

    public WorkbookTemplateImpl withPriority(Integer priority) {
        if (isInCreateMode()) {
            this.innerModel().withPriority(priority);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withPriority(priority);
            return this;
        }
    }

    public WorkbookTemplateImpl withAuthor(String author) {
        if (isInCreateMode()) {
            this.innerModel().withAuthor(author);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withAuthor(author);
            return this;
        }
    }

    public WorkbookTemplateImpl withTemplateData(Object templateData) {
        if (isInCreateMode()) {
            this.innerModel().withTemplateData(templateData);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withTemplateData(templateData);
            return this;
        }
    }

    public WorkbookTemplateImpl withGalleries(List<WorkbookTemplateGallery> galleries) {
        if (isInCreateMode()) {
            this.innerModel().withGalleries(galleries);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withGalleries(galleries);
            return this;
        }
    }

    public WorkbookTemplateImpl withLocalized(Map<String, List<WorkbookTemplateLocalizedGallery>> localized) {
        if (isInCreateMode()) {
            this.innerModel().withLocalized(localized);
            return this;
        } else {
            this.updateWorkbookTemplateUpdateParameters.withLocalized(localized);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
