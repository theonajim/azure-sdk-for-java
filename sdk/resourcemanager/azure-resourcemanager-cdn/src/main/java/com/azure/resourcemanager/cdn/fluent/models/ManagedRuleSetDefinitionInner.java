// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.ManagedRuleGroupDefinition;
import com.azure.resourcemanager.cdn.models.Sku;
import com.azure.resourcemanager.cdn.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a managed rule set definition. */
@JsonFlatten
@Fluent
public class ManagedRuleSetDefinitionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRuleSetDefinitionInner.class);

    /*
     * The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Provisioning state of the managed rule set.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Type of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleSetType", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetType;

    /*
     * Version of the managed rule set type.
     */
    @JsonProperty(value = "properties.ruleSetVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetVersion;

    /*
     * Rule groups of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleGroupDefinition> ruleGroups;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @param sku the sku value to set.
     * @return the ManagedRuleSetDefinitionInner object itself.
     */
    public ManagedRuleSetDefinitionInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the managed rule set.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ruleSetType property: Type of the managed rule set.
     *
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Get the ruleSetVersion property: Version of the managed rule set type.
     *
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Get the ruleGroups property: Rule groups of the managed rule set.
     *
     * @return the ruleGroups value.
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
