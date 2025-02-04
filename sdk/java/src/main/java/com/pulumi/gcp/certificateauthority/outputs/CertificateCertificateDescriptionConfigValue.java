// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionConfigValue {
    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages;

    @CustomType.Constructor
    private CertificateCertificateDescriptionConfigValue(@CustomType.Parameter("keyUsages") @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages) {
        this.keyUsages = keyUsages;
    }

    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages() {
        return this.keyUsages == null ? List.of() : this.keyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsages = defaults.keyUsages;
        }

        public Builder keyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages) {
            this.keyUsages = keyUsages;
            return this;
        }
        public Builder keyUsages(CertificateCertificateDescriptionConfigValueKeyUsage... keyUsages) {
            return keyUsages(List.of(keyUsages));
        }        public CertificateCertificateDescriptionConfigValue build() {
            return new CertificateCertificateDescriptionConfigValue(keyUsages);
        }
    }
}
