// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleArgs Empty = new GetRoleArgs();

    /**
     * The name of the role. If not provided, `role_id` must be set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role. If not provided, `role_id` must be set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the role. If not provided, `name` must be set.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return The ID of the role. If not provided, `name` must be set.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    private GetRoleArgs() {}

    private GetRoleArgs(GetRoleArgs $) {
        this.name = $.name;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleArgs $;

        public Builder() {
            $ = new GetRoleArgs();
        }

        public Builder(GetRoleArgs defaults) {
            $ = new GetRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the role. If not provided, `role_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role. If not provided, `role_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleId The ID of the role. If not provided, `name` must be set.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId The ID of the role. If not provided, `name` must be set.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public GetRoleArgs build() {
            return $;
        }
    }

}
