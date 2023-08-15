# DefaultApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesGet) | **GET** /edge_firewall/:edge_firewall_id:/functions_instances | List all user Edge Functions Instances |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesPost**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesPost) | **POST** /edge_firewall/:edge_firewall_id:/functions_instances | Create an Edge Functions Instance |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete) | **DELETE** /edge_firewall/:edge_firewall_id:/functions_instances/{uuid} | Delete an Edge Functions Instance by uuid |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet) | **GET** /edge_firewall/:edge_firewall_id:/functions_instances/{uuid} | Retrieve an Edge Functions Instance set by uuid |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch) | **PATCH** /edge_firewall/:edge_firewall_id:/functions_instances/{uuid} | Update some Edge Functions Instance attributes |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut) | **PUT** /edge_firewall/:edge_firewall_id:/functions_instances/{uuid} | Overwrite some Edge Functions Instance attributes |


<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesGet"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesGet**
> ListEdgeFunctionsInstancesResponse edgeFirewallEdgeFirewallIdFunctionsInstancesGet(page, pageSize, sort, orderBy)

List all user Edge Functions Instances

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
    Integer pageSize = 56; // Integer | 
    String sort = "sort_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    try {
      ListEdgeFunctionsInstancesResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesGet(page, pageSize, sort, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesGet");
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
| **pageSize** | **Integer**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |

### Return type

[**ListEdgeFunctionsInstancesResponse**](ListEdgeFunctionsInstancesResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Edge Functions Instances |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesPost"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesPost**
> edgeFirewallEdgeFirewallIdFunctionsInstancesPost(createEdgeFunctionsInstancesRequest)

Create an Edge Functions Instance

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
    CreateEdgeFunctionsInstancesRequest createEdgeFunctionsInstancesRequest = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesPost(createEdgeFunctionsInstancesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesPost");
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
| **createEdgeFunctionsInstancesRequest** | [**CreateEdgeFunctionsInstancesRequest**](CreateEdgeFunctionsInstancesRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Edge Functions Instance created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete**
> edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete(uuid)

Delete an Edge Functions Instance by uuid

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
      apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidDelete");
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

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet**
> EdgeFunctionsInstanceResponse edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet(uuid)

Retrieve an Edge Functions Instance set by uuid

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
      EdgeFunctionsInstanceResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidGet");
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

[**EdgeFunctionsInstanceResponse**](EdgeFunctionsInstanceResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Edge Functions Instance object |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch**
> ListEdgeFunctionsInstancesResponse edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch(uuid, body)

Update some Edge Functions Instance attributes

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
    CreateEdgeFunctionsInstancesRequest body = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      ListEdgeFunctionsInstancesResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch(uuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPatch");
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
| **body** | **CreateEdgeFunctionsInstancesRequest**|  | |

### Return type

[**ListEdgeFunctionsInstancesResponse**](ListEdgeFunctionsInstancesResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut**
> ListEdgeFunctionsInstancesResponse edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut(uuid, body)

Overwrite some Edge Functions Instance attributes

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
    CreateEdgeFunctionsInstancesRequest body = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      ListEdgeFunctionsInstancesResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut(uuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesUuidPut");
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
| **body** | **CreateEdgeFunctionsInstancesRequest**|  | |

### Return type

[**ListEdgeFunctionsInstancesResponse**](ListEdgeFunctionsInstancesResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

