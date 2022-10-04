// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON GeometryCollection` object type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.8) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GeometryCollection")
@Fluent
public final class GeoJsonGeometryCollection extends GeoJsonGeometry {
    /*
     * Contains a list of valid `GeoJSON` geometry objects. **Note** that
     * coordinates in GeoJSON are in x, y order (longitude, latitude).
     */
    @JsonProperty(value = "geometries", required = true)
    private List<GeoJsonGeometry> geometries;

    /**
     * Get the geometries property: Contains a list of valid `GeoJSON` geometry objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @return the geometries value.
     */
    public List<GeoJsonGeometry> getGeometries() {
        return this.geometries;
    }

    /**
     * Set the geometries property: Contains a list of valid `GeoJSON` geometry objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @param geometries the geometries value to set.
     * @return the GeoJsonGeometryCollection object itself.
     */
    public GeoJsonGeometryCollection setGeometries(List<GeoJsonGeometry> geometries) {
        this.geometries = geometries;
        return this;
    }
}
