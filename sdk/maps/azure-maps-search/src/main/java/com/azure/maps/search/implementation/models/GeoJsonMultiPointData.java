// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data contained by a `GeoJson MultiPoint`. */
@Fluent
public class GeoJsonMultiPointData {
    /*
     * Coordinates for the `GeoJson MultiPoint` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<Double>> coordinates;

    /** Creates an instance of GeoJsonMultiPointData class. */
    public GeoJsonMultiPointData() {}

    /**
     * Get the coordinates property: Coordinates for the `GeoJson MultiPoint` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<Double>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiPoint` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPointData object itself.
     */
    public GeoJsonMultiPointData setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
