// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientRefreshTokenPolicy {
    /**
     * @return The identifier of the resource server to which the Multi Resource Refresh Token Policy applies
     * 
     */
    private String audience;
    /**
     * @return The resource server permissions granted under the Multi Resource Refresh Token Policy, defining the context in which an access token can be used
     * 
     */
    private List<String> scopes;

    private GetClientRefreshTokenPolicy() {}
    /**
     * @return The identifier of the resource server to which the Multi Resource Refresh Token Policy applies
     * 
     */
    public String audience() {
        return this.audience;
    }
    /**
     * @return The resource server permissions granted under the Multi Resource Refresh Token Policy, defining the context in which an access token can be used
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientRefreshTokenPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audience;
        private List<String> scopes;
        public Builder() {}
        public Builder(GetClientRefreshTokenPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder audience(String audience) {
            if (audience == null) {
              throw new MissingRequiredPropertyException("GetClientRefreshTokenPolicy", "audience");
            }
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<String> scopes) {
            if (scopes == null) {
              throw new MissingRequiredPropertyException("GetClientRefreshTokenPolicy", "scopes");
            }
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public GetClientRefreshTokenPolicy build() {
            final var _resultValue = new GetClientRefreshTokenPolicy();
            _resultValue.audience = audience;
            _resultValue.scopes = scopes;
            return _resultValue;
        }
    }
}
