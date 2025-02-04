// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.URLMapHeaderActionRequestHeadersToAdd;
import com.pulumi.gcp.compute.outputs.URLMapHeaderActionResponseHeadersToAdd;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class URLMapHeaderAction {
    /**
     * @return Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
    /**
     * @return A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    private final @Nullable List<String> requestHeadersToRemoves;
    /**
     * @return Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
    /**
     * @return A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    private final @Nullable List<String> responseHeadersToRemoves;

    @CustomType.Constructor
    private URLMapHeaderAction(
        @CustomType.Parameter("requestHeadersToAdds") @Nullable List<URLMapHeaderActionRequestHeadersToAdd> requestHeadersToAdds,
        @CustomType.Parameter("requestHeadersToRemoves") @Nullable List<String> requestHeadersToRemoves,
        @CustomType.Parameter("responseHeadersToAdds") @Nullable List<URLMapHeaderActionResponseHeadersToAdd> responseHeadersToAdds,
        @CustomType.Parameter("responseHeadersToRemoves") @Nullable List<String> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    /**
     * @return Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    public List<URLMapHeaderActionRequestHeadersToAdd> requestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? List.of() : this.requestHeadersToAdds;
    }
    /**
     * @return A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    public List<String> requestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? List.of() : this.requestHeadersToRemoves;
    }
    /**
     * @return Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    public List<URLMapHeaderActionResponseHeadersToAdd> responseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? List.of() : this.responseHeadersToAdds;
    }
    /**
     * @return A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    public List<String> responseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? List.of() : this.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<URLMapHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
        private @Nullable List<String> requestHeadersToRemoves;
        private @Nullable List<URLMapHeaderActionResponseHeadersToAdd> responseHeadersToAdds;
        private @Nullable List<String> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder requestHeadersToAdds(@Nullable List<URLMapHeaderActionRequestHeadersToAdd> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }
        public Builder requestHeadersToAdds(URLMapHeaderActionRequestHeadersToAdd... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }
        public Builder requestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }
        public Builder requestHeadersToRemoves(String... requestHeadersToRemoves) {
            return requestHeadersToRemoves(List.of(requestHeadersToRemoves));
        }
        public Builder responseHeadersToAdds(@Nullable List<URLMapHeaderActionResponseHeadersToAdd> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }
        public Builder responseHeadersToAdds(URLMapHeaderActionResponseHeadersToAdd... responseHeadersToAdds) {
            return responseHeadersToAdds(List.of(responseHeadersToAdds));
        }
        public Builder responseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }
        public Builder responseHeadersToRemoves(String... responseHeadersToRemoves) {
            return responseHeadersToRemoves(List.of(responseHeadersToRemoves));
        }        public URLMapHeaderAction build() {
            return new URLMapHeaderAction(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}
