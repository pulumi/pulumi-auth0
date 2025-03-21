// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientClientAuthenticationMethodTlsClientAuthCredential;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientClientAuthenticationMethodTlsClientAuth {
    /**
     * @return Credentials that will be enabled on the client for CA-based mTLS authentication.
     * 
     */
    private List<GetClientClientAuthenticationMethodTlsClientAuthCredential> credentials;

    private GetClientClientAuthenticationMethodTlsClientAuth() {}
    /**
     * @return Credentials that will be enabled on the client for CA-based mTLS authentication.
     * 
     */
    public List<GetClientClientAuthenticationMethodTlsClientAuthCredential> credentials() {
        return this.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientClientAuthenticationMethodTlsClientAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClientClientAuthenticationMethodTlsClientAuthCredential> credentials;
        public Builder() {}
        public Builder(GetClientClientAuthenticationMethodTlsClientAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
        }

        @CustomType.Setter
        public Builder credentials(List<GetClientClientAuthenticationMethodTlsClientAuthCredential> credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodTlsClientAuth", "credentials");
            }
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(GetClientClientAuthenticationMethodTlsClientAuthCredential... credentials) {
            return credentials(List.of(credentials));
        }
        public GetClientClientAuthenticationMethodTlsClientAuth build() {
            final var _resultValue = new GetClientClientAuthenticationMethodTlsClientAuth();
            _resultValue.credentials = credentials;
            return _resultValue;
        }
    }
}
