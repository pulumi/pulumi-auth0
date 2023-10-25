# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrganizationMemberArgs', 'OrganizationMember']

@pulumi.input_type
class OrganizationMemberArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationMember resource.
        :param pulumi.Input[str] organization_id: The ID of the organization to assign the member to.
        :param pulumi.Input[str] user_id: ID of the user to add as an organization member.
        """
        OrganizationMemberArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            organization_id=organization_id,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             organization_id: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if organization_id is None and 'organizationId' in kwargs:
            organization_id = kwargs['organizationId']
        if organization_id is None:
            raise TypeError("Missing 'organization_id' argument")
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']
        if user_id is None:
            raise TypeError("Missing 'user_id' argument")

        _setter("organization_id", organization_id)
        _setter("user_id", user_id)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        The ID of the organization to assign the member to.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        ID of the user to add as an organization member.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _OrganizationMemberState:
    def __init__(__self__, *,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationMember resources.
        :param pulumi.Input[str] organization_id: The ID of the organization to assign the member to.
        :param pulumi.Input[str] user_id: ID of the user to add as an organization member.
        """
        _OrganizationMemberState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            organization_id=organization_id,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             organization_id: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if organization_id is None and 'organizationId' in kwargs:
            organization_id = kwargs['organizationId']
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']

        if organization_id is not None:
            _setter("organization_id", organization_id)
        if user_id is not None:
            _setter("user_id", user_id)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the organization to assign the member to.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user to add as an organization member.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class OrganizationMember(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource is used to manage the assignment of members and their roles within an organization.

        !> This resource appends a member to an organization. In contrast, the `OrganizationMembers` resource manages
        all the members assigned to an organization. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `OrganizationMembers` resource when managing members for the same organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        user = auth0.User("user",
            email="test-user@auth0.com",
            connection_name="Username-Password-Authentication",
            email_verified=True,
            password="MyPass123$")
        my_org = auth0.Organization("myOrg", display_name="Admin")
        my_org_member = auth0.OrganizationMember("myOrgMember",
            organization_id=my_org.id,
            user_id=user.id)
        ```

        ## Import

        This resource can be imported by specifying the organization ID and user ID separated by "::" (note the double colon) <organizationID>::<userID> # Example

        ```sh
         $ pulumi import auth0:index/organizationMember:OrganizationMember my_org_member "org_XXXXX::auth0|XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization to assign the member to.
        :param pulumi.Input[str] user_id: ID of the user to add as an organization member.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationMemberArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource is used to manage the assignment of members and their roles within an organization.

        !> This resource appends a member to an organization. In contrast, the `OrganizationMembers` resource manages
        all the members assigned to an organization. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `OrganizationMembers` resource when managing members for the same organization id.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        user = auth0.User("user",
            email="test-user@auth0.com",
            connection_name="Username-Password-Authentication",
            email_verified=True,
            password="MyPass123$")
        my_org = auth0.Organization("myOrg", display_name="Admin")
        my_org_member = auth0.OrganizationMember("myOrgMember",
            organization_id=my_org.id,
            user_id=user.id)
        ```

        ## Import

        This resource can be imported by specifying the organization ID and user ID separated by "::" (note the double colon) <organizationID>::<userID> # Example

        ```sh
         $ pulumi import auth0:index/organizationMember:OrganizationMember my_org_member "org_XXXXX::auth0|XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationMemberArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationMemberArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            OrganizationMemberArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationMemberArgs.__new__(OrganizationMemberArgs)

            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(OrganizationMember, __self__).__init__(
            'auth0:index/organizationMember:OrganizationMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'OrganizationMember':
        """
        Get an existing OrganizationMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: The ID of the organization to assign the member to.
        :param pulumi.Input[str] user_id: ID of the user to add as an organization member.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationMemberState.__new__(_OrganizationMemberState)

        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["user_id"] = user_id
        return OrganizationMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization to assign the member to.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        ID of the user to add as an organization member.
        """
        return pulumi.get(self, "user_id")

