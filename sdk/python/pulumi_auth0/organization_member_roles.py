# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationMemberRolesArgs', 'OrganizationMemberRoles']

@pulumi.input_type
class OrganizationMemberRolesArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationMemberRoles resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: The role ID(s) to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "roles", roles)
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
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The role ID(s) to assign to the organization member.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

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
class _OrganizationMemberRolesState:
    def __init__(__self__, *,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationMemberRoles resources.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: The role ID(s) to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
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
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The role ID(s) to assign to the organization member.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

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


class OrganizationMemberRoles(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource is used to manage the roles assigned to an organization member.

        ## Example Usage

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
        my_org_member_roles = auth0.OrganizationMemberRoles("myOrgMemberRoles",
            organization_id=my_org.id,
            user_id=user.id,
            roles=[
                reader.id,
                writer.id,
            ])
        ```

        ## Import

        This resource can be imported by specifying the organization ID and user ID separated by ":". # Example

        ```sh
         $ pulumi import auth0:index/organizationMemberRoles:OrganizationMemberRoles my_org_member_roles "org_XXXXX:auth0|XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: The role ID(s) to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationMemberRolesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource is used to manage the roles assigned to an organization member.

        ## Example Usage

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
        my_org_member_roles = auth0.OrganizationMemberRoles("myOrgMemberRoles",
            organization_id=my_org.id,
            user_id=user.id,
            roles=[
                reader.id,
                writer.id,
            ])
        ```

        ## Import

        This resource can be imported by specifying the organization ID and user ID separated by ":". # Example

        ```sh
         $ pulumi import auth0:index/organizationMemberRoles:OrganizationMemberRoles my_org_member_roles "org_XXXXX:auth0|XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationMemberRolesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationMemberRolesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationMemberRolesArgs.__new__(OrganizationMemberRolesArgs)

            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(OrganizationMemberRoles, __self__).__init__(
            'auth0:index/organizationMemberRoles:OrganizationMemberRoles',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'OrganizationMemberRoles':
        """
        Get an existing OrganizationMemberRoles resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: The role ID(s) to assign to the organization member.
        :param pulumi.Input[str] user_id: The user ID of the organization member.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationMemberRolesState.__new__(_OrganizationMemberRolesState)

        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["roles"] = roles
        __props__.__dict__["user_id"] = user_id
        return OrganizationMemberRoles(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        The role ID(s) to assign to the organization member.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The user ID of the organization member.
        """
        return pulumi.get(self, "user_id")
