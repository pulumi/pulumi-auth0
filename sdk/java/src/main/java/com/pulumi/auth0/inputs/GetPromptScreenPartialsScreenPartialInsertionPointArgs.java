// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPromptScreenPartialsScreenPartialInsertionPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPromptScreenPartialsScreenPartialInsertionPointArgs Empty = new GetPromptScreenPartialsScreenPartialInsertionPointArgs();

    /**
     * Content that goes at the end of the form.
     * 
     */
    @Import(name="formContentEnd", required=true)
    private Output<String> formContentEnd;

    /**
     * @return Content that goes at the end of the form.
     * 
     */
    public Output<String> formContentEnd() {
        return this.formContentEnd;
    }

    /**
     * Content that goes at the start of the form.
     * 
     */
    @Import(name="formContentStart", required=true)
    private Output<String> formContentStart;

    /**
     * @return Content that goes at the start of the form.
     * 
     */
    public Output<String> formContentStart() {
        return this.formContentStart;
    }

    /**
     * Footer content for the end of the footer.
     * 
     */
    @Import(name="formFooterEnd", required=true)
    private Output<String> formFooterEnd;

    /**
     * @return Footer content for the end of the footer.
     * 
     */
    public Output<String> formFooterEnd() {
        return this.formFooterEnd;
    }

    /**
     * Footer content for the start of the footer.
     * 
     */
    @Import(name="formFooterStart", required=true)
    private Output<String> formFooterStart;

    /**
     * @return Footer content for the start of the footer.
     * 
     */
    public Output<String> formFooterStart() {
        return this.formFooterStart;
    }

    /**
     * Actions that go at the end of secondary actions.
     * 
     */
    @Import(name="secondaryActionsEnd", required=true)
    private Output<String> secondaryActionsEnd;

    /**
     * @return Actions that go at the end of secondary actions.
     * 
     */
    public Output<String> secondaryActionsEnd() {
        return this.secondaryActionsEnd;
    }

    /**
     * Actions that go at the start of secondary actions.
     * 
     */
    @Import(name="secondaryActionsStart", required=true)
    private Output<String> secondaryActionsStart;

    /**
     * @return Actions that go at the start of secondary actions.
     * 
     */
    public Output<String> secondaryActionsStart() {
        return this.secondaryActionsStart;
    }

    private GetPromptScreenPartialsScreenPartialInsertionPointArgs() {}

    private GetPromptScreenPartialsScreenPartialInsertionPointArgs(GetPromptScreenPartialsScreenPartialInsertionPointArgs $) {
        this.formContentEnd = $.formContentEnd;
        this.formContentStart = $.formContentStart;
        this.formFooterEnd = $.formFooterEnd;
        this.formFooterStart = $.formFooterStart;
        this.secondaryActionsEnd = $.secondaryActionsEnd;
        this.secondaryActionsStart = $.secondaryActionsStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPromptScreenPartialsScreenPartialInsertionPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPromptScreenPartialsScreenPartialInsertionPointArgs $;

        public Builder() {
            $ = new GetPromptScreenPartialsScreenPartialInsertionPointArgs();
        }

        public Builder(GetPromptScreenPartialsScreenPartialInsertionPointArgs defaults) {
            $ = new GetPromptScreenPartialsScreenPartialInsertionPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param formContentEnd Content that goes at the end of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentEnd(Output<String> formContentEnd) {
            $.formContentEnd = formContentEnd;
            return this;
        }

        /**
         * @param formContentEnd Content that goes at the end of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentEnd(String formContentEnd) {
            return formContentEnd(Output.of(formContentEnd));
        }

        /**
         * @param formContentStart Content that goes at the start of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentStart(Output<String> formContentStart) {
            $.formContentStart = formContentStart;
            return this;
        }

        /**
         * @param formContentStart Content that goes at the start of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentStart(String formContentStart) {
            return formContentStart(Output.of(formContentStart));
        }

        /**
         * @param formFooterEnd Footer content for the end of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterEnd(Output<String> formFooterEnd) {
            $.formFooterEnd = formFooterEnd;
            return this;
        }

        /**
         * @param formFooterEnd Footer content for the end of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterEnd(String formFooterEnd) {
            return formFooterEnd(Output.of(formFooterEnd));
        }

        /**
         * @param formFooterStart Footer content for the start of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterStart(Output<String> formFooterStart) {
            $.formFooterStart = formFooterStart;
            return this;
        }

        /**
         * @param formFooterStart Footer content for the start of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterStart(String formFooterStart) {
            return formFooterStart(Output.of(formFooterStart));
        }

        /**
         * @param secondaryActionsEnd Actions that go at the end of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsEnd(Output<String> secondaryActionsEnd) {
            $.secondaryActionsEnd = secondaryActionsEnd;
            return this;
        }

        /**
         * @param secondaryActionsEnd Actions that go at the end of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsEnd(String secondaryActionsEnd) {
            return secondaryActionsEnd(Output.of(secondaryActionsEnd));
        }

        /**
         * @param secondaryActionsStart Actions that go at the start of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsStart(Output<String> secondaryActionsStart) {
            $.secondaryActionsStart = secondaryActionsStart;
            return this;
        }

        /**
         * @param secondaryActionsStart Actions that go at the start of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsStart(String secondaryActionsStart) {
            return secondaryActionsStart(Output.of(secondaryActionsStart));
        }

        public GetPromptScreenPartialsScreenPartialInsertionPointArgs build() {
            if ($.formContentEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "formContentEnd");
            }
            if ($.formContentStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "formContentStart");
            }
            if ($.formFooterEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "formFooterEnd");
            }
            if ($.formFooterStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "formFooterStart");
            }
            if ($.secondaryActionsEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "secondaryActionsEnd");
            }
            if ($.secondaryActionsStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPointArgs", "secondaryActionsStart");
            }
            return $;
        }
    }

}