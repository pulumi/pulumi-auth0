// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetResourceServerScope;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceServerResult {
    /**
     * @return Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    private Boolean allowOfflineAccess;
    /**
     * @return If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    private Boolean enforcePolicies;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
     * 
     */
    private @Nullable String identifier;
    /**
     * @return Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    private String name;
    /**
     * @return The ID of the resource server. If not provided, `identifier` must be set.
     * 
     */
    private @Nullable String resourceServerId;
    /**
     * @return List of permissions (scopes) used by this resource server.
     * 
     */
    private List<GetResourceServerScope> scopes;
    /**
     * @return Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    private String signingAlg;
    /**
     * @return Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    private String signingSecret;
    /**
     * @return Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    private Boolean skipConsentForVerifiableFirstPartyClients;
    /**
     * @return Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
     * 
     */
    private String tokenDialect;
    /**
     * @return Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    private Integer tokenLifetime;
    /**
     * @return Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    private Integer tokenLifetimeForWeb;
    /**
     * @return URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    private String verificationLocation;

    private GetResourceServerResult() {}
    /**
     * @return Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    public Boolean allowOfflineAccess() {
        return this.allowOfflineAccess;
    }
    /**
     * @return If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    public Boolean enforcePolicies() {
        return this.enforcePolicies;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the resource server. If not provided, `identifier` must be set.
     * 
     */
    public Optional<String> resourceServerId() {
        return Optional.ofNullable(this.resourceServerId);
    }
    /**
     * @return List of permissions (scopes) used by this resource server.
     * 
     */
    public List<GetResourceServerScope> scopes() {
        return this.scopes;
    }
    /**
     * @return Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    public String signingAlg() {
        return this.signingAlg;
    }
    /**
     * @return Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    public String signingSecret() {
        return this.signingSecret;
    }
    /**
     * @return Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    public Boolean skipConsentForVerifiableFirstPartyClients() {
        return this.skipConsentForVerifiableFirstPartyClients;
    }
    /**
     * @return Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
     * 
     */
    public String tokenDialect() {
        return this.tokenDialect;
    }
    /**
     * @return Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    public Integer tokenLifetime() {
        return this.tokenLifetime;
    }
    /**
     * @return Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    public Integer tokenLifetimeForWeb() {
        return this.tokenLifetimeForWeb;
    }
    /**
     * @return URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    public String verificationLocation() {
        return this.verificationLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowOfflineAccess;
        private Boolean enforcePolicies;
        private String id;
        private @Nullable String identifier;
        private String name;
        private @Nullable String resourceServerId;
        private List<GetResourceServerScope> scopes;
        private String signingAlg;
        private String signingSecret;
        private Boolean skipConsentForVerifiableFirstPartyClients;
        private String tokenDialect;
        private Integer tokenLifetime;
        private Integer tokenLifetimeForWeb;
        private String verificationLocation;
        public Builder() {}
        public Builder(GetResourceServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOfflineAccess = defaults.allowOfflineAccess;
    	      this.enforcePolicies = defaults.enforcePolicies;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.resourceServerId = defaults.resourceServerId;
    	      this.scopes = defaults.scopes;
    	      this.signingAlg = defaults.signingAlg;
    	      this.signingSecret = defaults.signingSecret;
    	      this.skipConsentForVerifiableFirstPartyClients = defaults.skipConsentForVerifiableFirstPartyClients;
    	      this.tokenDialect = defaults.tokenDialect;
    	      this.tokenLifetime = defaults.tokenLifetime;
    	      this.tokenLifetimeForWeb = defaults.tokenLifetimeForWeb;
    	      this.verificationLocation = defaults.verificationLocation;
        }

        @CustomType.Setter
        public Builder allowOfflineAccess(Boolean allowOfflineAccess) {
            if (allowOfflineAccess == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "allowOfflineAccess");
            }
            this.allowOfflineAccess = allowOfflineAccess;
            return this;
        }
        @CustomType.Setter
        public Builder enforcePolicies(Boolean enforcePolicies) {
            if (enforcePolicies == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "enforcePolicies");
            }
            this.enforcePolicies = enforcePolicies;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identifier(@Nullable String identifier) {

            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceServerId(@Nullable String resourceServerId) {

            this.resourceServerId = resourceServerId;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<GetResourceServerScope> scopes) {
            if (scopes == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "scopes");
            }
            this.scopes = scopes;
            return this;
        }
        public Builder scopes(GetResourceServerScope... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder signingAlg(String signingAlg) {
            if (signingAlg == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "signingAlg");
            }
            this.signingAlg = signingAlg;
            return this;
        }
        @CustomType.Setter
        public Builder signingSecret(String signingSecret) {
            if (signingSecret == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "signingSecret");
            }
            this.signingSecret = signingSecret;
            return this;
        }
        @CustomType.Setter
        public Builder skipConsentForVerifiableFirstPartyClients(Boolean skipConsentForVerifiableFirstPartyClients) {
            if (skipConsentForVerifiableFirstPartyClients == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "skipConsentForVerifiableFirstPartyClients");
            }
            this.skipConsentForVerifiableFirstPartyClients = skipConsentForVerifiableFirstPartyClients;
            return this;
        }
        @CustomType.Setter
        public Builder tokenDialect(String tokenDialect) {
            if (tokenDialect == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "tokenDialect");
            }
            this.tokenDialect = tokenDialect;
            return this;
        }
        @CustomType.Setter
        public Builder tokenLifetime(Integer tokenLifetime) {
            if (tokenLifetime == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "tokenLifetime");
            }
            this.tokenLifetime = tokenLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder tokenLifetimeForWeb(Integer tokenLifetimeForWeb) {
            if (tokenLifetimeForWeb == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "tokenLifetimeForWeb");
            }
            this.tokenLifetimeForWeb = tokenLifetimeForWeb;
            return this;
        }
        @CustomType.Setter
        public Builder verificationLocation(String verificationLocation) {
            if (verificationLocation == null) {
              throw new MissingRequiredPropertyException("GetResourceServerResult", "verificationLocation");
            }
            this.verificationLocation = verificationLocation;
            return this;
        }
        public GetResourceServerResult build() {
            final var _resultValue = new GetResourceServerResult();
            _resultValue.allowOfflineAccess = allowOfflineAccess;
            _resultValue.enforcePolicies = enforcePolicies;
            _resultValue.id = id;
            _resultValue.identifier = identifier;
            _resultValue.name = name;
            _resultValue.resourceServerId = resourceServerId;
            _resultValue.scopes = scopes;
            _resultValue.signingAlg = signingAlg;
            _resultValue.signingSecret = signingSecret;
            _resultValue.skipConsentForVerifiableFirstPartyClients = skipConsentForVerifiableFirstPartyClients;
            _resultValue.tokenDialect = tokenDialect;
            _resultValue.tokenLifetime = tokenLifetime;
            _resultValue.tokenLifetimeForWeb = tokenLifetimeForWeb;
            _resultValue.verificationLocation = verificationLocation;
            return _resultValue;
        }
    }
}
