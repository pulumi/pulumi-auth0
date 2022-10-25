// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.ActionDependencyArgs;
import com.pulumi.auth0.inputs.ActionSecretArgs;
import com.pulumi.auth0.inputs.ActionSupportedTriggersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionArgs Empty = new ActionArgs();

    /**
     * The source code of the action.
     * 
     */
    @Import(name="code", required=true)
    private Output<String> code;

    /**
     * @return The source code of the action.
     * 
     */
    public Output<String> code() {
        return this.code;
    }

    /**
     * List of third party npm modules, and their versions, that this action depends on.
     * 
     */
    @Import(name="dependencies")
    private @Nullable Output<List<ActionDependencyArgs>> dependencies;

    /**
     * @return List of third party npm modules, and their versions, that this action depends on.
     * 
     */
    public Optional<Output<List<ActionDependencyArgs>>> dependencies() {
        return Optional.ofNullable(this.dependencies);
    }

    /**
     * Deploying an action will create a new immutable version of the action.
     * If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
     * action immediately. Default is `false`.
     * 
     */
    @Import(name="deploy")
    private @Nullable Output<Boolean> deploy;

    /**
     * @return Deploying an action will create a new immutable version of the action.
     * If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
     * action immediately. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> deploy() {
        return Optional.ofNullable(this.deploy);
    }

    /**
     * Secret name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Secret name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Node runtime. For example `node16`, defaults to `node12`.
     * 
     */
    @Import(name="runtime")
    private @Nullable Output<String> runtime;

    /**
     * @return The Node runtime. For example `node16`, defaults to `node12`.
     * 
     */
    public Optional<Output<String>> runtime() {
        return Optional.ofNullable(this.runtime);
    }

    /**
     * List of secrets that are included in an action or a version of an action.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<ActionSecretArgs>> secrets;

    /**
     * @return List of secrets that are included in an action or a version of an action.
     * 
     */
    public Optional<Output<List<ActionSecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * List of triggers that this action supports. At this time, an action can only target
     * a single trigger at a time.
     * 
     */
    @Import(name="supportedTriggers", required=true)
    private Output<ActionSupportedTriggersArgs> supportedTriggers;

    /**
     * @return List of triggers that this action supports. At this time, an action can only target
     * a single trigger at a time.
     * 
     */
    public Output<ActionSupportedTriggersArgs> supportedTriggers() {
        return this.supportedTriggers;
    }

    private ActionArgs() {}

    private ActionArgs(ActionArgs $) {
        this.code = $.code;
        this.dependencies = $.dependencies;
        this.deploy = $.deploy;
        this.name = $.name;
        this.runtime = $.runtime;
        this.secrets = $.secrets;
        this.supportedTriggers = $.supportedTriggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionArgs $;

        public Builder() {
            $ = new ActionArgs();
        }

        public Builder(ActionArgs defaults) {
            $ = new ActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The source code of the action.
         * 
         * @return builder
         * 
         */
        public Builder code(Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The source code of the action.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param dependencies List of third party npm modules, and their versions, that this action depends on.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(@Nullable Output<List<ActionDependencyArgs>> dependencies) {
            $.dependencies = dependencies;
            return this;
        }

        /**
         * @param dependencies List of third party npm modules, and their versions, that this action depends on.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(List<ActionDependencyArgs> dependencies) {
            return dependencies(Output.of(dependencies));
        }

        /**
         * @param dependencies List of third party npm modules, and their versions, that this action depends on.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(ActionDependencyArgs... dependencies) {
            return dependencies(List.of(dependencies));
        }

        /**
         * @param deploy Deploying an action will create a new immutable version of the action.
         * If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
         * action immediately. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder deploy(@Nullable Output<Boolean> deploy) {
            $.deploy = deploy;
            return this;
        }

        /**
         * @param deploy Deploying an action will create a new immutable version of the action.
         * If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the
         * action immediately. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder deploy(Boolean deploy) {
            return deploy(Output.of(deploy));
        }

        /**
         * @param name Secret name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Secret name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runtime The Node runtime. For example `node16`, defaults to `node12`.
         * 
         * @return builder
         * 
         */
        public Builder runtime(@Nullable Output<String> runtime) {
            $.runtime = runtime;
            return this;
        }

        /**
         * @param runtime The Node runtime. For example `node16`, defaults to `node12`.
         * 
         * @return builder
         * 
         */
        public Builder runtime(String runtime) {
            return runtime(Output.of(runtime));
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<List<ActionSecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action.
         * 
         * @return builder
         * 
         */
        public Builder secrets(List<ActionSecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action.
         * 
         * @return builder
         * 
         */
        public Builder secrets(ActionSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        /**
         * @param supportedTriggers List of triggers that this action supports. At this time, an action can only target
         * a single trigger at a time.
         * 
         * @return builder
         * 
         */
        public Builder supportedTriggers(Output<ActionSupportedTriggersArgs> supportedTriggers) {
            $.supportedTriggers = supportedTriggers;
            return this;
        }

        /**
         * @param supportedTriggers List of triggers that this action supports. At this time, an action can only target
         * a single trigger at a time.
         * 
         * @return builder
         * 
         */
        public Builder supportedTriggers(ActionSupportedTriggersArgs supportedTriggers) {
            return supportedTriggers(Output.of(supportedTriggers));
        }

        public ActionArgs build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.supportedTriggers = Objects.requireNonNull($.supportedTriggers, "expected parameter 'supportedTriggers' to be non-null");
            return $;
        }
    }

}