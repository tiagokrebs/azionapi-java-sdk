# WafApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWAFDomains**](WafApi.md#getWAFDomains) | **GET** /waf/{wafId}/domains | Find domains attached to a WAF |
| [**getWAFEvents**](WafApi.md#getWAFEvents) | **GET** /waf/{wafId}/waf_events | Find WAF log events |


<a id="getWAFDomains"></a>
# **getWAFDomains**
> WAFDomains200 getWAFDomains(wafId, name)

Find domains attached to a WAF

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long wafId = 56L; // Long | ID of WAF to return
    String name = "name_example"; // String | searches WAF for name
    try {
      WAFDomains200 result = apiInstance.getWAFDomains(wafId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#getWAFDomains");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wafId** | **Long**| ID of WAF to return | |
| **name** | **String**| searches WAF for name | [optional] |

### Return type

[**WAFDomains200**](WAFDomains200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **404** | data not found |  -  |

<a id="getWAFEvents"></a>
# **getWAFEvents**
> WAFEvents200 getWAFEvents(wafId, hourRange, domainsIds, networkListId)

Find WAF log events

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long wafId = 56L; // Long | ID of WAF to return
    Long hourRange = 56L; // Long | Last log hours since now (it must be a integer number ranging between 1 and 72)
    String domainsIds = "domainsIds_example"; // String | Multiple domain's id (they must be separated by comma like 1233,1234)
    Long networkListId = 56L; // Long | Id of a network list
    try {
      WAFEvents200 result = apiInstance.getWAFEvents(wafId, hourRange, domainsIds, networkListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#getWAFEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **wafId** | **Long**| ID of WAF to return | |
| **hourRange** | **Long**| Last log hours since now (it must be a integer number ranging between 1 and 72) | |
| **domainsIds** | **String**| Multiple domain&#39;s id (they must be separated by comma like 1233,1234) | |
| **networkListId** | **Long**| Id of a network list | [optional] |

### Return type

[**WAFEvents200**](WAFEvents200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | unauthorized operation |  -  |
| **404** | data not found |  -  |
| **500** | Internal server error |  -  |

