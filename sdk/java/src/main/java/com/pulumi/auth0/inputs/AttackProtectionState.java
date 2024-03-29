// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.AttackProtectionBreachedPasswordDetectionArgs;
import com.pulumi.auth0.inputs.AttackProtectionBruteForceProtectionArgs;
import com.pulumi.auth0.inputs.AttackProtectionSuspiciousIpThrottlingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttackProtectionState extends com.pulumi.resources.ResourceArgs {

    public static final AttackProtectionState Empty = new AttackProtectionState();

    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     * 
     */
    @Import(name="breachedPasswordDetection")
    private @Nullable Output<AttackProtectionBreachedPasswordDetectionArgs> breachedPasswordDetection;

    /**
     * @return Breached password detection protects your applications from bad actors logging in with stolen credentials.
     * 
     */
    public Optional<Output<AttackProtectionBreachedPasswordDetectionArgs>> breachedPasswordDetection() {
        return Optional.ofNullable(this.breachedPasswordDetection);
    }

    /**
     * Brute-force protection safeguards against a single IP address attacking a single user account.
     * 
     */
    @Import(name="bruteForceProtection")
    private @Nullable Output<AttackProtectionBruteForceProtectionArgs> bruteForceProtection;

    /**
     * @return Brute-force protection safeguards against a single IP address attacking a single user account.
     * 
     */
    public Optional<Output<AttackProtectionBruteForceProtectionArgs>> bruteForceProtection() {
        return Optional.ofNullable(this.bruteForceProtection);
    }

    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     * 
     */
    @Import(name="suspiciousIpThrottling")
    private @Nullable Output<AttackProtectionSuspiciousIpThrottlingArgs> suspiciousIpThrottling;

    /**
     * @return Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     * 
     */
    public Optional<Output<AttackProtectionSuspiciousIpThrottlingArgs>> suspiciousIpThrottling() {
        return Optional.ofNullable(this.suspiciousIpThrottling);
    }

    private AttackProtectionState() {}

    private AttackProtectionState(AttackProtectionState $) {
        this.breachedPasswordDetection = $.breachedPasswordDetection;
        this.bruteForceProtection = $.bruteForceProtection;
        this.suspiciousIpThrottling = $.suspiciousIpThrottling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttackProtectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttackProtectionState $;

        public Builder() {
            $ = new AttackProtectionState();
        }

        public Builder(AttackProtectionState defaults) {
            $ = new AttackProtectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param breachedPasswordDetection Breached password detection protects your applications from bad actors logging in with stolen credentials.
         * 
         * @return builder
         * 
         */
        public Builder breachedPasswordDetection(@Nullable Output<AttackProtectionBreachedPasswordDetectionArgs> breachedPasswordDetection) {
            $.breachedPasswordDetection = breachedPasswordDetection;
            return this;
        }

        /**
         * @param breachedPasswordDetection Breached password detection protects your applications from bad actors logging in with stolen credentials.
         * 
         * @return builder
         * 
         */
        public Builder breachedPasswordDetection(AttackProtectionBreachedPasswordDetectionArgs breachedPasswordDetection) {
            return breachedPasswordDetection(Output.of(breachedPasswordDetection));
        }

        /**
         * @param bruteForceProtection Brute-force protection safeguards against a single IP address attacking a single user account.
         * 
         * @return builder
         * 
         */
        public Builder bruteForceProtection(@Nullable Output<AttackProtectionBruteForceProtectionArgs> bruteForceProtection) {
            $.bruteForceProtection = bruteForceProtection;
            return this;
        }

        /**
         * @param bruteForceProtection Brute-force protection safeguards against a single IP address attacking a single user account.
         * 
         * @return builder
         * 
         */
        public Builder bruteForceProtection(AttackProtectionBruteForceProtectionArgs bruteForceProtection) {
            return bruteForceProtection(Output.of(bruteForceProtection));
        }

        /**
         * @param suspiciousIpThrottling Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
         * 
         * @return builder
         * 
         */
        public Builder suspiciousIpThrottling(@Nullable Output<AttackProtectionSuspiciousIpThrottlingArgs> suspiciousIpThrottling) {
            $.suspiciousIpThrottling = suspiciousIpThrottling;
            return this;
        }

        /**
         * @param suspiciousIpThrottling Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
         * 
         * @return builder
         * 
         */
        public Builder suspiciousIpThrottling(AttackProtectionSuspiciousIpThrottlingArgs suspiciousIpThrottling) {
            return suspiciousIpThrottling(Output.of(suspiciousIpThrottling));
        }

        public AttackProtectionState build() {
            return $;
        }
    }

}
