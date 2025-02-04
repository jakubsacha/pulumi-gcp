// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryBigqueryDateShardedSpec {
    private final @Nullable String dataset;
    private final @Nullable Integer shardCount;
    private final @Nullable String tablePrefix;

    @CustomType.Constructor
    private EntryBigqueryDateShardedSpec(
        @CustomType.Parameter("dataset") @Nullable String dataset,
        @CustomType.Parameter("shardCount") @Nullable Integer shardCount,
        @CustomType.Parameter("tablePrefix") @Nullable String tablePrefix) {
        this.dataset = dataset;
        this.shardCount = shardCount;
        this.tablePrefix = tablePrefix;
    }

    public Optional<String> dataset() {
        return Optional.ofNullable(this.dataset);
    }
    public Optional<Integer> shardCount() {
        return Optional.ofNullable(this.shardCount);
    }
    public Optional<String> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryDateShardedSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataset;
        private @Nullable Integer shardCount;
        private @Nullable String tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryDateShardedSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.shardCount = defaults.shardCount;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder dataset(@Nullable String dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder shardCount(@Nullable Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }        public EntryBigqueryDateShardedSpec build() {
            return new EntryBigqueryDateShardedSpec(dataset, shardCount, tablePrefix);
        }
    }
}
