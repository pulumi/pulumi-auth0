// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonAw {
    private Integer lifetimeInSeconds;
    private String principal;
    private String role;

    private GetClientAddonAw() {}
    public Integer lifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }
    public String principal() {
        return this.principal;
    }
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonAw defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer lifetimeInSeconds;
        private String principal;
        private String role;
        public Builder() {}
        public Builder(GetClientAddonAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.principal = defaults.principal;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = Objects.requireNonNull(lifetimeInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetClientAddonAw build() {
            final var _resultValue = new GetClientAddonAw();
            _resultValue.lifetimeInSeconds = lifetimeInSeconds;
            _resultValue.principal = principal;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
