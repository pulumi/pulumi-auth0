// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleConfigArgs Empty = new RuleConfigArgs();

    /**
     * String. Key for a rules configuration variable.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return String. Key for a rules configuration variable.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * String, Case-sensitive. Value for a rules configuration variable.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return String, Case-sensitive. Value for a rules configuration variable.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private RuleConfigArgs() {}

    private RuleConfigArgs(RuleConfigArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleConfigArgs $;

        public Builder() {
            $ = new RuleConfigArgs();
        }

        public Builder(RuleConfigArgs defaults) {
            $ = new RuleConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key String. Key for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key String. Key for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value String, Case-sensitive. Value for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value String, Case-sensitive. Value for a rules configuration variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RuleConfigArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
