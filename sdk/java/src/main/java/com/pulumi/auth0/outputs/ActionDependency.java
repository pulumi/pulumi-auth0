// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ActionDependency {
    /**
     * @return Dependency name, e.g. `lodash`.
     * 
     */
    private String name;
    /**
     * @return Dependency version, e.g. `latest` or `4.17.21`.
     * 
     */
    private String version;

    private ActionDependency() {}
    /**
     * @return Dependency name, e.g. `lodash`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Dependency version, e.g. `latest` or `4.17.21`.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionDependency defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String version;
        public Builder() {}
        public Builder(ActionDependency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ActionDependency", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("ActionDependency", "version");
            }
            this.version = version;
            return this;
        }
        public ActionDependency build() {
            final var _resultValue = new ActionDependency();
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
