# DefaultApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**networkListsGet**](DefaultApi.md#networkListsGet) | **GET** /network_lists | List all user Network Lists |
| [**networkListsPost**](DefaultApi.md#networkListsPost) | **POST** /network_lists | Create a Network Lists |
| [**networkListsUuidGet**](DefaultApi.md#networkListsUuidGet) | **GET** /network_lists/{uuid} | Retrieve a Network Lists set by uuid |
| [**networkListsUuidPut**](DefaultApi.md#networkListsUuidPut) | **PUT** /network_lists/{uuid} | Overwrite some Network Lists attributes |


<a id="networkListsGet"></a>
# **networkListsGet**
> ListNetworkListsResponse networkListsGet(page)

List all user Network Lists

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
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      ListNetworkListsResponse result = apiInstance.networkListsGet(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#networkListsGet");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**ListNetworkListsResponse**](ListNetworkListsResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Network Lists |  -  |
| **404** | Not Found |  -  |

<a id="networkListsPost"></a>
# **networkListsPost**
> networkListsPost(createNetworkListsRequest)

Create a Network Lists

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
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CreateNetworkListsRequest createNetworkListsRequest = new CreateNetworkListsRequest(); // CreateNetworkListsRequest | 
    try {
      apiInstance.networkListsPost(createNetworkListsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#networkListsPost");
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
| **createNetworkListsRequest** | [**CreateNetworkListsRequest**](CreateNetworkListsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Network Lists created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="networkListsUuidGet"></a>
# **networkListsUuidGet**
> NetworkListsResponse networkListsUuidGet(uuid)

Retrieve a Network Lists set by uuid

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
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      NetworkListsResponse result = apiInstance.networkListsUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#networkListsUuidGet");
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
| **uuid** | **String**|  | |

### Return type

[**NetworkListsResponse**](NetworkListsResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Network Lists object |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="networkListsUuidPut"></a>
# **networkListsUuidPut**
> ListNetworkListsResponse networkListsUuidPut(uuid, updateNetworkListsRequest)

Overwrite some Network Lists attributes

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
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    UpdateNetworkListsRequest updateNetworkListsRequest = new UpdateNetworkListsRequest(); // UpdateNetworkListsRequest | 
    try {
      ListNetworkListsResponse result = apiInstance.networkListsUuidPut(uuid, updateNetworkListsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#networkListsUuidPut");
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
| **uuid** | **String**|  | |
| **updateNetworkListsRequest** | [**UpdateNetworkListsRequest**](UpdateNetworkListsRequest.md)|  | |

### Return type

[**ListNetworkListsResponse**](ListNetworkListsResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

