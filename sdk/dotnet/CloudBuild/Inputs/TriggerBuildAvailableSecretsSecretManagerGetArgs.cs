// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Inputs
{

    public sealed class TriggerBuildAvailableSecretsSecretManagerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list of global environment variable definitions that will exist for all build steps
        /// in this build. If a variable is defined in both globally and in a build step,
        /// the variable will use the build step value.
        /// The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
        /// </summary>
        [Input("env", required: true)]
        public Input<string> Env { get; set; } = null!;

        /// <summary>
        /// Resource name of the SecretVersion. In format: projects/*/secrets/*/versions/*
        /// </summary>
        [Input("versionName", required: true)]
        public Input<string> VersionName { get; set; } = null!;

        public TriggerBuildAvailableSecretsSecretManagerGetArgs()
        {
        }
    }
}
