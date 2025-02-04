// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.organizations.outputs.GetIAMPolicyAuditConfigAuditLogConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIAMPolicyAuditConfig {
    /**
     * @return A nested block that defines the operations you&#39;d like to log.
     * 
     */
    private final List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;
    /**
     * @return Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private GetIAMPolicyAuditConfig(
        @CustomType.Parameter("auditLogConfigs") List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs,
        @CustomType.Parameter("service") String service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    /**
     * @return A nested block that defines the operations you&#39;d like to log.
     * 
     */
    public List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * @return Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyAuditConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyAuditConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(List<GetIAMPolicyAuditConfigAuditLogConfig> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }
        public Builder auditLogConfigs(GetIAMPolicyAuditConfigAuditLogConfig... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GetIAMPolicyAuditConfig build() {
            return new GetIAMPolicyAuditConfig(auditLogConfigs, service);
        }
    }
}
