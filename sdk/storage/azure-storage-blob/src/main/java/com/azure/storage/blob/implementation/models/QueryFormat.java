// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The QueryFormat model. */
@JacksonXmlRootElement(localName = "QueryFormat")
@Fluent
public final class QueryFormat {
    /*
     * The quick query format type.
     */
    @JsonProperty(value = "Type", required = true)
    private QueryFormatType type;

    /*
     * Groups the settings used for interpreting the blob data if the blob is
     * delimited text formatted.
     */
    @JsonProperty(value = "DelimitedTextConfiguration")
    private DelimitedTextConfiguration delimitedTextConfiguration;

    /*
     * json text configuration
     */
    @JsonProperty(value = "JsonTextConfiguration")
    private JsonTextConfiguration jsonTextConfiguration;

    /*
     * Groups the settings used for formatting the response if the response
     * should be Arrow formatted.
     */
    @JsonProperty(value = "ArrowConfiguration")
    private ArrowConfiguration arrowConfiguration;

    /*
     * Any object
     */
    @JsonProperty(value = "ParquetTextConfiguration")
    private Object parquetTextConfiguration;

    /**
     * Get the type property: The quick query format type.
     *
     * @return the type value.
     */
    public QueryFormatType getType() {
        return this.type;
    }

    /**
     * Set the type property: The quick query format type.
     *
     * @param type the type value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setType(QueryFormatType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the delimitedTextConfiguration property: Groups the settings used for interpreting the blob data if the blob
     * is delimited text formatted.
     *
     * @return the delimitedTextConfiguration value.
     */
    public DelimitedTextConfiguration getDelimitedTextConfiguration() {
        return this.delimitedTextConfiguration;
    }

    /**
     * Set the delimitedTextConfiguration property: Groups the settings used for interpreting the blob data if the blob
     * is delimited text formatted.
     *
     * @param delimitedTextConfiguration the delimitedTextConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setDelimitedTextConfiguration(DelimitedTextConfiguration delimitedTextConfiguration) {
        this.delimitedTextConfiguration = delimitedTextConfiguration;
        return this;
    }

    /**
     * Get the jsonTextConfiguration property: json text configuration.
     *
     * @return the jsonTextConfiguration value.
     */
    public JsonTextConfiguration getJsonTextConfiguration() {
        return this.jsonTextConfiguration;
    }

    /**
     * Set the jsonTextConfiguration property: json text configuration.
     *
     * @param jsonTextConfiguration the jsonTextConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setJsonTextConfiguration(JsonTextConfiguration jsonTextConfiguration) {
        this.jsonTextConfiguration = jsonTextConfiguration;
        return this;
    }

    /**
     * Get the arrowConfiguration property: Groups the settings used for formatting the response if the response should
     * be Arrow formatted.
     *
     * @return the arrowConfiguration value.
     */
    public ArrowConfiguration getArrowConfiguration() {
        return this.arrowConfiguration;
    }

    /**
     * Set the arrowConfiguration property: Groups the settings used for formatting the response if the response should
     * be Arrow formatted.
     *
     * @param arrowConfiguration the arrowConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setArrowConfiguration(ArrowConfiguration arrowConfiguration) {
        this.arrowConfiguration = arrowConfiguration;
        return this;
    }

    /**
     * Get the parquetTextConfiguration property: Any object.
     *
     * @return the parquetTextConfiguration value.
     */
    public Object getParquetTextConfiguration() {
        return this.parquetTextConfiguration;
    }

    /**
     * Set the parquetTextConfiguration property: Any object.
     *
     * @param parquetTextConfiguration the parquetTextConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setParquetTextConfiguration(Object parquetTextConfiguration) {
        this.parquetTextConfiguration = parquetTextConfiguration;
        return this;
    }
}
