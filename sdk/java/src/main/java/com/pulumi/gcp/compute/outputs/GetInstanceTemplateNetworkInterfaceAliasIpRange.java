// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceTemplateNetworkInterfaceAliasIpRange {
    /**
     * @return The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    private final String ipCidrRange;
    /**
     * @return The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    private final String subnetworkRangeName;

    @CustomType.Constructor
    private GetInstanceTemplateNetworkInterfaceAliasIpRange(
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("subnetworkRangeName") String subnetworkRangeName) {
        this.ipCidrRange = ipCidrRange;
        this.subnetworkRangeName = subnetworkRangeName;
    }

    /**
     * @return The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    public String subnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder subnetworkRangeName(String subnetworkRangeName) {
            this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
            return this;
        }        public GetInstanceTemplateNetworkInterfaceAliasIpRange build() {
            return new GetInstanceTemplateNetworkInterfaceAliasIpRange(ipCidrRange, subnetworkRangeName);
        }
    }
}
