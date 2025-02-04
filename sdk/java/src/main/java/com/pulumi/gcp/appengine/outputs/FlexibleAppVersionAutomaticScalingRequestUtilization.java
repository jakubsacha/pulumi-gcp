// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionAutomaticScalingRequestUtilization {
    /**
     * @return Target number of concurrent requests.
     * 
     */
    private final @Nullable Double targetConcurrentRequests;
    /**
     * @return Target requests per second.
     * 
     */
    private final @Nullable String targetRequestCountPerSecond;

    @CustomType.Constructor
    private FlexibleAppVersionAutomaticScalingRequestUtilization(
        @CustomType.Parameter("targetConcurrentRequests") @Nullable Double targetConcurrentRequests,
        @CustomType.Parameter("targetRequestCountPerSecond") @Nullable String targetRequestCountPerSecond) {
        this.targetConcurrentRequests = targetConcurrentRequests;
        this.targetRequestCountPerSecond = targetRequestCountPerSecond;
    }

    /**
     * @return Target number of concurrent requests.
     * 
     */
    public Optional<Double> targetConcurrentRequests() {
        return Optional.ofNullable(this.targetConcurrentRequests);
    }
    /**
     * @return Target requests per second.
     * 
     */
    public Optional<String> targetRequestCountPerSecond() {
        return Optional.ofNullable(this.targetRequestCountPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingRequestUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double targetConcurrentRequests;
        private @Nullable String targetRequestCountPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingRequestUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConcurrentRequests = defaults.targetConcurrentRequests;
    	      this.targetRequestCountPerSecond = defaults.targetRequestCountPerSecond;
        }

        public Builder targetConcurrentRequests(@Nullable Double targetConcurrentRequests) {
            this.targetConcurrentRequests = targetConcurrentRequests;
            return this;
        }
        public Builder targetRequestCountPerSecond(@Nullable String targetRequestCountPerSecond) {
            this.targetRequestCountPerSecond = targetRequestCountPerSecond;
            return this;
        }        public FlexibleAppVersionAutomaticScalingRequestUtilization build() {
            return new FlexibleAppVersionAutomaticScalingRequestUtilization(targetConcurrentRequests, targetRequestCountPerSecond);
        }
    }
}
