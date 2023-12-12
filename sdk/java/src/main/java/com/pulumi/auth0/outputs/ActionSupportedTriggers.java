// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ActionSupportedTriggers {
    /**
     * @return The trigger ID.
     * 
     */
    private String id;
    /**
     * @return The trigger version. This regulates which `runtime` versions are supported.
     * 
     */
    private String version;

    private ActionSupportedTriggers() {}
    /**
     * @return The trigger ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The trigger version. This regulates which `runtime` versions are supported.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionSupportedTriggers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String version;
        public Builder() {}
        public Builder(ActionSupportedTriggers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ActionSupportedTriggers build() {
            final var _resultValue = new ActionSupportedTriggers();
            _resultValue.id = id;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
