

# PostDataStreamingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**templateId** | [**TemplateIdEnum**](#TemplateIdEnum) | Options:  * &#x60;2&#x60; - Edge Applications Event Collector  * &#x60;4&#x60; - WAF Event Collector  * &#x60;86&#x60; - Edge Functions Event Collector  * &#x60;184&#x60; - Edge Applications + WAF Event Collector  * &#x60;251&#x60; - Activity History Collector  |  [optional] |
|**dataSource** | [**DataSourceEnum**](#DataSourceEnum) | Options:  * &#x60;http&#x60; - Edge Applications  * &#x60;waf&#x60; - WAF Events  * &#x60;cells_console&#x60; - Edge Functions  * &#x60;rtm_activity&#x60; - Activity History  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**endpoint** | [**List&lt;PostDataStreamingResponseEndpointInner&gt;**](PostDataStreamingResponseEndpointInner.md) |  |  [optional] |
|**allDomains** | **Boolean** | Note:  * Field not used with the rtm_activity data source.  |  [optional] |



## Enum: TemplateIdEnum

| Name | Value |
|---- | -----|
| NUMBER_2 | 2 |
| NUMBER_4 | 4 |
| NUMBER_86 | 86 |
| NUMBER_184 | 184 |
| NUMBER_251 | 251 |



## Enum: DataSourceEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;http&quot; |
| WAF | &quot;waf&quot; |
| CELLS_CONSOLE | &quot;cells_console&quot; |
| RTM_ACTIVITY | &quot;rtm_activity&quot; |



