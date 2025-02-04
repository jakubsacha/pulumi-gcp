// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentTargetImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTargetImportArgs Empty = new DeploymentTargetImportArgs();

    /**
     * The full contents of the template that you want to import.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The full contents of the template that you want to import.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the template to import, as declared in the YAML
     * configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DeploymentTargetImportArgs() {}

    private DeploymentTargetImportArgs(DeploymentTargetImportArgs $) {
        this.content = $.content;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTargetImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTargetImportArgs $;

        public Builder() {
            $ = new DeploymentTargetImportArgs();
        }

        public Builder(DeploymentTargetImportArgs defaults) {
            $ = new DeploymentTargetImportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The full contents of the template that you want to import.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The full contents of the template that you want to import.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param name The name of the template to import, as declared in the YAML
         * configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the template to import, as declared in the YAML
         * configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DeploymentTargetImportArgs build() {
            return $;
        }
    }

}
