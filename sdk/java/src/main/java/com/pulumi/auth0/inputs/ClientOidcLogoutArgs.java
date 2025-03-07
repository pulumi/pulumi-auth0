// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ClientOidcLogoutBackchannelLogoutInitiatorsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientOidcLogoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientOidcLogoutArgs Empty = new ClientOidcLogoutArgs();

    /**
     * Configure OIDC logout initiators for the Client
     * 
     */
    @Import(name="backchannelLogoutInitiators")
    private @Nullable Output<ClientOidcLogoutBackchannelLogoutInitiatorsArgs> backchannelLogoutInitiators;

    /**
     * @return Configure OIDC logout initiators for the Client
     * 
     */
    public Optional<Output<ClientOidcLogoutBackchannelLogoutInitiatorsArgs>> backchannelLogoutInitiators() {
        return Optional.ofNullable(this.backchannelLogoutInitiators);
    }

    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    @Import(name="backchannelLogoutUrls", required=true)
    private Output<List<String>> backchannelLogoutUrls;

    /**
     * @return Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    public Output<List<String>> backchannelLogoutUrls() {
        return this.backchannelLogoutUrls;
    }

    private ClientOidcLogoutArgs() {}

    private ClientOidcLogoutArgs(ClientOidcLogoutArgs $) {
        this.backchannelLogoutInitiators = $.backchannelLogoutInitiators;
        this.backchannelLogoutUrls = $.backchannelLogoutUrls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientOidcLogoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientOidcLogoutArgs $;

        public Builder() {
            $ = new ClientOidcLogoutArgs();
        }

        public Builder(ClientOidcLogoutArgs defaults) {
            $ = new ClientOidcLogoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backchannelLogoutInitiators Configure OIDC logout initiators for the Client
         * 
         * @return builder
         * 
         */
        public Builder backchannelLogoutInitiators(@Nullable Output<ClientOidcLogoutBackchannelLogoutInitiatorsArgs> backchannelLogoutInitiators) {
            $.backchannelLogoutInitiators = backchannelLogoutInitiators;
            return this;
        }

        /**
         * @param backchannelLogoutInitiators Configure OIDC logout initiators for the Client
         * 
         * @return builder
         * 
         */
        public Builder backchannelLogoutInitiators(ClientOidcLogoutBackchannelLogoutInitiatorsArgs backchannelLogoutInitiators) {
            return backchannelLogoutInitiators(Output.of(backchannelLogoutInitiators));
        }

        /**
         * @param backchannelLogoutUrls Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
         * 
         * @return builder
         * 
         */
        public Builder backchannelLogoutUrls(Output<List<String>> backchannelLogoutUrls) {
            $.backchannelLogoutUrls = backchannelLogoutUrls;
            return this;
        }

        /**
         * @param backchannelLogoutUrls Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
         * 
         * @return builder
         * 
         */
        public Builder backchannelLogoutUrls(List<String> backchannelLogoutUrls) {
            return backchannelLogoutUrls(Output.of(backchannelLogoutUrls));
        }

        /**
         * @param backchannelLogoutUrls Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
         * 
         * @return builder
         * 
         */
        public Builder backchannelLogoutUrls(String... backchannelLogoutUrls) {
            return backchannelLogoutUrls(List.of(backchannelLogoutUrls));
        }

        public ClientOidcLogoutArgs build() {
            if ($.backchannelLogoutUrls == null) {
                throw new MissingRequiredPropertyException("ClientOidcLogoutArgs", "backchannelLogoutUrls");
            }
            return $;
        }
    }

}
