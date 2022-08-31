// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Profile of network configuration. */
@Fluent
public final class ContainerServiceNetworkProfile {
    /*
     * Network plugin used for building the Kubernetes network.
     */
    @JsonProperty(value = "networkPlugin")
    private NetworkPlugin networkPlugin;

    /*
     * Network policy used for building the Kubernetes network.
     */
    @JsonProperty(value = "networkPolicy")
    private NetworkPolicy networkPolicy;

    /*
     * The network mode Azure CNI is configured with.
     *
     * This cannot be specified if networkPlugin is anything other than 'azure'.
     */
    @JsonProperty(value = "networkMode")
    private NetworkMode networkMode;

    /*
     * A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     */
    @JsonProperty(value = "podCidr")
    private String podCidr;

    /*
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP
     * ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range
     * specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIp;

    /*
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or
     * the Kubernetes service address range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /*
     * The outbound (egress) routing method.
     *
     * This can only be set at cluster creation time and cannot be changed later. For more information see [egress
     * outbound type](https://docs.microsoft.com/azure/aks/egress-outboundtype).
     */
    @JsonProperty(value = "outboundType")
    private OutboundType outboundType;

    /*
     * The load balancer sku for the managed cluster.
     *
     * The default is 'standard'. See [Azure Load Balancer SKUs](https://docs.microsoft.com/azure/load-balancer/skus)
     * for more information about the differences between load balancer SKUs.
     */
    @JsonProperty(value = "loadBalancerSku")
    private LoadBalancerSku loadBalancerSku;

    /*
     * Profile of the cluster load balancer.
     */
    @JsonProperty(value = "loadBalancerProfile")
    private ManagedClusterLoadBalancerProfile loadBalancerProfile;

    /*
     * Profile of the cluster NAT gateway.
     */
    @JsonProperty(value = "natGatewayProfile")
    private ManagedClusterNatGatewayProfile natGatewayProfile;

    /*
     * The CIDR notation IP ranges from which to assign pod IPs.
     *
     * One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking.
     */
    @JsonProperty(value = "podCidrs")
    private List<String> podCidrs;

    /*
     * The CIDR notation IP ranges from which to assign service cluster IPs.
     *
     * One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking. They must not overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidrs")
    private List<String> serviceCidrs;

    /*
     * The IP families used to specify IP versions available to the cluster.
     *
     * IP families are used to determine single-stack or dual-stack clusters. For single-stack, the expected value is
     * IPv4. For dual-stack, the expected values are IPv4 and IPv6.
     */
    @JsonProperty(value = "ipFamilies")
    private List<IpFamily> ipFamilies;

    /**
     * Get the networkPlugin property: Network plugin used for building the Kubernetes network.
     *
     * @return the networkPlugin value.
     */
    public NetworkPlugin networkPlugin() {
        return this.networkPlugin;
    }

    /**
     * Set the networkPlugin property: Network plugin used for building the Kubernetes network.
     *
     * @param networkPlugin the networkPlugin value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPlugin(NetworkPlugin networkPlugin) {
        this.networkPlugin = networkPlugin;
        return this;
    }

    /**
     * Get the networkPolicy property: Network policy used for building the Kubernetes network.
     *
     * @return the networkPolicy value.
     */
    public NetworkPolicy networkPolicy() {
        return this.networkPolicy;
    }

    /**
     * Set the networkPolicy property: Network policy used for building the Kubernetes network.
     *
     * @param networkPolicy the networkPolicy value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    /**
     * Get the networkMode property: The network mode Azure CNI is configured with.
     *
     * <p>This cannot be specified if networkPlugin is anything other than 'azure'.
     *
     * @return the networkMode value.
     */
    public NetworkMode networkMode() {
        return this.networkMode;
    }

    /**
     * Set the networkMode property: The network mode Azure CNI is configured with.
     *
     * <p>This cannot be specified if networkPlugin is anything other than 'azure'.
     *
     * @param networkMode the networkMode value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * Get the podCidr property: A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @return the podCidr value.
     */
    public String podCidr() {
        return this.podCidr;
    }

    /**
     * Set the podCidr property: A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @param podCidr the podCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withPodCidr(String podCidr) {
        this.podCidr = podCidr;
        return this;
    }

    /**
     * Get the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the dnsServiceIp property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIp value.
     */
    public String dnsServiceIp() {
        return this.dnsServiceIp;
    }

    /**
     * Set the dnsServiceIp property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIp the dnsServiceIp value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDnsServiceIp(String dnsServiceIp) {
        this.dnsServiceIp = dnsServiceIp;
        return this;
    }

    /**
     * Get the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @return the dockerBridgeCidr value.
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

    /**
     * Get the outboundType property: The outbound (egress) routing method.
     *
     * <p>This can only be set at cluster creation time and cannot be changed later. For more information see [egress
     * outbound type](https://docs.microsoft.com/azure/aks/egress-outboundtype).
     *
     * @return the outboundType value.
     */
    public OutboundType outboundType() {
        return this.outboundType;
    }

    /**
     * Set the outboundType property: The outbound (egress) routing method.
     *
     * <p>This can only be set at cluster creation time and cannot be changed later. For more information see [egress
     * outbound type](https://docs.microsoft.com/azure/aks/egress-outboundtype).
     *
     * @param outboundType the outboundType value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withOutboundType(OutboundType outboundType) {
        this.outboundType = outboundType;
        return this;
    }

    /**
     * Get the loadBalancerSku property: The load balancer sku for the managed cluster.
     *
     * <p>The default is 'standard'. See [Azure Load Balancer SKUs](https://docs.microsoft.com/azure/load-balancer/skus)
     * for more information about the differences between load balancer SKUs.
     *
     * @return the loadBalancerSku value.
     */
    public LoadBalancerSku loadBalancerSku() {
        return this.loadBalancerSku;
    }

    /**
     * Set the loadBalancerSku property: The load balancer sku for the managed cluster.
     *
     * <p>The default is 'standard'. See [Azure Load Balancer SKUs](https://docs.microsoft.com/azure/load-balancer/skus)
     * for more information about the differences between load balancer SKUs.
     *
     * @param loadBalancerSku the loadBalancerSku value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerSku(LoadBalancerSku loadBalancerSku) {
        this.loadBalancerSku = loadBalancerSku;
        return this;
    }

    /**
     * Get the loadBalancerProfile property: Profile of the cluster load balancer.
     *
     * @return the loadBalancerProfile value.
     */
    public ManagedClusterLoadBalancerProfile loadBalancerProfile() {
        return this.loadBalancerProfile;
    }

    /**
     * Set the loadBalancerProfile property: Profile of the cluster load balancer.
     *
     * @param loadBalancerProfile the loadBalancerProfile value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withLoadBalancerProfile(
        ManagedClusterLoadBalancerProfile loadBalancerProfile) {
        this.loadBalancerProfile = loadBalancerProfile;
        return this;
    }

    /**
     * Get the natGatewayProfile property: Profile of the cluster NAT gateway.
     *
     * @return the natGatewayProfile value.
     */
    public ManagedClusterNatGatewayProfile natGatewayProfile() {
        return this.natGatewayProfile;
    }

    /**
     * Set the natGatewayProfile property: Profile of the cluster NAT gateway.
     *
     * @param natGatewayProfile the natGatewayProfile value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withNatGatewayProfile(ManagedClusterNatGatewayProfile natGatewayProfile) {
        this.natGatewayProfile = natGatewayProfile;
        return this;
    }

    /**
     * Get the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs.
     *
     * <p>One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking.
     *
     * @return the podCidrs value.
     */
    public List<String> podCidrs() {
        return this.podCidrs;
    }

    /**
     * Set the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs.
     *
     * <p>One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking.
     *
     * @param podCidrs the podCidrs value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withPodCidrs(List<String> podCidrs) {
        this.podCidrs = podCidrs;
        return this;
    }

    /**
     * Get the serviceCidrs property: The CIDR notation IP ranges from which to assign service cluster IPs.
     *
     * <p>One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking. They must not overlap with any Subnet IP ranges.
     *
     * @return the serviceCidrs value.
     */
    public List<String> serviceCidrs() {
        return this.serviceCidrs;
    }

    /**
     * Set the serviceCidrs property: The CIDR notation IP ranges from which to assign service cluster IPs.
     *
     * <p>One IPv4 CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is
     * expected for dual-stack networking. They must not overlap with any Subnet IP ranges.
     *
     * @param serviceCidrs the serviceCidrs value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withServiceCidrs(List<String> serviceCidrs) {
        this.serviceCidrs = serviceCidrs;
        return this;
    }

    /**
     * Get the ipFamilies property: The IP families used to specify IP versions available to the cluster.
     *
     * <p>IP families are used to determine single-stack or dual-stack clusters. For single-stack, the expected value is
     * IPv4. For dual-stack, the expected values are IPv4 and IPv6.
     *
     * @return the ipFamilies value.
     */
    public List<IpFamily> ipFamilies() {
        return this.ipFamilies;
    }

    /**
     * Set the ipFamilies property: The IP families used to specify IP versions available to the cluster.
     *
     * <p>IP families are used to determine single-stack or dual-stack clusters. For single-stack, the expected value is
     * IPv4. For dual-stack, the expected values are IPv4 and IPv6.
     *
     * @param ipFamilies the ipFamilies value to set.
     * @return the ContainerServiceNetworkProfile object itself.
     */
    public ContainerServiceNetworkProfile withIpFamilies(List<IpFamily> ipFamilies) {
        this.ipFamilies = ipFamilies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancerProfile() != null) {
            loadBalancerProfile().validate();
        }
        if (natGatewayProfile() != null) {
            natGatewayProfile().validate();
        }
    }
}
