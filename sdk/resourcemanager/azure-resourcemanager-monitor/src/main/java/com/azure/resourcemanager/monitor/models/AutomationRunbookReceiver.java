// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Azure Automation Runbook notification receiver. */
@Fluent
public final class AutomationRunbookReceiver {
    /*
     * The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     */
    @JsonProperty(value = "automationAccountId", required = true)
    private String automationAccountId;

    /*
     * The name for this runbook.
     */
    @JsonProperty(value = "runbookName", required = true)
    private String runbookName;

    /*
     * The resource id for webhook linked to this runbook.
     */
    @JsonProperty(value = "webhookResourceId", required = true)
    private String webhookResourceId;

    /*
     * Indicates whether this instance is global runbook.
     */
    @JsonProperty(value = "isGlobalRunbook", required = true)
    private boolean isGlobalRunbook;

    /*
     * Indicates name of the webhook.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The URI where webhooks should be sent.
     */
    @JsonProperty(value = "serviceUri")
    private String serviceUri;

    /*
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema")
    private Boolean useCommonAlertSchema;

    /**
     * Get the automationAccountId property: The Azure automation account Id which holds this runbook and authenticate
     * to Azure resource.
     *
     * @return the automationAccountId value.
     */
    public String automationAccountId() {
        return this.automationAccountId;
    }

    /**
     * Set the automationAccountId property: The Azure automation account Id which holds this runbook and authenticate
     * to Azure resource.
     *
     * @param automationAccountId the automationAccountId value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withAutomationAccountId(String automationAccountId) {
        this.automationAccountId = automationAccountId;
        return this;
    }

    /**
     * Get the runbookName property: The name for this runbook.
     *
     * @return the runbookName value.
     */
    public String runbookName() {
        return this.runbookName;
    }

    /**
     * Set the runbookName property: The name for this runbook.
     *
     * @param runbookName the runbookName value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withRunbookName(String runbookName) {
        this.runbookName = runbookName;
        return this;
    }

    /**
     * Get the webhookResourceId property: The resource id for webhook linked to this runbook.
     *
     * @return the webhookResourceId value.
     */
    public String webhookResourceId() {
        return this.webhookResourceId;
    }

    /**
     * Set the webhookResourceId property: The resource id for webhook linked to this runbook.
     *
     * @param webhookResourceId the webhookResourceId value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withWebhookResourceId(String webhookResourceId) {
        this.webhookResourceId = webhookResourceId;
        return this;
    }

    /**
     * Get the isGlobalRunbook property: Indicates whether this instance is global runbook.
     *
     * @return the isGlobalRunbook value.
     */
    public boolean isGlobalRunbook() {
        return this.isGlobalRunbook;
    }

    /**
     * Set the isGlobalRunbook property: Indicates whether this instance is global runbook.
     *
     * @param isGlobalRunbook the isGlobalRunbook value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withIsGlobalRunbook(boolean isGlobalRunbook) {
        this.isGlobalRunbook = isGlobalRunbook;
        return this;
    }

    /**
     * Get the name property: Indicates name of the webhook.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Indicates name of the webhook.
     *
     * @param name the name value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the serviceUri property: The URI where webhooks should be sent.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URI where webhooks should be sent.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value.
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the AutomationRunbookReceiver object itself.
     */
    public AutomationRunbookReceiver withUseCommonAlertSchema(Boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (automationAccountId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property automationAccountId in model AutomationRunbookReceiver"));
        }
        if (runbookName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property runbookName in model AutomationRunbookReceiver"));
        }
        if (webhookResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property webhookResourceId in model AutomationRunbookReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutomationRunbookReceiver.class);
}
