// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerActionArgs Empty = new TriggerActionArgs();

    /**
     * The ID of the action to bind to the trigger.
     * 
     */
    @Import(name="actionId", required=true)
    private Output<String> actionId;

    /**
     * @return The ID of the action to bind to the trigger.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }

    /**
     * The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     * 
     */
    @Import(name="trigger", required=true)
    private Output<String> trigger;

    /**
     * @return The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     * 
     */
    public Output<String> trigger() {
        return this.trigger;
    }

    private TriggerActionArgs() {}

    private TriggerActionArgs(TriggerActionArgs $) {
        this.actionId = $.actionId;
        this.displayName = $.displayName;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerActionArgs $;

        public Builder() {
            $ = new TriggerActionArgs();
        }

        public Builder(TriggerActionArgs defaults) {
            $ = new TriggerActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId The ID of the action to bind to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder actionId(Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        /**
         * @param actionId The ID of the action to bind to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        /**
         * @param displayName The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param trigger The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(Output<String> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(String trigger) {
            return trigger(Output.of(trigger));
        }

        public TriggerActionArgs build() {
            if ($.actionId == null) {
                throw new MissingRequiredPropertyException("TriggerActionArgs", "actionId");
            }
            if ($.trigger == null) {
                throw new MissingRequiredPropertyException("TriggerActionArgs", "trigger");
            }
            return $;
        }
    }

}
