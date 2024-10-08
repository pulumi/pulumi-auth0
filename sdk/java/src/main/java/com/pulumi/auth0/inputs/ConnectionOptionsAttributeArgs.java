// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ConnectionOptionsAttributeEmailArgs;
import com.pulumi.auth0.inputs.ConnectionOptionsAttributePhoneNumberArgs;
import com.pulumi.auth0.inputs.ConnectionOptionsAttributeUsernameArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributeArgs Empty = new ConnectionOptionsAttributeArgs();

    /**
     * Connection Options for Email Attribute
     * 
     */
    @Import(name="emails")
    private @Nullable Output<List<ConnectionOptionsAttributeEmailArgs>> emails;

    /**
     * @return Connection Options for Email Attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeEmailArgs>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    /**
     * Connection Options for Phone Number Attribute
     * 
     */
    @Import(name="phoneNumbers")
    private @Nullable Output<List<ConnectionOptionsAttributePhoneNumberArgs>> phoneNumbers;

    /**
     * @return Connection Options for Phone Number Attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributePhoneNumberArgs>>> phoneNumbers() {
        return Optional.ofNullable(this.phoneNumbers);
    }

    /**
     * Connection Options for User Name Attribute
     * 
     */
    @Import(name="usernames")
    private @Nullable Output<List<ConnectionOptionsAttributeUsernameArgs>> usernames;

    /**
     * @return Connection Options for User Name Attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeUsernameArgs>>> usernames() {
        return Optional.ofNullable(this.usernames);
    }

    private ConnectionOptionsAttributeArgs() {}

    private ConnectionOptionsAttributeArgs(ConnectionOptionsAttributeArgs $) {
        this.emails = $.emails;
        this.phoneNumbers = $.phoneNumbers;
        this.usernames = $.usernames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributeArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributeArgs();
        }

        public Builder(ConnectionOptionsAttributeArgs defaults) {
            $ = new ConnectionOptionsAttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emails Connection Options for Email Attribute
         * 
         * @return builder
         * 
         */
        public Builder emails(@Nullable Output<List<ConnectionOptionsAttributeEmailArgs>> emails) {
            $.emails = emails;
            return this;
        }

        /**
         * @param emails Connection Options for Email Attribute
         * 
         * @return builder
         * 
         */
        public Builder emails(List<ConnectionOptionsAttributeEmailArgs> emails) {
            return emails(Output.of(emails));
        }

        /**
         * @param emails Connection Options for Email Attribute
         * 
         * @return builder
         * 
         */
        public Builder emails(ConnectionOptionsAttributeEmailArgs... emails) {
            return emails(List.of(emails));
        }

        /**
         * @param phoneNumbers Connection Options for Phone Number Attribute
         * 
         * @return builder
         * 
         */
        public Builder phoneNumbers(@Nullable Output<List<ConnectionOptionsAttributePhoneNumberArgs>> phoneNumbers) {
            $.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * @param phoneNumbers Connection Options for Phone Number Attribute
         * 
         * @return builder
         * 
         */
        public Builder phoneNumbers(List<ConnectionOptionsAttributePhoneNumberArgs> phoneNumbers) {
            return phoneNumbers(Output.of(phoneNumbers));
        }

        /**
         * @param phoneNumbers Connection Options for Phone Number Attribute
         * 
         * @return builder
         * 
         */
        public Builder phoneNumbers(ConnectionOptionsAttributePhoneNumberArgs... phoneNumbers) {
            return phoneNumbers(List.of(phoneNumbers));
        }

        /**
         * @param usernames Connection Options for User Name Attribute
         * 
         * @return builder
         * 
         */
        public Builder usernames(@Nullable Output<List<ConnectionOptionsAttributeUsernameArgs>> usernames) {
            $.usernames = usernames;
            return this;
        }

        /**
         * @param usernames Connection Options for User Name Attribute
         * 
         * @return builder
         * 
         */
        public Builder usernames(List<ConnectionOptionsAttributeUsernameArgs> usernames) {
            return usernames(Output.of(usernames));
        }

        /**
         * @param usernames Connection Options for User Name Attribute
         * 
         * @return builder
         * 
         */
        public Builder usernames(ConnectionOptionsAttributeUsernameArgs... usernames) {
            return usernames(List.of(usernames));
        }

        public ConnectionOptionsAttributeArgs build() {
            return $;
        }
    }

}
