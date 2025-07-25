// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainVerificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainVerificationArgs Empty = new CustomDomainVerificationArgs();

    /**
     * Contains error message, if any, from the last DNS verification check.
     * 
     */
    @Import(name="errorMsg")
    private @Nullable Output<String> errorMsg;

    /**
     * @return Contains error message, if any, from the last DNS verification check.
     * 
     */
    public Optional<Output<String>> errorMsg() {
        return Optional.ofNullable(this.errorMsg);
    }

    /**
     * Indicates the last time the domain was successfully verified.
     * 
     */
    @Import(name="lastVerifiedAt")
    private @Nullable Output<String> lastVerifiedAt;

    /**
     * @return Indicates the last time the domain was successfully verified.
     * 
     */
    public Optional<Output<String>> lastVerifiedAt() {
        return Optional.ofNullable(this.lastVerifiedAt);
    }

    /**
     * Defines the list of domain verification methods used.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<Object>> methods;

    /**
     * @return Defines the list of domain verification methods used.
     * 
     */
    public Optional<Output<List<Object>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * Represents the current status of the domain verification process.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Represents the current status of the domain verification process.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomDomainVerificationArgs() {}

    private CustomDomainVerificationArgs(CustomDomainVerificationArgs $) {
        this.errorMsg = $.errorMsg;
        this.lastVerifiedAt = $.lastVerifiedAt;
        this.methods = $.methods;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainVerificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainVerificationArgs $;

        public Builder() {
            $ = new CustomDomainVerificationArgs();
        }

        public Builder(CustomDomainVerificationArgs defaults) {
            $ = new CustomDomainVerificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorMsg Contains error message, if any, from the last DNS verification check.
         * 
         * @return builder
         * 
         */
        public Builder errorMsg(@Nullable Output<String> errorMsg) {
            $.errorMsg = errorMsg;
            return this;
        }

        /**
         * @param errorMsg Contains error message, if any, from the last DNS verification check.
         * 
         * @return builder
         * 
         */
        public Builder errorMsg(String errorMsg) {
            return errorMsg(Output.of(errorMsg));
        }

        /**
         * @param lastVerifiedAt Indicates the last time the domain was successfully verified.
         * 
         * @return builder
         * 
         */
        public Builder lastVerifiedAt(@Nullable Output<String> lastVerifiedAt) {
            $.lastVerifiedAt = lastVerifiedAt;
            return this;
        }

        /**
         * @param lastVerifiedAt Indicates the last time the domain was successfully verified.
         * 
         * @return builder
         * 
         */
        public Builder lastVerifiedAt(String lastVerifiedAt) {
            return lastVerifiedAt(Output.of(lastVerifiedAt));
        }

        /**
         * @param methods Defines the list of domain verification methods used.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<Object>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods Defines the list of domain verification methods used.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<Object> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods Defines the list of domain verification methods used.
         * 
         * @return builder
         * 
         */
        public Builder methods(Object... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param status Represents the current status of the domain verification process.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Represents the current status of the domain verification process.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public CustomDomainVerificationArgs build() {
            return $;
        }
    }

}
