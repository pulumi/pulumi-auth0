// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientOidcLogoutBackchannelLogoutInitiator;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientOidcLogout {
    /**
     * @return Configure OIDC logout initiators for the Client
     * 
     */
    private List<GetClientOidcLogoutBackchannelLogoutInitiator> backchannelLogoutInitiators;
    /**
     * @return Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    private List<String> backchannelLogoutUrls;

    private GetClientOidcLogout() {}
    /**
     * @return Configure OIDC logout initiators for the Client
     * 
     */
    public List<GetClientOidcLogoutBackchannelLogoutInitiator> backchannelLogoutInitiators() {
        return this.backchannelLogoutInitiators;
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

    public static Builder builder(GetClientOidcLogout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClientOidcLogoutBackchannelLogoutInitiator> backchannelLogoutInitiators;
        private List<String> backchannelLogoutUrls;
        public Builder() {}
        public Builder(GetClientOidcLogout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backchannelLogoutInitiators = defaults.backchannelLogoutInitiators;
    	      this.backchannelLogoutUrls = defaults.backchannelLogoutUrls;
        }

        @CustomType.Setter
        public Builder backchannelLogoutInitiators(List<GetClientOidcLogoutBackchannelLogoutInitiator> backchannelLogoutInitiators) {
            if (backchannelLogoutInitiators == null) {
              throw new MissingRequiredPropertyException("GetClientOidcLogout", "backchannelLogoutInitiators");
            }
            this.backchannelLogoutInitiators = backchannelLogoutInitiators;
            return this;
        }
        public Builder backchannelLogoutInitiators(GetClientOidcLogoutBackchannelLogoutInitiator... backchannelLogoutInitiators) {
            return backchannelLogoutInitiators(List.of(backchannelLogoutInitiators));
        }
        @CustomType.Setter
        public Builder backchannelLogoutUrls(List<String> backchannelLogoutUrls) {
            if (backchannelLogoutUrls == null) {
              throw new MissingRequiredPropertyException("GetClientOidcLogout", "backchannelLogoutUrls");
            }
            this.backchannelLogoutUrls = backchannelLogoutUrls;
            return this;
        }
        public Builder backchannelLogoutUrls(String... backchannelLogoutUrls) {
            return backchannelLogoutUrls(List.of(backchannelLogoutUrls));
        }
        public GetClientOidcLogout build() {
            final var _resultValue = new GetClientOidcLogout();
            _resultValue.backchannelLogoutInitiators = backchannelLogoutInitiators;
            _resultValue.backchannelLogoutUrls = backchannelLogoutUrls;
            return _resultValue;
        }
    }
}