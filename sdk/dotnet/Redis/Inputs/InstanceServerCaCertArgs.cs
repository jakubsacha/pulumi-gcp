// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Inputs
{

    public sealed class InstanceServerCaCertArgs : Pulumi.ResourceArgs
    {
        [Input("cert")]
        public Input<string>? Cert { get; set; }

        /// <summary>
        /// -
        /// Output only. The time when the policy was created.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
        /// resolution and up to nine fractional digits.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("expireTime")]
        public Input<string>? ExpireTime { get; set; }

        [Input("serialNumber")]
        public Input<string>? SerialNumber { get; set; }

        [Input("sha1Fingerprint")]
        public Input<string>? Sha1Fingerprint { get; set; }

        public InstanceServerCaCertArgs()
        {
        }
    }
}
