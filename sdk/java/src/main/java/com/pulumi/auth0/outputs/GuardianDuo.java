// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GuardianDuo {
    /**
     * @return String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
     * 
     */
    private String hostname;
    /**
     * @return String. Duo client ID, see the Duo documentation for more details on Duo setup.
     * 
     */
    private String integrationKey;
    /**
     * @return String. Duo client secret, see the Duo documentation for more details on Duo setup.
     * 
     */
    private String secretKey;

    private GuardianDuo() {}
    /**
     * @return String. Duo API Hostname, see the Duo documentation for more details on Duo setup.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return String. Duo client ID, see the Duo documentation for more details on Duo setup.
     * 
     */
    public String integrationKey() {
        return this.integrationKey;
    }
    /**
     * @return String. Duo client secret, see the Duo documentation for more details on Duo setup.
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuardianDuo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String integrationKey;
        private String secretKey;
        public Builder() {}
        public Builder(GuardianDuo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.integrationKey = defaults.integrationKey;
    	      this.secretKey = defaults.secretKey;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder integrationKey(String integrationKey) {
            this.integrationKey = Objects.requireNonNull(integrationKey);
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }
        public GuardianDuo build() {
            final var o = new GuardianDuo();
            o.hostname = hostname;
            o.integrationKey = integrationKey;
            o.secretKey = secretKey;
            return o;
        }
    }
}