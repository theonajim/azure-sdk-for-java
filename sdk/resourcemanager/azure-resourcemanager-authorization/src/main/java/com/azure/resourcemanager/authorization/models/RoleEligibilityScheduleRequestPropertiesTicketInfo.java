// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Ticket Info of the role eligibility. */
@Fluent
public final class RoleEligibilityScheduleRequestPropertiesTicketInfo {
    /*
     * Ticket number for the role eligibility
     */
    @JsonProperty(value = "ticketNumber")
    private String ticketNumber;

    /*
     * Ticket system name for the role eligibility
     */
    @JsonProperty(value = "ticketSystem")
    private String ticketSystem;

    /**
     * Get the ticketNumber property: Ticket number for the role eligibility.
     *
     * @return the ticketNumber value.
     */
    public String ticketNumber() {
        return this.ticketNumber;
    }

    /**
     * Set the ticketNumber property: Ticket number for the role eligibility.
     *
     * @param ticketNumber the ticketNumber value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesTicketInfo object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesTicketInfo withTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }

    /**
     * Get the ticketSystem property: Ticket system name for the role eligibility.
     *
     * @return the ticketSystem value.
     */
    public String ticketSystem() {
        return this.ticketSystem;
    }

    /**
     * Set the ticketSystem property: Ticket system name for the role eligibility.
     *
     * @param ticketSystem the ticketSystem value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesTicketInfo object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesTicketInfo withTicketSystem(String ticketSystem) {
        this.ticketSystem = ticketSystem;
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
