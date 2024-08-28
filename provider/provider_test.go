// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.
package auth0_test

import (
	"context"
	"testing"

	testutils "github.com/pulumi/providertest/replay"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	auth0 "github.com/pulumi/pulumi-auth0/provider/v3"
	"github.com/pulumi/pulumi-auth0/provider/v3/pkg/version"
)

func server() pulumirpc.ResourceProviderServer {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := auth0.Provider()
	return tfbridge.NewProvider(ctx, nil, info.Name, version.Version, info.P, info,
		/*
		 * We leave the schema blank. This will result in incorrect calls to
		 * GetSchema, but otherwise does not effect the provider. It reduces the
		 * time to test start by minutes.
		 */
		[]byte("{}"),
	)
}

// TODO[pulumi/pulumi-auth0#587]: Remove non-prc test after enabling PRC by default.
func TestConnectionMigration(t *testing.T) {
	testutils.ReplaySequence(t, server(), `[
        {
            "method": "/pulumirpc.ResourceProvider/Diff",
            "request": {
                "id": "con_28GC8g8h3O4RUSSM",
                "urn": "urn:pulumi:dev::dev-yaml::auth0:index/connection:Connection::googleOauth2",
                "olds": {
                    "__meta": "{\"schema_version\":\"2\"}",
                    "displayName": "",
                    "enabledClients": [],
                    "id": "con_28GC8g8h3O4RUSSM",
                    "isDomainConnection": false,
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "adfsServer": "",
                        "allowedAudiences": [
                            "api.example.com",
                            "example.com"
                        ],
                        "apiEnableUsers": false,
                        "appDomain": "",
                        "appId": "",
                        "authorizationEndpoint": "",
                        "bruteForceProtection": false,
                        "clientId": "",
                        "clientSecret": "",
                        "communityBaseUrl": "",
                        "configuration": {},
                        "customScripts": {},
                        "debug": false,
                        "digestAlgorithm": "",
                        "disableCache": false,
                        "disableSignup": false,
                        "discoveryUrl": "",
                        "domain": "",
                        "domainAliases": [],
                        "enabledDatabaseCustomization": false,
                        "entityId": "",
                        "fieldsMap": {},
                        "forwardRequestInfo": false,
                        "from": "",
                        "gatewayAuthentication": null,
                        "gatewayUrl": "",
                        "iconUrl": "",
                        "identityApi": "",
                        "idpInitiated": null,
                        "importMode": false,
                        "ips": [],
                        "issuer": "",
                        "jwksUri": "",
                        "keyId": "",
                        "maxGroupsToRetrieve": "",
                        "messagingServiceSid": "",
                        "mfa": null,
                        "name": "",
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "passwordComplexityOptions": null,
                        "passwordDictionary": null,
                        "passwordHistories": [],
                        "passwordNoPersonalInfo": null,
                        "passwordPolicy": "",
                        "protocolBinding": "",
                        "provider": "",
                        "requestTemplate": "",
                        "requiresUsername": false,
                        "scopes": [
                            "youtube",
                            "gmail",
                            "profile",
                            "email"
                        ],
                        "scripts": {},
                        "setUserRootAttributes": "on_each_login",
                        "shouldTrustEmailVerifiedConnection": "",
                        "signInEndpoint": "",
                        "signOutEndpoint": "",
                        "signSamlRequest": false,
                        "signatureAlgorithm": "",
                        "signingCert": "",
                        "strategyVersion": 0,
                        "subject": "",
                        "syntax": "",
                        "teamId": "",
                        "template": "",
                        "tenantDomain": "",
                        "tokenEndpoint": "",
                        "totp": null,
                        "twilioSid": "",
                        "twilioToken": "",
                        "type": "",
                        "useCertAuth": false,
                        "useKerberos": false,
                        "useWsfed": false,
                        "userIdAttribute": "",
                        "userinfoEndpoint": "",
                        "validation": null,
                        "waadCommonEndpoint": false,
                        "waadProtocol": ""
                    },
                    "realms": [
                        "googleOauth2-b68d006"
                    ],
                    "strategy": "google-oauth2"
                },
                "news": {
                    "__defaults": [
                        "name"
                    ],
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "__defaults": [],
                        "allowedAudiences": [
                            "example.com",
                            "api.example.com"
                        ],
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "scopes": [
                            "email",
                            "profile",
                            "gmail",
                            "youtube"
                        ],
                        "setUserRootAttributes": "on_each_login"
                    },
                    "strategy": "google-oauth2"
                },
                "oldInputs": {
                    "__defaults": [
                        "name"
                    ],
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "__defaults": [],
                        "allowedAudiences": [
                            "example.com",
                            "api.example.com"
                        ],
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "scopes": [
                            "email",
                            "profile",
                            "gmail",
                            "youtube"
                        ],
                        "setUserRootAttributes": "on_each_login"
                    },
                    "strategy": "google-oauth2"
                }
            },
            "response": {
                "stables": "*",
                "changes": "DIFF_SOME",
                "diffs": [
                    "options"
                ],
                "detailedDiff": {
                    "options.fieldsMap": {
                        "kind": "DELETE"
                    }
                },
                "hasDetailedDiff": true
            },
            "metadata": {
                "kind": "resource",
                "mode": "client",
                "name": "auth0"
            }
        },
        {
            "method": "/pulumirpc.ResourceProvider/Update",
            "request": {
                "id": "con_28GC8g8h3O4RUSSM",
                "urn": "urn:pulumi:dev::dev-yaml::auth0:index/connection:Connection::googleOauth2",
                "olds": {
                    "__meta": "{\"schema_version\":\"2\"}",
                    "displayName": "",
                    "enabledClients": [],
                    "id": "con_28GC8g8h3O4RUSSM",
                    "isDomainConnection": false,
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "adfsServer": "",
                        "allowedAudiences": [
                            "api.example.com",
                            "example.com"
                        ],
                        "apiEnableUsers": false,
                        "appDomain": "",
                        "appId": "",
                        "authorizationEndpoint": "",
                        "bruteForceProtection": false,
                        "clientId": "",
                        "clientSecret": "",
                        "communityBaseUrl": "",
                        "configuration": {},
                        "customScripts": {},
                        "debug": false,
                        "digestAlgorithm": "",
                        "disableCache": false,
                        "disableSignup": false,
                        "discoveryUrl": "",
                        "domain": "",
                        "domainAliases": [],
                        "enabledDatabaseCustomization": false,
                        "entityId": "",
                        "fieldsMap": {},
                        "forwardRequestInfo": false,
                        "from": "",
                        "gatewayAuthentication": null,
                        "gatewayUrl": "",
                        "iconUrl": "",
                        "identityApi": "",
                        "idpInitiated": null,
                        "importMode": false,
                        "ips": [],
                        "issuer": "",
                        "jwksUri": "",
                        "keyId": "",
                        "maxGroupsToRetrieve": "",
                        "messagingServiceSid": "",
                        "mfa": null,
                        "name": "",
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "passwordComplexityOptions": null,
                        "passwordDictionary": null,
                        "passwordHistories": [],
                        "passwordNoPersonalInfo": null,
                        "passwordPolicy": "",
                        "protocolBinding": "",
                        "provider": "",
                        "requestTemplate": "",
                        "requiresUsername": false,
                        "scopes": [
                            "youtube",
                            "gmail",
                            "profile",
                            "email"
                        ],
                        "scripts": {},
                        "setUserRootAttributes": "on_each_login",
                        "shouldTrustEmailVerifiedConnection": "",
                        "signInEndpoint": "",
                        "signOutEndpoint": "",
                        "signSamlRequest": false,
                        "signatureAlgorithm": "",
                        "signingCert": "",
                        "strategyVersion": 0,
                        "subject": "",
                        "syntax": "",
                        "teamId": "",
                        "template": "",
                        "tenantDomain": "",
                        "tokenEndpoint": "",
                        "totp": null,
                        "twilioSid": "",
                        "twilioToken": "",
                        "type": "",
                        "useCertAuth": false,
                        "useKerberos": false,
                        "useWsfed": false,
                        "userIdAttribute": "",
                        "userinfoEndpoint": "",
                        "validation": null,
                        "waadCommonEndpoint": false,
                        "waadProtocol": ""
                    },
                    "realms": [
                        "googleOauth2-b68d006"
                    ],
                    "strategy": "google-oauth2"
                },
                "news": {
                    "__defaults": [
                        "name"
                    ],
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "__defaults": [],
                        "allowedAudiences": [
                            "example.com",
                            "api.example.com"
                        ],
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "scopes": [
                            "email",
                            "profile",
                            "gmail",
                            "youtube"
                        ],
                        "setUserRootAttributes": "on_each_login"
                    },
                    "strategy": "google-oauth2"
                },
                "preview": true,
                "oldInputs": {
                    "__defaults": [
                        "name"
                    ],
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "__defaults": [],
                        "allowedAudiences": [
                            "example.com",
                            "api.example.com"
                        ],
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "scopes": [
                            "email",
                            "profile",
                            "gmail",
                            "youtube"
                        ],
                        "setUserRootAttributes": "on_each_login"
                    },
                    "strategy": "google-oauth2"
                }
            },
            "response": {
                "properties": {
                    "metadata": null,
                    "displayName": "",
                    "id": "con_28GC8g8h3O4RUSSM",
                    "isDomainConnection": false,
                    "name": "googleOauth2-b68d006",
                    "options": {
                        "attributes": [],
                        "precedences": [],
                        "adfsServer": "",
                        "allowedAudiences": [
                            "api.example.com",
                            "example.com"
                        ],
                        "apiEnableUsers": false,
                        "appId": "",
                        "attributeMap": null,
                        "authParams": {},
                        "authorizationEndpoint": "",
                        "bruteForceProtection": false,
                        "clientId": "",
                        "clientSecret": "",
                        "communityBaseUrl": "",
                        "configuration": {},
                        "connectionSettings": null,
                        "customScripts": {},
                        "debug": false,
                        "decryptionKey": null,
                        "digestAlgorithm": "",
                        "disableCache": false,
                        "disableSelfServiceChangePassword": false,
                        "disableSignOut": false,
                        "disableSignup": false,
                        "discoveryUrl": "",
                        "domain": "",
                        "domainAliases": [],
                        "enableScriptContext": false,
                        "enabledDatabaseCustomization": false,
                        "entityId": "",
                        "fedMetadataXml": "",
                        "fieldsMap": null,
                        "forwardRequestInfo": false,
                        "from": "",
                        "gatewayAuthentication": null,
                        "gatewayUrl": "",
                        "iconUrl": "",
                        "identityApi": "",
                        "idpInitiated": null,
                        "importMode": false,
                        "ips": [],
                        "issuer": "",
                        "jwksUri": "",
                        "keyId": "",
                        "mapUserIdToId": false,
                        "maxGroupsToRetrieve": "",
                        "messagingServiceSid": "",
                        "metadataUrl": "",
                        "metadataXml": "",
                        "mfa": null,
                        "name": "",
                        "nonPersistentAttrs": [
                            "ethnicity",
                            "gender"
                        ],
                        "passwordComplexityOptions": null,
                        "passwordDictionary": null,
                        "passwordHistories": [],
                        "passwordNoPersonalInfo": null,
                        "passwordPolicy": "",
                        "pingFederateBaseUrl": "",
                        "pkceEnabled": false,
                        "protocolBinding": "",
                        "provider": "",
                        "requestTemplate": "",
                        "requiresUsername": false,
                        "scopes": [
                            "email",
                            "gmail",
                            "profile",
                            "youtube"
                        ],
                        "scripts": {},
                        "setUserRootAttributes": "on_each_login",
                        "shouldTrustEmailVerifiedConnection": "",
                        "signInEndpoint": "",
                        "signOutEndpoint": "",
                        "signSamlRequest": false,
                        "signatureAlgorithm": "",
                        "signingCert": "",
                        "signingKey": null,
                        "strategyVersion": 0,
                        "subject": "",
                        "syntax": "",
                        "teamId": "",
                        "template": "",
                        "tenantDomain": "",
                        "tokenEndpoint": "",
                        "totp": null,
                        "twilioSid": "",
                        "twilioToken": "",
                        "type": "",
                        "upstreamParams": "",
                        "useCertAuth": false,
                        "useKerberos": false,
                        "useWsfed": false,
                        "userIdAttribute": "",
                        "userinfoEndpoint": "",
                        "validation": null,
                        "waadCommonEndpoint": false,
                        "waadProtocol": ""
                    },
                    "showAsButton": null,
                    "realms": [
                        "googleOauth2-b68d006"
                    ],
                    "strategy": "google-oauth2"
                }
            },
            "metadata": {
                "kind": "resource",
                "mode": "client",
                "name": "auth0"
            }
        }
    ]
`)
}
