// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FormMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final FormMessageArgs Empty = new FormMessageArgs();

    /**
     * Custom message for the form. (JSON encoded)
     * 
     */
    @Import(name="custom")
    private @Nullable Output<String> custom;

    /**
     * @return Custom message for the form. (JSON encoded)
     * 
     */
    public Optional<Output<String>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * Error message for the form. (JSON encoded)
     * 
     */
    @Import(name="errors")
    private @Nullable Output<String> errors;

    /**
     * @return Error message for the form. (JSON encoded)
     * 
     */
    public Optional<Output<String>> errors() {
        return Optional.ofNullable(this.errors);
    }

    private FormMessageArgs() {}

    private FormMessageArgs(FormMessageArgs $) {
        this.custom = $.custom;
        this.errors = $.errors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FormMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FormMessageArgs $;

        public Builder() {
            $ = new FormMessageArgs();
        }

        public Builder(FormMessageArgs defaults) {
            $ = new FormMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param custom Custom message for the form. (JSON encoded)
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<String> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom Custom message for the form. (JSON encoded)
         * 
         * @return builder
         * 
         */
        public Builder custom(String custom) {
            return custom(Output.of(custom));
        }

        /**
         * @param errors Error message for the form. (JSON encoded)
         * 
         * @return builder
         * 
         */
        public Builder errors(@Nullable Output<String> errors) {
            $.errors = errors;
            return this;
        }

        /**
         * @param errors Error message for the form. (JSON encoded)
         * 
         * @return builder
         * 
         */
        public Builder errors(String errors) {
            return errors(Output.of(errors));
        }

        public FormMessageArgs build() {
            return $;
        }
    }

}
