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


public final class ResourceServerTokenEncryptionEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerTokenEncryptionEncryptionKeyArgs Empty = new ResourceServerTokenEncryptionEncryptionKeyArgs();

    /**
     * Algorithm used to encrypt the token.
     * 
     */
    @Import(name="algorithm", required=true)
    private Output<String> algorithm;

    /**
     * @return Algorithm used to encrypt the token.
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }

    /**
     * Key ID.
     * 
     */
    @Import(name="kid")
    private @Nullable Output<String> kid;

    /**
     * @return Key ID.
     * 
     */
    public Optional<Output<String>> kid() {
        return Optional.ofNullable(this.kid);
    }

    /**
     * Name of the encryption key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the encryption key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * PEM-formatted public key. Must be JSON escaped.
     * 
     */
    @Import(name="pem", required=true)
    private Output<String> pem;

    /**
     * @return PEM-formatted public key. Must be JSON escaped.
     * 
     */
    public Output<String> pem() {
        return this.pem;
    }

    private ResourceServerTokenEncryptionEncryptionKeyArgs() {}

    private ResourceServerTokenEncryptionEncryptionKeyArgs(ResourceServerTokenEncryptionEncryptionKeyArgs $) {
        this.algorithm = $.algorithm;
        this.kid = $.kid;
        this.name = $.name;
        this.pem = $.pem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerTokenEncryptionEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerTokenEncryptionEncryptionKeyArgs $;

        public Builder() {
            $ = new ResourceServerTokenEncryptionEncryptionKeyArgs();
        }

        public Builder(ResourceServerTokenEncryptionEncryptionKeyArgs defaults) {
            $ = new ResourceServerTokenEncryptionEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm Algorithm used to encrypt the token.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm Algorithm used to encrypt the token.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param kid Key ID.
         * 
         * @return builder
         * 
         */
        public Builder kid(@Nullable Output<String> kid) {
            $.kid = kid;
            return this;
        }

        /**
         * @param kid Key ID.
         * 
         * @return builder
         * 
         */
        public Builder kid(String kid) {
            return kid(Output.of(kid));
        }

        /**
         * @param name Name of the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pem PEM-formatted public key. Must be JSON escaped.
         * 
         * @return builder
         * 
         */
        public Builder pem(Output<String> pem) {
            $.pem = pem;
            return this;
        }

        /**
         * @param pem PEM-formatted public key. Must be JSON escaped.
         * 
         * @return builder
         * 
         */
        public Builder pem(String pem) {
            return pem(Output.of(pem));
        }

        public ResourceServerTokenEncryptionEncryptionKeyArgs build() {
            if ($.algorithm == null) {
                throw new MissingRequiredPropertyException("ResourceServerTokenEncryptionEncryptionKeyArgs", "algorithm");
            }
            if ($.pem == null) {
                throw new MissingRequiredPropertyException("ResourceServerTokenEncryptionEncryptionKeyArgs", "pem");
            }
            return $;
        }
    }

}
