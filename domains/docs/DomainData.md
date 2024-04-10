

# DomainData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**cnames** | **List&lt;String&gt;** |  |  [optional] |
|**cnameAccessOnly** | **Boolean** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**edgeApplicationId** | **Long** |  |  [optional] |
|**digitalCertificateId** | **Long** |  |  [optional] |
|**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  [optional] |
|**isMtlsEnabled** | **Boolean** |  |  [optional] |
|**mtlsTrustedCaCertificateId** | **Long** |  |  [optional] |
|**mtlsVerification** | [**MtlsVerificationEnum**](#MtlsVerificationEnum) |  |  [optional] |
|**crlList** | **List&lt;Long&gt;** |  |  [optional] |



## Enum: EnvironmentEnum

| Name | Value |
|---- | -----|
| PRODUCTION | &quot;production&quot; |
| PREVIEW | &quot;preview&quot; |



## Enum: MtlsVerificationEnum

| Name | Value |
|---- | -----|
| ENFORCE | &quot;enforce&quot; |
| PERMISSIVE | &quot;permissive&quot; |



