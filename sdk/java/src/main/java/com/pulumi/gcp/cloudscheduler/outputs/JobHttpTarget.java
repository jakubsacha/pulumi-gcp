// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudscheduler.outputs.JobHttpTargetOauthToken;
import com.pulumi.gcp.cloudscheduler.outputs.JobHttpTargetOidcToken;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobHttpTarget {
    /**
     * @return HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    private final @Nullable String body;
    /**
     * @return This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * @return Which HTTP method to use for the request.
     * 
     */
    private final @Nullable String httpMethod;
    /**
     * @return Contains information needed for generating an OAuth token.
     * This type of authorization should be used when sending requests to a GCP endpoint.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobHttpTargetOauthToken oauthToken;
    /**
     * @return Contains information needed for generating an OpenID Connect token.
     * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobHttpTargetOidcToken oidcToken;
    /**
     * @return The full URI path that the request will be sent to.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private JobHttpTarget(
        @CustomType.Parameter("body") @Nullable String body,
        @CustomType.Parameter("headers") @Nullable Map<String,String> headers,
        @CustomType.Parameter("httpMethod") @Nullable String httpMethod,
        @CustomType.Parameter("oauthToken") @Nullable JobHttpTargetOauthToken oauthToken,
        @CustomType.Parameter("oidcToken") @Nullable JobHttpTargetOidcToken oidcToken,
        @CustomType.Parameter("uri") String uri) {
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.oauthToken = oauthToken;
        this.oidcToken = oidcToken;
        this.uri = uri;
    }

    /**
     * @return HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * @return Which HTTP method to use for the request.
     * 
     */
    public Optional<String> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * @return Contains information needed for generating an OAuth token.
     * This type of authorization should be used when sending requests to a GCP endpoint.
     * Structure is documented below.
     * 
     */
    public Optional<JobHttpTargetOauthToken> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }
    /**
     * @return Contains information needed for generating an OpenID Connect token.
     * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     * Structure is documented below.
     * 
     */
    public Optional<JobHttpTargetOidcToken> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }
    /**
     * @return The full URI path that the request will be sent to.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private @Nullable Map<String,String> headers;
        private @Nullable String httpMethod;
        private @Nullable JobHttpTargetOauthToken oauthToken;
        private @Nullable JobHttpTargetOidcToken oidcToken;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.uri = defaults.uri;
        }

        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder oauthToken(@Nullable JobHttpTargetOauthToken oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }
        public Builder oidcToken(@Nullable JobHttpTargetOidcToken oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public JobHttpTarget build() {
            return new JobHttpTarget(body, headers, httpMethod, oauthToken, oidcToken, uri);
        }
    }
}
