// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionIdpInitiated {
    private String clientAuthorizeQuery;
    private String clientId;
    private String clientProtocol;
    private Boolean enabled;

    private GetConnectionOptionIdpInitiated() {}
    public String clientAuthorizeQuery() {
        return this.clientAuthorizeQuery;
    }
    public String clientId() {
        return this.clientId;
    }
    public String clientProtocol() {
        return this.clientProtocol;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionIdpInitiated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientAuthorizeQuery;
        private String clientId;
        private String clientProtocol;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetConnectionOptionIdpInitiated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthorizeQuery = defaults.clientAuthorizeQuery;
    	      this.clientId = defaults.clientId;
    	      this.clientProtocol = defaults.clientProtocol;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder clientAuthorizeQuery(String clientAuthorizeQuery) {
            if (clientAuthorizeQuery == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionIdpInitiated", "clientAuthorizeQuery");
            }
            this.clientAuthorizeQuery = clientAuthorizeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionIdpInitiated", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientProtocol(String clientProtocol) {
            if (clientProtocol == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionIdpInitiated", "clientProtocol");
            }
            this.clientProtocol = clientProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionIdpInitiated", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetConnectionOptionIdpInitiated build() {
            final var _resultValue = new GetConnectionOptionIdpInitiated();
            _resultValue.clientAuthorizeQuery = clientAuthorizeQuery;
            _resultValue.clientId = clientId;
            _resultValue.clientProtocol = clientProtocol;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
