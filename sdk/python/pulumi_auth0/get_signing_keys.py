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
    'GetSigningKeysResult',
    'AwaitableGetSigningKeysResult',
    'get_signing_keys',
    'get_signing_keys_output',
]

@pulumi.output_type
class GetSigningKeysResult:
    """
    A collection of values returned by getSigningKeys.
    """
    def __init__(__self__, id=None, signing_keys=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if signing_keys and not isinstance(signing_keys, list):
            raise TypeError("Expected argument 'signing_keys' to be a list")
        pulumi.set(__self__, "signing_keys", signing_keys)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="signingKeys")
    def signing_keys(self) -> Sequence['outputs.GetSigningKeysSigningKeyResult']:
        """
        All application signing keys.
        """
        return pulumi.get(self, "signing_keys")


class AwaitableGetSigningKeysResult(GetSigningKeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSigningKeysResult(
            id=self.id,
            signing_keys=self.signing_keys)


def get_signing_keys(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSigningKeysResult:
    """
    Data source to retrieve signing keys used by the applications in your tenant. [Learn more](https://auth0.com/docs/get-started/tenant-settings/signing-keys).
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getSigningKeys:getSigningKeys', __args__, opts=opts, typ=GetSigningKeysResult).value

    return AwaitableGetSigningKeysResult(
        id=pulumi.get(__ret__, 'id'),
        signing_keys=pulumi.get(__ret__, 'signing_keys'))
def get_signing_keys_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSigningKeysResult]:
    """
    Data source to retrieve signing keys used by the applications in your tenant. [Learn more](https://auth0.com/docs/get-started/tenant-settings/signing-keys).
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getSigningKeys:getSigningKeys', __args__, opts=opts, typ=GetSigningKeysResult)
    return __ret__.apply(lambda __response__: GetSigningKeysResult(
        id=pulumi.get(__response__, 'id'),
        signing_keys=pulumi.get(__response__, 'signing_keys')))
