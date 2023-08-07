# EdgeApplicationsDeviceGroupsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete) | **DELETE** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id} |
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet) | **GET** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id} |
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch) | **PATCH** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id} |
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut) | **PUT** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id} |
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsGet**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsGet) | **GET** /edge_applications/{edge_application_id}/device_groups | /edge_applications/{edge_application_id}/device_groups |
| [**edgeApplicationsEdgeApplicationIdDeviceGroupsPost**](EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsPost) | **POST** /edge_applications/{edge_application_id}/device_groups | /edge_applications/{edge_application_id}/device_groups |


<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete**
> edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete(edgeApplicationId, deviceGroupId, accept)

/edge_applications/{edge_application_id}/device_groups/{device_group_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long deviceGroupId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | The id of the Device Groups that you plan to delete.
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete(edgeApplicationId, deviceGroupId, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete");
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
| **deviceGroupId** | **Long**|  | |
| **accept** | **String**| The id of the Device Groups that you plan to delete. | [optional] |

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

<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet**
> DeviceGroupsIdResponse edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet(edgeApplicationId, deviceGroupId, accept)

/edge_applications/{edge_application_id}/device_groups/{device_group_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long deviceGroupId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | The id of the Device Groups that you plan to query.
    try {
      DeviceGroupsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet(edgeApplicationId, deviceGroupId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet");
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
| **deviceGroupId** | **Long**|  | |
| **accept** | **String**| The id of the Device Groups that you plan to query. | [optional] |

### Return type

[**DeviceGroupsIdResponse**](DeviceGroupsIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch**
> DeviceGroupsIdResponse edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch(edgeApplicationId, deviceGroupId, accept, contentType, patchDeviceGroupsRequest)

/edge_applications/{edge_application_id}/device_groups/{device_group_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long deviceGroupId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    PatchDeviceGroupsRequest patchDeviceGroupsRequest = new PatchDeviceGroupsRequest(); // PatchDeviceGroupsRequest | 
    try {
      DeviceGroupsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch(edgeApplicationId, deviceGroupId, accept, contentType, patchDeviceGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch");
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
| **deviceGroupId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **patchDeviceGroupsRequest** | [**PatchDeviceGroupsRequest**](PatchDeviceGroupsRequest.md)|  | [optional] |

### Return type

[**DeviceGroupsIdResponse**](DeviceGroupsIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut**
> DeviceGroupsIdResponse edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut(edgeApplicationId, deviceGroupId, accept, contentType, updateDeviceGroupsRequest)

/edge_applications/{edge_application_id}/device_groups/{device_group_id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long deviceGroupId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    UpdateDeviceGroupsRequest updateDeviceGroupsRequest = new UpdateDeviceGroupsRequest(); // UpdateDeviceGroupsRequest | 
    try {
      DeviceGroupsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut(edgeApplicationId, deviceGroupId, accept, contentType, updateDeviceGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut");
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
| **deviceGroupId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **updateDeviceGroupsRequest** | [**UpdateDeviceGroupsRequest**](UpdateDeviceGroupsRequest.md)|  | [optional] |

### Return type

[**DeviceGroupsIdResponse**](DeviceGroupsIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsGet"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsGet**
> DeviceGroupsResponse edgeApplicationsEdgeApplicationIdDeviceGroupsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept)

/edge_applications/{edge_application_id}/device_groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      DeviceGroupsResponse result = apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsGet");
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

[**DeviceGroupsResponse**](DeviceGroupsResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdDeviceGroupsPost"></a>
# **edgeApplicationsEdgeApplicationIdDeviceGroupsPost**
> DeviceGroupsIdResponse edgeApplicationsEdgeApplicationIdDeviceGroupsPost(edgeApplicationId, accept, contentType, createDeviceGroupsRequest)

/edge_applications/{edge_application_id}/device_groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsDeviceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsDeviceGroupsApi apiInstance = new EdgeApplicationsDeviceGroupsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    CreateDeviceGroupsRequest createDeviceGroupsRequest = new CreateDeviceGroupsRequest(); // CreateDeviceGroupsRequest | 
    try {
      DeviceGroupsIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdDeviceGroupsPost(edgeApplicationId, accept, contentType, createDeviceGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsDeviceGroupsApi#edgeApplicationsEdgeApplicationIdDeviceGroupsPost");
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
| **createDeviceGroupsRequest** | [**CreateDeviceGroupsRequest**](CreateDeviceGroupsRequest.md)|  | [optional] |

### Return type

[**DeviceGroupsIdResponse**](DeviceGroupsIdResponse.md)

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
| **415** | Unsupported Media Type |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

