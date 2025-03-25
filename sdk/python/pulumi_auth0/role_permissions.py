# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['RolePermissionsArgs', 'RolePermissions']

@pulumi.input_type
class RolePermissionsArgs:
    def __init__(__self__, *,
                 permissions: pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]],
                 role_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a RolePermissions resource.
        :param pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]] permissions: List of API permissions granted to the role.
        :param pulumi.Input[str] role_id: ID of the role to associate the permission to.
        """
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "role_id", role_id)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]]:
        """
        List of API permissions granted to the role.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Input[str]:
        """
        ID of the role to associate the permission to.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_id", value)


@pulumi.input_type
class _RolePermissionsState:
    def __init__(__self__, *,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]]] = None,
                 role_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RolePermissions resources.
        :param pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]] permissions: List of API permissions granted to the role.
        :param pulumi.Input[str] role_id: ID of the role to associate the permission to.
        """
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if role_id is not None:
            pulumi.set(__self__, "role_id", role_id)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]]]:
        """
        List of API permissions granted to the role.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RolePermissionsPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the role to associate the permission to.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_id", value)


class RolePermissions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolePermissionsPermissionArgs', 'RolePermissionsPermissionArgsDict']]]]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage role permissions (1-many).

        !> This resource manages all the permissions assigned to a role. In contrast, the `RolePermission` resource only
        appends a permission to a role. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `RolePermission` resource when managing permissions for the same role id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        resource_server = auth0.ResourceServer("resource_server",
            name="test",
            identifier="test.example.com")
        resource_server_scopes = auth0.ResourceServerScopes("resource_server_scopes",
            resource_server_identifier=resource_server.identifier,
            scopes=[
                {
                    "name": "store:create",
                },
                {
                    "name": "store:read",
                },
                {
                    "name": "store:update",
                },
                {
                    "name": "store:delete",
                },
            ])
        my_role = auth0.Role("my_role", name="My Role")
        my_role_perms = auth0.RolePermissions("my_role_perms",
            permissions=resource_server.identifier.apply(lambda identifier: [{
                "name": entry["value"],
                "resourceServerIdentifier": identifier,
            } for entry in resource_server_scopes.scopes.apply(lambda scopes: [{"key": k, "value": v} for k, v in scopes])]),
            role_id=my_role.id)
        ```

        ## Import

        This resource can be imported by specifying the role ID

        Example:

        ```sh
        $ pulumi import auth0:index/rolePermissions:RolePermissions all_role_permissions "rol_XXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RolePermissionsPermissionArgs', 'RolePermissionsPermissionArgsDict']]]] permissions: List of API permissions granted to the role.
        :param pulumi.Input[str] role_id: ID of the role to associate the permission to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RolePermissionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage role permissions (1-many).

        !> This resource manages all the permissions assigned to a role. In contrast, the `RolePermission` resource only
        appends a permission to a role. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `RolePermission` resource when managing permissions for the same role id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        resource_server = auth0.ResourceServer("resource_server",
            name="test",
            identifier="test.example.com")
        resource_server_scopes = auth0.ResourceServerScopes("resource_server_scopes",
            resource_server_identifier=resource_server.identifier,
            scopes=[
                {
                    "name": "store:create",
                },
                {
                    "name": "store:read",
                },
                {
                    "name": "store:update",
                },
                {
                    "name": "store:delete",
                },
            ])
        my_role = auth0.Role("my_role", name="My Role")
        my_role_perms = auth0.RolePermissions("my_role_perms",
            permissions=resource_server.identifier.apply(lambda identifier: [{
                "name": entry["value"],
                "resourceServerIdentifier": identifier,
            } for entry in resource_server_scopes.scopes.apply(lambda scopes: [{"key": k, "value": v} for k, v in scopes])]),
            role_id=my_role.id)
        ```

        ## Import

        This resource can be imported by specifying the role ID

        Example:

        ```sh
        $ pulumi import auth0:index/rolePermissions:RolePermissions all_role_permissions "rol_XXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param RolePermissionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RolePermissionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolePermissionsPermissionArgs', 'RolePermissionsPermissionArgsDict']]]]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RolePermissionsArgs.__new__(RolePermissionsArgs)

            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if role_id is None and not opts.urn:
                raise TypeError("Missing required property 'role_id'")
            __props__.__dict__["role_id"] = role_id
        super(RolePermissions, __self__).__init__(
            'auth0:index/rolePermissions:RolePermissions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolePermissionsPermissionArgs', 'RolePermissionsPermissionArgsDict']]]]] = None,
            role_id: Optional[pulumi.Input[str]] = None) -> 'RolePermissions':
        """
        Get an existing RolePermissions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RolePermissionsPermissionArgs', 'RolePermissionsPermissionArgsDict']]]] permissions: List of API permissions granted to the role.
        :param pulumi.Input[str] role_id: ID of the role to associate the permission to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RolePermissionsState.__new__(_RolePermissionsState)

        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["role_id"] = role_id
        return RolePermissions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence['outputs.RolePermissionsPermission']]:
        """
        List of API permissions granted to the role.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Output[str]:
        """
        ID of the role to associate the permission to.
        """
        return pulumi.get(self, "role_id")

