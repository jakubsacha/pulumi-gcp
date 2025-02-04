// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./getKeys";
export * from "./getManagedZone";
export * from "./getRecordSet";
export * from "./managedZone";
export * from "./policy";
export * from "./recordSet";
export * from "./responsePolicy";
export * from "./responsePolicyRule";

// Import resources to register:
import { ManagedZone } from "./managedZone";
import { Policy } from "./policy";
import { RecordSet } from "./recordSet";
import { ResponsePolicy } from "./responsePolicy";
import { ResponsePolicyRule } from "./responsePolicyRule";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "gcp:dns/managedZone:ManagedZone":
                return new ManagedZone(name, <any>undefined, { urn })
            case "gcp:dns/policy:Policy":
                return new Policy(name, <any>undefined, { urn })
            case "gcp:dns/recordSet:RecordSet":
                return new RecordSet(name, <any>undefined, { urn })
            case "gcp:dns/responsePolicy:ResponsePolicy":
                return new ResponsePolicy(name, <any>undefined, { urn })
            case "gcp:dns/responsePolicyRule:ResponsePolicyRule":
                return new ResponsePolicyRule(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("gcp", "dns/managedZone", _module)
pulumi.runtime.registerResourceModule("gcp", "dns/policy", _module)
pulumi.runtime.registerResourceModule("gcp", "dns/recordSet", _module)
pulumi.runtime.registerResourceModule("gcp", "dns/responsePolicy", _module)
pulumi.runtime.registerResourceModule("gcp", "dns/responsePolicyRule", _module)
