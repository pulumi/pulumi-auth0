// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.NetworkAclRuleActionArgs;
import com.pulumi.auth0.inputs.NetworkAclRuleMatchArgs;
import com.pulumi.auth0.inputs.NetworkAclRuleNotMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclRuleArgs Empty = new NetworkAclRuleArgs();

    /**
     * The action configuration for the Network ACL Rule. Only one action type (block, allow, log, or redirect) should be specified.
     * 
     */
    @Import(name="action", required=true)
    private Output<NetworkAclRuleActionArgs> action;

    /**
     * @return The action configuration for the Network ACL Rule. Only one action type (block, allow, log, or redirect) should be specified.
     * 
     */
    public Output<NetworkAclRuleActionArgs> action() {
        return this.action;
    }

    /**
     * The configuration for the Network ACL Rule
     * 
     */
    @Import(name="match")
    private @Nullable Output<NetworkAclRuleMatchArgs> match;

    /**
     * @return The configuration for the Network ACL Rule
     * 
     */
    public Optional<Output<NetworkAclRuleMatchArgs>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * The configuration for the Network ACL Rule
     * 
     */
    @Import(name="notMatch")
    private @Nullable Output<NetworkAclRuleNotMatchArgs> notMatch;

    /**
     * @return The configuration for the Network ACL Rule
     * 
     */
    public Optional<Output<NetworkAclRuleNotMatchArgs>> notMatch() {
        return Optional.ofNullable(this.notMatch);
    }

    /**
     * The scope of the Network ACL Rule
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of the Network ACL Rule
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private NetworkAclRuleArgs() {}

    private NetworkAclRuleArgs(NetworkAclRuleArgs $) {
        this.action = $.action;
        this.match = $.match;
        this.notMatch = $.notMatch;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclRuleArgs $;

        public Builder() {
            $ = new NetworkAclRuleArgs();
        }

        public Builder(NetworkAclRuleArgs defaults) {
            $ = new NetworkAclRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action configuration for the Network ACL Rule. Only one action type (block, allow, log, or redirect) should be specified.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<NetworkAclRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action configuration for the Network ACL Rule. Only one action type (block, allow, log, or redirect) should be specified.
         * 
         * @return builder
         * 
         */
        public Builder action(NetworkAclRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param match The configuration for the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<NetworkAclRuleMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match The configuration for the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder match(NetworkAclRuleMatchArgs match) {
            return match(Output.of(match));
        }

        /**
         * @param notMatch The configuration for the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder notMatch(@Nullable Output<NetworkAclRuleNotMatchArgs> notMatch) {
            $.notMatch = notMatch;
            return this;
        }

        /**
         * @param notMatch The configuration for the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder notMatch(NetworkAclRuleNotMatchArgs notMatch) {
            return notMatch(Output.of(notMatch));
        }

        /**
         * @param scope The scope of the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the Network ACL Rule
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public NetworkAclRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("NetworkAclRuleArgs", "action");
            }
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("NetworkAclRuleArgs", "scope");
            }
            return $;
        }
    }

}
