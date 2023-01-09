// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CS Accounts Details. */
@Fluent
public final class RunAsAccount {
    /*
     * The CS RunAs account Id.
     */
    @JsonProperty(value = "accountId")
    private String accountId;

    /*
     * The CS RunAs account name.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /** Creates an instance of RunAsAccount class. */
    public RunAsAccount() {
    }

    /**
     * Get the accountId property: The CS RunAs account Id.
     *
     * @return the accountId value.
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Set the accountId property: The CS RunAs account Id.
     *
     * @param accountId the accountId value to set.
     * @return the RunAsAccount object itself.
     */
    public RunAsAccount withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the accountName property: The CS RunAs account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The CS RunAs account name.
     *
     * @param accountName the accountName value to set.
     * @return the RunAsAccount object itself.
     */
    public RunAsAccount withAccountName(String accountName) {
        this.accountName = accountName;
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
