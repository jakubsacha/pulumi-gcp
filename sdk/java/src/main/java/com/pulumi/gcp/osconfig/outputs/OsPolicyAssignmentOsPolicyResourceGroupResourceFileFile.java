// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile {
    /**
     * @return Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    private final @Nullable Boolean allowInsecure;
    /**
     * @return A Cloud Storage object.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs gcs;
    /**
     * @return A local path within the VM to use.
     * 
     */
    private final @Nullable String localPath;
    /**
     * @return A generic remote file.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote remote;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile(
        @CustomType.Parameter("allowInsecure") @Nullable Boolean allowInsecure,
        @CustomType.Parameter("gcs") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs gcs,
        @CustomType.Parameter("localPath") @Nullable String localPath,
        @CustomType.Parameter("remote") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    /**
     * @return Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    public Optional<Boolean> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }
    /**
     * @return A Cloud Storage object.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    /**
     * @return A local path within the VM to use.
     * 
     */
    public Optional<String> localPath() {
        return Optional.ofNullable(this.localPath);
    }
    /**
     * @return A generic remote file.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote> remote() {
        return Optional.ofNullable(this.remote);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInsecure;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs gcs;
        private @Nullable String localPath;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }
        public Builder gcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder localPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }
        public Builder remote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemote remote) {
            this.remote = remote;
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFile(allowInsecure, gcs, localPath, remote);
        }
    }
}
