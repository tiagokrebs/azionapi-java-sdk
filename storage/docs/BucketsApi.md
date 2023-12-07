# BucketsApi

All URIs are relative to *https://api.azion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1StorageBucketsCreate**](BucketsApi.md#apiV1StorageBucketsCreate) | **POST** /v4/storage/buckets | /v4/storage/buckets |
| [**apiV1StorageBucketsDestroy**](BucketsApi.md#apiV1StorageBucketsDestroy) | **DELETE** /v4/storage/buckets/{name} | /v4/storage/buckets/:name |
| [**apiV1StorageBucketsList**](BucketsApi.md#apiV1StorageBucketsList) | **GET** /v4/storage/buckets | /v4/storage/buckets |
| [**apiV1StorageBucketsPartialUpdate**](BucketsApi.md#apiV1StorageBucketsPartialUpdate) | **PATCH** /v4/storage/buckets/{name} | /v4/storage/buckets/:name |


<a id="apiV1StorageBucketsCreate"></a>
# **apiV1StorageBucketsCreate**
> ResponseBucket apiV1StorageBucketsCreate(bucketCreate)

/v4/storage/buckets



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BucketsApi apiInstance = new BucketsApi(defaultClient);
    BucketCreate bucketCreate = new BucketCreate(); // BucketCreate | 
    try {
      ResponseBucket result = apiInstance.apiV1StorageBucketsCreate(bucketCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BucketsApi#apiV1StorageBucketsCreate");
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
| **bucketCreate** | [**BucketCreate**](BucketCreate.md)|  | |

### Return type

[**ResponseBucket**](ResponseBucket.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **202** |  |  -  |

<a id="apiV1StorageBucketsDestroy"></a>
# **apiV1StorageBucketsDestroy**
> ResponseDeleteBucket apiV1StorageBucketsDestroy(name)

/v4/storage/buckets/:name



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BucketsApi apiInstance = new BucketsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      ResponseDeleteBucket result = apiInstance.apiV1StorageBucketsDestroy(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BucketsApi#apiV1StorageBucketsDestroy");
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
| **name** | **String**|  | |

### Return type

[**ResponseDeleteBucket**](ResponseDeleteBucket.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **202** |  |  -  |

<a id="apiV1StorageBucketsList"></a>
# **apiV1StorageBucketsList**
> PaginatedBucketList apiV1StorageBucketsList(page, pageSize)

/v4/storage/buckets



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BucketsApi apiInstance = new BucketsApi(defaultClient);
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    try {
      PaginatedBucketList result = apiInstance.apiV1StorageBucketsList(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BucketsApi#apiV1StorageBucketsList");
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
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**PaginatedBucketList**](PaginatedBucketList.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="apiV1StorageBucketsPartialUpdate"></a>
# **apiV1StorageBucketsPartialUpdate**
> ResponseBucket apiV1StorageBucketsPartialUpdate(name, patchedBucket)

/v4/storage/buckets/:name



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BucketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    BucketsApi apiInstance = new BucketsApi(defaultClient);
    String name = "name_example"; // String | 
    PatchedBucket patchedBucket = new PatchedBucket(); // PatchedBucket | 
    try {
      ResponseBucket result = apiInstance.apiV1StorageBucketsPartialUpdate(name, patchedBucket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BucketsApi#apiV1StorageBucketsPartialUpdate");
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
| **name** | **String**|  | |
| **patchedBucket** | [**PatchedBucket**](PatchedBucket.md)|  | [optional] |

### Return type

[**ResponseBucket**](ResponseBucket.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **202** |  |  -  |

