// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.endpoints.outputs.ServiceApiMethod;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceApi {
    private final @Nullable List<ServiceApiMethod> methods;
    private final @Nullable String name;
    private final @Nullable String syntax;
    private final @Nullable String version;

    @CustomType.Constructor
    private ServiceApi(
        @CustomType.Parameter("methods") @Nullable List<ServiceApiMethod> methods,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("syntax") @Nullable String syntax,
        @CustomType.Parameter("version") @Nullable String version) {
        this.methods = methods;
        this.name = name;
        this.syntax = syntax;
        this.version = version;
    }

    public List<ServiceApiMethod> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> syntax() {
        return Optional.ofNullable(this.syntax);
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceApiMethod> methods;
        private @Nullable String name;
        private @Nullable String syntax;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.name = defaults.name;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder methods(@Nullable List<ServiceApiMethod> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(ServiceApiMethod... methods) {
            return methods(List.of(methods));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder syntax(@Nullable String syntax) {
            this.syntax = syntax;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ServiceApi build() {
            return new ServiceApi(methods, name, syntax, version);
        }
    }
}
