// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigLinuxNodeConfig {
    private final Map<String,String> sysctls;

    @CustomType.Constructor
    private NodePoolNodeConfigLinuxNodeConfig(@CustomType.Parameter("sysctls") Map<String,String> sysctls) {
        this.sysctls = sysctls;
    }

    public Map<String,String> sysctls() {
        return this.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigLinuxNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigLinuxNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }        public NodePoolNodeConfigLinuxNodeConfig build() {
            return new NodePoolNodeConfigLinuxNodeConfig(sysctls);
        }
    }
}
