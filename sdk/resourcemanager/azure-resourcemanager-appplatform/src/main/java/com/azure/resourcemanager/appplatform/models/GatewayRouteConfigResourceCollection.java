// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.fluent.models.GatewayRouteConfigResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Spring Cloud Gateway route config resources and a possible link for next set. */
@Fluent
public final class GatewayRouteConfigResourceCollection {
    /*
     * Collection of Spring Cloud Gateway route config resources
     */
    @JsonProperty(value = "value")
    private List<GatewayRouteConfigResourceInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Collection of Spring Cloud Gateway route config resources.
     *
     * @return the value value.
     */
    public List<GatewayRouteConfigResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of Spring Cloud Gateway route config resources.
     *
     * @param value the value value to set.
     * @return the GatewayRouteConfigResourceCollection object itself.
     */
    public GatewayRouteConfigResourceCollection withValue(List<GatewayRouteConfigResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the GatewayRouteConfigResourceCollection object itself.
     */
    public GatewayRouteConfigResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
