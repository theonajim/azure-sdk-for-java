// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.KeyVaultSecretStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** SSL certificate for an app. */
@Fluent
public final class CertificateInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateInner.class);

    /*
     * Certificate resource specific properties
     */
    @JsonProperty(value = "properties")
    private CertificateProperties innerProperties;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the innerProperties property: Certificate resource specific properties.
     *
     * @return the innerProperties value.
     */
    private CertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the certificate.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.innerProperties() == null ? null : this.innerProperties().subjectName();
    }

    /**
     * Get the hostNames property: Host names the certificate applies to.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().hostNames();
    }

    /**
     * Set the hostNames property: Host names the certificate applies to.
     *
     * @param hostNames the hostNames value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withHostNames(List<String> hostNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withHostNames(hostNames);
        return this;
    }

    /**
     * Get the pfxBlob property: Pfx blob.
     *
     * @return the pfxBlob value.
     */
    public byte[] pfxBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().pfxBlob();
    }

    /**
     * Set the pfxBlob property: Pfx blob.
     *
     * @param pfxBlob the pfxBlob value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPfxBlob(byte[] pfxBlob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withPfxBlob(pfxBlob);
        return this;
    }

    /**
     * Get the siteName property: App name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.innerProperties() == null ? null : this.innerProperties().siteName();
    }

    /**
     * Get the selfLink property: Self link.
     *
     * @return the selfLink value.
     */
    public String selfLink() {
        return this.innerProperties() == null ? null : this.innerProperties().selfLink();
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.innerProperties() == null ? null : this.innerProperties().issuer();
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.innerProperties() == null ? null : this.innerProperties().issueDate();
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Get the password property: Certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: Certificate password.
     *
     * @param password the password value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.innerProperties() == null ? null : this.innerProperties().valid();
    }

    /**
     * Get the cerBlob property: Raw bytes of .cer file.
     *
     * @return the cerBlob value.
     */
    public byte[] cerBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().cerBlob();
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.innerProperties() == null ? null : this.innerProperties().publicKeyHash();
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the
     * certificate.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hostingEnvironmentProfile();
    }

    /**
     * Get the keyVaultId property: Key Vault Csm resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultId();
    }

    /**
     * Set the keyVaultId property: Key Vault Csm resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultId(String keyVaultId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withKeyVaultId(keyVaultId);
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultSecretName();
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withKeyVaultSecretName(String keyVaultSecretName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withKeyVaultSecretName(keyVaultSecretName);
        return this;
    }

    /**
     * Get the keyVaultSecretStatus property: Status of the Key Vault secret.
     *
     * @return the keyVaultSecretStatus value.
     */
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultSecretStatus();
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.innerProperties() == null ? null : this.innerProperties().serverFarmId();
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms"
         + "/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withServerFarmId(String serverFarmId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withServerFarmId(serverFarmId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
