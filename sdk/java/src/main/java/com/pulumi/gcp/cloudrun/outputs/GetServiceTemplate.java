// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateMetadata;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpec;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplate {
    private final List<GetServiceTemplateMetadata> metadatas;
    private final List<GetServiceTemplateSpec> specs;

    @CustomType.Constructor
    private GetServiceTemplate(
        @CustomType.Parameter("metadatas") List<GetServiceTemplateMetadata> metadatas,
        @CustomType.Parameter("specs") List<GetServiceTemplateSpec> specs) {
        this.metadatas = metadatas;
        this.specs = specs;
    }

    public List<GetServiceTemplateMetadata> metadatas() {
        return this.metadatas;
    }
    public List<GetServiceTemplateSpec> specs() {
        return this.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateMetadata> metadatas;
        private List<GetServiceTemplateSpec> specs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.specs = defaults.specs;
        }

        public Builder metadatas(List<GetServiceTemplateMetadata> metadatas) {
            this.metadatas = Objects.requireNonNull(metadatas);
            return this;
        }
        public Builder metadatas(GetServiceTemplateMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        public Builder specs(List<GetServiceTemplateSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }
        public Builder specs(GetServiceTemplateSpec... specs) {
            return specs(List.of(specs));
        }        public GetServiceTemplate build() {
            return new GetServiceTemplate(metadatas, specs);
        }
    }
}
