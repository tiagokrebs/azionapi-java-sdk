

# CreateNewWAFRulesetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**name** | **String** | Identification name for WAF Rule Set. |  |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  |
|**active** | **Boolean** |  |  |
|**sqlInjection** | **Boolean** |  |  |
|**sqlInjectionSensitivity** | **WAFSensitivityChoices** |  |  |
|**remoteFileInclusion** | **Boolean** |  |  |
|**remoteFileInclusionSensitivity** | **WAFSensitivityChoices** |  |  |
|**directoryTraversal** | **Boolean** |  |  |
|**directoryTraversalSensitivity** | **WAFSensitivityChoices** |  |  |
|**crossSiteScripting** | **Boolean** |  |  |
|**crossSiteScriptingSensitivity** | **WAFSensitivityChoices** |  |  |
|**evadingTricks** | **Boolean** |  |  |
|**evadingTricksSensitivity** | **WAFSensitivityChoices** |  |  |
|**fileUpload** | **Boolean** |  |  |
|**fileUploadSensitivity** | **WAFSensitivityChoices** |  |  |
|**unwantedAccess** | **Boolean** |  |  |
|**unwantedAccessSensitivity** | **WAFSensitivityChoices** |  |  |
|**identifiedAttack** | **Boolean** |  |  |
|**identifiedAttackSensitivity** | **WAFSensitivityChoices** |  |  |
|**bypassAddresses** | **List&lt;String&gt;** |  |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| BLOCKING | &quot;blocking&quot; |
| COUNTING | &quot;counting&quot; |



