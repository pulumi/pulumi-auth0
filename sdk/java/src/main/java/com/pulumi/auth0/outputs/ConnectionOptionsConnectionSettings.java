// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionOptionsConnectionSettings {
    /**
     * @return PKCE configuration. Possible values: `auto` (uses the strongest algorithm available), `S256` (uses the SHA-256 algorithm), `plain` (uses plaintext as described in the PKCE specification) or `disabled` (disables support for PKCE).
     * 
     */
    private String pkce;

    private ConnectionOptionsConnectionSettings() {}
    /**
     * @return PKCE configuration. Possible values: `auto` (uses the strongest algorithm available), `S256` (uses the SHA-256 algorithm), `plain` (uses plaintext as described in the PKCE specification) or `disabled` (disables support for PKCE).
     * 
     */
    public String pkce() {
        return this.pkce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsConnectionSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pkce;
        public Builder() {}
        public Builder(ConnectionOptionsConnectionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pkce = defaults.pkce;
        }

        @CustomType.Setter
        public Builder pkce(String pkce) {
            if (pkce == null) {
              throw new MissingRequiredPropertyException("ConnectionOptionsConnectionSettings", "pkce");
            }
            this.pkce = pkce;
            return this;
        }
        public ConnectionOptionsConnectionSettings build() {
            final var _resultValue = new ConnectionOptionsConnectionSettings();
            _resultValue.pkce = pkce;
            return _resultValue;
        }
    }
}
