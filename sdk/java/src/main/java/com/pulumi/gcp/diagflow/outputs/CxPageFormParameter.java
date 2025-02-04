// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageFormParameterFillBehavior;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageFormParameter {
    /**
     * @return The human-readable name of the parameter, unique within the form.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/&lt;System Entity Type ID&gt; for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/entityTypes/&lt;Entity Type ID&gt; for developer entity types.
     * 
     */
    private final @Nullable String entityType;
    /**
     * @return Defines fill behavior for the parameter.
     * Structure is documented below.
     * 
     */
    private final @Nullable CxPageFormParameterFillBehavior fillBehavior;
    /**
     * @return Indicates whether the parameter represents a list of values.
     * 
     */
    private final @Nullable Boolean isList;
    /**
     * @return Indicates whether the parameter content should be redacted in log.
     * If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    private final @Nullable Boolean redact;
    /**
     * @return Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them.
     * Required parameters must be filled before form filling concludes.
     * 
     */
    private final @Nullable Boolean required;

    @CustomType.Constructor
    private CxPageFormParameter(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("entityType") @Nullable String entityType,
        @CustomType.Parameter("fillBehavior") @Nullable CxPageFormParameterFillBehavior fillBehavior,
        @CustomType.Parameter("isList") @Nullable Boolean isList,
        @CustomType.Parameter("redact") @Nullable Boolean redact,
        @CustomType.Parameter("required") @Nullable Boolean required) {
        this.displayName = displayName;
        this.entityType = entityType;
        this.fillBehavior = fillBehavior;
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    /**
     * @return The human-readable name of the parameter, unique within the form.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/&lt;System Entity Type ID&gt; for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/entityTypes/&lt;Entity Type ID&gt; for developer entity types.
     * 
     */
    public Optional<String> entityType() {
        return Optional.ofNullable(this.entityType);
    }
    /**
     * @return Defines fill behavior for the parameter.
     * Structure is documented below.
     * 
     */
    public Optional<CxPageFormParameterFillBehavior> fillBehavior() {
        return Optional.ofNullable(this.fillBehavior);
    }
    /**
     * @return Indicates whether the parameter represents a list of values.
     * 
     */
    public Optional<Boolean> isList() {
        return Optional.ofNullable(this.isList);
    }
    /**
     * @return Indicates whether the parameter content should be redacted in log.
     * If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    public Optional<Boolean> redact() {
        return Optional.ofNullable(this.redact);
    }
    /**
     * @return Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them.
     * Required parameters must be filled before form filling concludes.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String entityType;
        private @Nullable CxPageFormParameterFillBehavior fillBehavior;
        private @Nullable Boolean isList;
        private @Nullable Boolean redact;
        private @Nullable Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder entityType(@Nullable String entityType) {
            this.entityType = entityType;
            return this;
        }
        public Builder fillBehavior(@Nullable CxPageFormParameterFillBehavior fillBehavior) {
            this.fillBehavior = fillBehavior;
            return this;
        }
        public Builder isList(@Nullable Boolean isList) {
            this.isList = isList;
            return this;
        }
        public Builder redact(@Nullable Boolean redact) {
            this.redact = redact;
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }        public CxPageFormParameter build() {
            return new CxPageFormParameter(displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}
