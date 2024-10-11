// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientCredentialsSelfSignedTlsClientAuthCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientCredentialsSelfSignedTlsClientAuthCredentialArgs Empty = new ClientCredentialsSelfSignedTlsClientAuthCredentialArgs();

    /**
     * The ISO 8601 formatted date the credential was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Credential type. Supported types: `x509_cert`.
     * 
     */
    @Import(name="credentialType")
    private @Nullable Output<String> credentialType;

    /**
     * @return Credential type. Supported types: `x509_cert`.
     * 
     */
    public Optional<Output<String>> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }

    /**
     * The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The ISO 8601 formatted date representing the expiration of the credential.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The ID of the client credential.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the client credential.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Friendly name for a credential.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name for a credential.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * PEM-formatted X509 certificate. Must be JSON escaped.
     * 
     */
    @Import(name="pem", required=true)
    private Output<String> pem;

    /**
     * @return PEM-formatted X509 certificate. Must be JSON escaped.
     * 
     */
    public Output<String> pem() {
        return this.pem;
    }

    /**
     * The X509 certificate&#39;s SHA256 thumbprint.
     * 
     */
    @Import(name="thumbprintSha256")
    private @Nullable Output<String> thumbprintSha256;

    /**
     * @return The X509 certificate&#39;s SHA256 thumbprint.
     * 
     */
    public Optional<Output<String>> thumbprintSha256() {
        return Optional.ofNullable(this.thumbprintSha256);
    }

    /**
     * The ISO 8601 formatted date the credential was updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private ClientCredentialsSelfSignedTlsClientAuthCredentialArgs() {}

    private ClientCredentialsSelfSignedTlsClientAuthCredentialArgs(ClientCredentialsSelfSignedTlsClientAuthCredentialArgs $) {
        this.createdAt = $.createdAt;
        this.credentialType = $.credentialType;
        this.expiresAt = $.expiresAt;
        this.id = $.id;
        this.name = $.name;
        this.pem = $.pem;
        this.thumbprintSha256 = $.thumbprintSha256;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCredentialsSelfSignedTlsClientAuthCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCredentialsSelfSignedTlsClientAuthCredentialArgs $;

        public Builder() {
            $ = new ClientCredentialsSelfSignedTlsClientAuthCredentialArgs();
        }

        public Builder(ClientCredentialsSelfSignedTlsClientAuthCredentialArgs defaults) {
            $ = new ClientCredentialsSelfSignedTlsClientAuthCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The ISO 8601 formatted date the credential was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The ISO 8601 formatted date the credential was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param credentialType Credential type. Supported types: `x509_cert`.
         * 
         * @return builder
         * 
         */
        public Builder credentialType(@Nullable Output<String> credentialType) {
            $.credentialType = credentialType;
            return this;
        }

        /**
         * @param credentialType Credential type. Supported types: `x509_cert`.
         * 
         * @return builder
         * 
         */
        public Builder credentialType(String credentialType) {
            return credentialType(Output.of(credentialType));
        }

        /**
         * @param expiresAt The ISO 8601 formatted date representing the expiration of the credential.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The ISO 8601 formatted date representing the expiration of the credential.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param id The ID of the client credential.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the client credential.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Friendly name for a credential.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name for a credential.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pem PEM-formatted X509 certificate. Must be JSON escaped.
         * 
         * @return builder
         * 
         */
        public Builder pem(Output<String> pem) {
            $.pem = pem;
            return this;
        }

        /**
         * @param pem PEM-formatted X509 certificate. Must be JSON escaped.
         * 
         * @return builder
         * 
         */
        public Builder pem(String pem) {
            return pem(Output.of(pem));
        }

        /**
         * @param thumbprintSha256 The X509 certificate&#39;s SHA256 thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSha256(@Nullable Output<String> thumbprintSha256) {
            $.thumbprintSha256 = thumbprintSha256;
            return this;
        }

        /**
         * @param thumbprintSha256 The X509 certificate&#39;s SHA256 thumbprint.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSha256(String thumbprintSha256) {
            return thumbprintSha256(Output.of(thumbprintSha256));
        }

        /**
         * @param updatedAt The ISO 8601 formatted date the credential was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The ISO 8601 formatted date the credential was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public ClientCredentialsSelfSignedTlsClientAuthCredentialArgs build() {
            if ($.pem == null) {
                throw new MissingRequiredPropertyException("ClientCredentialsSelfSignedTlsClientAuthCredentialArgs", "pem");
            }
            return $;
        }
    }

}
