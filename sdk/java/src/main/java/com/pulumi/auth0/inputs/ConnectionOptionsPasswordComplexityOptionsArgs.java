// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsPasswordComplexityOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsPasswordComplexityOptionsArgs Empty = new ConnectionOptionsPasswordComplexityOptionsArgs();

    /**
     * Minimum number of characters allowed in passwords.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return Minimum number of characters allowed in passwords.
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    private ConnectionOptionsPasswordComplexityOptionsArgs() {}

    private ConnectionOptionsPasswordComplexityOptionsArgs(ConnectionOptionsPasswordComplexityOptionsArgs $) {
        this.minLength = $.minLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsPasswordComplexityOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsPasswordComplexityOptionsArgs $;

        public Builder() {
            $ = new ConnectionOptionsPasswordComplexityOptionsArgs();
        }

        public Builder(ConnectionOptionsPasswordComplexityOptionsArgs defaults) {
            $ = new ConnectionOptionsPasswordComplexityOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minLength Minimum number of characters allowed in passwords.
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength Minimum number of characters allowed in passwords.
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        public ConnectionOptionsPasswordComplexityOptionsArgs build() {
            return $;
        }
    }

}
