// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientCredentialsSelfSignedTlsClientAuthCredential {
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    private @Nullable String createdAt;
    /**
     * @return Credential type. Supported types: `x509_cert`.
     * 
     */
    private @Nullable String credentialType;
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    private @Nullable String expiresAt;
    /**
     * @return The ID of the client credential.
     * 
     */
    private @Nullable String id;
    /**
     * @return Friendly name for a credential.
     * 
     */
    private @Nullable String name;
    /**
     * @return PEM-formatted X509 certificate. Must be JSON escaped.
     * 
     */
    private String pem;
    /**
     * @return The X509 certificate&#39;s SHA256 thumbprint.
     * 
     */
    private @Nullable String thumbprintSha256;
    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    private @Nullable String updatedAt;

    private ClientCredentialsSelfSignedTlsClientAuthCredential() {}
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return Credential type. Supported types: `x509_cert`.
     * 
     */
    public Optional<String> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    /**
     * @return The ID of the client credential.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Friendly name for a credential.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return PEM-formatted X509 certificate. Must be JSON escaped.
     * 
     */
    public String pem() {
        return this.pem;
    }
    /**
     * @return The X509 certificate&#39;s SHA256 thumbprint.
     * 
     */
    public Optional<String> thumbprintSha256() {
        return Optional.ofNullable(this.thumbprintSha256);
    }
    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    public Optional<String> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCredentialsSelfSignedTlsClientAuthCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String credentialType;
        private @Nullable String expiresAt;
        private @Nullable String id;
        private @Nullable String name;
        private String pem;
        private @Nullable String thumbprintSha256;
        private @Nullable String updatedAt;
        public Builder() {}
        public Builder(ClientCredentialsSelfSignedTlsClientAuthCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.credentialType = defaults.credentialType;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pem = defaults.pem;
    	      this.thumbprintSha256 = defaults.thumbprintSha256;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {

            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder credentialType(@Nullable String credentialType) {

            this.credentialType = credentialType;
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
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pem(String pem) {
            if (pem == null) {
              throw new MissingRequiredPropertyException("ClientCredentialsSelfSignedTlsClientAuthCredential", "pem");
            }
            this.pem = pem;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprintSha256(@Nullable String thumbprintSha256) {

            this.thumbprintSha256 = thumbprintSha256;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable String updatedAt) {

            this.updatedAt = updatedAt;
            return this;
        }
        public ClientCredentialsSelfSignedTlsClientAuthCredential build() {
            final var _resultValue = new ClientCredentialsSelfSignedTlsClientAuthCredential();
            _resultValue.createdAt = createdAt;
            _resultValue.credentialType = credentialType;
            _resultValue.expiresAt = expiresAt;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.pem = pem;
            _resultValue.thumbprintSha256 = thumbprintSha256;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}