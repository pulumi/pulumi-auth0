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
from . import outputs
from ._inputs import *

__all__ = ['OrganizationConnectionsArgs', 'OrganizationConnections']

@pulumi.input_type
class OrganizationConnectionsArgs:
    def __init__(__self__, *,
                 enabled_connections: pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]],
                 organization_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a OrganizationConnections resource.
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]] enabled_connections: Connections that are enabled for the organization.
        :param pulumi.Input[builtins.str] organization_id: ID of the organization on which to enable the connections.
        """
        pulumi.set(__self__, "enabled_connections", enabled_connections)
        pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter(name="enabledConnections")
    def enabled_connections(self) -> pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]]:
        """
        Connections that are enabled for the organization.
        """
        return pulumi.get(self, "enabled_connections")

    @enabled_connections.setter
    def enabled_connections(self, value: pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]]):
        pulumi.set(self, "enabled_connections", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[builtins.str]:
        """
        ID of the organization on which to enable the connections.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "organization_id", value)


@pulumi.input_type
class _OrganizationConnectionsState:
    def __init__(__self__, *,
                 enabled_connections: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering OrganizationConnections resources.
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]] enabled_connections: Connections that are enabled for the organization.
        :param pulumi.Input[builtins.str] organization_id: ID of the organization on which to enable the connections.
        """
        if enabled_connections is not None:
            pulumi.set(__self__, "enabled_connections", enabled_connections)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter(name="enabledConnections")
    def enabled_connections(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]]]:
        """
        Connections that are enabled for the organization.
        """
        return pulumi.get(self, "enabled_connections")

    @enabled_connections.setter
    def enabled_connections(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationConnectionsEnabledConnectionArgs']]]]):
        pulumi.set(self, "enabled_connections", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        ID of the organization on which to enable the connections.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "organization_id", value)


class OrganizationConnections(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled_connections: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationConnectionsEnabledConnectionArgs', 'OrganizationConnectionsEnabledConnectionArgsDict']]]]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        With this resource, you can manage enabled connections on an organization.

        !> This resource manages all the connections enabled for an organization. In contrast, the `OrganizationConnection`
        resource appends a connection to an organization. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `OrganizationConnection` resource when managing connections for the same
        organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_connection_1 = auth0.Connection("my_connection-1",
            name="My Connection 1",
            strategy="auth0")
        my_connection_2 = auth0.Connection("my_connection-2",
            name="My Connection 2",
            strategy="auth0")
        my_organization = auth0.Organization("my_organization",
            name="my-organization",
            display_name="My Organization")
        one_to_many = auth0.OrganizationConnections("one-to-many",
            organization_id=my_organization.id,
            enabled_connections=[
                {
                    "connection_id": my_connection_1.id,
                    "assign_membership_on_login": True,
                    "is_signup_enabled": False,
                    "show_as_button": True,
                },
                {
                    "connection_id": my_connection_2.id,
                    "assign_membership_on_login": True,
                    "is_signup_enabled": False,
                    "show_as_button": True,
                },
            ])
        ```

        ## Import

        This resource can be imported by specifying the organization ID.

        Example:

        ```sh
        $ pulumi import auth0:index/organizationConnections:OrganizationConnections my_org_conns "org_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationConnectionsEnabledConnectionArgs', 'OrganizationConnectionsEnabledConnectionArgsDict']]]] enabled_connections: Connections that are enabled for the organization.
        :param pulumi.Input[builtins.str] organization_id: ID of the organization on which to enable the connections.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationConnectionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage enabled connections on an organization.

        !> This resource manages all the connections enabled for an organization. In contrast, the `OrganizationConnection`
        resource appends a connection to an organization. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `OrganizationConnection` resource when managing connections for the same
        organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_connection_1 = auth0.Connection("my_connection-1",
            name="My Connection 1",
            strategy="auth0")
        my_connection_2 = auth0.Connection("my_connection-2",
            name="My Connection 2",
            strategy="auth0")
        my_organization = auth0.Organization("my_organization",
            name="my-organization",
            display_name="My Organization")
        one_to_many = auth0.OrganizationConnections("one-to-many",
            organization_id=my_organization.id,
            enabled_connections=[
                {
                    "connection_id": my_connection_1.id,
                    "assign_membership_on_login": True,
                    "is_signup_enabled": False,
                    "show_as_button": True,
                },
                {
                    "connection_id": my_connection_2.id,
                    "assign_membership_on_login": True,
                    "is_signup_enabled": False,
                    "show_as_button": True,
                },
            ])
        ```

        ## Import

        This resource can be imported by specifying the organization ID.

        Example:

        ```sh
        $ pulumi import auth0:index/organizationConnections:OrganizationConnections my_org_conns "org_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationConnectionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationConnectionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled_connections: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationConnectionsEnabledConnectionArgs', 'OrganizationConnectionsEnabledConnectionArgsDict']]]]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationConnectionsArgs.__new__(OrganizationConnectionsArgs)

            if enabled_connections is None and not opts.urn:
                raise TypeError("Missing required property 'enabled_connections'")
            __props__.__dict__["enabled_connections"] = enabled_connections
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
        super(OrganizationConnections, __self__).__init__(
            'auth0:index/organizationConnections:OrganizationConnections',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled_connections: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationConnectionsEnabledConnectionArgs', 'OrganizationConnectionsEnabledConnectionArgsDict']]]]] = None,
            organization_id: Optional[pulumi.Input[builtins.str]] = None) -> 'OrganizationConnections':
        """
        Get an existing OrganizationConnections resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationConnectionsEnabledConnectionArgs', 'OrganizationConnectionsEnabledConnectionArgsDict']]]] enabled_connections: Connections that are enabled for the organization.
        :param pulumi.Input[builtins.str] organization_id: ID of the organization on which to enable the connections.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationConnectionsState.__new__(_OrganizationConnectionsState)

        __props__.__dict__["enabled_connections"] = enabled_connections
        __props__.__dict__["organization_id"] = organization_id
        return OrganizationConnections(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="enabledConnections")
    def enabled_connections(self) -> pulumi.Output[Sequence['outputs.OrganizationConnectionsEnabledConnection']]:
        """
        Connections that are enabled for the organization.
        """
        return pulumi.get(self, "enabled_connections")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[builtins.str]:
        """
        ID of the organization on which to enable the connections.
        """
        return pulumi.get(self, "organization_id")

