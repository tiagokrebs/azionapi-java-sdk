

# PostCustomDataStreamingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**dataSource** | [**DataSourceEnum**](#DataSourceEnum) | Options:  * &#x60;http&#x60; - Edge Applications  * &#x60;waf&#x60; - WAF Events  * &#x60;cells_console&#x60; - Edge Functions  * &#x60;rtm_activity&#x60; - Activity History    |  [optional] |
|**templateModel** | **String** | Note:  * Add all variables and values that will be used to stream according to the data source you choose to use.    |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**endpoint** | **String** |  |  [optional] |
|**allDomains** | **Boolean** | Note:  * Field not used with the rtm_activity data source.  |  [optional] |



## Enum: DataSourceEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |
| WAF | &quot;waf&quot; |
| CELLS_CONSOLE | &quot;cells_console&quot; |
| RTM_ACTIVITY | &quot;rtm_activity&quot; |



