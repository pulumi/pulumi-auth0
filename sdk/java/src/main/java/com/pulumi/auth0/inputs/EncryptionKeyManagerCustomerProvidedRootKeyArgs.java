// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionKeyManagerCustomerProvidedRootKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionKeyManagerCustomerProvidedRootKeyArgs Empty = new EncryptionKeyManagerCustomerProvidedRootKeyArgs();

    /**
     * The ISO 8601 formatted date the customer provided root key was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The ISO 8601 formatted date the customer provided root key was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The key ID of the customer provided root key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The key ID of the customer provided root key.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The key ID of the parent wrapping key.
     * 
     */
    @Import(name="parentKeyId")
    private @Nullable Output<String> parentKeyId;

    /**
     * @return The key ID of the parent wrapping key.
     * 
     */
    public Optional<Output<String>> parentKeyId() {
        return Optional.ofNullable(this.parentKeyId);
    }

    /**
     * The public wrapping key in PEM format.
     * 
     */
    @Import(name="publicWrappingKey")
    private @Nullable Output<String> publicWrappingKey;

    /**
     * @return The public wrapping key in PEM format.
     * 
     */
    public Optional<Output<String>> publicWrappingKey() {
        return Optional.ofNullable(this.publicWrappingKey);
    }

    /**
     * The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The type of the customer provided root key. Should be `customer-provided-root-key`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the customer provided root key. Should be `customer-provided-root-key`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The ISO 8601 formatted date the customer provided root key was updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The ISO 8601 formatted date the customer provided root key was updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * The base64-encoded customer provided root key, wrapped using the `public_wrapping_key`. This can be removed after the wrapped key has been applied.
     * 
     */
    @Import(name="wrappedKey")
    private @Nullable Output<String> wrappedKey;

    /**
     * @return The base64-encoded customer provided root key, wrapped using the `public_wrapping_key`. This can be removed after the wrapped key has been applied.
     * 
     */
    public Optional<Output<String>> wrappedKey() {
        return Optional.ofNullable(this.wrappedKey);
    }

    /**
     * The algorithm that should be used to wrap the customer provided root key. Should be `CKM_RSA_AES_KEY_WRAP`.
     * 
     */
    @Import(name="wrappingAlgorithm")
    private @Nullable Output<String> wrappingAlgorithm;

    /**
     * @return The algorithm that should be used to wrap the customer provided root key. Should be `CKM_RSA_AES_KEY_WRAP`.
     * 
     */
    public Optional<Output<String>> wrappingAlgorithm() {
        return Optional.ofNullable(this.wrappingAlgorithm);
    }

    private EncryptionKeyManagerCustomerProvidedRootKeyArgs() {}

    private EncryptionKeyManagerCustomerProvidedRootKeyArgs(EncryptionKeyManagerCustomerProvidedRootKeyArgs $) {
        this.createdAt = $.createdAt;
        this.keyId = $.keyId;
        this.parentKeyId = $.parentKeyId;
        this.publicWrappingKey = $.publicWrappingKey;
        this.state = $.state;
        this.type = $.type;
        this.updatedAt = $.updatedAt;
        this.wrappedKey = $.wrappedKey;
        this.wrappingAlgorithm = $.wrappingAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionKeyManagerCustomerProvidedRootKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionKeyManagerCustomerProvidedRootKeyArgs $;

        public Builder() {
            $ = new EncryptionKeyManagerCustomerProvidedRootKeyArgs();
        }

        public Builder(EncryptionKeyManagerCustomerProvidedRootKeyArgs defaults) {
            $ = new EncryptionKeyManagerCustomerProvidedRootKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The ISO 8601 formatted date the customer provided root key was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The ISO 8601 formatted date the customer provided root key was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param keyId The key ID of the customer provided root key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The key ID of the customer provided root key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param parentKeyId The key ID of the parent wrapping key.
         * 
         * @return builder
         * 
         */
        public Builder parentKeyId(@Nullable Output<String> parentKeyId) {
            $.parentKeyId = parentKeyId;
            return this;
        }

        /**
         * @param parentKeyId The key ID of the parent wrapping key.
         * 
         * @return builder
         * 
         */
        public Builder parentKeyId(String parentKeyId) {
            return parentKeyId(Output.of(parentKeyId));
        }

        /**
         * @param publicWrappingKey The public wrapping key in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder publicWrappingKey(@Nullable Output<String> publicWrappingKey) {
            $.publicWrappingKey = publicWrappingKey;
            return this;
        }

        /**
         * @param publicWrappingKey The public wrapping key in PEM format.
         * 
         * @return builder
         * 
         */
        public Builder publicWrappingKey(String publicWrappingKey) {
            return publicWrappingKey(Output.of(publicWrappingKey));
        }

        /**
         * @param state The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type The type of the customer provided root key. Should be `customer-provided-root-key`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the customer provided root key. Should be `customer-provided-root-key`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updatedAt The ISO 8601 formatted date the customer provided root key was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The ISO 8601 formatted date the customer provided root key was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param wrappedKey The base64-encoded customer provided root key, wrapped using the `public_wrapping_key`. This can be removed after the wrapped key has been applied.
         * 
         * @return builder
         * 
         */
        public Builder wrappedKey(@Nullable Output<String> wrappedKey) {
            $.wrappedKey = wrappedKey;
            return this;
        }

        /**
         * @param wrappedKey The base64-encoded customer provided root key, wrapped using the `public_wrapping_key`. This can be removed after the wrapped key has been applied.
         * 
         * @return builder
         * 
         */
        public Builder wrappedKey(String wrappedKey) {
            return wrappedKey(Output.of(wrappedKey));
        }

        /**
         * @param wrappingAlgorithm The algorithm that should be used to wrap the customer provided root key. Should be `CKM_RSA_AES_KEY_WRAP`.
         * 
         * @return builder
         * 
         */
        public Builder wrappingAlgorithm(@Nullable Output<String> wrappingAlgorithm) {
            $.wrappingAlgorithm = wrappingAlgorithm;
            return this;
        }

        /**
         * @param wrappingAlgorithm The algorithm that should be used to wrap the customer provided root key. Should be `CKM_RSA_AES_KEY_WRAP`.
         * 
         * @return builder
         * 
         */
        public Builder wrappingAlgorithm(String wrappingAlgorithm) {
            return wrappingAlgorithm(Output.of(wrappingAlgorithm));
        }

        public EncryptionKeyManagerCustomerProvidedRootKeyArgs build() {
            return $;
        }
    }

}
