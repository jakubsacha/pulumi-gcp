// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final IAMPolicyState Empty = new IAMPolicyState();

    /**
     * (Computed) The etag of the project&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the project&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the project. The policy will be
     * merged with any existing policy applied to the project.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    /**
     * @return The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the project. The policy will be
     * merged with any existing policy applied to the project.
     * 
     */
    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    /**
     * The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project id of the target project. This is not
     * inferred from the provider.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private IAMPolicyState() {}

    private IAMPolicyState(IAMPolicyState $) {
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMPolicyState $;

        public Builder() {
            $ = new IAMPolicyState();
        }

        public Builder(IAMPolicyState defaults) {
            $ = new IAMPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag (Computed) The etag of the project&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the project&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the project. The policy will be
         * merged with any existing policy applied to the project.
         * 
         * @return builder
         * 
         */
        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the project. The policy will be
         * merged with any existing policy applied to the project.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The project id of the target project. This is not
         * inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project id of the target project. This is not
         * inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public IAMPolicyState build() {
            return $;
        }
    }

}
