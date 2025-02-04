// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PacketMirroringFilter {
    /**
     * @return IP CIDR ranges that apply as a filter on the source (ingress) or
     * destination (egress) IP in the IP header. Only IPv4 is supported.
     * 
     */
    private final @Nullable List<String> cidrRanges;
    /**
     * @return Direction of traffic to mirror.
     * Default value is `BOTH`.
     * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
     * 
     */
    private final @Nullable String direction;
    /**
     * @return Protocols that apply as a filter on mirrored traffic.
     * Each value may be one of `tcp`, `udp`, and `icmp`.
     * 
     */
    private final @Nullable List<String> ipProtocols;

    @CustomType.Constructor
    private PacketMirroringFilter(
        @CustomType.Parameter("cidrRanges") @Nullable List<String> cidrRanges,
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("ipProtocols") @Nullable List<String> ipProtocols) {
        this.cidrRanges = cidrRanges;
        this.direction = direction;
        this.ipProtocols = ipProtocols;
    }

    /**
     * @return IP CIDR ranges that apply as a filter on the source (ingress) or
     * destination (egress) IP in the IP header. Only IPv4 is supported.
     * 
     */
    public List<String> cidrRanges() {
        return this.cidrRanges == null ? List.of() : this.cidrRanges;
    }
    /**
     * @return Direction of traffic to mirror.
     * Default value is `BOTH`.
     * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Protocols that apply as a filter on mirrored traffic.
     * Each value may be one of `tcp`, `udp`, and `icmp`.
     * 
     */
    public List<String> ipProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cidrRanges;
        private @Nullable String direction;
        private @Nullable List<String> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder cidrRanges(@Nullable List<String> cidrRanges) {
            this.cidrRanges = cidrRanges;
            return this;
        }
        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }        public PacketMirroringFilter build() {
            return new PacketMirroringFilter(cidrRanges, direction, ipProtocols);
        }
    }
}
