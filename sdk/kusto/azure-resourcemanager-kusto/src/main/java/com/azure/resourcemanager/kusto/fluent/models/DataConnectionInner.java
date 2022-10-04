// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.kusto.models.EventGridDataConnection;
import com.azure.resourcemanager.kusto.models.EventHubDataConnection;
import com.azure.resourcemanager.kusto.models.IotHubDataConnection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Class representing an data connection. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = DataConnectionInner.class)
@JsonTypeName("DataConnection")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "EventHub", value = EventHubDataConnection.class),
    @JsonSubTypes.Type(name = "IotHub", value = IotHubDataConnection.class),
    @JsonSubTypes.Type(name = "EventGrid", value = EventGridDataConnection.class)
})
@Fluent
public class DataConnectionInner extends ProxyResource {
    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the DataConnectionInner object itself.
     */
    public DataConnectionInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
