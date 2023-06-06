# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ResourceServerScopesArgs', 'ResourceServerScopes']

@pulumi.input_type
class ResourceServerScopesArgs:
    def __init__(__self__, *,
                 resource_server_identifier: pulumi.Input[str],
                 scopes: pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]):
        """
        The set of arguments for constructing a ResourceServerScopes resource.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scopes (permission) are associated with.
        """
        pulumi.set(__self__, "resource_server_identifier", resource_server_identifier)
        pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the resource server that the scopes (permission) are associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_server_identifier", value)

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]:
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]):
        pulumi.set(self, "scopes", value)


@pulumi.input_type
class _ResourceServerScopesState:
    def __init__(__self__, *,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]] = None):
        """
        Input properties used for looking up and filtering ResourceServerScopes resources.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scopes (permission) are associated with.
        """
        if resource_server_identifier is not None:
            pulumi.set(__self__, "resource_server_identifier", resource_server_identifier)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the resource server that the scopes (permission) are associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_server_identifier", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]]:
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopesScopeArgs']]]]):
        pulumi.set(self, "scopes", value)


class ResourceServerScopes(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopesScopeArgs']]]]] = None,
                 __props__=None):
        """
        With this resource, you can manage scopes (permissions) associated with a resource server (API).

        !> To prevent issues, avoid using this resource together with the `ResourceServerScope` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_api = auth0.ResourceServer("myApi", identifier="https://api.example.com")
        my_api_scopes = auth0.ResourceServerScopes("myApiScopes",
            resource_server_identifier=my_api.identifier,
            scopes=[
                auth0.ResourceServerScopesScopeArgs(
                    name="create:appointments",
                    description="Ability to create appointments",
                ),
                auth0.ResourceServerScopesScopeArgs(
                    name="read:appointments",
                    description="Ability to read appointments",
                ),
            ])
        ```

        ## Import

        This resource can be imported by specifying the resource server identifier. # Example

        ```sh
         $ pulumi import auth0:index/resourceServerScopes:ResourceServerScopes my_api_scopes "https://api.travel0.com/v1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scopes (permission) are associated with.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceServerScopesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage scopes (permissions) associated with a resource server (API).

        !> To prevent issues, avoid using this resource together with the `ResourceServerScope` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_api = auth0.ResourceServer("myApi", identifier="https://api.example.com")
        my_api_scopes = auth0.ResourceServerScopes("myApiScopes",
            resource_server_identifier=my_api.identifier,
            scopes=[
                auth0.ResourceServerScopesScopeArgs(
                    name="create:appointments",
                    description="Ability to create appointments",
                ),
                auth0.ResourceServerScopesScopeArgs(
                    name="read:appointments",
                    description="Ability to read appointments",
                ),
            ])
        ```

        ## Import

        This resource can be imported by specifying the resource server identifier. # Example

        ```sh
         $ pulumi import auth0:index/resourceServerScopes:ResourceServerScopes my_api_scopes "https://api.travel0.com/v1"
        ```

        :param str resource_name: The name of the resource.
        :param ResourceServerScopesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceServerScopesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopesScopeArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceServerScopesArgs.__new__(ResourceServerScopesArgs)

            if resource_server_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'resource_server_identifier'")
            __props__.__dict__["resource_server_identifier"] = resource_server_identifier
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
        super(ResourceServerScopes, __self__).__init__(
            'auth0:index/resourceServerScopes:ResourceServerScopes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            resource_server_identifier: Optional[pulumi.Input[str]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopesScopeArgs']]]]] = None) -> 'ResourceServerScopes':
        """
        Get an existing ResourceServerScopes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scopes (permission) are associated with.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceServerScopesState.__new__(_ResourceServerScopesState)

        __props__.__dict__["resource_server_identifier"] = resource_server_identifier
        __props__.__dict__["scopes"] = scopes
        return ResourceServerScopes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the resource server that the scopes (permission) are associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Sequence['outputs.ResourceServerScopesScope']]:
        return pulumi.get(self, "scopes")
