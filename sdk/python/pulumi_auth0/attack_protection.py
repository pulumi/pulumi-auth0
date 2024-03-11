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

__all__ = ['AttackProtectionArgs', 'AttackProtection']

@pulumi.input_type
class AttackProtectionArgs:
    def __init__(__self__, *,
                 breached_password_detection: Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']] = None,
                 brute_force_protection: Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']] = None,
                 suspicious_ip_throttling: Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']] = None):
        """
        The set of arguments for constructing a AttackProtection resource.
        :param pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs'] breached_password_detection: Breached password detection protects your applications from bad actors logging in with stolen credentials.
        :param pulumi.Input['AttackProtectionBruteForceProtectionArgs'] brute_force_protection: Brute-force protection safeguards against a single IP address attacking a single user account.
        :param pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs'] suspicious_ip_throttling: Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        if breached_password_detection is not None:
            pulumi.set(__self__, "breached_password_detection", breached_password_detection)
        if brute_force_protection is not None:
            pulumi.set(__self__, "brute_force_protection", brute_force_protection)
        if suspicious_ip_throttling is not None:
            pulumi.set(__self__, "suspicious_ip_throttling", suspicious_ip_throttling)

    @property
    @pulumi.getter(name="breachedPasswordDetection")
    def breached_password_detection(self) -> Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']]:
        """
        Breached password detection protects your applications from bad actors logging in with stolen credentials.
        """
        return pulumi.get(self, "breached_password_detection")

    @breached_password_detection.setter
    def breached_password_detection(self, value: Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']]):
        pulumi.set(self, "breached_password_detection", value)

    @property
    @pulumi.getter(name="bruteForceProtection")
    def brute_force_protection(self) -> Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']]:
        """
        Brute-force protection safeguards against a single IP address attacking a single user account.
        """
        return pulumi.get(self, "brute_force_protection")

    @brute_force_protection.setter
    def brute_force_protection(self, value: Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']]):
        pulumi.set(self, "brute_force_protection", value)

    @property
    @pulumi.getter(name="suspiciousIpThrottling")
    def suspicious_ip_throttling(self) -> Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']]:
        """
        Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        return pulumi.get(self, "suspicious_ip_throttling")

    @suspicious_ip_throttling.setter
    def suspicious_ip_throttling(self, value: Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']]):
        pulumi.set(self, "suspicious_ip_throttling", value)


@pulumi.input_type
class _AttackProtectionState:
    def __init__(__self__, *,
                 breached_password_detection: Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']] = None,
                 brute_force_protection: Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']] = None,
                 suspicious_ip_throttling: Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']] = None):
        """
        Input properties used for looking up and filtering AttackProtection resources.
        :param pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs'] breached_password_detection: Breached password detection protects your applications from bad actors logging in with stolen credentials.
        :param pulumi.Input['AttackProtectionBruteForceProtectionArgs'] brute_force_protection: Brute-force protection safeguards against a single IP address attacking a single user account.
        :param pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs'] suspicious_ip_throttling: Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        if breached_password_detection is not None:
            pulumi.set(__self__, "breached_password_detection", breached_password_detection)
        if brute_force_protection is not None:
            pulumi.set(__self__, "brute_force_protection", brute_force_protection)
        if suspicious_ip_throttling is not None:
            pulumi.set(__self__, "suspicious_ip_throttling", suspicious_ip_throttling)

    @property
    @pulumi.getter(name="breachedPasswordDetection")
    def breached_password_detection(self) -> Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']]:
        """
        Breached password detection protects your applications from bad actors logging in with stolen credentials.
        """
        return pulumi.get(self, "breached_password_detection")

    @breached_password_detection.setter
    def breached_password_detection(self, value: Optional[pulumi.Input['AttackProtectionBreachedPasswordDetectionArgs']]):
        pulumi.set(self, "breached_password_detection", value)

    @property
    @pulumi.getter(name="bruteForceProtection")
    def brute_force_protection(self) -> Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']]:
        """
        Brute-force protection safeguards against a single IP address attacking a single user account.
        """
        return pulumi.get(self, "brute_force_protection")

    @brute_force_protection.setter
    def brute_force_protection(self, value: Optional[pulumi.Input['AttackProtectionBruteForceProtectionArgs']]):
        pulumi.set(self, "brute_force_protection", value)

    @property
    @pulumi.getter(name="suspiciousIpThrottling")
    def suspicious_ip_throttling(self) -> Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']]:
        """
        Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        return pulumi.get(self, "suspicious_ip_throttling")

    @suspicious_ip_throttling.setter
    def suspicious_ip_throttling(self, value: Optional[pulumi.Input['AttackProtectionSuspiciousIpThrottlingArgs']]):
        pulumi.set(self, "suspicious_ip_throttling", value)


class AttackProtection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 breached_password_detection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBreachedPasswordDetectionArgs']]] = None,
                 brute_force_protection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBruteForceProtectionArgs']]] = None,
                 suspicious_ip_throttling: Optional[pulumi.Input[pulumi.InputType['AttackProtectionSuspiciousIpThrottlingArgs']]] = None,
                 __props__=None):
        """
        Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHAs.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_protection = auth0.AttackProtection("myProtection",
            breached_password_detection=auth0.AttackProtectionBreachedPasswordDetectionArgs(
                admin_notification_frequencies=["daily"],
                enabled=True,
                method="standard",
                pre_user_registration=auth0.AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs(
                    shields=["block"],
                ),
                shields=[
                    "admin_notification",
                    "block",
                ],
            ),
            brute_force_protection=auth0.AttackProtectionBruteForceProtectionArgs(
                allowlists=["127.0.0.1"],
                enabled=True,
                max_attempts=5,
                mode="count_per_identifier_and_ip",
                shields=[
                    "block",
                    "user_notification",
                ],
            ),
            suspicious_ip_throttling=auth0.AttackProtectionSuspiciousIpThrottlingArgs(
                allowlists=["192.168.1.1"],
                enabled=True,
                pre_login=auth0.AttackProtectionSuspiciousIpThrottlingPreLoginArgs(
                    max_attempts=100,
                    rate=864000,
                ),
                pre_user_registration=auth0.AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs(
                    max_attempts=50,
                    rate=1200,
                ),
                shields=[
                    "admin_notification",
                    "block",
                ],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        attack_protection can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/attackProtection:AttackProtection my_protection "24940d4b-4bd4-44e7-894e-f92e4de36a40"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AttackProtectionBreachedPasswordDetectionArgs']] breached_password_detection: Breached password detection protects your applications from bad actors logging in with stolen credentials.
        :param pulumi.Input[pulumi.InputType['AttackProtectionBruteForceProtectionArgs']] brute_force_protection: Brute-force protection safeguards against a single IP address attacking a single user account.
        :param pulumi.Input[pulumi.InputType['AttackProtectionSuspiciousIpThrottlingArgs']] suspicious_ip_throttling: Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AttackProtectionArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHAs.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_protection = auth0.AttackProtection("myProtection",
            breached_password_detection=auth0.AttackProtectionBreachedPasswordDetectionArgs(
                admin_notification_frequencies=["daily"],
                enabled=True,
                method="standard",
                pre_user_registration=auth0.AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs(
                    shields=["block"],
                ),
                shields=[
                    "admin_notification",
                    "block",
                ],
            ),
            brute_force_protection=auth0.AttackProtectionBruteForceProtectionArgs(
                allowlists=["127.0.0.1"],
                enabled=True,
                max_attempts=5,
                mode="count_per_identifier_and_ip",
                shields=[
                    "block",
                    "user_notification",
                ],
            ),
            suspicious_ip_throttling=auth0.AttackProtectionSuspiciousIpThrottlingArgs(
                allowlists=["192.168.1.1"],
                enabled=True,
                pre_login=auth0.AttackProtectionSuspiciousIpThrottlingPreLoginArgs(
                    max_attempts=100,
                    rate=864000,
                ),
                pre_user_registration=auth0.AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs(
                    max_attempts=50,
                    rate=1200,
                ),
                shields=[
                    "admin_notification",
                    "block",
                ],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        attack_protection can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/attackProtection:AttackProtection my_protection "24940d4b-4bd4-44e7-894e-f92e4de36a40"
        ```

        :param str resource_name: The name of the resource.
        :param AttackProtectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AttackProtectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 breached_password_detection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBreachedPasswordDetectionArgs']]] = None,
                 brute_force_protection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBruteForceProtectionArgs']]] = None,
                 suspicious_ip_throttling: Optional[pulumi.Input[pulumi.InputType['AttackProtectionSuspiciousIpThrottlingArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AttackProtectionArgs.__new__(AttackProtectionArgs)

            __props__.__dict__["breached_password_detection"] = breached_password_detection
            __props__.__dict__["brute_force_protection"] = brute_force_protection
            __props__.__dict__["suspicious_ip_throttling"] = suspicious_ip_throttling
        super(AttackProtection, __self__).__init__(
            'auth0:index/attackProtection:AttackProtection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            breached_password_detection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBreachedPasswordDetectionArgs']]] = None,
            brute_force_protection: Optional[pulumi.Input[pulumi.InputType['AttackProtectionBruteForceProtectionArgs']]] = None,
            suspicious_ip_throttling: Optional[pulumi.Input[pulumi.InputType['AttackProtectionSuspiciousIpThrottlingArgs']]] = None) -> 'AttackProtection':
        """
        Get an existing AttackProtection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AttackProtectionBreachedPasswordDetectionArgs']] breached_password_detection: Breached password detection protects your applications from bad actors logging in with stolen credentials.
        :param pulumi.Input[pulumi.InputType['AttackProtectionBruteForceProtectionArgs']] brute_force_protection: Brute-force protection safeguards against a single IP address attacking a single user account.
        :param pulumi.Input[pulumi.InputType['AttackProtectionSuspiciousIpThrottlingArgs']] suspicious_ip_throttling: Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AttackProtectionState.__new__(_AttackProtectionState)

        __props__.__dict__["breached_password_detection"] = breached_password_detection
        __props__.__dict__["brute_force_protection"] = brute_force_protection
        __props__.__dict__["suspicious_ip_throttling"] = suspicious_ip_throttling
        return AttackProtection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="breachedPasswordDetection")
    def breached_password_detection(self) -> pulumi.Output['outputs.AttackProtectionBreachedPasswordDetection']:
        """
        Breached password detection protects your applications from bad actors logging in with stolen credentials.
        """
        return pulumi.get(self, "breached_password_detection")

    @property
    @pulumi.getter(name="bruteForceProtection")
    def brute_force_protection(self) -> pulumi.Output['outputs.AttackProtectionBruteForceProtection']:
        """
        Brute-force protection safeguards against a single IP address attacking a single user account.
        """
        return pulumi.get(self, "brute_force_protection")

    @property
    @pulumi.getter(name="suspiciousIpThrottling")
    def suspicious_ip_throttling(self) -> pulumi.Output['outputs.AttackProtectionSuspiciousIpThrottling']:
        """
        Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        """
        return pulumi.get(self, "suspicious_ip_throttling")

