// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ConnectionOptionsValidationUsernameArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsValidationArgs Empty = new ConnectionOptionsValidationArgs();

    /**
     * Specifies the `min` and `max` values of username length. `min` and `max` are integers.
     * 
     */
    @Import(name="username")
    private @Nullable Output<ConnectionOptionsValidationUsernameArgs> username;

    /**
     * @return Specifies the `min` and `max` values of username length. `min` and `max` are integers.
     * 
     */
    public Optional<Output<ConnectionOptionsValidationUsernameArgs>> username() {
        return Optional.ofNullable(this.username);
    }

    private ConnectionOptionsValidationArgs() {}

    private ConnectionOptionsValidationArgs(ConnectionOptionsValidationArgs $) {
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsValidationArgs $;

        public Builder() {
            $ = new ConnectionOptionsValidationArgs();
        }

        public Builder(ConnectionOptionsValidationArgs defaults) {
            $ = new ConnectionOptionsValidationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param username Specifies the `min` and `max` values of username length. `min` and `max` are integers.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<ConnectionOptionsValidationUsernameArgs> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Specifies the `min` and `max` values of username length. `min` and `max` are integers.
         * 
         * @return builder
         * 
         */
        public Builder username(ConnectionOptionsValidationUsernameArgs username) {
            return username(Output.of(username));
        }

        public ConnectionOptionsValidationArgs build() {
            return $;
        }
    }

}
