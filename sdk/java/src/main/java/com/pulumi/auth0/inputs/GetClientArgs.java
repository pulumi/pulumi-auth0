// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientArgs Empty = new GetClientArgs();

    /**
     * The ID of the client. If not provided, `name` must be set.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The ID of the client. If not provided, `name` must be set.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The name of the client. If not provided, `client_id` must be set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the client. If not provided, `client_id` must be set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetClientArgs() {}

    private GetClientArgs(GetClientArgs $) {
        this.clientId = $.clientId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientArgs $;

        public Builder() {
            $ = new GetClientArgs();
        }

        public Builder(GetClientArgs defaults) {
            $ = new GetClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The ID of the client. If not provided, `name` must be set.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The ID of the client. If not provided, `name` must be set.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param name The name of the client. If not provided, `client_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the client. If not provided, `client_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetClientArgs build() {
            return $;
        }
    }

}
