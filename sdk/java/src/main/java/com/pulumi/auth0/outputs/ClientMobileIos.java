// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientMobileIos {
    private @Nullable String appBundleIdentifier;
    private @Nullable String teamId;

    private ClientMobileIos() {}
    public Optional<String> appBundleIdentifier() {
        return Optional.ofNullable(this.appBundleIdentifier);
    }
    public Optional<String> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientMobileIos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appBundleIdentifier;
        private @Nullable String teamId;
        public Builder() {}
        public Builder(ClientMobileIos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appBundleIdentifier = defaults.appBundleIdentifier;
    	      this.teamId = defaults.teamId;
        }

        @CustomType.Setter
        public Builder appBundleIdentifier(@Nullable String appBundleIdentifier) {
            this.appBundleIdentifier = appBundleIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder teamId(@Nullable String teamId) {
            this.teamId = teamId;
            return this;
        }
        public ClientMobileIos build() {
            final var _resultValue = new ClientMobileIos();
            _resultValue.appBundleIdentifier = appBundleIdentifier;
            _resultValue.teamId = teamId;
            return _resultValue;
        }
    }
}
