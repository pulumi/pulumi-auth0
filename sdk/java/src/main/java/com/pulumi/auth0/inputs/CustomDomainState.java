// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.CustomDomainVerificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainState Empty = new CustomDomainState();

    /**
     * String. Name of the custom domain.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return String. Name of the custom domain.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    @Import(name="originDomainName")
    private @Nullable Output<String> originDomainName;

    /**
     * @return String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    public Optional<Output<String>> originDomainName() {
        return Optional.ofNullable(this.originDomainName);
    }

    /**
     * Boolean. Indicates whether this is a primary domain.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Boolean. Indicates whether this is a primary domain.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * List(Resource). Configuration settings for verification. For details, see Verification.
     * 
     */
    @Import(name="verifications")
    private @Nullable Output<List<CustomDomainVerificationArgs>> verifications;

    /**
     * @return List(Resource). Configuration settings for verification. For details, see Verification.
     * 
     */
    public Optional<Output<List<CustomDomainVerificationArgs>>> verifications() {
        return Optional.ofNullable(this.verifications);
    }

    private CustomDomainState() {}

    private CustomDomainState(CustomDomainState $) {
        this.domain = $.domain;
        this.originDomainName = $.originDomainName;
        this.primary = $.primary;
        this.status = $.status;
        this.type = $.type;
        this.verifications = $.verifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainState $;

        public Builder() {
            $ = new CustomDomainState();
        }

        public Builder(CustomDomainState defaults) {
            $ = new CustomDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain String. Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain String. Name of the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param originDomainName String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(@Nullable Output<String> originDomainName) {
            $.originDomainName = originDomainName;
            return this;
        }

        /**
         * @param originDomainName String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(String originDomainName) {
            return originDomainName(Output.of(originDomainName));
        }

        /**
         * @param primary Boolean. Indicates whether this is a primary domain.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Boolean. Indicates whether this is a primary domain.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param status String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type String. Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param verifications List(Resource). Configuration settings for verification. For details, see Verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(@Nullable Output<List<CustomDomainVerificationArgs>> verifications) {
            $.verifications = verifications;
            return this;
        }

        /**
         * @param verifications List(Resource). Configuration settings for verification. For details, see Verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(List<CustomDomainVerificationArgs> verifications) {
            return verifications(Output.of(verifications));
        }

        /**
         * @param verifications List(Resource). Configuration settings for verification. For details, see Verification.
         * 
         * @return builder
         * 
         */
        public Builder verifications(CustomDomainVerificationArgs... verifications) {
            return verifications(List.of(verifications));
        }

        public CustomDomainState build() {
            return $;
        }
    }

}
