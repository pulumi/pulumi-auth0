// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ResourceServerTokenEncryptionEncryptionKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceServerTokenEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerTokenEncryptionArgs Empty = new ResourceServerTokenEncryptionArgs();

    /**
     * Disable token encryption.
     * 
     */
    @Import(name="disable")
    private @Nullable Output<Boolean> disable;

    /**
     * @return Disable token encryption.
     * 
     */
    public Optional<Output<Boolean>> disable() {
        return Optional.ofNullable(this.disable);
    }

    /**
     * Authorization details for this resource server.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<ResourceServerTokenEncryptionEncryptionKeyArgs> encryptionKey;

    /**
     * @return Authorization details for this resource server.
     * 
     */
    public Optional<Output<ResourceServerTokenEncryptionEncryptionKeyArgs>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * Format of the token encryption. Only `compact-nested-jwe` is supported.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Format of the token encryption. Only `compact-nested-jwe` is supported.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    private ResourceServerTokenEncryptionArgs() {}

    private ResourceServerTokenEncryptionArgs(ResourceServerTokenEncryptionArgs $) {
        this.disable = $.disable;
        this.encryptionKey = $.encryptionKey;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerTokenEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerTokenEncryptionArgs $;

        public Builder() {
            $ = new ResourceServerTokenEncryptionArgs();
        }

        public Builder(ResourceServerTokenEncryptionArgs defaults) {
            $ = new ResourceServerTokenEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disable Disable token encryption.
         * 
         * @return builder
         * 
         */
        public Builder disable(@Nullable Output<Boolean> disable) {
            $.disable = disable;
            return this;
        }

        /**
         * @param disable Disable token encryption.
         * 
         * @return builder
         * 
         */
        public Builder disable(Boolean disable) {
            return disable(Output.of(disable));
        }

        /**
         * @param encryptionKey Authorization details for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<ResourceServerTokenEncryptionEncryptionKeyArgs> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey Authorization details for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(ResourceServerTokenEncryptionEncryptionKeyArgs encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param format Format of the token encryption. Only `compact-nested-jwe` is supported.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format of the token encryption. Only `compact-nested-jwe` is supported.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public ResourceServerTokenEncryptionArgs build() {
            return $;
        }
    }

}
