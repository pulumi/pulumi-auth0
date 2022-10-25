// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttackProtectionBreachedPasswordDetection {
    /**
     * @return When &#34;admin_notification&#34; is enabled, determines how often email notifications are sent. Possible values: `immediately`, `daily`, `weekly`, `monthly`.
     * 
     */
    private @Nullable List<String> adminNotificationFrequencies;
    /**
     * @return Whether or not breached password detection is active.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The subscription level for breached password detection methods. Use &#34;enhanced&#34; to enable Credential Guard. Possible values: `standard`, `enhanced`.
     * 
     */
    private @Nullable String method;
    /**
     * @return Action to take when a breached password is detected. Possible values: `block`, `user_notification`, `admin_notification`.
     * 
     */
    private @Nullable List<String> shields;

    private AttackProtectionBreachedPasswordDetection() {}
    /**
     * @return When &#34;admin_notification&#34; is enabled, determines how often email notifications are sent. Possible values: `immediately`, `daily`, `weekly`, `monthly`.
     * 
     */
    public List<String> adminNotificationFrequencies() {
        return this.adminNotificationFrequencies == null ? List.of() : this.adminNotificationFrequencies;
    }
    /**
     * @return Whether or not breached password detection is active.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The subscription level for breached password detection methods. Use &#34;enhanced&#34; to enable Credential Guard. Possible values: `standard`, `enhanced`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Action to take when a breached password is detected. Possible values: `block`, `user_notification`, `admin_notification`.
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
        private @Nullable Boolean enabled;
        private @Nullable String method;
        private @Nullable List<String> shields;
        public Builder() {}
        public Builder(AttackProtectionBreachedPasswordDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotificationFrequencies = defaults.adminNotificationFrequencies;
    	      this.enabled = defaults.enabled;
    	      this.method = defaults.method;
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
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
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
            final var o = new AttackProtectionBreachedPasswordDetection();
            o.adminNotificationFrequencies = adminNotificationFrequencies;
            o.enabled = enabled;
            o.method = method;
            o.shields = shields;
            return o;
        }
    }
}