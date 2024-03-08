# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationMemberRoleArgs', 'OrganizationMemberRole']

@pulumi.input_type
class OrganizationMemberRoleArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 role_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationMemberRole resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[str] role_id: The role ID to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "role_id", role_id)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        The ID of the organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Input[str]:
        """
        The role ID to assign to the organization member.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        The user ID of the organization member.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _OrganizationMemberRoleState:
    def __init__(__self__, *,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 role_description: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationMemberRole resources.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[str] role_description: Description of the role.
        :param pulumi.Input[str] role_id: The role ID to assign to the organization member.
        :param pulumi.Input[str] role_name: Name of the role.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if role_description is not None:
            pulumi.set(__self__, "role_description", role_description)
        if role_id is not None:
            pulumi.set(__self__, "role_id", role_id)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

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
        The role ID to assign to the organization member.
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
        The user ID of the organization member.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class OrganizationMemberRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource is used to manage the roles assigned to an organization member.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        reader = auth0.Role("reader")
        writer = auth0.Role("writer")
        user = auth0.User("user",
            connection_name="Username-Password-Authentication",
            email="test-user@auth0.com",
            password="MyPass123$")
        my_org = auth0.Organization("myOrg", display_name="Some Org")
        my_org_member = auth0.OrganizationMember("myOrgMember",
            organization_id=my_org.id,
            user_id=user.id)
        role1 = auth0.OrganizationMemberRole("role1",
            organization_id=my_org.id,
            user_id=user.id,
            role_id=reader.id)
        role2 = auth0.OrganizationMemberRole("role2",
            organization_id=my_org.id,
            user_id=user.id,
            role_id=writer.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        This resource can be imported by specifying the

        organization ID, user ID and role ID separated by "::" (note the double colon)

        <organizationID>::<userID>::<roleID>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/organizationMemberRole:OrganizationMemberRole my_org_member_role "org_XXXXX::auth0|XXXXX::role_XXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[str] role_id: The role ID to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationMemberRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource is used to manage the roles assigned to an organization member.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        reader = auth0.Role("reader")
        writer = auth0.Role("writer")
        user = auth0.User("user",
            connection_name="Username-Password-Authentication",
            email="test-user@auth0.com",
            password="MyPass123$")
        my_org = auth0.Organization("myOrg", display_name="Some Org")
        my_org_member = auth0.OrganizationMember("myOrgMember",
            organization_id=my_org.id,
            user_id=user.id)
        role1 = auth0.OrganizationMemberRole("role1",
            organization_id=my_org.id,
            user_id=user.id,
            role_id=reader.id)
        role2 = auth0.OrganizationMemberRole("role2",
            organization_id=my_org.id,
            user_id=user.id,
            role_id=writer.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        This resource can be imported by specifying the

        organization ID, user ID and role ID separated by "::" (note the double colon)

        <organizationID>::<userID>::<roleID>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/organizationMemberRole:OrganizationMemberRole my_org_member_role "org_XXXXX::auth0|XXXXX::role_XXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationMemberRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationMemberRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationMemberRoleArgs.__new__(OrganizationMemberRoleArgs)

            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if role_id is None and not opts.urn:
                raise TypeError("Missing required property 'role_id'")
            __props__.__dict__["role_id"] = role_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["role_description"] = None
            __props__.__dict__["role_name"] = None
        super(OrganizationMemberRole, __self__).__init__(
            'auth0:index/organizationMemberRole:OrganizationMemberRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            role_description: Optional[pulumi.Input[str]] = None,
            role_id: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'OrganizationMemberRole':
        """
        Get an existing OrganizationMemberRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[str] role_description: Description of the role.
        :param pulumi.Input[str] role_id: The role ID to assign to the organization member.
        :param pulumi.Input[str] role_name: Name of the role.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationMemberRoleState.__new__(_OrganizationMemberRoleState)

        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["role_description"] = role_description
        __props__.__dict__["role_id"] = role_id
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["user_id"] = user_id
        return OrganizationMemberRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization.
        """
        return pulumi.get(self, "organization_id")

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
        The role ID to assign to the organization member.
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
        The user ID of the organization member.
        """
        return pulumi.get(self, "user_id")

