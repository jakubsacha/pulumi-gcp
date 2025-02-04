// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryBigqueryTableSpecViewSpec {
    private final @Nullable String viewQuery;

    @CustomType.Constructor
    private EntryBigqueryTableSpecViewSpec(@CustomType.Parameter("viewQuery") @Nullable String viewQuery) {
        this.viewQuery = viewQuery;
    }

    public Optional<String> viewQuery() {
        return Optional.ofNullable(this.viewQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecViewSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecViewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder viewQuery(@Nullable String viewQuery) {
            this.viewQuery = viewQuery;
            return this;
        }        public EntryBigqueryTableSpecViewSpec build() {
            return new EntryBigqueryTableSpecViewSpec(viewQuery);
        }
    }
}
