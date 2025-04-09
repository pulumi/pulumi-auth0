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

__all__ = ['PromptCustomTextArgs', 'PromptCustomText']

@pulumi.input_type
class PromptCustomTextArgs:
    def __init__(__self__, *,
                 body: pulumi.Input[builtins.str],
                 language: pulumi.Input[builtins.str],
                 prompt: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a PromptCustomText resource.
        :param pulumi.Input[builtins.str] body: JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        :param pulumi.Input[builtins.str] language: Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        :param pulumi.Input[builtins.str] prompt: The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        pulumi.set(__self__, "body", body)
        pulumi.set(__self__, "language", language)
        pulumi.set(__self__, "prompt", prompt)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Input[builtins.str]:
        """
        JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def language(self) -> pulumi.Input[builtins.str]:
        """
        Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def prompt(self) -> pulumi.Input[builtins.str]:
        """
        The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        return pulumi.get(self, "prompt")

    @prompt.setter
    def prompt(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "prompt", value)


@pulumi.input_type
class _PromptCustomTextState:
    def __init__(__self__, *,
                 body: Optional[pulumi.Input[builtins.str]] = None,
                 language: Optional[pulumi.Input[builtins.str]] = None,
                 prompt: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering PromptCustomText resources.
        :param pulumi.Input[builtins.str] body: JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        :param pulumi.Input[builtins.str] language: Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        :param pulumi.Input[builtins.str] prompt: The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        if body is not None:
            pulumi.set(__self__, "body", body)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if prompt is not None:
            pulumi.set(__self__, "prompt", prompt)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def prompt(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        return pulumi.get(self, "prompt")

    @prompt.setter
    def prompt(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "prompt", value)


class PromptCustomText(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[builtins.str]] = None,
                 language: Optional[pulumi.Input[builtins.str]] = None,
                 prompt: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        With this resource, you can manage custom text on your Auth0 prompts. You can read more about custom texts [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_auth0 as auth0

        example = auth0.PromptCustomText("example",
            prompt="login",
            language="en",
            body=json.dumps({
                "login": {
                    "alertListTitle": "Alerts",
                    "buttonText": "Continue",
                    "description": "Login to",
                    "editEmailText": "Edit",
                    "emailPlaceholder": "Email address",
                    "federatedConnectionButtonText": "Continue with ${connectionName}",
                    "footerLinkText": "Sign up",
                    "footerText": "Don't have an account?",
                    "forgotPasswordText": "Forgot password?",
                    "invitationDescription": "Log in to accept ${inviterName}'s invitation to join ${companyName} on ${clientName}.",
                    "invitationTitle": "You've Been Invited!",
                    "logoAltText": "${companyName}",
                    "pageTitle": "Log in | ${clientName}",
                    "passwordPlaceholder": "Password",
                    "separatorText": "Or",
                    "signupActionLinkText": "${footerLinkText}",
                    "signupActionText": "${footerText}",
                    "title": "Welcome",
                    "usernamePlaceholder": "Username or email address",
                },
            }))
        ```

        ## Import

        This resource can be imported by specifying the

        prompt and language separated by "::" (note the double colon)

        <prompt>::<language>

        Example

        ```sh
        $ pulumi import auth0:index/promptCustomText:PromptCustomText example "login::en"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] body: JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        :param pulumi.Input[builtins.str] language: Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        :param pulumi.Input[builtins.str] prompt: The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PromptCustomTextArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage custom text on your Auth0 prompts. You can read more about custom texts [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_auth0 as auth0

        example = auth0.PromptCustomText("example",
            prompt="login",
            language="en",
            body=json.dumps({
                "login": {
                    "alertListTitle": "Alerts",
                    "buttonText": "Continue",
                    "description": "Login to",
                    "editEmailText": "Edit",
                    "emailPlaceholder": "Email address",
                    "federatedConnectionButtonText": "Continue with ${connectionName}",
                    "footerLinkText": "Sign up",
                    "footerText": "Don't have an account?",
                    "forgotPasswordText": "Forgot password?",
                    "invitationDescription": "Log in to accept ${inviterName}'s invitation to join ${companyName} on ${clientName}.",
                    "invitationTitle": "You've Been Invited!",
                    "logoAltText": "${companyName}",
                    "pageTitle": "Log in | ${clientName}",
                    "passwordPlaceholder": "Password",
                    "separatorText": "Or",
                    "signupActionLinkText": "${footerLinkText}",
                    "signupActionText": "${footerText}",
                    "title": "Welcome",
                    "usernamePlaceholder": "Username or email address",
                },
            }))
        ```

        ## Import

        This resource can be imported by specifying the

        prompt and language separated by "::" (note the double colon)

        <prompt>::<language>

        Example

        ```sh
        $ pulumi import auth0:index/promptCustomText:PromptCustomText example "login::en"
        ```

        :param str resource_name: The name of the resource.
        :param PromptCustomTextArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptCustomTextArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[builtins.str]] = None,
                 language: Optional[pulumi.Input[builtins.str]] = None,
                 prompt: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptCustomTextArgs.__new__(PromptCustomTextArgs)

            if body is None and not opts.urn:
                raise TypeError("Missing required property 'body'")
            __props__.__dict__["body"] = body
            if language is None and not opts.urn:
                raise TypeError("Missing required property 'language'")
            __props__.__dict__["language"] = language
            if prompt is None and not opts.urn:
                raise TypeError("Missing required property 'prompt'")
            __props__.__dict__["prompt"] = prompt
        super(PromptCustomText, __self__).__init__(
            'auth0:index/promptCustomText:PromptCustomText',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            body: Optional[pulumi.Input[builtins.str]] = None,
            language: Optional[pulumi.Input[builtins.str]] = None,
            prompt: Optional[pulumi.Input[builtins.str]] = None) -> 'PromptCustomText':
        """
        Get an existing PromptCustomText resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] body: JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        :param pulumi.Input[builtins.str] language: Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        :param pulumi.Input[builtins.str] prompt: The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptCustomTextState.__new__(_PromptCustomTextState)

        __props__.__dict__["body"] = body
        __props__.__dict__["language"] = language
        __props__.__dict__["prompt"] = prompt
        return PromptCustomText(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Output[builtins.str]:
        """
        JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter
    def language(self) -> pulumi.Output[builtins.str]:
        """
        Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
        """
        return pulumi.get(self, "language")

    @property
    @pulumi.getter
    def prompt(self) -> pulumi.Output[builtins.str]:
        """
        The term `prompt` is used to refer to a specific step in the login flow. Options include: `captcha`, `common`, `consent`, `custom-form`, `customized-consent`, `device-flow`, `email-otp-challenge`, `email-verification`, `invitation`, `login`, `login-email-verification`, `login-id`, `login-password`, `login-passwordless`, `logout`, `mfa`, `mfa-email`, `mfa-otp`, `mfa-phone`, `mfa-push`, `mfa-recovery-code`, `mfa-sms`, `mfa-voice`, `mfa-webauthn`, `organizations`, `passkeys`, `phone-identifier-challenge`, `phone-identifier-enrollment`, `reset-password`, `signup`, `signup-id`, `signup-password`, `status`.
        """
        return pulumi.get(self, "prompt")

