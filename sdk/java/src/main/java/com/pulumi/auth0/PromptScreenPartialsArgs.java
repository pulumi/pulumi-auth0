// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.PromptScreenPartialsScreenPartialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PromptScreenPartialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PromptScreenPartialsArgs Empty = new PromptScreenPartialsArgs();

    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     * 
     */
    @Import(name="promptType", required=true)
    private Output<String> promptType;

    /**
     * @return The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     * 
     */
    public Output<String> promptType() {
        return this.promptType;
    }

    @Import(name="screenPartials")
    private @Nullable Output<List<PromptScreenPartialsScreenPartialArgs>> screenPartials;

    public Optional<Output<List<PromptScreenPartialsScreenPartialArgs>>> screenPartials() {
        return Optional.ofNullable(this.screenPartials);
    }

    private PromptScreenPartialsArgs() {}

    private PromptScreenPartialsArgs(PromptScreenPartialsArgs $) {
        this.promptType = $.promptType;
        this.screenPartials = $.screenPartials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptScreenPartialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptScreenPartialsArgs $;

        public Builder() {
            $ = new PromptScreenPartialsArgs();
        }

        public Builder(PromptScreenPartialsArgs defaults) {
            $ = new PromptScreenPartialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param promptType The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
         * 
         * @return builder
         * 
         */
        public Builder promptType(Output<String> promptType) {
            $.promptType = promptType;
            return this;
        }

        /**
         * @param promptType The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
         * 
         * @return builder
         * 
         */
        public Builder promptType(String promptType) {
            return promptType(Output.of(promptType));
        }

        public Builder screenPartials(@Nullable Output<List<PromptScreenPartialsScreenPartialArgs>> screenPartials) {
            $.screenPartials = screenPartials;
            return this;
        }

        public Builder screenPartials(List<PromptScreenPartialsScreenPartialArgs> screenPartials) {
            return screenPartials(Output.of(screenPartials));
        }

        public Builder screenPartials(PromptScreenPartialsScreenPartialArgs... screenPartials) {
            return screenPartials(List.of(screenPartials));
        }

        public PromptScreenPartialsArgs build() {
            if ($.promptType == null) {
                throw new MissingRequiredPropertyException("PromptScreenPartialsArgs", "promptType");
            }
            return $;
        }
    }

}
