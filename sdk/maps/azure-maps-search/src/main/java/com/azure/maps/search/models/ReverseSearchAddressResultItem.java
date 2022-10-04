// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.models.GeoPosition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result object for a Search Address Reverse response. */
@Immutable
public final class ReverseSearchAddressResultItem {
    /*
     * The address of the result
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private MapsSearchAddress address;

    /*
     * Position property in the form of "{latitude},{longitude}"
     */
    @JsonProperty(value = "position", access = JsonProperty.Access.WRITE_ONLY)
    private String position;

    /*
     * The roadUse property.
     */
    @JsonProperty(value = "roadUse", access = JsonProperty.Access.WRITE_ONLY)
    private List<RoadUseType> roadUse;

    /*
     * Information on the type of match.
     *
     * One of:
     * * AddressPoint
     * * HouseNumberRange
     * * Street
     */
    @JsonProperty(value = "matchType", access = JsonProperty.Access.WRITE_ONLY)
    private MatchType matchType;

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public MapsSearchAddress getAddress() {
        return this.address;
    }

    /**
     * Get the position property: Position property in the form of "{latitude},{longitude}".
     *
     * @return the position value.
     */
    public GeoPosition getPosition() {
        String returnValue = this.position;
        return com.azure.maps.search.implementation.helpers.Utility.fromCommaSeparatedString(returnValue);
    }

    /**
     * Get the roadUse property: The roadUse property.
     *
     * @return the roadUse value.
     */
    public List<RoadUseType> getRoadUse() {
        return this.roadUse;
    }

    /**
     * Get the matchType property: Information on the type of match.
     *
     * <p>One of: * AddressPoint * HouseNumberRange * Street.
     *
     * @return the matchType value.
     */
    public MatchType getMatchType() {
        return this.matchType;
    }
}
