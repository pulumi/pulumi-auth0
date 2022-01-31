# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ActionArgs', 'Action']

@pulumi.input_type
class ActionArgs:
    def __init__(__self__, *,
                 code: pulumi.Input[str],
                 supported_triggers: pulumi.Input['ActionSupportedTriggersArgs'],
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]] = None,
                 deploy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]] = None):
        """
        The set of arguments for constructing a Action resource.
        :param pulumi.Input[str] code: The source code of the action.
        :param pulumi.Input['ActionSupportedTriggersArgs'] supported_triggers: List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        :param pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]] dependencies: List of third party npm modules, and their versions, that this action depends on
        :param pulumi.Input[bool] deploy: Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        :param pulumi.Input[str] name: Secret name.
        :param pulumi.Input[str] runtime: The Node runtime. For example `node16`, defaults to `node12`
        :param pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]] secrets: List of secrets that are included in an action or a version of an action
        """
        pulumi.set(__self__, "code", code)
        pulumi.set(__self__, "supported_triggers", supported_triggers)
        if dependencies is not None:
            pulumi.set(__self__, "dependencies", dependencies)
        if deploy is not None:
            pulumi.set(__self__, "deploy", deploy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runtime is not None:
            pulumi.set(__self__, "runtime", runtime)
        if secrets is not None:
            pulumi.set(__self__, "secrets", secrets)

    @property
    @pulumi.getter
    def code(self) -> pulumi.Input[str]:
        """
        The source code of the action.
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: pulumi.Input[str]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter(name="supportedTriggers")
    def supported_triggers(self) -> pulumi.Input['ActionSupportedTriggersArgs']:
        """
        List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        """
        return pulumi.get(self, "supported_triggers")

    @supported_triggers.setter
    def supported_triggers(self, value: pulumi.Input['ActionSupportedTriggersArgs']):
        pulumi.set(self, "supported_triggers", value)

    @property
    @pulumi.getter
    def dependencies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]]:
        """
        List of third party npm modules, and their versions, that this action depends on
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]]):
        pulumi.set(self, "dependencies", value)

    @property
    @pulumi.getter
    def deploy(self) -> Optional[pulumi.Input[bool]]:
        """
        Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        """
        return pulumi.get(self, "deploy")

    @deploy.setter
    def deploy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deploy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Secret name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def runtime(self) -> Optional[pulumi.Input[str]]:
        """
        The Node runtime. For example `node16`, defaults to `node12`
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter
    def secrets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]]:
        """
        List of secrets that are included in an action or a version of an action
        """
        return pulumi.get(self, "secrets")

    @secrets.setter
    def secrets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]]):
        pulumi.set(self, "secrets", value)


@pulumi.input_type
class _ActionState:
    def __init__(__self__, *,
                 code: Optional[pulumi.Input[str]] = None,
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]] = None,
                 deploy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]] = None,
                 supported_triggers: Optional[pulumi.Input['ActionSupportedTriggersArgs']] = None,
                 version_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Action resources.
        :param pulumi.Input[str] code: The source code of the action.
        :param pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]] dependencies: List of third party npm modules, and their versions, that this action depends on
        :param pulumi.Input[bool] deploy: Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        :param pulumi.Input[str] name: Secret name.
        :param pulumi.Input[str] runtime: The Node runtime. For example `node16`, defaults to `node12`
        :param pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]] secrets: List of secrets that are included in an action or a version of an action
        :param pulumi.Input['ActionSupportedTriggersArgs'] supported_triggers: List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        :param pulumi.Input[str] version_id: Version ID of the action. This value is available if `deploy` is set to true
        """
        if code is not None:
            pulumi.set(__self__, "code", code)
        if dependencies is not None:
            pulumi.set(__self__, "dependencies", dependencies)
        if deploy is not None:
            pulumi.set(__self__, "deploy", deploy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runtime is not None:
            pulumi.set(__self__, "runtime", runtime)
        if secrets is not None:
            pulumi.set(__self__, "secrets", secrets)
        if supported_triggers is not None:
            pulumi.set(__self__, "supported_triggers", supported_triggers)
        if version_id is not None:
            pulumi.set(__self__, "version_id", version_id)

    @property
    @pulumi.getter
    def code(self) -> Optional[pulumi.Input[str]]:
        """
        The source code of the action.
        """
        return pulumi.get(self, "code")

    @code.setter
    def code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "code", value)

    @property
    @pulumi.getter
    def dependencies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]]:
        """
        List of third party npm modules, and their versions, that this action depends on
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ActionDependencyArgs']]]]):
        pulumi.set(self, "dependencies", value)

    @property
    @pulumi.getter
    def deploy(self) -> Optional[pulumi.Input[bool]]:
        """
        Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        """
        return pulumi.get(self, "deploy")

    @deploy.setter
    def deploy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deploy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Secret name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def runtime(self) -> Optional[pulumi.Input[str]]:
        """
        The Node runtime. For example `node16`, defaults to `node12`
        """
        return pulumi.get(self, "runtime")

    @runtime.setter
    def runtime(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime", value)

    @property
    @pulumi.getter
    def secrets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]]:
        """
        List of secrets that are included in an action or a version of an action
        """
        return pulumi.get(self, "secrets")

    @secrets.setter
    def secrets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ActionSecretArgs']]]]):
        pulumi.set(self, "secrets", value)

    @property
    @pulumi.getter(name="supportedTriggers")
    def supported_triggers(self) -> Optional[pulumi.Input['ActionSupportedTriggersArgs']]:
        """
        List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        """
        return pulumi.get(self, "supported_triggers")

    @supported_triggers.setter
    def supported_triggers(self, value: Optional[pulumi.Input['ActionSupportedTriggersArgs']]):
        pulumi.set(self, "supported_triggers", value)

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> Optional[pulumi.Input[str]]:
        """
        Version ID of the action. This value is available if `deploy` is set to true
        """
        return pulumi.get(self, "version_id")

    @version_id.setter
    def version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_id", value)


class Action(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionDependencyArgs']]]]] = None,
                 deploy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionSecretArgs']]]]] = None,
                 supported_triggers: Optional[pulumi.Input[pulumi.InputType['ActionSupportedTriggersArgs']]] = None,
                 __props__=None):
        """
        Actions are secure, tenant-specific, versioned functions written in Node.js that
        execute at certain points during the Auth0 runtime. Actions are used to
        customize and extend Auth0's capabilities with custom logic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_action = auth0.Action("myAction",
            code=\"\"\"/**
         * Handler that will be called during the execution of a PostLogin flow.
         *
         * @param {Event} event - Details about the user and the context in which they are logging in.
         * @param {PostLoginAPI} api - Interface whose methods can be used to change the behavior of the login.
         */
         exports.onExecutePostLogin = async (event, api) => {
        	 console.log(event)
         };

        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v2",
            ))
        ```

        ## Import

        An action can be imported using the action's ID, e.g.

        ```sh
         $ pulumi import auth0:index/action:Action example ...
        ```

         ~> For security reasons importing `secrets` is not allowed. Therefore it is advised to import the action without secrets and adding them back after the

        action has been imported.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] code: The source code of the action.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionDependencyArgs']]]] dependencies: List of third party npm modules, and their versions, that this action depends on
        :param pulumi.Input[bool] deploy: Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        :param pulumi.Input[str] name: Secret name.
        :param pulumi.Input[str] runtime: The Node runtime. For example `node16`, defaults to `node12`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionSecretArgs']]]] secrets: List of secrets that are included in an action or a version of an action
        :param pulumi.Input[pulumi.InputType['ActionSupportedTriggersArgs']] supported_triggers: List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Actions are secure, tenant-specific, versioned functions written in Node.js that
        execute at certain points during the Auth0 runtime. Actions are used to
        customize and extend Auth0's capabilities with custom logic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_action = auth0.Action("myAction",
            code=\"\"\"/**
         * Handler that will be called during the execution of a PostLogin flow.
         *
         * @param {Event} event - Details about the user and the context in which they are logging in.
         * @param {PostLoginAPI} api - Interface whose methods can be used to change the behavior of the login.
         */
         exports.onExecutePostLogin = async (event, api) => {
        	 console.log(event)
         };

        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v2",
            ))
        ```

        ## Import

        An action can be imported using the action's ID, e.g.

        ```sh
         $ pulumi import auth0:index/action:Action example ...
        ```

         ~> For security reasons importing `secrets` is not allowed. Therefore it is advised to import the action without secrets and adding them back after the

        action has been imported.

        :param str resource_name: The name of the resource.
        :param ActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 code: Optional[pulumi.Input[str]] = None,
                 dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionDependencyArgs']]]]] = None,
                 deploy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runtime: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionSecretArgs']]]]] = None,
                 supported_triggers: Optional[pulumi.Input[pulumi.InputType['ActionSupportedTriggersArgs']]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ActionArgs.__new__(ActionArgs)

            if code is None and not opts.urn:
                raise TypeError("Missing required property 'code'")
            __props__.__dict__["code"] = code
            __props__.__dict__["dependencies"] = dependencies
            __props__.__dict__["deploy"] = deploy
            __props__.__dict__["name"] = name
            __props__.__dict__["runtime"] = runtime
            __props__.__dict__["secrets"] = secrets
            if supported_triggers is None and not opts.urn:
                raise TypeError("Missing required property 'supported_triggers'")
            __props__.__dict__["supported_triggers"] = supported_triggers
            __props__.__dict__["version_id"] = None
        super(Action, __self__).__init__(
            'auth0:index/action:Action',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            code: Optional[pulumi.Input[str]] = None,
            dependencies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionDependencyArgs']]]]] = None,
            deploy: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            runtime: Optional[pulumi.Input[str]] = None,
            secrets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionSecretArgs']]]]] = None,
            supported_triggers: Optional[pulumi.Input[pulumi.InputType['ActionSupportedTriggersArgs']]] = None,
            version_id: Optional[pulumi.Input[str]] = None) -> 'Action':
        """
        Get an existing Action resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] code: The source code of the action.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionDependencyArgs']]]] dependencies: List of third party npm modules, and their versions, that this action depends on
        :param pulumi.Input[bool] deploy: Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        :param pulumi.Input[str] name: Secret name.
        :param pulumi.Input[str] runtime: The Node runtime. For example `node16`, defaults to `node12`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ActionSecretArgs']]]] secrets: List of secrets that are included in an action or a version of an action
        :param pulumi.Input[pulumi.InputType['ActionSupportedTriggersArgs']] supported_triggers: List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        :param pulumi.Input[str] version_id: Version ID of the action. This value is available if `deploy` is set to true
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ActionState.__new__(_ActionState)

        __props__.__dict__["code"] = code
        __props__.__dict__["dependencies"] = dependencies
        __props__.__dict__["deploy"] = deploy
        __props__.__dict__["name"] = name
        __props__.__dict__["runtime"] = runtime
        __props__.__dict__["secrets"] = secrets
        __props__.__dict__["supported_triggers"] = supported_triggers
        __props__.__dict__["version_id"] = version_id
        return Action(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def code(self) -> pulumi.Output[str]:
        """
        The source code of the action.
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def dependencies(self) -> pulumi.Output[Optional[Sequence['outputs.ActionDependency']]]:
        """
        List of third party npm modules, and their versions, that this action depends on
        """
        return pulumi.get(self, "dependencies")

    @property
    @pulumi.getter
    def deploy(self) -> pulumi.Output[Optional[bool]]:
        """
        Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately. Default is `false`.
        """
        return pulumi.get(self, "deploy")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Secret name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def runtime(self) -> pulumi.Output[str]:
        """
        The Node runtime. For example `node16`, defaults to `node12`
        """
        return pulumi.get(self, "runtime")

    @property
    @pulumi.getter
    def secrets(self) -> pulumi.Output[Optional[Sequence['outputs.ActionSecret']]]:
        """
        List of secrets that are included in an action or a version of an action
        """
        return pulumi.get(self, "secrets")

    @property
    @pulumi.getter(name="supportedTriggers")
    def supported_triggers(self) -> pulumi.Output['outputs.ActionSupportedTriggers']:
        """
        List of triggers that this action supports. At this time, an action can only target a single trigger at a time
        """
        return pulumi.get(self, "supported_triggers")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> pulumi.Output[str]:
        """
        Version ID of the action. This value is available if `deploy` is set to true
        """
        return pulumi.get(self, "version_id")
