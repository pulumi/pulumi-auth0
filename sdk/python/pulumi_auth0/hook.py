# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['HookArgs', 'Hook']

@pulumi.input_type
class HookArgs:
    def __init__(__self__, *,
                 script: pulumi.Input[str],
                 trigger_id: pulumi.Input[str],
                 dependencies: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a Hook resource.
        :param pulumi.Input[str] script: Code to be executed when this hook runs.
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        :param pulumi.Input[Mapping[str, Any]] dependencies: Dependencies of this hook used by the WebTask server.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled.
        :param pulumi.Input[str] name: Name of this hook.
        :param pulumi.Input[Mapping[str, Any]] secrets: The secrets associated with the hook.
        """
        pulumi.set(__self__, "script", script)
        pulumi.set(__self__, "trigger_id", trigger_id)
        if dependencies is not None:
            pulumi.set(__self__, "dependencies", dependencies)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secrets is not None:
            pulumi.set(__self__, "secrets", secrets)

    @property
    @pulumi.getter
    def script(self) -> pulumi.Input[str]:
        """
        Code to be executed when this hook runs.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: pulumi.Input[str]):
        pulumi.set(self, "script", value)

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> pulumi.Input[str]:
        """
        Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        return pulumi.get(self, "trigger_id")

    @trigger_id.setter
    def trigger_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "trigger_id", value)

    @property
    @pulumi.getter
    def dependencies(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Dependencies of this hook used by the WebTask server.
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "dependencies", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the hook is enabled, or disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of this hook.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secrets(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The secrets associated with the hook.
        """
        return pulumi.get(self, "secrets")

    @secrets.setter
    def secrets(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "secrets", value)


@pulumi.input_type
class _HookState:
    def __init__(__self__, *,
                 dependencies: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 trigger_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Hook resources.
        :param pulumi.Input[Mapping[str, Any]] dependencies: Dependencies of this hook used by the WebTask server.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled.
        :param pulumi.Input[str] name: Name of this hook.
        :param pulumi.Input[str] script: Code to be executed when this hook runs.
        :param pulumi.Input[Mapping[str, Any]] secrets: The secrets associated with the hook.
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        if dependencies is not None:
            pulumi.set(__self__, "dependencies", dependencies)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if script is not None:
            pulumi.set(__self__, "script", script)
        if secrets is not None:
            pulumi.set(__self__, "secrets", secrets)
        if trigger_id is not None:
            pulumi.set(__self__, "trigger_id", trigger_id)

    @property
    @pulumi.getter
    def dependencies(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Dependencies of this hook used by the WebTask server.
        """
        return pulumi.get(self, "dependencies")

    @dependencies.setter
    def dependencies(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "dependencies", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the hook is enabled, or disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of this hook.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def script(self) -> Optional[pulumi.Input[str]]:
        """
        Code to be executed when this hook runs.
        """
        return pulumi.get(self, "script")

    @script.setter
    def script(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script", value)

    @property
    @pulumi.getter
    def secrets(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The secrets associated with the hook.
        """
        return pulumi.get(self, "secrets")

    @secrets.setter
    def secrets(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "secrets", value)

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> Optional[pulumi.Input[str]]:
        """
        Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        return pulumi.get(self, "trigger_id")

    @trigger_id.setter
    def trigger_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trigger_id", value)


class Hook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dependencies: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 trigger_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use hooks with Database Connections and/or Passwordless Connections.

        !> This resource is deprecated. Refer to the [guide on how to migrate from hooks to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-hooks-to-actions) and manage your actions using the `Action` resource.

        !> This resource is deprecated. Refer to the [guide on how to migrate from rules to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-rules-to-actions)
        and manage your actions using the `Action` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_hook = auth0.Hook("myHook",
            dependencies={
                "auth0": "2.30.0",
            },
            enabled=True,
            script=\"\"\"    function (user, context, callback) {
              callback(null, { user });
            }
          
        \"\"\",
            secrets={
                "foo": "bar",
            },
            trigger_id="pre-user-registration")
        ```

        ## Import

        A hook can be imported using the hook's ID. # Example

        ```sh
         $ pulumi import auth0:index/hook:Hook my_hook 00001
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] dependencies: Dependencies of this hook used by the WebTask server.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled.
        :param pulumi.Input[str] name: Name of this hook.
        :param pulumi.Input[str] script: Code to be executed when this hook runs.
        :param pulumi.Input[Mapping[str, Any]] secrets: The secrets associated with the hook.
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use hooks with Database Connections and/or Passwordless Connections.

        !> This resource is deprecated. Refer to the [guide on how to migrate from hooks to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-hooks-to-actions) and manage your actions using the `Action` resource.

        !> This resource is deprecated. Refer to the [guide on how to migrate from rules to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-rules-to-actions)
        and manage your actions using the `Action` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_hook = auth0.Hook("myHook",
            dependencies={
                "auth0": "2.30.0",
            },
            enabled=True,
            script=\"\"\"    function (user, context, callback) {
              callback(null, { user });
            }
          
        \"\"\",
            secrets={
                "foo": "bar",
            },
            trigger_id="pre-user-registration")
        ```

        ## Import

        A hook can be imported using the hook's ID. # Example

        ```sh
         $ pulumi import auth0:index/hook:Hook my_hook 00001
        ```

        :param str resource_name: The name of the resource.
        :param HookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dependencies: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 script: Optional[pulumi.Input[str]] = None,
                 secrets: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 trigger_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HookArgs.__new__(HookArgs)

            __props__.__dict__["dependencies"] = dependencies
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            if script is None and not opts.urn:
                raise TypeError("Missing required property 'script'")
            __props__.__dict__["script"] = script
            __props__.__dict__["secrets"] = None if secrets is None else pulumi.Output.secret(secrets)
            if trigger_id is None and not opts.urn:
                raise TypeError("Missing required property 'trigger_id'")
            __props__.__dict__["trigger_id"] = trigger_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secrets"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Hook, __self__).__init__(
            'auth0:index/hook:Hook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dependencies: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            script: Optional[pulumi.Input[str]] = None,
            secrets: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            trigger_id: Optional[pulumi.Input[str]] = None) -> 'Hook':
        """
        Get an existing Hook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, Any]] dependencies: Dependencies of this hook used by the WebTask server.
        :param pulumi.Input[bool] enabled: Whether the hook is enabled, or disabled.
        :param pulumi.Input[str] name: Name of this hook.
        :param pulumi.Input[str] script: Code to be executed when this hook runs.
        :param pulumi.Input[Mapping[str, Any]] secrets: The secrets associated with the hook.
        :param pulumi.Input[str] trigger_id: Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HookState.__new__(_HookState)

        __props__.__dict__["dependencies"] = dependencies
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["script"] = script
        __props__.__dict__["secrets"] = secrets
        __props__.__dict__["trigger_id"] = trigger_id
        return Hook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def dependencies(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Dependencies of this hook used by the WebTask server.
        """
        return pulumi.get(self, "dependencies")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the hook is enabled, or disabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of this hook.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def script(self) -> pulumi.Output[str]:
        """
        Code to be executed when this hook runs.
        """
        return pulumi.get(self, "script")

    @property
    @pulumi.getter
    def secrets(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The secrets associated with the hook.
        """
        return pulumi.get(self, "secrets")

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> pulumi.Output[str]:
        """
        Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
        """
        return pulumi.get(self, "trigger_id")

