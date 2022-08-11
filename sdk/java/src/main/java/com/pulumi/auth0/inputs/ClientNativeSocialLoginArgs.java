// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ClientNativeSocialLoginAppleArgs;
import com.pulumi.auth0.inputs.ClientNativeSocialLoginFacebookArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientNativeSocialLoginArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientNativeSocialLoginArgs Empty = new ClientNativeSocialLoginArgs();

    /**
     * Resource:
     * 
     */
    @Import(name="apple")
    private @Nullable Output<ClientNativeSocialLoginAppleArgs> apple;

    /**
     * @return Resource:
     * 
     */
    public Optional<Output<ClientNativeSocialLoginAppleArgs>> apple() {
        return Optional.ofNullable(this.apple);
    }

    /**
     * Resources:
     * 
     */
    @Import(name="facebook")
    private @Nullable Output<ClientNativeSocialLoginFacebookArgs> facebook;

    /**
     * @return Resources:
     * 
     */
    public Optional<Output<ClientNativeSocialLoginFacebookArgs>> facebook() {
        return Optional.ofNullable(this.facebook);
    }

    private ClientNativeSocialLoginArgs() {}

    private ClientNativeSocialLoginArgs(ClientNativeSocialLoginArgs $) {
        this.apple = $.apple;
        this.facebook = $.facebook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientNativeSocialLoginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientNativeSocialLoginArgs $;

        public Builder() {
            $ = new ClientNativeSocialLoginArgs();
        }

        public Builder(ClientNativeSocialLoginArgs defaults) {
            $ = new ClientNativeSocialLoginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apple Resource:
         * 
         * @return builder
         * 
         */
        public Builder apple(@Nullable Output<ClientNativeSocialLoginAppleArgs> apple) {
            $.apple = apple;
            return this;
        }

        /**
         * @param apple Resource:
         * 
         * @return builder
         * 
         */
        public Builder apple(ClientNativeSocialLoginAppleArgs apple) {
            return apple(Output.of(apple));
        }

        /**
         * @param facebook Resources:
         * 
         * @return builder
         * 
         */
        public Builder facebook(@Nullable Output<ClientNativeSocialLoginFacebookArgs> facebook) {
            $.facebook = facebook;
            return this;
        }

        /**
         * @param facebook Resources:
         * 
         * @return builder
         * 
         */
        public Builder facebook(ClientNativeSocialLoginFacebookArgs facebook) {
            return facebook(Output.of(facebook));
        }

        public ClientNativeSocialLoginArgs build() {
            return $;
        }
    }

}
