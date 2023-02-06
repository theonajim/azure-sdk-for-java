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

/** SAP Business Warehouse Open Hub Destination Linked Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHub")
@JsonFlatten
@Fluent
public class SapOpenHubLinkedService extends LinkedService {
    /*
     * Host name of the SAP BW instance where the open hub destination is located. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * System number of the BW system where the open hub destination is located. (Usually a two-digit decimal number
     * represented as a string.) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.systemNumber", required = true)
    private Object systemNumber;

    /*
     * Client ID of the client on the BW system where the open hub destination is located. (Usually a three-digit
     * decimal number represented as a string) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /*
     * Language of the BW system where the open hub destination is located. The default value is EN. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.language")
    private Object language;

    /*
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.systemId")
    private Object systemId;

    /*
     * Username to access the SAP BW server where the open hub destination is located. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password to access the SAP BW server where the open hub destination is located.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.messageServer")
    private Object messageServer;

    /*
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.messageServerService")
    private Object messageServerService;

    /*
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.logonGroup")
    private Object logonGroup;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of SapOpenHubLinkedService class. */
    public SapOpenHubLinkedService() {}

    /**
     * Get the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @return the systemNumber value.
     */
    public Object getSystemNumber() {
        return this.systemNumber;
    }

    /**
     * Set the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     *
     * @param systemNumber the systemNumber value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     *
     * @param clientId the clientId value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @return the language value.
     */
    public Object getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     *
     * @param language the language value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @return the systemId value.
     */
    public Object getSystemId() {
        return this.systemId;
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     *
     * @param systemId the systemId value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setSystemId(Object systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * Get the userName property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     *
     * @param userName the userName value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP BW server where the open hub destination is located.
     *
     * @param password the password value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @return the messageServer value.
     */
    public Object getMessageServer() {
        return this.messageServer;
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     *
     * @param messageServer the messageServer value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setMessageServer(Object messageServer) {
        this.messageServer = messageServer;
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @return the messageServerService value.
     */
    public Object getMessageServerService() {
        return this.messageServerService;
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     *
     * @param messageServerService the messageServerService value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setMessageServerService(Object messageServerService) {
        this.messageServerService = messageServerService;
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @return the logonGroup value.
     */
    public Object getLogonGroup() {
        return this.logonGroup;
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     *
     * @param logonGroup the logonGroup value to set.
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setLogonGroup(Object logonGroup) {
        this.logonGroup = logonGroup;
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
     * @return the SapOpenHubLinkedService object itself.
     */
    public SapOpenHubLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOpenHubLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
