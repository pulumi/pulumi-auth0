// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsPasswordDictionaryArgs : global::Pulumi.ResourceArgs
    {
        [Input("dictionaries")]
        private InputList<string>? _dictionaries;

        /// <summary>
        /// Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
        /// </summary>
        public InputList<string> Dictionaries
        {
            get => _dictionaries ?? (_dictionaries = new InputList<string>());
            set => _dictionaries = value;
        }

        /// <summary>
        /// Indicates whether the password dictionary check is enabled for this connection.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        public ConnectionOptionsPasswordDictionaryArgs()
        {
        }
        public static new ConnectionOptionsPasswordDictionaryArgs Empty => new ConnectionOptionsPasswordDictionaryArgs();
    }
}
