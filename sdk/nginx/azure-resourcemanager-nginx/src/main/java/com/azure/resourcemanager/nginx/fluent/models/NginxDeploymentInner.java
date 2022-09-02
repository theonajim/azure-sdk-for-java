// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.nginx.models.IdentityProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentProperties;
import com.azure.resourcemanager.nginx.models.ResourceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The NginxDeployment model. */
@Fluent
public final class NginxDeploymentInner extends Resource {
    /*
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private NginxDeploymentProperties properties;

    /*
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the identity property: The identity property.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity property.
     *
     * @param identity the identity value to set.
     * @return the NginxDeploymentInner object itself.
     */
    public NginxDeploymentInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public NginxDeploymentProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the NginxDeploymentInner object itself.
     */
    public NginxDeploymentInner withProperties(NginxDeploymentProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: The sku property.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku property.
     *
     * @param sku the sku value to set.
     * @return the NginxDeploymentInner object itself.
     */
    public NginxDeploymentInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public NginxDeploymentInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NginxDeploymentInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
