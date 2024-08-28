// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class SelfServiceProfileUserAttributeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A human readable description of the attribute.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Indicates if this attribute is optional or if it has to be provided by the customer for the application to function.
        /// </summary>
        [Input("isOptional", required: true)]
        public Input<bool> IsOptional { get; set; } = null!;

        /// <summary>
        /// Attribute’s name on Auth0 side
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public SelfServiceProfileUserAttributeGetArgs()
        {
        }
        public static new SelfServiceProfileUserAttributeGetArgs Empty => new SelfServiceProfileUserAttributeGetArgs();
    }
}
