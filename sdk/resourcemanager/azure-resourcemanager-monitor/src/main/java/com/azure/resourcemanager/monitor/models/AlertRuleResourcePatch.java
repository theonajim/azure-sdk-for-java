// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.fluent.models.AlertRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The alert rule object for patch operations. */
@Fluent
public final class AlertRuleResourcePatch {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The properties of an alert rule.
     */
    @JsonProperty(value = "properties")
    private AlertRule innerProperties;

    /** Creates an instance of AlertRuleResourcePatch class. */
    public AlertRuleResourcePatch() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of an alert rule.
     *
     * @return the innerProperties value.
     */
    private AlertRule innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: the name of the alert rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: the name of the alert rule.
     *
     * @param name the name value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Get the description property: the description of the alert rule that will be included in the alert email.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: the description of the alert rule that will be included in the alert email.
     *
     * @param description the description value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: the provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the isEnabled property: the flag that indicates whether the alert rule is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
    }

    /**
     * Set the isEnabled property: the flag that indicates whether the alert rule is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withIsEnabled(Boolean isEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Get the condition property: the condition that results in the alert rule being activated.
     *
     * @return the condition value.
     */
    public RuleCondition condition() {
        return this.innerProperties() == null ? null : this.innerProperties().condition();
    }

    /**
     * Set the condition property: the condition that results in the alert rule being activated.
     *
     * @param condition the condition value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withCondition(RuleCondition condition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withCondition(condition);
        return this;
    }

    /**
     * Get the action property: action that is performed when the alert rule becomes active, and when an alert condition
     * is resolved.
     *
     * @return the action value.
     */
    public RuleAction action() {
        return this.innerProperties() == null ? null : this.innerProperties().action();
    }

    /**
     * Set the action property: action that is performed when the alert rule becomes active, and when an alert condition
     * is resolved.
     *
     * @param action the action value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withAction(RuleAction action) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withAction(action);
        return this;
    }

    /**
     * Get the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @return the actions value.
     */
    public List<RuleAction> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: the array of actions that are performed when the alert rule becomes active, and when an
     * alert condition is resolved.
     *
     * @param actions the actions value to set.
     * @return the AlertRuleResourcePatch object itself.
     */
    public AlertRuleResourcePatch withActions(List<RuleAction> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertRule();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in ISO8601 format.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedTime();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
