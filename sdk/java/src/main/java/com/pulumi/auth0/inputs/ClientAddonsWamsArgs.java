// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsWamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsWamsArgs Empty = new ClientAddonsWamsArgs();

    /**
     * Your master key for Windows Azure Mobile Services.
     * 
     */
    @Import(name="masterKey")
    private @Nullable Output<String> masterKey;

    /**
     * @return Your master key for Windows Azure Mobile Services.
     * 
     */
    public Optional<Output<String>> masterKey() {
        return Optional.ofNullable(this.masterKey);
    }

    private ClientAddonsWamsArgs() {}

    private ClientAddonsWamsArgs(ClientAddonsWamsArgs $) {
        this.masterKey = $.masterKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsWamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsWamsArgs $;

        public Builder() {
            $ = new ClientAddonsWamsArgs();
        }

        public Builder(ClientAddonsWamsArgs defaults) {
            $ = new ClientAddonsWamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param masterKey Your master key for Windows Azure Mobile Services.
         * 
         * @return builder
         * 
         */
        public Builder masterKey(@Nullable Output<String> masterKey) {
            $.masterKey = masterKey;
            return this;
        }

        /**
         * @param masterKey Your master key for Windows Azure Mobile Services.
         * 
         * @return builder
         * 
         */
        public Builder masterKey(String masterKey) {
            return masterKey(Output.of(masterKey));
        }

        public ClientAddonsWamsArgs build() {
            return $;
        }
    }

}
