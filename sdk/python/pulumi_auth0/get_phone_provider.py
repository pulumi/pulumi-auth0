# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetPhoneProviderResult',
    'AwaitableGetPhoneProviderResult',
    'get_phone_provider',
    'get_phone_provider_output',
]

@pulumi.output_type
class GetPhoneProviderResult:
    """
    A collection of values returned by getPhoneProvider.
    """
    def __init__(__self__, channel=None, configurations=None, credentials=None, disabled=None, id=None, name=None, tenant=None):
        if channel and not isinstance(channel, str):
            raise TypeError("Expected argument 'channel' to be a str")
        pulumi.set(__self__, "channel", channel)
        if configurations and not isinstance(configurations, list):
            raise TypeError("Expected argument 'configurations' to be a list")
        pulumi.set(__self__, "configurations", configurations)
        if credentials and not isinstance(credentials, list):
            raise TypeError("Expected argument 'credentials' to be a list")
        pulumi.set(__self__, "credentials", credentials)
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tenant and not isinstance(tenant, str):
            raise TypeError("Expected argument 'tenant' to be a str")
        pulumi.set(__self__, "tenant", tenant)

    @_builtins.property
    @pulumi.getter
    def channel(self) -> _builtins.str:
        """
        The channel of the phone provider.
        """
        return pulumi.get(self, "channel")

    @_builtins.property
    @pulumi.getter
    def configurations(self) -> Sequence['outputs.GetPhoneProviderConfigurationResult']:
        """
        Specific phone provider settings.
        """
        return pulumi.get(self, "configurations")

    @_builtins.property
    @pulumi.getter
    def credentials(self) -> Sequence['outputs.GetPhoneProviderCredentialResult']:
        """
        Provider credentials required to use authenticate to the provider.
        """
        return pulumi.get(self, "credentials")

    @_builtins.property
    @pulumi.getter
    def disabled(self) -> _builtins.bool:
        """
        Indicates whether the phone provider is enabled (false) or disabled (true).
        """
        return pulumi.get(self, "disabled")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the Phone Provider.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the phone provider. Options include `twilio`, `custom`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tenant(self) -> _builtins.str:
        """
        The tenant of the phone provider.
        """
        return pulumi.get(self, "tenant")


class AwaitableGetPhoneProviderResult(GetPhoneProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPhoneProviderResult(
            channel=self.channel,
            configurations=self.configurations,
            credentials=self.credentials,
            disabled=self.disabled,
            id=self.id,
            name=self.name,
            tenant=self.tenant)


def get_phone_provider(id: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPhoneProviderResult:
    """
    Data source to retrieve a specific Auth0 Phone Provider by `id`.


    :param _builtins.str id: The ID of the Phone Provider.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getPhoneProvider:getPhoneProvider', __args__, opts=opts, typ=GetPhoneProviderResult).value

    return AwaitableGetPhoneProviderResult(
        channel=pulumi.get(__ret__, 'channel'),
        configurations=pulumi.get(__ret__, 'configurations'),
        credentials=pulumi.get(__ret__, 'credentials'),
        disabled=pulumi.get(__ret__, 'disabled'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tenant=pulumi.get(__ret__, 'tenant'))
def get_phone_provider_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPhoneProviderResult]:
    """
    Data source to retrieve a specific Auth0 Phone Provider by `id`.


    :param _builtins.str id: The ID of the Phone Provider.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getPhoneProvider:getPhoneProvider', __args__, opts=opts, typ=GetPhoneProviderResult)
    return __ret__.apply(lambda __response__: GetPhoneProviderResult(
        channel=pulumi.get(__response__, 'channel'),
        configurations=pulumi.get(__response__, 'configurations'),
        credentials=pulumi.get(__response__, 'credentials'),
        disabled=pulumi.get(__response__, 'disabled'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        tenant=pulumi.get(__response__, 'tenant')))
