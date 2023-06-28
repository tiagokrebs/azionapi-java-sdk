# DefaultApi

All URIs are relative to *https://storage-api.azion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteVersion**](DefaultApi.md#deleteVersion) | **DELETE** /storage/{version_id}/delete | /storage/:version_id/delete |
| [**storageVersionIdPost**](DefaultApi.md#storageVersionIdPost) | **POST** /storage/{version_id} | /storage/:version_id |


<a id="deleteVersion"></a>
# **deleteVersion**
> deleteVersion(versionId)

/storage/:version_id/delete

Delete a version. A version is just um path prefix/sub-namespace for a set of files.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://storage-api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String versionId = "versionId_example"; // String | The version identifier
    try {
      apiInstance.deleteVersion(versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteVersion");
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
| **versionId** | **String**| The version identifier | |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="storageVersionIdPost"></a>
# **storageVersionIdPost**
> Object storageVersionIdPost(xAzionStaticPath, versionId, contentType, body)

/storage/:version_id

Upload file and transfer to remote storage

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://storage-api.azion.com");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String xAzionStaticPath = "xAzionStaticPath_example"; // String | Required in order to get the path and file name. i.e.: assets/css/main.css
    String versionId = "versionId_example"; // String | 
    String contentType = "b2/x-auto"; // String | The content type of the file (Example: text/plain).
    File body = new File("/path/to/file"); // File | 
    try {
      Object result = apiInstance.storageVersionIdPost(xAzionStaticPath, versionId, contentType, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#storageVersionIdPost");
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
| **xAzionStaticPath** | **String**| Required in order to get the path and file name. i.e.: assets/css/main.css | |
| **versionId** | **String**|  | |
| **contentType** | **String**| The content type of the file (Example: text/plain). | [optional] [default to b2/x-auto] |
| **body** | **File**|  | [optional] |

### Return type

**Object**

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

