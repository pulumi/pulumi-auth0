// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AttackProtectionBreachedPasswordDetectionPreUserRegistration {
    /**
     * @return Action to take when a breached password is detected during a signup. Possible values: `block` (block compromised credentials for new accounts), `admin_notification` (send an email notification with a summary of compromised credentials in new accounts).
     * 
     */
    private @Nullable List<String> shields;

    private AttackProtectionBreachedPasswordDetectionPreUserRegistration() {}
    /**
     * @return Action to take when a breached password is detected during a signup. Possible values: `block` (block compromised credentials for new accounts), `admin_notification` (send an email notification with a summary of compromised credentials in new accounts).
     * 
     */
    public List<String> shields() {
        return this.shields == null ? List.of() : this.shields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttackProtectionBreachedPasswordDetectionPreUserRegistration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> shields;
        public Builder() {}
        public Builder(AttackProtectionBreachedPasswordDetectionPreUserRegistration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shields = defaults.shields;
        }

        @CustomType.Setter
        public Builder shields(@Nullable List<String> shields) {
            this.shields = shields;
            return this;
        }
        public Builder shields(String... shields) {
            return shields(List.of(shields));
        }
        public AttackProtectionBreachedPasswordDetectionPreUserRegistration build() {
            final var _resultValue = new AttackProtectionBreachedPasswordDetectionPreUserRegistration();
            _resultValue.shields = shields;
            return _resultValue;
        }
    }
}
