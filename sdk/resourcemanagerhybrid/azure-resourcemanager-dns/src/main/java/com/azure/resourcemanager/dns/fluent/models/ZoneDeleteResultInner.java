// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.models.HttpStatusCode;
import com.azure.resourcemanager.dns.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response to a Zone Delete operation. */
@Fluent
public final class ZoneDeleteResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ZoneDeleteResultInner.class);

    /*
     * Users can perform a Get on Azure-AsyncOperation to get the status of
     * their delete Zone operations.
     */
    @JsonProperty(value = "azureAsyncOperation")
    private String azureAsyncOperation;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /*
     * The statusCode property.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /*
     * The requestId property.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * Get the azureAsyncOperation property: Users can perform a Get on Azure-AsyncOperation to get the status of their
     * delete Zone operations.
     *
     * @return the azureAsyncOperation value.
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation property: Users can perform a Get on Azure-AsyncOperation to get the status of their
     * delete Zone operations.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set.
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusCode property: The statusCode property.
     *
     * @return the statusCode value.
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The statusCode property.
     *
     * @param statusCode the statusCode value to set.
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the requestId property: The requestId property.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The requestId property.
     *
     * @param requestId the requestId value to set.
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withRequestId(String requestId) {
        this.requestId = requestId;
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
