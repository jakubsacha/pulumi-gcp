// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigScheduler;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWebServer;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWorker;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigWorkloadsConfig {
    private final List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
    private final List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
    private final List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

    @CustomType.Constructor
    private GetEnvironmentConfigWorkloadsConfig(
        @CustomType.Parameter("schedulers") List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers,
        @CustomType.Parameter("webServers") List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers,
        @CustomType.Parameter("workers") List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
        this.schedulers = schedulers;
        this.webServers = webServers;
        this.workers = workers;
    }

    public List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers() {
        return this.schedulers;
    }
    public List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers() {
        return this.webServers;
    }
    public List<GetEnvironmentConfigWorkloadsConfigWorker> workers() {
        return this.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
        private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
        private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulers = defaults.schedulers;
    	      this.webServers = defaults.webServers;
    	      this.workers = defaults.workers;
        }

        public Builder schedulers(List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers) {
            this.schedulers = Objects.requireNonNull(schedulers);
            return this;
        }
        public Builder schedulers(GetEnvironmentConfigWorkloadsConfigScheduler... schedulers) {
            return schedulers(List.of(schedulers));
        }
        public Builder webServers(List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers) {
            this.webServers = Objects.requireNonNull(webServers);
            return this;
        }
        public Builder webServers(GetEnvironmentConfigWorkloadsConfigWebServer... webServers) {
            return webServers(List.of(webServers));
        }
        public Builder workers(List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
            this.workers = Objects.requireNonNull(workers);
            return this;
        }
        public Builder workers(GetEnvironmentConfigWorkloadsConfigWorker... workers) {
            return workers(List.of(workers));
        }        public GetEnvironmentConfigWorkloadsConfig build() {
            return new GetEnvironmentConfigWorkloadsConfig(schedulers, webServers, workers);
        }
    }
}
