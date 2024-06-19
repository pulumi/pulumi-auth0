// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceServerState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerState Empty = new ResourceServerState();

    /**
     * Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    @Import(name="allowOfflineAccess")
    private @Nullable Output<Boolean> allowOfflineAccess;

    /**
     * @return Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    public Optional<Output<Boolean>> allowOfflineAccess() {
        return Optional.ofNullable(this.allowOfflineAccess);
    }

    /**
     * If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    @Import(name="enforcePolicies")
    private @Nullable Output<Boolean> enforcePolicies;

    /**
     * @return If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    public Optional<Output<Boolean>> enforcePolicies() {
        return Optional.ofNullable(this.enforcePolicies);
    }

    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    @Import(name="signingAlg")
    private @Nullable Output<String> signingAlg;

    /**
     * @return Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    public Optional<Output<String>> signingAlg() {
        return Optional.ofNullable(this.signingAlg);
    }

    /**
     * Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    @Import(name="signingSecret")
    private @Nullable Output<String> signingSecret;

    /**
     * @return Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    public Optional<Output<String>> signingSecret() {
        return Optional.ofNullable(this.signingSecret);
    }

    /**
     * Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    @Import(name="skipConsentForVerifiableFirstPartyClients")
    private @Nullable Output<Boolean> skipConsentForVerifiableFirstPartyClients;

    /**
     * @return Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    public Optional<Output<Boolean>> skipConsentForVerifiableFirstPartyClients() {
        return Optional.ofNullable(this.skipConsentForVerifiableFirstPartyClients);
    }

    /**
     * Dialect of access tokens that should be issued for this resource server. Options include `access_token`, `rfc9068_profile`, `access_token_authz`, and `rfc9068_profile_authz`. `access_token` is a JWT containing standard Auth0 claims. `rfc9068_profile` is a JWT conforming to the IETF JWT Access Token Profile. `access_token_authz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068_profile_authz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforce_policies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
     * 
     */
    @Import(name="tokenDialect")
    private @Nullable Output<String> tokenDialect;

    /**
     * @return Dialect of access tokens that should be issued for this resource server. Options include `access_token`, `rfc9068_profile`, `access_token_authz`, and `rfc9068_profile_authz`. `access_token` is a JWT containing standard Auth0 claims. `rfc9068_profile` is a JWT conforming to the IETF JWT Access Token Profile. `access_token_authz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068_profile_authz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforce_policies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
     * 
     */
    public Optional<Output<String>> tokenDialect() {
        return Optional.ofNullable(this.tokenDialect);
    }

    /**
     * Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    @Import(name="tokenLifetime")
    private @Nullable Output<Integer> tokenLifetime;

    /**
     * @return Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    public Optional<Output<Integer>> tokenLifetime() {
        return Optional.ofNullable(this.tokenLifetime);
    }

    /**
     * Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    @Import(name="tokenLifetimeForWeb")
    private @Nullable Output<Integer> tokenLifetimeForWeb;

    /**
     * @return Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    public Optional<Output<Integer>> tokenLifetimeForWeb() {
        return Optional.ofNullable(this.tokenLifetimeForWeb);
    }

    /**
     * URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    @Import(name="verificationLocation")
    private @Nullable Output<String> verificationLocation;

    /**
     * @return URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    public Optional<Output<String>> verificationLocation() {
        return Optional.ofNullable(this.verificationLocation);
    }

    private ResourceServerState() {}

    private ResourceServerState(ResourceServerState $) {
        this.allowOfflineAccess = $.allowOfflineAccess;
        this.enforcePolicies = $.enforcePolicies;
        this.identifier = $.identifier;
        this.name = $.name;
        this.signingAlg = $.signingAlg;
        this.signingSecret = $.signingSecret;
        this.skipConsentForVerifiableFirstPartyClients = $.skipConsentForVerifiableFirstPartyClients;
        this.tokenDialect = $.tokenDialect;
        this.tokenLifetime = $.tokenLifetime;
        this.tokenLifetimeForWeb = $.tokenLifetimeForWeb;
        this.verificationLocation = $.verificationLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerState $;

        public Builder() {
            $ = new ResourceServerState();
        }

        public Builder(ResourceServerState defaults) {
            $ = new ResourceServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowOfflineAccess Indicates whether refresh tokens can be issued for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder allowOfflineAccess(@Nullable Output<Boolean> allowOfflineAccess) {
            $.allowOfflineAccess = allowOfflineAccess;
            return this;
        }

        /**
         * @param allowOfflineAccess Indicates whether refresh tokens can be issued for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder allowOfflineAccess(Boolean allowOfflineAccess) {
            return allowOfflineAccess(Output.of(allowOfflineAccess));
        }

        /**
         * @param enforcePolicies If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
         * 
         * @return builder
         * 
         */
        public Builder enforcePolicies(@Nullable Output<Boolean> enforcePolicies) {
            $.enforcePolicies = enforcePolicies;
            return this;
        }

        /**
         * @param enforcePolicies If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
         * 
         * @return builder
         * 
         */
        public Builder enforcePolicies(Boolean enforcePolicies) {
            return enforcePolicies(Output.of(enforcePolicies));
        }

        /**
         * @param identifier Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param signingAlg Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
         * 
         * @return builder
         * 
         */
        public Builder signingAlg(@Nullable Output<String> signingAlg) {
            $.signingAlg = signingAlg;
            return this;
        }

        /**
         * @param signingAlg Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
         * 
         * @return builder
         * 
         */
        public Builder signingAlg(String signingAlg) {
            return signingAlg(Output.of(signingAlg));
        }

        /**
         * @param signingSecret Secret used to sign tokens when using symmetric algorithms (HS256).
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(@Nullable Output<String> signingSecret) {
            $.signingSecret = signingSecret;
            return this;
        }

        /**
         * @param signingSecret Secret used to sign tokens when using symmetric algorithms (HS256).
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(String signingSecret) {
            return signingSecret(Output.of(signingSecret));
        }

        /**
         * @param skipConsentForVerifiableFirstPartyClients Indicates whether to skip user consent for applications flagged as first party.
         * 
         * @return builder
         * 
         */
        public Builder skipConsentForVerifiableFirstPartyClients(@Nullable Output<Boolean> skipConsentForVerifiableFirstPartyClients) {
            $.skipConsentForVerifiableFirstPartyClients = skipConsentForVerifiableFirstPartyClients;
            return this;
        }

        /**
         * @param skipConsentForVerifiableFirstPartyClients Indicates whether to skip user consent for applications flagged as first party.
         * 
         * @return builder
         * 
         */
        public Builder skipConsentForVerifiableFirstPartyClients(Boolean skipConsentForVerifiableFirstPartyClients) {
            return skipConsentForVerifiableFirstPartyClients(Output.of(skipConsentForVerifiableFirstPartyClients));
        }

        /**
         * @param tokenDialect Dialect of access tokens that should be issued for this resource server. Options include `access_token`, `rfc9068_profile`, `access_token_authz`, and `rfc9068_profile_authz`. `access_token` is a JWT containing standard Auth0 claims. `rfc9068_profile` is a JWT conforming to the IETF JWT Access Token Profile. `access_token_authz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068_profile_authz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforce_policies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
         * 
         * @return builder
         * 
         */
        public Builder tokenDialect(@Nullable Output<String> tokenDialect) {
            $.tokenDialect = tokenDialect;
            return this;
        }

        /**
         * @param tokenDialect Dialect of access tokens that should be issued for this resource server. Options include `access_token`, `rfc9068_profile`, `access_token_authz`, and `rfc9068_profile_authz`. `access_token` is a JWT containing standard Auth0 claims. `rfc9068_profile` is a JWT conforming to the IETF JWT Access Token Profile. `access_token_authz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068_profile_authz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforce_policies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
         * 
         * @return builder
         * 
         */
        public Builder tokenDialect(String tokenDialect) {
            return tokenDialect(Output.of(tokenDialect));
        }

        /**
         * @param tokenLifetime Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetime(@Nullable Output<Integer> tokenLifetime) {
            $.tokenLifetime = tokenLifetime;
            return this;
        }

        /**
         * @param tokenLifetime Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetime(Integer tokenLifetime) {
            return tokenLifetime(Output.of(tokenLifetime));
        }

        /**
         * @param tokenLifetimeForWeb Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetimeForWeb(@Nullable Output<Integer> tokenLifetimeForWeb) {
            $.tokenLifetimeForWeb = tokenLifetimeForWeb;
            return this;
        }

        /**
         * @param tokenLifetimeForWeb Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetimeForWeb(Integer tokenLifetimeForWeb) {
            return tokenLifetimeForWeb(Output.of(tokenLifetimeForWeb));
        }

        /**
         * @param verificationLocation URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
         * 
         * @return builder
         * 
         */
        public Builder verificationLocation(@Nullable Output<String> verificationLocation) {
            $.verificationLocation = verificationLocation;
            return this;
        }

        /**
         * @param verificationLocation URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
         * 
         * @return builder
         * 
         */
        public Builder verificationLocation(String verificationLocation) {
            return verificationLocation(Output.of(verificationLocation));
        }

        public ResourceServerState build() {
            return $;
        }
    }

}
