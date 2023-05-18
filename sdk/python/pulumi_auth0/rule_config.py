# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RuleConfigArgs', 'RuleConfig']

@pulumi.input_type
class RuleConfigArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        The set of arguments for constructing a RuleConfig resource.
        :param pulumi.Input[str] key: Key for a rules configuration variable.
        :param pulumi.Input[str] value: Value for a rules configuration variable.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        Key for a rules configuration variable.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        Value for a rules configuration variable.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _RuleConfigState:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RuleConfig resources.
        :param pulumi.Input[str] key: Key for a rules configuration variable.
        :param pulumi.Input[str] value: Value for a rules configuration variable.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        Key for a rules configuration variable.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Value for a rules configuration variable.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class RuleConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0's global configuration object. Used in conjunction with configured rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_rule = auth0.Rule("myRule",
            enabled=True,
            script=\"\"\"    function (user, context, callback) {
              callback(null, user, context);
            }
          
        \"\"\")
        my_rule_config = auth0.RuleConfig("myRuleConfig",
            key="foo",
            value="bar")
        ```

        ## Import

        Existing rule configs can be imported using their key name. # Example

        ```sh
         $ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config foo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: Key for a rules configuration variable.
        :param pulumi.Input[str] value: Value for a rules configuration variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RuleConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0's global configuration object. Used in conjunction with configured rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_rule = auth0.Rule("myRule",
            enabled=True,
            script=\"\"\"    function (user, context, callback) {
              callback(null, user, context);
            }
          
        \"\"\")
        my_rule_config = auth0.RuleConfig("myRuleConfig",
            key="foo",
            value="bar")
        ```

        ## Import

        Existing rule configs can be imported using their key name. # Example

        ```sh
         $ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config foo
        ```

        :param str resource_name: The name of the resource.
        :param RuleConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RuleConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RuleConfigArgs.__new__(RuleConfigArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(RuleConfig, __self__).__init__(
            'auth0:index/ruleConfig:RuleConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'RuleConfig':
        """
        Get an existing RuleConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: Key for a rules configuration variable.
        :param pulumi.Input[str] value: Value for a rules configuration variable.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RuleConfigState.__new__(_RuleConfigState)

        __props__.__dict__["key"] = key
        __props__.__dict__["value"] = value
        return RuleConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        Key for a rules configuration variable.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        Value for a rules configuration variable.
        """
        return pulumi.get(self, "value")

