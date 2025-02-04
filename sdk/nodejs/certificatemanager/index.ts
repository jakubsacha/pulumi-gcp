// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./certificate";
export * from "./dnsAuthorization";

// Import resources to register:
import { Certificate } from "./certificate";
import { DnsAuthorization } from "./dnsAuthorization";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:certificatemanager/certificate:Certificate":
                return new Certificate(name, <any>undefined, { urn })
            case "gcp:certificatemanager/dnsAuthorization:DnsAuthorization":
                return new DnsAuthorization(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "certificatemanager/certificate", _module)
pulumi.runtime.registerResourceModule("gcp", "certificatemanager/dnsAuthorization", _module)
