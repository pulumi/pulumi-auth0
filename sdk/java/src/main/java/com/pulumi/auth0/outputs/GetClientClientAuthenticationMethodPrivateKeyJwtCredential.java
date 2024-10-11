// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientClientAuthenticationMethodPrivateKeyJwtCredential {
    /**
     * @return Algorithm which will be used with the credential. Can be one of `RS256`, `RS384`, `PS256`. If not specified, `RS256` will be used.
     * 
     */
    private String algorithm;
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    private String createdAt;
    /**
     * @return Credential type. Supported types: `public_key`.
     * 
     */
    private String credentialType;
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    private String expiresAt;
    /**
     * @return The ID of the client credential.
     * 
     */
    private String id;
    /**
     * @return The key identifier of the credential, generated on creation.
     * 
     */
    private String keyId;
    /**
     * @return Friendly name for a credential.
     * 
     */
    private String name;
    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    private String updatedAt;

    private GetClientClientAuthenticationMethodPrivateKeyJwtCredential() {}
    /**
     * @return Algorithm which will be used with the credential. Can be one of `RS256`, `RS384`, `PS256`. If not specified, `RS256` will be used.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Credential type. Supported types: `public_key`.
     * 
     */
    public String credentialType() {
        return this.credentialType;
    }
    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The ID of the client credential.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The key identifier of the credential, generated on creation.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return Friendly name for a credential.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientClientAuthenticationMethodPrivateKeyJwtCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String algorithm;
        private String createdAt;
        private String credentialType;
        private String expiresAt;
        private String id;
        private String keyId;
        private String name;
        private String updatedAt;
        public Builder() {}
        public Builder(GetClientClientAuthenticationMethodPrivateKeyJwtCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.createdAt = defaults.createdAt;
    	      this.credentialType = defaults.credentialType;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder algorithm(String algorithm) {
            if (algorithm == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "algorithm");
            }
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder credentialType(String credentialType) {
            if (credentialType == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "credentialType");
            }
            this.credentialType = credentialType;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            if (keyId == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "keyId");
            }
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetClientClientAuthenticationMethodPrivateKeyJwtCredential", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetClientClientAuthenticationMethodPrivateKeyJwtCredential build() {
            final var _resultValue = new GetClientClientAuthenticationMethodPrivateKeyJwtCredential();
            _resultValue.algorithm = algorithm;
            _resultValue.createdAt = createdAt;
            _resultValue.credentialType = credentialType;
            _resultValue.expiresAt = expiresAt;
            _resultValue.id = id;
            _resultValue.keyId = keyId;
            _resultValue.name = name;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}