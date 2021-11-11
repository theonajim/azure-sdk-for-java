// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.PrivateCloudInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of PrivateCloud. */
public interface PrivateCloud {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The private cloud SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: The identity of the private cloud, if configured.
     *
     * @return the identity value.
     */
    PrivateCloudIdentity identity();

    /**
     * Gets the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    PrivateCloudProvisioningState provisioningState();

    /**
     * Gets the circuit property: An ExpressRoute Circuit.
     *
     * @return the circuit value.
     */
    Circuit circuit();

    /**
     * Gets the endpoints property: The endpoints.
     *
     * @return the endpoints value.
     */
    Endpoints endpoints();

    /**
     * Gets the networkBlock property: The block of addresses should be unique across VNet in your subscription as well
     * as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X
     * is between 0 and 22.
     *
     * @return the networkBlock value.
     */
    String networkBlock();

    /**
     * Gets the managementNetwork property: Network used to access vCenter Server and NSX-T Manager.
     *
     * @return the managementNetwork value.
     */
    String managementNetwork();

    /**
     * Gets the provisioningNetwork property: Used for virtual machine cold migration, cloning, and snapshot migration.
     *
     * @return the provisioningNetwork value.
     */
    String provisioningNetwork();

    /**
     * Gets the vmotionNetwork property: Used for live migration of virtual machines.
     *
     * @return the vmotionNetwork value.
     */
    String vmotionNetwork();

    /**
     * Gets the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud is created.
     *
     * @return the vcenterPassword value.
     */
    String vcenterPassword();

    /**
     * Gets the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is created.
     *
     * @return the nsxtPassword value.
     */
    String nsxtPassword();

    /**
     * Gets the vcenterCertificateThumbprint property: Thumbprint of the vCenter Server SSL certificate.
     *
     * @return the vcenterCertificateThumbprint value.
     */
    String vcenterCertificateThumbprint();

    /**
     * Gets the nsxtCertificateThumbprint property: Thumbprint of the NSX-T Manager SSL certificate.
     *
     * @return the nsxtCertificateThumbprint value.
     */
    String nsxtCertificateThumbprint();

    /**
     * Gets the externalCloudLinks property: Array of cloud link IDs from other clouds that connect to this one.
     *
     * @return the externalCloudLinks value.
     */
    List<String> externalCloudLinks();

    /**
     * Gets the secondaryCircuit property: A secondary expressRoute circuit from a separate AZ. Only present in a
     * stretched private cloud.
     *
     * @return the secondaryCircuit value.
     */
    Circuit secondaryCircuit();

    /**
     * Gets the managementCluster property: The default cluster used for management.
     *
     * @return the managementCluster value.
     */
    ManagementCluster managementCluster();

    /**
     * Gets the internet property: Connectivity to internet is enabled or disabled.
     *
     * @return the internet value.
     */
    InternetEnum internet();

    /**
     * Gets the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @return the identitySources value.
     */
    List<IdentitySource> identitySources();

    /**
     * Gets the availability property: Properties describing how the cloud is distributed across availability zones.
     *
     * @return the availability value.
     */
    AvailabilityProperties availability();

    /**
     * Gets the encryption property: Customer managed key encryption, can be enabled or disabled.
     *
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.PrivateCloudInner object.
     *
     * @return the inner object.
     */
    PrivateCloudInner innerModel();

    /** The entirety of the PrivateCloud definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The PrivateCloud definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateCloud definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PrivateCloud definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the PrivateCloud definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the PrivateCloud definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The private cloud SKU.
             *
             * @param sku The private cloud SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the PrivateCloud definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithCircuit,
                DefinitionStages.WithNetworkBlock,
                DefinitionStages.WithVcenterPassword,
                DefinitionStages.WithNsxtPassword,
                DefinitionStages.WithSecondaryCircuit,
                DefinitionStages.WithManagementCluster,
                DefinitionStages.WithInternet,
                DefinitionStages.WithIdentitySources,
                DefinitionStages.WithAvailability,
                DefinitionStages.WithEncryption {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateCloud create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateCloud create(Context context);
        }
        /** The stage of the PrivateCloud definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateCloud definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the private cloud, if configured..
             *
             * @param identity The identity of the private cloud, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(PrivateCloudIdentity identity);
        }
        /** The stage of the PrivateCloud definition allowing to specify circuit. */
        interface WithCircuit {
            /**
             * Specifies the circuit property: An ExpressRoute Circuit.
             *
             * @param circuit An ExpressRoute Circuit.
             * @return the next definition stage.
             */
            WithCreate withCircuit(Circuit circuit);
        }
        /** The stage of the PrivateCloud definition allowing to specify networkBlock. */
        interface WithNetworkBlock {
            /**
             * Specifies the networkBlock property: The block of addresses should be unique across VNet in your
             * subscription as well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D
             * are between 0 and 255, and X is between 0 and 22.
             *
             * @param networkBlock The block of addresses should be unique across VNet in your subscription as well as
             *     on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and
             *     255, and X is between 0 and 22.
             * @return the next definition stage.
             */
            WithCreate withNetworkBlock(String networkBlock);
        }
        /** The stage of the PrivateCloud definition allowing to specify vcenterPassword. */
        interface WithVcenterPassword {
            /**
             * Specifies the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud
             * is created.
             *
             * @param vcenterPassword Optionally, set the vCenter admin password when the private cloud is created.
             * @return the next definition stage.
             */
            WithCreate withVcenterPassword(String vcenterPassword);
        }
        /** The stage of the PrivateCloud definition allowing to specify nsxtPassword. */
        interface WithNsxtPassword {
            /**
             * Specifies the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is
             * created.
             *
             * @param nsxtPassword Optionally, set the NSX-T Manager password when the private cloud is created.
             * @return the next definition stage.
             */
            WithCreate withNsxtPassword(String nsxtPassword);
        }
        /** The stage of the PrivateCloud definition allowing to specify secondaryCircuit. */
        interface WithSecondaryCircuit {
            /**
             * Specifies the secondaryCircuit property: A secondary expressRoute circuit from a separate AZ. Only
             * present in a stretched private cloud.
             *
             * @param secondaryCircuit A secondary expressRoute circuit from a separate AZ. Only present in a stretched
             *     private cloud.
             * @return the next definition stage.
             */
            WithCreate withSecondaryCircuit(Circuit secondaryCircuit);
        }
        /** The stage of the PrivateCloud definition allowing to specify managementCluster. */
        interface WithManagementCluster {
            /**
             * Specifies the managementCluster property: The default cluster used for management.
             *
             * @param managementCluster The default cluster used for management.
             * @return the next definition stage.
             */
            WithCreate withManagementCluster(ManagementCluster managementCluster);
        }
        /** The stage of the PrivateCloud definition allowing to specify internet. */
        interface WithInternet {
            /**
             * Specifies the internet property: Connectivity to internet is enabled or disabled.
             *
             * @param internet Connectivity to internet is enabled or disabled.
             * @return the next definition stage.
             */
            WithCreate withInternet(InternetEnum internet);
        }
        /** The stage of the PrivateCloud definition allowing to specify identitySources. */
        interface WithIdentitySources {
            /**
             * Specifies the identitySources property: vCenter Single Sign On Identity Sources.
             *
             * @param identitySources vCenter Single Sign On Identity Sources.
             * @return the next definition stage.
             */
            WithCreate withIdentitySources(List<IdentitySource> identitySources);
        }
        /** The stage of the PrivateCloud definition allowing to specify availability. */
        interface WithAvailability {
            /**
             * Specifies the availability property: Properties describing how the cloud is distributed across
             * availability zones.
             *
             * @param availability Properties describing how the cloud is distributed across availability zones.
             * @return the next definition stage.
             */
            WithCreate withAvailability(AvailabilityProperties availability);
        }
        /** The stage of the PrivateCloud definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Customer managed key encryption, can be enabled or disabled.
             *
             * @param encryption Customer managed key encryption, can be enabled or disabled.
             * @return the next definition stage.
             */
            WithCreate withEncryption(Encryption encryption);
        }
    }
    /**
     * Begins update for the PrivateCloud resource.
     *
     * @return the stage of resource update.
     */
    PrivateCloud.Update update();

    /** The template for PrivateCloud update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithManagementCluster,
            UpdateStages.WithInternet,
            UpdateStages.WithIdentitySources,
            UpdateStages.WithAvailability,
            UpdateStages.WithEncryption {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateCloud apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateCloud apply(Context context);
    }
    /** The PrivateCloud update stages. */
    interface UpdateStages {
        /** The stage of the PrivateCloud update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PrivateCloud update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the private cloud, if configured..
             *
             * @param identity The identity of the private cloud, if configured.
             * @return the next definition stage.
             */
            Update withIdentity(PrivateCloudIdentity identity);
        }
        /** The stage of the PrivateCloud update allowing to specify managementCluster. */
        interface WithManagementCluster {
            /**
             * Specifies the managementCluster property: The default cluster used for management.
             *
             * @param managementCluster The default cluster used for management.
             * @return the next definition stage.
             */
            Update withManagementCluster(ManagementCluster managementCluster);
        }
        /** The stage of the PrivateCloud update allowing to specify internet. */
        interface WithInternet {
            /**
             * Specifies the internet property: Connectivity to internet is enabled or disabled.
             *
             * @param internet Connectivity to internet is enabled or disabled.
             * @return the next definition stage.
             */
            Update withInternet(InternetEnum internet);
        }
        /** The stage of the PrivateCloud update allowing to specify identitySources. */
        interface WithIdentitySources {
            /**
             * Specifies the identitySources property: vCenter Single Sign On Identity Sources.
             *
             * @param identitySources vCenter Single Sign On Identity Sources.
             * @return the next definition stage.
             */
            Update withIdentitySources(List<IdentitySource> identitySources);
        }
        /** The stage of the PrivateCloud update allowing to specify availability. */
        interface WithAvailability {
            /**
             * Specifies the availability property: Properties describing how the cloud is distributed across
             * availability zones.
             *
             * @param availability Properties describing how the cloud is distributed across availability zones.
             * @return the next definition stage.
             */
            Update withAvailability(AvailabilityProperties availability);
        }
        /** The stage of the PrivateCloud update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Customer managed key encryption, can be enabled or disabled.
             *
             * @param encryption Customer managed key encryption, can be enabled or disabled.
             * @return the next definition stage.
             */
            Update withEncryption(Encryption encryption);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateCloud refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateCloud refresh(Context context);

    /**
     * Rotate the vCenter password.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateVcenterPassword();

    /**
     * Rotate the vCenter password.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateVcenterPassword(Context context);

    /**
     * Rotate the NSX-T Manager password.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateNsxtPassword();

    /**
     * Rotate the NSX-T Manager password.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateNsxtPassword(Context context);

    /**
     * List the admin credentials for the private cloud.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return administrative credentials for accessing vCenter and NSX-T.
     */
    AdminCredentials listAdminCredentials();

    /**
     * List the admin credentials for the private cloud.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return administrative credentials for accessing vCenter and NSX-T.
     */
    Response<AdminCredentials> listAdminCredentialsWithResponse(Context context);
}
