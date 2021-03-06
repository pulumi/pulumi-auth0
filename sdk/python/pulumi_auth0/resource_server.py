# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ResourceServerArgs', 'ResourceServer']

@pulumi.input_type
class ResourceServerArgs:
    def __init__(__self__, *,
                 allow_offline_access: Optional[pulumi.Input[bool]] = None,
                 enforce_policies: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]] = None,
                 signing_alg: Optional[pulumi.Input[str]] = None,
                 signing_secret: Optional[pulumi.Input[str]] = None,
                 skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
                 token_dialect: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[int]] = None,
                 token_lifetime_for_web: Optional[pulumi.Input[int]] = None,
                 verification_location: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ResourceServer resource.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[int] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[int] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
        """
        if allow_offline_access is not None:
            pulumi.set(__self__, "allow_offline_access", allow_offline_access)
        if enforce_policies is not None:
            pulumi.set(__self__, "enforce_policies", enforce_policies)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)
        if signing_alg is not None:
            pulumi.set(__self__, "signing_alg", signing_alg)
        if signing_secret is not None:
            pulumi.set(__self__, "signing_secret", signing_secret)
        if skip_consent_for_verifiable_first_party_clients is not None:
            pulumi.set(__self__, "skip_consent_for_verifiable_first_party_clients", skip_consent_for_verifiable_first_party_clients)
        if token_dialect is not None:
            pulumi.set(__self__, "token_dialect", token_dialect)
        if token_lifetime is not None:
            pulumi.set(__self__, "token_lifetime", token_lifetime)
        if token_lifetime_for_web is not None:
            pulumi.set(__self__, "token_lifetime_for_web", token_lifetime_for_web)
        if verification_location is not None:
            pulumi.set(__self__, "verification_location", verification_location)

    @property
    @pulumi.getter(name="allowOfflineAccess")
    def allow_offline_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        """
        return pulumi.get(self, "allow_offline_access")

    @allow_offline_access.setter
    def allow_offline_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_offline_access", value)

    @property
    @pulumi.getter(name="enforcePolicies")
    def enforce_policies(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not authorization polices are enforced.
        """
        return pulumi.get(self, "enforce_policies")

    @enforce_policies.setter
    def enforce_policies(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforce_policies", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map(String). Used to store additional metadata
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]]:
        """
        Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter(name="signingAlg")
    def signing_alg(self) -> Optional[pulumi.Input[str]]:
        """
        String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        """
        return pulumi.get(self, "signing_alg")

    @signing_alg.setter
    def signing_alg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signing_alg", value)

    @property
    @pulumi.getter(name="signingSecret")
    def signing_secret(self) -> Optional[pulumi.Input[str]]:
        """
        String. Secret used to sign tokens when using symmetric algorithms (HS256).
        """
        return pulumi.get(self, "signing_secret")

    @signing_secret.setter
    def signing_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signing_secret", value)

    @property
    @pulumi.getter(name="skipConsentForVerifiableFirstPartyClients")
    def skip_consent_for_verifiable_first_party_clients(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        """
        return pulumi.get(self, "skip_consent_for_verifiable_first_party_clients")

    @skip_consent_for_verifiable_first_party_clients.setter
    def skip_consent_for_verifiable_first_party_clients(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_consent_for_verifiable_first_party_clients", value)

    @property
    @pulumi.getter(name="tokenDialect")
    def token_dialect(self) -> Optional[pulumi.Input[str]]:
        """
        String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        """
        return pulumi.get(self, "token_dialect")

    @token_dialect.setter
    def token_dialect(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_dialect", value)

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        """
        return pulumi.get(self, "token_lifetime")

    @token_lifetime.setter
    def token_lifetime(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "token_lifetime", value)

    @property
    @pulumi.getter(name="tokenLifetimeForWeb")
    def token_lifetime_for_web(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        """
        return pulumi.get(self, "token_lifetime_for_web")

    @token_lifetime_for_web.setter
    def token_lifetime_for_web(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "token_lifetime_for_web", value)

    @property
    @pulumi.getter(name="verificationLocation")
    def verification_location(self) -> Optional[pulumi.Input[str]]:
        """
        String
        """
        return pulumi.get(self, "verification_location")

    @verification_location.setter
    def verification_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verification_location", value)


@pulumi.input_type
class _ResourceServerState:
    def __init__(__self__, *,
                 allow_offline_access: Optional[pulumi.Input[bool]] = None,
                 enforce_policies: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]] = None,
                 signing_alg: Optional[pulumi.Input[str]] = None,
                 signing_secret: Optional[pulumi.Input[str]] = None,
                 skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
                 token_dialect: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[int]] = None,
                 token_lifetime_for_web: Optional[pulumi.Input[int]] = None,
                 verification_location: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResourceServer resources.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[int] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[int] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
        """
        if allow_offline_access is not None:
            pulumi.set(__self__, "allow_offline_access", allow_offline_access)
        if enforce_policies is not None:
            pulumi.set(__self__, "enforce_policies", enforce_policies)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)
        if signing_alg is not None:
            pulumi.set(__self__, "signing_alg", signing_alg)
        if signing_secret is not None:
            pulumi.set(__self__, "signing_secret", signing_secret)
        if skip_consent_for_verifiable_first_party_clients is not None:
            pulumi.set(__self__, "skip_consent_for_verifiable_first_party_clients", skip_consent_for_verifiable_first_party_clients)
        if token_dialect is not None:
            pulumi.set(__self__, "token_dialect", token_dialect)
        if token_lifetime is not None:
            pulumi.set(__self__, "token_lifetime", token_lifetime)
        if token_lifetime_for_web is not None:
            pulumi.set(__self__, "token_lifetime_for_web", token_lifetime_for_web)
        if verification_location is not None:
            pulumi.set(__self__, "verification_location", verification_location)

    @property
    @pulumi.getter(name="allowOfflineAccess")
    def allow_offline_access(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        """
        return pulumi.get(self, "allow_offline_access")

    @allow_offline_access.setter
    def allow_offline_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_offline_access", value)

    @property
    @pulumi.getter(name="enforcePolicies")
    def enforce_policies(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not authorization polices are enforced.
        """
        return pulumi.get(self, "enforce_policies")

    @enforce_policies.setter
    def enforce_policies(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforce_policies", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map(String). Used to store additional metadata
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]]:
        """
        Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourceServerScopeArgs']]]]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter(name="signingAlg")
    def signing_alg(self) -> Optional[pulumi.Input[str]]:
        """
        String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        """
        return pulumi.get(self, "signing_alg")

    @signing_alg.setter
    def signing_alg(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signing_alg", value)

    @property
    @pulumi.getter(name="signingSecret")
    def signing_secret(self) -> Optional[pulumi.Input[str]]:
        """
        String. Secret used to sign tokens when using symmetric algorithms (HS256).
        """
        return pulumi.get(self, "signing_secret")

    @signing_secret.setter
    def signing_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signing_secret", value)

    @property
    @pulumi.getter(name="skipConsentForVerifiableFirstPartyClients")
    def skip_consent_for_verifiable_first_party_clients(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        """
        return pulumi.get(self, "skip_consent_for_verifiable_first_party_clients")

    @skip_consent_for_verifiable_first_party_clients.setter
    def skip_consent_for_verifiable_first_party_clients(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_consent_for_verifiable_first_party_clients", value)

    @property
    @pulumi.getter(name="tokenDialect")
    def token_dialect(self) -> Optional[pulumi.Input[str]]:
        """
        String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        """
        return pulumi.get(self, "token_dialect")

    @token_dialect.setter
    def token_dialect(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_dialect", value)

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        """
        return pulumi.get(self, "token_lifetime")

    @token_lifetime.setter
    def token_lifetime(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "token_lifetime", value)

    @property
    @pulumi.getter(name="tokenLifetimeForWeb")
    def token_lifetime_for_web(self) -> Optional[pulumi.Input[int]]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        """
        return pulumi.get(self, "token_lifetime_for_web")

    @token_lifetime_for_web.setter
    def token_lifetime_for_web(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "token_lifetime_for_web", value)

    @property
    @pulumi.getter(name="verificationLocation")
    def verification_location(self) -> Optional[pulumi.Input[str]]:
        """
        String
        """
        return pulumi.get(self, "verification_location")

    @verification_location.setter
    def verification_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verification_location", value)


class ResourceServer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_offline_access: Optional[pulumi.Input[bool]] = None,
                 enforce_policies: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]]] = None,
                 signing_alg: Optional[pulumi.Input[str]] = None,
                 signing_secret: Optional[pulumi.Input[str]] = None,
                 skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
                 token_dialect: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[int]] = None,
                 token_lifetime_for_web: Optional[pulumi.Input[int]] = None,
                 verification_location: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With this resource, you can set up APIs that can be consumed from your authorized applications.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_resource_server = auth0.ResourceServer("myResourceServer",
            allow_offline_access=True,
            identifier="https://api.example.com",
            scopes=[
                auth0.ResourceServerScopeArgs(
                    description="Create foos",
                    value="create:foo",
                ),
                auth0.ResourceServerScopeArgs(
                    description="Create bars",
                    value="create:bar",
                ),
            ],
            signing_alg="RS256",
            skip_consent_for_verifiable_first_party_clients=True,
            token_lifetime=8600)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[int] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[int] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ResourceServerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource, you can set up APIs that can be consumed from your authorized applications.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_resource_server = auth0.ResourceServer("myResourceServer",
            allow_offline_access=True,
            identifier="https://api.example.com",
            scopes=[
                auth0.ResourceServerScopeArgs(
                    description="Create foos",
                    value="create:foo",
                ),
                auth0.ResourceServerScopeArgs(
                    description="Create bars",
                    value="create:bar",
                ),
            ],
            signing_alg="RS256",
            skip_consent_for_verifiable_first_party_clients=True,
            token_lifetime=8600)
        ```

        :param str resource_name: The name of the resource.
        :param ResourceServerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceServerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_offline_access: Optional[pulumi.Input[bool]] = None,
                 enforce_policies: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]]] = None,
                 signing_alg: Optional[pulumi.Input[str]] = None,
                 signing_secret: Optional[pulumi.Input[str]] = None,
                 skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
                 token_dialect: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[int]] = None,
                 token_lifetime_for_web: Optional[pulumi.Input[int]] = None,
                 verification_location: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceServerArgs.__new__(ResourceServerArgs)

            __props__.__dict__["allow_offline_access"] = allow_offline_access
            __props__.__dict__["enforce_policies"] = enforce_policies
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["options"] = options
            __props__.__dict__["scopes"] = scopes
            __props__.__dict__["signing_alg"] = signing_alg
            __props__.__dict__["signing_secret"] = signing_secret
            __props__.__dict__["skip_consent_for_verifiable_first_party_clients"] = skip_consent_for_verifiable_first_party_clients
            __props__.__dict__["token_dialect"] = token_dialect
            __props__.__dict__["token_lifetime"] = token_lifetime
            __props__.__dict__["token_lifetime_for_web"] = token_lifetime_for_web
            __props__.__dict__["verification_location"] = verification_location
        super(ResourceServer, __self__).__init__(
            'auth0:index/resourceServer:ResourceServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_offline_access: Optional[pulumi.Input[bool]] = None,
            enforce_policies: Optional[pulumi.Input[bool]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]]] = None,
            signing_alg: Optional[pulumi.Input[str]] = None,
            signing_secret: Optional[pulumi.Input[str]] = None,
            skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
            token_dialect: Optional[pulumi.Input[str]] = None,
            token_lifetime: Optional[pulumi.Input[int]] = None,
            token_lifetime_for_web: Optional[pulumi.Input[int]] = None,
            verification_location: Optional[pulumi.Input[str]] = None) -> 'ResourceServer':
        """
        Get an existing ResourceServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[int] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[int] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceServerState.__new__(_ResourceServerState)

        __props__.__dict__["allow_offline_access"] = allow_offline_access
        __props__.__dict__["enforce_policies"] = enforce_policies
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["options"] = options
        __props__.__dict__["scopes"] = scopes
        __props__.__dict__["signing_alg"] = signing_alg
        __props__.__dict__["signing_secret"] = signing_secret
        __props__.__dict__["skip_consent_for_verifiable_first_party_clients"] = skip_consent_for_verifiable_first_party_clients
        __props__.__dict__["token_dialect"] = token_dialect
        __props__.__dict__["token_lifetime"] = token_lifetime
        __props__.__dict__["token_lifetime_for_web"] = token_lifetime_for_web
        __props__.__dict__["verification_location"] = verification_location
        return ResourceServer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowOfflineAccess")
    def allow_offline_access(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        """
        return pulumi.get(self, "allow_offline_access")

    @property
    @pulumi.getter(name="enforcePolicies")
    def enforce_policies(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. Indicates whether or not authorization polices are enforced.
        """
        return pulumi.get(self, "enforce_policies")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[Optional[str]]:
        """
        String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map(String). Used to store additional metadata
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[Optional[Sequence['outputs.ResourceServerScope']]]:
        """
        Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter(name="signingAlg")
    def signing_alg(self) -> pulumi.Output[str]:
        """
        String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        """
        return pulumi.get(self, "signing_alg")

    @property
    @pulumi.getter(name="signingSecret")
    def signing_secret(self) -> pulumi.Output[str]:
        """
        String. Secret used to sign tokens when using symmetric algorithms (HS256).
        """
        return pulumi.get(self, "signing_secret")

    @property
    @pulumi.getter(name="skipConsentForVerifiableFirstPartyClients")
    def skip_consent_for_verifiable_first_party_clients(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        """
        return pulumi.get(self, "skip_consent_for_verifiable_first_party_clients")

    @property
    @pulumi.getter(name="tokenDialect")
    def token_dialect(self) -> pulumi.Output[Optional[str]]:
        """
        String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        """
        return pulumi.get(self, "token_dialect")

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> pulumi.Output[int]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        """
        return pulumi.get(self, "token_lifetime")

    @property
    @pulumi.getter(name="tokenLifetimeForWeb")
    def token_lifetime_for_web(self) -> pulumi.Output[int]:
        """
        Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        """
        return pulumi.get(self, "token_lifetime_for_web")

    @property
    @pulumi.getter(name="verificationLocation")
    def verification_location(self) -> pulumi.Output[Optional[str]]:
        """
        String
        """
        return pulumi.get(self, "verification_location")

