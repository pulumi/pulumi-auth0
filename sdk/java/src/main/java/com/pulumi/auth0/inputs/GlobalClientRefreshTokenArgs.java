// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClientRefreshTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClientRefreshTokenArgs Empty = new GlobalClientRefreshTokenArgs();

    @Import(name="expirationType", required=true)
    private Output<String> expirationType;

    public Output<String> expirationType() {
        return this.expirationType;
    }

    @Import(name="idleTokenLifetime")
    private @Nullable Output<Integer> idleTokenLifetime;

    public Optional<Output<Integer>> idleTokenLifetime() {
        return Optional.ofNullable(this.idleTokenLifetime);
    }

    @Import(name="infiniteIdleTokenLifetime")
    private @Nullable Output<Boolean> infiniteIdleTokenLifetime;

    public Optional<Output<Boolean>> infiniteIdleTokenLifetime() {
        return Optional.ofNullable(this.infiniteIdleTokenLifetime);
    }

    @Import(name="infiniteTokenLifetime")
    private @Nullable Output<Boolean> infiniteTokenLifetime;

    public Optional<Output<Boolean>> infiniteTokenLifetime() {
        return Optional.ofNullable(this.infiniteTokenLifetime);
    }

    @Import(name="leeway")
    private @Nullable Output<Integer> leeway;

    public Optional<Output<Integer>> leeway() {
        return Optional.ofNullable(this.leeway);
    }

    @Import(name="rotationType", required=true)
    private Output<String> rotationType;

    public Output<String> rotationType() {
        return this.rotationType;
    }

    @Import(name="tokenLifetime")
    private @Nullable Output<Integer> tokenLifetime;

    public Optional<Output<Integer>> tokenLifetime() {
        return Optional.ofNullable(this.tokenLifetime);
    }

    private GlobalClientRefreshTokenArgs() {}

    private GlobalClientRefreshTokenArgs(GlobalClientRefreshTokenArgs $) {
        this.expirationType = $.expirationType;
        this.idleTokenLifetime = $.idleTokenLifetime;
        this.infiniteIdleTokenLifetime = $.infiniteIdleTokenLifetime;
        this.infiniteTokenLifetime = $.infiniteTokenLifetime;
        this.leeway = $.leeway;
        this.rotationType = $.rotationType;
        this.tokenLifetime = $.tokenLifetime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClientRefreshTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClientRefreshTokenArgs $;

        public Builder() {
            $ = new GlobalClientRefreshTokenArgs();
        }

        public Builder(GlobalClientRefreshTokenArgs defaults) {
            $ = new GlobalClientRefreshTokenArgs(Objects.requireNonNull(defaults));
        }

        public Builder expirationType(Output<String> expirationType) {
            $.expirationType = expirationType;
            return this;
        }

        public Builder expirationType(String expirationType) {
            return expirationType(Output.of(expirationType));
        }

        public Builder idleTokenLifetime(@Nullable Output<Integer> idleTokenLifetime) {
            $.idleTokenLifetime = idleTokenLifetime;
            return this;
        }

        public Builder idleTokenLifetime(Integer idleTokenLifetime) {
            return idleTokenLifetime(Output.of(idleTokenLifetime));
        }

        public Builder infiniteIdleTokenLifetime(@Nullable Output<Boolean> infiniteIdleTokenLifetime) {
            $.infiniteIdleTokenLifetime = infiniteIdleTokenLifetime;
            return this;
        }

        public Builder infiniteIdleTokenLifetime(Boolean infiniteIdleTokenLifetime) {
            return infiniteIdleTokenLifetime(Output.of(infiniteIdleTokenLifetime));
        }

        public Builder infiniteTokenLifetime(@Nullable Output<Boolean> infiniteTokenLifetime) {
            $.infiniteTokenLifetime = infiniteTokenLifetime;
            return this;
        }

        public Builder infiniteTokenLifetime(Boolean infiniteTokenLifetime) {
            return infiniteTokenLifetime(Output.of(infiniteTokenLifetime));
        }

        public Builder leeway(@Nullable Output<Integer> leeway) {
            $.leeway = leeway;
            return this;
        }

        public Builder leeway(Integer leeway) {
            return leeway(Output.of(leeway));
        }

        public Builder rotationType(Output<String> rotationType) {
            $.rotationType = rotationType;
            return this;
        }

        public Builder rotationType(String rotationType) {
            return rotationType(Output.of(rotationType));
        }

        public Builder tokenLifetime(@Nullable Output<Integer> tokenLifetime) {
            $.tokenLifetime = tokenLifetime;
            return this;
        }

        public Builder tokenLifetime(Integer tokenLifetime) {
            return tokenLifetime(Output.of(tokenLifetime));
        }

        public GlobalClientRefreshTokenArgs build() {
            $.expirationType = Objects.requireNonNull($.expirationType, "expected parameter 'expirationType' to be non-null");
            $.rotationType = Objects.requireNonNull($.rotationType, "expected parameter 'rotationType' to be non-null");
            return $;
        }
    }

}
