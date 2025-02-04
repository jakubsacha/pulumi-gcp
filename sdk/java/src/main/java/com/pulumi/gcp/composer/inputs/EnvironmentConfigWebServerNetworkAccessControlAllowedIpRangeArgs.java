// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs Empty = new EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs() {}

    private EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs(EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs $) {
        this.description = $.description;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs $;

        public Builder() {
            $ = new EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs();
        }

        public Builder(EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs defaults) {
            $ = new EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
