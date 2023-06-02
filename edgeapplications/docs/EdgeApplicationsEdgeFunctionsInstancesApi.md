# EdgeApplicationsEdgeFunctionsInstancesApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete) | **DELETE** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: |
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet) | **GET** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: |
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch) | **PATCH** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: |
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut) | **PUT** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id: |
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesGet**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesGet) | **GET** /edge_applications/{edge_application_id}/functions_instances | /edge_applications/:edge_application_id:/functions_instances |
| [**edgeApplicationsEdgeApplicationIdFunctionsInstancesPost**](EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesPost) | **POST** /edge_applications/{edge_application_id}/functions_instances | edge_application/:edge_application_id:/functions_instances |


<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete**
> edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete(edgeApplicationId, functionsInstancesId, accept, contentType)

/edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    String edgeApplicationId = "edgeApplicationId_example"; // String | 
    String functionsInstancesId = "functionsInstancesId_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete(edgeApplicationId, functionsInstancesId, accept, contentType);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete");
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
| **edgeApplicationId** | **String**|  | |
| **functionsInstancesId** | **String**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

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

<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet**
> ApplicationInstancesGetOneResponse edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet(edgeApplicationId, functionsInstancesId, accept)

/edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long functionsInstancesId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | The id of the edge function instance you plan to query. 
    try {
      ApplicationInstancesGetOneResponse result = apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet(edgeApplicationId, functionsInstancesId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet");
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
| **functionsInstancesId** | **Long**|  | |
| **accept** | **String**| The id of the edge function instance you plan to query.  | [optional] |

### Return type

[**ApplicationInstancesGetOneResponse**](ApplicationInstancesGetOneResponse.md)

### Authorization

[JWT](../README.md#JWT)

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

<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch**
> ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest)

/edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    String edgeApplicationId = "edgeApplicationId_example"; // String | The id of the edge application you plan to overwrite 
    String functionsInstancesId = "functionsInstancesId_example"; // String | The id of the edge function instance you plan to overwrite.
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationUpdateInstanceRequest applicationUpdateInstanceRequest = new ApplicationUpdateInstanceRequest(); // ApplicationUpdateInstanceRequest | 
    try {
      ApplicationInstanceResults result = apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch(edgeApplicationId, functionsInstancesId, accept, contentType, applicationUpdateInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch");
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
| **edgeApplicationId** | **String**| The id of the edge application you plan to overwrite  | |
| **functionsInstancesId** | **String**| The id of the edge function instance you plan to overwrite. | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationUpdateInstanceRequest** | [**ApplicationUpdateInstanceRequest**](ApplicationUpdateInstanceRequest.md)|  | [optional] |

### Return type

[**ApplicationInstanceResults**](ApplicationInstanceResults.md)

### Authorization

[JWT](../README.md#JWT)

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

<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut**
> ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest)

/edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    String edgeApplicationId = "edgeApplicationId_example"; // String | The id of the edge application you plan to overwrite 
    String functionsInstancesId = "functionsInstancesId_example"; // String | The id of the edge function instance you plan to overwrite.
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationPutInstanceRequest applicationPutInstanceRequest = new ApplicationPutInstanceRequest(); // ApplicationPutInstanceRequest | 
    try {
      ApplicationInstanceResults result = apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut(edgeApplicationId, functionsInstancesId, accept, contentType, applicationPutInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut");
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
| **edgeApplicationId** | **String**| The id of the edge application you plan to overwrite  | |
| **functionsInstancesId** | **String**| The id of the edge function instance you plan to overwrite. | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **applicationPutInstanceRequest** | [**ApplicationPutInstanceRequest**](ApplicationPutInstanceRequest.md)|  | [optional] |

### Return type

[**ApplicationInstanceResults**](ApplicationInstanceResults.md)

### Authorization

[JWT](../README.md#JWT)

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

<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesGet"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesGet**
> ApplicationInstancesGetResponse edgeApplicationsEdgeApplicationIdFunctionsInstancesGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept)

/edge_applications/:edge_application_id:/functions_instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      ApplicationInstancesGetResponse result = apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesGet(edgeApplicationId, page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesGet");
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

[**ApplicationInstancesGetResponse**](ApplicationInstancesGetResponse.md)

### Authorization

[JWT](../README.md#JWT)

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

<a id="edgeApplicationsEdgeApplicationIdFunctionsInstancesPost"></a>
# **edgeApplicationsEdgeApplicationIdFunctionsInstancesPost**
> ApplicationInstanceResults edgeApplicationsEdgeApplicationIdFunctionsInstancesPost(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest)

edge_application/:edge_application_id:/functions_instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsEdgeFunctionsInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    EdgeApplicationsEdgeFunctionsInstancesApi apiInstance = new EdgeApplicationsEdgeFunctionsInstancesApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    ApplicationCreateInstanceRequest applicationCreateInstanceRequest = new ApplicationCreateInstanceRequest(); // ApplicationCreateInstanceRequest | 
    try {
      ApplicationInstanceResults result = apiInstance.edgeApplicationsEdgeApplicationIdFunctionsInstancesPost(edgeApplicationId, accept, contentType, applicationCreateInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsEdgeFunctionsInstancesApi#edgeApplicationsEdgeApplicationIdFunctionsInstancesPost");
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
| **applicationCreateInstanceRequest** | [**ApplicationCreateInstanceRequest**](ApplicationCreateInstanceRequest.md)|  | [optional] |

### Return type

[**ApplicationInstanceResults**](ApplicationInstanceResults.md)

### Authorization

[JWT](../README.md#JWT)

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

