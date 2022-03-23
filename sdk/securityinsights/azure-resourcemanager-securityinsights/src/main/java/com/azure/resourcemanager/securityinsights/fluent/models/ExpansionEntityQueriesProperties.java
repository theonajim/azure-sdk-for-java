// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.EntityType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes expansion entity query properties. */
@Fluent
public final class ExpansionEntityQueriesProperties {
    /*
     * List of the data sources that are required to run the query
     */
    @JsonProperty(value = "dataSources")
    private List<String> dataSources;

    /*
     * The query display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The type of the query's source entity
     */
    @JsonProperty(value = "inputEntityType")
    private EntityType inputEntityType;

    /*
     * List of the fields of the source entity that are required to run the
     * query
     */
    @JsonProperty(value = "inputFields")
    private List<String> inputFields;

    /*
     * List of the desired output types to be constructed from the result
     */
    @JsonProperty(value = "outputEntityTypes")
    private List<EntityType> outputEntityTypes;

    /*
     * The template query string to be parsed and formatted
     */
    @JsonProperty(value = "queryTemplate")
    private String queryTemplate;

    /**
     * Get the dataSources property: List of the data sources that are required to run the query.
     *
     * @return the dataSources value.
     */
    public List<String> dataSources() {
        return this.dataSources;
    }

    /**
     * Set the dataSources property: List of the data sources that are required to run the query.
     *
     * @param dataSources the dataSources value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withDataSources(List<String> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    /**
     * Get the displayName property: The query display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The query display name.
     *
     * @param displayName the displayName value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the inputEntityType property: The type of the query's source entity.
     *
     * @return the inputEntityType value.
     */
    public EntityType inputEntityType() {
        return this.inputEntityType;
    }

    /**
     * Set the inputEntityType property: The type of the query's source entity.
     *
     * @param inputEntityType the inputEntityType value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withInputEntityType(EntityType inputEntityType) {
        this.inputEntityType = inputEntityType;
        return this;
    }

    /**
     * Get the inputFields property: List of the fields of the source entity that are required to run the query.
     *
     * @return the inputFields value.
     */
    public List<String> inputFields() {
        return this.inputFields;
    }

    /**
     * Set the inputFields property: List of the fields of the source entity that are required to run the query.
     *
     * @param inputFields the inputFields value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withInputFields(List<String> inputFields) {
        this.inputFields = inputFields;
        return this;
    }

    /**
     * Get the outputEntityTypes property: List of the desired output types to be constructed from the result.
     *
     * @return the outputEntityTypes value.
     */
    public List<EntityType> outputEntityTypes() {
        return this.outputEntityTypes;
    }

    /**
     * Set the outputEntityTypes property: List of the desired output types to be constructed from the result.
     *
     * @param outputEntityTypes the outputEntityTypes value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withOutputEntityTypes(List<EntityType> outputEntityTypes) {
        this.outputEntityTypes = outputEntityTypes;
        return this;
    }

    /**
     * Get the queryTemplate property: The template query string to be parsed and formatted.
     *
     * @return the queryTemplate value.
     */
    public String queryTemplate() {
        return this.queryTemplate;
    }

    /**
     * Set the queryTemplate property: The template query string to be parsed and formatted.
     *
     * @param queryTemplate the queryTemplate value to set.
     * @return the ExpansionEntityQueriesProperties object itself.
     */
    public ExpansionEntityQueriesProperties withQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
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
