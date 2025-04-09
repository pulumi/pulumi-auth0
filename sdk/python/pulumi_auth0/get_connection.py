# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetConnectionResult',
    'AwaitableGetConnectionResult',
    'get_connection',
    'get_connection_output',
]

@pulumi.output_type
class GetConnectionResult:
    """
    A collection of values returned by getConnection.
    """
    def __init__(__self__, connection_id=None, display_name=None, enabled_clients=None, id=None, is_domain_connection=None, metadata=None, name=None, options=None, realms=None, show_as_button=None, strategy=None):
        if connection_id and not isinstance(connection_id, str):
            raise TypeError("Expected argument 'connection_id' to be a str")
        pulumi.set(__self__, "connection_id", connection_id)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if enabled_clients and not isinstance(enabled_clients, list):
            raise TypeError("Expected argument 'enabled_clients' to be a list")
        pulumi.set(__self__, "enabled_clients", enabled_clients)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_domain_connection and not isinstance(is_domain_connection, bool):
            raise TypeError("Expected argument 'is_domain_connection' to be a bool")
        pulumi.set(__self__, "is_domain_connection", is_domain_connection)
        if metadata and not isinstance(metadata, dict):
            raise TypeError("Expected argument 'metadata' to be a dict")
        pulumi.set(__self__, "metadata", metadata)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if options and not isinstance(options, list):
            raise TypeError("Expected argument 'options' to be a list")
        pulumi.set(__self__, "options", options)
        if realms and not isinstance(realms, list):
            raise TypeError("Expected argument 'realms' to be a list")
        pulumi.set(__self__, "realms", realms)
        if show_as_button and not isinstance(show_as_button, bool):
            raise TypeError("Expected argument 'show_as_button' to be a bool")
        pulumi.set(__self__, "show_as_button", show_as_button)
        if strategy and not isinstance(strategy, str):
            raise TypeError("Expected argument 'strategy' to be a str")
        pulumi.set(__self__, "strategy", strategy)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[builtins.str]:
        """
        The ID of the connection. If not provided, `name` must be set.
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        """
        Name used in login screen.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="enabledClients")
    def enabled_clients(self) -> Sequence[builtins.str]:
        """
        IDs of the clients for which the connection is enabled.
        """
        return pulumi.get(self, "enabled_clients")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isDomainConnection")
    def is_domain_connection(self) -> builtins.bool:
        """
        Indicates whether the connection is domain level.
        """
        return pulumi.get(self, "is_domain_connection")

    @property
    @pulumi.getter
    def metadata(self) -> Mapping[str, builtins.str]:
        """
        Metadata associated with the connection, in the form of a map of string values (max 255 chars).
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        The name of the connection. If not provided, `connection_id` must be set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def options(self) -> Sequence['outputs.GetConnectionOptionResult']:
        """
        Configuration settings for connection options.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def realms(self) -> Sequence[builtins.str]:
        """
        Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
        """
        return pulumi.get(self, "realms")

    @property
    @pulumi.getter(name="showAsButton")
    def show_as_button(self) -> builtins.bool:
        """
        Display connection as a button. Only available on enterprise connections.
        """
        return pulumi.get(self, "show_as_button")

    @property
    @pulumi.getter
    def strategy(self) -> builtins.str:
        """
        Type of the connection, which indicates the identity provider.
        """
        return pulumi.get(self, "strategy")


class AwaitableGetConnectionResult(GetConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConnectionResult(
            connection_id=self.connection_id,
            display_name=self.display_name,
            enabled_clients=self.enabled_clients,
            id=self.id,
            is_domain_connection=self.is_domain_connection,
            metadata=self.metadata,
            name=self.name,
            options=self.options,
            realms=self.realms,
            show_as_button=self.show_as_button,
            strategy=self.strategy)


def get_connection(connection_id: Optional[builtins.str] = None,
                   name: Optional[builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConnectionResult:
    """
    Data source to retrieve a specific Auth0 connection by `connection_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Connection loaded using its name.
    some_connection_by_name = auth0.get_connection(name="Acceptance-Test-Connection-{{.testName}}")
    # An Auth0 Connection loaded using its ID.
    some_connection_by_id = auth0.get_connection(connection_id="con_abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param builtins.str connection_id: The ID of the connection. If not provided, `name` must be set.
    :param builtins.str name: The name of the connection. If not provided, `connection_id` must be set.
    """
    __args__ = dict()
    __args__['connectionId'] = connection_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getConnection:getConnection', __args__, opts=opts, typ=GetConnectionResult).value

    return AwaitableGetConnectionResult(
        connection_id=pulumi.get(__ret__, 'connection_id'),
        display_name=pulumi.get(__ret__, 'display_name'),
        enabled_clients=pulumi.get(__ret__, 'enabled_clients'),
        id=pulumi.get(__ret__, 'id'),
        is_domain_connection=pulumi.get(__ret__, 'is_domain_connection'),
        metadata=pulumi.get(__ret__, 'metadata'),
        name=pulumi.get(__ret__, 'name'),
        options=pulumi.get(__ret__, 'options'),
        realms=pulumi.get(__ret__, 'realms'),
        show_as_button=pulumi.get(__ret__, 'show_as_button'),
        strategy=pulumi.get(__ret__, 'strategy'))
def get_connection_output(connection_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                          name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConnectionResult]:
    """
    Data source to retrieve a specific Auth0 connection by `connection_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Connection loaded using its name.
    some_connection_by_name = auth0.get_connection(name="Acceptance-Test-Connection-{{.testName}}")
    # An Auth0 Connection loaded using its ID.
    some_connection_by_id = auth0.get_connection(connection_id="con_abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param builtins.str connection_id: The ID of the connection. If not provided, `name` must be set.
    :param builtins.str name: The name of the connection. If not provided, `connection_id` must be set.
    """
    __args__ = dict()
    __args__['connectionId'] = connection_id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getConnection:getConnection', __args__, opts=opts, typ=GetConnectionResult)
    return __ret__.apply(lambda __response__: GetConnectionResult(
        connection_id=pulumi.get(__response__, 'connection_id'),
        display_name=pulumi.get(__response__, 'display_name'),
        enabled_clients=pulumi.get(__response__, 'enabled_clients'),
        id=pulumi.get(__response__, 'id'),
        is_domain_connection=pulumi.get(__response__, 'is_domain_connection'),
        metadata=pulumi.get(__response__, 'metadata'),
        name=pulumi.get(__response__, 'name'),
        options=pulumi.get(__response__, 'options'),
        realms=pulumi.get(__response__, 'realms'),
        show_as_button=pulumi.get(__response__, 'show_as_button'),
        strategy=pulumi.get(__response__, 'strategy')))
