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
from . import outputs
from ._inputs import *

__all__ = ['ConnectionScimConfigurationArgs', 'ConnectionScimConfiguration']

@pulumi.input_type
class ConnectionScimConfigurationArgs:
    def __init__(__self__, *,
                 connection_id: pulumi.Input[str],
                 mappings: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]] = None,
                 user_id_attribute: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ConnectionScimConfiguration resource.
        :param pulumi.Input[str] connection_id: ID of the connection for this SCIM configuration.
        :param pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]] mappings: Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        :param pulumi.Input[str] user_id_attribute: User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        pulumi.set(__self__, "connection_id", connection_id)
        if mappings is not None:
            pulumi.set(__self__, "mappings", mappings)
        if user_id_attribute is not None:
            pulumi.set(__self__, "user_id_attribute", user_id_attribute)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Input[str]:
        """
        ID of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter
    def mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]]:
        """
        Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        """
        return pulumi.get(self, "mappings")

    @mappings.setter
    def mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]]):
        pulumi.set(self, "mappings", value)

    @property
    @pulumi.getter(name="userIdAttribute")
    def user_id_attribute(self) -> Optional[pulumi.Input[str]]:
        """
        User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        return pulumi.get(self, "user_id_attribute")

    @user_id_attribute.setter
    def user_id_attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id_attribute", value)


@pulumi.input_type
class _ConnectionScimConfigurationState:
    def __init__(__self__, *,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 connection_name: Optional[pulumi.Input[str]] = None,
                 mappings: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]] = None,
                 strategy: Optional[pulumi.Input[str]] = None,
                 tenant_name: Optional[pulumi.Input[str]] = None,
                 user_id_attribute: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConnectionScimConfiguration resources.
        :param pulumi.Input[str] connection_id: ID of the connection for this SCIM configuration.
        :param pulumi.Input[str] connection_name: Name of the connection for this SCIM configuration.
        :param pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]] mappings: Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        :param pulumi.Input[str] strategy: Schema of the connection for this SCIM configuration.
        :param pulumi.Input[str] tenant_name: Name of the tenant for this SCIM configuration.
        :param pulumi.Input[str] user_id_attribute: User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if connection_name is not None:
            pulumi.set(__self__, "connection_name", connection_name)
        if mappings is not None:
            pulumi.set(__self__, "mappings", mappings)
        if strategy is not None:
            pulumi.set(__self__, "strategy", strategy)
        if tenant_name is not None:
            pulumi.set(__self__, "tenant_name", tenant_name)
        if user_id_attribute is not None:
            pulumi.set(__self__, "user_id_attribute", user_id_attribute)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_name")

    @connection_name.setter
    def connection_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_name", value)

    @property
    @pulumi.getter
    def mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]]:
        """
        Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        """
        return pulumi.get(self, "mappings")

    @mappings.setter
    def mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConnectionScimConfigurationMappingArgs']]]]):
        pulumi.set(self, "mappings", value)

    @property
    @pulumi.getter
    def strategy(self) -> Optional[pulumi.Input[str]]:
        """
        Schema of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the tenant for this SCIM configuration.
        """
        return pulumi.get(self, "tenant_name")

    @tenant_name.setter
    def tenant_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_name", value)

    @property
    @pulumi.getter(name="userIdAttribute")
    def user_id_attribute(self) -> Optional[pulumi.Input[str]]:
        """
        User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        return pulumi.get(self, "user_id_attribute")

    @user_id_attribute.setter
    def user_id_attribute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id_attribute", value)


class ConnectionScimConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectionScimConfigurationMappingArgs', 'ConnectionScimConfigurationMappingArgsDict']]]]] = None,
                 user_id_attribute: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can configure [SCIM(System for Cross-domain Identity Management)](https://simplecloud.info/) support for `SAML` and `OpenID Connect` Enterprise connections.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_enterprise_connection = auth0.Connection("my_enterprise_connection",
            name="my-enterprise-connection",
            display_name="My Enterprise Connection",
            strategy="okta",
            options={
                "client_id": "1234567",
                "client_secret": "1234567",
                "issuer": "https://example.okta.com",
                "jwks_uri": "https://example.okta.com/oauth2/v1/keys",
                "token_endpoint": "https://example.okta.com/oauth2/v1/token",
                "authorization_endpoint": "https://example.okta.com/oauth2/v1/authorize",
            })
        my_enterprise_connection2 = auth0.Connection("my_enterprise_connection_2",
            name="my-enterprise-connection-2",
            display_name="My Enterprise Connection 2",
            strategy="okta",
            options={
                "client_id": "1234567",
                "client_secret": "1234567",
                "issuer": "https://example.okta.com",
                "jwks_uri": "https://example.okta.com/oauth2/v1/keys",
                "token_endpoint": "https://example.okta.com/oauth2/v1/token",
                "authorization_endpoint": "https://example.okta.com/oauth2/v1/authorize",
            })
        # A resource for configuring an Auth0 Connection SCIM Configuration, using default values.
        # Only one can be specified for a connection.
        my_conn_scim_configuration_default = auth0.ConnectionScimConfiguration("my_conn_scim_configuration_default", connection_id=my_enterprise_connection.id)
        # A resource for configuring an Auth0 Connection SCIM Configuration, specifying `user_id_attribute` and `mapping`.
        # Only one can be specified for a connection.
        my_conn_scim_configuration = auth0.ConnectionScimConfiguration("my_conn_scim_configuration",
            connection_id=my_enterprise_connection2.id,
            user_id_attribute="attribute1",
            mappings=[
                {
                    "auth0": "auth0_attribute1",
                    "scim": "sacim_attribute1",
                },
                {
                    "auth0": "auth0_attribute2",
                    "scim": "sacim_attribute2",
                },
            ])
        ```

        ## Import

        This resource can be imported by specifying the connection ID <connectionID>

        Example:

        ```sh
        $ pulumi import auth0:index/connectionScimConfiguration:ConnectionScimConfiguration my_conn_scim_conf "con_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_id: ID of the connection for this SCIM configuration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConnectionScimConfigurationMappingArgs', 'ConnectionScimConfigurationMappingArgsDict']]]] mappings: Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        :param pulumi.Input[str] user_id_attribute: User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectionScimConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can configure [SCIM(System for Cross-domain Identity Management)](https://simplecloud.info/) support for `SAML` and `OpenID Connect` Enterprise connections.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_enterprise_connection = auth0.Connection("my_enterprise_connection",
            name="my-enterprise-connection",
            display_name="My Enterprise Connection",
            strategy="okta",
            options={
                "client_id": "1234567",
                "client_secret": "1234567",
                "issuer": "https://example.okta.com",
                "jwks_uri": "https://example.okta.com/oauth2/v1/keys",
                "token_endpoint": "https://example.okta.com/oauth2/v1/token",
                "authorization_endpoint": "https://example.okta.com/oauth2/v1/authorize",
            })
        my_enterprise_connection2 = auth0.Connection("my_enterprise_connection_2",
            name="my-enterprise-connection-2",
            display_name="My Enterprise Connection 2",
            strategy="okta",
            options={
                "client_id": "1234567",
                "client_secret": "1234567",
                "issuer": "https://example.okta.com",
                "jwks_uri": "https://example.okta.com/oauth2/v1/keys",
                "token_endpoint": "https://example.okta.com/oauth2/v1/token",
                "authorization_endpoint": "https://example.okta.com/oauth2/v1/authorize",
            })
        # A resource for configuring an Auth0 Connection SCIM Configuration, using default values.
        # Only one can be specified for a connection.
        my_conn_scim_configuration_default = auth0.ConnectionScimConfiguration("my_conn_scim_configuration_default", connection_id=my_enterprise_connection.id)
        # A resource for configuring an Auth0 Connection SCIM Configuration, specifying `user_id_attribute` and `mapping`.
        # Only one can be specified for a connection.
        my_conn_scim_configuration = auth0.ConnectionScimConfiguration("my_conn_scim_configuration",
            connection_id=my_enterprise_connection2.id,
            user_id_attribute="attribute1",
            mappings=[
                {
                    "auth0": "auth0_attribute1",
                    "scim": "sacim_attribute1",
                },
                {
                    "auth0": "auth0_attribute2",
                    "scim": "sacim_attribute2",
                },
            ])
        ```

        ## Import

        This resource can be imported by specifying the connection ID <connectionID>

        Example:

        ```sh
        $ pulumi import auth0:index/connectionScimConfiguration:ConnectionScimConfiguration my_conn_scim_conf "con_XXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param ConnectionScimConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectionScimConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_id: Optional[pulumi.Input[str]] = None,
                 mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectionScimConfigurationMappingArgs', 'ConnectionScimConfigurationMappingArgsDict']]]]] = None,
                 user_id_attribute: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectionScimConfigurationArgs.__new__(ConnectionScimConfigurationArgs)

            if connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'connection_id'")
            __props__.__dict__["connection_id"] = connection_id
            __props__.__dict__["mappings"] = mappings
            __props__.__dict__["user_id_attribute"] = user_id_attribute
            __props__.__dict__["connection_name"] = None
            __props__.__dict__["strategy"] = None
            __props__.__dict__["tenant_name"] = None
        super(ConnectionScimConfiguration, __self__).__init__(
            'auth0:index/connectionScimConfiguration:ConnectionScimConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_id: Optional[pulumi.Input[str]] = None,
            connection_name: Optional[pulumi.Input[str]] = None,
            mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConnectionScimConfigurationMappingArgs', 'ConnectionScimConfigurationMappingArgsDict']]]]] = None,
            strategy: Optional[pulumi.Input[str]] = None,
            tenant_name: Optional[pulumi.Input[str]] = None,
            user_id_attribute: Optional[pulumi.Input[str]] = None) -> 'ConnectionScimConfiguration':
        """
        Get an existing ConnectionScimConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_id: ID of the connection for this SCIM configuration.
        :param pulumi.Input[str] connection_name: Name of the connection for this SCIM configuration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConnectionScimConfigurationMappingArgs', 'ConnectionScimConfigurationMappingArgsDict']]]] mappings: Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        :param pulumi.Input[str] strategy: Schema of the connection for this SCIM configuration.
        :param pulumi.Input[str] tenant_name: Name of the tenant for this SCIM configuration.
        :param pulumi.Input[str] user_id_attribute: User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectionScimConfigurationState.__new__(_ConnectionScimConfigurationState)

        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["connection_name"] = connection_name
        __props__.__dict__["mappings"] = mappings
        __props__.__dict__["strategy"] = strategy
        __props__.__dict__["tenant_name"] = tenant_name
        __props__.__dict__["user_id_attribute"] = user_id_attribute
        return ConnectionScimConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[str]:
        """
        ID of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> pulumi.Output[str]:
        """
        Name of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_name")

    @property
    @pulumi.getter
    def mappings(self) -> pulumi.Output[Sequence['outputs.ConnectionScimConfigurationMapping']]:
        """
        Mapping between Auth0 attributes and SCIM attributes. If `user_id_attribute` is set, `mapping` must be set as well.
        """
        return pulumi.get(self, "mappings")

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Output[str]:
        """
        Schema of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> pulumi.Output[str]:
        """
        Name of the tenant for this SCIM configuration.
        """
        return pulumi.get(self, "tenant_name")

    @property
    @pulumi.getter(name="userIdAttribute")
    def user_id_attribute(self) -> pulumi.Output[str]:
        """
        User ID attribute for generation unique of user ids. If `user_id_attribute` is set, `mapping` must be set as well. Defaults to `userName` for SAML connections and `externalId` for OIDC connections.
        """
        return pulumi.get(self, "user_id_attribute")

