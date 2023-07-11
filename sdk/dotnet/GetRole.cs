// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetRole
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 role by `role_id` or `name`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_role_by_name = Auth0.GetRole.Invoke(new()
        ///     {
        ///         Name = "my-role",
        ///     });
        /// 
        ///     var some_role_by_id = Auth0.GetRole.Invoke(new()
        ///     {
        ///         RoleId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRoleResult> InvokeAsync(GetRoleArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRoleResult>("auth0:index/getRole:getRole", args ?? new GetRoleArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 role by `role_id` or `name`.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Auth0 = Pulumi.Auth0;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var some_role_by_name = Auth0.GetRole.Invoke(new()
        ///     {
        ///         Name = "my-role",
        ///     });
        /// 
        ///     var some_role_by_id = Auth0.GetRole.Invoke(new()
        ///     {
        ///         RoleId = "abcdefghkijklmnopqrstuvwxyz0123456789",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRoleResult> Invoke(GetRoleInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRoleResult>("auth0:index/getRole:getRole", args ?? new GetRoleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRoleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the role. If not provided, `role_id` must be set.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The ID of the role. If not provided, `name` must be set.
        /// </summary>
        [Input("roleId")]
        public string? RoleId { get; set; }

        public GetRoleArgs()
        {
        }
        public static new GetRoleArgs Empty => new GetRoleArgs();
    }

    public sealed class GetRoleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the role. If not provided, `role_id` must be set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the role. If not provided, `name` must be set.
        /// </summary>
        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        public GetRoleInvokeArgs()
        {
        }
        public static new GetRoleInvokeArgs Empty => new GetRoleInvokeArgs();
    }


    [OutputType]
    public sealed class GetRoleResult
    {
        /// <summary>
        /// Description of the role.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the role. If not provided, `role_id` must be set.
        /// </summary>
        public readonly string? Name;
        public readonly ImmutableArray<Outputs.GetRolePermissionResult> Permissions;
        /// <summary>
        /// The ID of the role. If not provided, `name` must be set.
        /// </summary>
        public readonly string? RoleId;

        [OutputConstructor]
        private GetRoleResult(
            string description,

            string id,

            string? name,

            ImmutableArray<Outputs.GetRolePermissionResult> permissions,

            string? roleId)
        {
            Description = description;
            Id = id;
            Name = name;
            Permissions = permissions;
            RoleId = roleId;
        }
    }
}
