// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.TriggerActionsActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TriggerActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerActionsArgs Empty = new TriggerActionsArgs();

    /**
     * The list of actions bound to this trigger.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<TriggerActionsActionArgs>> actions;

    /**
     * @return The list of actions bound to this trigger.
     * 
     */
    public Output<List<TriggerActionsActionArgs>> actions() {
        return this.actions;
    }

    /**
     * The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     * 
     */
    @Import(name="trigger", required=true)
    private Output<String> trigger;

    /**
     * @return The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     * 
     */
    public Output<String> trigger() {
        return this.trigger;
    }

    private TriggerActionsArgs() {}

    private TriggerActionsArgs(TriggerActionsArgs $) {
        this.actions = $.actions;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerActionsArgs $;

        public Builder() {
            $ = new TriggerActionsArgs();
        }

        public Builder(TriggerActionsArgs defaults) {
            $ = new TriggerActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The list of actions bound to this trigger.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<TriggerActionsActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The list of actions bound to this trigger.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<TriggerActionsActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The list of actions bound to this trigger.
         * 
         * @return builder
         * 
         */
        public Builder actions(TriggerActionsActionArgs... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param trigger The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(Output<String> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(String trigger) {
            return trigger(Output.of(trigger));
        }

        public TriggerActionsArgs build() {
            if ($.actions == null) {
                throw new MissingRequiredPropertyException("TriggerActionsArgs", "actions");
            }
            if ($.trigger == null) {
                throw new MissingRequiredPropertyException("TriggerActionsArgs", "trigger");
            }
            return $;
        }
    }

}
