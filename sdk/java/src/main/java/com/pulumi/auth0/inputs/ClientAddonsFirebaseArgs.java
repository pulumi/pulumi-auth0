// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsFirebaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsFirebaseArgs Empty = new ClientAddonsFirebaseArgs();

    /**
     * ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
     * 
     */
    @Import(name="clientEmail")
    private @Nullable Output<String> clientEmail;

    /**
     * @return ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
     * 
     */
    public Optional<Output<String>> clientEmail() {
        return Optional.ofNullable(this.clientEmail);
    }

    /**
     * Optional expiration in seconds for the generated token. Defaults to 3600 seconds (SDK v3+ tokens only).
     * 
     */
    @Import(name="lifetimeInSeconds")
    private @Nullable Output<Integer> lifetimeInSeconds;

    /**
     * @return Optional expiration in seconds for the generated token. Defaults to 3600 seconds (SDK v3+ tokens only).
     * 
     */
    public Optional<Output<Integer>> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }

    /**
     * Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
     * 
     */
    @Import(name="privateKeyId")
    private @Nullable Output<String> privateKeyId;

    /**
     * @return Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
     * 
     */
    public Optional<Output<String>> privateKeyId() {
        return Optional.ofNullable(this.privateKeyId);
    }

    /**
     * Google Firebase Secret. (SDK v2 only).
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Google Firebase Secret. (SDK v2 only).
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private ClientAddonsFirebaseArgs() {}

    private ClientAddonsFirebaseArgs(ClientAddonsFirebaseArgs $) {
        this.clientEmail = $.clientEmail;
        this.lifetimeInSeconds = $.lifetimeInSeconds;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsFirebaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsFirebaseArgs $;

        public Builder() {
            $ = new ClientAddonsFirebaseArgs();
        }

        public Builder(ClientAddonsFirebaseArgs defaults) {
            $ = new ClientAddonsFirebaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientEmail ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(@Nullable Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        /**
         * @param clientEmail ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        /**
         * @param lifetimeInSeconds Optional expiration in seconds for the generated token. Defaults to 3600 seconds (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder lifetimeInSeconds(@Nullable Output<Integer> lifetimeInSeconds) {
            $.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }

        /**
         * @param lifetimeInSeconds Optional expiration in seconds for the generated token. Defaults to 3600 seconds (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            return lifetimeInSeconds(Output.of(lifetimeInSeconds));
        }

        /**
         * @param privateKey Private Key for signing the token (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private Key for signing the token (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyId Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(@Nullable Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        /**
         * @param privateKeyId Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        /**
         * @param secret Google Firebase Secret. (SDK v2 only).
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Google Firebase Secret. (SDK v2 only).
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ClientAddonsFirebaseArgs build() {
            return $;
        }
    }

}
