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

__all__ = ['OrganizationClientGrantArgs', 'OrganizationClientGrant']

@pulumi.input_type
class OrganizationClientGrantArgs:
    def __init__(__self__, *,
                 grant_id: pulumi.Input[str],
                 organization_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationClientGrant resource.
        :param pulumi.Input[str] grant_id: A Client Grant ID to add to the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to associate the client grant.
        """
        pulumi.set(__self__, "grant_id", grant_id)
        pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter(name="grantId")
    def grant_id(self) -> pulumi.Input[str]:
        """
        A Client Grant ID to add to the organization.
        """
        return pulumi.get(self, "grant_id")

    @grant_id.setter
    def grant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "grant_id", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        The ID of the organization to associate the client grant.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)


@pulumi.input_type
class _OrganizationClientGrantState:
    def __init__(__self__, *,
                 grant_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationClientGrant resources.
        :param pulumi.Input[str] grant_id: A Client Grant ID to add to the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to associate the client grant.
        """
        if grant_id is not None:
            pulumi.set(__self__, "grant_id", grant_id)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)

    @property
    @pulumi.getter(name="grantId")
    def grant_id(self) -> Optional[pulumi.Input[str]]:
        """
        A Client Grant ID to add to the organization.
        """
        return pulumi.get(self, "grant_id")

    @grant_id.setter
    def grant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grant_id", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the organization to associate the client grant.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)


class OrganizationClientGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grant_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage a client grant associated with an organization.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] grant_id: A Client Grant ID to add to the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to associate the client grant.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationClientGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage a client grant associated with an organization.

        :param str resource_name: The name of the resource.
        :param OrganizationClientGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationClientGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 grant_id: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationClientGrantArgs.__new__(OrganizationClientGrantArgs)

            if grant_id is None and not opts.urn:
                raise TypeError("Missing required property 'grant_id'")
            __props__.__dict__["grant_id"] = grant_id
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
        super(OrganizationClientGrant, __self__).__init__(
            'auth0:index/organizationClientGrant:OrganizationClientGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            grant_id: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None) -> 'OrganizationClientGrant':
        """
        Get an existing OrganizationClientGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] grant_id: A Client Grant ID to add to the organization.
        :param pulumi.Input[str] organization_id: The ID of the organization to associate the client grant.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationClientGrantState.__new__(_OrganizationClientGrantState)

        __props__.__dict__["grant_id"] = grant_id
        __props__.__dict__["organization_id"] = organization_id
        return OrganizationClientGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="grantId")
    def grant_id(self) -> pulumi.Output[str]:
        """
        A Client Grant ID to add to the organization.
        """
        return pulumi.get(self, "grant_id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization to associate the client grant.
        """
        return pulumi.get(self, "organization_id")
