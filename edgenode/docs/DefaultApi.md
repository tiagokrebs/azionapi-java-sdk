# DefaultApi

All URIs are relative to *http://localhost:3001*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeEdgeNode**](DefaultApi.md#authorizeEdgeNode) | **PATCH** /edge_nodes/authorize | Authorize edge-node |
| [**createEdgeNodeSvcs**](DefaultApi.md#createEdgeNodeSvcs) | **POST** /edge_nodes/{edgenodeId}/services | Create an edge-node Service association |
| [**delEdgeNode**](DefaultApi.md#delEdgeNode) | **DELETE** /edge_nodes/{edgenodeId} | Delete edge-node by ID |
| [**delEdgeNodeSvc**](DefaultApi.md#delEdgeNodeSvc) | **DELETE** /edge_nodes/{edgenodeId}/services/{bindId} | Delete an edge-node Service association |
| [**getEdgeNode**](DefaultApi.md#getEdgeNode) | **GET** /edge_nodes/{edgenodeId} | Return edge-node by ID |
| [**getEdgeNodeGroups**](DefaultApi.md#getEdgeNodeGroups) | **GET** /edge_nodes/groups | Return edge-node groups |
| [**getEdgeNodeSvcDetail**](DefaultApi.md#getEdgeNodeSvcDetail) | **GET** /edge_nodes/{edgenodeId}/services/{bindId} | Return edge-node Service association by ID |
| [**getEdgeNodeSvcs**](DefaultApi.md#getEdgeNodeSvcs) | **GET** /edge_nodes/{edgenodeId}/services | Return edge-node Services association |
| [**getEdgeNodes**](DefaultApi.md#getEdgeNodes) | **GET** /edge_nodes | Return edge-nodes |
| [**updateEdgeNode**](DefaultApi.md#updateEdgeNode) | **PATCH** /edge_nodes/{edgenodeId} | Update edge-node |
| [**updateEdgeNodeSvcDetail**](DefaultApi.md#updateEdgeNodeSvcDetail) | **PATCH** /edge_nodes/{edgenodeId}/services/{bindId} | Update edge-node Service association by ID |


<a id="authorizeEdgeNode"></a>
# **authorizeEdgeNode**
> AuthorizeEdgeNodesResponse authorizeEdgeNode(authorizeEdgeNodesRequest)

Authorize edge-node

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AuthorizeEdgeNodesRequest authorizeEdgeNodesRequest = new AuthorizeEdgeNodesRequest(); // AuthorizeEdgeNodesRequest | 
    try {
      AuthorizeEdgeNodesResponse result = apiInstance.authorizeEdgeNode(authorizeEdgeNodesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#authorizeEdgeNode");
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
| **authorizeEdgeNodesRequest** | [**AuthorizeEdgeNodesRequest**](AuthorizeEdgeNodesRequest.md)|  | |

### Return type

[**AuthorizeEdgeNodesResponse**](AuthorizeEdgeNodesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="createEdgeNodeSvcs"></a>
# **createEdgeNodeSvcs**
> ServiceBindDetailResponse createEdgeNodeSvcs(edgenodeId, serviceBindRequest)

Create an edge-node Service association

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    ServiceBindRequest serviceBindRequest = new ServiceBindRequest(); // ServiceBindRequest | 
    try {
      ServiceBindDetailResponse result = apiInstance.createEdgeNodeSvcs(edgenodeId, serviceBindRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createEdgeNodeSvcs");
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
| **edgenodeId** | **Long**|  | |
| **serviceBindRequest** | [**ServiceBindRequest**](ServiceBindRequest.md)|  | |

### Return type

[**ServiceBindDetailResponse**](ServiceBindDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="delEdgeNode"></a>
# **delEdgeNode**
> delEdgeNode(edgenodeId)

Delete edge-node by ID

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    try {
      apiInstance.delEdgeNode(edgenodeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#delEdgeNode");
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
| **edgenodeId** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="delEdgeNodeSvc"></a>
# **delEdgeNodeSvc**
> delEdgeNodeSvc(edgenodeId, bindId)

Delete an edge-node Service association

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    Long bindId = 56L; // Long | 
    try {
      apiInstance.delEdgeNodeSvc(edgenodeId, bindId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#delEdgeNodeSvc");
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
| **edgenodeId** | **Long**|  | |
| **bindId** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEdgeNode"></a>
# **getEdgeNode**
> EdgeNodeDetailResponse getEdgeNode(edgenodeId)

Return edge-node by ID

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    try {
      EdgeNodeDetailResponse result = apiInstance.getEdgeNode(edgenodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getEdgeNode");
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
| **edgenodeId** | **Long**|  | |

### Return type

[**EdgeNodeDetailResponse**](EdgeNodeDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEdgeNodeGroups"></a>
# **getEdgeNodeGroups**
> List&lt;NodeGroupResponse&gt; getEdgeNodeGroups()

Return edge-node groups

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<NodeGroupResponse> result = apiInstance.getEdgeNodeGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getEdgeNodeGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NodeGroupResponse&gt;**](NodeGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEdgeNodeSvcDetail"></a>
# **getEdgeNodeSvcDetail**
> ServiceBindDetailResponse getEdgeNodeSvcDetail(edgenodeId, bindId)

Return edge-node Service association by ID

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    Long bindId = 56L; // Long | 
    try {
      ServiceBindDetailResponse result = apiInstance.getEdgeNodeSvcDetail(edgenodeId, bindId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getEdgeNodeSvcDetail");
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
| **edgenodeId** | **Long**|  | |
| **bindId** | **Long**|  | |

### Return type

[**ServiceBindDetailResponse**](ServiceBindDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEdgeNodeSvcs"></a>
# **getEdgeNodeSvcs**
> ServiceResponseWithTotal getEdgeNodeSvcs(edgenodeId, isBound, filter, orderBy, sort, page, pageSize)

Return edge-node Services association

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    Boolean isBound = true; // Boolean | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    try {
      ServiceResponseWithTotal result = apiInstance.getEdgeNodeSvcs(edgenodeId, isBound, filter, orderBy, sort, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getEdgeNodeSvcs");
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
| **edgenodeId** | **Long**|  | |
| **isBound** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |

### Return type

[**ServiceResponseWithTotal**](ServiceResponseWithTotal.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getEdgeNodes"></a>
# **getEdgeNodes**
> EdgeNodeResponseWithTotal getEdgeNodes(filter, orderBy, sort, onlyIds, pageSize)

Return edge-nodes

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    Boolean onlyIds = true; // Boolean | 
    Long pageSize = 56L; // Long | 
    try {
      EdgeNodeResponseWithTotal result = apiInstance.getEdgeNodes(filter, orderBy, sort, onlyIds, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getEdgeNodes");
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
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **onlyIds** | **Boolean**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |

### Return type

[**EdgeNodeResponseWithTotal**](EdgeNodeResponseWithTotal.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateEdgeNode"></a>
# **updateEdgeNode**
> UpdateEdgeNodeResponse updateEdgeNode(edgenodeId)

Update edge-node

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    try {
      UpdateEdgeNodeResponse result = apiInstance.updateEdgeNode(edgenodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateEdgeNode");
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
| **edgenodeId** | **Long**|  | |

### Return type

[**UpdateEdgeNodeResponse**](UpdateEdgeNodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateEdgeNodeSvcDetail"></a>
# **updateEdgeNodeSvcDetail**
> ServiceBindDetailResponse updateEdgeNodeSvcDetail(edgenodeId, bindId, updateServiceBindRequest)

Update edge-node Service association by ID

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
    defaultClient.setBasePath("http://localhost:3001");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long edgenodeId = 56L; // Long | 
    Long bindId = 56L; // Long | 
    UpdateServiceBindRequest updateServiceBindRequest = new UpdateServiceBindRequest(); // UpdateServiceBindRequest | 
    try {
      ServiceBindDetailResponse result = apiInstance.updateEdgeNodeSvcDetail(edgenodeId, bindId, updateServiceBindRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateEdgeNodeSvcDetail");
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
| **edgenodeId** | **Long**|  | |
| **bindId** | **Long**|  | |
| **updateServiceBindRequest** | [**UpdateServiceBindRequest**](UpdateServiceBindRequest.md)|  | |

### Return type

[**ServiceBindDetailResponse**](ServiceBindDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

