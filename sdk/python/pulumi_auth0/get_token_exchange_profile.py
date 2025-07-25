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

__all__ = [
    'GetTokenExchangeProfileResult',
    'AwaitableGetTokenExchangeProfileResult',
    'get_token_exchange_profile',
    'get_token_exchange_profile_output',
]

@pulumi.output_type
class GetTokenExchangeProfileResult:
    """
    A collection of values returned by getTokenExchangeProfile.
    """
    def __init__(__self__, action_id=None, created_at=None, id=None, name=None, subject_token_type=None, type=None, updated_at=None):
        if action_id and not isinstance(action_id, str):
            raise TypeError("Expected argument 'action_id' to be a str")
        pulumi.set(__self__, "action_id", action_id)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if subject_token_type and not isinstance(subject_token_type, str):
            raise TypeError("Expected argument 'subject_token_type' to be a str")
        pulumi.set(__self__, "subject_token_type", subject_token_type)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @_builtins.property
    @pulumi.getter(name="actionId")
    def action_id(self) -> _builtins.str:
        """
        Unique identifier of the Action
        """
        return pulumi.get(self, "action_id")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> _builtins.str:
        """
        The ISO 8601 formatted date the credential was created.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The id of the Token Exchange Profile
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the token exchange profile.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="subjectTokenType")
    def subject_token_type(self) -> _builtins.str:
        """
        Type of the subject token
        """
        return pulumi.get(self, "subject_token_type")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        Type of the token exchange profile
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> _builtins.str:
        """
        The ISO 8601 formatted date the credential was updated.
        """
        return pulumi.get(self, "updated_at")


class AwaitableGetTokenExchangeProfileResult(GetTokenExchangeProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTokenExchangeProfileResult(
            action_id=self.action_id,
            created_at=self.created_at,
            id=self.id,
            name=self.name,
            subject_token_type=self.subject_token_type,
            type=self.type,
            updated_at=self.updated_at)


def get_token_exchange_profile(id: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTokenExchangeProfileResult:
    """
    Data source to retrieve a specific Auth0 Token Exchange Profile by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Token Exchange Profile loaded using its ID.
    my_profile = auth0.get_token_exchange_profile(id="tep_Tnvl88SKv98TkMmr")
    ```


    :param _builtins.str id: The id of the Token Exchange Profile
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getTokenExchangeProfile:getTokenExchangeProfile', __args__, opts=opts, typ=GetTokenExchangeProfileResult).value

    return AwaitableGetTokenExchangeProfileResult(
        action_id=pulumi.get(__ret__, 'action_id'),
        created_at=pulumi.get(__ret__, 'created_at'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        subject_token_type=pulumi.get(__ret__, 'subject_token_type'),
        type=pulumi.get(__ret__, 'type'),
        updated_at=pulumi.get(__ret__, 'updated_at'))
def get_token_exchange_profile_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTokenExchangeProfileResult]:
    """
    Data source to retrieve a specific Auth0 Token Exchange Profile by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Token Exchange Profile loaded using its ID.
    my_profile = auth0.get_token_exchange_profile(id="tep_Tnvl88SKv98TkMmr")
    ```


    :param _builtins.str id: The id of the Token Exchange Profile
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getTokenExchangeProfile:getTokenExchangeProfile', __args__, opts=opts, typ=GetTokenExchangeProfileResult)
    return __ret__.apply(lambda __response__: GetTokenExchangeProfileResult(
        action_id=pulumi.get(__response__, 'action_id'),
        created_at=pulumi.get(__response__, 'created_at'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        subject_token_type=pulumi.get(__response__, 'subject_token_type'),
        type=pulumi.get(__response__, 'type'),
        updated_at=pulumi.get(__response__, 'updated_at')))
