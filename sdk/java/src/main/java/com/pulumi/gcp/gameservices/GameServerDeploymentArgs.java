// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentArgs Empty = new GameServerDeploymentArgs();

    /**
     * A unique id for the deployment.
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return A unique id for the deployment.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    /**
     * Human readable description of the game server deployment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human readable description of the game server deployment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The labels associated with this game server deployment. Each label is a
     * key-value pair.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server deployment. Each label is a
     * key-value pair.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Location of the Deployment.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the Deployment.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GameServerDeploymentArgs() {}

    private GameServerDeploymentArgs(GameServerDeploymentArgs $) {
        this.deploymentId = $.deploymentId;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerDeploymentArgs $;

        public Builder() {
            $ = new GameServerDeploymentArgs();
        }

        public Builder(GameServerDeploymentArgs defaults) {
            $ = new GameServerDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId A unique id for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId A unique id for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param description Human readable description of the game server deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human readable description of the game server deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels The labels associated with this game server deployment. Each label is a
         * key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this game server deployment. Each label is a
         * key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Location of the Deployment.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the Deployment.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GameServerDeploymentArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            return $;
        }
    }

}
