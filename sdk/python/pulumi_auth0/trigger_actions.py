# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TriggerActionsArgs', 'TriggerActions']

@pulumi.input_type
class TriggerActionsArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]],
                 trigger: pulumi.Input[str]):
        """
        The set of arguments for constructing a TriggerActions resource.
        :param pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]] actions: The list of actions bound to this trigger.
        :param pulumi.Input[str] trigger: The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "trigger", trigger)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]]:
        """
        The list of actions bound to this trigger.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def trigger(self) -> pulumi.Input[str]:
        """
        The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        return pulumi.get(self, "trigger")

    @trigger.setter
    def trigger(self, value: pulumi.Input[str]):
        pulumi.set(self, "trigger", value)


@pulumi.input_type
class _TriggerActionsState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]]] = None,
                 trigger: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TriggerActions resources.
        :param pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]] actions: The list of actions bound to this trigger.
        :param pulumi.Input[str] trigger: The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if trigger is not None:
            pulumi.set(__self__, "trigger", trigger)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]]]:
        """
        The list of actions bound to this trigger.
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TriggerActionsActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def trigger(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        return pulumi.get(self, "trigger")

    @trigger.setter
    def trigger(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trigger", value)


class TriggerActions(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TriggerActionsActionArgs']]]]] = None,
                 trigger: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can bind actions to a trigger. Once actions are created and deployed, they can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.

        !> This resource manages all the action bindings to a trigger. In contrast, the `TriggerAction` resource only
        appends an action to the trigger binding. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `TriggerAction` resource when binding actions to the same trigger.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        action_foo = auth0.Action("action_foo",
            name="Test Trigger Binding Foo",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
          console.log("foo");
        };"
        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v3",
            ))
        action_bar = auth0.Action("action_bar",
            name="Test Trigger Binding Bar",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
          console.log("bar");
        };"
        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v3",
            ))
        login_flow = auth0.TriggerActions("login_flow",
            trigger="post-login",
            actions=[
                auth0.TriggerActionsActionArgs(
                    id=action_foo.id,
                    display_name=action_foo.name,
                ),
                auth0.TriggerActionsActionArgs(
                    id=action_bar.id,
                    display_name=action_bar.name,
                ),
            ])
        ```

        ## Import

        This resource can be imported using the bindings trigger ID.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/triggerActions:TriggerActions example "post-login"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TriggerActionsActionArgs']]]] actions: The list of actions bound to this trigger.
        :param pulumi.Input[str] trigger: The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TriggerActionsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can bind actions to a trigger. Once actions are created and deployed, they can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.

        !> This resource manages all the action bindings to a trigger. In contrast, the `TriggerAction` resource only
        appends an action to the trigger binding. To avoid potential issues, it is recommended not to use this resource in
        conjunction with the `TriggerAction` resource when binding actions to the same trigger.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        action_foo = auth0.Action("action_foo",
            name="Test Trigger Binding Foo",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
          console.log("foo");
        };"
        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v3",
            ))
        action_bar = auth0.Action("action_bar",
            name="Test Trigger Binding Bar",
            code=\"\"\"exports.onContinuePostLogin = async (event, api) => {
          console.log("bar");
        };"
        \"\"\",
            deploy=True,
            supported_triggers=auth0.ActionSupportedTriggersArgs(
                id="post-login",
                version="v3",
            ))
        login_flow = auth0.TriggerActions("login_flow",
            trigger="post-login",
            actions=[
                auth0.TriggerActionsActionArgs(
                    id=action_foo.id,
                    display_name=action_foo.name,
                ),
                auth0.TriggerActionsActionArgs(
                    id=action_bar.id,
                    display_name=action_bar.name,
                ),
            ])
        ```

        ## Import

        This resource can be imported using the bindings trigger ID.

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/triggerActions:TriggerActions example "post-login"
        ```

        :param str resource_name: The name of the resource.
        :param TriggerActionsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TriggerActionsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TriggerActionsActionArgs']]]]] = None,
                 trigger: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TriggerActionsArgs.__new__(TriggerActionsArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            if trigger is None and not opts.urn:
                raise TypeError("Missing required property 'trigger'")
            __props__.__dict__["trigger"] = trigger
        super(TriggerActions, __self__).__init__(
            'auth0:index/triggerActions:TriggerActions',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TriggerActionsActionArgs']]]]] = None,
            trigger: Optional[pulumi.Input[str]] = None) -> 'TriggerActions':
        """
        Get an existing TriggerActions resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TriggerActionsActionArgs']]]] actions: The list of actions bound to this trigger.
        :param pulumi.Input[str] trigger: The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TriggerActionsState.__new__(_TriggerActionsState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["trigger"] = trigger
        return TriggerActions(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence['outputs.TriggerActionsAction']]:
        """
        The list of actions bound to this trigger.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def trigger(self) -> pulumi.Output[str]:
        """
        The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval` , `iga-certification` , `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        """
        return pulumi.get(self, "trigger")

