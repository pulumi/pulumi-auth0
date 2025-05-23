// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetConnectionOptionAuthenticationMethodPasskey;
import com.pulumi.auth0.outputs.GetConnectionOptionAuthenticationMethodPassword;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionAuthenticationMethod {
    /**
     * @return Configures passkey authentication
     * 
     */
    private List<GetConnectionOptionAuthenticationMethodPasskey> passkeys;
    /**
     * @return Configures password authentication
     * 
     */
    private List<GetConnectionOptionAuthenticationMethodPassword> passwords;

    private GetConnectionOptionAuthenticationMethod() {}
    /**
     * @return Configures passkey authentication
     * 
     */
    public List<GetConnectionOptionAuthenticationMethodPasskey> passkeys() {
        return this.passkeys;
    }
    /**
     * @return Configures password authentication
     * 
     */
    public List<GetConnectionOptionAuthenticationMethodPassword> passwords() {
        return this.passwords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionAuthenticationMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectionOptionAuthenticationMethodPasskey> passkeys;
        private List<GetConnectionOptionAuthenticationMethodPassword> passwords;
        public Builder() {}
        public Builder(GetConnectionOptionAuthenticationMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passkeys = defaults.passkeys;
    	      this.passwords = defaults.passwords;
        }

        @CustomType.Setter
        public Builder passkeys(List<GetConnectionOptionAuthenticationMethodPasskey> passkeys) {
            if (passkeys == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionAuthenticationMethod", "passkeys");
            }
            this.passkeys = passkeys;
            return this;
        }
        public Builder passkeys(GetConnectionOptionAuthenticationMethodPasskey... passkeys) {
            return passkeys(List.of(passkeys));
        }
        @CustomType.Setter
        public Builder passwords(List<GetConnectionOptionAuthenticationMethodPassword> passwords) {
            if (passwords == null) {
              throw new MissingRequiredPropertyException("GetConnectionOptionAuthenticationMethod", "passwords");
            }
            this.passwords = passwords;
            return this;
        }
        public Builder passwords(GetConnectionOptionAuthenticationMethodPassword... passwords) {
            return passwords(List.of(passwords));
        }
        public GetConnectionOptionAuthenticationMethod build() {
            final var _resultValue = new GetConnectionOptionAuthenticationMethod();
            _resultValue.passkeys = passkeys;
            _resultValue.passwords = passwords;
            return _resultValue;
        }
    }
}
