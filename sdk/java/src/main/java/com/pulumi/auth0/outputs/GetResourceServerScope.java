// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceServerScope {
    /**
     * @return Description of the permission (scope).
     * 
     */
    private String description;
    /**
     * @return Name of the permission (scope). Examples include `read:appointments` or `delete:appointments`.
     * 
     */
    private String name;

    private GetResourceServerScope() {}
    /**
     * @return Description of the permission (scope).
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Name of the permission (scope). Examples include `read:appointments` or `delete:appointments`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceServerScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String name;
        public Builder() {}
        public Builder(GetResourceServerScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetResourceServerScope", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourceServerScope", "name");
            }
            this.name = name;
            return this;
        }
        public GetResourceServerScope build() {
            final var _resultValue = new GetResourceServerScope();
            _resultValue.description = description;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
