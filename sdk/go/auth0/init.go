// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "auth0:index/action:Action":
		r = &Action{}
	case "auth0:index/attackProtection:AttackProtection":
		r = &AttackProtection{}
	case "auth0:index/branding:Branding":
		r = &Branding{}
	case "auth0:index/brandingTheme:BrandingTheme":
		r = &BrandingTheme{}
	case "auth0:index/client:Client":
		r = &Client{}
	case "auth0:index/clientCredentials:ClientCredentials":
		r = &ClientCredentials{}
	case "auth0:index/clientGrant:ClientGrant":
		r = &ClientGrant{}
	case "auth0:index/connection:Connection":
		r = &Connection{}
	case "auth0:index/connectionClient:ConnectionClient":
		r = &ConnectionClient{}
	case "auth0:index/connectionClients:ConnectionClients":
		r = &ConnectionClients{}
	case "auth0:index/connectionScimConfiguration:ConnectionScimConfiguration":
		r = &ConnectionScimConfiguration{}
	case "auth0:index/customDomain:CustomDomain":
		r = &CustomDomain{}
	case "auth0:index/customDomainVerification:CustomDomainVerification":
		r = &CustomDomainVerification{}
	case "auth0:index/emailProvider:EmailProvider":
		r = &EmailProvider{}
	case "auth0:index/emailTemplate:EmailTemplate":
		r = &EmailTemplate{}
	case "auth0:index/encryptionKeyManager:EncryptionKeyManager":
		r = &EncryptionKeyManager{}
	case "auth0:index/flow:Flow":
		r = &Flow{}
	case "auth0:index/flowVaultConnection:FlowVaultConnection":
		r = &FlowVaultConnection{}
	case "auth0:index/form:Form":
		r = &Form{}
	case "auth0:index/guardian:Guardian":
		r = &Guardian{}
	case "auth0:index/hook:Hook":
		r = &Hook{}
	case "auth0:index/logStream:LogStream":
		r = &LogStream{}
	case "auth0:index/networkAcl:NetworkAcl":
		r = &NetworkAcl{}
	case "auth0:index/organization:Organization":
		r = &Organization{}
	case "auth0:index/organizationClientGrant:OrganizationClientGrant":
		r = &OrganizationClientGrant{}
	case "auth0:index/organizationConnection:OrganizationConnection":
		r = &OrganizationConnection{}
	case "auth0:index/organizationConnections:OrganizationConnections":
		r = &OrganizationConnections{}
	case "auth0:index/organizationMember:OrganizationMember":
		r = &OrganizationMember{}
	case "auth0:index/organizationMemberRole:OrganizationMemberRole":
		r = &OrganizationMemberRole{}
	case "auth0:index/organizationMemberRoles:OrganizationMemberRoles":
		r = &OrganizationMemberRoles{}
	case "auth0:index/organizationMembers:OrganizationMembers":
		r = &OrganizationMembers{}
	case "auth0:index/pages:Pages":
		r = &Pages{}
	case "auth0:index/phoneProvider:PhoneProvider":
		r = &PhoneProvider{}
	case "auth0:index/prompt:Prompt":
		r = &Prompt{}
	case "auth0:index/promptCustomText:PromptCustomText":
		r = &PromptCustomText{}
	case "auth0:index/promptPartials:PromptPartials":
		r = &PromptPartials{}
	case "auth0:index/promptScreenPartial:PromptScreenPartial":
		r = &PromptScreenPartial{}
	case "auth0:index/promptScreenPartials:PromptScreenPartials":
		r = &PromptScreenPartials{}
	case "auth0:index/promptScreenRenderer:PromptScreenRenderer":
		r = &PromptScreenRenderer{}
	case "auth0:index/resourceServer:ResourceServer":
		r = &ResourceServer{}
	case "auth0:index/resourceServerScope:ResourceServerScope":
		r = &ResourceServerScope{}
	case "auth0:index/resourceServerScopes:ResourceServerScopes":
		r = &ResourceServerScopes{}
	case "auth0:index/role:Role":
		r = &Role{}
	case "auth0:index/rolePermission:RolePermission":
		r = &RolePermission{}
	case "auth0:index/rolePermissions:RolePermissions":
		r = &RolePermissions{}
	case "auth0:index/rule:Rule":
		r = &Rule{}
	case "auth0:index/ruleConfig:RuleConfig":
		r = &RuleConfig{}
	case "auth0:index/selfServiceProfile:SelfServiceProfile":
		r = &SelfServiceProfile{}
	case "auth0:index/selfServiceProfileCustomText:SelfServiceProfileCustomText":
		r = &SelfServiceProfileCustomText{}
	case "auth0:index/tenant:Tenant":
		r = &Tenant{}
	case "auth0:index/tokenExchangeProfile:TokenExchangeProfile":
		r = &TokenExchangeProfile{}
	case "auth0:index/triggerAction:TriggerAction":
		r = &TriggerAction{}
	case "auth0:index/triggerActions:TriggerActions":
		r = &TriggerActions{}
	case "auth0:index/user:User":
		r = &User{}
	case "auth0:index/userPermission:UserPermission":
		r = &UserPermission{}
	case "auth0:index/userPermissions:UserPermissions":
		r = &UserPermissions{}
	case "auth0:index/userRole:UserRole":
		r = &UserRole{}
	case "auth0:index/userRoles:UserRoles":
		r = &UserRoles{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:auth0" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"auth0",
		"index/action",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/attackProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/branding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/brandingTheme",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/client",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/clientCredentials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/clientGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/connection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/connectionClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/connectionClients",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/connectionScimConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/customDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/customDomainVerification",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/emailProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/emailTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/encryptionKeyManager",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/flow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/flowVaultConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/form",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/guardian",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/hook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/logStream",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/networkAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationClientGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationConnections",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationMemberRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationMemberRoles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationMembers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/pages",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/phoneProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/prompt",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptCustomText",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptPartials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptScreenPartial",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptScreenPartials",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptScreenRenderer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/resourceServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/resourceServerScope",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/resourceServerScopes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/rolePermission",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/rolePermissions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/rule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/ruleConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/selfServiceProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/selfServiceProfileCustomText",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/tenant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/tokenExchangeProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/triggerAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/triggerActions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/userPermission",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/userPermissions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/userRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/userRoles",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"auth0",
		&pkg{version},
	)
}
