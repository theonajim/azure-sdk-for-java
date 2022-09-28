// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes properties of an governanceRule. */
@Fluent
public final class GovernanceRuleProperties {
    /*
     * display name of the governanceRule
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * description of the governanceRule
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Governance rule remediation timeframe - this is the time that will affect on the grace-period duration e.g.
     * 7.00:00:00 - means 7 days
     */
    @JsonProperty(value = "remediationTimeframe")
    private String remediationTimeframe;

    /*
     * Defines whether there is a grace period on the governance rule
     */
    @JsonProperty(value = "isGracePeriod")
    private Boolean isGracePeriod;

    /*
     * The governance rule priority, priority to the lower number. Rules with the same priority on the same
     * subscription will not be allowed
     */
    @JsonProperty(value = "rulePriority", required = true)
    private int rulePriority;

    /*
     * Defines whether the rule is active/inactive
     */
    @JsonProperty(value = "isDisabled")
    private Boolean isDisabled;

    /*
     * The rule type of the governance rule, defines the source of the rule e.g. Integrated
     */
    @JsonProperty(value = "ruleType", required = true)
    private GovernanceRuleType ruleType;

    /*
     * The governance rule source, what the rule affects, e.g. Assessments
     */
    @JsonProperty(value = "sourceResourceType", required = true)
    private GovernanceRuleSourceResourceType sourceResourceType;

    /*
     * The governance rule conditionSets - see examples
     */
    @JsonProperty(value = "conditionSets", required = true)
    private List<Object> conditionSets;

    /*
     * The Owner source for the governance rule - e.g. Manually by user@contoso.com - see example
     */
    @JsonProperty(value = "ownerSource", required = true)
    private GovernanceRuleOwnerSource ownerSource;

    /*
     * The email notifications settings for the governance rule, states whether to disable notifications for mangers
     * and owners
     */
    @JsonProperty(value = "governanceEmailNotification")
    private GovernanceRuleEmailNotification governanceEmailNotification;

    /**
     * Get the displayName property: display name of the governanceRule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: display name of the governanceRule.
     *
     * @param displayName the displayName value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: description of the governanceRule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: description of the governanceRule.
     *
     * @param description the description value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the remediationTimeframe property: Governance rule remediation timeframe - this is the time that will affect
     * on the grace-period duration e.g. 7.00:00:00 - means 7 days.
     *
     * @return the remediationTimeframe value.
     */
    public String remediationTimeframe() {
        return this.remediationTimeframe;
    }

    /**
     * Set the remediationTimeframe property: Governance rule remediation timeframe - this is the time that will affect
     * on the grace-period duration e.g. 7.00:00:00 - means 7 days.
     *
     * @param remediationTimeframe the remediationTimeframe value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withRemediationTimeframe(String remediationTimeframe) {
        this.remediationTimeframe = remediationTimeframe;
        return this;
    }

    /**
     * Get the isGracePeriod property: Defines whether there is a grace period on the governance rule.
     *
     * @return the isGracePeriod value.
     */
    public Boolean isGracePeriod() {
        return this.isGracePeriod;
    }

    /**
     * Set the isGracePeriod property: Defines whether there is a grace period on the governance rule.
     *
     * @param isGracePeriod the isGracePeriod value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withIsGracePeriod(Boolean isGracePeriod) {
        this.isGracePeriod = isGracePeriod;
        return this;
    }

    /**
     * Get the rulePriority property: The governance rule priority, priority to the lower number. Rules with the same
     * priority on the same subscription will not be allowed.
     *
     * @return the rulePriority value.
     */
    public int rulePriority() {
        return this.rulePriority;
    }

    /**
     * Set the rulePriority property: The governance rule priority, priority to the lower number. Rules with the same
     * priority on the same subscription will not be allowed.
     *
     * @param rulePriority the rulePriority value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withRulePriority(int rulePriority) {
        this.rulePriority = rulePriority;
        return this;
    }

    /**
     * Get the isDisabled property: Defines whether the rule is active/inactive.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * Set the isDisabled property: Defines whether the rule is active/inactive.
     *
     * @param isDisabled the isDisabled value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * Get the ruleType property: The rule type of the governance rule, defines the source of the rule e.g. Integrated.
     *
     * @return the ruleType value.
     */
    public GovernanceRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: The rule type of the governance rule, defines the source of the rule e.g. Integrated.
     *
     * @param ruleType the ruleType value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withRuleType(GovernanceRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the sourceResourceType property: The governance rule source, what the rule affects, e.g. Assessments.
     *
     * @return the sourceResourceType value.
     */
    public GovernanceRuleSourceResourceType sourceResourceType() {
        return this.sourceResourceType;
    }

    /**
     * Set the sourceResourceType property: The governance rule source, what the rule affects, e.g. Assessments.
     *
     * @param sourceResourceType the sourceResourceType value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withSourceResourceType(GovernanceRuleSourceResourceType sourceResourceType) {
        this.sourceResourceType = sourceResourceType;
        return this;
    }

    /**
     * Get the conditionSets property: The governance rule conditionSets - see examples.
     *
     * @return the conditionSets value.
     */
    public List<Object> conditionSets() {
        return this.conditionSets;
    }

    /**
     * Set the conditionSets property: The governance rule conditionSets - see examples.
     *
     * @param conditionSets the conditionSets value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withConditionSets(List<Object> conditionSets) {
        this.conditionSets = conditionSets;
        return this;
    }

    /**
     * Get the ownerSource property: The Owner source for the governance rule - e.g. Manually by user@contoso.com - see
     * example.
     *
     * @return the ownerSource value.
     */
    public GovernanceRuleOwnerSource ownerSource() {
        return this.ownerSource;
    }

    /**
     * Set the ownerSource property: The Owner source for the governance rule - e.g. Manually by user@contoso.com - see
     * example.
     *
     * @param ownerSource the ownerSource value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withOwnerSource(GovernanceRuleOwnerSource ownerSource) {
        this.ownerSource = ownerSource;
        return this;
    }

    /**
     * Get the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @return the governanceEmailNotification value.
     */
    public GovernanceRuleEmailNotification governanceEmailNotification() {
        return this.governanceEmailNotification;
    }

    /**
     * Set the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @param governanceEmailNotification the governanceEmailNotification value to set.
     * @return the GovernanceRuleProperties object itself.
     */
    public GovernanceRuleProperties withGovernanceEmailNotification(
        GovernanceRuleEmailNotification governanceEmailNotification) {
        this.governanceEmailNotification = governanceEmailNotification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model GovernanceRuleProperties"));
        }
        if (ruleType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleType in model GovernanceRuleProperties"));
        }
        if (sourceResourceType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceResourceType in model GovernanceRuleProperties"));
        }
        if (conditionSets() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property conditionSets in model GovernanceRuleProperties"));
        }
        if (ownerSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ownerSource in model GovernanceRuleProperties"));
        } else {
            ownerSource().validate();
        }
        if (governanceEmailNotification() != null) {
            governanceEmailNotification().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GovernanceRuleProperties.class);
}
