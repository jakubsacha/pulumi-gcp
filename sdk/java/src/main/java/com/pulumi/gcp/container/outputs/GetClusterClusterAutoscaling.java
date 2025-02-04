// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.GetClusterClusterAutoscalingAutoProvisioningDefault;
import com.pulumi.gcp.container.outputs.GetClusterClusterAutoscalingResourceLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterClusterAutoscaling {
    private final List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;
    private final String autoscalingProfile;
    private final Boolean enabled;
    private final List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

    @CustomType.Constructor
    private GetClusterClusterAutoscaling(
        @CustomType.Parameter("autoProvisioningDefaults") List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults,
        @CustomType.Parameter("autoscalingProfile") String autoscalingProfile,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("resourceLimits") List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
        this.autoProvisioningDefaults = autoProvisioningDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enabled = enabled;
        this.resourceLimits = resourceLimits;
    }

    public List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults() {
        return this.autoProvisioningDefaults;
    }
    public String autoscalingProfile() {
        return this.autoscalingProfile;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public List<GetClusterClusterAutoscalingResourceLimit> resourceLimits() {
        return this.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;
        private String autoscalingProfile;
        private Boolean enabled;
        private List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoProvisioningDefaults(List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults) {
            this.autoProvisioningDefaults = Objects.requireNonNull(autoProvisioningDefaults);
            return this;
        }
        public Builder autoProvisioningDefaults(GetClusterClusterAutoscalingAutoProvisioningDefault... autoProvisioningDefaults) {
            return autoProvisioningDefaults(List.of(autoProvisioningDefaults));
        }
        public Builder autoscalingProfile(String autoscalingProfile) {
            this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder resourceLimits(List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
            this.resourceLimits = Objects.requireNonNull(resourceLimits);
            return this;
        }
        public Builder resourceLimits(GetClusterClusterAutoscalingResourceLimit... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }        public GetClusterClusterAutoscaling build() {
            return new GetClusterClusterAutoscaling(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
