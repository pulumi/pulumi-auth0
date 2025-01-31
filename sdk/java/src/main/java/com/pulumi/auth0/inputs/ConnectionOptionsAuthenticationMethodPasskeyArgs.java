// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAuthenticationMethodPasskeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAuthenticationMethodPasskeyArgs Empty = new ConnectionOptionsAuthenticationMethodPasskeyArgs();

    /**
     * Enables passkey authentication
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables passkey authentication
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ConnectionOptionsAuthenticationMethodPasskeyArgs() {}

    private ConnectionOptionsAuthenticationMethodPasskeyArgs(ConnectionOptionsAuthenticationMethodPasskeyArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAuthenticationMethodPasskeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAuthenticationMethodPasskeyArgs $;

        public Builder() {
            $ = new ConnectionOptionsAuthenticationMethodPasskeyArgs();
        }

        public Builder(ConnectionOptionsAuthenticationMethodPasskeyArgs defaults) {
            $ = new ConnectionOptionsAuthenticationMethodPasskeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables passkey authentication
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables passkey authentication
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ConnectionOptionsAuthenticationMethodPasskeyArgs build() {
            return $;
        }
    }

}
