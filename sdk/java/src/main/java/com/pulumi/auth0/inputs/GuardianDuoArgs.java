// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GuardianDuoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianDuoArgs Empty = new GuardianDuoArgs();

    /**
     * String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * String. Duo client ID, see the Duo documentation for more details on Duo setup.
     * 
     */
    @Import(name="integrationKey", required=true)
    private Output<String> integrationKey;

    /**
     * @return String. Duo client ID, see the Duo documentation for more details on Duo setup.
     * 
     */
    public Output<String> integrationKey() {
        return this.integrationKey;
    }

    /**
     * String. Duo client secret, see the Duo documentation for more details on Duo setup.
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return String. Duo client secret, see the Duo documentation for more details on Duo setup.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    private GuardianDuoArgs() {}

    private GuardianDuoArgs(GuardianDuoArgs $) {
        this.hostname = $.hostname;
        this.integrationKey = $.integrationKey;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianDuoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianDuoArgs $;

        public Builder() {
            $ = new GuardianDuoArgs();
        }

        public Builder(GuardianDuoArgs defaults) {
            $ = new GuardianDuoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param integrationKey String. Duo client ID, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(Output<String> integrationKey) {
            $.integrationKey = integrationKey;
            return this;
        }

        /**
         * @param integrationKey String. Duo client ID, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder integrationKey(String integrationKey) {
            return integrationKey(Output.of(integrationKey));
        }

        /**
         * @param secretKey String. Duo client secret, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey String. Duo client secret, see the Duo documentation for more details on Duo setup.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public GuardianDuoArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.integrationKey = Objects.requireNonNull($.integrationKey, "expected parameter 'integrationKey' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
