

# SingleResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**subjectName** | **List&lt;String&gt;** |  |  [optional] |
|**issuer** | **String** |  |  [optional] |
|**validity** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**certificateType** | [**CertificateTypeEnum**](#CertificateTypeEnum) |  |  [optional] |
|**managed** | **Boolean** |  |  [optional] |
|**csr** | **String** |  |  [optional] |
|**certificateContent** | **String** |  |  [optional] |
|**azionInformation** | **String** |  |  [optional] |



## Enum: CertificateTypeEnum

| Name | Value |
|---- | -----|
| EDGE_CERTIFICATE | &quot;edge_certificate&quot; |
| TRUSTED_CA_CERTIFICATE | &quot;trusted_ca_certificate&quot; |



