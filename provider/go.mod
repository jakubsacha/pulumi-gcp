module github.com/pulumi/pulumi-gcp/provider/v6

go 1.16

require (
	github.com/hashicorp/terraform-provider-google-beta v1.20.1-0.20210315160117-642085ce9b99
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.21.1-0.20220429072011-9483b81086cd
	github.com/pulumi/pulumi/sdk/v3 v3.30.1-0.20220425233152-77eb530a1117
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/hashicorp/terraform-provider-google-beta => github.com/pulumi/terraform-provider-google-beta v0.0.0-20220428212938-6ac609e59505
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
