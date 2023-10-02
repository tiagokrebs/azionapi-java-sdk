

# SingleWAF


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**name** | **String** | Identification name for WAF Rule Set. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**sqlInjection** | **Boolean** |  |  [optional] |
|**sqlInjectionSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**remoteFileInclusion** | **Boolean** |  |  [optional] |
|**remoteFileInclusionSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**directoryTraversal** | **Boolean** |  |  [optional] |
|**directoryTraversalSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**crossSiteScripting** | **Boolean** |  |  [optional] |
|**crossSiteScriptingSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**evadingTricks** | **Boolean** |  |  [optional] |
|**evadingTricksSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**fileUpload** | **Boolean** |  |  [optional] |
|**fileUploadSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**unwantedAccess** | **Boolean** |  |  [optional] |
|**unwantedAccessSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**identifiedAttack** | **Boolean** |  |  [optional] |
|**identifiedAttackSensitivity** | **WAFSensitivityChoices** |  |  [optional] |
|**bypassAddresses** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| BLOCKING | &quot;blocking&quot; |
| COUNTING | &quot;counting&quot; |



