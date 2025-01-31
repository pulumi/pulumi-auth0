// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientsClientOidcLogout;
import com.pulumi.auth0.outputs.GetClientsClientTokenExchange;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClientsClient {
    /**
     * @return List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    private List<String> allowedClients;
    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    private List<String> allowedLogoutUrls;
    /**
     * @return URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    private String appType;
    /**
     * @return URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    private List<String> callbacks;
    /**
     * @return The ID of the client. If not provided, `name` must be set.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;{@literal @} [Tab] [Space]`.
     * 
     */
    private Map<String,String> clientMetadata;
    private String clientSecret;
    /**
     * @return Description of the purpose of the client.
     * 
     */
    private String description;
    /**
     * @return Types of grants that this client is authorized to use.
     * 
     */
    private List<String> grantTypes;
    /**
     * @return Indicates whether this client is a first-party client.
     * 
     */
    private Boolean isFirstParty;
    /**
     * @return Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `client_secret_post` or `client_secret_basic`. Setting this property when creating the resource, will default the authentication method to `client_secret_post`. To change the authentication method to `client_secret_basic` use the `auth0.ClientCredentials` resource.
     * 
     */
    private Boolean isTokenEndpointIpHeaderTrusted;
    /**
     * @return The name of the client. If not provided, `client_id` must be set.
     * 
     */
    private @Nullable String name;
    /**
     * @return Configure OIDC logout for the Client
     * 
     */
    private List<GetClientsClientOidcLogout> oidcLogouts;
    /**
     * @return Allows configuration for token exchange
     * 
     */
    private List<GetClientsClientTokenExchange> tokenExchanges;
    /**
     * @return URLs that represent valid web origins for use with web message response mode.
     * 
     */
    private List<String> webOrigins;

    private GetClientsClient() {}
    /**
     * @return List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    public List<String> allowedClients() {
        return this.allowedClients;
    }
    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public List<String> allowedLogoutUrls() {
        return this.allowedLogoutUrls;
    }
    /**
     * @return URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    public String appType() {
        return this.appType;
    }
    /**
     * @return URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    public List<String> callbacks() {
        return this.callbacks;
    }
    /**
     * @return The ID of the client. If not provided, `name` must be set.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;{@literal @} [Tab] [Space]`.
     * 
     */
    public Map<String,String> clientMetadata() {
        return this.clientMetadata;
    }
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return Description of the purpose of the client.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Types of grants that this client is authorized to use.
     * 
     */
    public List<String> grantTypes() {
        return this.grantTypes;
    }
    /**
     * @return Indicates whether this client is a first-party client.
     * 
     */
    public Boolean isFirstParty() {
        return this.isFirstParty;
    }
    /**
     * @return Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `client_secret_post` or `client_secret_basic`. Setting this property when creating the resource, will default the authentication method to `client_secret_post`. To change the authentication method to `client_secret_basic` use the `auth0.ClientCredentials` resource.
     * 
     */
    public Boolean isTokenEndpointIpHeaderTrusted() {
        return this.isTokenEndpointIpHeaderTrusted;
    }
    /**
     * @return The name of the client. If not provided, `client_id` must be set.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Configure OIDC logout for the Client
     * 
     */
    public List<GetClientsClientOidcLogout> oidcLogouts() {
        return this.oidcLogouts;
    }
    /**
     * @return Allows configuration for token exchange
     * 
     */
    public List<GetClientsClientTokenExchange> tokenExchanges() {
        return this.tokenExchanges;
    }
    /**
     * @return URLs that represent valid web origins for use with web message response mode.
     * 
     */
    public List<String> webOrigins() {
        return this.webOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsClient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedClients;
        private List<String> allowedLogoutUrls;
        private List<String> allowedOrigins;
        private String appType;
        private List<String> callbacks;
        private @Nullable String clientId;
        private Map<String,String> clientMetadata;
        private String clientSecret;
        private String description;
        private List<String> grantTypes;
        private Boolean isFirstParty;
        private Boolean isTokenEndpointIpHeaderTrusted;
        private @Nullable String name;
        private List<GetClientsClientOidcLogout> oidcLogouts;
        private List<GetClientsClientTokenExchange> tokenExchanges;
        private List<String> webOrigins;
        public Builder() {}
        public Builder(GetClientsClient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClients = defaults.allowedClients;
    	      this.allowedLogoutUrls = defaults.allowedLogoutUrls;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.appType = defaults.appType;
    	      this.callbacks = defaults.callbacks;
    	      this.clientId = defaults.clientId;
    	      this.clientMetadata = defaults.clientMetadata;
    	      this.clientSecret = defaults.clientSecret;
    	      this.description = defaults.description;
    	      this.grantTypes = defaults.grantTypes;
    	      this.isFirstParty = defaults.isFirstParty;
    	      this.isTokenEndpointIpHeaderTrusted = defaults.isTokenEndpointIpHeaderTrusted;
    	      this.name = defaults.name;
    	      this.oidcLogouts = defaults.oidcLogouts;
    	      this.tokenExchanges = defaults.tokenExchanges;
    	      this.webOrigins = defaults.webOrigins;
        }

        @CustomType.Setter
        public Builder allowedClients(List<String> allowedClients) {
            if (allowedClients == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "allowedClients");
            }
            this.allowedClients = allowedClients;
            return this;
        }
        public Builder allowedClients(String... allowedClients) {
            return allowedClients(List.of(allowedClients));
        }
        @CustomType.Setter
        public Builder allowedLogoutUrls(List<String> allowedLogoutUrls) {
            if (allowedLogoutUrls == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "allowedLogoutUrls");
            }
            this.allowedLogoutUrls = allowedLogoutUrls;
            return this;
        }
        public Builder allowedLogoutUrls(String... allowedLogoutUrls) {
            return allowedLogoutUrls(List.of(allowedLogoutUrls));
        }
        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            if (allowedOrigins == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "allowedOrigins");
            }
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder appType(String appType) {
            if (appType == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "appType");
            }
            this.appType = appType;
            return this;
        }
        @CustomType.Setter
        public Builder callbacks(List<String> callbacks) {
            if (callbacks == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "callbacks");
            }
            this.callbacks = callbacks;
            return this;
        }
        public Builder callbacks(String... callbacks) {
            return callbacks(List.of(callbacks));
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientMetadata(Map<String,String> clientMetadata) {
            if (clientMetadata == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "clientMetadata");
            }
            this.clientMetadata = clientMetadata;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            if (clientSecret == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "clientSecret");
            }
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder grantTypes(List<String> grantTypes) {
            if (grantTypes == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "grantTypes");
            }
            this.grantTypes = grantTypes;
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        @CustomType.Setter
        public Builder isFirstParty(Boolean isFirstParty) {
            if (isFirstParty == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "isFirstParty");
            }
            this.isFirstParty = isFirstParty;
            return this;
        }
        @CustomType.Setter
        public Builder isTokenEndpointIpHeaderTrusted(Boolean isTokenEndpointIpHeaderTrusted) {
            if (isTokenEndpointIpHeaderTrusted == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "isTokenEndpointIpHeaderTrusted");
            }
            this.isTokenEndpointIpHeaderTrusted = isTokenEndpointIpHeaderTrusted;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oidcLogouts(List<GetClientsClientOidcLogout> oidcLogouts) {
            if (oidcLogouts == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "oidcLogouts");
            }
            this.oidcLogouts = oidcLogouts;
            return this;
        }
        public Builder oidcLogouts(GetClientsClientOidcLogout... oidcLogouts) {
            return oidcLogouts(List.of(oidcLogouts));
        }
        @CustomType.Setter
        public Builder tokenExchanges(List<GetClientsClientTokenExchange> tokenExchanges) {
            if (tokenExchanges == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "tokenExchanges");
            }
            this.tokenExchanges = tokenExchanges;
            return this;
        }
        public Builder tokenExchanges(GetClientsClientTokenExchange... tokenExchanges) {
            return tokenExchanges(List.of(tokenExchanges));
        }
        @CustomType.Setter
        public Builder webOrigins(List<String> webOrigins) {
            if (webOrigins == null) {
              throw new MissingRequiredPropertyException("GetClientsClient", "webOrigins");
            }
            this.webOrigins = webOrigins;
            return this;
        }
        public Builder webOrigins(String... webOrigins) {
            return webOrigins(List.of(webOrigins));
        }
        public GetClientsClient build() {
            final var _resultValue = new GetClientsClient();
            _resultValue.allowedClients = allowedClients;
            _resultValue.allowedLogoutUrls = allowedLogoutUrls;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.appType = appType;
            _resultValue.callbacks = callbacks;
            _resultValue.clientId = clientId;
            _resultValue.clientMetadata = clientMetadata;
            _resultValue.clientSecret = clientSecret;
            _resultValue.description = description;
            _resultValue.grantTypes = grantTypes;
            _resultValue.isFirstParty = isFirstParty;
            _resultValue.isTokenEndpointIpHeaderTrusted = isTokenEndpointIpHeaderTrusted;
            _resultValue.name = name;
            _resultValue.oidcLogouts = oidcLogouts;
            _resultValue.tokenExchanges = tokenExchanges;
            _resultValue.webOrigins = webOrigins;
            return _resultValue;
        }
    }
}
