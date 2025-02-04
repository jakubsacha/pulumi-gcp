// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleHeaderAction;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRule;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteAction;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleUrlRedirect;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherRouteRule {
    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction;
    /**
     * @return The rules for determining a match.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules;
    /**
     * @return For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    private final Integer priority;
    /**
     * @return In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction;
    /**
     * @return A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    private final @Nullable String service;
    /**
     * @return When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherRouteRule(
        @CustomType.Parameter("headerAction") @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction,
        @CustomType.Parameter("matchRules") @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("routeAction") @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction,
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("urlRedirect") @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect) {
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = priority;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleHeaderAction> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * @return The rules for determining a match.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules() {
        return this.matchRules == null ? List.of() : this.matchRules;
    }
    /**
     * @return For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteAction> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * @return A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleUrlRedirect> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction;
        private @Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules;
        private Integer priority;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction;
        private @Nullable String service;
        private @Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder headerAction(@Nullable RegionUrlMapPathMatcherRouteRuleHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder matchRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRule> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public Builder matchRules(RegionUrlMapPathMatcherRouteRuleMatchRule... matchRules) {
            return matchRules(List.of(matchRules));
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder urlRedirect(@Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }        public RegionUrlMapPathMatcherRouteRule build() {
            return new RegionUrlMapPathMatcherRouteRule(headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
