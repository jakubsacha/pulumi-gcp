// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


public final class MetricBucketOptionsExplicitBucketsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsExplicitBucketsArgs Empty = new MetricBucketOptionsExplicitBucketsArgs();

    /**
     * The values must be monotonically increasing.
     * 
     */
    @Import(name="bounds", required=true)
    private Output<List<Double>> bounds;

    /**
     * @return The values must be monotonically increasing.
     * 
     */
    public Output<List<Double>> bounds() {
        return this.bounds;
    }

    private MetricBucketOptionsExplicitBucketsArgs() {}

    private MetricBucketOptionsExplicitBucketsArgs(MetricBucketOptionsExplicitBucketsArgs $) {
        this.bounds = $.bounds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricBucketOptionsExplicitBucketsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricBucketOptionsExplicitBucketsArgs $;

        public Builder() {
            $ = new MetricBucketOptionsExplicitBucketsArgs();
        }

        public Builder(MetricBucketOptionsExplicitBucketsArgs defaults) {
            $ = new MetricBucketOptionsExplicitBucketsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bounds The values must be monotonically increasing.
         * 
         * @return builder
         * 
         */
        public Builder bounds(Output<List<Double>> bounds) {
            $.bounds = bounds;
            return this;
        }

        /**
         * @param bounds The values must be monotonically increasing.
         * 
         * @return builder
         * 
         */
        public Builder bounds(List<Double> bounds) {
            return bounds(Output.of(bounds));
        }

        /**
         * @param bounds The values must be monotonically increasing.
         * 
         * @return builder
         * 
         */
        public Builder bounds(Double... bounds) {
            return bounds(List.of(bounds));
        }

        public MetricBucketOptionsExplicitBucketsArgs build() {
            $.bounds = Objects.requireNonNull($.bounds, "expected parameter 'bounds' to be non-null");
            return $;
        }
    }

}
