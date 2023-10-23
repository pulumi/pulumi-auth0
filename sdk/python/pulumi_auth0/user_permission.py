# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserPermissionArgs', 'UserPermission']

@pulumi.input_type
class UserPermissionArgs:
    def __init__(__self__, *,
                 permission: pulumi.Input[str],
                 resource_server_identifier: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserPermission resource.
        :param pulumi.Input[str] permission: Name of the permission.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the permission is associated with.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        UserPermissionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            permission=permission,
            resource_server_identifier=resource_server_identifier,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             permission: Optional[pulumi.Input[str]] = None,
             resource_server_identifier: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if permission is None:
            raise TypeError("Missing 'permission' argument")
        if resource_server_identifier is None and 'resourceServerIdentifier' in kwargs:
            resource_server_identifier = kwargs['resourceServerIdentifier']
        if resource_server_identifier is None:
            raise TypeError("Missing 'resource_server_identifier' argument")
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']
        if user_id is None:
            raise TypeError("Missing 'user_id' argument")

        _setter("permission", permission)
        _setter("resource_server_identifier", resource_server_identifier)
        _setter("user_id", user_id)

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Input[str]:
        """
        Name of the permission.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: pulumi.Input[str]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the resource server that the permission is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_server_identifier", value)

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
class _UserPermissionState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 resource_server_name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserPermission resources.
        :param pulumi.Input[str] description: Description of the permission.
        :param pulumi.Input[str] permission: Name of the permission.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the permission is associated with.
        :param pulumi.Input[str] resource_server_name: Name of the resource server that the permission is associated with.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        _UserPermissionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            permission=permission,
            resource_server_identifier=resource_server_identifier,
            resource_server_name=resource_server_name,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             permission: Optional[pulumi.Input[str]] = None,
             resource_server_identifier: Optional[pulumi.Input[str]] = None,
             resource_server_name: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if resource_server_identifier is None and 'resourceServerIdentifier' in kwargs:
            resource_server_identifier = kwargs['resourceServerIdentifier']
        if resource_server_name is None and 'resourceServerName' in kwargs:
            resource_server_name = kwargs['resourceServerName']
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']

        if description is not None:
            _setter("description", description)
        if permission is not None:
            _setter("permission", permission)
        if resource_server_identifier is not None:
            _setter("resource_server_identifier", resource_server_identifier)
        if resource_server_name is not None:
            _setter("resource_server_name", resource_server_name)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the permission.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def permission(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the permission.
        """
        return pulumi.get(self, "permission")

    @permission.setter
    def permission(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permission", value)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the resource server that the permission is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_server_identifier", value)

    @property
    @pulumi.getter(name="resourceServerName")
    def resource_server_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource server that the permission is associated with.
        """
        return pulumi.get(self, "resource_server_name")

    @resource_server_name.setter
    def resource_server_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_server_name", value)

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


class UserPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage user permissions.

        !> This resource appends a permission to a user. In contrast, the `UserPermissions` resource manages all the
        permissions assigned to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `UserPermissions` resource when managing permissions for the same user id.

        ## Import

        This resource can be imported by specifying the user ID, resource identifier and permission name separated by "::" (note the double colon) <userID>::<resourceServerIdentifier>::<permission> # Example

        ```sh
         $ pulumi import auth0:index/userPermission:UserPermission permission "auth0|111111111111111111111111::https://api.travel0.com/v1::read:posts"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] permission: Name of the permission.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the permission is associated with.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage user permissions.

        !> This resource appends a permission to a user. In contrast, the `UserPermissions` resource manages all the
        permissions assigned to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
        with the `UserPermissions` resource when managing permissions for the same user id.

        ## Import

        This resource can be imported by specifying the user ID, resource identifier and permission name separated by "::" (note the double colon) <userID>::<resourceServerIdentifier>::<permission> # Example

        ```sh
         $ pulumi import auth0:index/userPermission:UserPermission permission "auth0|111111111111111111111111::https://api.travel0.com/v1::read:posts"
        ```

        :param str resource_name: The name of the resource.
        :param UserPermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserPermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserPermissionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 permission: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserPermissionArgs.__new__(UserPermissionArgs)

            if permission is None and not opts.urn:
                raise TypeError("Missing required property 'permission'")
            __props__.__dict__["permission"] = permission
            if resource_server_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'resource_server_identifier'")
            __props__.__dict__["resource_server_identifier"] = resource_server_identifier
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["description"] = None
            __props__.__dict__["resource_server_name"] = None
        super(UserPermission, __self__).__init__(
            'auth0:index/userPermission:UserPermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            permission: Optional[pulumi.Input[str]] = None,
            resource_server_identifier: Optional[pulumi.Input[str]] = None,
            resource_server_name: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserPermission':
        """
        Get an existing UserPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the permission.
        :param pulumi.Input[str] permission: Name of the permission.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the permission is associated with.
        :param pulumi.Input[str] resource_server_name: Name of the resource server that the permission is associated with.
        :param pulumi.Input[str] user_id: ID of the user to associate the permission to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserPermissionState.__new__(_UserPermissionState)

        __props__.__dict__["description"] = description
        __props__.__dict__["permission"] = permission
        __props__.__dict__["resource_server_identifier"] = resource_server_identifier
        __props__.__dict__["resource_server_name"] = resource_server_name
        __props__.__dict__["user_id"] = user_id
        return UserPermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the permission.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def permission(self) -> pulumi.Output[str]:
        """
        Name of the permission.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the resource server that the permission is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @property
    @pulumi.getter(name="resourceServerName")
    def resource_server_name(self) -> pulumi.Output[str]:
        """
        Name of the resource server that the permission is associated with.
        """
        return pulumi.get(self, "resource_server_name")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        ID of the user to associate the permission to.
        """
        return pulumi.get(self, "user_id")

