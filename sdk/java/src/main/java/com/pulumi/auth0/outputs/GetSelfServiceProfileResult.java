// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetSelfServiceProfileBranding;
import com.pulumi.auth0.outputs.GetSelfServiceProfileUserAttribute;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSelfServiceProfileResult {
    /**
     * @return List of IdP strategies that will be shown to users during the Self-Service SSO flow.
     * 
     */
    private List<String> allowedStrategies;
    /**
     * @return Field can be used to customize the look and feel of the wizard.
     * 
     */
    private List<GetSelfServiceProfileBranding> brandings;
    /**
     * @return The ISO 8601 formatted date the profile was created.
     * 
     */
    private String createdAt;
    /**
     * @return The description of the self-service Profile
     * 
     */
    private String description;
    /**
     * @return The id of the Self Service Profile
     * 
     */
    private String id;
    /**
     * @return The name of the self-service Profile
     * 
     */
    private String name;
    /**
     * @return The ISO 8601 formatted date the profile was updated.
     * 
     */
    private String updatedAt;
    /**
     * @return This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     * 
     */
    private List<GetSelfServiceProfileUserAttribute> userAttributes;

    private GetSelfServiceProfileResult() {}
    /**
     * @return List of IdP strategies that will be shown to users during the Self-Service SSO flow.
     * 
     */
    public List<String> allowedStrategies() {
        return this.allowedStrategies;
    }
    /**
     * @return Field can be used to customize the look and feel of the wizard.
     * 
     */
    public List<GetSelfServiceProfileBranding> brandings() {
        return this.brandings;
    }
    /**
     * @return The ISO 8601 formatted date the profile was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The description of the self-service Profile
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The id of the Self Service Profile
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the self-service Profile
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ISO 8601 formatted date the profile was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     * 
     */
    public List<GetSelfServiceProfileUserAttribute> userAttributes() {
        return this.userAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSelfServiceProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedStrategies;
        private List<GetSelfServiceProfileBranding> brandings;
        private String createdAt;
        private String description;
        private String id;
        private String name;
        private String updatedAt;
        private List<GetSelfServiceProfileUserAttribute> userAttributes;
        public Builder() {}
        public Builder(GetSelfServiceProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedStrategies = defaults.allowedStrategies;
    	      this.brandings = defaults.brandings;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.updatedAt = defaults.updatedAt;
    	      this.userAttributes = defaults.userAttributes;
        }

        @CustomType.Setter
        public Builder allowedStrategies(List<String> allowedStrategies) {
            if (allowedStrategies == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "allowedStrategies");
            }
            this.allowedStrategies = allowedStrategies;
            return this;
        }
        public Builder allowedStrategies(String... allowedStrategies) {
            return allowedStrategies(List.of(allowedStrategies));
        }
        @CustomType.Setter
        public Builder brandings(List<GetSelfServiceProfileBranding> brandings) {
            if (brandings == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "brandings");
            }
            this.brandings = brandings;
            return this;
        }
        public Builder brandings(GetSelfServiceProfileBranding... brandings) {
            return brandings(List.of(brandings));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        @CustomType.Setter
        public Builder userAttributes(List<GetSelfServiceProfileUserAttribute> userAttributes) {
            if (userAttributes == null) {
              throw new MissingRequiredPropertyException("GetSelfServiceProfileResult", "userAttributes");
            }
            this.userAttributes = userAttributes;
            return this;
        }
        public Builder userAttributes(GetSelfServiceProfileUserAttribute... userAttributes) {
            return userAttributes(List.of(userAttributes));
        }
        public GetSelfServiceProfileResult build() {
            final var _resultValue = new GetSelfServiceProfileResult();
            _resultValue.allowedStrategies = allowedStrategies;
            _resultValue.brandings = brandings;
            _resultValue.createdAt = createdAt;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.updatedAt = updatedAt;
            _resultValue.userAttributes = userAttributes;
            return _resultValue;
        }
    }
}
