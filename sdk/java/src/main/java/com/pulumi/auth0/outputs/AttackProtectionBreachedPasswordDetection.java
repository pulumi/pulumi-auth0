// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.AttackProtectionBreachedPasswordDetectionPreChangePassword;
import com.pulumi.auth0.outputs.AttackProtectionBreachedPasswordDetectionPreUserRegistration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttackProtectionBreachedPasswordDetection {
    /**
     * @return When `admin_notification` is enabled within the `shields` property, determines how often email notifications are sent. Possible values: `immediately`, `daily`, `weekly`, `monthly`.
     * 
     */
    private @Nullable List<String> adminNotificationFrequencies;
    /**
     * @return Whether breached password detection is active.
     * 
     */
    private Boolean enabled;
    /**
     * @return The subscription level for breached password detection methods. Use &#34;enhanced&#34; to enable Credential Guard. Possible values: `standard`, `enhanced`.
     * 
     */
    private @Nullable String method;
    /**
     * @return Configuration options that apply before every password change attempt.
     * 
     */
    private @Nullable AttackProtectionBreachedPasswordDetectionPreChangePassword preChangePassword;
    /**
     * @return Configuration options that apply before every user registration attempt. Only available on public tenants.
     * 
     */
    private @Nullable AttackProtectionBreachedPasswordDetectionPreUserRegistration preUserRegistration;
    /**
     * @return Action to take when a breached password is detected. Options include: `block` (block compromised user accounts), `user_notification` (send an email to user when we detect that they are using compromised credentials) and `admin_notification` (send an email with a summary of the number of accounts logging in with compromised credentials).
     * 
     */
    private @Nullable List<String> shields;

    private AttackProtectionBreachedPasswordDetection() {}
    /**
     * @return When `admin_notification` is enabled within the `shields` property, determines how often email notifications are sent. Possible values: `immediately`, `daily`, `weekly`, `monthly`.
     * 
     */
    public List<String> adminNotificationFrequencies() {
        return this.adminNotificationFrequencies == null ? List.of() : this.adminNotificationFrequencies;
    }
    /**
     * @return Whether breached password detection is active.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The subscription level for breached password detection methods. Use &#34;enhanced&#34; to enable Credential Guard. Possible values: `standard`, `enhanced`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Configuration options that apply before every password change attempt.
     * 
     */
    public Optional<AttackProtectionBreachedPasswordDetectionPreChangePassword> preChangePassword() {
        return Optional.ofNullable(this.preChangePassword);
    }
    /**
     * @return Configuration options that apply before every user registration attempt. Only available on public tenants.
     * 
     */
    public Optional<AttackProtectionBreachedPasswordDetectionPreUserRegistration> preUserRegistration() {
        return Optional.ofNullable(this.preUserRegistration);
    }
    /**
     * @return Action to take when a breached password is detected. Options include: `block` (block compromised user accounts), `user_notification` (send an email to user when we detect that they are using compromised credentials) and `admin_notification` (send an email with a summary of the number of accounts logging in with compromised credentials).
     * 
     */
    public List<String> shields() {
        return this.shields == null ? List.of() : this.shields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttackProtectionBreachedPasswordDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> adminNotificationFrequencies;
        private Boolean enabled;
        private @Nullable String method;
        private @Nullable AttackProtectionBreachedPasswordDetectionPreChangePassword preChangePassword;
        private @Nullable AttackProtectionBreachedPasswordDetectionPreUserRegistration preUserRegistration;
        private @Nullable List<String> shields;
        public Builder() {}
        public Builder(AttackProtectionBreachedPasswordDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotificationFrequencies = defaults.adminNotificationFrequencies;
    	      this.enabled = defaults.enabled;
    	      this.method = defaults.method;
    	      this.preChangePassword = defaults.preChangePassword;
    	      this.preUserRegistration = defaults.preUserRegistration;
    	      this.shields = defaults.shields;
        }

        @CustomType.Setter
        public Builder adminNotificationFrequencies(@Nullable List<String> adminNotificationFrequencies) {

            this.adminNotificationFrequencies = adminNotificationFrequencies;
            return this;
        }
        public Builder adminNotificationFrequencies(String... adminNotificationFrequencies) {
            return adminNotificationFrequencies(List.of(adminNotificationFrequencies));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("AttackProtectionBreachedPasswordDetection", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {

            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder preChangePassword(@Nullable AttackProtectionBreachedPasswordDetectionPreChangePassword preChangePassword) {

            this.preChangePassword = preChangePassword;
            return this;
        }
        @CustomType.Setter
        public Builder preUserRegistration(@Nullable AttackProtectionBreachedPasswordDetectionPreUserRegistration preUserRegistration) {

            this.preUserRegistration = preUserRegistration;
            return this;
        }
        @CustomType.Setter
        public Builder shields(@Nullable List<String> shields) {

            this.shields = shields;
            return this;
        }
        public Builder shields(String... shields) {
            return shields(List.of(shields));
        }
        public AttackProtectionBreachedPasswordDetection build() {
            final var _resultValue = new AttackProtectionBreachedPasswordDetection();
            _resultValue.adminNotificationFrequencies = adminNotificationFrequencies;
            _resultValue.enabled = enabled;
            _resultValue.method = method;
            _resultValue.preChangePassword = preChangePassword;
            _resultValue.preUserRegistration = preUserRegistration;
            _resultValue.shields = shields;
            return _resultValue;
        }
    }
}
