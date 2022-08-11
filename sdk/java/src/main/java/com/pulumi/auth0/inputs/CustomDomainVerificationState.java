// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainVerificationState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainVerificationState Empty = new CustomDomainVerificationState();

    @Import(name="cnameApiKey")
    private @Nullable Output<String> cnameApiKey;

    public Optional<Output<String>> cnameApiKey() {
        return Optional.ofNullable(this.cnameApiKey);
    }

    /**
     * String. ID of the custom domain resource.
     * 
     */
    @Import(name="customDomainId")
    private @Nullable Output<String> customDomainId;

    /**
     * @return String. ID of the custom domain resource.
     * 
     */
    public Optional<Output<String>> customDomainId() {
        return Optional.ofNullable(this.customDomainId);
    }

    /**
     * String. The DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    @Import(name="originDomainName")
    private @Nullable Output<String> originDomainName;

    /**
     * @return String. The DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    public Optional<Output<String>> originDomainName() {
        return Optional.ofNullable(this.originDomainName);
    }

    private CustomDomainVerificationState() {}

    private CustomDomainVerificationState(CustomDomainVerificationState $) {
        this.cnameApiKey = $.cnameApiKey;
        this.customDomainId = $.customDomainId;
        this.originDomainName = $.originDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainVerificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainVerificationState $;

        public Builder() {
            $ = new CustomDomainVerificationState();
        }

        public Builder(CustomDomainVerificationState defaults) {
            $ = new CustomDomainVerificationState(Objects.requireNonNull(defaults));
        }

        public Builder cnameApiKey(@Nullable Output<String> cnameApiKey) {
            $.cnameApiKey = cnameApiKey;
            return this;
        }

        public Builder cnameApiKey(String cnameApiKey) {
            return cnameApiKey(Output.of(cnameApiKey));
        }

        /**
         * @param customDomainId String. ID of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder customDomainId(@Nullable Output<String> customDomainId) {
            $.customDomainId = customDomainId;
            return this;
        }

        /**
         * @param customDomainId String. ID of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder customDomainId(String customDomainId) {
            return customDomainId(Output.of(customDomainId));
        }

        /**
         * @param originDomainName String. The DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(@Nullable Output<String> originDomainName) {
            $.originDomainName = originDomainName;
            return this;
        }

        /**
         * @param originDomainName String. The DNS name of the Auth0 origin server that handles traffic for the custom domain.
         * 
         * @return builder
         * 
         */
        public Builder originDomainName(String originDomainName) {
            return originDomainName(Output.of(originDomainName));
        }

        public CustomDomainVerificationState build() {
            return $;
        }
    }

}
