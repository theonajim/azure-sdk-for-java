// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.UnsupportedEncodingException;

/** Creates a new live pipeline or updates an existing one. */
@Fluent
public final class LivePipelineSetRequest extends MethodRequest {
    /*
     * Live Pipeline represents an unique instance of a pipeline topology which
     * is used for real-time content ingestion and analysis.
     */
    @JsonProperty(value = "livePipeline", required = true)
    private LivePipeline livePipeline;

    /*
     * method name
     */
    @JsonProperty(value = "methodName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String methodName;

    /**
     * Creates an instance of LivePipelineSetRequest class.
     *
     * @param livePipeline the livePipeline value to set.
     */
    @JsonCreator
    public LivePipelineSetRequest(@JsonProperty(value = "livePipeline", required = true) LivePipeline livePipeline) {
        methodName = "livePipelineSet";
        this.livePipeline = livePipeline;
    }

    /**
     * Get the livePipeline property: Live Pipeline represents an unique instance of a pipeline topology which is used
     * for real-time content ingestion and analysis.
     *
     * @return the livePipeline value.
     */
    public LivePipeline getLivePipeline() {
        return this.livePipeline;
    }

    /**
     * Get the methodName property: method name.
     *
     * @return the methodName value.
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * Get the payload as JSON: the serialized form of the request body
     *
     * @return the payload as JSON
     * @throws UnsupportedEncodingException UnsupportedEncodingException UnsupportedEncodingException
     */
    public String getPayloadAsJson() throws UnsupportedEncodingException {
        LivePipelineSetRequestBody setRequestBody = new LivePipelineSetRequestBody(this.livePipeline.getName());
        setRequestBody.setSystemData(this.livePipeline.getSystemData());
        setRequestBody.setProperties(this.livePipeline.getProperties());
        return setRequestBody.getPayloadAsJson();
    }
}
