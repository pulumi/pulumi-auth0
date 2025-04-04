// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetPhoneProviderConfiguration;
import com.pulumi.auth0.outputs.GetPhoneProviderCredential;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPhoneProviderResult {
    /**
     * @return The channel of the phone provider.
     * 
     */
    private String channel;
    /**
     * @return Specific phone provider settings.
     * 
     */
    private List<GetPhoneProviderConfiguration> configurations;
    /**
     * @return Provider credentials required to use authenticate to the provider.
     * 
     */
    private List<GetPhoneProviderCredential> credentials;
    /**
     * @return Indicates whether the phone provider is enabled (false) or disabled (true).
     * 
     */
    private Boolean disabled;
    /**
     * @return The ID of the Phone Provider.
     * 
     */
    private String id;
    /**
     * @return Name of the phone provider. Options include `twilio`, `custom`.
     * 
     */
    private String name;
    /**
     * @return The tenant of the phone provider.
     * 
     */
    private String tenant;

    private GetPhoneProviderResult() {}
    /**
     * @return The channel of the phone provider.
     * 
     */
    public String channel() {
        return this.channel;
    }
    /**
     * @return Specific phone provider settings.
     * 
     */
    public List<GetPhoneProviderConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return Provider credentials required to use authenticate to the provider.
     * 
     */
    public List<GetPhoneProviderCredential> credentials() {
        return this.credentials;
    }
    /**
     * @return Indicates whether the phone provider is enabled (false) or disabled (true).
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The ID of the Phone Provider.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the phone provider. Options include `twilio`, `custom`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The tenant of the phone provider.
     * 
     */
    public String tenant() {
        return this.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPhoneProviderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        private List<GetPhoneProviderConfiguration> configurations;
        private List<GetPhoneProviderCredential> credentials;
        private Boolean disabled;
        private String id;
        private String name;
        private String tenant;
        public Builder() {}
        public Builder(GetPhoneProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.configurations = defaults.configurations;
    	      this.credentials = defaults.credentials;
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tenant = defaults.tenant;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            if (channel == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "channel");
            }
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder configurations(List<GetPhoneProviderConfiguration> configurations) {
            if (configurations == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "configurations");
            }
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(GetPhoneProviderConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder credentials(List<GetPhoneProviderCredential> credentials) {
            if (credentials == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "credentials");
            }
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(GetPhoneProviderCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            if (disabled == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "disabled");
            }
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tenant(String tenant) {
            if (tenant == null) {
              throw new MissingRequiredPropertyException("GetPhoneProviderResult", "tenant");
            }
            this.tenant = tenant;
            return this;
        }
        public GetPhoneProviderResult build() {
            final var _resultValue = new GetPhoneProviderResult();
            _resultValue.channel = channel;
            _resultValue.configurations = configurations;
            _resultValue.credentials = credentials;
            _resultValue.disabled = disabled;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tenant = tenant;
            return _resultValue;
        }
    }
}
