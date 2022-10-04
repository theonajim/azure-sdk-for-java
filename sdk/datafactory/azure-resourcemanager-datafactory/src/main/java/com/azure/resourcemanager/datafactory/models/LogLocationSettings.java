// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log location settings. */
@Fluent
public final class LogLocationSettings {
    /*
     * Log storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /**
     * Get the linkedServiceName property: Log storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Log storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the LogLocationSettings object itself.
     */
    public LogLocationSettings withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     *
     * @return the path value.
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     *
     * @param path the path value to set.
     * @return the LogLocationSettings object itself.
     */
    public LogLocationSettings withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedServiceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedServiceName in model LogLocationSettings"));
        } else {
            linkedServiceName().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogLocationSettings.class);
}
