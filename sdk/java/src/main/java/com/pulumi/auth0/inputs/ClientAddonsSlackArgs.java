// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSlackArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSlackArgs Empty = new ClientAddonsSlackArgs();

    @Import(name="team")
    private @Nullable Output<String> team;

    public Optional<Output<String>> team() {
        return Optional.ofNullable(this.team);
    }

    private ClientAddonsSlackArgs() {}

    private ClientAddonsSlackArgs(ClientAddonsSlackArgs $) {
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSlackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSlackArgs $;

        public Builder() {
            $ = new ClientAddonsSlackArgs();
        }

        public Builder(ClientAddonsSlackArgs defaults) {
            $ = new ClientAddonsSlackArgs(Objects.requireNonNull(defaults));
        }

        public Builder team(@Nullable Output<String> team) {
            $.team = team;
            return this;
        }

        public Builder team(String team) {
            return team(Output.of(team));
        }

        public ClientAddonsSlackArgs build() {
            return $;
        }
    }

}