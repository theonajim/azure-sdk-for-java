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

/** The path of the Dynamics AX OData entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAXResource")
@JsonFlatten
@Fluent
public class DynamicsAXResourceDataset extends Dataset {
    /*
     * The path of the Dynamics AX OData entity. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path", required = true)
    private Object path;

    /** Creates an instance of DynamicsAXResourceDataset class. */
    public DynamicsAXResourceDataset() {}

    /**
     * Get the path property: The path of the Dynamics AX OData entity. Type: string (or Expression with resultType
     * string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path of the Dynamics AX OData entity. Type: string (or Expression with resultType
     * string).
     *
     * @param path the path value to set.
     * @return the DynamicsAXResourceDataset object itself.
     */
    public DynamicsAXResourceDataset setPath(Object path) {
        this.path = path;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
