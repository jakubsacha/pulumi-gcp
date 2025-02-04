// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OccurenceAttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationArgs Empty = new OccurenceAttestationArgs();

    /**
     * The serialized payload that is verified by one or
     * more signatures. A base64-encoded string.
     * 
     */
    @Import(name="serializedPayload", required=true)
    private Output<String> serializedPayload;

    /**
     * @return The serialized payload that is verified by one or
     * more signatures. A base64-encoded string.
     * 
     */
    public Output<String> serializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * 
     */
    @Import(name="signatures", required=true)
    private Output<List<OccurenceAttestationSignatureArgs>> signatures;

    /**
     * @return One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * 
     */
    public Output<List<OccurenceAttestationSignatureArgs>> signatures() {
        return this.signatures;
    }

    private OccurenceAttestationArgs() {}

    private OccurenceAttestationArgs(OccurenceAttestationArgs $) {
        this.serializedPayload = $.serializedPayload;
        this.signatures = $.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurenceAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurenceAttestationArgs $;

        public Builder() {
            $ = new OccurenceAttestationArgs();
        }

        public Builder(OccurenceAttestationArgs defaults) {
            $ = new OccurenceAttestationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serializedPayload The serialized payload that is verified by one or
         * more signatures. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder serializedPayload(Output<String> serializedPayload) {
            $.serializedPayload = serializedPayload;
            return this;
        }

        /**
         * @param serializedPayload The serialized payload that is verified by one or
         * more signatures. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder serializedPayload(String serializedPayload) {
            return serializedPayload(Output.of(serializedPayload));
        }

        /**
         * @param signatures One or more signatures over serializedPayload.
         * Verifier implementations should consider this attestation
         * message verified if at least one signature verifies
         * serializedPayload. See Signature in common.proto for more
         * details on signature structure and verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder signatures(Output<List<OccurenceAttestationSignatureArgs>> signatures) {
            $.signatures = signatures;
            return this;
        }

        /**
         * @param signatures One or more signatures over serializedPayload.
         * Verifier implementations should consider this attestation
         * message verified if at least one signature verifies
         * serializedPayload. See Signature in common.proto for more
         * details on signature structure and verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder signatures(List<OccurenceAttestationSignatureArgs> signatures) {
            return signatures(Output.of(signatures));
        }

        /**
         * @param signatures One or more signatures over serializedPayload.
         * Verifier implementations should consider this attestation
         * message verified if at least one signature verifies
         * serializedPayload. See Signature in common.proto for more
         * details on signature structure and verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder signatures(OccurenceAttestationSignatureArgs... signatures) {
            return signatures(List.of(signatures));
        }

        public OccurenceAttestationArgs build() {
            $.serializedPayload = Objects.requireNonNull($.serializedPayload, "expected parameter 'serializedPayload' to be non-null");
            $.signatures = Objects.requireNonNull($.signatures, "expected parameter 'signatures' to be non-null");
            return $;
        }
    }

}
