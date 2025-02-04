// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.healthcare.outputs.DicomStoreStreamConfigBigqueryDestination;
import java.util.Objects;

@CustomType
public final class DicomStoreStreamConfig {
    /**
     * @return BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * Structure is documented below.
     * 
     */
    private final DicomStoreStreamConfigBigqueryDestination bigqueryDestination;

    @CustomType.Constructor
    private DicomStoreStreamConfig(@CustomType.Parameter("bigqueryDestination") DicomStoreStreamConfigBigqueryDestination bigqueryDestination) {
        this.bigqueryDestination = bigqueryDestination;
    }

    /**
     * @return BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * Structure is documented below.
     * 
     */
    public DicomStoreStreamConfigBigqueryDestination bigqueryDestination() {
        return this.bigqueryDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreStreamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DicomStoreStreamConfigBigqueryDestination bigqueryDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
        }

        public Builder bigqueryDestination(DicomStoreStreamConfigBigqueryDestination bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }        public DicomStoreStreamConfig build() {
            return new DicomStoreStreamConfig(bigqueryDestination);
        }
    }
}
