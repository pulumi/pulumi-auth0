// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuardianPhoneOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianPhoneOptionsArgs Empty = new GuardianPhoneOptionsArgs();

    /**
     * String.
     * 
     */
    @Import(name="authToken")
    private @Nullable Output<String> authToken;

    /**
     * @return String.
     * 
     */
    public Optional<Output<String>> authToken() {
        return Optional.ofNullable(this.authToken);
    }

    /**
     * String. This message will be sent whenever a user enrolls a new device for the first time using MFA. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
     * 
     */
    @Import(name="enrollmentMessage")
    private @Nullable Output<String> enrollmentMessage;

    /**
     * @return String. This message will be sent whenever a user enrolls a new device for the first time using MFA. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
     * 
     */
    public Optional<Output<String>> enrollmentMessage() {
        return Optional.ofNullable(this.enrollmentMessage);
    }

    /**
     * String.
     * 
     */
    @Import(name="from")
    private @Nullable Output<String> from;

    /**
     * @return String.
     * 
     */
    public Optional<Output<String>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * String.
     * 
     */
    @Import(name="messagingServiceSid")
    private @Nullable Output<String> messagingServiceSid;

    /**
     * @return String.
     * 
     */
    public Optional<Output<String>> messagingServiceSid() {
        return Optional.ofNullable(this.messagingServiceSid);
    }

    /**
     * String.
     * 
     */
    @Import(name="sid")
    private @Nullable Output<String> sid;

    /**
     * @return String.
     * 
     */
    public Optional<Output<String>> sid() {
        return Optional.ofNullable(this.sid);
    }

    /**
     * String. This message will be sent whenever a user logs in after the enrollment. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
     * 
     */
    @Import(name="verificationMessage")
    private @Nullable Output<String> verificationMessage;

    /**
     * @return String. This message will be sent whenever a user logs in after the enrollment. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
     * 
     */
    public Optional<Output<String>> verificationMessage() {
        return Optional.ofNullable(this.verificationMessage);
    }

    private GuardianPhoneOptionsArgs() {}

    private GuardianPhoneOptionsArgs(GuardianPhoneOptionsArgs $) {
        this.authToken = $.authToken;
        this.enrollmentMessage = $.enrollmentMessage;
        this.from = $.from;
        this.messagingServiceSid = $.messagingServiceSid;
        this.sid = $.sid;
        this.verificationMessage = $.verificationMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianPhoneOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianPhoneOptionsArgs $;

        public Builder() {
            $ = new GuardianPhoneOptionsArgs();
        }

        public Builder(GuardianPhoneOptionsArgs defaults) {
            $ = new GuardianPhoneOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authToken String.
         * 
         * @return builder
         * 
         */
        public Builder authToken(@Nullable Output<String> authToken) {
            $.authToken = authToken;
            return this;
        }

        /**
         * @param authToken String.
         * 
         * @return builder
         * 
         */
        public Builder authToken(String authToken) {
            return authToken(Output.of(authToken));
        }

        /**
         * @param enrollmentMessage String. This message will be sent whenever a user enrolls a new device for the first time using MFA. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
         * 
         * @return builder
         * 
         */
        public Builder enrollmentMessage(@Nullable Output<String> enrollmentMessage) {
            $.enrollmentMessage = enrollmentMessage;
            return this;
        }

        /**
         * @param enrollmentMessage String. This message will be sent whenever a user enrolls a new device for the first time using MFA. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
         * 
         * @return builder
         * 
         */
        public Builder enrollmentMessage(String enrollmentMessage) {
            return enrollmentMessage(Output.of(enrollmentMessage));
        }

        /**
         * @param from String.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from String.
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param messagingServiceSid String.
         * 
         * @return builder
         * 
         */
        public Builder messagingServiceSid(@Nullable Output<String> messagingServiceSid) {
            $.messagingServiceSid = messagingServiceSid;
            return this;
        }

        /**
         * @param messagingServiceSid String.
         * 
         * @return builder
         * 
         */
        public Builder messagingServiceSid(String messagingServiceSid) {
            return messagingServiceSid(Output.of(messagingServiceSid));
        }

        /**
         * @param sid String.
         * 
         * @return builder
         * 
         */
        public Builder sid(@Nullable Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid String.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param verificationMessage String. This message will be sent whenever a user logs in after the enrollment. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
         * 
         * @return builder
         * 
         */
        public Builder verificationMessage(@Nullable Output<String> verificationMessage) {
            $.verificationMessage = verificationMessage;
            return this;
        }

        /**
         * @param verificationMessage String. This message will be sent whenever a user logs in after the enrollment. Supports liquid syntax, see [Auth0 docs](https://auth0.com/docs/mfa/customize-sms-or-voice-messages).
         * 
         * @return builder
         * 
         */
        public Builder verificationMessage(String verificationMessage) {
            return verificationMessage(Output.of(verificationMessage));
        }

        public GuardianPhoneOptionsArgs build() {
            return $;
        }
    }

}