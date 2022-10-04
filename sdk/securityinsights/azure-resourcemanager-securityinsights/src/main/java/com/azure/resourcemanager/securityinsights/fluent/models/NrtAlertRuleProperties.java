// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AlertDetailsOverride;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.EntityMapping;
import com.azure.resourcemanager.securityinsights.models.EventGroupingSettings;
import com.azure.resourcemanager.securityinsights.models.IncidentConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Nrt alert rule base property bag. */
@Fluent
public final class NrtAlertRuleProperties {
    /*
     * The Name of the alert rule template used to create this rule.
     */
    @JsonProperty(value = "alertRuleTemplateName")
    private String alertRuleTemplateName;

    /*
     * The version of the alert rule template used to create this rule - in format <a.b.c>, where all are numbers, for
     * example 0 <1.0.2>
     */
    @JsonProperty(value = "templateVersion")
    private String templateVersion;

    /*
     * The description of the alert rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The query that creates alerts for this rule.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * The tactics of the alert rule
     */
    @JsonProperty(value = "tactics")
    private List<AttackTactic> tactics;

    /*
     * The techniques of the alert rule
     */
    @JsonProperty(value = "techniques")
    private List<String> techniques;

    /*
     * The display name for alerts created by this alert rule.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Determines whether this alert rule is enabled or disabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The last time that this alert rule has been modified.
     */
    @JsonProperty(value = "lastModifiedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedUtc;

    /*
     * The suppression (in ISO 8601 duration format) to wait since last time this alert rule been triggered.
     */
    @JsonProperty(value = "suppressionDuration", required = true)
    private Duration suppressionDuration;

    /*
     * Determines whether the suppression for this alert rule is enabled or disabled.
     */
    @JsonProperty(value = "suppressionEnabled", required = true)
    private boolean suppressionEnabled;

    /*
     * The severity for alerts created by this alert rule.
     */
    @JsonProperty(value = "severity", required = true)
    private AlertSeverity severity;

    /*
     * The settings of the incidents that created from alerts triggered by this analytics rule
     */
    @JsonProperty(value = "incidentConfiguration")
    private IncidentConfiguration incidentConfiguration;

    /*
     * Dictionary of string key-value pairs of columns to be attached to the alert
     */
    @JsonProperty(value = "customDetails")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customDetails;

    /*
     * Array of the entity mappings of the alert rule
     */
    @JsonProperty(value = "entityMappings")
    private List<EntityMapping> entityMappings;

    /*
     * The alert details override settings
     */
    @JsonProperty(value = "alertDetailsOverride")
    private AlertDetailsOverride alertDetailsOverride;

    /*
     * The event grouping settings.
     */
    @JsonProperty(value = "eventGroupingSettings")
    private EventGroupingSettings eventGroupingSettings;

    /**
     * Get the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @return the alertRuleTemplateName value.
     */
    public String alertRuleTemplateName() {
        return this.alertRuleTemplateName;
    }

    /**
     * Set the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @param alertRuleTemplateName the alertRuleTemplateName value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withAlertRuleTemplateName(String alertRuleTemplateName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        return this;
    }

    /**
     * Get the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @return the templateVersion value.
     */
    public String templateVersion() {
        return this.templateVersion;
    }

    /**
     * Set the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @param templateVersion the templateVersion value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /**
     * Get the description property: The description of the alert rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the alert rule.
     *
     * @param description the description value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the query property: The query that creates alerts for this rule.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The query that creates alerts for this rule.
     *
     * @param query the query value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Set the tactics property: The tactics of the alert rule.
     *
     * @param tactics the tactics value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withTactics(List<AttackTactic> tactics) {
        this.tactics = tactics;
        return this;
    }

    /**
     * Get the techniques property: The techniques of the alert rule.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Set the techniques property: The techniques of the alert rule.
     *
     * @param techniques the techniques value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withTechniques(List<String> techniques) {
        this.techniques = techniques;
        return this;
    }

    /**
     * Get the displayName property: The display name for alerts created by this alert rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for alerts created by this alert rule.
     *
     * @param displayName the displayName value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this alert rule has been modified.
     *
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.lastModifiedUtc;
    }

    /**
     * Get the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @return the suppressionDuration value.
     */
    public Duration suppressionDuration() {
        return this.suppressionDuration;
    }

    /**
     * Set the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @param suppressionDuration the suppressionDuration value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withSuppressionDuration(Duration suppressionDuration) {
        this.suppressionDuration = suppressionDuration;
        return this;
    }

    /**
     * Get the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @return the suppressionEnabled value.
     */
    public boolean suppressionEnabled() {
        return this.suppressionEnabled;
    }

    /**
     * Set the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @param suppressionEnabled the suppressionEnabled value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withSuppressionEnabled(boolean suppressionEnabled) {
        this.suppressionEnabled = suppressionEnabled;
        return this;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     *
     * @param severity the severity value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @return the incidentConfiguration value.
     */
    public IncidentConfiguration incidentConfiguration() {
        return this.incidentConfiguration;
    }

    /**
     * Set the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @param incidentConfiguration the incidentConfiguration value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withIncidentConfiguration(IncidentConfiguration incidentConfiguration) {
        this.incidentConfiguration = incidentConfiguration;
        return this;
    }

    /**
     * Get the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @return the customDetails value.
     */
    public Map<String, String> customDetails() {
        return this.customDetails;
    }

    /**
     * Set the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @param customDetails the customDetails value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withCustomDetails(Map<String, String> customDetails) {
        this.customDetails = customDetails;
        return this;
    }

    /**
     * Get the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @return the entityMappings value.
     */
    public List<EntityMapping> entityMappings() {
        return this.entityMappings;
    }

    /**
     * Set the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @param entityMappings the entityMappings value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withEntityMappings(List<EntityMapping> entityMappings) {
        this.entityMappings = entityMappings;
        return this;
    }

    /**
     * Get the alertDetailsOverride property: The alert details override settings.
     *
     * @return the alertDetailsOverride value.
     */
    public AlertDetailsOverride alertDetailsOverride() {
        return this.alertDetailsOverride;
    }

    /**
     * Set the alertDetailsOverride property: The alert details override settings.
     *
     * @param alertDetailsOverride the alertDetailsOverride value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        this.alertDetailsOverride = alertDetailsOverride;
        return this;
    }

    /**
     * Get the eventGroupingSettings property: The event grouping settings.
     *
     * @return the eventGroupingSettings value.
     */
    public EventGroupingSettings eventGroupingSettings() {
        return this.eventGroupingSettings;
    }

    /**
     * Set the eventGroupingSettings property: The event grouping settings.
     *
     * @param eventGroupingSettings the eventGroupingSettings value to set.
     * @return the NrtAlertRuleProperties object itself.
     */
    public NrtAlertRuleProperties withEventGroupingSettings(EventGroupingSettings eventGroupingSettings) {
        this.eventGroupingSettings = eventGroupingSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (query() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property query in model NrtAlertRuleProperties"));
        }
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model NrtAlertRuleProperties"));
        }
        if (suppressionDuration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property suppressionDuration in model NrtAlertRuleProperties"));
        }
        if (severity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property severity in model NrtAlertRuleProperties"));
        }
        if (incidentConfiguration() != null) {
            incidentConfiguration().validate();
        }
        if (entityMappings() != null) {
            entityMappings().forEach(e -> e.validate());
        }
        if (alertDetailsOverride() != null) {
            alertDetailsOverride().validate();
        }
        if (eventGroupingSettings() != null) {
            eventGroupingSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NrtAlertRuleProperties.class);
}
