# EdgeFunctionsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeFunctionsGet**](EdgeFunctionsApi.md#edgeFunctionsGet) | **GET** /edge_functions | edge_functions |
| [**edgeFunctionsIdDelete**](EdgeFunctionsApi.md#edgeFunctionsIdDelete) | **DELETE** /edge_functions/{id} | edge_functions |
| [**edgeFunctionsIdGet**](EdgeFunctionsApi.md#edgeFunctionsIdGet) | **GET** /edge_functions/{id} | edge_functions |
| [**edgeFunctionsIdPatch**](EdgeFunctionsApi.md#edgeFunctionsIdPatch) | **PATCH** /edge_functions/{id} | edge_functions |
| [**edgeFunctionsIdPut**](EdgeFunctionsApi.md#edgeFunctionsIdPut) | **PUT** /edge_functions/{id} | edge_functions |
| [**edgeFunctionsPost**](EdgeFunctionsApi.md#edgeFunctionsPost) | **POST** /edge_functions | edge_functions |


<a id="edgeFunctionsGet"></a>
# **edgeFunctionsGet**
> ListEdgeFunctionResponse edgeFunctionsGet(page, pageSize, sort, orderBy)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String sort = "sort_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    try {
      ListEdgeFunctionResponse result = apiInstance.edgeFunctionsGet(page, pageSize, sort, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsGet");
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
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |

### Return type

[**ListEdgeFunctionResponse**](ListEdgeFunctionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

<a id="edgeFunctionsIdDelete"></a>
# **edgeFunctionsIdDelete**
> edgeFunctionsIdDelete(id)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.edgeFunctionsIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsIdDelete");
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
| **id** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **0** | Unexpected error |  -  |

<a id="edgeFunctionsIdGet"></a>
# **edgeFunctionsIdGet**
> EdgeFunctionResponse edgeFunctionsIdGet(id)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      EdgeFunctionResponse result = apiInstance.edgeFunctionsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsIdGet");
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
| **id** | **Long**|  | |

### Return type

[**EdgeFunctionResponse**](EdgeFunctionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

<a id="edgeFunctionsIdPatch"></a>
# **edgeFunctionsIdPatch**
> EdgeFunctionResponse edgeFunctionsIdPatch(id, patchEdgeFunctionRequest)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    Long id = 56L; // Long | 
    PatchEdgeFunctionRequest patchEdgeFunctionRequest = new PatchEdgeFunctionRequest(); // PatchEdgeFunctionRequest | 
    try {
      EdgeFunctionResponse result = apiInstance.edgeFunctionsIdPatch(id, patchEdgeFunctionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsIdPatch");
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
| **id** | **Long**|  | |
| **patchEdgeFunctionRequest** | [**PatchEdgeFunctionRequest**](PatchEdgeFunctionRequest.md)|  | |

### Return type

[**EdgeFunctionResponse**](EdgeFunctionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request |  -  |
| **0** | Unexpected error |  -  |

<a id="edgeFunctionsIdPut"></a>
# **edgeFunctionsIdPut**
> EdgeFunctionResponse edgeFunctionsIdPut(id, putEdgeFunctionRequest)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    Long id = 56L; // Long | 
    PutEdgeFunctionRequest putEdgeFunctionRequest = new PutEdgeFunctionRequest(); // PutEdgeFunctionRequest | 
    try {
      EdgeFunctionResponse result = apiInstance.edgeFunctionsIdPut(id, putEdgeFunctionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsIdPut");
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
| **id** | **Long**|  | |
| **putEdgeFunctionRequest** | [**PutEdgeFunctionRequest**](PutEdgeFunctionRequest.md)|  | |

### Return type

[**EdgeFunctionResponse**](EdgeFunctionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request |  -  |
| **0** | Unexpected error |  -  |

<a id="edgeFunctionsPost"></a>
# **edgeFunctionsPost**
> EdgeFunctionResponse edgeFunctionsPost(createEdgeFunctionRequest)

edge_functions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
    CreateEdgeFunctionRequest createEdgeFunctionRequest = new CreateEdgeFunctionRequest(); // CreateEdgeFunctionRequest | 
    try {
      EdgeFunctionResponse result = apiInstance.edgeFunctionsPost(createEdgeFunctionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeFunctionsApi#edgeFunctionsPost");
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
| **createEdgeFunctionRequest** | [**CreateEdgeFunctionRequest**](CreateEdgeFunctionRequest.md)|  | |

### Return type

[**EdgeFunctionResponse**](EdgeFunctionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Invalid request |  -  |
| **0** | Unexpected error |  -  |

