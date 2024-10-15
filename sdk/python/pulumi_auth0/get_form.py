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

__all__ = [
    'GetFormResult',
    'AwaitableGetFormResult',
    'get_form',
    'get_form_output',
]

@pulumi.output_type
class GetFormResult:
    """
    A collection of values returned by getForm.
    """
    def __init__(__self__, ending=None, id=None, languages=None, messages=None, name=None, nodes=None, start=None, style=None, translations=None):
        if ending and not isinstance(ending, str):
            raise TypeError("Expected argument 'ending' to be a str")
        pulumi.set(__self__, "ending", ending)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if languages and not isinstance(languages, list):
            raise TypeError("Expected argument 'languages' to be a list")
        pulumi.set(__self__, "languages", languages)
        if messages and not isinstance(messages, list):
            raise TypeError("Expected argument 'messages' to be a list")
        pulumi.set(__self__, "messages", messages)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nodes and not isinstance(nodes, str):
            raise TypeError("Expected argument 'nodes' to be a str")
        pulumi.set(__self__, "nodes", nodes)
        if start and not isinstance(start, str):
            raise TypeError("Expected argument 'start' to be a str")
        pulumi.set(__self__, "start", start)
        if style and not isinstance(style, str):
            raise TypeError("Expected argument 'style' to be a str")
        pulumi.set(__self__, "style", style)
        if translations and not isinstance(translations, str):
            raise TypeError("Expected argument 'translations' to be a str")
        pulumi.set(__self__, "translations", translations)

    @property
    @pulumi.getter
    def ending(self) -> str:
        """
        Submission configuration of the form. (JSON encoded)
        """
        return pulumi.get(self, "ending")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the Form.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def languages(self) -> Sequence['outputs.GetFormLanguageResult']:
        """
        Language specific configuration for the form.
        """
        return pulumi.get(self, "languages")

    @property
    @pulumi.getter
    def messages(self) -> Sequence['outputs.GetFormMessageResult']:
        """
        Message specific configuration for the form.
        """
        return pulumi.get(self, "messages")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the form.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nodes(self) -> str:
        """
        Nodes of the form. (JSON encoded)
        """
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter
    def start(self) -> str:
        """
        Input setup of the form. (JSON encoded)
        """
        return pulumi.get(self, "start")

    @property
    @pulumi.getter
    def style(self) -> str:
        """
        Style specific configuration for the form. (JSON encoded)
        """
        return pulumi.get(self, "style")

    @property
    @pulumi.getter
    def translations(self) -> str:
        """
        Translations of the form. (JSON encoded)
        """
        return pulumi.get(self, "translations")


class AwaitableGetFormResult(GetFormResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFormResult(
            ending=self.ending,
            id=self.id,
            languages=self.languages,
            messages=self.messages,
            name=self.name,
            nodes=self.nodes,
            start=self.start,
            style=self.style,
            translations=self.translations)


def get_form(id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFormResult:
    """
    Data source to retrieve a specific Auth0 Form by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 form loaded using its ID.
    my_form_data = auth0.get_form(id="ap_31LxRJphZF1Kqzf2zBgmgA")
    ```


    :param str id: The id of the Form.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getForm:getForm', __args__, opts=opts, typ=GetFormResult).value

    return AwaitableGetFormResult(
        ending=pulumi.get(__ret__, 'ending'),
        id=pulumi.get(__ret__, 'id'),
        languages=pulumi.get(__ret__, 'languages'),
        messages=pulumi.get(__ret__, 'messages'),
        name=pulumi.get(__ret__, 'name'),
        nodes=pulumi.get(__ret__, 'nodes'),
        start=pulumi.get(__ret__, 'start'),
        style=pulumi.get(__ret__, 'style'),
        translations=pulumi.get(__ret__, 'translations'))
def get_form_output(id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFormResult]:
    """
    Data source to retrieve a specific Auth0 Form by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 form loaded using its ID.
    my_form_data = auth0.get_form(id="ap_31LxRJphZF1Kqzf2zBgmgA")
    ```


    :param str id: The id of the Form.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getForm:getForm', __args__, opts=opts, typ=GetFormResult)
    return __ret__.apply(lambda __response__: GetFormResult(
        ending=pulumi.get(__response__, 'ending'),
        id=pulumi.get(__response__, 'id'),
        languages=pulumi.get(__response__, 'languages'),
        messages=pulumi.get(__response__, 'messages'),
        name=pulumi.get(__response__, 'name'),
        nodes=pulumi.get(__response__, 'nodes'),
        start=pulumi.get(__response__, 'start'),
        style=pulumi.get(__response__, 'style'),
        translations=pulumi.get(__response__, 'translations')))
