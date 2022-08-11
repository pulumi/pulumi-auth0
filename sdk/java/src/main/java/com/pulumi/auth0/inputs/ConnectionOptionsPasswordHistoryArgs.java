// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsPasswordHistoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsPasswordHistoryArgs Empty = new ConnectionOptionsPasswordHistoryArgs();

    /**
     * Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Indicates the number of passwords to keep in history with a maximum of 24.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Indicates the number of passwords to keep in history with a maximum of 24.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    private ConnectionOptionsPasswordHistoryArgs() {}

    private ConnectionOptionsPasswordHistoryArgs(ConnectionOptionsPasswordHistoryArgs $) {
        this.enable = $.enable;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsPasswordHistoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsPasswordHistoryArgs $;

        public Builder() {
            $ = new ConnectionOptionsPasswordHistoryArgs();
        }

        public Builder(ConnectionOptionsPasswordHistoryArgs defaults) {
            $ = new ConnectionOptionsPasswordHistoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param size Indicates the number of passwords to keep in history with a maximum of 24.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Indicates the number of passwords to keep in history with a maximum of 24.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public ConnectionOptionsPasswordHistoryArgs build() {
            return $;
        }
    }

}
