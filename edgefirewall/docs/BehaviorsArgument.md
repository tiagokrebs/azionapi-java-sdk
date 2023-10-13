

# BehaviorsArgument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**limitBy** | [**LimitByEnum**](#LimitByEnum) |  |  [optional] |
|**averageRateLimit** | **Integer** |  |  [optional] |
|**maximumBurstSize** | **Integer** |  |  [optional] |
|**wafId** | **Integer** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SECOND | &quot;second&quot; |
| MINUTE | &quot;minute&quot; |



## Enum: LimitByEnum

| Name | Value |
|---- | -----|
| CLIENT_IP | &quot;client_ip&quot; |
| GLOBAL | &quot;global&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| LEARNING | &quot;Learning&quot; |
| BLOCKING | &quot;Blocking&quot; |



