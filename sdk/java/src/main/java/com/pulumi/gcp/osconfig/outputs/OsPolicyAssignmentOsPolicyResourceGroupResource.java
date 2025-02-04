// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExec;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFile;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkg;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepository;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResource {
    /**
     * @return Exec resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec;
    /**
     * @return A remote or local source.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file;
    /**
     * @return Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    private final String id;
    /**
     * @return Package resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg;
    /**
     * @return Package repository resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResource(
        @CustomType.Parameter("exec") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec,
        @CustomType.Parameter("file") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("pkg") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg,
        @CustomType.Parameter("repository") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository) {
        this.exec = exec;
        this.file = file;
        this.id = id;
        this.pkg = pkg;
        this.repository = repository;
    }

    /**
     * @return Exec resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExec> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return A remote or local source.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * @return Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Package resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkg> pkg() {
        return Optional.ofNullable(this.pkg);
    }
    /**
     * @return Package repository resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepository> repository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file;
        private String id;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.id = defaults.id;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder exec(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec) {
            this.exec = exec;
            return this;
        }
        public Builder file(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file) {
            this.file = file;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder pkg(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg) {
            this.pkg = pkg;
            return this;
        }
        public Builder repository(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository) {
            this.repository = repository;
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResource build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResource(exec, file, id, pkg, repository);
        }
    }
}
