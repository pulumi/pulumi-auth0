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
from . import outputs
from ._inputs import *

__all__ = ['PromptScreenPartialsArgs', 'PromptScreenPartials']

@pulumi.input_type
class PromptScreenPartialsArgs:
    def __init__(__self__, *,
                 prompt_type: pulumi.Input[str],
                 screen_partials: Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]] = None):
        """
        The set of arguments for constructing a PromptScreenPartials resource.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        pulumi.set(__self__, "prompt_type", prompt_type)
        if screen_partials is not None:
            pulumi.set(__self__, "screen_partials", screen_partials)

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> pulumi.Input[str]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt_type")

    @prompt_type.setter
    def prompt_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "prompt_type", value)

    @property
    @pulumi.getter(name="screenPartials")
    def screen_partials(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]]:
        return pulumi.get(self, "screen_partials")

    @screen_partials.setter
    def screen_partials(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]]):
        pulumi.set(self, "screen_partials", value)


@pulumi.input_type
class _PromptScreenPartialsState:
    def __init__(__self__, *,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_partials: Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]] = None):
        """
        Input properties used for looking up and filtering PromptScreenPartials resources.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        if prompt_type is not None:
            pulumi.set(__self__, "prompt_type", prompt_type)
        if screen_partials is not None:
            pulumi.set(__self__, "screen_partials", screen_partials)

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> Optional[pulumi.Input[str]]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt_type")

    @prompt_type.setter
    def prompt_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prompt_type", value)

    @property
    @pulumi.getter(name="screenPartials")
    def screen_partials(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]]:
        return pulumi.get(self, "screen_partials")

    @screen_partials.setter
    def screen_partials(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PromptScreenPartialsScreenPartialArgs']]]]):
        pulumi.set(self, "screen_partials", value)


class PromptScreenPartials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_partials: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PromptScreenPartialsScreenPartialArgs', 'PromptScreenPartialsScreenPartialArgsDict']]]]] = None,
                 __props__=None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> This resource manages the entire set of prompt screens enabled for a prompt. In contrast, the `PromptScreenPartial`
        resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
         To avoid potential issues, it is recommended not to use this resource in conjunction with the `PromptScreenPartial`
         resource when managing prompt screens for the same prompt.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        prompt_screen_partials = auth0.PromptScreenPartials("prompt_screen_partials",
            prompt_type="login-passwordless",
            screen_partials=[
                {
                    "screen_name": "login-passwordless-email-code",
                    "insertion_points": {
                        "form_content_start": "<div>Form Content Start</div>",
                        "form_content_end": "<div>Form Content End</div>",
                    },
                },
                {
                    "screen_name": "login-passwordless-sms-otp",
                    "insertion_points": {
                        "form_content_start": "<div>Form Content Start</div>",
                        "form_content_end": "<div>Form Content End</div>",
                    },
                },
            ])
        customized_consent = auth0.PromptScreenPartials("customized-consent",
            prompt_type="customized-consent",
            screen_partials=[{
                "screen_name": "customized-consent",
                "insertion_points": {
                    "form_content": "<div>Form Content</div>",
                },
            }])
        ```

        ## Import

        This resource can be imported using the prompt name.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenPartials:PromptScreenPartials prompt_screen_partials "login-passwordless"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PromptScreenPartialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> This resource manages the entire set of prompt screens enabled for a prompt. In contrast, the `PromptScreenPartial`
        resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
         To avoid potential issues, it is recommended not to use this resource in conjunction with the `PromptScreenPartial`
         resource when managing prompt screens for the same prompt.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        prompt_screen_partials = auth0.PromptScreenPartials("prompt_screen_partials",
            prompt_type="login-passwordless",
            screen_partials=[
                {
                    "screen_name": "login-passwordless-email-code",
                    "insertion_points": {
                        "form_content_start": "<div>Form Content Start</div>",
                        "form_content_end": "<div>Form Content End</div>",
                    },
                },
                {
                    "screen_name": "login-passwordless-sms-otp",
                    "insertion_points": {
                        "form_content_start": "<div>Form Content Start</div>",
                        "form_content_end": "<div>Form Content End</div>",
                    },
                },
            ])
        customized_consent = auth0.PromptScreenPartials("customized-consent",
            prompt_type="customized-consent",
            screen_partials=[{
                "screen_name": "customized-consent",
                "insertion_points": {
                    "form_content": "<div>Form Content</div>",
                },
            }])
        ```

        ## Import

        This resource can be imported using the prompt name.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenPartials:PromptScreenPartials prompt_screen_partials "login-passwordless"
        ```

        :param str resource_name: The name of the resource.
        :param PromptScreenPartialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptScreenPartialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_partials: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PromptScreenPartialsScreenPartialArgs', 'PromptScreenPartialsScreenPartialArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptScreenPartialsArgs.__new__(PromptScreenPartialsArgs)

            if prompt_type is None and not opts.urn:
                raise TypeError("Missing required property 'prompt_type'")
            __props__.__dict__["prompt_type"] = prompt_type
            __props__.__dict__["screen_partials"] = screen_partials
        super(PromptScreenPartials, __self__).__init__(
            'auth0:index/promptScreenPartials:PromptScreenPartials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            prompt_type: Optional[pulumi.Input[str]] = None,
            screen_partials: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PromptScreenPartialsScreenPartialArgs', 'PromptScreenPartialsScreenPartialArgsDict']]]]] = None) -> 'PromptScreenPartials':
        """
        Get an existing PromptScreenPartials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptScreenPartialsState.__new__(_PromptScreenPartialsState)

        __props__.__dict__["prompt_type"] = prompt_type
        __props__.__dict__["screen_partials"] = screen_partials
        return PromptScreenPartials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> pulumi.Output[str]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt_type")

    @property
    @pulumi.getter(name="screenPartials")
    def screen_partials(self) -> pulumi.Output[Optional[Sequence['outputs.PromptScreenPartialsScreenPartial']]]:
        return pulumi.get(self, "screen_partials")

