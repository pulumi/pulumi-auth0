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

__all__ = ['PromptScreenRendererArgs', 'PromptScreenRenderer']

@pulumi.input_type
class PromptScreenRendererArgs:
    def __init__(__self__, *,
                 prompt_type: pulumi.Input[str],
                 screen_name: pulumi.Input[str],
                 context_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_head_tags_disabled: Optional[pulumi.Input[bool]] = None,
                 head_tags: Optional[pulumi.Input[str]] = None,
                 rendering_mode: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PromptScreenRenderer resource.
        :param pulumi.Input[str] prompt_type: The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        :param pulumi.Input[str] screen_name: The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] context_configurations: Context values to make available
        :param pulumi.Input[bool] default_head_tags_disabled: Override Universal Login default head tags
        :param pulumi.Input[str] head_tags: An array of head tags
        :param pulumi.Input[str] rendering_mode: Rendering modeOptions are: `standard`, `advanced`.
        """
        pulumi.set(__self__, "prompt_type", prompt_type)
        pulumi.set(__self__, "screen_name", screen_name)
        if context_configurations is not None:
            pulumi.set(__self__, "context_configurations", context_configurations)
        if default_head_tags_disabled is not None:
            pulumi.set(__self__, "default_head_tags_disabled", default_head_tags_disabled)
        if head_tags is not None:
            pulumi.set(__self__, "head_tags", head_tags)
        if rendering_mode is not None:
            pulumi.set(__self__, "rendering_mode", rendering_mode)

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> pulumi.Input[str]:
        """
        The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        """
        return pulumi.get(self, "prompt_type")

    @prompt_type.setter
    def prompt_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "prompt_type", value)

    @property
    @pulumi.getter(name="screenName")
    def screen_name(self) -> pulumi.Input[str]:
        """
        The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        """
        return pulumi.get(self, "screen_name")

    @screen_name.setter
    def screen_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "screen_name", value)

    @property
    @pulumi.getter(name="contextConfigurations")
    def context_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Context values to make available
        """
        return pulumi.get(self, "context_configurations")

    @context_configurations.setter
    def context_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "context_configurations", value)

    @property
    @pulumi.getter(name="defaultHeadTagsDisabled")
    def default_head_tags_disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Override Universal Login default head tags
        """
        return pulumi.get(self, "default_head_tags_disabled")

    @default_head_tags_disabled.setter
    def default_head_tags_disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_head_tags_disabled", value)

    @property
    @pulumi.getter(name="headTags")
    def head_tags(self) -> Optional[pulumi.Input[str]]:
        """
        An array of head tags
        """
        return pulumi.get(self, "head_tags")

    @head_tags.setter
    def head_tags(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "head_tags", value)

    @property
    @pulumi.getter(name="renderingMode")
    def rendering_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Rendering modeOptions are: `standard`, `advanced`.
        """
        return pulumi.get(self, "rendering_mode")

    @rendering_mode.setter
    def rendering_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rendering_mode", value)


@pulumi.input_type
class _PromptScreenRendererState:
    def __init__(__self__, *,
                 context_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_head_tags_disabled: Optional[pulumi.Input[bool]] = None,
                 head_tags: Optional[pulumi.Input[str]] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 rendering_mode: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None,
                 tenant: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PromptScreenRenderer resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] context_configurations: Context values to make available
        :param pulumi.Input[bool] default_head_tags_disabled: Override Universal Login default head tags
        :param pulumi.Input[str] head_tags: An array of head tags
        :param pulumi.Input[str] prompt_type: The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        :param pulumi.Input[str] rendering_mode: Rendering modeOptions are: `standard`, `advanced`.
        :param pulumi.Input[str] screen_name: The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        :param pulumi.Input[str] tenant: Tenant ID
        """
        if context_configurations is not None:
            pulumi.set(__self__, "context_configurations", context_configurations)
        if default_head_tags_disabled is not None:
            pulumi.set(__self__, "default_head_tags_disabled", default_head_tags_disabled)
        if head_tags is not None:
            pulumi.set(__self__, "head_tags", head_tags)
        if prompt_type is not None:
            pulumi.set(__self__, "prompt_type", prompt_type)
        if rendering_mode is not None:
            pulumi.set(__self__, "rendering_mode", rendering_mode)
        if screen_name is not None:
            pulumi.set(__self__, "screen_name", screen_name)
        if tenant is not None:
            pulumi.set(__self__, "tenant", tenant)

    @property
    @pulumi.getter(name="contextConfigurations")
    def context_configurations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Context values to make available
        """
        return pulumi.get(self, "context_configurations")

    @context_configurations.setter
    def context_configurations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "context_configurations", value)

    @property
    @pulumi.getter(name="defaultHeadTagsDisabled")
    def default_head_tags_disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Override Universal Login default head tags
        """
        return pulumi.get(self, "default_head_tags_disabled")

    @default_head_tags_disabled.setter
    def default_head_tags_disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_head_tags_disabled", value)

    @property
    @pulumi.getter(name="headTags")
    def head_tags(self) -> Optional[pulumi.Input[str]]:
        """
        An array of head tags
        """
        return pulumi.get(self, "head_tags")

    @head_tags.setter
    def head_tags(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "head_tags", value)

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> Optional[pulumi.Input[str]]:
        """
        The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        """
        return pulumi.get(self, "prompt_type")

    @prompt_type.setter
    def prompt_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prompt_type", value)

    @property
    @pulumi.getter(name="renderingMode")
    def rendering_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Rendering modeOptions are: `standard`, `advanced`.
        """
        return pulumi.get(self, "rendering_mode")

    @rendering_mode.setter
    def rendering_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rendering_mode", value)

    @property
    @pulumi.getter(name="screenName")
    def screen_name(self) -> Optional[pulumi.Input[str]]:
        """
        The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        """
        return pulumi.get(self, "screen_name")

    @screen_name.setter
    def screen_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "screen_name", value)

    @property
    @pulumi.getter
    def tenant(self) -> Optional[pulumi.Input[str]]:
        """
        Tenant ID
        """
        return pulumi.get(self, "tenant")

    @tenant.setter
    def tenant(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant", value)


class PromptScreenRenderer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 context_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_head_tags_disabled: Optional[pulumi.Input[bool]] = None,
                 head_tags: Optional[pulumi.Input[str]] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 rendering_mode: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can Configure the render settings for a specific screen.You can read more about this [here](https://auth0.com/docs/customize/login-pages/advanced-customizations/getting-started/configure-acul-screens).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_auth0 as auth0

        prompt_screen_renderer = auth0.PromptScreenRenderer("prompt_screen_renderer",
            prompt_type="login-id",
            screen_name="login-id",
            rendering_mode="advanced",
            default_head_tags_disabled=False,
            context_configurations=[
                "branding.settings",
                "branding.themes.default",
                "client.logo_uri",
                "client.description",
                "client.metadata.key",
                "organization.display_name",
                "organization.branding",
                "organization.metadata.key",
                "screen.texts",
                "tenant.name",
                "tenant.friendly_name",
                "tenant.enabled_locales",
                "untrusted_data.submitted_form_data",
                "untrusted_data.authorization_params.login_hint",
                "untrusted_data.authorization_params.screen_hint",
                "untrusted_data.authorization_params.ui_locales",
                "untrusted_data.authorization_params.ext-key",
            ],
            head_tags=json.dumps([{
                "attributes": {
                    "async": True,
                    "defer": True,
                    "integrity": ["sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="],
                    "src": "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js",
                },
                "tag": "script",
            }]))
        ```

        ## Import

        This resource can be imported using the prompt name and screen_name.

        # 

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        login can be imported using the prompt name and screen name using the format:

        prompt_name:screen_name

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer "login-id:login-id"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] context_configurations: Context values to make available
        :param pulumi.Input[bool] default_head_tags_disabled: Override Universal Login default head tags
        :param pulumi.Input[str] head_tags: An array of head tags
        :param pulumi.Input[str] prompt_type: The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        :param pulumi.Input[str] rendering_mode: Rendering modeOptions are: `standard`, `advanced`.
        :param pulumi.Input[str] screen_name: The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PromptScreenRendererArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can Configure the render settings for a specific screen.You can read more about this [here](https://auth0.com/docs/customize/login-pages/advanced-customizations/getting-started/configure-acul-screens).

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_auth0 as auth0

        prompt_screen_renderer = auth0.PromptScreenRenderer("prompt_screen_renderer",
            prompt_type="login-id",
            screen_name="login-id",
            rendering_mode="advanced",
            default_head_tags_disabled=False,
            context_configurations=[
                "branding.settings",
                "branding.themes.default",
                "client.logo_uri",
                "client.description",
                "client.metadata.key",
                "organization.display_name",
                "organization.branding",
                "organization.metadata.key",
                "screen.texts",
                "tenant.name",
                "tenant.friendly_name",
                "tenant.enabled_locales",
                "untrusted_data.submitted_form_data",
                "untrusted_data.authorization_params.login_hint",
                "untrusted_data.authorization_params.screen_hint",
                "untrusted_data.authorization_params.ui_locales",
                "untrusted_data.authorization_params.ext-key",
            ],
            head_tags=json.dumps([{
                "attributes": {
                    "async": True,
                    "defer": True,
                    "integrity": ["sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="],
                    "src": "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js",
                },
                "tag": "script",
            }]))
        ```

        ## Import

        This resource can be imported using the prompt name and screen_name.

        # 

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        login can be imported using the prompt name and screen name using the format:

        prompt_name:screen_name

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer "login-id:login-id"
        ```

        :param str resource_name: The name of the resource.
        :param PromptScreenRendererArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptScreenRendererArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 context_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_head_tags_disabled: Optional[pulumi.Input[bool]] = None,
                 head_tags: Optional[pulumi.Input[str]] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 rendering_mode: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptScreenRendererArgs.__new__(PromptScreenRendererArgs)

            __props__.__dict__["context_configurations"] = context_configurations
            __props__.__dict__["default_head_tags_disabled"] = default_head_tags_disabled
            __props__.__dict__["head_tags"] = head_tags
            if prompt_type is None and not opts.urn:
                raise TypeError("Missing required property 'prompt_type'")
            __props__.__dict__["prompt_type"] = prompt_type
            __props__.__dict__["rendering_mode"] = rendering_mode
            if screen_name is None and not opts.urn:
                raise TypeError("Missing required property 'screen_name'")
            __props__.__dict__["screen_name"] = screen_name
            __props__.__dict__["tenant"] = None
        super(PromptScreenRenderer, __self__).__init__(
            'auth0:index/promptScreenRenderer:PromptScreenRenderer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            context_configurations: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            default_head_tags_disabled: Optional[pulumi.Input[bool]] = None,
            head_tags: Optional[pulumi.Input[str]] = None,
            prompt_type: Optional[pulumi.Input[str]] = None,
            rendering_mode: Optional[pulumi.Input[str]] = None,
            screen_name: Optional[pulumi.Input[str]] = None,
            tenant: Optional[pulumi.Input[str]] = None) -> 'PromptScreenRenderer':
        """
        Get an existing PromptScreenRenderer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] context_configurations: Context values to make available
        :param pulumi.Input[bool] default_head_tags_disabled: Override Universal Login default head tags
        :param pulumi.Input[str] head_tags: An array of head tags
        :param pulumi.Input[str] prompt_type: The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        :param pulumi.Input[str] rendering_mode: Rendering modeOptions are: `standard`, `advanced`.
        :param pulumi.Input[str] screen_name: The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        :param pulumi.Input[str] tenant: Tenant ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptScreenRendererState.__new__(_PromptScreenRendererState)

        __props__.__dict__["context_configurations"] = context_configurations
        __props__.__dict__["default_head_tags_disabled"] = default_head_tags_disabled
        __props__.__dict__["head_tags"] = head_tags
        __props__.__dict__["prompt_type"] = prompt_type
        __props__.__dict__["rendering_mode"] = rendering_mode
        __props__.__dict__["screen_name"] = screen_name
        __props__.__dict__["tenant"] = tenant
        return PromptScreenRenderer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contextConfigurations")
    def context_configurations(self) -> pulumi.Output[Sequence[str]]:
        """
        Context values to make available
        """
        return pulumi.get(self, "context_configurations")

    @property
    @pulumi.getter(name="defaultHeadTagsDisabled")
    def default_head_tags_disabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Override Universal Login default head tags
        """
        return pulumi.get(self, "default_head_tags_disabled")

    @property
    @pulumi.getter(name="headTags")
    def head_tags(self) -> pulumi.Output[str]:
        """
        An array of head tags
        """
        return pulumi.get(self, "head_tags")

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> pulumi.Output[str]:
        """
        The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        """
        return pulumi.get(self, "prompt_type")

    @property
    @pulumi.getter(name="renderingMode")
    def rendering_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Rendering modeOptions are: `standard`, `advanced`.
        """
        return pulumi.get(self, "rendering_mode")

    @property
    @pulumi.getter(name="screenName")
    def screen_name(self) -> pulumi.Output[str]:
        """
        The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        """
        return pulumi.get(self, "screen_name")

    @property
    @pulumi.getter
    def tenant(self) -> pulumi.Output[str]:
        """
        Tenant ID
        """
        return pulumi.get(self, "tenant")

