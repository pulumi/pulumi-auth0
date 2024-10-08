// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ConnectionOptionsAttributeUsernameIdentifierArgs;
import com.pulumi.auth0.inputs.ConnectionOptionsAttributeUsernameSignupArgs;
import com.pulumi.auth0.inputs.ConnectionOptionsAttributeUsernameValidationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributeUsernameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributeUsernameArgs Empty = new ConnectionOptionsAttributeUsernameArgs();

    /**
     * Connection options for User Name Attribute Identifier
     * 
     */
    @Import(name="identifiers")
    private @Nullable Output<List<ConnectionOptionsAttributeUsernameIdentifierArgs>> identifiers;

    /**
     * @return Connection options for User Name Attribute Identifier
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeUsernameIdentifierArgs>>> identifiers() {
        return Optional.ofNullable(this.identifiers);
    }

    /**
     * Defines whether Profile is required
     * 
     */
    @Import(name="profileRequired")
    private @Nullable Output<Boolean> profileRequired;

    /**
     * @return Defines whether Profile is required
     * 
     */
    public Optional<Output<Boolean>> profileRequired() {
        return Optional.ofNullable(this.profileRequired);
    }

    /**
     * Defines signup settings for User Name attribute
     * 
     */
    @Import(name="signups")
    private @Nullable Output<List<ConnectionOptionsAttributeUsernameSignupArgs>> signups;

    /**
     * @return Defines signup settings for User Name attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeUsernameSignupArgs>>> signups() {
        return Optional.ofNullable(this.signups);
    }

    /**
     * Defines validation settings for User Name attribute
     * 
     */
    @Import(name="validations")
    private @Nullable Output<List<ConnectionOptionsAttributeUsernameValidationArgs>> validations;

    /**
     * @return Defines validation settings for User Name attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeUsernameValidationArgs>>> validations() {
        return Optional.ofNullable(this.validations);
    }

    private ConnectionOptionsAttributeUsernameArgs() {}

    private ConnectionOptionsAttributeUsernameArgs(ConnectionOptionsAttributeUsernameArgs $) {
        this.identifiers = $.identifiers;
        this.profileRequired = $.profileRequired;
        this.signups = $.signups;
        this.validations = $.validations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributeUsernameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributeUsernameArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributeUsernameArgs();
        }

        public Builder(ConnectionOptionsAttributeUsernameArgs defaults) {
            $ = new ConnectionOptionsAttributeUsernameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifiers Connection options for User Name Attribute Identifier
         * 
         * @return builder
         * 
         */
        public Builder identifiers(@Nullable Output<List<ConnectionOptionsAttributeUsernameIdentifierArgs>> identifiers) {
            $.identifiers = identifiers;
            return this;
        }

        /**
         * @param identifiers Connection options for User Name Attribute Identifier
         * 
         * @return builder
         * 
         */
        public Builder identifiers(List<ConnectionOptionsAttributeUsernameIdentifierArgs> identifiers) {
            return identifiers(Output.of(identifiers));
        }

        /**
         * @param identifiers Connection options for User Name Attribute Identifier
         * 
         * @return builder
         * 
         */
        public Builder identifiers(ConnectionOptionsAttributeUsernameIdentifierArgs... identifiers) {
            return identifiers(List.of(identifiers));
        }

        /**
         * @param profileRequired Defines whether Profile is required
         * 
         * @return builder
         * 
         */
        public Builder profileRequired(@Nullable Output<Boolean> profileRequired) {
            $.profileRequired = profileRequired;
            return this;
        }

        /**
         * @param profileRequired Defines whether Profile is required
         * 
         * @return builder
         * 
         */
        public Builder profileRequired(Boolean profileRequired) {
            return profileRequired(Output.of(profileRequired));
        }

        /**
         * @param signups Defines signup settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder signups(@Nullable Output<List<ConnectionOptionsAttributeUsernameSignupArgs>> signups) {
            $.signups = signups;
            return this;
        }

        /**
         * @param signups Defines signup settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder signups(List<ConnectionOptionsAttributeUsernameSignupArgs> signups) {
            return signups(Output.of(signups));
        }

        /**
         * @param signups Defines signup settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder signups(ConnectionOptionsAttributeUsernameSignupArgs... signups) {
            return signups(List.of(signups));
        }

        /**
         * @param validations Defines validation settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder validations(@Nullable Output<List<ConnectionOptionsAttributeUsernameValidationArgs>> validations) {
            $.validations = validations;
            return this;
        }

        /**
         * @param validations Defines validation settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder validations(List<ConnectionOptionsAttributeUsernameValidationArgs> validations) {
            return validations(Output.of(validations));
        }

        /**
         * @param validations Defines validation settings for User Name attribute
         * 
         * @return builder
         * 
         */
        public Builder validations(ConnectionOptionsAttributeUsernameValidationArgs... validations) {
            return validations(List.of(validations));
        }

        public ConnectionOptionsAttributeUsernameArgs build() {
            return $;
        }
    }

}
