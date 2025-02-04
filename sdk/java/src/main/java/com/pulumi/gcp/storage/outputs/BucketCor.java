// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketCor {
    /**
     * @return The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    private final @Nullable Integer maxAgeSeconds;
    /**
     * @return The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    private final @Nullable List<String> methods;
    /**
     * @return The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    private final @Nullable List<String> origins;
    /**
     * @return The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    private final @Nullable List<String> responseHeaders;

    @CustomType.Constructor
    private BucketCor(
        @CustomType.Parameter("maxAgeSeconds") @Nullable Integer maxAgeSeconds,
        @CustomType.Parameter("methods") @Nullable List<String> methods,
        @CustomType.Parameter("origins") @Nullable List<String> origins,
        @CustomType.Parameter("responseHeaders") @Nullable List<String> responseHeaders) {
        this.maxAgeSeconds = maxAgeSeconds;
        this.methods = methods;
        this.origins = origins;
        this.responseHeaders = responseHeaders;
    }

    /**
     * @return The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    public Optional<Integer> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }
    /**
     * @return The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: &#34;*&#34; is permitted in the list of methods, and means &#34;any method&#34;.
     * 
     */
    public List<String> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * @return The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: &#34;*&#34; is permitted in the list of origins, and means &#34;any Origin&#34;.
     * 
     */
    public List<String> origins() {
        return this.origins == null ? List.of() : this.origins;
    }
    /**
     * @return The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    public List<String> responseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxAgeSeconds;
        private @Nullable List<String> methods;
        private @Nullable List<String> origins;
        private @Nullable List<String> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder maxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder origins(@Nullable List<String> origins) {
            this.origins = origins;
            return this;
        }
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }
        public Builder responseHeaders(@Nullable List<String> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(String... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }        public BucketCor build() {
            return new BucketCor(maxAgeSeconds, methods, origins, responseHeaders);
        }
    }
}
