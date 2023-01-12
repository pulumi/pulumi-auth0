// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetTenant
    {
        /// <summary>
        /// Use this data source to access information about the tenant this provider is configured to access.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myTenant = Auth0.GetTenant.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTenantResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTenantResult>("auth0:index/getTenant:getTenant", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetTenantResult
    {
        /// <summary>
        /// Your Auth0 domain name.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
        /// </summary>
        public readonly string ManagementApiIdentifier;

        [OutputConstructor]
        private GetTenantResult(
            string domain,

            string id,

            string managementApiIdentifier)
        {
            Domain = domain;
            Id = id;
            ManagementApiIdentifier = managementApiIdentifier;
        }
    }
}
