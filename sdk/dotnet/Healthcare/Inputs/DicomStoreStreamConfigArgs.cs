// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare.Inputs
{

    public sealed class DicomStoreStreamConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryDestination", required: true)]
        public Input<Inputs.DicomStoreStreamConfigBigqueryDestinationArgs> BigqueryDestination { get; set; } = null!;

        public DicomStoreStreamConfigArgs()
        {
        }
    }
}
