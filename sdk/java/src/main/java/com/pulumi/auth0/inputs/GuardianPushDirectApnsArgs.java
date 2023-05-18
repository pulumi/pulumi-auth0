// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuardianPushDirectApnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianPushDirectApnsArgs Empty = new GuardianPushDirectApnsArgs();

    @Import(name="bundleId", required=true)
    private Output<String> bundleId;

    public Output<String> bundleId() {
        return this.bundleId;
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="p12", required=true)
    private Output<String> p12;

    public Output<String> p12() {
        return this.p12;
    }

    @Import(name="sandbox", required=true)
    private Output<Boolean> sandbox;

    public Output<Boolean> sandbox() {
        return this.sandbox;
    }

    private GuardianPushDirectApnsArgs() {}

    private GuardianPushDirectApnsArgs(GuardianPushDirectApnsArgs $) {
        this.bundleId = $.bundleId;
        this.enabled = $.enabled;
        this.p12 = $.p12;
        this.sandbox = $.sandbox;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianPushDirectApnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianPushDirectApnsArgs $;

        public Builder() {
            $ = new GuardianPushDirectApnsArgs();
        }

        public Builder(GuardianPushDirectApnsArgs defaults) {
            $ = new GuardianPushDirectApnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder bundleId(Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder p12(Output<String> p12) {
            $.p12 = p12;
            return this;
        }

        public Builder p12(String p12) {
            return p12(Output.of(p12));
        }

        public Builder sandbox(Output<Boolean> sandbox) {
            $.sandbox = sandbox;
            return this;
        }

        public Builder sandbox(Boolean sandbox) {
            return sandbox(Output.of(sandbox));
        }

        public GuardianPushDirectApnsArgs build() {
            $.bundleId = Objects.requireNonNull($.bundleId, "expected parameter 'bundleId' to be non-null");
            $.p12 = Objects.requireNonNull($.p12, "expected parameter 'p12' to be non-null");
            $.sandbox = Objects.requireNonNull($.sandbox, "expected parameter 'sandbox' to be non-null");
            return $;
        }
    }

}