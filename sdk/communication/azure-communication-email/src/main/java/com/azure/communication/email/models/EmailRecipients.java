// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/** Recipients of the email. */
@Fluent
public final class EmailRecipients {
    /*
     * Email To recipients
     */
    @JsonProperty(value = "to", required = true)
    private Iterable<EmailAddress> to;

    /*
     * Email CC recipients
     */
    @JsonProperty(value = "CC")
    private Iterable<EmailAddress> cc;

    /*
     * Email BCC recipients
     */
    @JsonProperty(value = "bCC")
    private Iterable<EmailAddress> bcc;

    /**
     * Constructor for EmailRecipients that takes in list of addresses.
     * @param to the email to recipients
     */
    public EmailRecipients(Iterable<EmailAddress> to) {
        this.to = to;
    }

    /**
     * Constructor for EmailRecipients that takes in a single address.
     * @param to the email to recipient
     */
    public EmailRecipients(EmailAddress to) {
        List<EmailAddress> emailAddressList = new ArrayList<>();
        emailAddressList.add(to);
        this.to = emailAddressList;
    }

    /**
     * Get the to property: Email To recipients.
     *
     * @return the to value.
     */
    public Iterable<EmailAddress> getTo() {
        return this.to;
    }

    /**
     * Get the cc property: Email CC recipients.
     *
     * @return the cc value.
     */
    public Iterable<EmailAddress> getCc() {
        return this.cc;
    }

    /**
     * Set the cc property: Email CC recipients.
     *
     * @param cc the cc value to set.
     * @return the EmailRecipients object itself.
     */
    public EmailRecipients setCc(Iterable<EmailAddress> cc) {
        this.cc = cc;
        return this;
    }

    /**
     * Set the cc property: Email CC recipients.
     *
     * @param cc the cc value to set.
     * @return the EmailRecipients object itself.
     */
    public EmailRecipients setCc(EmailAddress cc) {
        List<EmailAddress> emailAddressList = new ArrayList<>();
        emailAddressList.add(cc);
        this.cc = emailAddressList;
        return this;
    }

    /**
     * Get the bcc property: Email BCC recipients.
     *
     * @return the bcc value.
     */
    public Iterable<EmailAddress> getBcc() {
        return this.bcc;
    }

    /**
     * Set the bcc property: Email BCC recipients.
     *
     * @param bcc the bcc value to set.
     * @return the EmailRecipients object itself.
     */
    public EmailRecipients setBcc(Iterable<EmailAddress> bcc) {
        this.bcc = bcc;
        return this;
    }

    /**
     * Set the bcc property: Email BCC recipients.
     *
     * @param bcc the bcc value to set.
     * @return the EmailRecipients object itself.
     */
    public EmailRecipients setBcc(EmailAddress bcc) {
        List<EmailAddress> emailAddressList = new ArrayList<>();
        emailAddressList.add(bcc);
        this.bcc = emailAddressList;
        return this;
    }
}
