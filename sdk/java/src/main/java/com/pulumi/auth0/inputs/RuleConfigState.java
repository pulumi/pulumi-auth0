// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleConfigState extends com.pulumi.resources.ResourceArgs {

    public static final RuleConfigState Empty = new RuleConfigState();

    /**
     * Key for a rules configuration variable.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key for a rules configuration variable.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value for a rules configuration variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value for a rules configuration variable.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RuleConfigState() {}

    private RuleConfigState(RuleConfigState $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleConfigState $;

        public Builder() {
            $ = new RuleConfigState();
        }

        public Builder(RuleConfigState defaults) {
            $ = new RuleConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RuleConfigState build() {
            return $;
        }
    }

}
