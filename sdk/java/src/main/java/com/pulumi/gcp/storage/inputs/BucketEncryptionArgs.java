// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionArgs Empty = new BucketEncryptionArgs();

    @Import(name="defaultKmsKeyName", required=true)
    private Output<String> defaultKmsKeyName;

    public Output<String> defaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    private BucketEncryptionArgs() {}

    private BucketEncryptionArgs(BucketEncryptionArgs $) {
        this.defaultKmsKeyName = $.defaultKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketEncryptionArgs $;

        public Builder() {
            $ = new BucketEncryptionArgs();
        }

        public Builder(BucketEncryptionArgs defaults) {
            $ = new BucketEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultKmsKeyName(Output<String> defaultKmsKeyName) {
            $.defaultKmsKeyName = defaultKmsKeyName;
            return this;
        }

        public Builder defaultKmsKeyName(String defaultKmsKeyName) {
            return defaultKmsKeyName(Output.of(defaultKmsKeyName));
        }

        public BucketEncryptionArgs build() {
            $.defaultKmsKeyName = Objects.requireNonNull($.defaultKmsKeyName, "expected parameter 'defaultKmsKeyName' to be non-null");
            return $;
        }
    }

}
