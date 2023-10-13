

# SetRateLimitDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**limitBy** | [**LimitByEnum**](#LimitByEnum) |  |  [optional] |
|**averageRateLimit** | **Integer** |  |  [optional] |
|**maximumBurstSize** | **Integer** |  |  [optional] |



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



