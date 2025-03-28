// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceServerProofOfPossessionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerProofOfPossessionArgs Empty = new ResourceServerProofOfPossessionArgs();

    /**
     * Disable proof-of-possession.
     * 
     */
    @Import(name="disable")
    private @Nullable Output<Boolean> disable;

    /**
     * @return Disable proof-of-possession.
     * 
     */
    public Optional<Output<Boolean>> disable() {
        return Optional.ofNullable(this.disable);
    }

    /**
     * Mechanism used for proof-of-possession. Only `mtls` is supported.
     * 
     */
    @Import(name="mechanism")
    private @Nullable Output<String> mechanism;

    /**
     * @return Mechanism used for proof-of-possession. Only `mtls` is supported.
     * 
     */
    public Optional<Output<String>> mechanism() {
        return Optional.ofNullable(this.mechanism);
    }

    /**
     * Indicates whether proof-of-possession is required with this resource server.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Indicates whether proof-of-possession is required with this resource server.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    private ResourceServerProofOfPossessionArgs() {}

    private ResourceServerProofOfPossessionArgs(ResourceServerProofOfPossessionArgs $) {
        this.disable = $.disable;
        this.mechanism = $.mechanism;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerProofOfPossessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerProofOfPossessionArgs $;

        public Builder() {
            $ = new ResourceServerProofOfPossessionArgs();
        }

        public Builder(ResourceServerProofOfPossessionArgs defaults) {
            $ = new ResourceServerProofOfPossessionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disable Disable proof-of-possession.
         * 
         * @return builder
         * 
         */
        public Builder disable(@Nullable Output<Boolean> disable) {
            $.disable = disable;
            return this;
        }

        /**
         * @param disable Disable proof-of-possession.
         * 
         * @return builder
         * 
         */
        public Builder disable(Boolean disable) {
            return disable(Output.of(disable));
        }

        /**
         * @param mechanism Mechanism used for proof-of-possession. Only `mtls` is supported.
         * 
         * @return builder
         * 
         */
        public Builder mechanism(@Nullable Output<String> mechanism) {
            $.mechanism = mechanism;
            return this;
        }

        /**
         * @param mechanism Mechanism used for proof-of-possession. Only `mtls` is supported.
         * 
         * @return builder
         * 
         */
        public Builder mechanism(String mechanism) {
            return mechanism(Output.of(mechanism));
        }

        /**
         * @param required Indicates whether proof-of-possession is required with this resource server.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Indicates whether proof-of-possession is required with this resource server.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public ResourceServerProofOfPossessionArgs build() {
            return $;
        }
    }

}
