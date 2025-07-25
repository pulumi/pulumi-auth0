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

__all__ = ['PromptPartialsArgs', 'PromptPartials']

@pulumi.input_type
class PromptPartialsArgs:
    def __init__(__self__, *,
                 prompt: pulumi.Input[_builtins.str],
                 form_content_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_content_start: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_start: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_end: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_start: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PromptPartials resource.
        :param pulumi.Input[_builtins.str] prompt: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[_builtins.str] form_content_end: Content that goes at the end of the form.
        :param pulumi.Input[_builtins.str] form_content_start: Content that goes at the start of the form.
        :param pulumi.Input[_builtins.str] form_footer_end: Footer content for the end of the footer.
        :param pulumi.Input[_builtins.str] form_footer_start: Footer content for the start of the footer.
        :param pulumi.Input[_builtins.str] secondary_actions_end: Actions that go at the end of secondary actions.
        :param pulumi.Input[_builtins.str] secondary_actions_start: Actions that go at the start of secondary actions.
        """
        if prompt is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""prompt is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        pulumi.set(__self__, "prompt", prompt)
        if form_content_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_content_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_content_end is not None:
            pulumi.set(__self__, "form_content_end", form_content_end)
        if form_content_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_content_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_content_start is not None:
            pulumi.set(__self__, "form_content_start", form_content_start)
        if form_footer_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_footer_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_footer_end is not None:
            pulumi.set(__self__, "form_footer_end", form_footer_end)
        if form_footer_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_footer_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_footer_start is not None:
            pulumi.set(__self__, "form_footer_start", form_footer_start)
        if secondary_actions_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""secondary_actions_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if secondary_actions_end is not None:
            pulumi.set(__self__, "secondary_actions_end", secondary_actions_end)
        if secondary_actions_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""secondary_actions_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if secondary_actions_start is not None:
            pulumi.set(__self__, "secondary_actions_start", secondary_actions_start)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def prompt(self) -> pulumi.Input[_builtins.str]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt")

    @prompt.setter
    def prompt(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "prompt", value)

    @_builtins.property
    @pulumi.getter(name="formContentEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Content that goes at the end of the form.
        """
        return pulumi.get(self, "form_content_end")

    @form_content_end.setter
    def form_content_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_content_end", value)

    @_builtins.property
    @pulumi.getter(name="formContentStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Content that goes at the start of the form.
        """
        return pulumi.get(self, "form_content_start")

    @form_content_start.setter
    def form_content_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_content_start", value)

    @_builtins.property
    @pulumi.getter(name="formFooterEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Footer content for the end of the footer.
        """
        return pulumi.get(self, "form_footer_end")

    @form_footer_end.setter
    def form_footer_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_footer_end", value)

    @_builtins.property
    @pulumi.getter(name="formFooterStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Footer content for the start of the footer.
        """
        return pulumi.get(self, "form_footer_start")

    @form_footer_start.setter
    def form_footer_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_footer_start", value)

    @_builtins.property
    @pulumi.getter(name="secondaryActionsEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Actions that go at the end of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_end")

    @secondary_actions_end.setter
    def secondary_actions_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_actions_end", value)

    @_builtins.property
    @pulumi.getter(name="secondaryActionsStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Actions that go at the start of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_start")

    @secondary_actions_start.setter
    def secondary_actions_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_actions_start", value)


@pulumi.input_type
class _PromptPartialsState:
    def __init__(__self__, *,
                 form_content_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_content_start: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_start: Optional[pulumi.Input[_builtins.str]] = None,
                 prompt: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_end: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_start: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PromptPartials resources.
        :param pulumi.Input[_builtins.str] form_content_end: Content that goes at the end of the form.
        :param pulumi.Input[_builtins.str] form_content_start: Content that goes at the start of the form.
        :param pulumi.Input[_builtins.str] form_footer_end: Footer content for the end of the footer.
        :param pulumi.Input[_builtins.str] form_footer_start: Footer content for the start of the footer.
        :param pulumi.Input[_builtins.str] prompt: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[_builtins.str] secondary_actions_end: Actions that go at the end of secondary actions.
        :param pulumi.Input[_builtins.str] secondary_actions_start: Actions that go at the start of secondary actions.
        """
        if form_content_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_content_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_content_end is not None:
            pulumi.set(__self__, "form_content_end", form_content_end)
        if form_content_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_content_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_content_start is not None:
            pulumi.set(__self__, "form_content_start", form_content_start)
        if form_footer_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_footer_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_footer_end is not None:
            pulumi.set(__self__, "form_footer_end", form_footer_end)
        if form_footer_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""form_footer_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if form_footer_start is not None:
            pulumi.set(__self__, "form_footer_start", form_footer_start)
        if prompt is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""prompt is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if prompt is not None:
            pulumi.set(__self__, "prompt", prompt)
        if secondary_actions_end is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""secondary_actions_end is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if secondary_actions_end is not None:
            pulumi.set(__self__, "secondary_actions_end", secondary_actions_end)
        if secondary_actions_start is not None:
            warnings.warn("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""", DeprecationWarning)
            pulumi.log.warn("""secondary_actions_start is deprecated: This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
        if secondary_actions_start is not None:
            pulumi.set(__self__, "secondary_actions_start", secondary_actions_start)

    @_builtins.property
    @pulumi.getter(name="formContentEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Content that goes at the end of the form.
        """
        return pulumi.get(self, "form_content_end")

    @form_content_end.setter
    def form_content_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_content_end", value)

    @_builtins.property
    @pulumi.getter(name="formContentStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Content that goes at the start of the form.
        """
        return pulumi.get(self, "form_content_start")

    @form_content_start.setter
    def form_content_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_content_start", value)

    @_builtins.property
    @pulumi.getter(name="formFooterEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Footer content for the end of the footer.
        """
        return pulumi.get(self, "form_footer_end")

    @form_footer_end.setter
    def form_footer_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_footer_end", value)

    @_builtins.property
    @pulumi.getter(name="formFooterStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Footer content for the start of the footer.
        """
        return pulumi.get(self, "form_footer_start")

    @form_footer_start.setter
    def form_footer_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "form_footer_start", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def prompt(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt")

    @prompt.setter
    def prompt(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "prompt", value)

    @_builtins.property
    @pulumi.getter(name="secondaryActionsEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Actions that go at the end of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_end")

    @secondary_actions_end.setter
    def secondary_actions_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_actions_end", value)

    @_builtins.property
    @pulumi.getter(name="secondaryActionsStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Actions that go at the start of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_start")

    @secondary_actions_start.setter
    def secondary_actions_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "secondary_actions_start", value)


@pulumi.type_token("auth0:index/promptPartials:PromptPartials")
class PromptPartials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 form_content_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_content_start: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_start: Optional[pulumi.Input[_builtins.str]] = None,
                 prompt: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_end: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_start: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> **Deprecated:** `PromptPartials` has been deprecated. Please use `PromptScreenPartials` for managing multiple
        prompt screens or `PromptScreenPartial` for managing a single prompt screen.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_login_prompt_partials = auth0.PromptPartials("my_login_prompt_partials",
            prompt="login",
            form_content_start="<div>Updated Form Content Start</div>",
            form_content_end="<div>Updated Form Content End</div>",
            form_footer_start="<div>Updated Footer Start</div>",
            form_footer_end="<div>Updated Footer End</div>",
            secondary_actions_start="<div>Updated Secondary Actions Start</div>",
            secondary_actions_end="<div>Updated Secondary Actions End</div>")
        ```

        ## Import

        This resource can be imported using the prompt name.

        Example:

        ```sh
        $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials "login"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] form_content_end: Content that goes at the end of the form.
        :param pulumi.Input[_builtins.str] form_content_start: Content that goes at the start of the form.
        :param pulumi.Input[_builtins.str] form_footer_end: Footer content for the end of the footer.
        :param pulumi.Input[_builtins.str] form_footer_start: Footer content for the start of the footer.
        :param pulumi.Input[_builtins.str] prompt: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[_builtins.str] secondary_actions_end: Actions that go at the end of secondary actions.
        :param pulumi.Input[_builtins.str] secondary_actions_start: Actions that go at the start of secondary actions.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PromptPartialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).

        !> **Deprecated:** `PromptPartials` has been deprecated. Please use `PromptScreenPartials` for managing multiple
        prompt screens or `PromptScreenPartial` for managing a single prompt screen.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_login_prompt_partials = auth0.PromptPartials("my_login_prompt_partials",
            prompt="login",
            form_content_start="<div>Updated Form Content Start</div>",
            form_content_end="<div>Updated Form Content End</div>",
            form_footer_start="<div>Updated Footer Start</div>",
            form_footer_end="<div>Updated Footer End</div>",
            secondary_actions_start="<div>Updated Secondary Actions Start</div>",
            secondary_actions_end="<div>Updated Secondary Actions End</div>")
        ```

        ## Import

        This resource can be imported using the prompt name.

        Example:

        ```sh
        $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials "login"
        ```

        :param str resource_name: The name of the resource.
        :param PromptPartialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PromptPartialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 form_content_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_content_start: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_end: Optional[pulumi.Input[_builtins.str]] = None,
                 form_footer_start: Optional[pulumi.Input[_builtins.str]] = None,
                 prompt: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_end: Optional[pulumi.Input[_builtins.str]] = None,
                 secondary_actions_start: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PromptPartialsArgs.__new__(PromptPartialsArgs)

            __props__.__dict__["form_content_end"] = form_content_end
            __props__.__dict__["form_content_start"] = form_content_start
            __props__.__dict__["form_footer_end"] = form_footer_end
            __props__.__dict__["form_footer_start"] = form_footer_start
            if prompt is None and not opts.urn:
                raise TypeError("Missing required property 'prompt'")
            __props__.__dict__["prompt"] = prompt
            __props__.__dict__["secondary_actions_end"] = secondary_actions_end
            __props__.__dict__["secondary_actions_start"] = secondary_actions_start
        super(PromptPartials, __self__).__init__(
            'auth0:index/promptPartials:PromptPartials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            form_content_end: Optional[pulumi.Input[_builtins.str]] = None,
            form_content_start: Optional[pulumi.Input[_builtins.str]] = None,
            form_footer_end: Optional[pulumi.Input[_builtins.str]] = None,
            form_footer_start: Optional[pulumi.Input[_builtins.str]] = None,
            prompt: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_actions_end: Optional[pulumi.Input[_builtins.str]] = None,
            secondary_actions_start: Optional[pulumi.Input[_builtins.str]] = None) -> 'PromptPartials':
        """
        Get an existing PromptPartials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] form_content_end: Content that goes at the end of the form.
        :param pulumi.Input[_builtins.str] form_content_start: Content that goes at the start of the form.
        :param pulumi.Input[_builtins.str] form_footer_end: Footer content for the end of the footer.
        :param pulumi.Input[_builtins.str] form_footer_start: Footer content for the start of the footer.
        :param pulumi.Input[_builtins.str] prompt: The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        :param pulumi.Input[_builtins.str] secondary_actions_end: Actions that go at the end of secondary actions.
        :param pulumi.Input[_builtins.str] secondary_actions_start: Actions that go at the start of secondary actions.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PromptPartialsState.__new__(_PromptPartialsState)

        __props__.__dict__["form_content_end"] = form_content_end
        __props__.__dict__["form_content_start"] = form_content_start
        __props__.__dict__["form_footer_end"] = form_footer_end
        __props__.__dict__["form_footer_start"] = form_footer_start
        __props__.__dict__["prompt"] = prompt
        __props__.__dict__["secondary_actions_end"] = secondary_actions_end
        __props__.__dict__["secondary_actions_start"] = secondary_actions_start
        return PromptPartials(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="formContentEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_end(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Content that goes at the end of the form.
        """
        return pulumi.get(self, "form_content_end")

    @_builtins.property
    @pulumi.getter(name="formContentStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_content_start(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Content that goes at the start of the form.
        """
        return pulumi.get(self, "form_content_start")

    @_builtins.property
    @pulumi.getter(name="formFooterEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_end(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Footer content for the end of the footer.
        """
        return pulumi.get(self, "form_footer_end")

    @_builtins.property
    @pulumi.getter(name="formFooterStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def form_footer_start(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Footer content for the start of the footer.
        """
        return pulumi.get(self, "form_footer_start")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def prompt(self) -> pulumi.Output[_builtins.str]:
        """
        The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        """
        return pulumi.get(self, "prompt")

    @_builtins.property
    @pulumi.getter(name="secondaryActionsEnd")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_end(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Actions that go at the end of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_end")

    @_builtins.property
    @pulumi.getter(name="secondaryActionsStart")
    @_utilities.deprecated("""This resource is deprecated and will be removed in the next major version. Please use `PromptScreenPartials` for managing multiple prompt screens or `PromptScreenPartial` for managing a single prompt screen, depending on your use case.""")
    def secondary_actions_start(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Actions that go at the start of secondary actions.
        """
        return pulumi.get(self, "secondary_actions_start")

