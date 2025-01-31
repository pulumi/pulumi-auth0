// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

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


public final class ActionState extends com.pulumi.resources.ResourceArgs {

    public static final ActionState Empty = new ActionState();

    /**
     * The source code of the action.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return The source code of the action.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
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
     * Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     * 
     */
    @Import(name="deploy")
    private @Nullable Output<Boolean> deploy;

    /**
     * @return Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     * 
     */
    public Optional<Output<Boolean>> deploy() {
        return Optional.ofNullable(this.deploy);
    }

    /**
     * The name of the action.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the action.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
     * 
     */
    @Import(name="runtime")
    private @Nullable Output<String> runtime;

    /**
     * @return The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
     * 
     */
    public Optional<Output<String>> runtime() {
        return Optional.ofNullable(this.runtime);
    }

    /**
     * List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<ActionSecretArgs>> secrets;

    /**
     * @return List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
     * 
     */
    public Optional<Output<List<ActionSecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     * 
     */
    @Import(name="supportedTriggers")
    private @Nullable Output<ActionSupportedTriggersArgs> supportedTriggers;

    /**
     * @return List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     * 
     */
    public Optional<Output<ActionSupportedTriggersArgs>> supportedTriggers() {
        return Optional.ofNullable(this.supportedTriggers);
    }

    /**
     * Version ID of the action. This value is available if `deploy` is set to true.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return Version ID of the action. This value is available if `deploy` is set to true.
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private ActionState() {}

    private ActionState(ActionState $) {
        this.code = $.code;
        this.dependencies = $.dependencies;
        this.deploy = $.deploy;
        this.name = $.name;
        this.runtime = $.runtime;
        this.secrets = $.secrets;
        this.supportedTriggers = $.supportedTriggers;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionState $;

        public Builder() {
            $ = new ActionState();
        }

        public Builder(ActionState defaults) {
            $ = new ActionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The source code of the action.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
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
         * @param deploy Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
         * 
         * @return builder
         * 
         */
        public Builder deploy(@Nullable Output<Boolean> deploy) {
            $.deploy = deploy;
            return this;
        }

        /**
         * @param deploy Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
         * 
         * @return builder
         * 
         */
        public Builder deploy(Boolean deploy) {
            return deploy(Output.of(deploy));
        }

        /**
         * @param name The name of the action.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the action.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runtime The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
         * 
         * @return builder
         * 
         */
        public Builder runtime(@Nullable Output<String> runtime) {
            $.runtime = runtime;
            return this;
        }

        /**
         * @param runtime The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
         * 
         * @return builder
         * 
         */
        public Builder runtime(String runtime) {
            return runtime(Output.of(runtime));
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<List<ActionSecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
         * 
         * @return builder
         * 
         */
        public Builder secrets(List<ActionSecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param secrets List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
         * 
         * @return builder
         * 
         */
        public Builder secrets(ActionSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        /**
         * @param supportedTriggers List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
         * 
         * @return builder
         * 
         */
        public Builder supportedTriggers(@Nullable Output<ActionSupportedTriggersArgs> supportedTriggers) {
            $.supportedTriggers = supportedTriggers;
            return this;
        }

        /**
         * @param supportedTriggers List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
         * 
         * @return builder
         * 
         */
        public Builder supportedTriggers(ActionSupportedTriggersArgs supportedTriggers) {
            return supportedTriggers(Output.of(supportedTriggers));
        }

        /**
         * @param versionId Version ID of the action. This value is available if `deploy` is set to true.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Version ID of the action. This value is available if `deploy` is set to true.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public ActionState build() {
            return $;
        }
    }

}
