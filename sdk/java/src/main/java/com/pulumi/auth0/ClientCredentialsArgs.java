// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.ClientCredentialsPrivateKeyJwtArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientCredentialsArgs Empty = new ClientCredentialsArgs();

    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
     * 
     */
    @Import(name="authenticationMethod", required=true)
    private Output<String> authenticationMethod;

    /**
     * @return Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
     * 
     */
    public Output<String> authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * The ID of the client for which to configure the authentication method.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The ID of the client for which to configure the authentication method.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Defines `private_key_jwt` client authentication method.
     * 
     */
    @Import(name="privateKeyJwt")
    private @Nullable Output<ClientCredentialsPrivateKeyJwtArgs> privateKeyJwt;

    /**
     * @return Defines `private_key_jwt` client authentication method.
     * 
     */
    public Optional<Output<ClientCredentialsPrivateKeyJwtArgs>> privateKeyJwt() {
        return Optional.ofNullable(this.privateKeyJwt);
    }

    private ClientCredentialsArgs() {}

    private ClientCredentialsArgs(ClientCredentialsArgs $) {
        this.authenticationMethod = $.authenticationMethod;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.privateKeyJwt = $.privateKeyJwt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCredentialsArgs $;

        public Builder() {
            $ = new ClientCredentialsArgs();
        }

        public Builder(ClientCredentialsArgs defaults) {
            $ = new ClientCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMethod Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(Output<String> authenticationMethod) {
            $.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * @param authenticationMethod Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethod(String authenticationMethod) {
            return authenticationMethod(Output.of(authenticationMethod));
        }

        /**
         * @param clientId The ID of the client for which to configure the authentication method.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The ID of the client for which to configure the authentication method.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param privateKeyJwt Defines `private_key_jwt` client authentication method.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyJwt(@Nullable Output<ClientCredentialsPrivateKeyJwtArgs> privateKeyJwt) {
            $.privateKeyJwt = privateKeyJwt;
            return this;
        }

        /**
         * @param privateKeyJwt Defines `private_key_jwt` client authentication method.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyJwt(ClientCredentialsPrivateKeyJwtArgs privateKeyJwt) {
            return privateKeyJwt(Output.of(privateKeyJwt));
        }

        public ClientCredentialsArgs build() {
            if ($.authenticationMethod == null) {
                throw new MissingRequiredPropertyException("ClientCredentialsArgs", "authenticationMethod");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("ClientCredentialsArgs", "clientId");
            }
            return $;
        }
    }

}
