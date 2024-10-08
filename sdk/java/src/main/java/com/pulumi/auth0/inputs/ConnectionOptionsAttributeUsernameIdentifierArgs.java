// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributeUsernameIdentifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributeUsernameIdentifierArgs Empty = new ConnectionOptionsAttributeUsernameIdentifierArgs();

    /**
     * Defines whether UserName attribute is active as an identifier
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Defines whether UserName attribute is active as an identifier
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    private ConnectionOptionsAttributeUsernameIdentifierArgs() {}

    private ConnectionOptionsAttributeUsernameIdentifierArgs(ConnectionOptionsAttributeUsernameIdentifierArgs $) {
        this.active = $.active;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributeUsernameIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributeUsernameIdentifierArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributeUsernameIdentifierArgs();
        }

        public Builder(ConnectionOptionsAttributeUsernameIdentifierArgs defaults) {
            $ = new ConnectionOptionsAttributeUsernameIdentifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Defines whether UserName attribute is active as an identifier
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Defines whether UserName attribute is active as an identifier
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public ConnectionOptionsAttributeUsernameIdentifierArgs build() {
            return $;
        }
    }

}
