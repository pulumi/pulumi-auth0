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

__all__ = [
    'GetRoleResult',
    'AwaitableGetRoleResult',
    'get_role',
    'get_role_output',
]

@pulumi.output_type
class GetRoleResult:
    """
    A collection of values returned by getRole.
    """
    def __init__(__self__, description=None, id=None, name=None, permissions=None, role_id=None, users=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if role_id and not isinstance(role_id, str):
            raise TypeError("Expected argument 'role_id' to be a str")
        pulumi.set(__self__, "role_id", role_id)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the role.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the role. If not provided, `role_id` must be set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def permissions(self) -> Sequence['outputs.GetRolePermissionResult']:
        """
        Configuration settings for permissions (scopes) attached to the role.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> Optional[str]:
        """
        The ID of the role. If not provided, `name` must be set.
        """
        return pulumi.get(self, "role_id")

    @property
    @pulumi.getter
    def users(self) -> Sequence[str]:
        """
        List of user IDs assigned to this role. Retrieves a maximum of 1000 user IDs.
        """
        return pulumi.get(self, "users")


class AwaitableGetRoleResult(GetRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoleResult(
            description=self.description,
            id=self.id,
            name=self.name,
            permissions=self.permissions,
            role_id=self.role_id,
            users=self.users)


def get_role(name: Optional[str] = None,
             role_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoleResult:
    """
    Data source to retrieve a specific Auth0 role by `role_id` or `name`.


    :param str role_id: The ID of the role. If not provided, `name` must be set.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['roleId'] = role_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getRole:getRole', __args__, opts=opts, typ=GetRoleResult).value

    return AwaitableGetRoleResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        permissions=pulumi.get(__ret__, 'permissions'),
        role_id=pulumi.get(__ret__, 'role_id'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_role)
def get_role_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                    role_id: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRoleResult]:
    """
    Data source to retrieve a specific Auth0 role by `role_id` or `name`.


    :param str role_id: The ID of the role. If not provided, `name` must be set.
    """
    ...
