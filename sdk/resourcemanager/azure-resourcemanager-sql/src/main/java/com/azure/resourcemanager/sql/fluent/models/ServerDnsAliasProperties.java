// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a server DNS alias. */
@Immutable
public final class ServerDnsAliasProperties {
    /*
     * The fully qualified DNS record for alias
     */
    @JsonProperty(value = "azureDnsRecord", access = JsonProperty.Access.WRITE_ONLY)
    private String azureDnsRecord;

    /** Creates an instance of ServerDnsAliasProperties class. */
    public ServerDnsAliasProperties() {
    }

    /**
     * Get the azureDnsRecord property: The fully qualified DNS record for alias.
     *
     * @return the azureDnsRecord value.
     */
    public String azureDnsRecord() {
        return this.azureDnsRecord;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
