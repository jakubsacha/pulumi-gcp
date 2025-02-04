// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns
{
    public static class GetRecordSet
    {
        /// <summary>
        /// Get a DNS record set within Google Cloud DNS
        /// For more information see
        /// [the official documentation](https://cloud.google.com/dns/docs/records)
        /// and
        /// [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sample = Output.Create(Gcp.Dns.GetManagedZone.InvokeAsync(new Gcp.Dns.GetManagedZoneArgs
        ///         {
        ///             Name = "sample-zone",
        ///         }));
        ///         var rs = Output.Tuple(sample, sample).Apply(values =&gt;
        ///         {
        ///             var sample = values.Item1;
        ///             var sample1 = values.Item2;
        ///             return Output.Create(Gcp.Dns.GetRecordSet.InvokeAsync(new Gcp.Dns.GetRecordSetArgs
        ///             {
        ///                 ManagedZone = sample.Name,
        ///                 Name = $"my-record.{sample1.DnsName}",
        ///                 Type = "A",
        ///             }));
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRecordSetResult> InvokeAsync(GetRecordSetArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRecordSetResult>("gcp:dns/getRecordSet:getRecordSet", args ?? new GetRecordSetArgs(), options.WithDefaults());

        /// <summary>
        /// Get a DNS record set within Google Cloud DNS
        /// For more information see
        /// [the official documentation](https://cloud.google.com/dns/docs/records)
        /// and
        /// [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sample = Output.Create(Gcp.Dns.GetManagedZone.InvokeAsync(new Gcp.Dns.GetManagedZoneArgs
        ///         {
        ///             Name = "sample-zone",
        ///         }));
        ///         var rs = Output.Tuple(sample, sample).Apply(values =&gt;
        ///         {
        ///             var sample = values.Item1;
        ///             var sample1 = values.Item2;
        ///             return Output.Create(Gcp.Dns.GetRecordSet.InvokeAsync(new Gcp.Dns.GetRecordSetArgs
        ///             {
        ///                 ManagedZone = sample.Name,
        ///                 Name = $"my-record.{sample1.DnsName}",
        ///                 Type = "A",
        ///             }));
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRecordSetResult> Invoke(GetRecordSetInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRecordSetResult>("gcp:dns/getRecordSet:getRecordSet", args ?? new GetRecordSetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRecordSetArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Name of the zone.
        /// </summary>
        [Input("managedZone", required: true)]
        public string ManagedZone { get; set; } = null!;

        /// <summary>
        /// The DNS name for the resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project for the Google Cloud.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetRecordSetArgs()
        {
        }
    }

    public sealed class GetRecordSetInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Name of the zone.
        /// </summary>
        [Input("managedZone", required: true)]
        public Input<string> ManagedZone { get; set; } = null!;

        /// <summary>
        /// The DNS name for the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project for the Google Cloud.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetRecordSetInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRecordSetResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ManagedZone;
        public readonly string Name;
        public readonly string? Project;
        /// <summary>
        /// The string data for the records in this record set.
        /// </summary>
        public readonly ImmutableArray<string> Rrdatas;
        /// <summary>
        /// The time-to-live of this record set (seconds).
        /// </summary>
        public readonly int Ttl;
        public readonly string Type;

        [OutputConstructor]
        private GetRecordSetResult(
            string id,

            string managedZone,

            string name,

            string? project,

            ImmutableArray<string> rrdatas,

            int ttl,

            string type)
        {
            Id = id;
            ManagedZone = managedZone;
            Name = name;
            Project = project;
            Rrdatas = rrdatas;
            Ttl = ttl;
            Type = type;
        }
    }
}
