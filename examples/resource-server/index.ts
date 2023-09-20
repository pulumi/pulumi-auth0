// Copyright 2016-2023, Pulumi Corporation.

import * as auth0 from "@pulumi/auth0";

let client = new auth0.ResourceServer("test", {
    name: "API (Managed by Pulumi)",
    identifier: "www.example.com",
    signingAlg: 'RS256',
    allowOfflineAccess: true,
    tokenLifetime: 86400,
});
