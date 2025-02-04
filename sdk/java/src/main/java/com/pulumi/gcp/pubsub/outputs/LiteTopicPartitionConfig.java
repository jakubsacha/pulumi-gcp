// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.pubsub.outputs.LiteTopicPartitionConfigCapacity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiteTopicPartitionConfig {
    /**
     * @return The capacity configuration.
     * Structure is documented below.
     * 
     */
    private final @Nullable LiteTopicPartitionConfigCapacity capacity;
    /**
     * @return The number of partitions in the topic. Must be at least 1.
     * 
     */
    private final Integer count;

    @CustomType.Constructor
    private LiteTopicPartitionConfig(
        @CustomType.Parameter("capacity") @Nullable LiteTopicPartitionConfigCapacity capacity,
        @CustomType.Parameter("count") Integer count) {
        this.capacity = capacity;
        this.count = count;
    }

    /**
     * @return The capacity configuration.
     * Structure is documented below.
     * 
     */
    public Optional<LiteTopicPartitionConfigCapacity> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The number of partitions in the topic. Must be at least 1.
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiteTopicPartitionConfigCapacity capacity;
        private Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder capacity(@Nullable LiteTopicPartitionConfigCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }        public LiteTopicPartitionConfig build() {
            return new LiteTopicPartitionConfig(capacity, count);
        }
    }
}
