// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.logging.outputs.MetricBucketOptionsExplicitBuckets;
import com.pulumi.gcp.logging.outputs.MetricBucketOptionsExponentialBuckets;
import com.pulumi.gcp.logging.outputs.MetricBucketOptionsLinearBuckets;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricBucketOptions {
    /**
     * @return Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets;
    /**
     * @return Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets;
    /**
     * @return Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * 
     */
    private final @Nullable MetricBucketOptionsLinearBuckets linearBuckets;

    @CustomType.Constructor
    private MetricBucketOptions(
        @CustomType.Parameter("explicitBuckets") @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets,
        @CustomType.Parameter("exponentialBuckets") @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets,
        @CustomType.Parameter("linearBuckets") @Nullable MetricBucketOptionsLinearBuckets linearBuckets) {
        this.explicitBuckets = explicitBuckets;
        this.exponentialBuckets = exponentialBuckets;
        this.linearBuckets = linearBuckets;
    }

    /**
     * @return Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * 
     */
    public Optional<MetricBucketOptionsExplicitBuckets> explicitBuckets() {
        return Optional.ofNullable(this.explicitBuckets);
    }
    /**
     * @return Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * 
     */
    public Optional<MetricBucketOptionsExponentialBuckets> exponentialBuckets() {
        return Optional.ofNullable(this.exponentialBuckets);
    }
    /**
     * @return Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * 
     */
    public Optional<MetricBucketOptionsLinearBuckets> linearBuckets() {
        return Optional.ofNullable(this.linearBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MetricBucketOptionsExplicitBuckets explicitBuckets;
        private @Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets;
        private @Nullable MetricBucketOptionsLinearBuckets linearBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.explicitBuckets = defaults.explicitBuckets;
    	      this.exponentialBuckets = defaults.exponentialBuckets;
    	      this.linearBuckets = defaults.linearBuckets;
        }

        public Builder explicitBuckets(@Nullable MetricBucketOptionsExplicitBuckets explicitBuckets) {
            this.explicitBuckets = explicitBuckets;
            return this;
        }
        public Builder exponentialBuckets(@Nullable MetricBucketOptionsExponentialBuckets exponentialBuckets) {
            this.exponentialBuckets = exponentialBuckets;
            return this;
        }
        public Builder linearBuckets(@Nullable MetricBucketOptionsLinearBuckets linearBuckets) {
            this.linearBuckets = linearBuckets;
            return this;
        }        public MetricBucketOptions build() {
            return new MetricBucketOptions(explicitBuckets, exponentialBuckets, linearBuckets);
        }
    }
}
