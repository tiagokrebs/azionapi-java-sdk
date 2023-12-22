# StorageApi

All URIs are relative to *https://api.azion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storageApiBucketsCreate**](StorageApi.md#storageApiBucketsCreate) | **POST** /v4/storage/buckets | Create a new bucket |
| [**storageApiBucketsDestroy**](StorageApi.md#storageApiBucketsDestroy) | **DELETE** /v4/storage/buckets/{name} | Delete a bucket |
| [**storageApiBucketsList**](StorageApi.md#storageApiBucketsList) | **GET** /v4/storage/buckets | List buckets |
| [**storageApiBucketsObjectsCreate**](StorageApi.md#storageApiBucketsObjectsCreate) | **POST** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Create new object key |
| [**storageApiBucketsObjectsDestroy**](StorageApi.md#storageApiBucketsObjectsDestroy) | **DELETE** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Delete object key |
| [**storageApiBucketsObjectsList**](StorageApi.md#storageApiBucketsObjectsList) | **GET** /v4/storage/buckets/{bucket_name}/objects | List buckets objects |
| [**storageApiBucketsObjectsRetrieve**](StorageApi.md#storageApiBucketsObjectsRetrieve) | **GET** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Download object |
| [**storageApiBucketsObjectsUpdate**](StorageApi.md#storageApiBucketsObjectsUpdate) | **PUT** /v4/storage/buckets/{bucket_name}/objects/{object_key} | Update the object key |
| [**storageApiBucketsPartialUpdate**](StorageApi.md#storageApiBucketsPartialUpdate) | **PATCH** /v4/storage/buckets/{name} | Update bucket info |


<a id="storageApiBucketsCreate"></a>
# **storageApiBucketsCreate**
> ResponseBucket storageApiBucketsCreate(bucketCreate)

Create a new bucket



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    BucketCreate bucketCreate = new BucketCreate(); // BucketCreate | 
    try {
      ResponseBucket result = apiInstance.storageApiBucketsCreate(bucketCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsCreate");
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

<a id="storageApiBucketsDestroy"></a>
# **storageApiBucketsDestroy**
> SuccessBucketOperation storageApiBucketsDestroy(name)

Delete a bucket



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SuccessBucketOperation result = apiInstance.storageApiBucketsDestroy(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsDestroy");
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

[**SuccessBucketOperation**](SuccessBucketOperation.md)

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

<a id="storageApiBucketsList"></a>
# **storageApiBucketsList**
> PaginatedBucketList storageApiBucketsList(page, pageSize)

List buckets



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    try {
      PaginatedBucketList result = apiInstance.storageApiBucketsList(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsList");
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

<a id="storageApiBucketsObjectsCreate"></a>
# **storageApiBucketsObjectsCreate**
> SuccessObjectOperation storageApiBucketsObjectsCreate(bucketName, objectKey, contentType, body)

Create new object key

Create a new object key in the bucket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String objectKey = "objectKey_example"; // String | 
    String contentType = "contentType_example"; // String | The content type of the file (Example: text/plain).
    File body = new File("/path/to/file"); // File | 
    try {
      SuccessObjectOperation result = apiInstance.storageApiBucketsObjectsCreate(bucketName, objectKey, contentType, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsObjectsCreate");
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
| **bucketName** | **String**|  | |
| **objectKey** | **String**|  | |
| **contentType** | **String**| The content type of the file (Example: text/plain). | [optional] |
| **body** | **File**|  | [optional] |

### Return type

[**SuccessObjectOperation**](SuccessObjectOperation.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="storageApiBucketsObjectsDestroy"></a>
# **storageApiBucketsObjectsDestroy**
> SuccessObjectOperation storageApiBucketsObjectsDestroy(bucketName, objectKey)

Delete object key

Delete an object key from bucket

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String objectKey = "objectKey_example"; // String | 
    try {
      SuccessObjectOperation result = apiInstance.storageApiBucketsObjectsDestroy(bucketName, objectKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsObjectsDestroy");
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
| **bucketName** | **String**|  | |
| **objectKey** | **String**|  | |

### Return type

[**SuccessObjectOperation**](SuccessObjectOperation.md)

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

<a id="storageApiBucketsObjectsList"></a>
# **storageApiBucketsObjectsList**
> PaginatedBucketObjectList storageApiBucketsObjectsList(bucketName, page, pageSize)

List buckets objects



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    try {
      PaginatedBucketObjectList result = apiInstance.storageApiBucketsObjectsList(bucketName, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsObjectsList");
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
| **bucketName** | **String**|  | |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |

### Return type

[**PaginatedBucketObjectList**](PaginatedBucketObjectList.md)

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

<a id="storageApiBucketsObjectsRetrieve"></a>
# **storageApiBucketsObjectsRetrieve**
> File storageApiBucketsObjectsRetrieve(bucketName, objectKey)

Download object

Download the object key from bucket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String objectKey = "objectKey_example"; // String | 
    try {
      File result = apiInstance.storageApiBucketsObjectsRetrieve(bucketName, objectKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsObjectsRetrieve");
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
| **bucketName** | **String**|  | |
| **objectKey** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

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

<a id="storageApiBucketsObjectsUpdate"></a>
# **storageApiBucketsObjectsUpdate**
> SuccessObjectOperation storageApiBucketsObjectsUpdate(bucketName, objectKey, contentType, body)

Update the object key

Update the object key from bucket.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String objectKey = "objectKey_example"; // String | 
    String contentType = "contentType_example"; // String | The content type of the file (Example: text/plain).
    File body = new File("/path/to/file"); // File | 
    try {
      SuccessObjectOperation result = apiInstance.storageApiBucketsObjectsUpdate(bucketName, objectKey, contentType, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsObjectsUpdate");
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
| **bucketName** | **String**|  | |
| **objectKey** | **String**|  | |
| **contentType** | **String**| The content type of the file (Example: text/plain). | [optional] |
| **body** | **File**|  | [optional] |

### Return type

[**SuccessObjectOperation**](SuccessObjectOperation.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
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

<a id="storageApiBucketsPartialUpdate"></a>
# **storageApiBucketsPartialUpdate**
> ResponseBucket storageApiBucketsPartialUpdate(name)

Update bucket info



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      ResponseBucket result = apiInstance.storageApiBucketsPartialUpdate(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#storageApiBucketsPartialUpdate");
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

[**ResponseBucket**](ResponseBucket.md)

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

