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

__all__ = ['GuardianArgs', 'Guardian']

@pulumi.input_type
class GuardianArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 duo: Optional[pulumi.Input['GuardianDuoArgs']] = None,
                 email: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[bool]] = None,
                 phone: Optional[pulumi.Input['GuardianPhoneArgs']] = None,
                 push: Optional[pulumi.Input['GuardianPushArgs']] = None,
                 recovery_code: Optional[pulumi.Input[bool]] = None,
                 webauthn_platform: Optional[pulumi.Input['GuardianWebauthnPlatformArgs']] = None,
                 webauthn_roaming: Optional[pulumi.Input['GuardianWebauthnRoamingArgs']] = None):
        """
        The set of arguments for constructing a Guardian resource.
        :param pulumi.Input[str] policy: Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        :param pulumi.Input['GuardianDuoArgs'] duo: Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] email: Indicates whether email MFA is enabled.
        :param pulumi.Input[bool] otp: Indicates whether one time password MFA is enabled.
        :param pulumi.Input['GuardianPhoneArgs'] phone: Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        :param pulumi.Input['GuardianPushArgs'] push: Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] recovery_code: Indicates whether recovery code MFA is enabled.
        :param pulumi.Input['GuardianWebauthnPlatformArgs'] webauthn_platform: Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        :param pulumi.Input['GuardianWebauthnRoamingArgs'] webauthn_roaming: Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        pulumi.set(__self__, "policy", policy)
        if duo is not None:
            pulumi.set(__self__, "duo", duo)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if otp is not None:
            pulumi.set(__self__, "otp", otp)
        if phone is not None:
            pulumi.set(__self__, "phone", phone)
        if push is not None:
            pulumi.set(__self__, "push", push)
        if recovery_code is not None:
            pulumi.set(__self__, "recovery_code", recovery_code)
        if webauthn_platform is not None:
            pulumi.set(__self__, "webauthn_platform", webauthn_platform)
        if webauthn_roaming is not None:
            pulumi.set(__self__, "webauthn_roaming", webauthn_roaming)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter
    def duo(self) -> Optional[pulumi.Input['GuardianDuoArgs']]:
        """
        Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "duo")

    @duo.setter
    def duo(self, value: Optional[pulumi.Input['GuardianDuoArgs']]):
        pulumi.set(self, "duo", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether email MFA is enabled.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def otp(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether one time password MFA is enabled.
        """
        return pulumi.get(self, "otp")

    @otp.setter
    def otp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "otp", value)

    @property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input['GuardianPhoneArgs']]:
        """
        Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input['GuardianPhoneArgs']]):
        pulumi.set(self, "phone", value)

    @property
    @pulumi.getter
    def push(self) -> Optional[pulumi.Input['GuardianPushArgs']]:
        """
        Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "push")

    @push.setter
    def push(self, value: Optional[pulumi.Input['GuardianPushArgs']]):
        pulumi.set(self, "push", value)

    @property
    @pulumi.getter(name="recoveryCode")
    def recovery_code(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether recovery code MFA is enabled.
        """
        return pulumi.get(self, "recovery_code")

    @recovery_code.setter
    def recovery_code(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "recovery_code", value)

    @property
    @pulumi.getter(name="webauthnPlatform")
    def webauthn_platform(self) -> Optional[pulumi.Input['GuardianWebauthnPlatformArgs']]:
        """
        Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_platform")

    @webauthn_platform.setter
    def webauthn_platform(self, value: Optional[pulumi.Input['GuardianWebauthnPlatformArgs']]):
        pulumi.set(self, "webauthn_platform", value)

    @property
    @pulumi.getter(name="webauthnRoaming")
    def webauthn_roaming(self) -> Optional[pulumi.Input['GuardianWebauthnRoamingArgs']]:
        """
        Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_roaming")

    @webauthn_roaming.setter
    def webauthn_roaming(self, value: Optional[pulumi.Input['GuardianWebauthnRoamingArgs']]):
        pulumi.set(self, "webauthn_roaming", value)


@pulumi.input_type
class _GuardianState:
    def __init__(__self__, *,
                 duo: Optional[pulumi.Input['GuardianDuoArgs']] = None,
                 email: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[bool]] = None,
                 phone: Optional[pulumi.Input['GuardianPhoneArgs']] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 push: Optional[pulumi.Input['GuardianPushArgs']] = None,
                 recovery_code: Optional[pulumi.Input[bool]] = None,
                 webauthn_platform: Optional[pulumi.Input['GuardianWebauthnPlatformArgs']] = None,
                 webauthn_roaming: Optional[pulumi.Input['GuardianWebauthnRoamingArgs']] = None):
        """
        Input properties used for looking up and filtering Guardian resources.
        :param pulumi.Input['GuardianDuoArgs'] duo: Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] email: Indicates whether email MFA is enabled.
        :param pulumi.Input[bool] otp: Indicates whether one time password MFA is enabled.
        :param pulumi.Input['GuardianPhoneArgs'] phone: Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[str] policy: Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        :param pulumi.Input['GuardianPushArgs'] push: Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] recovery_code: Indicates whether recovery code MFA is enabled.
        :param pulumi.Input['GuardianWebauthnPlatformArgs'] webauthn_platform: Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        :param pulumi.Input['GuardianWebauthnRoamingArgs'] webauthn_roaming: Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        if duo is not None:
            pulumi.set(__self__, "duo", duo)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if otp is not None:
            pulumi.set(__self__, "otp", otp)
        if phone is not None:
            pulumi.set(__self__, "phone", phone)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if push is not None:
            pulumi.set(__self__, "push", push)
        if recovery_code is not None:
            pulumi.set(__self__, "recovery_code", recovery_code)
        if webauthn_platform is not None:
            pulumi.set(__self__, "webauthn_platform", webauthn_platform)
        if webauthn_roaming is not None:
            pulumi.set(__self__, "webauthn_roaming", webauthn_roaming)

    @property
    @pulumi.getter
    def duo(self) -> Optional[pulumi.Input['GuardianDuoArgs']]:
        """
        Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "duo")

    @duo.setter
    def duo(self, value: Optional[pulumi.Input['GuardianDuoArgs']]):
        pulumi.set(self, "duo", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether email MFA is enabled.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def otp(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether one time password MFA is enabled.
        """
        return pulumi.get(self, "otp")

    @otp.setter
    def otp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "otp", value)

    @property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input['GuardianPhoneArgs']]:
        """
        Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input['GuardianPhoneArgs']]):
        pulumi.set(self, "phone", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter
    def push(self) -> Optional[pulumi.Input['GuardianPushArgs']]:
        """
        Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "push")

    @push.setter
    def push(self, value: Optional[pulumi.Input['GuardianPushArgs']]):
        pulumi.set(self, "push", value)

    @property
    @pulumi.getter(name="recoveryCode")
    def recovery_code(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether recovery code MFA is enabled.
        """
        return pulumi.get(self, "recovery_code")

    @recovery_code.setter
    def recovery_code(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "recovery_code", value)

    @property
    @pulumi.getter(name="webauthnPlatform")
    def webauthn_platform(self) -> Optional[pulumi.Input['GuardianWebauthnPlatformArgs']]:
        """
        Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_platform")

    @webauthn_platform.setter
    def webauthn_platform(self, value: Optional[pulumi.Input['GuardianWebauthnPlatformArgs']]):
        pulumi.set(self, "webauthn_platform", value)

    @property
    @pulumi.getter(name="webauthnRoaming")
    def webauthn_roaming(self) -> Optional[pulumi.Input['GuardianWebauthnRoamingArgs']]:
        """
        Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_roaming")

    @webauthn_roaming.setter
    def webauthn_roaming(self, value: Optional[pulumi.Input['GuardianWebauthnRoamingArgs']]):
        pulumi.set(self, "webauthn_roaming", value)


class Guardian(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 duo: Optional[pulumi.Input[Union['GuardianDuoArgs', 'GuardianDuoArgsDict']]] = None,
                 email: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[bool]] = None,
                 phone: Optional[pulumi.Input[Union['GuardianPhoneArgs', 'GuardianPhoneArgsDict']]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 push: Optional[pulumi.Input[Union['GuardianPushArgs', 'GuardianPushArgsDict']]] = None,
                 recovery_code: Optional[pulumi.Input[bool]] = None,
                 webauthn_platform: Optional[pulumi.Input[Union['GuardianWebauthnPlatformArgs', 'GuardianWebauthnPlatformArgsDict']]] = None,
                 webauthn_roaming: Optional[pulumi.Input[Union['GuardianWebauthnRoamingArgs', 'GuardianWebauthnRoamingArgsDict']]] = None,
                 __props__=None):
        """
        Multi-Factor Authentication works by requiring additional factors during the login process to prevent unauthorized access. With this resource you can configure some options available for MFA.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_guardian = auth0.Guardian("my_guardian",
            policy="all-applications",
            email=True,
            otp=True,
            recovery_code=True,
            webauthn_platform={
                "enabled": True,
            },
            webauthn_roaming={
                "enabled": True,
                "user_verification": "required",
            },
            phone={
                "enabled": True,
                "provider": "auth0",
                "message_types": [
                    "sms",
                    "voice",
                ],
                "options": {
                    "enrollment_message": "{{code}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment.",
                    "verification_message": "{{code}} is your verification code for {{tenant.friendly_name}}.",
                },
            },
            push={
                "enabled": True,
                "provider": "sns",
                "amazon_sns": {
                    "aws_access_key_id": "test1",
                    "aws_region": "us-west-1",
                    "aws_secret_access_key": "secretKey",
                    "sns_apns_platform_application_arn": "test_arn",
                    "sns_gcm_platform_application_arn": "test_arn",
                },
                "custom_app": {
                    "app_name": "CustomApp",
                    "apple_app_link": "https://itunes.apple.com/us/app/my-app/id123121",
                    "google_app_link": "https://play.google.com/store/apps/details?id=com.my.app",
                },
            },
            duo={
                "enabled": True,
                "integration_key": "someKey",
                "secret_key": "someSecret",
                "hostname": "api-hostname",
            })
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        guardian can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/guardian:Guardian my_guardian "24940d4b-4bd4-44e7-894e-f92e4de36a40"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['GuardianDuoArgs', 'GuardianDuoArgsDict']] duo: Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] email: Indicates whether email MFA is enabled.
        :param pulumi.Input[bool] otp: Indicates whether one time password MFA is enabled.
        :param pulumi.Input[Union['GuardianPhoneArgs', 'GuardianPhoneArgsDict']] phone: Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[str] policy: Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        :param pulumi.Input[Union['GuardianPushArgs', 'GuardianPushArgsDict']] push: Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] recovery_code: Indicates whether recovery code MFA is enabled.
        :param pulumi.Input[Union['GuardianWebauthnPlatformArgs', 'GuardianWebauthnPlatformArgsDict']] webauthn_platform: Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[Union['GuardianWebauthnRoamingArgs', 'GuardianWebauthnRoamingArgsDict']] webauthn_roaming: Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GuardianArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Multi-Factor Authentication works by requiring additional factors during the login process to prevent unauthorized access. With this resource you can configure some options available for MFA.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_guardian = auth0.Guardian("my_guardian",
            policy="all-applications",
            email=True,
            otp=True,
            recovery_code=True,
            webauthn_platform={
                "enabled": True,
            },
            webauthn_roaming={
                "enabled": True,
                "user_verification": "required",
            },
            phone={
                "enabled": True,
                "provider": "auth0",
                "message_types": [
                    "sms",
                    "voice",
                ],
                "options": {
                    "enrollment_message": "{{code}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment.",
                    "verification_message": "{{code}} is your verification code for {{tenant.friendly_name}}.",
                },
            },
            push={
                "enabled": True,
                "provider": "sns",
                "amazon_sns": {
                    "aws_access_key_id": "test1",
                    "aws_region": "us-west-1",
                    "aws_secret_access_key": "secretKey",
                    "sns_apns_platform_application_arn": "test_arn",
                    "sns_gcm_platform_application_arn": "test_arn",
                },
                "custom_app": {
                    "app_name": "CustomApp",
                    "apple_app_link": "https://itunes.apple.com/us/app/my-app/id123121",
                    "google_app_link": "https://play.google.com/store/apps/details?id=com.my.app",
                },
            },
            duo={
                "enabled": True,
                "integration_key": "someKey",
                "secret_key": "someSecret",
                "hostname": "api-hostname",
            })
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        guardian can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/guardian:Guardian my_guardian "24940d4b-4bd4-44e7-894e-f92e4de36a40"
        ```

        :param str resource_name: The name of the resource.
        :param GuardianArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GuardianArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 duo: Optional[pulumi.Input[Union['GuardianDuoArgs', 'GuardianDuoArgsDict']]] = None,
                 email: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[bool]] = None,
                 phone: Optional[pulumi.Input[Union['GuardianPhoneArgs', 'GuardianPhoneArgsDict']]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 push: Optional[pulumi.Input[Union['GuardianPushArgs', 'GuardianPushArgsDict']]] = None,
                 recovery_code: Optional[pulumi.Input[bool]] = None,
                 webauthn_platform: Optional[pulumi.Input[Union['GuardianWebauthnPlatformArgs', 'GuardianWebauthnPlatformArgsDict']]] = None,
                 webauthn_roaming: Optional[pulumi.Input[Union['GuardianWebauthnRoamingArgs', 'GuardianWebauthnRoamingArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GuardianArgs.__new__(GuardianArgs)

            __props__.__dict__["duo"] = duo
            __props__.__dict__["email"] = email
            __props__.__dict__["otp"] = otp
            __props__.__dict__["phone"] = phone
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            __props__.__dict__["push"] = push
            __props__.__dict__["recovery_code"] = recovery_code
            __props__.__dict__["webauthn_platform"] = webauthn_platform
            __props__.__dict__["webauthn_roaming"] = webauthn_roaming
        super(Guardian, __self__).__init__(
            'auth0:index/guardian:Guardian',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            duo: Optional[pulumi.Input[Union['GuardianDuoArgs', 'GuardianDuoArgsDict']]] = None,
            email: Optional[pulumi.Input[bool]] = None,
            otp: Optional[pulumi.Input[bool]] = None,
            phone: Optional[pulumi.Input[Union['GuardianPhoneArgs', 'GuardianPhoneArgsDict']]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            push: Optional[pulumi.Input[Union['GuardianPushArgs', 'GuardianPushArgsDict']]] = None,
            recovery_code: Optional[pulumi.Input[bool]] = None,
            webauthn_platform: Optional[pulumi.Input[Union['GuardianWebauthnPlatformArgs', 'GuardianWebauthnPlatformArgsDict']]] = None,
            webauthn_roaming: Optional[pulumi.Input[Union['GuardianWebauthnRoamingArgs', 'GuardianWebauthnRoamingArgsDict']]] = None) -> 'Guardian':
        """
        Get an existing Guardian resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['GuardianDuoArgs', 'GuardianDuoArgsDict']] duo: Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] email: Indicates whether email MFA is enabled.
        :param pulumi.Input[bool] otp: Indicates whether one time password MFA is enabled.
        :param pulumi.Input[Union['GuardianPhoneArgs', 'GuardianPhoneArgsDict']] phone: Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[str] policy: Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        :param pulumi.Input[Union['GuardianPushArgs', 'GuardianPushArgsDict']] push: Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[bool] recovery_code: Indicates whether recovery code MFA is enabled.
        :param pulumi.Input[Union['GuardianWebauthnPlatformArgs', 'GuardianWebauthnPlatformArgsDict']] webauthn_platform: Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        :param pulumi.Input[Union['GuardianWebauthnRoamingArgs', 'GuardianWebauthnRoamingArgsDict']] webauthn_roaming: Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GuardianState.__new__(_GuardianState)

        __props__.__dict__["duo"] = duo
        __props__.__dict__["email"] = email
        __props__.__dict__["otp"] = otp
        __props__.__dict__["phone"] = phone
        __props__.__dict__["policy"] = policy
        __props__.__dict__["push"] = push
        __props__.__dict__["recovery_code"] = recovery_code
        __props__.__dict__["webauthn_platform"] = webauthn_platform
        __props__.__dict__["webauthn_roaming"] = webauthn_roaming
        return Guardian(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def duo(self) -> pulumi.Output['outputs.GuardianDuo']:
        """
        Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "duo")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether email MFA is enabled.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def otp(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether one time password MFA is enabled.
        """
        return pulumi.get(self, "otp")

    @property
    @pulumi.getter
    def phone(self) -> pulumi.Output['outputs.GuardianPhone']:
        """
        Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "phone")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter
    def push(self) -> pulumi.Output['outputs.GuardianPush']:
        """
        Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "push")

    @property
    @pulumi.getter(name="recoveryCode")
    def recovery_code(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether recovery code MFA is enabled.
        """
        return pulumi.get(self, "recovery_code")

    @property
    @pulumi.getter(name="webauthnPlatform")
    def webauthn_platform(self) -> pulumi.Output['outputs.GuardianWebauthnPlatform']:
        """
        Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_platform")

    @property
    @pulumi.getter(name="webauthnRoaming")
    def webauthn_roaming(self) -> pulumi.Output['outputs.GuardianWebauthnRoaming']:
        """
        Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        """
        return pulumi.get(self, "webauthn_roaming")

