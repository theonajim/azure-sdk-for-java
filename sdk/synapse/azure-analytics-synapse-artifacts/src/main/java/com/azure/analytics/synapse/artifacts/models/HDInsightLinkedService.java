// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsight")
@JsonFlatten
@Fluent
public class HDInsightLinkedService extends LinkedService {
    /*
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterUri", required = true)
    private Object clusterUri;

    /*
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * HDInsight cluster password.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "typeProperties.linkedServiceName")
    private LinkedServiceReference linkedServiceName;

    /*
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     */
    @JsonProperty(value = "typeProperties.hcatalogLinkedServiceName")
    private LinkedServiceReference hcatalogLinkedServiceName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     */
    @JsonProperty(value = "typeProperties.isEspEnabled")
    private Object isEspEnabled;

    /*
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.fileSystem")
    private Object fileSystem;

    /**
     * Get the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     *
     * @return the clusterUri value.
     */
    public Object getClusterUri() {
        return this.clusterUri;
    }

    /**
     * Set the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     *
     * @param clusterUri the clusterUri value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setClusterUri(Object clusterUri) {
        this.clusterUri = clusterUri;
        return this;
    }

    /**
     * Get the userName property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: HDInsight cluster password.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: HDInsight cluster password.
     *
     * @param password the password value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     *
     * @return the hcatalogLinkedServiceName value.
     */
    public LinkedServiceReference getHcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName;
    }

    /**
     * Set the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     *
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setHcatalogLinkedServiceName(LinkedServiceReference hcatalogLinkedServiceName) {
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     *
     * @return the isEspEnabled value.
     */
    public Object getIsEspEnabled() {
        return this.isEspEnabled;
    }

    /**
     * Set the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     *
     * @param isEspEnabled the isEspEnabled value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setIsEspEnabled(Object isEspEnabled) {
        this.isEspEnabled = isEspEnabled;
        return this;
    }

    /**
     * Get the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     *
     * @return the fileSystem value.
     */
    public Object getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     *
     * @param fileSystem the fileSystem value to set.
     * @return the HDInsightLinkedService object itself.
     */
    public HDInsightLinkedService setFileSystem(Object fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
