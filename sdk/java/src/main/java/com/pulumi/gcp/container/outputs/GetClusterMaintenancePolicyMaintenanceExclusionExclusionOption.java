// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption {
    private final String scope;

    @CustomType.Constructor
    private GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption(@CustomType.Parameter("scope") String scope) {
        this.scope = scope;
    }

    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption build() {
            return new GetClusterMaintenancePolicyMaintenanceExclusionExclusionOption(scope);
        }
    }
}
