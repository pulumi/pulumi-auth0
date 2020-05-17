// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import * as auth0 from "@pulumi/auth0";

let client = new auth0.Client("test", {
    name: "Pulumi Test",
    appType: "non_interactive",
    customLoginPageOn: true,
    isFirstParty: true,
    isTokenEndpointIpHeaderTrusted: true,
    oidcConformant: false,
    tokenEndpointAuthMethod: "client_secret_post",
    clientMetadata: [
        {
            foo: "bar"
        }
    ],
    allowedLogoutUrls: [
        "https://example.com"
    ],
    allowedOrigins: [
        "https://example.com"
    ],
    callbacks: [
        "https://example.com/callback"
    ],
    grantTypes: [
        "authorization_code",
        "http://auth0.com/oauth/grant-type/password-realm",
        "implicit",
        "password",
        "refresh_token"
    ],
    webOrigins: [
        "https://example.com"
    ]
});

export let clietnId = client.clientId;