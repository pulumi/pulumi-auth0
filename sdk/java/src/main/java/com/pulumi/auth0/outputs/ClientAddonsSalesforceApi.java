// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsSalesforceApi {
    /**
     * @return Consumer Key assigned by Salesforce to the Connected App.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return Community name.
     * 
     */
    private @Nullable String communityName;
    /**
     * @return Community URL section.
     * 
     */
    private @Nullable String communityUrlSection;
    /**
     * @return Name of the property in the user object that maps to a Salesforce username, for example `email`.
     * 
     */
    private @Nullable String principal;

    private ClientAddonsSalesforceApi() {}
    /**
     * @return Consumer Key assigned by Salesforce to the Connected App.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Community name.
     * 
     */
    public Optional<String> communityName() {
        return Optional.ofNullable(this.communityName);
    }
    /**
     * @return Community URL section.
     * 
     */
    public Optional<String> communityUrlSection() {
        return Optional.ofNullable(this.communityUrlSection);
    }
    /**
     * @return Name of the property in the user object that maps to a Salesforce username, for example `email`.
     * 
     */
    public Optional<String> principal() {
        return Optional.ofNullable(this.principal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsSalesforceApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String communityName;
        private @Nullable String communityUrlSection;
        private @Nullable String principal;
        public Builder() {}
        public Builder(ClientAddonsSalesforceApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.communityName = defaults.communityName;
    	      this.communityUrlSection = defaults.communityUrlSection;
    	      this.principal = defaults.principal;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder communityName(@Nullable String communityName) {

            this.communityName = communityName;
            return this;
        }
        @CustomType.Setter
        public Builder communityUrlSection(@Nullable String communityUrlSection) {

            this.communityUrlSection = communityUrlSection;
            return this;
        }
        @CustomType.Setter
        public Builder principal(@Nullable String principal) {

            this.principal = principal;
            return this;
        }
        public ClientAddonsSalesforceApi build() {
            final var _resultValue = new ClientAddonsSalesforceApi();
            _resultValue.clientId = clientId;
            _resultValue.communityName = communityName;
            _resultValue.communityUrlSection = communityUrlSection;
            _resultValue.principal = principal;
            return _resultValue;
        }
    }
}
