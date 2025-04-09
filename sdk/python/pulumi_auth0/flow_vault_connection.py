# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['FlowVaultConnectionArgs', 'FlowVaultConnection']

@pulumi.input_type
class FlowVaultConnectionArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[builtins.str],
                 account_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprint: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 setup: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None):
        """
        The set of arguments for constructing a FlowVaultConnection resource.
        :param pulumi.Input[builtins.str] app_id: App identifier of the vault connection.
        :param pulumi.Input[builtins.str] account_name: Custom account name of the vault connection.
        :param pulumi.Input[builtins.str] environment: Environment of the vault connection.
        :param pulumi.Input[builtins.str] fingerprint: Fingerprint of the vault connection.
        :param pulumi.Input[builtins.str] name: Name of the vault connection.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] setup: Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        pulumi.set(__self__, "app_id", app_id)
        if account_name is not None:
            pulumi.set(__self__, "account_name", account_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if setup is not None:
            pulumi.set(__self__, "setup", setup)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[builtins.str]:
        """
        App identifier of the vault connection.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Custom account name of the vault connection.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Environment of the vault connection.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Fingerprint of the vault connection.
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "fingerprint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the vault connection.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def setup(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        return pulumi.get(self, "setup")

    @setup.setter
    def setup(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "setup", value)


@pulumi.input_type
class _FlowVaultConnectionState:
    def __init__(__self__, *,
                 account_name: Optional[pulumi.Input[builtins.str]] = None,
                 app_id: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprint: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ready: Optional[pulumi.Input[builtins.bool]] = None,
                 setup: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering FlowVaultConnection resources.
        :param pulumi.Input[builtins.str] account_name: Custom account name of the vault connection.
        :param pulumi.Input[builtins.str] app_id: App identifier of the vault connection.
        :param pulumi.Input[builtins.str] environment: Environment of the vault connection.
        :param pulumi.Input[builtins.str] fingerprint: Fingerprint of the vault connection.
        :param pulumi.Input[builtins.str] name: Name of the vault connection.
        :param pulumi.Input[builtins.bool] ready: Indicates if the vault connection is configured.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] setup: Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        if account_name is not None:
            pulumi.set(__self__, "account_name", account_name)
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if fingerprint is not None:
            pulumi.set(__self__, "fingerprint", fingerprint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ready is not None:
            pulumi.set(__self__, "ready", ready)
        if setup is not None:
            pulumi.set(__self__, "setup", setup)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Custom account name of the vault connection.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        App identifier of the vault connection.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Environment of the vault connection.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def fingerprint(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Fingerprint of the vault connection.
        """
        return pulumi.get(self, "fingerprint")

    @fingerprint.setter
    def fingerprint(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "fingerprint", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the vault connection.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ready(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Indicates if the vault connection is configured.
        """
        return pulumi.get(self, "ready")

    @ready.setter
    def ready(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "ready", value)

    @property
    @pulumi.getter
    def setup(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        return pulumi.get(self, "setup")

    @setup.setter
    def setup(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "setup", value)


class FlowVaultConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[builtins.str]] = None,
                 app_id: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprint: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 setup: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        """
        With this resource, you can create and manage flow vault connections for a tenant.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        my_connection = auth0.FlowVaultConnection("my_connection",
            app_id="AUTH0",
            name="Auth0 M2M Connection",
            setup={
                "client_id": "******************",
                "client_secret": "*********************************",
                "domain": "*****************************",
                "type": "OAUTH_APP",
            })
        ```

        ## Import

        This resource can be imported using the flow vault connection ID.

        Example:

        ```sh
        $ pulumi import auth0:index/flowVaultConnection:FlowVaultConnection my_connection "ac_42HT5oiobDyUs8ASwEEWK0"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_name: Custom account name of the vault connection.
        :param pulumi.Input[builtins.str] app_id: App identifier of the vault connection.
        :param pulumi.Input[builtins.str] environment: Environment of the vault connection.
        :param pulumi.Input[builtins.str] fingerprint: Fingerprint of the vault connection.
        :param pulumi.Input[builtins.str] name: Name of the vault connection.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] setup: Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlowVaultConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can create and manage flow vault connections for a tenant.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        my_connection = auth0.FlowVaultConnection("my_connection",
            app_id="AUTH0",
            name="Auth0 M2M Connection",
            setup={
                "client_id": "******************",
                "client_secret": "*********************************",
                "domain": "*****************************",
                "type": "OAUTH_APP",
            })
        ```

        ## Import

        This resource can be imported using the flow vault connection ID.

        Example:

        ```sh
        $ pulumi import auth0:index/flowVaultConnection:FlowVaultConnection my_connection "ac_42HT5oiobDyUs8ASwEEWK0"
        ```

        :param str resource_name: The name of the resource.
        :param FlowVaultConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlowVaultConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[builtins.str]] = None,
                 app_id: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[builtins.str]] = None,
                 fingerprint: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 setup: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlowVaultConnectionArgs.__new__(FlowVaultConnectionArgs)

            __props__.__dict__["account_name"] = account_name
            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            __props__.__dict__["environment"] = environment
            __props__.__dict__["fingerprint"] = fingerprint
            __props__.__dict__["name"] = name
            __props__.__dict__["setup"] = None if setup is None else pulumi.Output.secret(setup)
            __props__.__dict__["ready"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["setup"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(FlowVaultConnection, __self__).__init__(
            'auth0:index/flowVaultConnection:FlowVaultConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_name: Optional[pulumi.Input[builtins.str]] = None,
            app_id: Optional[pulumi.Input[builtins.str]] = None,
            environment: Optional[pulumi.Input[builtins.str]] = None,
            fingerprint: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            ready: Optional[pulumi.Input[builtins.bool]] = None,
            setup: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None) -> 'FlowVaultConnection':
        """
        Get an existing FlowVaultConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] account_name: Custom account name of the vault connection.
        :param pulumi.Input[builtins.str] app_id: App identifier of the vault connection.
        :param pulumi.Input[builtins.str] environment: Environment of the vault connection.
        :param pulumi.Input[builtins.str] fingerprint: Fingerprint of the vault connection.
        :param pulumi.Input[builtins.str] name: Name of the vault connection.
        :param pulumi.Input[builtins.bool] ready: Indicates if the vault connection is configured.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] setup: Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlowVaultConnectionState.__new__(_FlowVaultConnectionState)

        __props__.__dict__["account_name"] = account_name
        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["environment"] = environment
        __props__.__dict__["fingerprint"] = fingerprint
        __props__.__dict__["name"] = name
        __props__.__dict__["ready"] = ready
        __props__.__dict__["setup"] = setup
        return FlowVaultConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Custom account name of the vault connection.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[builtins.str]:
        """
        App identifier of the vault connection.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Environment of the vault connection.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[builtins.str]:
        """
        Fingerprint of the vault connection.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Name of the vault connection.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ready(self) -> pulumi.Output[builtins.bool]:
        """
        Indicates if the vault connection is configured.
        """
        return pulumi.get(self, "ready")

    @property
    @pulumi.getter
    def setup(self) -> pulumi.Output[Optional[Mapping[str, builtins.str]]]:
        """
        Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        return pulumi.get(self, "setup")

