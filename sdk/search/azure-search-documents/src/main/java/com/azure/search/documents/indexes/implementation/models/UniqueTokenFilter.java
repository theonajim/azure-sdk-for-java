// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Filters out tokens with same text as the previous token. This token filter is implemented using Apache Lucene. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.UniqueTokenFilter")
@Fluent
public final class UniqueTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.UniqueTokenFilter";

    /*
     * A value indicating whether to remove duplicates only at the same
     * position. Default is false.
     */
    @JsonProperty(value = "onlyOnSamePosition")
    private Boolean onlyOnSamePosition;

    /**
     * Creates an instance of UniqueTokenFilter class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public UniqueTokenFilter(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the token filter.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the onlyOnSamePosition property: A value indicating whether to remove duplicates only at the same position.
     * Default is false.
     *
     * @return the onlyOnSamePosition value.
     */
    public Boolean isOnlyOnSamePosition() {
        return this.onlyOnSamePosition;
    }

    /**
     * Set the onlyOnSamePosition property: A value indicating whether to remove duplicates only at the same position.
     * Default is false.
     *
     * @param onlyOnSamePosition the onlyOnSamePosition value to set.
     * @return the UniqueTokenFilter object itself.
     */
    public UniqueTokenFilter setOnlyOnSamePosition(Boolean onlyOnSamePosition) {
        this.onlyOnSamePosition = onlyOnSamePosition;
        return this;
    }
}
