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

__all__ = ['UserRoleArgs', 'UserRole']

@pulumi.input_type
class UserRoleArgs:
    def __init__(__self__, *,
                 role_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserRole resource.
        :param pulumi.Input[str] role_id: ID of the role assigned to the user.
        :param pulumi.Input[str] user_id: ID of the user.
        """
        pulumi.set(__self__, "role_id", role_id)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Input[str]:
        """
        ID of the role assigned to the user.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _UserRoleState:
    def __init__(__self__, *,
                 role_description: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserRole resources.
        :param pulumi.Input[str] role_description: Description of the role.
        :param pulumi.Input[str] role_id: ID of the role assigned to the user.
        :param pulumi.Input[str] role_name: Name of the role.
        :param pulumi.Input[str] user_id: ID of the user.
        """
        if role_description is not None:
            pulumi.set(__self__, "role_description", role_description)
        if role_id is not None:
            pulumi.set(__self__, "role_id", role_id)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="roleDescription")
    def role_description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the role.
        """
        return pulumi.get(self, "role_description")

    @role_description.setter
    def role_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_description", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the role assigned to the user.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the role.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class UserRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage assigned roles for a user.

        !> This resource appends a role to a user. In contrast, the `UserRoles` resource manages all the roles assigned
        to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
        `UserRoles` resource when managing roles for the same user id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        admin = auth0.Role("admin",
            name="admin",
            description="Administrator")
        user = auth0.User("user",
            connection_name="Username-Password-Authentication",
            username="unique_username",
            name="Firstname Lastname",
            email="test@test.com",
            password="passpass$12$12")
        user_roles = auth0.UserRole("user_roles",
            user_id=user.id,
            role_id=admin.id)
        ```

        ## Import

        This resource can be imported by specifying the

        user ID and role ID separated by "::" (note the double colon)

        <userID>::<roleID>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/userRole:UserRole user_role "auth0|111111111111111111111111::role_123"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role_id: ID of the role assigned to the user.
        :param pulumi.Input[str] user_id: ID of the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage assigned roles for a user.

        !> This resource appends a role to a user. In contrast, the `UserRoles` resource manages all the roles assigned
        to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
        `UserRoles` resource when managing roles for the same user id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Example:
        admin = auth0.Role("admin",
            name="admin",
            description="Administrator")
        user = auth0.User("user",
            connection_name="Username-Password-Authentication",
            username="unique_username",
            name="Firstname Lastname",
            email="test@test.com",
            password="passpass$12$12")
        user_roles = auth0.UserRole("user_roles",
            user_id=user.id,
            role_id=admin.id)
        ```

        ## Import

        This resource can be imported by specifying the

        user ID and role ID separated by "::" (note the double colon)

        <userID>::<roleID>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/userRole:UserRole user_role "auth0|111111111111111111111111::role_123"
        ```

        :param str resource_name: The name of the resource.
        :param UserRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserRoleArgs.__new__(UserRoleArgs)

            if role_id is None and not opts.urn:
                raise TypeError("Missing required property 'role_id'")
            __props__.__dict__["role_id"] = role_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["role_description"] = None
            __props__.__dict__["role_name"] = None
        super(UserRole, __self__).__init__(
            'auth0:index/userRole:UserRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            role_description: Optional[pulumi.Input[str]] = None,
            role_id: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'UserRole':
        """
        Get an existing UserRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role_description: Description of the role.
        :param pulumi.Input[str] role_id: ID of the role assigned to the user.
        :param pulumi.Input[str] role_name: Name of the role.
        :param pulumi.Input[str] user_id: ID of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserRoleState.__new__(_UserRoleState)

        __props__.__dict__["role_description"] = role_description
        __props__.__dict__["role_id"] = role_id
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["user_id"] = user_id
        return UserRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="roleDescription")
    def role_description(self) -> pulumi.Output[str]:
        """
        Description of the role.
        """
        return pulumi.get(self, "role_description")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Output[str]:
        """
        ID of the role assigned to the user.
        """
        return pulumi.get(self, "role_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        Name of the role.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        ID of the user.
        """
        return pulumi.get(self, "user_id")

