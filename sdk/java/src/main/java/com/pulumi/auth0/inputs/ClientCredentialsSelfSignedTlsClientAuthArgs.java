// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ClientCredentialsSelfSignedTlsClientAuthCredentialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class ClientCredentialsSelfSignedTlsClientAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientCredentialsSelfSignedTlsClientAuthArgs Empty = new ClientCredentialsSelfSignedTlsClientAuthArgs();

    /**
     * Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<List<ClientCredentialsSelfSignedTlsClientAuthCredentialArgs>> credentials;

    /**
     * @return Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
     * 
     */
    public Output<List<ClientCredentialsSelfSignedTlsClientAuthCredentialArgs>> credentials() {
        return this.credentials;
    }

    private ClientCredentialsSelfSignedTlsClientAuthArgs() {}

    private ClientCredentialsSelfSignedTlsClientAuthArgs(ClientCredentialsSelfSignedTlsClientAuthArgs $) {
        this.credentials = $.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCredentialsSelfSignedTlsClientAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCredentialsSelfSignedTlsClientAuthArgs $;

        public Builder() {
            $ = new ClientCredentialsSelfSignedTlsClientAuthArgs();
        }

        public Builder(ClientCredentialsSelfSignedTlsClientAuthArgs defaults) {
            $ = new ClientCredentialsSelfSignedTlsClientAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<List<ClientCredentialsSelfSignedTlsClientAuthCredentialArgs>> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
         * 
         * @return builder
         * 
         */
        public Builder credentials(List<ClientCredentialsSelfSignedTlsClientAuthCredentialArgs> credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param credentials Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
         * 
         * @return builder
         * 
         */
        public Builder credentials(ClientCredentialsSelfSignedTlsClientAuthCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }

        public ClientCredentialsSelfSignedTlsClientAuthArgs build() {
            if ($.credentials == null) {
                throw new MissingRequiredPropertyException("ClientCredentialsSelfSignedTlsClientAuthArgs", "credentials");
            }
            return $;
        }
    }

}
