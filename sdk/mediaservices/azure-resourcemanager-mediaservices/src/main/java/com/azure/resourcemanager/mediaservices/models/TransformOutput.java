// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a TransformOutput, which are the rules to be applied while generating the desired output.
 */
@Fluent
public final class TransformOutput {
    /*
     * A Transform can define more than one outputs. This property defines what the service should do when one output
     * fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not
     * reflect failures of outputs that are specified with 'ContinueJob'. The default is 'StopProcessingJob'.
     */
    @JsonProperty(value = "onError")
    private OnErrorType onError;

    /*
     * Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service
     * uses for processing TransformOutputs. The default priority is Normal.
     */
    @JsonProperty(value = "relativePriority")
    private Priority relativePriority;

    /*
     * Preset that describes the operations that will be used to modify, transcode, or extract insights from the source
     * file to generate the output.
     */
    @JsonProperty(value = "preset", required = true)
    private Preset preset;

    /** Creates an instance of TransformOutput class. */
    public TransformOutput() {
    }

    /**
     * Get the onError property: A Transform can define more than one outputs. This property defines what the service
     * should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The
     * overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is
     * 'StopProcessingJob'.
     *
     * @return the onError value.
     */
    public OnErrorType onError() {
        return this.onError;
    }

    /**
     * Set the onError property: A Transform can define more than one outputs. This property defines what the service
     * should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The
     * overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is
     * 'StopProcessingJob'.
     *
     * @param onError the onError value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withOnError(OnErrorType onError) {
        this.onError = onError;
        return this;
    }

    /**
     * Get the relativePriority property: Sets the relative priority of the TransformOutputs within a Transform. This
     * sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     *
     * @return the relativePriority value.
     */
    public Priority relativePriority() {
        return this.relativePriority;
    }

    /**
     * Set the relativePriority property: Sets the relative priority of the TransformOutputs within a Transform. This
     * sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     *
     * @param relativePriority the relativePriority value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withRelativePriority(Priority relativePriority) {
        this.relativePriority = relativePriority;
        return this;
    }

    /**
     * Get the preset property: Preset that describes the operations that will be used to modify, transcode, or extract
     * insights from the source file to generate the output.
     *
     * @return the preset value.
     */
    public Preset preset() {
        return this.preset;
    }

    /**
     * Set the preset property: Preset that describes the operations that will be used to modify, transcode, or extract
     * insights from the source file to generate the output.
     *
     * @param preset the preset value to set.
     * @return the TransformOutput object itself.
     */
    public TransformOutput withPreset(Preset preset) {
        this.preset = preset;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (preset() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property preset in model TransformOutput"));
        } else {
            preset().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransformOutput.class);
}
