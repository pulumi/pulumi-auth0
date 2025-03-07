// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenExchangeProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final TokenExchangeProfileArgs Empty = new TokenExchangeProfileArgs();

    /**
     * Unique identifier of the Action
     * 
     */
    @Import(name="actionId")
    private @Nullable Output<String> actionId;

    /**
     * @return Unique identifier of the Action
     * 
     */
    public Optional<Output<String>> actionId() {
        return Optional.ofNullable(this.actionId);
    }

    /**
     * Name of the token exchange profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the token exchange profile.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of the subject token
     * 
     */
    @Import(name="subjectTokenType")
    private @Nullable Output<String> subjectTokenType;

    /**
     * @return Type of the subject token
     * 
     */
    public Optional<Output<String>> subjectTokenType() {
        return Optional.ofNullable(this.subjectTokenType);
    }

    /**
     * Type of the token exchange profile
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the token exchange profile
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private TokenExchangeProfileArgs() {}

    private TokenExchangeProfileArgs(TokenExchangeProfileArgs $) {
        this.actionId = $.actionId;
        this.name = $.name;
        this.subjectTokenType = $.subjectTokenType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenExchangeProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenExchangeProfileArgs $;

        public Builder() {
            $ = new TokenExchangeProfileArgs();
        }

        public Builder(TokenExchangeProfileArgs defaults) {
            $ = new TokenExchangeProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId Unique identifier of the Action
         * 
         * @return builder
         * 
         */
        public Builder actionId(@Nullable Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        /**
         * @param actionId Unique identifier of the Action
         * 
         * @return builder
         * 
         */
        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        /**
         * @param name Name of the token exchange profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the token exchange profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subjectTokenType Type of the subject token
         * 
         * @return builder
         * 
         */
        public Builder subjectTokenType(@Nullable Output<String> subjectTokenType) {
            $.subjectTokenType = subjectTokenType;
            return this;
        }

        /**
         * @param subjectTokenType Type of the subject token
         * 
         * @return builder
         * 
         */
        public Builder subjectTokenType(String subjectTokenType) {
            return subjectTokenType(Output.of(subjectTokenType));
        }

        /**
         * @param type Type of the token exchange profile
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the token exchange profile
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TokenExchangeProfileArgs build() {
            return $;
        }
    }

}
