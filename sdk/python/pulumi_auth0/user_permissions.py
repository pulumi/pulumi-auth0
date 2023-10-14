# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['UserPermissionsArgs', 'UserPermissions']

@pulumi.input_type
class UserPermissionsArgs:
    def __init__(__self__, *,
                 permissions: pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserPermissions resource.
        :param pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]] permissions: List of API permissions granted to the user.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        UserPermissionsArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permissions=permissions,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permissions: pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]],
             user_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("permissions", permissions)
        _setter("user_id", user_id)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]:
        """
        List of API permissions granted to the user.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        ID of the user to associate the permission to.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _UserPermissionsState:
    def __init__(__self__, *,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserPermissions resources.
        :param pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]] permissions: List of API permissions granted to the user.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        _UserPermissionsState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permissions=permissions,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permissions: Optional[pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if permissions is not None:
            _setter("permissions", permissions)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]]:
        """
        List of API permissions granted to the user.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserPermissionsPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user to associate the permission to.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class UserPermissions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPermissionsPermissionArgs']]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage all of a user's permissions.

        !> This resource manages all the permissions assigned to a user. In contrast, the `UserPermission` resource only
        appends a permissions to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `UserPermission` resource when managing permissions for the same user id.

        ## Import

        This resource can be imported by specifying the user ID Example

        ```sh
         $ pulumi import auth0:index/userPermissions:UserPermissions all_user_permissions "auth0|111111111111111111111111"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPermissionsPermissionArgs']]]] permissions: List of API permissions granted to the user.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserPermissionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage all of a user's permissions.

        !> This resource manages all the permissions assigned to a user. In contrast, the `UserPermission` resource only
        appends a permissions to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `UserPermission` resource when managing permissions for the same user id.

        ## Import

        This resource can be imported by specifying the user ID Example

        ```sh
         $ pulumi import auth0:index/userPermissions:UserPermissions all_user_permissions "auth0|111111111111111111111111"
        ```

        :param str resource_name: The name of the resource.
        :param UserPermissionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserPermissionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserPermissionsArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPermissionsPermissionArgs']]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserPermissionsArgs.__new__(UserPermissionsArgs)

            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(UserPermissions, __self__).__init__(
            'auth0:index/userPermissions:UserPermissions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPermissionsPermissionArgs']]]]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserPermissions':
        """
        Get an existing UserPermissions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPermissionsPermissionArgs']]]] permissions: List of API permissions granted to the user.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserPermissionsState.__new__(_UserPermissionsState)

        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["user_id"] = user_id
        return UserPermissions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence['outputs.UserPermissionsPermission']]:
        """
        List of API permissions granted to the user.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        ID of the user to associate the permission to.
        """
        return pulumi.get(self, "user_id")

