// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Volume Export Policy Rule. */
@Fluent
public final class ExportPolicyRule {
    /*
     * Order index
     */
    @JsonProperty(value = "ruleIndex")
    private Integer ruleIndex;

    /*
     * Read only access
     */
    @JsonProperty(value = "unixReadOnly")
    private Boolean unixReadOnly;

    /*
     * Read and write access
     */
    @JsonProperty(value = "unixReadWrite")
    private Boolean unixReadWrite;

    /*
     * Kerberos5 Read only access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5ReadOnly")
    private Boolean kerberos5ReadOnly;

    /*
     * Kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5ReadWrite")
    private Boolean kerberos5ReadWrite;

    /*
     * Kerberos5i Read only access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5iReadOnly")
    private Boolean kerberos5IReadOnly;

    /*
     * Kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5iReadWrite")
    private Boolean kerberos5IReadWrite;

    /*
     * Kerberos5p Read only access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5pReadOnly")
    private Boolean kerberos5PReadOnly;

    /*
     * Kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later
     */
    @JsonProperty(value = "kerberos5pReadWrite")
    private Boolean kerberos5PReadWrite;

    /*
     * Allows CIFS protocol
     */
    @JsonProperty(value = "cifs")
    private Boolean cifs;

    /*
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes
     */
    @JsonProperty(value = "nfsv3")
    private Boolean nfsv3;

    /*
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes
     */
    @JsonProperty(value = "nfsv41")
    private Boolean nfsv41;

    /*
     * Client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names
     */
    @JsonProperty(value = "allowedClients")
    private String allowedClients;

    /*
     * Has root access to volume
     */
    @JsonProperty(value = "hasRootAccess")
    private Boolean hasRootAccess;

    /*
     * This parameter specifies who is authorized to change the ownership of a file. restricted - Only root user can
     * change the ownership of the file. unrestricted - Non-root users can change ownership of files that they own.
     */
    @JsonProperty(value = "chownMode")
    private ChownMode chownMode;

    /**
     * Get the ruleIndex property: Order index.
     *
     * @return the ruleIndex value.
     */
    public Integer ruleIndex() {
        return this.ruleIndex;
    }

    /**
     * Set the ruleIndex property: Order index.
     *
     * @param ruleIndex the ruleIndex value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withRuleIndex(Integer ruleIndex) {
        this.ruleIndex = ruleIndex;
        return this;
    }

    /**
     * Get the unixReadOnly property: Read only access.
     *
     * @return the unixReadOnly value.
     */
    public Boolean unixReadOnly() {
        return this.unixReadOnly;
    }

    /**
     * Set the unixReadOnly property: Read only access.
     *
     * @param unixReadOnly the unixReadOnly value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadOnly(Boolean unixReadOnly) {
        this.unixReadOnly = unixReadOnly;
        return this;
    }

    /**
     * Get the unixReadWrite property: Read and write access.
     *
     * @return the unixReadWrite value.
     */
    public Boolean unixReadWrite() {
        return this.unixReadWrite;
    }

    /**
     * Set the unixReadWrite property: Read and write access.
     *
     * @param unixReadWrite the unixReadWrite value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadWrite(Boolean unixReadWrite) {
        this.unixReadWrite = unixReadWrite;
        return this;
    }

    /**
     * Get the kerberos5ReadOnly property: Kerberos5 Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @return the kerberos5ReadOnly value.
     */
    public Boolean kerberos5ReadOnly() {
        return this.kerberos5ReadOnly;
    }

    /**
     * Set the kerberos5ReadOnly property: Kerberos5 Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @param kerberos5ReadOnly the kerberos5ReadOnly value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5ReadOnly(Boolean kerberos5ReadOnly) {
        this.kerberos5ReadOnly = kerberos5ReadOnly;
        return this;
    }

    /**
     * Get the kerberos5ReadWrite property: Kerberos5 Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @return the kerberos5ReadWrite value.
     */
    public Boolean kerberos5ReadWrite() {
        return this.kerberos5ReadWrite;
    }

    /**
     * Set the kerberos5ReadWrite property: Kerberos5 Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @param kerberos5ReadWrite the kerberos5ReadWrite value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5ReadWrite(Boolean kerberos5ReadWrite) {
        this.kerberos5ReadWrite = kerberos5ReadWrite;
        return this;
    }

    /**
     * Get the kerberos5IReadOnly property: Kerberos5i Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @return the kerberos5IReadOnly value.
     */
    public Boolean kerberos5IReadOnly() {
        return this.kerberos5IReadOnly;
    }

    /**
     * Set the kerberos5IReadOnly property: Kerberos5i Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @param kerberos5IReadOnly the kerberos5IReadOnly value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5IReadOnly(Boolean kerberos5IReadOnly) {
        this.kerberos5IReadOnly = kerberos5IReadOnly;
        return this;
    }

    /**
     * Get the kerberos5IReadWrite property: Kerberos5i Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @return the kerberos5IReadWrite value.
     */
    public Boolean kerberos5IReadWrite() {
        return this.kerberos5IReadWrite;
    }

    /**
     * Set the kerberos5IReadWrite property: Kerberos5i Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @param kerberos5IReadWrite the kerberos5IReadWrite value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5IReadWrite(Boolean kerberos5IReadWrite) {
        this.kerberos5IReadWrite = kerberos5IReadWrite;
        return this;
    }

    /**
     * Get the kerberos5PReadOnly property: Kerberos5p Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @return the kerberos5PReadOnly value.
     */
    public Boolean kerberos5PReadOnly() {
        return this.kerberos5PReadOnly;
    }

    /**
     * Set the kerberos5PReadOnly property: Kerberos5p Read only access. To be use with swagger version 2020-05-01 or
     * later.
     *
     * @param kerberos5PReadOnly the kerberos5PReadOnly value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5PReadOnly(Boolean kerberos5PReadOnly) {
        this.kerberos5PReadOnly = kerberos5PReadOnly;
        return this;
    }

    /**
     * Get the kerberos5PReadWrite property: Kerberos5p Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @return the kerberos5PReadWrite value.
     */
    public Boolean kerberos5PReadWrite() {
        return this.kerberos5PReadWrite;
    }

    /**
     * Set the kerberos5PReadWrite property: Kerberos5p Read and write access. To be use with swagger version 2020-05-01
     * or later.
     *
     * @param kerberos5PReadWrite the kerberos5PReadWrite value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withKerberos5PReadWrite(Boolean kerberos5PReadWrite) {
        this.kerberos5PReadWrite = kerberos5PReadWrite;
        return this;
    }

    /**
     * Get the cifs property: Allows CIFS protocol.
     *
     * @return the cifs value.
     */
    public Boolean cifs() {
        return this.cifs;
    }

    /**
     * Set the cifs property: Allows CIFS protocol.
     *
     * @param cifs the cifs value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withCifs(Boolean cifs) {
        this.cifs = cifs;
        return this;
    }

    /**
     * Get the nfsv3 property: Allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @return the nfsv3 value.
     */
    public Boolean nfsv3() {
        return this.nfsv3;
    }

    /**
     * Set the nfsv3 property: Allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @param nfsv3 the nfsv3 value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv3(Boolean nfsv3) {
        this.nfsv3 = nfsv3;
        return this;
    }

    /**
     * Get the nfsv41 property: Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @return the nfsv41 value.
     */
    public Boolean nfsv41() {
        return this.nfsv41;
    }

    /**
     * Set the nfsv41 property: Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @param nfsv41 the nfsv41 value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv41(Boolean nfsv41) {
        this.nfsv41 = nfsv41;
        return this;
    }

    /**
     * Get the allowedClients property: Client ingress specification as comma separated string with IPv4 CIDRs, IPv4
     * host addresses and host names.
     *
     * @return the allowedClients value.
     */
    public String allowedClients() {
        return this.allowedClients;
    }

    /**
     * Set the allowedClients property: Client ingress specification as comma separated string with IPv4 CIDRs, IPv4
     * host addresses and host names.
     *
     * @param allowedClients the allowedClients value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withAllowedClients(String allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

    /**
     * Get the hasRootAccess property: Has root access to volume.
     *
     * @return the hasRootAccess value.
     */
    public Boolean hasRootAccess() {
        return this.hasRootAccess;
    }

    /**
     * Set the hasRootAccess property: Has root access to volume.
     *
     * @param hasRootAccess the hasRootAccess value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withHasRootAccess(Boolean hasRootAccess) {
        this.hasRootAccess = hasRootAccess;
        return this;
    }

    /**
     * Get the chownMode property: This parameter specifies who is authorized to change the ownership of a file.
     * restricted - Only root user can change the ownership of the file. unrestricted - Non-root users can change
     * ownership of files that they own.
     *
     * @return the chownMode value.
     */
    public ChownMode chownMode() {
        return this.chownMode;
    }

    /**
     * Set the chownMode property: This parameter specifies who is authorized to change the ownership of a file.
     * restricted - Only root user can change the ownership of the file. unrestricted - Non-root users can change
     * ownership of files that they own.
     *
     * @param chownMode the chownMode value to set.
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withChownMode(ChownMode chownMode) {
        this.chownMode = chownMode;
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
