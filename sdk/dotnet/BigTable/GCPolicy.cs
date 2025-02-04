// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable
{
    /// <summary>
    /// Creates a Google Cloud Bigtable GC Policy inside a family. For more information see
    /// [the official documentation](https://cloud.google.com/bigtable/) and
    /// [API](https://cloud.google.com/bigtable/docs/go/reference).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var instance = new Gcp.BigTable.Instance("instance", new Gcp.BigTable.InstanceArgs
    ///         {
    ///             Clusters = 
    ///             {
    ///                 new Gcp.BigTable.Inputs.InstanceClusterArgs
    ///                 {
    ///                     ClusterId = "tf-instance-cluster",
    ///                     NumNodes = 3,
    ///                     StorageType = "HDD",
    ///                 },
    ///             },
    ///         });
    ///         var table = new Gcp.BigTable.Table("table", new Gcp.BigTable.TableArgs
    ///         {
    ///             InstanceName = instance.Name,
    ///             ColumnFamilies = 
    ///             {
    ///                 new Gcp.BigTable.Inputs.TableColumnFamilyArgs
    ///                 {
    ///                     Family = "name",
    ///                 },
    ///             },
    ///         });
    ///         var policy = new Gcp.BigTable.GCPolicy("policy", new Gcp.BigTable.GCPolicyArgs
    ///         {
    ///             InstanceName = instance.Name,
    ///             Table = table.Name,
    ///             ColumnFamily = "name",
    ///             MaxAge = new Gcp.BigTable.Inputs.GCPolicyMaxAgeArgs
    ///             {
    ///                 Duration = "168h",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Multiple conditions is also supported. `UNION` when any of its sub-policies apply (OR). `INTERSECTION` when all its sub-policies apply (AND)
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var policy = new Gcp.BigTable.GCPolicy("policy", new Gcp.BigTable.GCPolicyArgs
    ///         {
    ///             InstanceName = google_bigtable_instance.Instance.Name,
    ///             Table = google_bigtable_table.Table.Name,
    ///             ColumnFamily = "name",
    ///             Mode = "UNION",
    ///             MaxAge = new Gcp.BigTable.Inputs.GCPolicyMaxAgeArgs
    ///             {
    ///                 Duration = "168h",
    ///             },
    ///             MaxVersions = 
    ///             {
    ///                 new Gcp.BigTable.Inputs.GCPolicyMaxVersionArgs
    ///                 {
    ///                     Number = 10,
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// For complex, nested policies, an optional `gc_rules` field are supported. This field
    /// conflicts with `mode`, `max_age` and `max_version`. This field is a serialized JSON
    /// string. Example:
    /// ```csharp
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var instance = new Gcp.BigTable.Instance("instance", new Gcp.BigTable.InstanceArgs
    ///         {
    ///             Clusters = 
    ///             {
    ///                 new Gcp.BigTable.Inputs.InstanceClusterArgs
    ///                 {
    ///                     ClusterId = "cid",
    ///                     Zone = "us-central1-b",
    ///                 },
    ///             },
    ///             InstanceType = "DEVELOPMENT",
    ///             DeletionProtection = false,
    ///         });
    ///         var table = new Gcp.BigTable.Table("table", new Gcp.BigTable.TableArgs
    ///         {
    ///             InstanceName = instance.Id,
    ///             ColumnFamilies = 
    ///             {
    ///                 new Gcp.BigTable.Inputs.TableColumnFamilyArgs
    ///                 {
    ///                     Family = "cf1",
    ///                 },
    ///             },
    ///         });
    ///         var policy = new Gcp.BigTable.GCPolicy("policy", new Gcp.BigTable.GCPolicyArgs
    ///         {
    ///             InstanceName = instance.Id,
    ///             Table = table.Name,
    ///             ColumnFamily = "cf1",
    ///             GcRules = @"{
    ///   ""mode"": ""union"",
    ///   ""rules"": [
    ///     {
    ///       ""max_age"": ""10h""
    ///     },
    ///     {
    ///       ""mode"": ""intersection"",
    ///       ""rules"": [
    ///         {
    ///           ""max_age"": ""2h""
    ///         },
    ///         {
    ///           ""max_version"": 2
    ///         }
    ///       ]
    ///     }
    ///   ]
    /// }
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// This is equivalent to running the following `cbt` command:
    /// ```csharp
    /// using Pulumi;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource does not support import.
    /// </summary>
    [GcpResourceType("gcp:bigtable/gCPolicy:GCPolicy")]
    public partial class GCPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the column family.
        /// </summary>
        [Output("columnFamily")]
        public Output<string> ColumnFamily { get; private set; } = null!;

        /// <summary>
        /// Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
        /// </summary>
        [Output("gcRules")]
        public Output<string?> GcRules { get; private set; } = null!;

        /// <summary>
        /// The name of the Bigtable instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// GC policy that applies to all cells older than the given age.
        /// </summary>
        [Output("maxAge")]
        public Output<Outputs.GCPolicyMaxAge?> MaxAge { get; private set; } = null!;

        /// <summary>
        /// GC policy that applies to all versions of a cell except for the most recent.
        /// </summary>
        [Output("maxVersions")]
        public Output<ImmutableArray<Outputs.GCPolicyMaxVersion>> MaxVersions { get; private set; } = null!;

        /// <summary>
        /// If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
        /// </summary>
        [Output("mode")]
        public Output<string?> Mode { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The name of the table.
        /// </summary>
        [Output("table")]
        public Output<string> Table { get; private set; } = null!;


        /// <summary>
        /// Create a GCPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GCPolicy(string name, GCPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:bigtable/gCPolicy:GCPolicy", name, args ?? new GCPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GCPolicy(string name, Input<string> id, GCPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:bigtable/gCPolicy:GCPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GCPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GCPolicy Get(string name, Input<string> id, GCPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new GCPolicy(name, id, state, options);
        }
    }

    public sealed class GCPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the column family.
        /// </summary>
        [Input("columnFamily", required: true)]
        public Input<string> ColumnFamily { get; set; } = null!;

        /// <summary>
        /// Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
        /// </summary>
        [Input("gcRules")]
        public Input<string>? GcRules { get; set; }

        /// <summary>
        /// The name of the Bigtable instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// GC policy that applies to all cells older than the given age.
        /// </summary>
        [Input("maxAge")]
        public Input<Inputs.GCPolicyMaxAgeArgs>? MaxAge { get; set; }

        [Input("maxVersions")]
        private InputList<Inputs.GCPolicyMaxVersionArgs>? _maxVersions;

        /// <summary>
        /// GC policy that applies to all versions of a cell except for the most recent.
        /// </summary>
        public InputList<Inputs.GCPolicyMaxVersionArgs> MaxVersions
        {
            get => _maxVersions ?? (_maxVersions = new InputList<Inputs.GCPolicyMaxVersionArgs>());
            set => _maxVersions = value;
        }

        /// <summary>
        /// If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the table.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        public GCPolicyArgs()
        {
        }
    }

    public sealed class GCPolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the column family.
        /// </summary>
        [Input("columnFamily")]
        public Input<string>? ColumnFamily { get; set; }

        /// <summary>
        /// Serialized JSON object to represent a more complex GC policy. Conflicts with `mode`, `max_age` and `max_version`. Conflicts with `mode`, `max_age` and `max_version`.
        /// </summary>
        [Input("gcRules")]
        public Input<string>? GcRules { get; set; }

        /// <summary>
        /// The name of the Bigtable instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// GC policy that applies to all cells older than the given age.
        /// </summary>
        [Input("maxAge")]
        public Input<Inputs.GCPolicyMaxAgeGetArgs>? MaxAge { get; set; }

        [Input("maxVersions")]
        private InputList<Inputs.GCPolicyMaxVersionGetArgs>? _maxVersions;

        /// <summary>
        /// GC policy that applies to all versions of a cell except for the most recent.
        /// </summary>
        public InputList<Inputs.GCPolicyMaxVersionGetArgs> MaxVersions
        {
            get => _maxVersions ?? (_maxVersions = new InputList<Inputs.GCPolicyMaxVersionGetArgs>());
            set => _maxVersions = value;
        }

        /// <summary>
        /// If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the table.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        public GCPolicyState()
        {
        }
    }
}
