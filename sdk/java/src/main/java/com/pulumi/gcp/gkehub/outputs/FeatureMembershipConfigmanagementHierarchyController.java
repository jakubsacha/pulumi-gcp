// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipConfigmanagementHierarchyController {
    /**
     * @return Whether hierarchical resource quota is enabled in this cluster.
     * 
     */
    private final @Nullable Boolean enableHierarchicalResourceQuota;
    /**
     * @return Whether pod tree labels are enabled in this cluster.
     * 
     */
    private final @Nullable Boolean enablePodTreeLabels;
    /**
     * @return Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private FeatureMembershipConfigmanagementHierarchyController(
        @CustomType.Parameter("enableHierarchicalResourceQuota") @Nullable Boolean enableHierarchicalResourceQuota,
        @CustomType.Parameter("enablePodTreeLabels") @Nullable Boolean enablePodTreeLabels,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
        this.enablePodTreeLabels = enablePodTreeLabels;
        this.enabled = enabled;
    }

    /**
     * @return Whether hierarchical resource quota is enabled in this cluster.
     * 
     */
    public Optional<Boolean> enableHierarchicalResourceQuota() {
        return Optional.ofNullable(this.enableHierarchicalResourceQuota);
    }
    /**
     * @return Whether pod tree labels are enabled in this cluster.
     * 
     */
    public Optional<Boolean> enablePodTreeLabels() {
        return Optional.ofNullable(this.enablePodTreeLabels);
    }
    /**
     * @return Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementHierarchyController defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableHierarchicalResourceQuota;
        private @Nullable Boolean enablePodTreeLabels;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementHierarchyController defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHierarchicalResourceQuota = defaults.enableHierarchicalResourceQuota;
    	      this.enablePodTreeLabels = defaults.enablePodTreeLabels;
    	      this.enabled = defaults.enabled;
        }

        public Builder enableHierarchicalResourceQuota(@Nullable Boolean enableHierarchicalResourceQuota) {
            this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
            return this;
        }
        public Builder enablePodTreeLabels(@Nullable Boolean enablePodTreeLabels) {
            this.enablePodTreeLabels = enablePodTreeLabels;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public FeatureMembershipConfigmanagementHierarchyController build() {
            return new FeatureMembershipConfigmanagementHierarchyController(enableHierarchicalResourceQuota, enablePodTreeLabels, enabled);
        }
    }
}
