// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * LiveOutputListResult
 *
 * <p>The LiveOutput list result.
 */
@Fluent
public final class LiveOutputListResult {
    /*
     * The result of the List LiveOutput operation.
     */
    @JsonProperty(value = "value")
    private List<LiveOutputInner> value;

    /*
     * The number of result.
     */
    @JsonProperty(value = "@odata.count")
    private Integer odataCount;

    /*
     * The link to the next set of results. Not empty if value contains incomplete list of live outputs.
     */
    @JsonProperty(value = "@odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: The result of the List LiveOutput operation.
     *
     * @return the value value.
     */
    public List<LiveOutputInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The result of the List LiveOutput operation.
     *
     * @param value the value value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withValue(List<LiveOutputInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataCount property: The number of result.
     *
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: The number of result.
     *
     * @param odataCount the odataCount value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the odataNextLink property: The link to the next set of results. Not empty if value contains incomplete list
     * of live outputs.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The link to the next set of results. Not empty if value contains incomplete list
     * of live outputs.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the LiveOutputListResult object itself.
     */
    public LiveOutputListResult withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
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
