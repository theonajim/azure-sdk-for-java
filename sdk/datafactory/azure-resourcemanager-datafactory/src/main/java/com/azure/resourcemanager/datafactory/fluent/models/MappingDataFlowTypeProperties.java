// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DataFlowSink;
import com.azure.resourcemanager.datafactory.models.DataFlowSource;
import com.azure.resourcemanager.datafactory.models.Transformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Mapping data flow type properties. */
@Fluent
public final class MappingDataFlowTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MappingDataFlowTypeProperties.class);

    /*
     * List of sources in data flow.
     */
    @JsonProperty(value = "sources")
    private List<DataFlowSource> sources;

    /*
     * List of sinks in data flow.
     */
    @JsonProperty(value = "sinks")
    private List<DataFlowSink> sinks;

    /*
     * List of transformations in data flow.
     */
    @JsonProperty(value = "transformations")
    private List<Transformation> transformations;

    /*
     * DataFlow script.
     */
    @JsonProperty(value = "script")
    private String script;

    /*
     * Data flow script lines.
     */
    @JsonProperty(value = "scriptLines")
    private List<String> scriptLines;

    /**
     * Get the sources property: List of sources in data flow.
     *
     * @return the sources value.
     */
    public List<DataFlowSource> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of sources in data flow.
     *
     * @param sources the sources value to set.
     * @return the MappingDataFlowTypeProperties object itself.
     */
    public MappingDataFlowTypeProperties withSources(List<DataFlowSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the sinks property: List of sinks in data flow.
     *
     * @return the sinks value.
     */
    public List<DataFlowSink> sinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: List of sinks in data flow.
     *
     * @param sinks the sinks value to set.
     * @return the MappingDataFlowTypeProperties object itself.
     */
    public MappingDataFlowTypeProperties withSinks(List<DataFlowSink> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Get the transformations property: List of transformations in data flow.
     *
     * @return the transformations value.
     */
    public List<Transformation> transformations() {
        return this.transformations;
    }

    /**
     * Set the transformations property: List of transformations in data flow.
     *
     * @param transformations the transformations value to set.
     * @return the MappingDataFlowTypeProperties object itself.
     */
    public MappingDataFlowTypeProperties withTransformations(List<Transformation> transformations) {
        this.transformations = transformations;
        return this;
    }

    /**
     * Get the script property: DataFlow script.
     *
     * @return the script value.
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script property: DataFlow script.
     *
     * @param script the script value to set.
     * @return the MappingDataFlowTypeProperties object itself.
     */
    public MappingDataFlowTypeProperties withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the scriptLines property: Data flow script lines.
     *
     * @return the scriptLines value.
     */
    public List<String> scriptLines() {
        return this.scriptLines;
    }

    /**
     * Set the scriptLines property: Data flow script lines.
     *
     * @param scriptLines the scriptLines value to set.
     * @return the MappingDataFlowTypeProperties object itself.
     */
    public MappingDataFlowTypeProperties withScriptLines(List<String> scriptLines) {
        this.scriptLines = scriptLines;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
        if (sinks() != null) {
            sinks().forEach(e -> e.validate());
        }
        if (transformations() != null) {
            transformations().forEach(e -> e.validate());
        }
    }
}
