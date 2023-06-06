// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientCredentialsPrivateKeyJwtCredential {
    private @Nullable String algorithm;
    private @Nullable String createdAt;
    private String credentialType;
    private @Nullable String expiresAt;
    /**
     * @return The ID of this resource.
     * 
     */
    private @Nullable String id;
    private @Nullable String keyId;
    private @Nullable String name;
    private @Nullable Boolean parseExpiryFromCert;
    private String pem;
    private @Nullable String updatedAt;

    private ClientCredentialsPrivateKeyJwtCredential() {}
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public String credentialType() {
        return this.credentialType;
    }
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> parseExpiryFromCert() {
        return Optional.ofNullable(this.parseExpiryFromCert);
    }
    public String pem() {
        return this.pem;
    }
    public Optional<String> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCredentialsPrivateKeyJwtCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String createdAt;
        private String credentialType;
        private @Nullable String expiresAt;
        private @Nullable String id;
        private @Nullable String keyId;
        private @Nullable String name;
        private @Nullable Boolean parseExpiryFromCert;
        private String pem;
        private @Nullable String updatedAt;
        public Builder() {}
        public Builder(ClientCredentialsPrivateKeyJwtCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.createdAt = defaults.createdAt;
    	      this.credentialType = defaults.credentialType;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.parseExpiryFromCert = defaults.parseExpiryFromCert;
    	      this.pem = defaults.pem;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder credentialType(String credentialType) {
            this.credentialType = Objects.requireNonNull(credentialType);
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder parseExpiryFromCert(@Nullable Boolean parseExpiryFromCert) {
            this.parseExpiryFromCert = parseExpiryFromCert;
            return this;
        }
        @CustomType.Setter
        public Builder pem(String pem) {
            this.pem = Objects.requireNonNull(pem);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public ClientCredentialsPrivateKeyJwtCredential build() {
            final var o = new ClientCredentialsPrivateKeyJwtCredential();
            o.algorithm = algorithm;
            o.createdAt = createdAt;
            o.credentialType = credentialType;
            o.expiresAt = expiresAt;
            o.id = id;
            o.keyId = keyId;
            o.name = name;
            o.parseExpiryFromCert = parseExpiryFromCert;
            o.pem = pem;
            o.updatedAt = updatedAt;
            return o;
        }
    }
}