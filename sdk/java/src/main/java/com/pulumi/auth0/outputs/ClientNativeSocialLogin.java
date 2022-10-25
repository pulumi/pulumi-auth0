// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ClientNativeSocialLoginApple;
import com.pulumi.auth0.outputs.ClientNativeSocialLoginFacebook;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientNativeSocialLogin {
    /**
     * @return Resource:
     * 
     */
    private @Nullable ClientNativeSocialLoginApple apple;
    /**
     * @return Resources:
     * 
     */
    private @Nullable ClientNativeSocialLoginFacebook facebook;

    private ClientNativeSocialLogin() {}
    /**
     * @return Resource:
     * 
     */
    public Optional<ClientNativeSocialLoginApple> apple() {
        return Optional.ofNullable(this.apple);
    }
    /**
     * @return Resources:
     * 
     */
    public Optional<ClientNativeSocialLoginFacebook> facebook() {
        return Optional.ofNullable(this.facebook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientNativeSocialLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClientNativeSocialLoginApple apple;
        private @Nullable ClientNativeSocialLoginFacebook facebook;
        public Builder() {}
        public Builder(ClientNativeSocialLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apple = defaults.apple;
    	      this.facebook = defaults.facebook;
        }

        @CustomType.Setter
        public Builder apple(@Nullable ClientNativeSocialLoginApple apple) {
            this.apple = apple;
            return this;
        }
        @CustomType.Setter
        public Builder facebook(@Nullable ClientNativeSocialLoginFacebook facebook) {
            this.facebook = facebook;
            return this;
        }
        public ClientNativeSocialLogin build() {
            final var o = new ClientNativeSocialLogin();
            o.apple = apple;
            o.facebook = facebook;
            return o;
        }
    }
}