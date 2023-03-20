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
from .client_grant import *
from .connection import *
from .connection_client import *
from .custom_domain import *
from .custom_domain_verification import *
from .email import *
from .email_template import *
from .get_attack_protection import *
from .get_branding import *
from .get_branding_theme import *
from .get_client import *
from .get_connection import *
from .get_custom_domain import *
from .get_global_client import *
from .get_organization import *
from .get_resource_server import *
from .get_role import *
from .get_tenant import *
from .get_user import *
from .global_client import *
from .guardian import *
from .hook import *
from .log_stream import *
from .organization import *
from .organization_connection import *
from .organization_member import *
from .prompt import *
from .prompt_custom_text import *
from .provider import *
from .resource_server import *
from .role import *
from .rule import *
from .rule_config import *
from .tenant import *
from .trigger_binding import *
from .user import *
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
  "mod": "index/email",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/email:Email": "Email"
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
  "mod": "index/globalClient",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/globalClient:GlobalClient": "GlobalClient"
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
  "mod": "index/organizationConnection",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/organizationConnection:OrganizationConnection": "OrganizationConnection"
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
  "mod": "index/resourceServer",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/resourceServer:ResourceServer": "ResourceServer"
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
  "mod": "index/tenant",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/tenant:Tenant": "Tenant"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/triggerBinding",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/triggerBinding:TriggerBinding": "TriggerBinding"
  }
 },
 {
  "pkg": "auth0",
  "mod": "index/user",
  "fqn": "pulumi_auth0",
  "classes": {
   "auth0:index/user:User": "User"
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
