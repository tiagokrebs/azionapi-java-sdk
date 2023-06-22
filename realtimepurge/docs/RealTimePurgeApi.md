# RealTimePurgeApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**purgeCacheKey**](RealTimePurgeApi.md#purgeCacheKey) | **POST** /purge/cachekey | /purge/cachekey |
| [**purgeUrl**](RealTimePurgeApi.md#purgeUrl) | **POST** /purge/url | /purge/url |
| [**purgeWildcard**](RealTimePurgeApi.md#purgeWildcard) | **POST** /purge/wildcard | /purge/wildcard |


<a id="purgeCacheKey"></a>
# **purgeCacheKey**
> purgeCacheKey(accept, contentType, purgeCacheKeyRequest)

/purge/cachekey

List of Cache Keys you want to remove from the Azion Edge Servers cache. urls (array): list of up to 50 Cache Keys to be expired from the cache, per request. method (choice): purge method, use the “delete” value for removal. Layer (choice): layer where the purge will be done. Use the value “edge_caching” (default value if not informed) to purge on the Edge Caching layer and the value “l2_caching” to purge on L2 Caching.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealTimePurgeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RealTimePurgeApi apiInstance = new RealTimePurgeApi(defaultClient);
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | 
    PurgeCacheKeyRequest purgeCacheKeyRequest = new PurgeCacheKeyRequest(); // PurgeCacheKeyRequest | 
    try {
      apiInstance.purgeCacheKey(accept, contentType, purgeCacheKeyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimePurgeApi#purgeCacheKey");
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
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **purgeCacheKeyRequest** | [**PurgeCacheKeyRequest**](PurgeCacheKeyRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |
| **207** | Multi Status |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="purgeUrl"></a>
# **purgeUrl**
> purgeUrl(accept, contentType, purgeUrlRequest)

/purge/url

List of URLs you want to remove from the Azion Edge Servers cache. urls (array): list of up to 50 URLs to be expired from the cache, per request. method (choice): purge method, use the “delete” value for removal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealTimePurgeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RealTimePurgeApi apiInstance = new RealTimePurgeApi(defaultClient);
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | 
    PurgeUrlRequest purgeUrlRequest = new PurgeUrlRequest(); // PurgeUrlRequest | 
    try {
      apiInstance.purgeUrl(accept, contentType, purgeUrlRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimePurgeApi#purgeUrl");
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
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **purgeUrlRequest** | [**PurgeUrlRequest**](PurgeUrlRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |
| **207** | Multi Status |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="purgeWildcard"></a>
# **purgeWildcard**
> purgeWildcard(accept, contentType, purgeWildcardRequest)

/purge/wildcard

The Wildcard expression that represents the list of objects that you want to remove from the Azion Edge Servers cache. urls (array):the Wildcard URL or Wildcard Cache Key that represents the list of objects you want to expire. You can only use one Wildcard expression per request. method (choice): purge method, use the “delete” value for removal.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RealTimePurgeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RealTimePurgeApi apiInstance = new RealTimePurgeApi(defaultClient);
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | 
    PurgeWildcardRequest purgeWildcardRequest = new PurgeWildcardRequest(); // PurgeWildcardRequest | 
    try {
      apiInstance.purgeWildcard(accept, contentType, purgeWildcardRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealTimePurgeApi#purgeWildcard");
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
| **accept** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **purgeWildcardRequest** | [**PurgeWildcardRequest**](PurgeWildcardRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |
| **207** | Multi Status |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

