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
    'GetActionResult',
    'AwaitableGetActionResult',
    'get_action',
    'get_action_output',
]

@pulumi.output_type
class GetActionResult:
    """
    A collection of values returned by getAction.
    """
    def __init__(__self__, code=None, dependencies=None, deploy=None, id=None, name=None, runtime=None, secrets=None, supported_triggers=None, version_id=None):
        if code and not isinstance(code, str):
            raise TypeError("Expected argument 'code' to be a str")
        pulumi.set(__self__, "code", code)
        if dependencies and not isinstance(dependencies, list):
            raise TypeError("Expected argument 'dependencies' to be a list")
        pulumi.set(__self__, "dependencies", dependencies)
        if deploy and not isinstance(deploy, bool):
            raise TypeError("Expected argument 'deploy' to be a bool")
        pulumi.set(__self__, "deploy", deploy)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if runtime and not isinstance(runtime, str):
            raise TypeError("Expected argument 'runtime' to be a str")
        pulumi.set(__self__, "runtime", runtime)
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)
        if supported_triggers and not isinstance(supported_triggers, list):
            raise TypeError("Expected argument 'supported_triggers' to be a list")
        pulumi.set(__self__, "supported_triggers", supported_triggers)
        if version_id and not isinstance(version_id, str):
            raise TypeError("Expected argument 'version_id' to be a str")
        pulumi.set(__self__, "version_id", version_id)

    @property
    @pulumi.getter
    def code(self) -> str:
        """
        The source code of the action.
        """
        return pulumi.get(self, "code")

    @property
    @pulumi.getter
    def dependencies(self) -> Sequence['outputs.GetActionDependencyResult']:
        """
        List of third party npm modules, and their versions, that this action depends on.
        """
        return pulumi.get(self, "dependencies")

    @property
    @pulumi.getter
    def deploy(self) -> bool:
        """
        Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
        """
        return pulumi.get(self, "deploy")

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        The ID of the action. If not provided, `name` must be set.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the action. If not provided, `id` must be set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def runtime(self) -> str:
        """
        The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
        """
        return pulumi.get(self, "runtime")

    @property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetActionSecretResult']:
        """
        List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
        """
        return pulumi.get(self, "secrets")

    @property
    @pulumi.getter(name="supportedTriggers")
    def supported_triggers(self) -> Sequence['outputs.GetActionSupportedTriggerResult']:
        """
        List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
        """
        return pulumi.get(self, "supported_triggers")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> str:
        """
        Version ID of the action. This value is available if `deploy` is set to true.
        """
        return pulumi.get(self, "version_id")


class AwaitableGetActionResult(GetActionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetActionResult(
            code=self.code,
            dependencies=self.dependencies,
            deploy=self.deploy,
            id=self.id,
            name=self.name,
            runtime=self.runtime,
            secrets=self.secrets,
            supported_triggers=self.supported_triggers,
            version_id=self.version_id)


def get_action(id: Optional[str] = None,
               name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetActionResult:
    """
    Data source to retrieve a specific Auth0 action by `name`.


    :param str id: The ID of the action. If not provided, `name` must be set.
    :param str name: The name of the action. If not provided, `id` must be set.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getAction:getAction', __args__, opts=opts, typ=GetActionResult).value

    return AwaitableGetActionResult(
        code=pulumi.get(__ret__, 'code'),
        dependencies=pulumi.get(__ret__, 'dependencies'),
        deploy=pulumi.get(__ret__, 'deploy'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        runtime=pulumi.get(__ret__, 'runtime'),
        secrets=pulumi.get(__ret__, 'secrets'),
        supported_triggers=pulumi.get(__ret__, 'supported_triggers'),
        version_id=pulumi.get(__ret__, 'version_id'))
def get_action_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                      name: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetActionResult]:
    """
    Data source to retrieve a specific Auth0 action by `name`.


    :param str id: The ID of the action. If not provided, `name` must be set.
    :param str name: The name of the action. If not provided, `id` must be set.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getAction:getAction', __args__, opts=opts, typ=GetActionResult)
    return __ret__.apply(lambda __response__: GetActionResult(
        code=pulumi.get(__response__, 'code'),
        dependencies=pulumi.get(__response__, 'dependencies'),
        deploy=pulumi.get(__response__, 'deploy'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        runtime=pulumi.get(__response__, 'runtime'),
        secrets=pulumi.get(__response__, 'secrets'),
        supported_triggers=pulumi.get(__response__, 'supported_triggers'),
        version_id=pulumi.get(__response__, 'version_id')))
