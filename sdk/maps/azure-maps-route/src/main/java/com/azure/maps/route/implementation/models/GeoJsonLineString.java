// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON LineString` geometry type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("LineString")
@Fluent
public final class GeoJsonLineString extends GeoJsonGeometry {
    /*
     * Coordinates for the `GeoJson LineString` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<Double>> coordinates;

    /**
     * Get the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<Double>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonLineString object itself.
     */
    public GeoJsonLineString setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
