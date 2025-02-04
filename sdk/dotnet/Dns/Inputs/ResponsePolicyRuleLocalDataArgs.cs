// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class ResponsePolicyRuleLocalDataArgs : Pulumi.ResourceArgs
    {
        [Input("localDatas", required: true)]
        private InputList<Inputs.ResponsePolicyRuleLocalDataLocalDataArgs>? _localDatas;

        /// <summary>
        /// All resource record sets for this selector, one per resource record type. The name must match the dns_name.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResponsePolicyRuleLocalDataLocalDataArgs> LocalDatas
        {
            get => _localDatas ?? (_localDatas = new InputList<Inputs.ResponsePolicyRuleLocalDataLocalDataArgs>());
            set => _localDatas = value;
        }

        public ResponsePolicyRuleLocalDataArgs()
        {
        }
    }
}
