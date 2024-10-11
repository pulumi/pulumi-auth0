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

__all__ = [
    'GetFlowResult',
    'AwaitableGetFlowResult',
    'get_flow',
    'get_flow_output',
]

@pulumi.output_type
class GetFlowResult:
    """
    A collection of values returned by getFlow.
    """
    def __init__(__self__, actions=None, id=None, name=None):
        if actions and not isinstance(actions, str):
            raise TypeError("Expected argument 'actions' to be a str")
        pulumi.set(__self__, "actions", actions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def actions(self) -> str:
        """
        Actions of the flow.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the Flow.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the flow.
        """
        return pulumi.get(self, "name")


class AwaitableGetFlowResult(GetFlowResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlowResult(
            actions=self.actions,
            id=self.id,
            name=self.name)


def get_flow(id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlowResult:
    """
    Data source to retrieve a specific Auth0 Flow by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 flow loaded using its ID.
    my_flow_data = auth0.get_flow(id="af_5CTYdsXHLoLXD7ZVwvFHew")
    ```


    :param str id: The id of the Flow.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getFlow:getFlow', __args__, opts=opts, typ=GetFlowResult).value

    return AwaitableGetFlowResult(
        actions=pulumi.get(__ret__, 'actions'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))
def get_flow_output(id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlowResult]:
    """
    Data source to retrieve a specific Auth0 Flow by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 flow loaded using its ID.
    my_flow_data = auth0.get_flow(id="af_5CTYdsXHLoLXD7ZVwvFHew")
    ```


    :param str id: The id of the Flow.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getFlow:getFlow', __args__, opts=opts, typ=GetFlowResult)
    return __ret__.apply(lambda __response__: GetFlowResult(
        actions=pulumi.get(__response__, 'actions'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name')))
