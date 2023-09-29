// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsAwsArgs Empty = new ClientAddonsAwsArgs();

    @Import(name="lifetimeInSeconds")
    private @Nullable Output<Integer> lifetimeInSeconds;

    public Optional<Output<Integer>> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }

    @Import(name="principal")
    private @Nullable Output<String> principal;

    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ClientAddonsAwsArgs() {}

    private ClientAddonsAwsArgs(ClientAddonsAwsArgs $) {
        this.lifetimeInSeconds = $.lifetimeInSeconds;
        this.principal = $.principal;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsAwsArgs $;

        public Builder() {
            $ = new ClientAddonsAwsArgs();
        }

        public Builder(ClientAddonsAwsArgs defaults) {
            $ = new ClientAddonsAwsArgs(Objects.requireNonNull(defaults));
        }

        public Builder lifetimeInSeconds(@Nullable Output<Integer> lifetimeInSeconds) {
            $.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }

        public Builder lifetimeInSeconds(Integer lifetimeInSeconds) {
            return lifetimeInSeconds(Output.of(lifetimeInSeconds));
        }

        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ClientAddonsAwsArgs build() {
            return $;
        }
    }

}