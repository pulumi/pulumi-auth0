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

__all__ = ['TokenExchangeProfileArgs', 'TokenExchangeProfile']

@pulumi.input_type
class TokenExchangeProfileArgs:
    def __init__(__self__, *,
                 action_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subject_token_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TokenExchangeProfile resource.
        :param pulumi.Input[str] action_id: Unique identifier of the Action
        :param pulumi.Input[str] name: Name of the token exchange profile.
        :param pulumi.Input[str] subject_token_type: Type of the subject token
        :param pulumi.Input[str] type: Type of the token exchange profile
        """
        if action_id is not None:
            pulumi.set(__self__, "action_id", action_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subject_token_type is not None:
            pulumi.set(__self__, "subject_token_type", subject_token_type)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the Action
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the token exchange profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="subjectTokenType")
    def subject_token_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the subject token
        """
        return pulumi.get(self, "subject_token_type")

    @subject_token_type.setter
    def subject_token_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_token_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the token exchange profile
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _TokenExchangeProfileState:
    def __init__(__self__, *,
                 action_id: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subject_token_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TokenExchangeProfile resources.
        :param pulumi.Input[str] action_id: Unique identifier of the Action
        :param pulumi.Input[str] created_at: The ISO 8601 formatted date the credential was created.
        :param pulumi.Input[str] name: Name of the token exchange profile.
        :param pulumi.Input[str] subject_token_type: Type of the subject token
        :param pulumi.Input[str] type: Type of the token exchange profile
        :param pulumi.Input[str] updated_at: The ISO 8601 formatted date the credential was updated.
        """
        if action_id is not None:
            pulumi.set(__self__, "action_id", action_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subject_token_type is not None:
            pulumi.set(__self__, "subject_token_type", subject_token_type)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the Action
        """
        return pulumi.get(self, "action_id")

    @action_id.setter
    def action_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action_id", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The ISO 8601 formatted date the credential was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the token exchange profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="subjectTokenType")
    def subject_token_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the subject token
        """
        return pulumi.get(self, "subject_token_type")

    @subject_token_type.setter
    def subject_token_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject_token_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the token exchange profile
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The ISO 8601 formatted date the credential was updated.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class TokenExchangeProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subject_token_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can manage Auth0 Custom Token Exchange Profiles

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Below action is created with custom-token-exchange as supported_triggers
        # This action is then linked using the action_id param to the token-exchange profile
        my_action = auth0.Action("my_action",
            name="TokenExchange-Action",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
        \\x09console.log("foo")
        };"
        \"\"\",
            deploy=True,
            supported_triggers={
                "id": "custom-token-exchange",
                "version": "v1",
            })
        my_token_exchange_profile = auth0.TokenExchangeProfile("my_token_exchange_profile",
            name="token-exchange-prof",
            subject_token_type="https://acme.com/cis-token",
            action_id=my_action.id,
            type="custom_authentication")
        ```

        ## Import

        This resource can be imported using the token exchange profile ID.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/tokenExchangeProfile:TokenExchangeProfile profile "tep_XXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Unique identifier of the Action
        :param pulumi.Input[str] name: Name of the token exchange profile.
        :param pulumi.Input[str] subject_token_type: Type of the subject token
        :param pulumi.Input[str] type: Type of the token exchange profile
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TokenExchangeProfileArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can manage Auth0 Custom Token Exchange Profiles

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # Below action is created with custom-token-exchange as supported_triggers
        # This action is then linked using the action_id param to the token-exchange profile
        my_action = auth0.Action("my_action",
            name="TokenExchange-Action",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
        \\x09console.log("foo")
        };"
        \"\"\",
            deploy=True,
            supported_triggers={
                "id": "custom-token-exchange",
                "version": "v1",
            })
        my_token_exchange_profile = auth0.TokenExchangeProfile("my_token_exchange_profile",
            name="token-exchange-prof",
            subject_token_type="https://acme.com/cis-token",
            action_id=my_action.id,
            type="custom_authentication")
        ```

        ## Import

        This resource can be imported using the token exchange profile ID.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/tokenExchangeProfile:TokenExchangeProfile profile "tep_XXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param TokenExchangeProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TokenExchangeProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subject_token_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TokenExchangeProfileArgs.__new__(TokenExchangeProfileArgs)

            __props__.__dict__["action_id"] = action_id
            __props__.__dict__["name"] = name
            __props__.__dict__["subject_token_type"] = subject_token_type
            __props__.__dict__["type"] = type
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        super(TokenExchangeProfile, __self__).__init__(
            'auth0:index/tokenExchangeProfile:TokenExchangeProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_id: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            subject_token_type: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'TokenExchangeProfile':
        """
        Get an existing TokenExchangeProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action_id: Unique identifier of the Action
        :param pulumi.Input[str] created_at: The ISO 8601 formatted date the credential was created.
        :param pulumi.Input[str] name: Name of the token exchange profile.
        :param pulumi.Input[str] subject_token_type: Type of the subject token
        :param pulumi.Input[str] type: Type of the token exchange profile
        :param pulumi.Input[str] updated_at: The ISO 8601 formatted date the credential was updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TokenExchangeProfileState.__new__(_TokenExchangeProfileState)

        __props__.__dict__["action_id"] = action_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["name"] = name
        __props__.__dict__["subject_token_type"] = subject_token_type
        __props__.__dict__["type"] = type
        __props__.__dict__["updated_at"] = updated_at
        return TokenExchangeProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionId")
    def action_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the Action
        """
        return pulumi.get(self, "action_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The ISO 8601 formatted date the credential was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the token exchange profile.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="subjectTokenType")
    def subject_token_type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of the subject token
        """
        return pulumi.get(self, "subject_token_type")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the token exchange profile
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The ISO 8601 formatted date the credential was updated.
        """
        return pulumi.get(self, "updated_at")

