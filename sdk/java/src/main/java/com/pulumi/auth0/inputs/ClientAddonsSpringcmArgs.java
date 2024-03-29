// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSpringcmArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSpringcmArgs Empty = new ClientAddonsSpringcmArgs();

    /**
     * SpringCM ACS URL, for example `https://na11.springcm.com/atlas/sso/SSOEndpoint.ashx`.
     * 
     */
    @Import(name="acsUrl")
    private @Nullable Output<String> acsUrl;

    /**
     * @return SpringCM ACS URL, for example `https://na11.springcm.com/atlas/sso/SSOEndpoint.ashx`.
     * 
     */
    public Optional<Output<String>> acsUrl() {
        return Optional.ofNullable(this.acsUrl);
    }

    private ClientAddonsSpringcmArgs() {}

    private ClientAddonsSpringcmArgs(ClientAddonsSpringcmArgs $) {
        this.acsUrl = $.acsUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSpringcmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSpringcmArgs $;

        public Builder() {
            $ = new ClientAddonsSpringcmArgs();
        }

        public Builder(ClientAddonsSpringcmArgs defaults) {
            $ = new ClientAddonsSpringcmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acsUrl SpringCM ACS URL, for example `https://na11.springcm.com/atlas/sso/SSOEndpoint.ashx`.
         * 
         * @return builder
         * 
         */
        public Builder acsUrl(@Nullable Output<String> acsUrl) {
            $.acsUrl = acsUrl;
            return this;
        }

        /**
         * @param acsUrl SpringCM ACS URL, for example `https://na11.springcm.com/atlas/sso/SSOEndpoint.ashx`.
         * 
         * @return builder
         * 
         */
        public Builder acsUrl(String acsUrl) {
            return acsUrl(Output.of(acsUrl));
        }

        public ClientAddonsSpringcmArgs build() {
            return $;
        }
    }

}
