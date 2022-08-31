// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NginxDeploymentUpdateProperties model. */
@Fluent
public final class NginxDeploymentUpdateProperties {
    /*
     * The enableDiagnosticsSupport property.
     */
    @JsonProperty(value = "enableDiagnosticsSupport")
    private Boolean enableDiagnosticsSupport;

    /*
     * The logging property.
     */
    @JsonProperty(value = "logging")
    private NginxLogging logging;

    /**
     * Get the enableDiagnosticsSupport property: The enableDiagnosticsSupport property.
     *
     * @return the enableDiagnosticsSupport value.
     */
    public Boolean enableDiagnosticsSupport() {
        return this.enableDiagnosticsSupport;
    }

    /**
     * Set the enableDiagnosticsSupport property: The enableDiagnosticsSupport property.
     *
     * @param enableDiagnosticsSupport the enableDiagnosticsSupport value to set.
     * @return the NginxDeploymentUpdateProperties object itself.
     */
    public NginxDeploymentUpdateProperties withEnableDiagnosticsSupport(Boolean enableDiagnosticsSupport) {
        this.enableDiagnosticsSupport = enableDiagnosticsSupport;
        return this;
    }

    /**
     * Get the logging property: The logging property.
     *
     * @return the logging value.
     */
    public NginxLogging logging() {
        return this.logging;
    }

    /**
     * Set the logging property: The logging property.
     *
     * @param logging the logging value to set.
     * @return the NginxDeploymentUpdateProperties object itself.
     */
    public NginxDeploymentUpdateProperties withLogging(NginxLogging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logging() != null) {
            logging().validate();
        }
    }
}
