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

__all__ = [
    'GetConnectionScimConfigurationResult',
    'AwaitableGetConnectionScimConfigurationResult',
    'get_connection_scim_configuration',
    'get_connection_scim_configuration_output',
]

@pulumi.output_type
class GetConnectionScimConfigurationResult:
    """
    A collection of values returned by getConnectionScimConfiguration.
    """
    def __init__(__self__, connection_id=None, connection_name=None, default_mappings=None, id=None, mappings=None, strategy=None, tenant_name=None, user_id_attribute=None):
        if connection_id and not isinstance(connection_id, str):
            raise TypeError("Expected argument 'connection_id' to be a str")
        pulumi.set(__self__, "connection_id", connection_id)
        if connection_name and not isinstance(connection_name, str):
            raise TypeError("Expected argument 'connection_name' to be a str")
        pulumi.set(__self__, "connection_name", connection_name)
        if default_mappings and not isinstance(default_mappings, list):
            raise TypeError("Expected argument 'default_mappings' to be a list")
        pulumi.set(__self__, "default_mappings", default_mappings)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mappings and not isinstance(mappings, list):
            raise TypeError("Expected argument 'mappings' to be a list")
        pulumi.set(__self__, "mappings", mappings)
        if strategy and not isinstance(strategy, str):
            raise TypeError("Expected argument 'strategy' to be a str")
        pulumi.set(__self__, "strategy", strategy)
        if tenant_name and not isinstance(tenant_name, str):
            raise TypeError("Expected argument 'tenant_name' to be a str")
        pulumi.set(__self__, "tenant_name", tenant_name)
        if user_id_attribute and not isinstance(user_id_attribute, str):
            raise TypeError("Expected argument 'user_id_attribute' to be a str")
        pulumi.set(__self__, "user_id_attribute", user_id_attribute)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> str:
        """
        ID of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> str:
        """
        Name of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "connection_name")

    @property
    @pulumi.getter(name="defaultMappings")
    def default_mappings(self) -> Sequence['outputs.GetConnectionScimConfigurationDefaultMappingResult']:
        """
        Default mapping between Auth0 attributes and SCIM attributes for this connection type.
        """
        return pulumi.get(self, "default_mappings")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def mappings(self) -> Sequence['outputs.GetConnectionScimConfigurationMappingResult']:
        """
        Mapping between Auth0 attributes and SCIM attributes.
        """
        return pulumi.get(self, "mappings")

    @property
    @pulumi.getter
    def strategy(self) -> str:
        """
        Schema of the connection for this SCIM configuration.
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> str:
        """
        Name of the tenant for this SCIM configuration.
        """
        return pulumi.get(self, "tenant_name")

    @property
    @pulumi.getter(name="userIdAttribute")
    def user_id_attribute(self) -> str:
        """
        User ID attribute for generation unique of user ids.
        """
        return pulumi.get(self, "user_id_attribute")


class AwaitableGetConnectionScimConfigurationResult(GetConnectionScimConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectionScimConfigurationResult(
            connection_id=self.connection_id,
            connection_name=self.connection_name,
            default_mappings=self.default_mappings,
            id=self.id,
            mappings=self.mappings,
            strategy=self.strategy,
            tenant_name=self.tenant_name,
            user_id_attribute=self.user_id_attribute)


def get_connection_scim_configuration(connection_id: Optional[str] = None,
                                      default_mappings: Optional[Sequence[Union['GetConnectionScimConfigurationDefaultMappingArgs', 'GetConnectionScimConfigurationDefaultMappingArgsDict']]] = None,
                                      mappings: Optional[Sequence[Union['GetConnectionScimConfigurationMappingArgs', 'GetConnectionScimConfigurationMappingArgsDict']]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectionScimConfigurationResult:
    """
    Data source to retrieve a SCIM configuration for an Auth0 connection by `connection_id`.

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
    my_conn_scim_configuration = auth0.ConnectionScimConfiguration("my_conn_scim_configuration", connection_id=my_enterprise_connection.id)
    # A data source for an Auth0 Connection SCIM Configuration.
    my_conn_scim_configuration_data = auth0.get_connection_scim_configuration_output(connection_id=my_conn_scim_configuration.id)
    ```


    :param str connection_id: ID of the connection for this SCIM configuration.
    :param Sequence[Union['GetConnectionScimConfigurationDefaultMappingArgs', 'GetConnectionScimConfigurationDefaultMappingArgsDict']] default_mappings: Default mapping between Auth0 attributes and SCIM attributes for this connection type.
    :param Sequence[Union['GetConnectionScimConfigurationMappingArgs', 'GetConnectionScimConfigurationMappingArgsDict']] mappings: Mapping between Auth0 attributes and SCIM attributes.
    """
    __args__ = dict()
    __args__['connectionId'] = connection_id
    __args__['defaultMappings'] = default_mappings
    __args__['mappings'] = mappings
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getConnectionScimConfiguration:getConnectionScimConfiguration', __args__, opts=opts, typ=GetConnectionScimConfigurationResult).value

    return AwaitableGetConnectionScimConfigurationResult(
        connection_id=pulumi.get(__ret__, 'connection_id'),
        connection_name=pulumi.get(__ret__, 'connection_name'),
        default_mappings=pulumi.get(__ret__, 'default_mappings'),
        id=pulumi.get(__ret__, 'id'),
        mappings=pulumi.get(__ret__, 'mappings'),
        strategy=pulumi.get(__ret__, 'strategy'),
        tenant_name=pulumi.get(__ret__, 'tenant_name'),
        user_id_attribute=pulumi.get(__ret__, 'user_id_attribute'))


@_utilities.lift_output_func(get_connection_scim_configuration)
def get_connection_scim_configuration_output(connection_id: Optional[pulumi.Input[str]] = None,
                                             default_mappings: Optional[pulumi.Input[Optional[Sequence[Union['GetConnectionScimConfigurationDefaultMappingArgs', 'GetConnectionScimConfigurationDefaultMappingArgsDict']]]]] = None,
                                             mappings: Optional[pulumi.Input[Optional[Sequence[Union['GetConnectionScimConfigurationMappingArgs', 'GetConnectionScimConfigurationMappingArgsDict']]]]] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConnectionScimConfigurationResult]:
    """
    Data source to retrieve a SCIM configuration for an Auth0 connection by `connection_id`.

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
    my_conn_scim_configuration = auth0.ConnectionScimConfiguration("my_conn_scim_configuration", connection_id=my_enterprise_connection.id)
    # A data source for an Auth0 Connection SCIM Configuration.
    my_conn_scim_configuration_data = auth0.get_connection_scim_configuration_output(connection_id=my_conn_scim_configuration.id)
    ```


    :param str connection_id: ID of the connection for this SCIM configuration.
    :param Sequence[Union['GetConnectionScimConfigurationDefaultMappingArgs', 'GetConnectionScimConfigurationDefaultMappingArgsDict']] default_mappings: Default mapping between Auth0 attributes and SCIM attributes for this connection type.
    :param Sequence[Union['GetConnectionScimConfigurationMappingArgs', 'GetConnectionScimConfigurationMappingArgsDict']] mappings: Mapping between Auth0 attributes and SCIM attributes.
    """
    ...
