// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GuardianPushAmazonSns;
import com.pulumi.auth0.outputs.GuardianPushCustomApp;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuardianPush {
    private @Nullable GuardianPushAmazonSns amazonSns;
    private @Nullable GuardianPushCustomApp customApp;

    private GuardianPush() {}
    public Optional<GuardianPushAmazonSns> amazonSns() {
        return Optional.ofNullable(this.amazonSns);
    }
    public Optional<GuardianPushCustomApp> customApp() {
        return Optional.ofNullable(this.customApp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuardianPush defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GuardianPushAmazonSns amazonSns;
        private @Nullable GuardianPushCustomApp customApp;
        public Builder() {}
        public Builder(GuardianPush defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSns = defaults.amazonSns;
    	      this.customApp = defaults.customApp;
        }

        @CustomType.Setter
        public Builder amazonSns(@Nullable GuardianPushAmazonSns amazonSns) {
            this.amazonSns = amazonSns;
            return this;
        }
        @CustomType.Setter
        public Builder customApp(@Nullable GuardianPushCustomApp customApp) {
            this.customApp = customApp;
            return this;
        }
        public GuardianPush build() {
            final var o = new GuardianPush();
            o.amazonSns = amazonSns;
            o.customApp = customApp;
            return o;
        }
    }
}