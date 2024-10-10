# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .action import *
from .attack_protection import *
from .branding import *
from .branding_theme import *
from .client import *
from .client_credentials import *
from .client_grant import *
from .connection import *
from .connection_client import *
from .connection_clients import *
from .connection_scim_configuration import *
from .custom_domain import *
from .custom_domain_verification import *
from .email_provider import *
from .email_template import *
from .encryption_key_manager import *
from .flow import *
from .flow_vault_connection import *
from .form import *
from .get_attack_protection import *
from .get_branding import *
from .get_branding_theme import *
from .get_client import *
from .get_connection import *
from .get_connection_scim_configuration import *
from .get_custom_domain import *
from .get_flow import *
from .get_flow_vault_connection import *
from .get_form import *
from .get_organization import *
from .get_pages import *
from .get_prompt_screen_partials import *
from .get_resource_server import *
from .get_role import *
from .get_self_service_profile import *
from .get_signing_keys import *
from .get_tenant import *
from .get_user import *
from .guardian import *
from .hook import *
from .log_stream import *
from .organization import *
from .organization_client_grant import *
from .organization_connection import *
from .organization_connections import *
from .organization_member import *
from .organization_member_role import *
from .organization_member_roles import *
from .organization_members import *
from .pages import *
from .prompt import *
from .prompt_custom_text import *
from .prompt_partials import *
from .prompt_screen_partial import *
from .prompt_screen_partials import *
from .provider import *
from .resource_server import *
from .resource_server_scope import *
from .resource_server_scopes import *
from .role import *
from .role_permission import *
from .role_permissions import *
from .rule import *
from .rule_config import *
from .self_service_profile import *
from .tenant import *
from .trigger_action import *
from .trigger_actions import *
from .user import *
from .user_permission import *
from .user_permissions import *
from .user_role import *
from .user_roles import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_auth0.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_auth0.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "auth0",
  "mod": "index/action",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/action:Action": "Action"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/attackProtection",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/attackProtection:AttackProtection": "AttackProtection"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/branding",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/branding:Branding": "Branding"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/brandingTheme",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/brandingTheme:BrandingTheme": "BrandingTheme"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/client",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/client:Client": "Client"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/clientCredentials",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/clientCredentials:ClientCredentials": "ClientCredentials"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/clientGrant",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/clientGrant:ClientGrant": "ClientGrant"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/connection",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/connection:Connection": "Connection"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/connectionClient",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/connectionClient:ConnectionClient": "ConnectionClient"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/connectionClients",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/connectionClients:ConnectionClients": "ConnectionClients"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/connectionScimConfiguration",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/connectionScimConfiguration:ConnectionScimConfiguration": "ConnectionScimConfiguration"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/customDomain",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/customDomain:CustomDomain": "CustomDomain"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/customDomainVerification",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/customDomainVerification:CustomDomainVerification": "CustomDomainVerification"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/emailProvider",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/emailProvider:EmailProvider": "EmailProvider"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/emailTemplate",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/emailTemplate:EmailTemplate": "EmailTemplate"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/encryptionKeyManager",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/encryptionKeyManager:EncryptionKeyManager": "EncryptionKeyManager"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/flow",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/flow:Flow": "Flow"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/flowVaultConnection",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/flowVaultConnection:FlowVaultConnection": "FlowVaultConnection"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/form",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/form:Form": "Form"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/guardian",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/guardian:Guardian": "Guardian"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/hook",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/hook:Hook": "Hook"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/logStream",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/logStream:LogStream": "LogStream"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organization",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organization:Organization": "Organization"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationClientGrant",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationClientGrant:OrganizationClientGrant": "OrganizationClientGrant"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationConnection",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationConnection:OrganizationConnection": "OrganizationConnection"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationConnections",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationConnections:OrganizationConnections": "OrganizationConnections"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationMember",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationMember:OrganizationMember": "OrganizationMember"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationMemberRole",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationMemberRole:OrganizationMemberRole": "OrganizationMemberRole"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationMemberRoles",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationMemberRoles:OrganizationMemberRoles": "OrganizationMemberRoles"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/organizationMembers",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationMembers:OrganizationMembers": "OrganizationMembers"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/pages",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/pages:Pages": "Pages"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/prompt",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/prompt:Prompt": "Prompt"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/promptCustomText",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/promptCustomText:PromptCustomText": "PromptCustomText"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/promptPartials",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/promptPartials:PromptPartials": "PromptPartials"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/promptScreenPartial",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/promptScreenPartial:PromptScreenPartial": "PromptScreenPartial"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/promptScreenPartials",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/promptScreenPartials:PromptScreenPartials": "PromptScreenPartials"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/resourceServer",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/resourceServer:ResourceServer": "ResourceServer"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/resourceServerScope",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/resourceServerScope:ResourceServerScope": "ResourceServerScope"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/resourceServerScopes",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/resourceServerScopes:ResourceServerScopes": "ResourceServerScopes"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/role",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/role:Role": "Role"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/rolePermission",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/rolePermission:RolePermission": "RolePermission"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/rolePermissions",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/rolePermissions:RolePermissions": "RolePermissions"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/rule",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/rule:Rule": "Rule"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/ruleConfig",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/ruleConfig:RuleConfig": "RuleConfig"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/selfServiceProfile",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/selfServiceProfile:SelfServiceProfile": "SelfServiceProfile"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/tenant",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/tenant:Tenant": "Tenant"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/triggerAction",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/triggerAction:TriggerAction": "TriggerAction"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/triggerActions",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/triggerActions:TriggerActions": "TriggerActions"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/user",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/user:User": "User"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/userPermission",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/userPermission:UserPermission": "UserPermission"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/userPermissions",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/userPermissions:UserPermissions": "UserPermissions"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/userRole",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/userRole:UserRole": "UserRole"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/userRoles",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/userRoles:UserRoles": "UserRoles"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "auth0",
  "token": "pulumi:providers:auth0",
  "fqn": "pulumi_auth0",
  "class": "Provider"
 }
]
"""
)
