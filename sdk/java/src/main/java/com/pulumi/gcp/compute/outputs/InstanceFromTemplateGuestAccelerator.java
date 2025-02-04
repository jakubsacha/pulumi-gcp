// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceFromTemplateGuestAccelerator {
    private final Integer count;
    private final String type;

    @CustomType.Constructor
    private InstanceFromTemplateGuestAccelerator(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("type") String type) {
        this.count = count;
        this.type = type;
    }

    public Integer count() {
        return this.count;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public InstanceFromTemplateGuestAccelerator build() {
            return new InstanceFromTemplateGuestAccelerator(count, type);
        }
    }
}
