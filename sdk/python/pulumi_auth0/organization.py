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

__all__ = ['OrganizationArgs', 'Organization']

@pulumi.input_type
class OrganizationArgs:
    def __init__(__self__, *,
                 branding: Optional[pulumi.Input['OrganizationBrandingArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Organization resource.
        :param pulumi.Input['OrganizationBrandingArgs'] branding: Defines how to style the login pages.
        :param pulumi.Input[str] display_name: Friendly name of this organization.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        :param pulumi.Input[str] name: The name of this organization.
        """
        OrganizationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            branding=branding,
            display_name=display_name,
            metadata=metadata,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             branding: Optional[pulumi.Input['OrganizationBrandingArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']

        if branding is not None:
            _setter("branding", branding)
        if display_name is not None:
            _setter("display_name", display_name)
        if metadata is not None:
            _setter("metadata", metadata)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def branding(self) -> Optional[pulumi.Input['OrganizationBrandingArgs']]:
        """
        Defines how to style the login pages.
        """
        return pulumi.get(self, "branding")

    @branding.setter
    def branding(self, value: Optional[pulumi.Input['OrganizationBrandingArgs']]):
        pulumi.set(self, "branding", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Friendly name of this organization.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _OrganizationState:
    def __init__(__self__, *,
                 branding: Optional[pulumi.Input['OrganizationBrandingArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Organization resources.
        :param pulumi.Input['OrganizationBrandingArgs'] branding: Defines how to style the login pages.
        :param pulumi.Input[str] display_name: Friendly name of this organization.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        :param pulumi.Input[str] name: The name of this organization.
        """
        _OrganizationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            branding=branding,
            display_name=display_name,
            metadata=metadata,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             branding: Optional[pulumi.Input['OrganizationBrandingArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']

        if branding is not None:
            _setter("branding", branding)
        if display_name is not None:
            _setter("display_name", display_name)
        if metadata is not None:
            _setter("metadata", metadata)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter
    def branding(self) -> Optional[pulumi.Input['OrganizationBrandingArgs']]:
        """
        Defines how to style the login pages.
        """
        return pulumi.get(self, "branding")

    @branding.setter
    def branding(self, value: Optional[pulumi.Input['OrganizationBrandingArgs']]):
        pulumi.set(self, "branding", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Friendly name of this organization.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Organization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branding: Optional[pulumi.Input[pulumi.InputType['OrganizationBrandingArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The Organizations feature represents a broad update to the Auth0 platform that allows our business-to-business (B2B) customers to better manage their partners and customers, and to customize the ways that end-users access their applications. Auth0 customers can use Organizations to:

          - Represent their business customers and partners in Auth0 and manage their
            membership.
          - Configure branded, federated login flows for each business.
          - Build administration capabilities into their products, using Organizations
            APIs, so that those businesses can manage their own organizations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_organization = auth0.Organization("myOrganization",
            branding=auth0.OrganizationBrandingArgs(
                colors={
                    "pageBackground": "#e1e1e1",
                    "primary": "#f2f2f2",
                },
                logo_url="https://example.com/assets/icons/icon.png",
            ),
            display_name="Auth0 Inc.")
        ```

        ## Import

        This resource can be imported by specifying the organization ID. # Example

        ```sh
         $ pulumi import auth0:index/organization:Organization my_organization "org_XXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OrganizationBrandingArgs']] branding: Defines how to style the login pages.
        :param pulumi.Input[str] display_name: Friendly name of this organization.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        :param pulumi.Input[str] name: The name of this organization.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[OrganizationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The Organizations feature represents a broad update to the Auth0 platform that allows our business-to-business (B2B) customers to better manage their partners and customers, and to customize the ways that end-users access their applications. Auth0 customers can use Organizations to:

          - Represent their business customers and partners in Auth0 and manage their
            membership.
          - Configure branded, federated login flows for each business.
          - Build administration capabilities into their products, using Organizations
            APIs, so that those businesses can manage their own organizations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_organization = auth0.Organization("myOrganization",
            branding=auth0.OrganizationBrandingArgs(
                colors={
                    "pageBackground": "#e1e1e1",
                    "primary": "#f2f2f2",
                },
                logo_url="https://example.com/assets/icons/icon.png",
            ),
            display_name="Auth0 Inc.")
        ```

        ## Import

        This resource can be imported by specifying the organization ID. # Example

        ```sh
         $ pulumi import auth0:index/organization:Organization my_organization "org_XXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            OrganizationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 branding: Optional[pulumi.Input[pulumi.InputType['OrganizationBrandingArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationArgs.__new__(OrganizationArgs)

            branding = _utilities.configure(branding, OrganizationBrandingArgs, True)
            __props__.__dict__["branding"] = branding
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
        super(Organization, __self__).__init__(
            'auth0:index/organization:Organization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            branding: Optional[pulumi.Input[pulumi.InputType['OrganizationBrandingArgs']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Organization':
        """
        Get an existing Organization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OrganizationBrandingArgs']] branding: Defines how to style the login pages.
        :param pulumi.Input[str] display_name: Friendly name of this organization.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] metadata: Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        :param pulumi.Input[str] name: The name of this organization.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationState.__new__(_OrganizationState)

        __props__.__dict__["branding"] = branding
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        return Organization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def branding(self) -> pulumi.Output['outputs.OrganizationBranding']:
        """
        Defines how to style the login pages.
        """
        return pulumi.get(self, "branding")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        Friendly name of this organization.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of this organization.
        """
        return pulumi.get(self, "name")

