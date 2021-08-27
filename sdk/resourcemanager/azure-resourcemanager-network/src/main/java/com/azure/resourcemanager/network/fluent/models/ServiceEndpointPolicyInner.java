// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Service End point policy resource. */
@Fluent
public final class ServiceEndpointPolicyInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceEndpointPolicyInner.class);

    /*
     * Properties of the service end point policy.
     */
    @JsonProperty(value = "properties")
    private ServiceEndpointPolicyPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Kind of service endpoint policy. This is metadata used for the Azure
     * portal experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the service end point policy.
     *
     * @return the innerProperties value.
     */
    private ServiceEndpointPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * Get the kind property: Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ServiceEndpointPolicyInner object itself.
     */
    public ServiceEndpointPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceEndpointPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceEndpointPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     *
     * @return the serviceEndpointPolicyDefinitions value.
     */
    public List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceEndpointPolicyDefinitions();
    }

    /**
     * Set the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     *
     * @param serviceEndpointPolicyDefinitions the serviceEndpointPolicyDefinitions value to set.
     * @return the ServiceEndpointPolicyInner object itself.
     */
    public ServiceEndpointPolicyInner withServiceEndpointPolicyDefinitions(
        List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceEndpointPolicyPropertiesFormat();
        }
        this.innerProperties().withServiceEndpointPolicyDefinitions(serviceEndpointPolicyDefinitions);
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().subnets();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the service endpoint policy resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the service endpoint policy resource.
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
