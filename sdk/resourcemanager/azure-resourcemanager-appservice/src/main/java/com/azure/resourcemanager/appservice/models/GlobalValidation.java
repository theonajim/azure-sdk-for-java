// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The configuration settings that determines the validation flow of users using App Service
 * Authentication/Authorization.
 */
@Fluent
public final class GlobalValidation {
    /*
     * <code>true</code> if the authentication flow is required any request is
     * made; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "requireAuthentication")
    private Boolean requireAuthentication;

    /*
     * The action to take when an unauthenticated client attempts to access the
     * app.
     */
    @JsonProperty(value = "unauthenticatedClientAction")
    private UnauthenticatedClientActionV2 unauthenticatedClientAction;

    /*
     * The default authentication provider to use when multiple providers are
     * configured.
     * This setting is only needed if multiple providers are configured and the
     * unauthenticated client
     * action is set to "RedirectToLoginPage".
     */
    @JsonProperty(value = "redirectToProvider")
    private String redirectToProvider;

    /*
     * The paths for which unauthenticated flow would not be redirected to the
     * login page.
     */
    @JsonProperty(value = "excludedPaths")
    private List<String> excludedPaths;

    /**
     * Get the requireAuthentication property: &lt;code&gt;true&lt;/code&gt; if the authentication flow is required any
     * request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the requireAuthentication value.
     */
    public Boolean requireAuthentication() {
        return this.requireAuthentication;
    }

    /**
     * Set the requireAuthentication property: &lt;code&gt;true&lt;/code&gt; if the authentication flow is required any
     * request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param requireAuthentication the requireAuthentication value to set.
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withRequireAuthentication(Boolean requireAuthentication) {
        this.requireAuthentication = requireAuthentication;
        return this;
    }

    /**
     * Get the unauthenticatedClientAction property: The action to take when an unauthenticated client attempts to
     * access the app.
     *
     * @return the unauthenticatedClientAction value.
     */
    public UnauthenticatedClientActionV2 unauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }

    /**
     * Set the unauthenticatedClientAction property: The action to take when an unauthenticated client attempts to
     * access the app.
     *
     * @param unauthenticatedClientAction the unauthenticatedClientAction value to set.
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withUnauthenticatedClientAction(UnauthenticatedClientActionV2 unauthenticatedClientAction) {
        this.unauthenticatedClientAction = unauthenticatedClientAction;
        return this;
    }

    /**
     * Get the redirectToProvider property: The default authentication provider to use when multiple providers are
     * configured. This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to "RedirectToLoginPage".
     *
     * @return the redirectToProvider value.
     */
    public String redirectToProvider() {
        return this.redirectToProvider;
    }

    /**
     * Set the redirectToProvider property: The default authentication provider to use when multiple providers are
     * configured. This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to "RedirectToLoginPage".
     *
     * @param redirectToProvider the redirectToProvider value to set.
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withRedirectToProvider(String redirectToProvider) {
        this.redirectToProvider = redirectToProvider;
        return this;
    }

    /**
     * Get the excludedPaths property: The paths for which unauthenticated flow would not be redirected to the login
     * page.
     *
     * @return the excludedPaths value.
     */
    public List<String> excludedPaths() {
        return this.excludedPaths;
    }

    /**
     * Set the excludedPaths property: The paths for which unauthenticated flow would not be redirected to the login
     * page.
     *
     * @param excludedPaths the excludedPaths value to set.
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withExcludedPaths(List<String> excludedPaths) {
        this.excludedPaths = excludedPaths;
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
