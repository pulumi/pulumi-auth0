// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ClientOidcLogoutBackchannelLogoutInitiators;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientOidcLogout {
    /**
     * @return Configure OIDC logout initiators for the Client
     * 
     */
    private @Nullable ClientOidcLogoutBackchannelLogoutInitiators backchannelLogoutInitiators;
    /**
     * @return Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    private List<String> backchannelLogoutUrls;

    private ClientOidcLogout() {}
    /**
     * @return Configure OIDC logout initiators for the Client
     * 
     */
    public Optional<ClientOidcLogoutBackchannelLogoutInitiators> backchannelLogoutInitiators() {
        return Optional.ofNullable(this.backchannelLogoutInitiators);
    }
    /**
     * @return Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    public List<String> backchannelLogoutUrls() {
        return this.backchannelLogoutUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientOidcLogout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClientOidcLogoutBackchannelLogoutInitiators backchannelLogoutInitiators;
        private List<String> backchannelLogoutUrls;
        public Builder() {}
        public Builder(ClientOidcLogout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backchannelLogoutInitiators = defaults.backchannelLogoutInitiators;
    	      this.backchannelLogoutUrls = defaults.backchannelLogoutUrls;
        }

        @CustomType.Setter
        public Builder backchannelLogoutInitiators(@Nullable ClientOidcLogoutBackchannelLogoutInitiators backchannelLogoutInitiators) {

            this.backchannelLogoutInitiators = backchannelLogoutInitiators;
            return this;
        }
        @CustomType.Setter
        public Builder backchannelLogoutUrls(List<String> backchannelLogoutUrls) {
            if (backchannelLogoutUrls == null) {
              throw new MissingRequiredPropertyException("ClientOidcLogout", "backchannelLogoutUrls");
            }
            this.backchannelLogoutUrls = backchannelLogoutUrls;
            return this;
        }
        public Builder backchannelLogoutUrls(String... backchannelLogoutUrls) {
            return backchannelLogoutUrls(List.of(backchannelLogoutUrls));
        }
        public ClientOidcLogout build() {
            final var _resultValue = new ClientOidcLogout();
            _resultValue.backchannelLogoutInitiators = backchannelLogoutInitiators;
            _resultValue.backchannelLogoutUrls = backchannelLogoutUrls;
            return _resultValue;
        }
    }
}
