// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OccurenceAttestationSignature {
    /**
     * @return The identifier for the public key that verifies this
     * signature. MUST be an RFC3986 conformant
     * URI. * When possible, the key id should be an
     * immutable reference, such as a cryptographic digest.
     * Examples of valid values:
     * * OpenPGP V4 public key fingerprint. See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr
     *   for more details on this scheme.
     * * `openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA`
     * * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):
     * * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34;
     * 
     */
    private final String publicKeyId;
    /**
     * @return The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be
     * unambiguously provided with the Signature during
     * verification. A wrapper message might provide the
     * payload explicitly. Alternatively, a message might
     * have a canonical serialization that can always be
     * unambiguously computed to derive the payload.
     * 
     */
    private final @Nullable String signature;

    @CustomType.Constructor
    private OccurenceAttestationSignature(
        @CustomType.Parameter("publicKeyId") String publicKeyId,
        @CustomType.Parameter("signature") @Nullable String signature) {
        this.publicKeyId = publicKeyId;
        this.signature = signature;
    }

    /**
     * @return The identifier for the public key that verifies this
     * signature. MUST be an RFC3986 conformant
     * URI. * When possible, the key id should be an
     * immutable reference, such as a cryptographic digest.
     * Examples of valid values:
     * * OpenPGP V4 public key fingerprint. See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr
     *   for more details on this scheme.
     * * `openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA`
     * * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):
     * * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34;
     * 
     */
    public String publicKeyId() {
        return this.publicKeyId;
    }
    /**
     * @return The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be
     * unambiguously provided with the Signature during
     * verification. A wrapper message might provide the
     * payload explicitly. Alternatively, a message might
     * have a canonical serialization that can always be
     * unambiguously computed to derive the payload.
     * 
     */
    public Optional<String> signature() {
        return Optional.ofNullable(this.signature);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceAttestationSignature defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicKeyId;
        private @Nullable String signature;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceAttestationSignature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyId = defaults.publicKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }
        public Builder signature(@Nullable String signature) {
            this.signature = signature;
            return this;
        }        public OccurenceAttestationSignature build() {
            return new OccurenceAttestationSignature(publicKeyId, signature);
        }
    }
}
