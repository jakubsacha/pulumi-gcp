// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.AzureClusterLoggingConfigComponentConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureClusterLoggingConfig {
    /**
     * @return Configuration of the logging components.
     * 
     */
    private final @Nullable AzureClusterLoggingConfigComponentConfig componentConfig;

    @CustomType.Constructor
    private AzureClusterLoggingConfig(@CustomType.Parameter("componentConfig") @Nullable AzureClusterLoggingConfigComponentConfig componentConfig) {
        this.componentConfig = componentConfig;
    }

    /**
     * @return Configuration of the logging components.
     * 
     */
    public Optional<AzureClusterLoggingConfigComponentConfig> componentConfig() {
        return Optional.ofNullable(this.componentConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureClusterLoggingConfigComponentConfig componentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
        }

        public Builder componentConfig(@Nullable AzureClusterLoggingConfigComponentConfig componentConfig) {
            this.componentConfig = componentConfig;
            return this;
        }        public AzureClusterLoggingConfig build() {
            return new AzureClusterLoggingConfig(componentConfig);
        }
    }
}
