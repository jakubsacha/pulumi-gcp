// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterClusterAutoscalingAutoProvisioningDefaultResult
    {
        public readonly string ImageType;
        public readonly string MinCpuPlatform;
        public readonly ImmutableArray<string> OauthScopes;
        public readonly string ServiceAccount;

        [OutputConstructor]
        private GetClusterClusterAutoscalingAutoProvisioningDefaultResult(
            string imageType,

            string minCpuPlatform,

            ImmutableArray<string> oauthScopes,

            string serviceAccount)
        {
            ImageType = imageType;
            MinCpuPlatform = minCpuPlatform;
            OauthScopes = oauthScopes;
            ServiceAccount = serviceAccount;
        }
    }
}
