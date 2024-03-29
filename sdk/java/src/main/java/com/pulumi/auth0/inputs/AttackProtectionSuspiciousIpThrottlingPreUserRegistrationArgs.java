// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs Empty = new AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs();

    /**
     * Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
     * 
     */
    @Import(name="maxAttempts")
    private @Nullable Output<Integer> maxAttempts;

    /**
     * @return Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
     * 
     */
    public Optional<Output<Integer>> maxAttempts() {
        return Optional.ofNullable(this.maxAttempts);
    }

    /**
     * Interval of time, given in milliseconds at which new login tokens will become available after they have been used by an IP address. Each login attempt will be added on the defined throttling rate.
     * 
     */
    @Import(name="rate")
    private @Nullable Output<Integer> rate;

    /**
     * @return Interval of time, given in milliseconds at which new login tokens will become available after they have been used by an IP address. Each login attempt will be added on the defined throttling rate.
     * 
     */
    public Optional<Output<Integer>> rate() {
        return Optional.ofNullable(this.rate);
    }

    private AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs() {}

    private AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs(AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs $) {
        this.maxAttempts = $.maxAttempts;
        this.rate = $.rate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs $;

        public Builder() {
            $ = new AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs();
        }

        public Builder(AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs defaults) {
            $ = new AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxAttempts Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(@Nullable Output<Integer> maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * @param maxAttempts Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(Integer maxAttempts) {
            return maxAttempts(Output.of(maxAttempts));
        }

        /**
         * @param rate Interval of time, given in milliseconds at which new login tokens will become available after they have been used by an IP address. Each login attempt will be added on the defined throttling rate.
         * 
         * @return builder
         * 
         */
        public Builder rate(@Nullable Output<Integer> rate) {
            $.rate = rate;
            return this;
        }

        /**
         * @param rate Interval of time, given in milliseconds at which new login tokens will become available after they have been used by an IP address. Each login attempt will be added on the defined throttling rate.
         * 
         * @return builder
         * 
         */
        public Builder rate(Integer rate) {
            return rate(Output.of(rate));
        }

        public AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs build() {
            return $;
        }
    }

}
