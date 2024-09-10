// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPromptScreenPartialsScreenPartialInsertionPoint extends com.pulumi.resources.InvokeArgs {

    public static final GetPromptScreenPartialsScreenPartialInsertionPoint Empty = new GetPromptScreenPartialsScreenPartialInsertionPoint();

    /**
     * Content that goes at the end of the form.
     * 
     */
    @Import(name="formContentEnd", required=true)
    private String formContentEnd;

    /**
     * @return Content that goes at the end of the form.
     * 
     */
    public String formContentEnd() {
        return this.formContentEnd;
    }

    /**
     * Content that goes at the start of the form.
     * 
     */
    @Import(name="formContentStart", required=true)
    private String formContentStart;

    /**
     * @return Content that goes at the start of the form.
     * 
     */
    public String formContentStart() {
        return this.formContentStart;
    }

    /**
     * Footer content for the end of the footer.
     * 
     */
    @Import(name="formFooterEnd", required=true)
    private String formFooterEnd;

    /**
     * @return Footer content for the end of the footer.
     * 
     */
    public String formFooterEnd() {
        return this.formFooterEnd;
    }

    /**
     * Footer content for the start of the footer.
     * 
     */
    @Import(name="formFooterStart", required=true)
    private String formFooterStart;

    /**
     * @return Footer content for the start of the footer.
     * 
     */
    public String formFooterStart() {
        return this.formFooterStart;
    }

    /**
     * Actions that go at the end of secondary actions.
     * 
     */
    @Import(name="secondaryActionsEnd", required=true)
    private String secondaryActionsEnd;

    /**
     * @return Actions that go at the end of secondary actions.
     * 
     */
    public String secondaryActionsEnd() {
        return this.secondaryActionsEnd;
    }

    /**
     * Actions that go at the start of secondary actions.
     * 
     */
    @Import(name="secondaryActionsStart", required=true)
    private String secondaryActionsStart;

    /**
     * @return Actions that go at the start of secondary actions.
     * 
     */
    public String secondaryActionsStart() {
        return this.secondaryActionsStart;
    }

    private GetPromptScreenPartialsScreenPartialInsertionPoint() {}

    private GetPromptScreenPartialsScreenPartialInsertionPoint(GetPromptScreenPartialsScreenPartialInsertionPoint $) {
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
    public static Builder builder(GetPromptScreenPartialsScreenPartialInsertionPoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPromptScreenPartialsScreenPartialInsertionPoint $;

        public Builder() {
            $ = new GetPromptScreenPartialsScreenPartialInsertionPoint();
        }

        public Builder(GetPromptScreenPartialsScreenPartialInsertionPoint defaults) {
            $ = new GetPromptScreenPartialsScreenPartialInsertionPoint(Objects.requireNonNull(defaults));
        }

        /**
         * @param formContentEnd Content that goes at the end of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentEnd(String formContentEnd) {
            $.formContentEnd = formContentEnd;
            return this;
        }

        /**
         * @param formContentStart Content that goes at the start of the form.
         * 
         * @return builder
         * 
         */
        public Builder formContentStart(String formContentStart) {
            $.formContentStart = formContentStart;
            return this;
        }

        /**
         * @param formFooterEnd Footer content for the end of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterEnd(String formFooterEnd) {
            $.formFooterEnd = formFooterEnd;
            return this;
        }

        /**
         * @param formFooterStart Footer content for the start of the footer.
         * 
         * @return builder
         * 
         */
        public Builder formFooterStart(String formFooterStart) {
            $.formFooterStart = formFooterStart;
            return this;
        }

        /**
         * @param secondaryActionsEnd Actions that go at the end of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsEnd(String secondaryActionsEnd) {
            $.secondaryActionsEnd = secondaryActionsEnd;
            return this;
        }

        /**
         * @param secondaryActionsStart Actions that go at the start of secondary actions.
         * 
         * @return builder
         * 
         */
        public Builder secondaryActionsStart(String secondaryActionsStart) {
            $.secondaryActionsStart = secondaryActionsStart;
            return this;
        }

        public GetPromptScreenPartialsScreenPartialInsertionPoint build() {
            if ($.formContentEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "formContentEnd");
            }
            if ($.formContentStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "formContentStart");
            }
            if ($.formFooterEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "formFooterEnd");
            }
            if ($.formFooterStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "formFooterStart");
            }
            if ($.secondaryActionsEnd == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "secondaryActionsEnd");
            }
            if ($.secondaryActionsStart == null) {
                throw new MissingRequiredPropertyException("GetPromptScreenPartialsScreenPartialInsertionPoint", "secondaryActionsStart");
            }
            return $;
        }
    }

}
