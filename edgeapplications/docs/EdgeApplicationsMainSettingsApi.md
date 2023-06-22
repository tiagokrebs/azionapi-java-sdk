# EdgeApplicationsMainSettingsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsGet**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsGet) | **GET** /edge_applications | /edge_applications |
| [**edgeApplicationsIdDelete**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdDelete) | **DELETE** /edge_applications/{id} | /edge_applications/:id |
| [**edgeApplicationsIdGet**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdGet) | **GET** /edge_applications/{id} | /edge_applications/:id |
| [**edgeApplicationsIdPatch**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdPatch) | **PATCH** /edge_applications/{id} | /edge_applications/:id |
| [**edgeApplicationsIdPut**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdPut) | **PUT** /edge_applications/{id} | /edge_applications/:id |
| [**edgeApplicationsPost**](EdgeApplicationsMainSettingsApi.md#edgeApplicationsPost) | **POST** /edge_applications | /edge_applications |


<a id="edgeApplicationsGet"></a>
# **edgeApplicationsGet**
> Object edgeApplicationsGet(page, pageSize, filter, orderBy, sort, accept)

/edge_applications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      Object result = apiInstance.edgeApplicationsGet(page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsGet");
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
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |

### Return type

**Object**

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

<a id="edgeApplicationsIdDelete"></a>
# **edgeApplicationsIdDelete**
> edgeApplicationsIdDelete(id, accept)

/edge_applications/:id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    String id = "id_example"; // String | The id of the edge application that you plan to delete.
    String accept = "application/json; version=3"; // String | 
    try {
      apiInstance.edgeApplicationsIdDelete(id, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsIdDelete");
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
| **id** | **String**| The id of the edge application that you plan to delete. | |
| **accept** | **String**|  | [optional] |

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

<a id="edgeApplicationsIdGet"></a>
# **edgeApplicationsIdGet**
> GetApplicationResponse edgeApplicationsIdGet(id, accept)

/edge_applications/:id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    String id = "id_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      GetApplicationResponse result = apiInstance.edgeApplicationsIdGet(id, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsIdGet");
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
| **id** | **String**|  | |
| **accept** | **String**|  | [optional] |

### Return type

[**GetApplicationResponse**](GetApplicationResponse.md)

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

<a id="edgeApplicationsIdPatch"></a>
# **edgeApplicationsIdPatch**
> ApplicationUpdateResponse edgeApplicationsIdPatch(id, accept, contentType, applicationUpdateRequest)

/edge_applications/:id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    String id = "id_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationUpdateRequest applicationUpdateRequest = new ApplicationUpdateRequest(); // ApplicationUpdateRequest | 
    try {
      ApplicationUpdateResponse result = apiInstance.edgeApplicationsIdPatch(id, accept, contentType, applicationUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsIdPatch");
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
| **id** | **String**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationUpdateRequest** | [**ApplicationUpdateRequest**](ApplicationUpdateRequest.md)|  | [optional] |

### Return type

[**ApplicationUpdateResponse**](ApplicationUpdateResponse.md)

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

<a id="edgeApplicationsIdPut"></a>
# **edgeApplicationsIdPut**
> ApplicationPutResult edgeApplicationsIdPut(id, accept, contentType, applicationPutRequest)

/edge_applications/:id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    String id = "id_example"; // String | The Id of the edge application to be overwritten. 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationPutRequest applicationPutRequest = new ApplicationPutRequest(); // ApplicationPutRequest | 
    try {
      ApplicationPutResult result = apiInstance.edgeApplicationsIdPut(id, accept, contentType, applicationPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsIdPut");
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
| **id** | **String**| The Id of the edge application to be overwritten.  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationPutRequest** | [**ApplicationPutRequest**](ApplicationPutRequest.md)|  | [optional] |

### Return type

[**ApplicationPutResult**](ApplicationPutResult.md)

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

<a id="edgeApplicationsPost"></a>
# **edgeApplicationsPost**
> CreateApplicationResult edgeApplicationsPost(accept, contentType, createApplicationRequest)

/edge_applications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsMainSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsMainSettingsApi apiInstance = new EdgeApplicationsMainSettingsApi(defaultClient);
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest(); // CreateApplicationRequest | 
    try {
      CreateApplicationResult result = apiInstance.edgeApplicationsPost(accept, contentType, createApplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsMainSettingsApi#edgeApplicationsPost");
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
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **createApplicationRequest** | [**CreateApplicationRequest**](CreateApplicationRequest.md)|  | [optional] |

### Return type

[**CreateApplicationResult**](CreateApplicationResult.md)

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

