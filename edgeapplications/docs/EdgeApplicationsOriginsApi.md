# EdgeApplicationsOriginsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsEdgeApplicationIdOriginsGet**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsGet) | **GET** /edge_applications/{edge_application_id}/origins | /edge_applications/{edge_application_id}/origins |
| [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete) | **DELETE** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_id} |
| [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet) | **GET** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_key} |
| [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch) | **PATCH** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/:edge_application_id:/origins/:origin_id: |
| [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut) | **PUT** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_id} |
| [**edgeApplicationsEdgeApplicationIdOriginsPost**](EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsPost) | **POST** /edge_applications/{edge_application_id}/origins | /edge_applications/{edge_application_id}/origins |


<a id="edgeApplicationsEdgeApplicationIdOriginsGet"></a>
# **edgeApplicationsEdgeApplicationIdOriginsGet**
> OriginsResponse edgeApplicationsEdgeApplicationIdOriginsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept)

/edge_applications/{edge_application_id}/origins

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      OriginsResponse result = apiInstance.edgeApplicationsEdgeApplicationIdOriginsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsGet");
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
| **edgeApplicationId** | **Long**|  | |
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |

### Return type

[**OriginsResponse**](OriginsResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete"></a>
# **edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete**
> edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete(edgeApplicationId, originKey, accept)

/edge_applications/{edge_application_id}/origins/{origin_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String originKey = "originKey_example"; // String | 
    String accept = "application/json; version=3"; // String | The id of the Origin that you plan to delete.
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete(edgeApplicationId, originKey, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete");
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
| **edgeApplicationId** | **Long**|  | |
| **originKey** | **String**|  | |
| **accept** | **String**| The id of the Origin that you plan to delete. | [optional] |

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
| **204** | No response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet"></a>
# **edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet**
> OriginsIdResponse edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet(edgeApplicationId, originKey, accept)

/edge_applications/{edge_application_id}/origins/{origin_key}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String originKey = "originKey_example"; // String | 
    String accept = "application/json; version=3"; // String | The id of the Origin that you plan to query.
    try {
      OriginsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet(edgeApplicationId, originKey, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet");
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
| **edgeApplicationId** | **Long**|  | |
| **originKey** | **String**|  | |
| **accept** | **String**| The id of the Origin that you plan to query. | [optional] |

### Return type

[**OriginsIdResponse**](OriginsIdResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch"></a>
# **edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch**
> OriginsIdResponse edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch(edgeApplicationId, originKey, accept, contentType, patchOriginsRequest)

/edge_applications/:edge_application_id:/origins/:origin_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String originKey = "originKey_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    PatchOriginsRequest patchOriginsRequest = new PatchOriginsRequest(); // PatchOriginsRequest | 
    try {
      OriginsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch(edgeApplicationId, originKey, accept, contentType, patchOriginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch");
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
| **edgeApplicationId** | **Long**|  | |
| **originKey** | **String**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **patchOriginsRequest** | [**PatchOriginsRequest**](PatchOriginsRequest.md)|  | [optional] |

### Return type

[**OriginsIdResponse**](OriginsIdResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut"></a>
# **edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut**
> OriginsIdResponse edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut(edgeApplicationId, originKey, accept, contentType, updateOriginsRequest)

/edge_applications/{edge_application_id}/origins/{origin_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String originKey = "originKey_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    UpdateOriginsRequest updateOriginsRequest = new UpdateOriginsRequest(); // UpdateOriginsRequest | 
    try {
      OriginsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut(edgeApplicationId, originKey, accept, contentType, updateOriginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut");
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
| **edgeApplicationId** | **Long**|  | |
| **originKey** | **String**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **updateOriginsRequest** | [**UpdateOriginsRequest**](UpdateOriginsRequest.md)|  | [optional] |

### Return type

[**OriginsIdResponse**](OriginsIdResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeApplicationsEdgeApplicationIdOriginsPost"></a>
# **edgeApplicationsEdgeApplicationIdOriginsPost**
> OriginsIdResponse edgeApplicationsEdgeApplicationIdOriginsPost(edgeApplicationId, accept, contentType, createOriginsRequest)

/edge_applications/{edge_application_id}/origins

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsOriginsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsOriginsApi apiInstance = new EdgeApplicationsOriginsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    CreateOriginsRequest createOriginsRequest = new CreateOriginsRequest(); // CreateOriginsRequest | 
    try {
      OriginsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdOriginsPost(edgeApplicationId, accept, contentType, createOriginsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsOriginsApi#edgeApplicationsEdgeApplicationIdOriginsPost");
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
| **edgeApplicationId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **createOriginsRequest** | [**CreateOriginsRequest**](CreateOriginsRequest.md)|  | [optional] |

### Return type

[**OriginsIdResponse**](OriginsIdResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

