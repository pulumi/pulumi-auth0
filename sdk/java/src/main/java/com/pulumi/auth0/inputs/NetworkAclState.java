// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.NetworkAclRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclState Empty = new NetworkAclState();

    /**
     * Whether the Network ACL is active
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Whether the Network ACL is active
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The description of the Network ACL
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Network ACL
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The priority of the Network ACL. Must be unique between 1 and 10.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the Network ACL. Must be unique between 1 and 10.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The rule of the Network ACL
     * 
     */
    @Import(name="rule")
    private @Nullable Output<NetworkAclRuleArgs> rule;

    /**
     * @return The rule of the Network ACL
     * 
     */
    public Optional<Output<NetworkAclRuleArgs>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private NetworkAclState() {}

    private NetworkAclState(NetworkAclState $) {
        this.active = $.active;
        this.description = $.description;
        this.priority = $.priority;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclState $;

        public Builder() {
            $ = new NetworkAclState();
        }

        public Builder(NetworkAclState defaults) {
            $ = new NetworkAclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether the Network ACL is active
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether the Network ACL is active
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param description The description of the Network ACL
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Network ACL
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param priority The priority of the Network ACL. Must be unique between 1 and 10.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the Network ACL. Must be unique between 1 and 10.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rule The rule of the Network ACL
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<NetworkAclRuleArgs> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule The rule of the Network ACL
         * 
         * @return builder
         * 
         */
        public Builder rule(NetworkAclRuleArgs rule) {
            return rule(Output.of(rule));
        }

        public NetworkAclState build() {
            return $;
        }
    }

}
