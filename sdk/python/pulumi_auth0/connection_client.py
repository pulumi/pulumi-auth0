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

__all__ = ['ConnectionClientArgs', 'ConnectionClient']

@pulumi.input_type
class ConnectionClientArgs:
    def __init__(__self__, *,
                 client_id: pulumi.Input[builtins.str],
                 connection_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a ConnectionClient resource.
        :param pulumi.Input[builtins.str] client_id: ID of the client for which the connection is enabled.
        :param pulumi.Input[builtins.str] connection_id: ID of the connection on which to enable the client.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "connection_id", connection_id)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[builtins.str]:
        """
        ID of the client for which the connection is enabled.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[builtins.str]:
        """
        ID of the connection on which to enable the client.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "connection_id", value)


@pulumi.input_type
class _ConnectionClientState:
    def __init__(__self__, *,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 connection_id: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 strategy: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ConnectionClient resources.
        :param pulumi.Input[builtins.str] client_id: ID of the client for which the connection is enabled.
        :param pulumi.Input[builtins.str] connection_id: ID of the connection on which to enable the client.
        :param pulumi.Input[builtins.str] name: The name of the connection on which to enable the client.
        :param pulumi.Input[builtins.str] strategy: The strategy of the connection on which to enable the client.
        """
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if strategy is not None:
            pulumi.set(__self__, "strategy", strategy)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the client for which the connection is enabled.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the connection on which to enable the client.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the connection on which to enable the client.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def strategy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The strategy of the connection on which to enable the client.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "strategy", value)


class ConnectionClient(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 connection_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        With this resource, you can enable a single client on a connection.

        !> This resource appends an enabled client to a connection. In contrast, the `ConnectionClients` resource
        manages all the clients enabled for a connection. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `ConnectionClients` resource when managing enabled clients for the
        same connection id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_conn = auth0.Connection("my_conn",
            name="My-Auth0-Connection",
            strategy="auth0")
        my_client = auth0.Client("my_client", name="My-Auth0-Client")
        # One connection to one client association.
        # To prevent issues, avoid using this resource together with the `auth0_connection_clients` resource.
        my_conn_client_assoc = auth0.ConnectionClient("my_conn_client_assoc",
            connection_id=my_conn.id,
            client_id=my_client.id)
        ```

        ## Import

        This resource can be imported by specifying the

        connection ID and client ID separated by "::" (note the double colon)

        <connectionID>::<clientID>

        Example:

        ```sh
        $ pulumi import auth0:index/connectionClient:ConnectionClient my_conn_client_assoc "con_XXXXX::XXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] client_id: ID of the client for which the connection is enabled.
        :param pulumi.Input[builtins.str] connection_id: ID of the connection on which to enable the client.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectionClientArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can enable a single client on a connection.

        !> This resource appends an enabled client to a connection. In contrast, the `ConnectionClients` resource
        manages all the clients enabled for a connection. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `ConnectionClients` resource when managing enabled clients for the
        same connection id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_conn = auth0.Connection("my_conn",
            name="My-Auth0-Connection",
            strategy="auth0")
        my_client = auth0.Client("my_client", name="My-Auth0-Client")
        # One connection to one client association.
        # To prevent issues, avoid using this resource together with the `auth0_connection_clients` resource.
        my_conn_client_assoc = auth0.ConnectionClient("my_conn_client_assoc",
            connection_id=my_conn.id,
            client_id=my_client.id)
        ```

        ## Import

        This resource can be imported by specifying the

        connection ID and client ID separated by "::" (note the double colon)

        <connectionID>::<clientID>

        Example:

        ```sh
        $ pulumi import auth0:index/connectionClient:ConnectionClient my_conn_client_assoc "con_XXXXX::XXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param ConnectionClientArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectionClientArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_id: Optional[pulumi.Input[builtins.str]] = None,
                 connection_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectionClientArgs.__new__(ConnectionClientArgs)

            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            __props__.__dict__["name"] = None
            __props__.__dict__["strategy"] = None
        super(ConnectionClient, __self__).__init__(
            'auth0:index/connectionClient:ConnectionClient',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            client_id: Optional[pulumi.Input[builtins.str]] = None,
            connection_id: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            strategy: Optional[pulumi.Input[builtins.str]] = None) -> 'ConnectionClient':
        """
        Get an existing ConnectionClient resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] client_id: ID of the client for which the connection is enabled.
        :param pulumi.Input[builtins.str] connection_id: ID of the connection on which to enable the client.
        :param pulumi.Input[builtins.str] name: The name of the connection on which to enable the client.
        :param pulumi.Input[builtins.str] strategy: The strategy of the connection on which to enable the client.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectionClientState.__new__(_ConnectionClientState)

        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["name"] = name
        __props__.__dict__["strategy"] = strategy
        return ConnectionClient(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[builtins.str]:
        """
        ID of the client for which the connection is enabled.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[builtins.str]:
        """
        ID of the connection on which to enable the client.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the connection on which to enable the client.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Output[builtins.str]:
        """
        The strategy of the connection on which to enable the client.
        """
        return pulumi.get(self, "strategy")

