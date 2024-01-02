// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientCredentialsPrivateKeyJwtCredential {
    /**
     * @return Algorithm which will be used with the credential. Can be one of `RS256`, `RS384`, `PS256`. If not specified, `RS256` will be used.
     * 
     */
    private @Nullable String algorithm;
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    private @Nullable String createdAt;
    /**
     * @return Credential type. Supported types: `public_key`.
     * 
     */
    private String credentialType;
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential. It is not possible to set this to never expire after it has been set. Recreate the certificate if needed.
     * 
     */
    private @Nullable String expiresAt;
    /**
     * @return The ID of the client credential.
     * 
     */
    private @Nullable String id;
    /**
     * @return The key identifier of the credential, generated on creation.
     * 
     */
    private @Nullable String keyId;
    /**
     * @return Friendly name for a credential.
     * 
     */
    private @Nullable String name;
    /**
     * @return Parse expiry from x509 certificate. If true, attempts to parse the expiry date from the provided PEM. If also the `expires_at` is set the credential expiry will be set to the explicit `expires_at` value.
     * 
     */
    private @Nullable Boolean parseExpiryFromCert;
    /**
     * @return PEM-formatted public key (SPKI and PKCS1) or X509 certificate. Must be JSON escaped.
     * 
     */
    private String pem;
    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    private @Nullable String updatedAt;

    private ClientCredentialsPrivateKeyJwtCredential() {}
    /**
     * @return Algorithm which will be used with the credential. Can be one of `RS256`, `RS384`, `PS256`. If not specified, `RS256` will be used.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return Credential type. Supported types: `public_key`.
     * 
     */
    public String credentialType() {
        return this.credentialType;
    }
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential. It is not possible to set this to never expire after it has been set. Recreate the certificate if needed.
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
     * @return The key identifier of the credential, generated on creation.
     * 
     */
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    /**
     * @return Friendly name for a credential.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Parse expiry from x509 certificate. If true, attempts to parse the expiry date from the provided PEM. If also the `expires_at` is set the credential expiry will be set to the explicit `expires_at` value.
     * 
     */
    public Optional<Boolean> parseExpiryFromCert() {
        return Optional.ofNullable(this.parseExpiryFromCert);
    }
    /**
     * @return PEM-formatted public key (SPKI and PKCS1) or X509 certificate. Must be JSON escaped.
     * 
     */
    public String pem() {
        return this.pem;
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
            if (credentialType == null) {
              throw new MissingRequiredPropertyException("ClientCredentialsPrivateKeyJwtCredential", "credentialType");
            }
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
            if (pem == null) {
              throw new MissingRequiredPropertyException("ClientCredentialsPrivateKeyJwtCredential", "pem");
            }
            this.pem = pem;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(@Nullable String updatedAt) {

            this.updatedAt = updatedAt;
            return this;
        }
        public ClientCredentialsPrivateKeyJwtCredential build() {
            final var _resultValue = new ClientCredentialsPrivateKeyJwtCredential();
            _resultValue.algorithm = algorithm;
            _resultValue.createdAt = createdAt;
            _resultValue.credentialType = credentialType;
            _resultValue.expiresAt = expiresAt;
            _resultValue.id = id;
            _resultValue.keyId = keyId;
            _resultValue.name = name;
            _resultValue.parseExpiryFromCert = parseExpiryFromCert;
            _resultValue.pem = pem;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
