// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class SelfServiceProfileUserAttribute
    {
        /// <summary>
        /// A human readable description of the attribute.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Indicates if this attribute is optional or if it has to be provided by the customer for the application to function.
        /// </summary>
        public readonly bool IsOptional;
        /// <summary>
        /// Attribute’s name on Auth0 side
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private SelfServiceProfileUserAttribute(
            string description,

            bool isOptional,

            string name)
        {
            Description = description;
            IsOptional = isOptional;
            Name = name;
        }
    }
}