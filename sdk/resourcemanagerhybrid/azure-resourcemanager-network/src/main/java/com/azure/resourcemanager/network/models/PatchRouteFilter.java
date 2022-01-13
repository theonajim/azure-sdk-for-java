// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.fluent.models.RouteFilterPropertiesFormat;
import com.azure.resourcemanager.network.fluent.models.RouteFilterRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Route Filter Resource. */
@Fluent
public final class PatchRouteFilter extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchRouteFilter.class);

    /*
     * Route Filter Resource
     */
    @JsonProperty(value = "properties")
    private RouteFilterPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: Route Filter Resource.
     *
     * @return the innerProperties value.
     */
    private RouteFilterPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PatchRouteFilter withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    public List<RouteFilterRuleInner> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set.
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withRules(List<RouteFilterRuleInner> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterPropertiesFormat();
        }
        this.innerProperties().withRules(rules);
        return this;
    }

    /**
     * Get the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Set the peerings property: A collection of references to express route circuit peerings.
     *
     * @param peerings the peerings value to set.
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterPropertiesFormat();
        }
        this.innerProperties().withPeerings(peerings);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
