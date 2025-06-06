// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GetPromptScreenPartialsScreenPartialArgs : global::Pulumi.InvokeArgs
    {
        [Input("insertionPoints", required: true)]
        private List<Inputs.GetPromptScreenPartialsScreenPartialInsertionPointArgs>? _insertionPoints;
        public List<Inputs.GetPromptScreenPartialsScreenPartialInsertionPointArgs> InsertionPoints
        {
            get => _insertionPoints ?? (_insertionPoints = new List<Inputs.GetPromptScreenPartialsScreenPartialInsertionPointArgs>());
            set => _insertionPoints = value;
        }

        /// <summary>
        /// The name of the screen associated with the partials
        /// </summary>
        [Input("screenName", required: true)]
        public string ScreenName { get; set; } = null!;

        public GetPromptScreenPartialsScreenPartialArgs()
        {
        }
        public static new GetPromptScreenPartialsScreenPartialArgs Empty => new GetPromptScreenPartialsScreenPartialArgs();
    }
}
