// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientSessionTransfer {
    /**
     * @return Indicates whether the application is allowed to use a refresh token when using a session_transfer_token session.
     * 
     */
    private Boolean allowRefreshToken;
    private List<String> allowedAuthenticationMethods;
    /**
     * @return Indicates whether the application(Native app) can use the Token Exchange endpoint to create a session_transfer_token
     * 
     */
    private Boolean canCreateSessionTransferToken;
    /**
     * @return Configures the level of device binding enforced when a session_transfer_token is consumed. Can be one of `ip`, `asn` or `none`.
     * 
     */
    private String enforceDeviceBinding;

    private GetClientSessionTransfer() {}
    /**
     * @return Indicates whether the application is allowed to use a refresh token when using a session_transfer_token session.
     * 
     */
    public Boolean allowRefreshToken() {
        return this.allowRefreshToken;
    }
    public List<String> allowedAuthenticationMethods() {
        return this.allowedAuthenticationMethods;
    }
    /**
     * @return Indicates whether the application(Native app) can use the Token Exchange endpoint to create a session_transfer_token
     * 
     */
    public Boolean canCreateSessionTransferToken() {
        return this.canCreateSessionTransferToken;
    }
    /**
     * @return Configures the level of device binding enforced when a session_transfer_token is consumed. Can be one of `ip`, `asn` or `none`.
     * 
     */
    public String enforceDeviceBinding() {
        return this.enforceDeviceBinding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientSessionTransfer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowRefreshToken;
        private List<String> allowedAuthenticationMethods;
        private Boolean canCreateSessionTransferToken;
        private String enforceDeviceBinding;
        public Builder() {}
        public Builder(GetClientSessionTransfer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowRefreshToken = defaults.allowRefreshToken;
    	      this.allowedAuthenticationMethods = defaults.allowedAuthenticationMethods;
    	      this.canCreateSessionTransferToken = defaults.canCreateSessionTransferToken;
    	      this.enforceDeviceBinding = defaults.enforceDeviceBinding;
        }

        @CustomType.Setter
        public Builder allowRefreshToken(Boolean allowRefreshToken) {
            if (allowRefreshToken == null) {
              throw new MissingRequiredPropertyException("GetClientSessionTransfer", "allowRefreshToken");
            }
            this.allowRefreshToken = allowRefreshToken;
            return this;
        }
        @CustomType.Setter
        public Builder allowedAuthenticationMethods(List<String> allowedAuthenticationMethods) {
            if (allowedAuthenticationMethods == null) {
              throw new MissingRequiredPropertyException("GetClientSessionTransfer", "allowedAuthenticationMethods");
            }
            this.allowedAuthenticationMethods = allowedAuthenticationMethods;
            return this;
        }
        public Builder allowedAuthenticationMethods(String... allowedAuthenticationMethods) {
            return allowedAuthenticationMethods(List.of(allowedAuthenticationMethods));
        }
        @CustomType.Setter
        public Builder canCreateSessionTransferToken(Boolean canCreateSessionTransferToken) {
            if (canCreateSessionTransferToken == null) {
              throw new MissingRequiredPropertyException("GetClientSessionTransfer", "canCreateSessionTransferToken");
            }
            this.canCreateSessionTransferToken = canCreateSessionTransferToken;
            return this;
        }
        @CustomType.Setter
        public Builder enforceDeviceBinding(String enforceDeviceBinding) {
            if (enforceDeviceBinding == null) {
              throw new MissingRequiredPropertyException("GetClientSessionTransfer", "enforceDeviceBinding");
            }
            this.enforceDeviceBinding = enforceDeviceBinding;
            return this;
        }
        public GetClientSessionTransfer build() {
            final var _resultValue = new GetClientSessionTransfer();
            _resultValue.allowRefreshToken = allowRefreshToken;
            _resultValue.allowedAuthenticationMethods = allowedAuthenticationMethods;
            _resultValue.canCreateSessionTransferToken = canCreateSessionTransferToken;
            _resultValue.enforceDeviceBinding = enforceDeviceBinding;
            return _resultValue;
        }
    }
}
