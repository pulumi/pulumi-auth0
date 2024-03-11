# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ResourceServerScopeArgs', 'ResourceServerScope']

@pulumi.input_type
class ResourceServerScopeArgs:
    def __init__(__self__, *,
                 resource_server_identifier: pulumi.Input[str],
                 scope: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ResourceServerScope resource.
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scope (permission) is associated with.
        :param pulumi.Input[str] scope: Name of the scope (permission).
        :param pulumi.Input[str] description: Description of the scope (permission).
        """
        pulumi.set(__self__, "resource_server_identifier", resource_server_identifier)
        pulumi.set(__self__, "scope", scope)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the resource server that the scope (permission) is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_server_identifier", value)

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Input[str]:
        """
        Name of the scope (permission).
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: pulumi.Input[str]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the scope (permission).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _ResourceServerScopeState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResourceServerScope resources.
        :param pulumi.Input[str] description: Description of the scope (permission).
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scope (permission) is associated with.
        :param pulumi.Input[str] scope: Name of the scope (permission).
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if resource_server_identifier is not None:
            pulumi.set(__self__, "resource_server_identifier", resource_server_identifier)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the scope (permission).
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the resource server that the scope (permission) is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @resource_server_identifier.setter
    def resource_server_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_server_identifier", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the scope (permission).
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)


class ResourceServerScope(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage scopes (permissions) associated with a resource server (API).

        !> This resource appends a scope to a resource server. In contrast, the `ResourceServerScopes` resource manages
        all the scopes assigned to a resource server. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `ResourceServerScopes` resource when managing scopes for the same resource server id.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        resource_server = auth0.ResourceServer("resourceServer", identifier="https://api.example.com")
        read_posts = auth0.ResourceServerScope("readPosts",
            resource_server_identifier=resource_server.identifier,
            scope="read:posts")
        write_posts = auth0.ResourceServerScope("writePosts",
            resource_server_identifier=resource_server.identifier,
            scope="write:posts")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        This resource can be imported by specifying the

        resource identifier and scope name separated by "::" (note the double colon)

        <resourceServerIdentifier>::<scope>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/resourceServerScope:ResourceServerScope scope "https://api.travel0.com/v1::read:posts"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the scope (permission).
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scope (permission) is associated with.
        :param pulumi.Input[str] scope: Name of the scope (permission).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceServerScopeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage scopes (permissions) associated with a resource server (API).

        !> This resource appends a scope to a resource server. In contrast, the `ResourceServerScopes` resource manages
        all the scopes assigned to a resource server. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `ResourceServerScopes` resource when managing scopes for the same resource server id.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        resource_server = auth0.ResourceServer("resourceServer", identifier="https://api.example.com")
        read_posts = auth0.ResourceServerScope("readPosts",
            resource_server_identifier=resource_server.identifier,
            scope="read:posts")
        write_posts = auth0.ResourceServerScope("writePosts",
            resource_server_identifier=resource_server.identifier,
            scope="write:posts")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        This resource can be imported by specifying the

        resource identifier and scope name separated by "::" (note the double colon)

        <resourceServerIdentifier>::<scope>

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/resourceServerScope:ResourceServerScope scope "https://api.travel0.com/v1::read:posts"
        ```

        :param str resource_name: The name of the resource.
        :param ResourceServerScopeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceServerScopeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 resource_server_identifier: Optional[pulumi.Input[str]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceServerScopeArgs.__new__(ResourceServerScopeArgs)

            __props__.__dict__["description"] = description
            if resource_server_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'resource_server_identifier'")
            __props__.__dict__["resource_server_identifier"] = resource_server_identifier
            if scope is None and not opts.urn:
                raise TypeError("Missing required property 'scope'")
            __props__.__dict__["scope"] = scope
        super(ResourceServerScope, __self__).__init__(
            'auth0:index/resourceServerScope:ResourceServerScope',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            resource_server_identifier: Optional[pulumi.Input[str]] = None,
            scope: Optional[pulumi.Input[str]] = None) -> 'ResourceServerScope':
        """
        Get an existing ResourceServerScope resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the scope (permission).
        :param pulumi.Input[str] resource_server_identifier: Identifier of the resource server that the scope (permission) is associated with.
        :param pulumi.Input[str] scope: Name of the scope (permission).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceServerScopeState.__new__(_ResourceServerScopeState)

        __props__.__dict__["description"] = description
        __props__.__dict__["resource_server_identifier"] = resource_server_identifier
        __props__.__dict__["scope"] = scope
        return ResourceServerScope(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the scope (permission).
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="resourceServerIdentifier")
    def resource_server_identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the resource server that the scope (permission) is associated with.
        """
        return pulumi.get(self, "resource_server_identifier")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[str]:
        """
        Name of the scope (permission).
        """
        return pulumi.get(self, "scope")

