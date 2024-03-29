// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonSalesforceApi {
    /**
     * @return Consumer Key assigned by Salesforce to the Connected App.
     * 
     */
    private String clientId;
    /**
     * @return Community name.
     * 
     */
    private String communityName;
    /**
     * @return Community URL section.
     * 
     */
    private String communityUrlSection;
    /**
     * @return Name of the property in the user object that maps to a Salesforce username, for example `email`.
     * 
     */
    private String principal;

    private GetClientAddonSalesforceApi() {}
    /**
     * @return Consumer Key assigned by Salesforce to the Connected App.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Community name.
     * 
     */
    public String communityName() {
        return this.communityName;
    }
    /**
     * @return Community URL section.
     * 
     */
    public String communityUrlSection() {
        return this.communityUrlSection;
    }
    /**
     * @return Name of the property in the user object that maps to a Salesforce username, for example `email`.
     * 
     */
    public String principal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSalesforceApi defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String communityName;
        private String communityUrlSection;
        private String principal;
        public Builder() {}
        public Builder(GetClientAddonSalesforceApi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.communityName = defaults.communityName;
    	      this.communityUrlSection = defaults.communityUrlSection;
    	      this.principal = defaults.principal;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSalesforceApi", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder communityName(String communityName) {
            if (communityName == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSalesforceApi", "communityName");
            }
            this.communityName = communityName;
            return this;
        }
        @CustomType.Setter
        public Builder communityUrlSection(String communityUrlSection) {
            if (communityUrlSection == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSalesforceApi", "communityUrlSection");
            }
            this.communityUrlSection = communityUrlSection;
            return this;
        }
        @CustomType.Setter
        public Builder principal(String principal) {
            if (principal == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSalesforceApi", "principal");
            }
            this.principal = principal;
            return this;
        }
        public GetClientAddonSalesforceApi build() {
            final var _resultValue = new GetClientAddonSalesforceApi();
            _resultValue.clientId = clientId;
            _resultValue.communityName = communityName;
            _resultValue.communityUrlSection = communityUrlSection;
            _resultValue.principal = principal;
            return _resultValue;
        }
    }
}
