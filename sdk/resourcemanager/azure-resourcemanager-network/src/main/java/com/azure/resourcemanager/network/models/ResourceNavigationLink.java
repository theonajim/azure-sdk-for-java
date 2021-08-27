// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ResourceNavigationLinkFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ResourceNavigationLink resource. */
@Fluent
public final class ResourceNavigationLink extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceNavigationLink.class);

    /*
     * Resource navigation link properties format.
     */
    @JsonProperty(value = "properties")
    private ResourceNavigationLinkFormat innerProperties;

    /*
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
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

    /**
     * Get the innerProperties property: Resource navigation link properties format.
     *
     * @return the innerProperties value.
     */
    private ResourceNavigationLinkFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withName(String name) {
        this.name = name;
        return this;
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

    /** {@inheritDoc} */
    @Override
    public ResourceNavigationLink withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the linkedResourceType property: Resource type of the linked resource.
     *
     * @return the linkedResourceType value.
     */
    public String linkedResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedResourceType();
    }

    /**
     * Set the linkedResourceType property: Resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set.
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withLinkedResourceType(String linkedResourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ResourceNavigationLinkFormat();
        }
        this.innerProperties().withLinkedResourceType(linkedResourceType);
        return this;
    }

    /**
     * Get the link property: Link to the external resource.
     *
     * @return the link value.
     */
    public String link() {
        return this.innerProperties() == null ? null : this.innerProperties().link();
    }

    /**
     * Set the link property: Link to the external resource.
     *
     * @param link the link value to set.
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withLink(String link) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ResourceNavigationLinkFormat();
        }
        this.innerProperties().withLink(link);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource navigation link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
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
