# DefaultApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete) | **DELETE** /edge_firewall/{edge_firewall_id}/functions_instances/{edge_function_instance_id} | Delete an Edge Functions Instance by uuid |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet) | **GET** /edge_firewall/{edge_firewall_id}/functions_instances/{edge_function_instance_id} | Retrieve an Edge Functions Instance set by uuid |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch) | **PATCH** /edge_firewall/{edge_firewall_id}/functions_instances/{edge_function_instance_id} | Update some Edge Functions Instance attributes |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut) | **PUT** /edge_firewall/{edge_firewall_id}/functions_instances/{edge_function_instance_id} | Overwrite some Edge Functions Instance attributes |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesGet) | **GET** /edge_firewall/{edge_firewall_id}/functions_instances | List all user Edge Functions Instances |
| [**edgeFirewallEdgeFirewallIdFunctionsInstancesPost**](DefaultApi.md#edgeFirewallEdgeFirewallIdFunctionsInstancesPost) | **POST** /edge_firewall/{edge_firewall_id}/functions_instances | Create an Edge Functions Instance |


<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete**
> edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete(edgeFirewallId, edgeFunctionInstanceId)

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
    Long edgeFirewallId = 56L; // Long | 
    Long edgeFunctionInstanceId = 56L; // Long | 
    try {
      apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete(edgeFirewallId, edgeFunctionInstanceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdDelete");
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
| **edgeFirewallId** | **Long**|  | |
| **edgeFunctionInstanceId** | **Long**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet**
> EdgeFunctionsInstanceResponse edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet(edgeFirewallId, edgeFunctionInstanceId)

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
    Long edgeFirewallId = 56L; // Long | 
    Long edgeFunctionInstanceId = 56L; // Long | 
    try {
      EdgeFunctionsInstanceResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet(edgeFirewallId, edgeFunctionInstanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdGet");
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
| **edgeFirewallId** | **Long**|  | |
| **edgeFunctionInstanceId** | **Long**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch**
> EdgeFunctionsInstanceResponse edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch(edgeFirewallId, edgeFunctionInstanceId, body)

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
    Long edgeFirewallId = 56L; // Long | 
    Long edgeFunctionInstanceId = 56L; // Long | 
    CreateEdgeFunctionsInstancesRequest body = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      EdgeFunctionsInstanceResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch(edgeFirewallId, edgeFunctionInstanceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPatch");
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
| **edgeFirewallId** | **Long**|  | |
| **edgeFunctionInstanceId** | **Long**|  | |
| **body** | **CreateEdgeFunctionsInstancesRequest**|  | |

### Return type

[**EdgeFunctionsInstanceResponse**](EdgeFunctionsInstanceResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut**
> EdgeFunctionsInstanceResponse edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut(edgeFirewallId, edgeFunctionInstanceId, body)

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
    Long edgeFirewallId = 56L; // Long | 
    Long edgeFunctionInstanceId = 56L; // Long | 
    CreateEdgeFunctionsInstancesRequest body = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      EdgeFunctionsInstanceResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut(edgeFirewallId, edgeFunctionInstanceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdFunctionsInstancesEdgeFunctionInstanceIdPut");
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
| **edgeFirewallId** | **Long**|  | |
| **edgeFunctionInstanceId** | **Long**|  | |
| **body** | **CreateEdgeFunctionsInstancesRequest**|  | |

### Return type

[**EdgeFunctionsInstanceResponse**](EdgeFunctionsInstanceResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesGet"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesGet**
> ListEdgeFunctionsInstancesResponse edgeFirewallEdgeFirewallIdFunctionsInstancesGet(edgeFirewallId, page, pageSize, sort, orderBy)

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
    Long edgeFirewallId = 56L; // Long | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String sort = "sort_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    try {
      ListEdgeFunctionsInstancesResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesGet(edgeFirewallId, page, pageSize, sort, orderBy);
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
| **edgeFirewallId** | **Long**|  | |
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |
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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="edgeFirewallEdgeFirewallIdFunctionsInstancesPost"></a>
# **edgeFirewallEdgeFirewallIdFunctionsInstancesPost**
> EdgeFunctionsInstanceResponse edgeFirewallEdgeFirewallIdFunctionsInstancesPost(edgeFirewallId, createEdgeFunctionsInstancesRequest)

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
    Long edgeFirewallId = 56L; // Long | 
    CreateEdgeFunctionsInstancesRequest createEdgeFunctionsInstancesRequest = new CreateEdgeFunctionsInstancesRequest(); // CreateEdgeFunctionsInstancesRequest | 
    try {
      EdgeFunctionsInstanceResponse result = apiInstance.edgeFirewallEdgeFirewallIdFunctionsInstancesPost(edgeFirewallId, createEdgeFunctionsInstancesRequest);
      System.out.println(result);
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
| **edgeFirewallId** | **Long**|  | |
| **createEdgeFunctionsInstancesRequest** | [**CreateEdgeFunctionsInstancesRequest**](CreateEdgeFunctionsInstancesRequest.md)|  | |

### Return type

[**EdgeFunctionsInstanceResponse**](EdgeFunctionsInstanceResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Edge Functions Instance created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

