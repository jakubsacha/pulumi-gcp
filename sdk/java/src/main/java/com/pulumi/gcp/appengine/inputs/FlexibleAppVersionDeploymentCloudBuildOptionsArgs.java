// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentCloudBuildOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentCloudBuildOptionsArgs Empty = new FlexibleAppVersionDeploymentCloudBuildOptionsArgs();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.
     * 
     */
    @Import(name="appYamlPath", required=true)
    private Output<String> appYamlPath;

    /**
     * @return Path to the yaml file used in deployment, used to determine runtime configuration details.
     * 
     */
    public Output<String> appYamlPath() {
        return this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="cloudBuildTimeout")
    private @Nullable Output<String> cloudBuildTimeout;

    /**
     * @return The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> cloudBuildTimeout() {
        return Optional.ofNullable(this.cloudBuildTimeout);
    }

    private FlexibleAppVersionDeploymentCloudBuildOptionsArgs() {}

    private FlexibleAppVersionDeploymentCloudBuildOptionsArgs(FlexibleAppVersionDeploymentCloudBuildOptionsArgs $) {
        this.appYamlPath = $.appYamlPath;
        this.cloudBuildTimeout = $.cloudBuildTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionDeploymentCloudBuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionDeploymentCloudBuildOptionsArgs $;

        public Builder() {
            $ = new FlexibleAppVersionDeploymentCloudBuildOptionsArgs();
        }

        public Builder(FlexibleAppVersionDeploymentCloudBuildOptionsArgs defaults) {
            $ = new FlexibleAppVersionDeploymentCloudBuildOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appYamlPath Path to the yaml file used in deployment, used to determine runtime configuration details.
         * 
         * @return builder
         * 
         */
        public Builder appYamlPath(Output<String> appYamlPath) {
            $.appYamlPath = appYamlPath;
            return this;
        }

        /**
         * @param appYamlPath Path to the yaml file used in deployment, used to determine runtime configuration details.
         * 
         * @return builder
         * 
         */
        public Builder appYamlPath(String appYamlPath) {
            return appYamlPath(Output.of(appYamlPath));
        }

        /**
         * @param cloudBuildTimeout The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cloudBuildTimeout(@Nullable Output<String> cloudBuildTimeout) {
            $.cloudBuildTimeout = cloudBuildTimeout;
            return this;
        }

        /**
         * @param cloudBuildTimeout The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cloudBuildTimeout(String cloudBuildTimeout) {
            return cloudBuildTimeout(Output.of(cloudBuildTimeout));
        }

        public FlexibleAppVersionDeploymentCloudBuildOptionsArgs build() {
            $.appYamlPath = Objects.requireNonNull($.appYamlPath, "expected parameter 'appYamlPath' to be non-null");
            return $;
        }
    }

}
