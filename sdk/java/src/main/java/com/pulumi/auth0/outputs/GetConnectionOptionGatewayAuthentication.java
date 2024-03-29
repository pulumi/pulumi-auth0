// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionGatewayAuthentication {
    /**
     * @return Audience claim for the HS256 token sent to `gateway_url`.
     * 
     */
    private String audience;
    /**
     * @return Authentication method (default is `bearer` token).
     * 
     */
    private String method;
    /**
     * @return Secret used to sign the HS256 token sent to `gateway_url`.
     * 
     */
    private String secret;
    /**
     * @return Specifies whether or not the secret is Base64-encoded.
     * 
     */
    private Boolean secretBase64Encoded;
    /**
     * @return Subject claim for the HS256 token sent to `gateway_url`.
     * 
     */
    private String subject;

    private GetConnectionOptionGatewayAuthentication() {}
    /**
     * @return Audience claim for the HS256 token sent to `gateway_url`.
     * 
     */
    public String audience() {
        return this.audience;
    }
    /**
     * @return Authentication method (default is `bearer` token).
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Secret used to sign the HS256 token sent to `gateway_url`.
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Specifies whether or not the secret is Base64-encoded.
     * 
     */
    public Boolean secretBase64Encoded() {
        return this.secretBase64Encoded;
    }
    /**
     * @return Subject claim for the HS256 token sent to `gateway_url`.
     * 
     */
    public String subject() {
        return this.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionGatewayAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String audience;
        private String method;
        private String secret;
        private Boolean secretBase64Encoded;
        private String subject;
        public Builder() {}
        public Builder(GetConnectionOptionGatewayAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.method = defaults.method;
    	      this.secret = defaults.secret;
    	      this.secretBase64Encoded = defaults.secretBase64Encoded;
    	      this.subject = defaults.subject;
        }

        @CustomType.Setter
        public Builder audience(String audience) {
            if (audience == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionGatewayAuthentication", "audience");
            }
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionGatewayAuthentication", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionGatewayAuthentication", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder secretBase64Encoded(Boolean secretBase64Encoded) {
            if (secretBase64Encoded == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionGatewayAuthentication", "secretBase64Encoded");
            }
            this.secretBase64Encoded = secretBase64Encoded;
            return this;
        }
        @CustomType.Setter
        public Builder subject(String subject) {
            if (subject == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionGatewayAuthentication", "subject");
            }
            this.subject = subject;
            return this;
        }
        public GetConnectionOptionGatewayAuthentication build() {
            final var _resultValue = new GetConnectionOptionGatewayAuthentication();
            _resultValue.audience = audience;
            _resultValue.method = method;
            _resultValue.secret = secret;
            _resultValue.secretBase64Encoded = secretBase64Encoded;
            _resultValue.subject = subject;
            return _resultValue;
        }
    }
}
