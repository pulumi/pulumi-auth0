// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsEgnyteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsEgnyteArgs Empty = new ClientAddonsEgnyteArgs();

    /**
     * Your custom domain found in your Egnyte URL, for example `https://acme-org.echosign.com` would be `acme-org`.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Your custom domain found in your Egnyte URL, for example `https://acme-org.echosign.com` would be `acme-org`.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    private ClientAddonsEgnyteArgs() {}

    private ClientAddonsEgnyteArgs(ClientAddonsEgnyteArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsEgnyteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsEgnyteArgs $;

        public Builder() {
            $ = new ClientAddonsEgnyteArgs();
        }

        public Builder(ClientAddonsEgnyteArgs defaults) {
            $ = new ClientAddonsEgnyteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain Your custom domain found in your Egnyte URL, for example `https://acme-org.echosign.com` would be `acme-org`.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Your custom domain found in your Egnyte URL, for example `https://acme-org.echosign.com` would be `acme-org`.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public ClientAddonsEgnyteArgs build() {
            return $;
        }
    }

}
