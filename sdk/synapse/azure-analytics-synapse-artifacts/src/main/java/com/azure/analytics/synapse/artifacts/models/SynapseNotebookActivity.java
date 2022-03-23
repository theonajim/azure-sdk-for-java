// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Execute Synapse notebook activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SynapseNotebook")
@JsonFlatten
@Fluent
public class SynapseNotebookActivity extends ExecutionActivity {
    /*
     * Synapse notebook reference.
     */
    @JsonProperty(value = "typeProperties.notebook", required = true)
    private SynapseNotebookReference notebook;

    /*
     * The name of the big data pool which will be used to execute the
     * notebook.
     */
    @JsonProperty(value = "typeProperties.sparkPool")
    private BigDataPoolParametrizationReference sparkPool;

    /*
     * Notebook parameters.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, NotebookParameter> parameters;

    /**
     * Get the notebook property: Synapse notebook reference.
     *
     * @return the notebook value.
     */
    public SynapseNotebookReference getNotebook() {
        return this.notebook;
    }

    /**
     * Set the notebook property: Synapse notebook reference.
     *
     * @param notebook the notebook value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setNotebook(SynapseNotebookReference notebook) {
        this.notebook = notebook;
        return this;
    }

    /**
     * Get the sparkPool property: The name of the big data pool which will be used to execute the notebook.
     *
     * @return the sparkPool value.
     */
    public BigDataPoolParametrizationReference getSparkPool() {
        return this.sparkPool;
    }

    /**
     * Set the sparkPool property: The name of the big data pool which will be used to execute the notebook.
     *
     * @param sparkPool the sparkPool value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setSparkPool(BigDataPoolParametrizationReference sparkPool) {
        this.sparkPool = sparkPool;
        return this;
    }

    /**
     * Get the parameters property: Notebook parameters.
     *
     * @return the parameters value.
     */
    public Map<String, NotebookParameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Notebook parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SynapseNotebookActivity object itself.
     */
    public SynapseNotebookActivity setParameters(Map<String, NotebookParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
}
