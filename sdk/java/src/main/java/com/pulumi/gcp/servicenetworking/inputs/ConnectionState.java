// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Name of VPC network connected with service producers using VPC peering.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * (Computed) The name of the VPC Network Peering connection that was created by the service producer.
     * 
     */
    @Import(name="peering")
    private @Nullable Output<String> peering;

    /**
     * @return (Computed) The name of the VPC Network Peering connection that was created by the service producer.
     * 
     */
    public Optional<Output<String>> peering() {
        return Optional.ofNullable(this.peering);
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @Import(name="reservedPeeringRanges")
    private @Nullable Output<List<String>> reservedPeeringRanges;

    /**
     * @return Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    public Optional<Output<List<String>>> reservedPeeringRanges() {
        return Optional.ofNullable(this.reservedPeeringRanges);
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * &#39;servicenetworking.googleapis.com&#39;.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * &#39;servicenetworking.googleapis.com&#39;.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.network = $.network;
        this.peering = $.peering;
        this.reservedPeeringRanges = $.reservedPeeringRanges;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param network Name of VPC network connected with service producers using VPC peering.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Name of VPC network connected with service producers using VPC peering.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param peering (Computed) The name of the VPC Network Peering connection that was created by the service producer.
         * 
         * @return builder
         * 
         */
        public Builder peering(@Nullable Output<String> peering) {
            $.peering = peering;
            return this;
        }

        /**
         * @param peering (Computed) The name of the VPC Network Peering connection that was created by the service producer.
         * 
         * @return builder
         * 
         */
        public Builder peering(String peering) {
            return peering(Output.of(peering));
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(@Nullable Output<List<String>> reservedPeeringRanges) {
            $.reservedPeeringRanges = reservedPeeringRanges;
            return this;
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(List<String> reservedPeeringRanges) {
            return reservedPeeringRanges(Output.of(reservedPeeringRanges));
        }

        /**
         * @param reservedPeeringRanges Named IP address range(s) of PEERING type reserved for
         * this service provider. Note that invoking this method with a different range when connection
         * is already established will not reallocate already provisioned service producer subnetworks.
         * 
         * @return builder
         * 
         */
        public Builder reservedPeeringRanges(String... reservedPeeringRanges) {
            return reservedPeeringRanges(List.of(reservedPeeringRanges));
        }

        /**
         * @param service Provider peering service that is managing peering connectivity for a
         * service provider organization. For Google services that support this functionality it is
         * &#39;servicenetworking.googleapis.com&#39;.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Provider peering service that is managing peering connectivity for a
         * service provider organization. For Google services that support this functionality it is
         * &#39;servicenetworking.googleapis.com&#39;.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
