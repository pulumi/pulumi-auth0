// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsIdpInitiated {
    private @Nullable String clientAuthorizeQuery;
    private @Nullable String clientId;
    private @Nullable String clientProtocol;
    private @Nullable Boolean enabled;

    private ConnectionOptionsIdpInitiated() {}
    public Optional<String> clientAuthorizeQuery() {
        return Optional.ofNullable(this.clientAuthorizeQuery);
    }
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> clientProtocol() {
        return Optional.ofNullable(this.clientProtocol);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsIdpInitiated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientAuthorizeQuery;
        private @Nullable String clientId;
        private @Nullable String clientProtocol;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ConnectionOptionsIdpInitiated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthorizeQuery = defaults.clientAuthorizeQuery;
    	      this.clientId = defaults.clientId;
    	      this.clientProtocol = defaults.clientProtocol;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder clientAuthorizeQuery(@Nullable String clientAuthorizeQuery) {

            this.clientAuthorizeQuery = clientAuthorizeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientProtocol(@Nullable String clientProtocol) {

            this.clientProtocol = clientProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public ConnectionOptionsIdpInitiated build() {
            final var _resultValue = new ConnectionOptionsIdpInitiated();
            _resultValue.clientAuthorizeQuery = clientAuthorizeQuery;
            _resultValue.clientId = clientId;
            _resultValue.clientProtocol = clientProtocol;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
