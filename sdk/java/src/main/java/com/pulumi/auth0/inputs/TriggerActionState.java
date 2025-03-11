// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerActionState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerActionState Empty = new TriggerActionState();

    /**
     * The ID of the action to bind to the trigger.
     * 
     */
    @Import(name="actionId")
    private @Nullable Output<String> actionId;

    /**
     * @return The ID of the action to bind to the trigger.
     * 
     */
    public Optional<Output<String>> actionId() {
        return Optional.ofNullable(this.actionId);
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
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
     * 
     */
    @Import(name="trigger")
    private @Nullable Output<String> trigger;

    /**
     * @return The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
     * 
     */
    public Optional<Output<String>> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    private TriggerActionState() {}

    private TriggerActionState(TriggerActionState $) {
        this.actionId = $.actionId;
        this.displayName = $.displayName;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerActionState $;

        public Builder() {
            $ = new TriggerActionState();
        }

        public Builder(TriggerActionState defaults) {
            $ = new TriggerActionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId The ID of the action to bind to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder actionId(@Nullable Output<String> actionId) {
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
         * @param trigger The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(@Nullable Output<String> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
         * 
         * @return builder
         * 
         */
        public Builder trigger(String trigger) {
            return trigger(Output.of(trigger));
        }

        public TriggerActionState build() {
            return $;
        }
    }

}
