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
    'GetAttackProtectionResult',
    'AwaitableGetAttackProtectionResult',
    'get_attack_protection',
    'get_attack_protection_output',
]

@pulumi.output_type
class GetAttackProtectionResult:
    """
    A collection of values returned by getAttackProtection.
    """
    def __init__(__self__, breached_password_detections=None, brute_force_protections=None, id=None, suspicious_ip_throttlings=None):
        if breached_password_detections and not isinstance(breached_password_detections, list):
            raise TypeError("Expected argument 'breached_password_detections' to be a list")
        pulumi.set(__self__, "breached_password_detections", breached_password_detections)
        if brute_force_protections and not isinstance(brute_force_protections, list):
            raise TypeError("Expected argument 'brute_force_protections' to be a list")
        pulumi.set(__self__, "brute_force_protections", brute_force_protections)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if suspicious_ip_throttlings and not isinstance(suspicious_ip_throttlings, list):
            raise TypeError("Expected argument 'suspicious_ip_throttlings' to be a list")
        pulumi.set(__self__, "suspicious_ip_throttlings", suspicious_ip_throttlings)

    @_builtins.property
    @pulumi.getter(name="breachedPasswordDetections")
    def breached_password_detections(self) -> Sequence['outputs.GetAttackProtectionBreachedPasswordDetectionResult']:
        """
        Breached password detection protects your applications from bad actors logging in with stolen credentials.
        """
        return pulumi.get(self, "breached_password_detections")

    @_builtins.property
    @pulumi.getter(name="bruteForceProtections")
    def brute_force_protections(self) -> Sequence['outputs.GetAttackProtectionBruteForceProtectionResult']:
        """
        Brute-force protection safeguards against a single IP address attacking a single user account.
        """
        return pulumi.get(self, "brute_force_protections")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="suspiciousIpThrottlings")
    def suspicious_ip_throttlings(self) -> Sequence['outputs.GetAttackProtectionSuspiciousIpThrottlingResult']:
        """
        Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        return pulumi.get(self, "suspicious_ip_throttlings")


class AwaitableGetAttackProtectionResult(GetAttackProtectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAttackProtectionResult(
            breached_password_detections=self.breached_password_detections,
            brute_force_protections=self.brute_force_protections,
            id=self.id,
            suspicious_ip_throttlings=self.suspicious_ip_throttlings)


def get_attack_protection(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAttackProtectionResult:
    """
    Use this data source to access information about the tenant's attack protection settings.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_protection = auth0.get_attack_protection()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getAttackProtection:getAttackProtection', __args__, opts=opts, typ=GetAttackProtectionResult).value

    return AwaitableGetAttackProtectionResult(
        breached_password_detections=pulumi.get(__ret__, 'breached_password_detections'),
        brute_force_protections=pulumi.get(__ret__, 'brute_force_protections'),
        id=pulumi.get(__ret__, 'id'),
        suspicious_ip_throttlings=pulumi.get(__ret__, 'suspicious_ip_throttlings'))
def get_attack_protection_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAttackProtectionResult]:
    """
    Use this data source to access information about the tenant's attack protection settings.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_protection = auth0.get_attack_protection()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getAttackProtection:getAttackProtection', __args__, opts=opts, typ=GetAttackProtectionResult)
    return __ret__.apply(lambda __response__: GetAttackProtectionResult(
        breached_password_detections=pulumi.get(__response__, 'breached_password_detections'),
        brute_force_protections=pulumi.get(__response__, 'brute_force_protections'),
        id=pulumi.get(__response__, 'id'),
        suspicious_ip_throttlings=pulumi.get(__response__, 'suspicious_ip_throttlings')))
