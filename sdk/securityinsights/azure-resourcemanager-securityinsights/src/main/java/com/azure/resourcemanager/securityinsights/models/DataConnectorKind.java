// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataConnectorKind. */
public final class DataConnectorKind extends ExpandableStringEnum<DataConnectorKind> {
    /** Static value AzureActiveDirectory for DataConnectorKind. */
    public static final DataConnectorKind AZURE_ACTIVE_DIRECTORY = fromString("AzureActiveDirectory");

    /** Static value AzureSecurityCenter for DataConnectorKind. */
    public static final DataConnectorKind AZURE_SECURITY_CENTER = fromString("AzureSecurityCenter");

    /** Static value MicrosoftCloudAppSecurity for DataConnectorKind. */
    public static final DataConnectorKind MICROSOFT_CLOUD_APP_SECURITY = fromString("MicrosoftCloudAppSecurity");

    /** Static value ThreatIntelligence for DataConnectorKind. */
    public static final DataConnectorKind THREAT_INTELLIGENCE = fromString("ThreatIntelligence");

    /** Static value ThreatIntelligenceTaxii for DataConnectorKind. */
    public static final DataConnectorKind THREAT_INTELLIGENCE_TAXII = fromString("ThreatIntelligenceTaxii");

    /** Static value Office365 for DataConnectorKind. */
    public static final DataConnectorKind OFFICE365 = fromString("Office365");

    /** Static value OfficeATP for DataConnectorKind. */
    public static final DataConnectorKind OFFICE_ATP = fromString("OfficeATP");

    /** Static value OfficeIRM for DataConnectorKind. */
    public static final DataConnectorKind OFFICE_IRM = fromString("OfficeIRM");

    /** Static value AmazonWebServicesCloudTrail for DataConnectorKind. */
    public static final DataConnectorKind AMAZON_WEB_SERVICES_CLOUD_TRAIL = fromString("AmazonWebServicesCloudTrail");

    /** Static value AmazonWebServicesS3 for DataConnectorKind. */
    public static final DataConnectorKind AMAZON_WEB_SERVICES_S3 = fromString("AmazonWebServicesS3");

    /** Static value AzureAdvancedThreatProtection for DataConnectorKind. */
    public static final DataConnectorKind AZURE_ADVANCED_THREAT_PROTECTION =
        fromString("AzureAdvancedThreatProtection");

    /** Static value MicrosoftDefenderAdvancedThreatProtection for DataConnectorKind. */
    public static final DataConnectorKind MICROSOFT_DEFENDER_ADVANCED_THREAT_PROTECTION =
        fromString("MicrosoftDefenderAdvancedThreatProtection");

    /** Static value Dynamics365 for DataConnectorKind. */
    public static final DataConnectorKind DYNAMICS365 = fromString("Dynamics365");

    /** Static value MicrosoftThreatProtection for DataConnectorKind. */
    public static final DataConnectorKind MICROSOFT_THREAT_PROTECTION = fromString("MicrosoftThreatProtection");

    /** Static value MicrosoftThreatIntelligence for DataConnectorKind. */
    public static final DataConnectorKind MICROSOFT_THREAT_INTELLIGENCE = fromString("MicrosoftThreatIntelligence");

    /** Static value GenericUI for DataConnectorKind. */
    public static final DataConnectorKind GENERIC_UI = fromString("GenericUI");

    /** Static value APIPolling for DataConnectorKind. */
    public static final DataConnectorKind APIPOLLING = fromString("APIPolling");

    /**
     * Creates or finds a DataConnectorKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataConnectorKind.
     */
    @JsonCreator
    public static DataConnectorKind fromString(String name) {
        return fromString(name, DataConnectorKind.class);
    }

    /** @return known DataConnectorKind values. */
    public static Collection<DataConnectorKind> values() {
        return values(DataConnectorKind.class);
    }
}