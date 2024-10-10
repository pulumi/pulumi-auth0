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
    'GetResourceServerResult',
    'AwaitableGetResourceServerResult',
    'get_resource_server',
    'get_resource_server_output',
]

@pulumi.output_type
class GetResourceServerResult:
    """
    A collection of values returned by getResourceServer.
    """
    def __init__(__self__, allow_offline_access=None, enforce_policies=None, id=None, identifier=None, name=None, resource_server_id=None, scopes=None, signing_alg=None, signing_secret=None, skip_consent_for_verifiable_first_party_clients=None, token_dialect=None, token_lifetime=None, token_lifetime_for_web=None, verification_location=None):
        if allow_offline_access and not isinstance(allow_offline_access, bool):
            raise TypeError("Expected argument 'allow_offline_access' to be a bool")
        pulumi.set(__self__, "allow_offline_access", allow_offline_access)
        if enforce_policies and not isinstance(enforce_policies, bool):
            raise TypeError("Expected argument 'enforce_policies' to be a bool")
        pulumi.set(__self__, "enforce_policies", enforce_policies)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_server_id and not isinstance(resource_server_id, str):
            raise TypeError("Expected argument 'resource_server_id' to be a str")
        pulumi.set(__self__, "resource_server_id", resource_server_id)
        if scopes and not isinstance(scopes, list):
            raise TypeError("Expected argument 'scopes' to be a list")
        pulumi.set(__self__, "scopes", scopes)
        if signing_alg and not isinstance(signing_alg, str):
            raise TypeError("Expected argument 'signing_alg' to be a str")
        pulumi.set(__self__, "signing_alg", signing_alg)
        if signing_secret and not isinstance(signing_secret, str):
            raise TypeError("Expected argument 'signing_secret' to be a str")
        pulumi.set(__self__, "signing_secret", signing_secret)
        if skip_consent_for_verifiable_first_party_clients and not isinstance(skip_consent_for_verifiable_first_party_clients, bool):
            raise TypeError("Expected argument 'skip_consent_for_verifiable_first_party_clients' to be a bool")
        pulumi.set(__self__, "skip_consent_for_verifiable_first_party_clients", skip_consent_for_verifiable_first_party_clients)
        if token_dialect and not isinstance(token_dialect, str):
            raise TypeError("Expected argument 'token_dialect' to be a str")
        pulumi.set(__self__, "token_dialect", token_dialect)
        if token_lifetime and not isinstance(token_lifetime, int):
            raise TypeError("Expected argument 'token_lifetime' to be a int")
        pulumi.set(__self__, "token_lifetime", token_lifetime)
        if token_lifetime_for_web and not isinstance(token_lifetime_for_web, int):
            raise TypeError("Expected argument 'token_lifetime_for_web' to be a int")
        pulumi.set(__self__, "token_lifetime_for_web", token_lifetime_for_web)
        if verification_location and not isinstance(verification_location, str):
            raise TypeError("Expected argument 'verification_location' to be a str")
        pulumi.set(__self__, "verification_location", verification_location)

    @property
    @pulumi.getter(name="allowOfflineAccess")
    def allow_offline_access(self) -> bool:
        """
        Indicates whether refresh tokens can be issued for this resource server.
        """
        return pulumi.get(self, "allow_offline_access")

    @property
    @pulumi.getter(name="enforcePolicies")
    def enforce_policies(self) -> bool:
        """
        If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
        """
        return pulumi.get(self, "enforce_policies")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> Optional[str]:
        """
        Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Friendly name for the resource server. Cannot include `<` or `>` characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceServerId")
    def resource_server_id(self) -> Optional[str]:
        """
        The ID of the resource server. If not provided, `identifier` must be set.
        """
        return pulumi.get(self, "resource_server_id")

    @property
    @pulumi.getter
    def scopes(self) -> Sequence['outputs.GetResourceServerScopeResult']:
        """
        List of permissions (scopes) used by this resource server.
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter(name="signingAlg")
    def signing_alg(self) -> str:
        """
        Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        """
        return pulumi.get(self, "signing_alg")

    @property
    @pulumi.getter(name="signingSecret")
    def signing_secret(self) -> str:
        """
        Secret used to sign tokens when using symmetric algorithms (HS256).
        """
        return pulumi.get(self, "signing_secret")

    @property
    @pulumi.getter(name="skipConsentForVerifiableFirstPartyClients")
    def skip_consent_for_verifiable_first_party_clients(self) -> bool:
        """
        Indicates whether to skip user consent for applications flagged as first party.
        """
        return pulumi.get(self, "skip_consent_for_verifiable_first_party_clients")

    @property
    @pulumi.getter(name="tokenDialect")
    def token_dialect(self) -> str:
        """
        Dialect of access tokens that should be issued for this resource server. Options include `access_token`, `rfc9068_profile`, `access_token_authz`, and `rfc9068_profile_authz`. `access_token` is a JWT containing standard Auth0 claims. `rfc9068_profile` is a JWT conforming to the IETF JWT Access Token Profile. `access_token_authz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068_profile_authz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforce_policies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
        """
        return pulumi.get(self, "token_dialect")

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> int:
        """
        Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        """
        return pulumi.get(self, "token_lifetime")

    @property
    @pulumi.getter(name="tokenLifetimeForWeb")
    def token_lifetime_for_web(self) -> int:
        """
        Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        """
        return pulumi.get(self, "token_lifetime_for_web")

    @property
    @pulumi.getter(name="verificationLocation")
    def verification_location(self) -> str:
        """
        URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
        """
        return pulumi.get(self, "verification_location")


class AwaitableGetResourceServerResult(GetResourceServerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResourceServerResult(
            allow_offline_access=self.allow_offline_access,
            enforce_policies=self.enforce_policies,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            resource_server_id=self.resource_server_id,
            scopes=self.scopes,
            signing_alg=self.signing_alg,
            signing_secret=self.signing_secret,
            skip_consent_for_verifiable_first_party_clients=self.skip_consent_for_verifiable_first_party_clients,
            token_dialect=self.token_dialect,
            token_lifetime=self.token_lifetime,
            token_lifetime_for_web=self.token_lifetime_for_web,
            verification_location=self.verification_location)


def get_resource_server(identifier: Optional[str] = None,
                        resource_server_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResourceServerResult:
    """
    Data source to retrieve a specific Auth0 resource server by `resource_server_id` or `identifier`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Resource Server loaded using its identifier.
    some_resource_server_by_identifier = auth0.get_resource_server(identifier="https://my-api.com/v1")
    # An Auth0 Resource Server loaded using its ID.
    some_resource_server_by_id = auth0.get_resource_server(resource_server_id="abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str identifier: Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
    :param str resource_server_id: The ID of the resource server. If not provided, `identifier` must be set.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['resourceServerId'] = resource_server_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getResourceServer:getResourceServer', __args__, opts=opts, typ=GetResourceServerResult).value

    return AwaitableGetResourceServerResult(
        allow_offline_access=pulumi.get(__ret__, 'allow_offline_access'),
        enforce_policies=pulumi.get(__ret__, 'enforce_policies'),
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        name=pulumi.get(__ret__, 'name'),
        resource_server_id=pulumi.get(__ret__, 'resource_server_id'),
        scopes=pulumi.get(__ret__, 'scopes'),
        signing_alg=pulumi.get(__ret__, 'signing_alg'),
        signing_secret=pulumi.get(__ret__, 'signing_secret'),
        skip_consent_for_verifiable_first_party_clients=pulumi.get(__ret__, 'skip_consent_for_verifiable_first_party_clients'),
        token_dialect=pulumi.get(__ret__, 'token_dialect'),
        token_lifetime=pulumi.get(__ret__, 'token_lifetime'),
        token_lifetime_for_web=pulumi.get(__ret__, 'token_lifetime_for_web'),
        verification_location=pulumi.get(__ret__, 'verification_location'))
def get_resource_server_output(identifier: Optional[pulumi.Input[Optional[str]]] = None,
                               resource_server_id: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResourceServerResult]:
    """
    Data source to retrieve a specific Auth0 resource server by `resource_server_id` or `identifier`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Resource Server loaded using its identifier.
    some_resource_server_by_identifier = auth0.get_resource_server(identifier="https://my-api.com/v1")
    # An Auth0 Resource Server loaded using its ID.
    some_resource_server_by_id = auth0.get_resource_server(resource_server_id="abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str identifier: Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resource_server_id` must be set.
    :param str resource_server_id: The ID of the resource server. If not provided, `identifier` must be set.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['resourceServerId'] = resource_server_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getResourceServer:getResourceServer', __args__, opts=opts, typ=GetResourceServerResult)
    return __ret__.apply(lambda __response__: GetResourceServerResult(
        allow_offline_access=pulumi.get(__response__, 'allow_offline_access'),
        enforce_policies=pulumi.get(__response__, 'enforce_policies'),
        id=pulumi.get(__response__, 'id'),
        identifier=pulumi.get(__response__, 'identifier'),
        name=pulumi.get(__response__, 'name'),
        resource_server_id=pulumi.get(__response__, 'resource_server_id'),
        scopes=pulumi.get(__response__, 'scopes'),
        signing_alg=pulumi.get(__response__, 'signing_alg'),
        signing_secret=pulumi.get(__response__, 'signing_secret'),
        skip_consent_for_verifiable_first_party_clients=pulumi.get(__response__, 'skip_consent_for_verifiable_first_party_clients'),
        token_dialect=pulumi.get(__response__, 'token_dialect'),
        token_lifetime=pulumi.get(__response__, 'token_lifetime'),
        token_lifetime_for_web=pulumi.get(__response__, 'token_lifetime_for_web'),
        verification_location=pulumi.get(__response__, 'verification_location')))
