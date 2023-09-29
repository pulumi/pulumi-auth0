// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsAttributeMap {
    private @Nullable String attributes;
    private String mappingMode;
    private @Nullable String userinfoScope;

    private ConnectionOptionsAttributeMap() {}
    public Optional<String> attributes() {
        return Optional.ofNullable(this.attributes);
    }
    public String mappingMode() {
        return this.mappingMode;
    }
    public Optional<String> userinfoScope() {
        return Optional.ofNullable(this.userinfoScope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsAttributeMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attributes;
        private String mappingMode;
        private @Nullable String userinfoScope;
        public Builder() {}
        public Builder(ConnectionOptionsAttributeMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.mappingMode = defaults.mappingMode;
    	      this.userinfoScope = defaults.userinfoScope;
        }

        @CustomType.Setter
        public Builder attributes(@Nullable String attributes) {
            this.attributes = attributes;
            return this;
        }
        @CustomType.Setter
        public Builder mappingMode(String mappingMode) {
            this.mappingMode = Objects.requireNonNull(mappingMode);
            return this;
        }
        @CustomType.Setter
        public Builder userinfoScope(@Nullable String userinfoScope) {
            this.userinfoScope = userinfoScope;
            return this;
        }
        public ConnectionOptionsAttributeMap build() {
            final var o = new ConnectionOptionsAttributeMap();
            o.attributes = attributes;
            o.mappingMode = mappingMode;
            o.userinfoScope = userinfoScope;
            return o;
        }
    }
}