# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationConnectionArgs', 'OrganizationConnection']

@pulumi.input_type
class OrganizationConnectionArgs:
    def __init__(__self__, *,
                 connection_id: pulumi.Input[str],
                 organization_id: pulumi.Input[str],
                 assign_membership_on_login: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a OrganizationConnection resource.
        :param pulumi.Input[str] connection_id: The ID of the connection to enable for the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to enable the connection for.
        :param pulumi.Input[bool] assign_membership_on_login: When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        """
        OrganizationConnectionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            connection_id=connection_id,
            organization_id=organization_id,
            assign_membership_on_login=assign_membership_on_login,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             connection_id: pulumi.Input[str],
             organization_id: pulumi.Input[str],
             assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("connection_id", connection_id)
        _setter("organization_id", organization_id)
        if assign_membership_on_login is not None:
            _setter("assign_membership_on_login", assign_membership_on_login)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[str]:
        """
        The ID of the connection to enable for the organization.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        The ID of the organization to enable the connection for.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="assignMembershipOnLogin")
    def assign_membership_on_login(self) -> Optional[pulumi.Input[bool]]:
        """
        When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        """
        return pulumi.get(self, "assign_membership_on_login")

    @assign_membership_on_login.setter
    def assign_membership_on_login(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "assign_membership_on_login", value)


@pulumi.input_type
class _OrganizationConnectionState:
    def __init__(__self__, *,
                 assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 strategy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationConnection resources.
        :param pulumi.Input[bool] assign_membership_on_login: When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        :param pulumi.Input[str] connection_id: The ID of the connection to enable for the organization.
        :param pulumi.Input[str] name: The name of the enabled connection.
        :param pulumi.Input[str] organization_id: The ID of the organization to enable the connection for.
        :param pulumi.Input[str] strategy: The strategy of the enabled connection.
        """
        _OrganizationConnectionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            assign_membership_on_login=assign_membership_on_login,
            connection_id=connection_id,
            name=name,
            organization_id=organization_id,
            strategy=strategy,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
             connection_id: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             organization_id: Optional[pulumi.Input[str]] = None,
             strategy: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if assign_membership_on_login is not None:
            _setter("assign_membership_on_login", assign_membership_on_login)
        if connection_id is not None:
            _setter("connection_id", connection_id)
        if name is not None:
            _setter("name", name)
        if organization_id is not None:
            _setter("organization_id", organization_id)
        if strategy is not None:
            _setter("strategy", strategy)

    @property
    @pulumi.getter(name="assignMembershipOnLogin")
    def assign_membership_on_login(self) -> Optional[pulumi.Input[bool]]:
        """
        When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        """
        return pulumi.get(self, "assign_membership_on_login")

    @assign_membership_on_login.setter
    def assign_membership_on_login(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "assign_membership_on_login", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the connection to enable for the organization.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the enabled connection.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the organization to enable the connection for.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter
    def strategy(self) -> Optional[pulumi.Input[str]]:
        """
        The strategy of the enabled connection.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "strategy", value)


class OrganizationConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage enabled connections on an organization.

        !> This resource appends a connection to an organization. In contrast, the `OrganizationConnections` resource
        manages all the connections enabled for an organization. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `OrganizationConnections` resource when managing enabled connections for the
        same organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_connection = auth0.Connection("myConnection", strategy="auth0")
        my_organization = auth0.Organization("myOrganization", display_name="My Organization")
        my_org_conn = auth0.OrganizationConnection("myOrgConn",
            organization_id=my_organization.id,
            connection_id=my_connection.id,
            assign_membership_on_login=True)
        ```

        ## Import

        This resource can be imported by specifying the organization ID and connection ID separated by "::" (note the double colon) <organizationID>::<connectionID> # Example

        ```sh
         $ pulumi import auth0:index/organizationConnection:OrganizationConnection my_org_conn "org_XXXXX::con_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] assign_membership_on_login: When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        :param pulumi.Input[str] connection_id: The ID of the connection to enable for the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to enable the connection for.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage enabled connections on an organization.

        !> This resource appends a connection to an organization. In contrast, the `OrganizationConnections` resource
        manages all the connections enabled for an organization. To avoid potential issues, it is recommended not to use this
        resource in conjunction with the `OrganizationConnections` resource when managing enabled connections for the
        same organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_connection = auth0.Connection("myConnection", strategy="auth0")
        my_organization = auth0.Organization("myOrganization", display_name="My Organization")
        my_org_conn = auth0.OrganizationConnection("myOrgConn",
            organization_id=my_organization.id,
            connection_id=my_connection.id,
            assign_membership_on_login=True)
        ```

        ## Import

        This resource can be imported by specifying the organization ID and connection ID separated by "::" (note the double colon) <organizationID>::<connectionID> # Example

        ```sh
         $ pulumi import auth0:index/organizationConnection:OrganizationConnection my_org_conn "org_XXXXX::con_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            OrganizationConnectionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationConnectionArgs.__new__(OrganizationConnectionArgs)

            __props__.__dict__["assign_membership_on_login"] = assign_membership_on_login
            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            __props__.__dict__["name"] = None
            __props__.__dict__["strategy"] = None
        super(OrganizationConnection, __self__).__init__(
            'auth0:index/organizationConnection:OrganizationConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            assign_membership_on_login: Optional[pulumi.Input[bool]] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            strategy: Optional[pulumi.Input[str]] = None) -> 'OrganizationConnection':
        """
        Get an existing OrganizationConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] assign_membership_on_login: When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        :param pulumi.Input[str] connection_id: The ID of the connection to enable for the organization.
        :param pulumi.Input[str] name: The name of the enabled connection.
        :param pulumi.Input[str] organization_id: The ID of the organization to enable the connection for.
        :param pulumi.Input[str] strategy: The strategy of the enabled connection.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationConnectionState.__new__(_OrganizationConnectionState)

        __props__.__dict__["assign_membership_on_login"] = assign_membership_on_login
        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["name"] = name
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["strategy"] = strategy
        return OrganizationConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="assignMembershipOnLogin")
    def assign_membership_on_login(self) -> pulumi.Output[Optional[bool]]:
        """
        When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
        """
        return pulumi.get(self, "assign_membership_on_login")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        The ID of the connection to enable for the organization.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the enabled connection.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization to enable the connection for.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Output[str]:
        """
        The strategy of the enabled connection.
        """
        return pulumi.get(self, "strategy")

