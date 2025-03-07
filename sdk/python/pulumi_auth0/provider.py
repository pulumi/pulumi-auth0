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

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_token: Optional[pulumi.Input[str]] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 debug: Optional[pulumi.Input[bool]] = None,
                 domain: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] api_token: Your Auth0 [management api access
               token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
               the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
               specified, `api_token` will be used over `client_id` + `client_secret` fields.
        :param pulumi.Input[str] audience: Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        :param pulumi.Input[str] client_id: Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        :param pulumi.Input[str] client_secret: Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        :param pulumi.Input[bool] debug: Indicates whether to turn on debug mode.
        :param pulumi.Input[str] domain: Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        """
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if audience is not None:
            pulumi.set(__self__, "audience", audience)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if debug is None:
            debug = _utilities.get_env_bool('AUTH0_DEBUG')
        if debug is not None:
            pulumi.set(__self__, "debug", debug)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        Your Auth0 [management api access
        token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
        the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
        specified, `api_token` will be used over `client_id` + `client_secret` fields.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter
    def audience(self) -> Optional[pulumi.Input[str]]:
        """
        Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        """
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audience", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter
    def debug(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether to turn on debug mode.
        """
        return pulumi.get(self, "debug")

    @debug.setter
    def debug(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "debug", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 debug: Optional[pulumi.Input[bool]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the auth0 package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_token: Your Auth0 [management api access
               token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
               the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
               specified, `api_token` will be used over `client_id` + `client_secret` fields.
        :param pulumi.Input[str] audience: Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        :param pulumi.Input[str] client_id: Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        :param pulumi.Input[str] client_secret: Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        :param pulumi.Input[bool] debug: Indicates whether to turn on debug mode.
        :param pulumi.Input[str] domain: Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the auth0 package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 debug: Optional[pulumi.Input[bool]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["api_token"] = api_token
            __props__.__dict__["audience"] = audience
            __props__.__dict__["client_id"] = client_id
            __props__.__dict__["client_secret"] = client_secret
            if debug is None:
                debug = _utilities.get_env_bool('AUTH0_DEBUG')
            __props__.__dict__["debug"] = pulumi.Output.from_input(debug).apply(pulumi.runtime.to_json) if debug is not None else None
            __props__.__dict__["domain"] = domain
        super(Provider, __self__).__init__(
            'auth0',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional[str]]:
        """
        Your Auth0 [management api access
        token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
        the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
        specified, `api_token` will be used over `client_id` + `client_secret` fields.
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Output[Optional[str]]:
        """
        Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        """
        return pulumi.get(self, "audience")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[Optional[str]]:
        """
        Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[Optional[str]]:
        """
        Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        """
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[Optional[str]]:
        """
        Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        """
        return pulumi.get(self, "domain")

