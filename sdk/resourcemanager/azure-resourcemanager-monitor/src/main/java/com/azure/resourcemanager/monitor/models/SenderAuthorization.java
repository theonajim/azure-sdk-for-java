// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * the authorization used by the user who has performed the operation that led to this event. This captures the RBAC
 * properties of the event. These usually include the 'action', 'role' and the 'scope'.
 */
@Fluent
public final class SenderAuthorization {
    /*
     * the permissible actions. For instance: microsoft.support/supporttickets/write
     */
    @JsonProperty(value = "action")
    private String action;

    /*
     * the role of the user. For instance: Subscription Admin
     */
    @JsonProperty(value = "role")
    private String role;

    /*
     * the scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Get the action property: the permissible actions. For instance: microsoft.support/supporttickets/write.
     *
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: the permissible actions. For instance: microsoft.support/supporttickets/write.
     *
     * @param action the action value to set.
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the role property: the role of the user. For instance: Subscription Admin.
     *
     * @return the role value.
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role property: the role of the user. For instance: Subscription Admin.
     *
     * @param role the role value to set.
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the scope property: the scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: the scope.
     *
     * @param scope the scope value to set.
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withScope(String scope) {
        this.scope = scope;
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
