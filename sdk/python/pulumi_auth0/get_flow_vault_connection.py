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

__all__ = [
    'GetFlowVaultConnectionResult',
    'AwaitableGetFlowVaultConnectionResult',
    'get_flow_vault_connection',
    'get_flow_vault_connection_output',
]

@pulumi.output_type
class GetFlowVaultConnectionResult:
    """
    A collection of values returned by getFlowVaultConnection.
    """
    def __init__(__self__, account_name=None, app_id=None, environment=None, fingerprint=None, id=None, name=None, ready=None, setup=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        pulumi.set(__self__, "account_name", account_name)
        if app_id and not isinstance(app_id, str):
            raise TypeError("Expected argument 'app_id' to be a str")
        pulumi.set(__self__, "app_id", app_id)
        if environment and not isinstance(environment, str):
            raise TypeError("Expected argument 'environment' to be a str")
        pulumi.set(__self__, "environment", environment)
        if fingerprint and not isinstance(fingerprint, str):
            raise TypeError("Expected argument 'fingerprint' to be a str")
        pulumi.set(__self__, "fingerprint", fingerprint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if ready and not isinstance(ready, bool):
            raise TypeError("Expected argument 'ready' to be a bool")
        pulumi.set(__self__, "ready", ready)
        if setup and not isinstance(setup, dict):
            raise TypeError("Expected argument 'setup' to be a dict")
        pulumi.set(__self__, "setup", setup)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        Custom account name of the vault connection.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> str:
        """
        App identifier of the vault connection.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def environment(self) -> str:
        """
        Environment of the vault connection.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        """
        Fingerprint of the vault connection.
        """
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the Flow Vault Connection.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the vault connection.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ready(self) -> bool:
        """
        Indicates if the vault connection is configured.
        """
        return pulumi.get(self, "ready")

    @property
    @pulumi.getter
    def setup(self) -> Mapping[str, str]:
        """
        Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        """
        return pulumi.get(self, "setup")


class AwaitableGetFlowVaultConnectionResult(GetFlowVaultConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlowVaultConnectionResult(
            account_name=self.account_name,
            app_id=self.app_id,
            environment=self.environment,
            fingerprint=self.fingerprint,
            id=self.id,
            name=self.name,
            ready=self.ready,
            setup=self.setup)


def get_flow_vault_connection(id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlowVaultConnectionResult:
    """
    Data source to retrieve a specific Auth0 Flow Vault Connection by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 flow vault connection loaded using its ID.
    data_connection = auth0.get_flow_vault_connection(id="ac_9m2uqjHsqs19riN9N6sZQ7")
    ```


    :param str id: The id of the Flow Vault Connection.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getFlowVaultConnection:getFlowVaultConnection', __args__, opts=opts, typ=GetFlowVaultConnectionResult).value

    return AwaitableGetFlowVaultConnectionResult(
        account_name=pulumi.get(__ret__, 'account_name'),
        app_id=pulumi.get(__ret__, 'app_id'),
        environment=pulumi.get(__ret__, 'environment'),
        fingerprint=pulumi.get(__ret__, 'fingerprint'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        ready=pulumi.get(__ret__, 'ready'),
        setup=pulumi.get(__ret__, 'setup'))
def get_flow_vault_connection_output(id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlowVaultConnectionResult]:
    """
    Data source to retrieve a specific Auth0 Flow Vault Connection by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 flow vault connection loaded using its ID.
    data_connection = auth0.get_flow_vault_connection(id="ac_9m2uqjHsqs19riN9N6sZQ7")
    ```


    :param str id: The id of the Flow Vault Connection.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getFlowVaultConnection:getFlowVaultConnection', __args__, opts=opts, typ=GetFlowVaultConnectionResult)
    return __ret__.apply(lambda __response__: GetFlowVaultConnectionResult(
        account_name=pulumi.get(__response__, 'account_name'),
        app_id=pulumi.get(__response__, 'app_id'),
        environment=pulumi.get(__response__, 'environment'),
        fingerprint=pulumi.get(__response__, 'fingerprint'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        ready=pulumi.get(__response__, 'ready'),
        setup=pulumi.get(__response__, 'setup')))
