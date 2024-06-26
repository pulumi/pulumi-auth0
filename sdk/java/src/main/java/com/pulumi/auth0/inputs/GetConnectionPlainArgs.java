// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionPlainArgs Empty = new GetConnectionPlainArgs();

    /**
     * The ID of the connection. If not provided, `name` must be set.
     * 
     */
    @Import(name="connectionId")
    private @Nullable String connectionId;

    /**
     * @return The ID of the connection. If not provided, `name` must be set.
     * 
     */
    public Optional<String> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * The name of the connection. If not provided, `connection_id` must be set.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the connection. If not provided, `connection_id` must be set.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetConnectionPlainArgs() {}

    private GetConnectionPlainArgs(GetConnectionPlainArgs $) {
        this.connectionId = $.connectionId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionPlainArgs $;

        public Builder() {
            $ = new GetConnectionPlainArgs();
        }

        public Builder(GetConnectionPlainArgs defaults) {
            $ = new GetConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId The ID of the connection. If not provided, `name` must be set.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable String connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param name The name of the connection. If not provided, `connection_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetConnectionPlainArgs build() {
            return $;
        }
    }

}
