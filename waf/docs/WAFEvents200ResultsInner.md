

# WAFEvents200ResultsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCount** | **Long** |  |  [optional] |
|**top10Countries** | [**List&lt;WAFEvents200ResultsInnerTop10CountriesInner&gt;**](WAFEvents200ResultsInnerTop10CountriesInner.md) |  |  [optional] |
|**top10Ips** | [**List&lt;WAFEvents200ResultsInnerTop10CountriesInner&gt;**](WAFEvents200ResultsInnerTop10CountriesInner.md) |  |  [optional] |
|**hitCount** | **Long** |  |  [optional] |
|**ruleId** | **Long** |  |  [optional] |
|**ipCount** | **Long** |  |  [optional] |
|**matchZone** | [**MatchZoneEnum**](#MatchZoneEnum) |  |  [optional] |
|**pathCount** | **Long** |  |  [optional] |
|**matchesOn** | [**MatchesOnEnum**](#MatchesOnEnum) |  |  [optional] |
|**ruleDescription** | **String** |  |  [optional] |



## Enum: MatchZoneEnum

| Name | Value |
|---- | -----|
| PATH | &quot;path&quot; |
| QUERY_STRING | &quot;query_string&quot; |
| REQUEST_HEADER | &quot;request_header&quot; |
| REQUEST_BODY | &quot;request_body&quot; |
| RAW_BODY | &quot;raw_body&quot; |
| FILE_NAME | &quot;file_name&quot; |
| COOKIE | &quot;cookie&quot; |



## Enum: MatchesOnEnum

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| VALUE | &quot;value&quot; |



