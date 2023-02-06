// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Xml dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Xml")
@JsonFlatten
@Fluent
public class XmlDataset extends Dataset {
    /*
     * The location of the json data storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * The code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes
     * another Unicode encoding. Refer to the name column of the table in the following link to set supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.encodingName")
    private Object encodingName;

    /*
     * The null value string. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.nullValue")
    private Object nullValue;

    /*
     * The data compression method used for the json dataset.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /** Creates an instance of XmlDataset class. */
    public XmlDataset() {}

    /**
     * Get the location property: The location of the json data storage.
     *
     * @return the location value.
     */
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the json data storage.
     *
     * @param location the location value to set.
     * @return the XmlDataset object itself.
     */
    public XmlDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the encodingName property: The code page name of the preferred encoding. If not specified, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following
     * link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or
     * Expression with resultType string).
     *
     * @return the encodingName value.
     */
    public Object getEncodingName() {
        return this.encodingName;
    }

    /**
     * Set the encodingName property: The code page name of the preferred encoding. If not specified, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following
     * link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or
     * Expression with resultType string).
     *
     * @param encodingName the encodingName value to set.
     * @return the XmlDataset object itself.
     */
    public XmlDataset setEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value.
     */
    public Object getNullValue() {
        return this.nullValue;
    }

    /**
     * Set the nullValue property: The null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set.
     * @return the XmlDataset object itself.
     */
    public XmlDataset setNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the json dataset.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the json dataset.
     *
     * @param compression the compression value to set.
     * @return the XmlDataset object itself.
     */
    public XmlDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XmlDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
