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

__all__ = ['PromptScreenPartialArgs', 'PromptScreenPartial']

@pulumi.input_type
class PromptScreenPartialArgs:
    def __init__(__self__, *,
                 prompt_type: pulumi.Input[str],
                 screen_name: pulumi.Input[str],
                 insertion_points: Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']] = None):
        """
        The set of arguments for constructing a PromptScreenPartial resource.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[str] screen_name: The name of the screen associated with the partials
        :param pulumi.Input['PromptScreenPartialInsertionPointsArgs'] insertion_points: The insertion points for the partials.
        """
        pulumi.set(__self__, "prompt_type", prompt_type)
        pulumi.set(__self__, "screen_name", screen_name)
        if insertion_points is not None:
            pulumi.set(__self__, "insertion_points", insertion_points)

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
    @pulumi.getter(name="screenName")
    def screen_name(self) -> pulumi.Input[str]:
        """
        The name of the screen associated with the partials
        """
        return pulumi.get(self, "screen_name")

    @screen_name.setter
    def screen_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "screen_name", value)

    @property
    @pulumi.getter(name="insertionPoints")
    def insertion_points(self) -> Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']]:
        """
        The insertion points for the partials.
        """
        return pulumi.get(self, "insertion_points")

    @insertion_points.setter
    def insertion_points(self, value: Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']]):
        pulumi.set(self, "insertion_points", value)


@pulumi.input_type
class _PromptScreenPartialState:
    def __init__(__self__, *,
                 insertion_points: Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PromptScreenPartial resources.
        :param pulumi.Input['PromptScreenPartialInsertionPointsArgs'] insertion_points: The insertion points for the partials.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[str] screen_name: The name of the screen associated with the partials
        """
        if insertion_points is not None:
            pulumi.set(__self__, "insertion_points", insertion_points)
        if prompt_type is not None:
            pulumi.set(__self__, "prompt_type", prompt_type)
        if screen_name is not None:
            pulumi.set(__self__, "screen_name", screen_name)

    @property
    @pulumi.getter(name="insertionPoints")
    def insertion_points(self) -> Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']]:
        """
        The insertion points for the partials.
        """
        return pulumi.get(self, "insertion_points")

    @insertion_points.setter
    def insertion_points(self, value: Optional[pulumi.Input['PromptScreenPartialInsertionPointsArgs']]):
        pulumi.set(self, "insertion_points", value)

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
    @pulumi.getter(name="screenName")
    def screen_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the screen associated with the partials
        """
        return pulumi.get(self, "screen_name")

    @screen_name.setter
    def screen_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "screen_name", value)


class PromptScreenPartial(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 insertion_points: Optional[pulumi.Input[Union['PromptScreenPartialInsertionPointsArgs', 'PromptScreenPartialInsertionPointsArgsDict']]] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> This resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
         In contrast, the `PromptScreenPartials` resource manages the complete set of prompt screens that are displayed during the
         authentication flow. To avoid potential issues, it is recommended not to use this resource in conjunction with the
         `PromptScreenPartials` resource when managing prompt screens for the same prompt.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        login = auth0.PromptScreenPartial("login",
            prompt_type="login",
            screen_name="login",
            insertion_points={
                "form_content_start": "<div>Form Content Start</div>",
                "form_content_end": "<div>Form Content End</div>",
            })
        customized_consent = auth0.PromptScreenPartial("customized-consent",
            prompt_type="customized-consent",
            screen_name="customized-consent",
            insertion_points={
                "form_content": "<div>Form Content</div>",
            })
        ```

        ## Import

        This resource can be imported using the prompt name and screen_name.

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        login can be imported using the prompt name and screen name using the format:

        prompt_name:screen_name

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenPartial:PromptScreenPartial login "login:login"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PromptScreenPartialInsertionPointsArgs', 'PromptScreenPartialInsertionPointsArgsDict']] insertion_points: The insertion points for the partials.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[str] screen_name: The name of the screen associated with the partials
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PromptScreenPartialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> This resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
         In contrast, the `PromptScreenPartials` resource manages the complete set of prompt screens that are displayed during the
         authentication flow. To avoid potential issues, it is recommended not to use this resource in conjunction with the
         `PromptScreenPartials` resource when managing prompt screens for the same prompt.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        login = auth0.PromptScreenPartial("login",
            prompt_type="login",
            screen_name="login",
            insertion_points={
                "form_content_start": "<div>Form Content Start</div>",
                "form_content_end": "<div>Form Content End</div>",
            })
        customized_consent = auth0.PromptScreenPartial("customized-consent",
            prompt_type="customized-consent",
            screen_name="customized-consent",
            insertion_points={
                "form_content": "<div>Form Content</div>",
            })
        ```

        ## Import

        This resource can be imported using the prompt name and screen_name.

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        login can be imported using the prompt name and screen name using the format:

        prompt_name:screen_name

        Example:

        ```sh
        $ pulumi import auth0:index/promptScreenPartial:PromptScreenPartial login "login:login"
        ```

        :param str resource_name: The name of the resource.
        :param PromptScreenPartialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptScreenPartialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 insertion_points: Optional[pulumi.Input[Union['PromptScreenPartialInsertionPointsArgs', 'PromptScreenPartialInsertionPointsArgsDict']]] = None,
                 prompt_type: Optional[pulumi.Input[str]] = None,
                 screen_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptScreenPartialArgs.__new__(PromptScreenPartialArgs)

            __props__.__dict__["insertion_points"] = insertion_points
            if prompt_type is None and not opts.urn:
                raise TypeError("Missing required property 'prompt_type'")
            __props__.__dict__["prompt_type"] = prompt_type
            if screen_name is None and not opts.urn:
                raise TypeError("Missing required property 'screen_name'")
            __props__.__dict__["screen_name"] = screen_name
        super(PromptScreenPartial, __self__).__init__(
            'auth0:index/promptScreenPartial:PromptScreenPartial',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            insertion_points: Optional[pulumi.Input[Union['PromptScreenPartialInsertionPointsArgs', 'PromptScreenPartialInsertionPointsArgsDict']]] = None,
            prompt_type: Optional[pulumi.Input[str]] = None,
            screen_name: Optional[pulumi.Input[str]] = None) -> 'PromptScreenPartial':
        """
        Get an existing PromptScreenPartial resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PromptScreenPartialInsertionPointsArgs', 'PromptScreenPartialInsertionPointsArgsDict']] insertion_points: The insertion points for the partials.
        :param pulumi.Input[str] prompt_type: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[str] screen_name: The name of the screen associated with the partials
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptScreenPartialState.__new__(_PromptScreenPartialState)

        __props__.__dict__["insertion_points"] = insertion_points
        __props__.__dict__["prompt_type"] = prompt_type
        __props__.__dict__["screen_name"] = screen_name
        return PromptScreenPartial(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="insertionPoints")
    def insertion_points(self) -> pulumi.Output[Optional['outputs.PromptScreenPartialInsertionPoints']]:
        """
        The insertion points for the partials.
        """
        return pulumi.get(self, "insertion_points")

    @property
    @pulumi.getter(name="promptType")
    def prompt_type(self) -> pulumi.Output[str]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt_type")

    @property
    @pulumi.getter(name="screenName")
    def screen_name(self) -> pulumi.Output[str]:
        """
        The name of the screen associated with the partials
        """
        return pulumi.get(self, "screen_name")

