// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.ActionResponseInner;
import com.azure.resourcemanager.securityinsights.models.ActionRequest;
import com.azure.resourcemanager.securityinsights.models.ActionResponse;

public final class ActionResponseImpl implements ActionResponse, ActionResponse.Definition, ActionResponse.Update {
    private ActionResponseInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String workflowId() {
        return this.innerModel().workflowId();
    }

    public String logicAppResourceId() {
        return this.innerModel().logicAppResourceId();
    }

    public ActionResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String ruleId;

    private String actionId;

    private ActionRequest createAction;

    private ActionRequest updateAction;

    public ActionResponseImpl withExistingAlertRule(String resourceGroupName, String workspaceName, String ruleId) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.ruleId = ruleId;
        return this;
    }

    public ActionResponse create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, ruleId, actionId, createAction, Context.NONE)
                .getValue();
        return this;
    }

    public ActionResponse create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, ruleId, actionId, createAction, context)
                .getValue();
        return this;
    }

    ActionResponseImpl(String name, com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = new ActionResponseInner();
        this.serviceManager = serviceManager;
        this.actionId = name;
        this.createAction = new ActionRequest();
    }

    public ActionResponseImpl update() {
        this.updateAction = new ActionRequest();
        return this;
    }

    public ActionResponse apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, ruleId, actionId, updateAction, Context.NONE)
                .getValue();
        return this;
    }

    public ActionResponse apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, ruleId, actionId, updateAction, context)
                .getValue();
        return this;
    }

    ActionResponseImpl(
        ActionResponseInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.ruleId = Utils.getValueFromIdByName(innerObject.id(), "alertRules");
        this.actionId = Utils.getValueFromIdByName(innerObject.id(), "actions");
    }

    public ActionResponse refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .getWithResponse(resourceGroupName, workspaceName, ruleId, actionId, Context.NONE)
                .getValue();
        return this;
    }

    public ActionResponse refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActions()
                .getWithResponse(resourceGroupName, workspaceName, ruleId, actionId, context)
                .getValue();
        return this;
    }

    public ActionResponseImpl withEtag(String etag) {
        if (isInCreateMode()) {
            this.createAction.withEtag(etag);
            return this;
        } else {
            this.updateAction.withEtag(etag);
            return this;
        }
    }

    public ActionResponseImpl withTriggerUri(String triggerUri) {
        if (isInCreateMode()) {
            this.createAction.withTriggerUri(triggerUri);
            return this;
        } else {
            this.updateAction.withTriggerUri(triggerUri);
            return this;
        }
    }

    public ActionResponseImpl withLogicAppResourceId(String logicAppResourceId) {
        if (isInCreateMode()) {
            this.createAction.withLogicAppResourceId(logicAppResourceId);
            return this;
        } else {
            this.updateAction.withLogicAppResourceId(logicAppResourceId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
