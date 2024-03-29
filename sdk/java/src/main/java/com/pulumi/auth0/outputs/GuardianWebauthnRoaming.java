// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuardianWebauthnRoaming {
    /**
     * @return Indicates whether WebAuthn with FIDO Security Keys MFA is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
     * 
     */
    private @Nullable Boolean overrideRelyingParty;
    /**
     * @return The Relying Party should be a suffix of the custom domain.
     * 
     */
    private @Nullable String relyingPartyIdentifier;
    /**
     * @return User verification, one of `discouraged`, `preferred` or `required`.
     * 
     */
    private @Nullable String userVerification;

    private GuardianWebauthnRoaming() {}
    /**
     * @return Indicates whether WebAuthn with FIDO Security Keys MFA is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
     * 
     */
    public Optional<Boolean> overrideRelyingParty() {
        return Optional.ofNullable(this.overrideRelyingParty);
    }
    /**
     * @return The Relying Party should be a suffix of the custom domain.
     * 
     */
    public Optional<String> relyingPartyIdentifier() {
        return Optional.ofNullable(this.relyingPartyIdentifier);
    }
    /**
     * @return User verification, one of `discouraged`, `preferred` or `required`.
     * 
     */
    public Optional<String> userVerification() {
        return Optional.ofNullable(this.userVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuardianWebauthnRoaming defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable Boolean overrideRelyingParty;
        private @Nullable String relyingPartyIdentifier;
        private @Nullable String userVerification;
        public Builder() {}
        public Builder(GuardianWebauthnRoaming defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.overrideRelyingParty = defaults.overrideRelyingParty;
    	      this.relyingPartyIdentifier = defaults.relyingPartyIdentifier;
    	      this.userVerification = defaults.userVerification;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GuardianWebauthnRoaming", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder overrideRelyingParty(@Nullable Boolean overrideRelyingParty) {

            this.overrideRelyingParty = overrideRelyingParty;
            return this;
        }
        @CustomType.Setter
        public Builder relyingPartyIdentifier(@Nullable String relyingPartyIdentifier) {

            this.relyingPartyIdentifier = relyingPartyIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder userVerification(@Nullable String userVerification) {

            this.userVerification = userVerification;
            return this;
        }
        public GuardianWebauthnRoaming build() {
            final var _resultValue = new GuardianWebauthnRoaming();
            _resultValue.enabled = enabled;
            _resultValue.overrideRelyingParty = overrideRelyingParty;
            _resultValue.relyingPartyIdentifier = relyingPartyIdentifier;
            _resultValue.userVerification = userVerification;
            return _resultValue;
        }
    }
}
