// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAuthenticationMethodPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAuthenticationMethodPasswordArgs Empty = new ConnectionOptionsAuthenticationMethodPasswordArgs();

    /**
     * Enables password authentication
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables password authentication
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ConnectionOptionsAuthenticationMethodPasswordArgs() {}

    private ConnectionOptionsAuthenticationMethodPasswordArgs(ConnectionOptionsAuthenticationMethodPasswordArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAuthenticationMethodPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAuthenticationMethodPasswordArgs $;

        public Builder() {
            $ = new ConnectionOptionsAuthenticationMethodPasswordArgs();
        }

        public Builder(ConnectionOptionsAuthenticationMethodPasswordArgs defaults) {
            $ = new ConnectionOptionsAuthenticationMethodPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables password authentication
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables password authentication
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ConnectionOptionsAuthenticationMethodPasswordArgs build() {
            return $;
        }
    }

}
