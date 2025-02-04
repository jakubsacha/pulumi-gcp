// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceEncryptionConfigArgs;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceHiveMetastoreConfigArgs;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceMaintenanceWindowArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceArgs Empty = new MetastoreServiceArgs();

    /**
     * Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<MetastoreServiceEncryptionConfigArgs> encryptionConfig;

    /**
     * @return Information used to configure the Dataproc Metastore service to encrypt
     * customer data at rest.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MetastoreServiceEncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * 
     */
    @Import(name="hiveMetastoreConfig")
    private @Nullable Output<MetastoreServiceHiveMetastoreConfigArgs> hiveMetastoreConfig;

    /**
     * @return Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MetastoreServiceHiveMetastoreConfigArgs>> hiveMetastoreConfig() {
        return Optional.ofNullable(this.hiveMetastoreConfig);
    }

    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the metastore service.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<MetastoreServiceMaintenanceWindowArgs> maintenanceWindow;

    /**
     * @return The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MetastoreServiceMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
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

    /**
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private MetastoreServiceArgs() {}

    private MetastoreServiceArgs(MetastoreServiceArgs $) {
        this.encryptionConfig = $.encryptionConfig;
        this.hiveMetastoreConfig = $.hiveMetastoreConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.maintenanceWindow = $.maintenanceWindow;
        this.network = $.network;
        this.port = $.port;
        this.project = $.project;
        this.serviceId = $.serviceId;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreServiceArgs $;

        public Builder() {
            $ = new MetastoreServiceArgs();
        }

        public Builder(MetastoreServiceArgs defaults) {
            $ = new MetastoreServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionConfig Information used to configure the Dataproc Metastore service to encrypt
         * customer data at rest.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<MetastoreServiceEncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Information used to configure the Dataproc Metastore service to encrypt
         * customer data at rest.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(MetastoreServiceEncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveMetastoreConfig(@Nullable Output<MetastoreServiceHiveMetastoreConfigArgs> hiveMetastoreConfig) {
            $.hiveMetastoreConfig = hiveMetastoreConfig;
            return this;
        }

        /**
         * @param hiveMetastoreConfig Configuration information specific to running Hive metastore software as the metastore service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveMetastoreConfig(MetastoreServiceHiveMetastoreConfigArgs hiveMetastoreConfig) {
            return hiveMetastoreConfig(Output.of(hiveMetastoreConfig));
        }

        /**
         * @param labels User-defined labels for the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the metastore service.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The  location where the autoscaling policy should reside.
         * The default value is `global`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The  location where the autoscaling policy should reside.
         * The default value is `global`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceWindow The one hour maintenance window of the metastore service.
         * This specifies when the service can be restarted for maintenance purposes in UTC time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<MetastoreServiceMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow The one hour maintenance window of the metastore service.
         * This specifies when the service can be restarted for maintenance purposes in UTC time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(MetastoreServiceMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param network The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
         * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
         * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param port The TCP port at which the metastore service is reached. Default: 9083.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port at which the metastore service is reached. Default: 9083.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
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

        /**
         * @param serviceId The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
         * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
         * 3 and 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
         * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
         * 3 and 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param tier The tier of the service.
         * Possible values are `DEVELOPER` and `ENTERPRISE`.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the service.
         * Possible values are `DEVELOPER` and `ENTERPRISE`.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public MetastoreServiceArgs build() {
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
