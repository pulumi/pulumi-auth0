// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GuardianPushAmazonSns;
import com.pulumi.auth0.outputs.GuardianPushCustomApp;
import com.pulumi.auth0.outputs.GuardianPushDirectApns;
import com.pulumi.auth0.outputs.GuardianPushDirectFcm;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuardianPush {
    /**
     * @return Configuration for Amazon SNS.
     * 
     */
    private @Nullable GuardianPushAmazonSns amazonSns;
    /**
     * @return Configuration for the Guardian Custom App.
     * 
     */
    private @Nullable GuardianPushCustomApp customApp;
    /**
     * @return Configuration for the Apple Push Notification service (APNs) settings.
     * 
     */
    private @Nullable GuardianPushDirectApns directApns;
    /**
     * @return Configuration for Firebase Cloud Messaging (FCM) settings.
     * 
     */
    private @Nullable GuardianPushDirectFcm directFcm;
    /**
     * @return Indicates whether Push MFA is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Provider to use, one of `direct`, `guardian`, `sns`.
     * 
     */
    private @Nullable String provider;

    private GuardianPush() {}
    /**
     * @return Configuration for Amazon SNS.
     * 
     */
    public Optional<GuardianPushAmazonSns> amazonSns() {
        return Optional.ofNullable(this.amazonSns);
    }
    /**
     * @return Configuration for the Guardian Custom App.
     * 
     */
    public Optional<GuardianPushCustomApp> customApp() {
        return Optional.ofNullable(this.customApp);
    }
    /**
     * @return Configuration for the Apple Push Notification service (APNs) settings.
     * 
     */
    public Optional<GuardianPushDirectApns> directApns() {
        return Optional.ofNullable(this.directApns);
    }
    /**
     * @return Configuration for Firebase Cloud Messaging (FCM) settings.
     * 
     */
    public Optional<GuardianPushDirectFcm> directFcm() {
        return Optional.ofNullable(this.directFcm);
    }
    /**
     * @return Indicates whether Push MFA is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Provider to use, one of `direct`, `guardian`, `sns`.
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
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
        private @Nullable GuardianPushDirectApns directApns;
        private @Nullable GuardianPushDirectFcm directFcm;
        private Boolean enabled;
        private @Nullable String provider;
        public Builder() {}
        public Builder(GuardianPush defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSns = defaults.amazonSns;
    	      this.customApp = defaults.customApp;
    	      this.directApns = defaults.directApns;
    	      this.directFcm = defaults.directFcm;
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
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
        @CustomType.Setter
        public Builder directApns(@Nullable GuardianPushDirectApns directApns) {

            this.directApns = directApns;
            return this;
        }
        @CustomType.Setter
        public Builder directFcm(@Nullable GuardianPushDirectFcm directFcm) {

            this.directFcm = directFcm;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GuardianPush", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        public GuardianPush build() {
            final var _resultValue = new GuardianPush();
            _resultValue.amazonSns = amazonSns;
            _resultValue.customApp = customApp;
            _resultValue.directApns = directApns;
            _resultValue.directFcm = directFcm;
            _resultValue.enabled = enabled;
            _resultValue.provider = provider;
            return _resultValue;
        }
    }
}
