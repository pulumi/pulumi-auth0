// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsFirebase {
    /**
     * @return ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
     * 
     */
    private @Nullable String clientEmail;
    /**
     * @return AWS token lifetime in seconds.
     * 
     */
    private @Nullable Integer lifetimeInSeconds;
    /**
     * @return Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    private @Nullable String privateKey;
    /**
     * @return Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
     * 
     */
    private @Nullable String privateKeyId;
    /**
     * @return Google Firebase Secret. (SDK v2 only).
     * 
     */
    private @Nullable String secret;

    private ClientAddonsFirebase() {}
    /**
     * @return ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
     * 
     */
    public Optional<String> clientEmail() {
        return Optional.ofNullable(this.clientEmail);
    }
    /**
     * @return AWS token lifetime in seconds.
     * 
     */
    public Optional<Integer> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }
    /**
     * @return Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * @return Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
     * 
     */
    public Optional<String> privateKeyId() {
        return Optional.ofNullable(this.privateKeyId);
    }
    /**
     * @return Google Firebase Secret. (SDK v2 only).
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsFirebase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientEmail;
        private @Nullable Integer lifetimeInSeconds;
        private @Nullable String privateKey;
        private @Nullable String privateKeyId;
        private @Nullable String secret;
        public Builder() {}
        public Builder(ClientAddonsFirebase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientEmail = defaults.clientEmail;
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder clientEmail(@Nullable String clientEmail) {
            this.clientEmail = clientEmail;
            return this;
        }
        @CustomType.Setter
        public Builder lifetimeInSeconds(@Nullable Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyId(@Nullable String privateKeyId) {
            this.privateKeyId = privateKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        public ClientAddonsFirebase build() {
            final var _resultValue = new ClientAddonsFirebase();
            _resultValue.clientEmail = clientEmail;
            _resultValue.lifetimeInSeconds = lifetimeInSeconds;
            _resultValue.privateKey = privateKey;
            _resultValue.privateKeyId = privateKeyId;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
