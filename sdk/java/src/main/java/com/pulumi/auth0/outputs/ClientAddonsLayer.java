// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsLayer {
    /**
     * @return Expiration in minutes for the generated token (default of 5 minutes).
     * 
     */
    private @Nullable Integer expiration;
    /**
     * @return Authentication Key identifier used to sign the Layer token.
     * 
     */
    private String keyId;
    /**
     * @return AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
     * 
     */
    private @Nullable String principal;
    /**
     * @return Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    private String privateKey;
    /**
     * @return Provider ID of your Layer account.
     * 
     */
    private String providerId;

    private ClientAddonsLayer() {}
    /**
     * @return Expiration in minutes for the generated token (default of 5 minutes).
     * 
     */
    public Optional<Integer> expiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * @return Authentication Key identifier used to sign the Layer token.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
     * 
     */
    public Optional<String> principal() {
        return Optional.ofNullable(this.principal);
    }
    /**
     * @return Private Key for signing the token (SDK v3+ tokens only).
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return Provider ID of your Layer account.
     * 
     */
    public String providerId() {
        return this.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsLayer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer expiration;
        private String keyId;
        private @Nullable String principal;
        private String privateKey;
        private String providerId;
        public Builder() {}
        public Builder(ClientAddonsLayer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiration = defaults.expiration;
    	      this.keyId = defaults.keyId;
    	      this.principal = defaults.principal;
    	      this.privateKey = defaults.privateKey;
    	      this.providerId = defaults.providerId;
        }

        @CustomType.Setter
        public Builder expiration(@Nullable Integer expiration) {

            this.expiration = expiration;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            if (keyId == null) {
              throw new MissingRequiredPropertyException("ClientAddonsLayer", "keyId");
            }
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder principal(@Nullable String principal) {

            this.principal = principal;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            if (privateKey == null) {
              throw new MissingRequiredPropertyException("ClientAddonsLayer", "privateKey");
            }
            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder providerId(String providerId) {
            if (providerId == null) {
              throw new MissingRequiredPropertyException("ClientAddonsLayer", "providerId");
            }
            this.providerId = providerId;
            return this;
        }
        public ClientAddonsLayer build() {
            final var _resultValue = new ClientAddonsLayer();
            _resultValue.expiration = expiration;
            _resultValue.keyId = keyId;
            _resultValue.principal = principal;
            _resultValue.privateKey = privateKey;
            _resultValue.providerId = providerId;
            return _resultValue;
        }
    }
}
