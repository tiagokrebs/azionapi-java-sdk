# EdgeApplicationsRulesEngineApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet) | **GET** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules |
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost) | **POST** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules |
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete) | **DELETE** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules |
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet) | **GET** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules |
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch) | **PATCH** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id: |
| [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut**](EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut) | **PUT** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id: |


<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet**
> RulesEngineResponse edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet(edgeApplicationId, phase, page, pageSize, filter, orderBy, sort, accept)

/edge_applications/{edge_application_id}/rules_engine/{phase}/rules

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String phase = "phase_example"; // String | 
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String filter = "filter_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "sort_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    try {
      RulesEngineResponse result = apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet(edgeApplicationId, phase, page, pageSize, filter, orderBy, sort, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet");
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
| **phase** | **String**|  | |
| **page** | **Long**|  | [optional] |
| **pageSize** | **Long**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **accept** | **String**|  | [optional] |

### Return type

[**RulesEngineResponse**](RulesEngineResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost**
> RulesEngineIdResponse edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost(edgeApplicationId, phase, accept, contentType, createRulesEngineRequest)

/edge_applications/{edge_application_id}/rules_engine/{phase}/rules

Check below the list of behaviors that can be applied:  | Name                                | Behavior               | | ----------------------------------- | ---------------------- | | Add Request Cookie                  | add_request_cookie     | | Add Request Header                  | add_request_header     | | Add Response Cookie                 | set_cookie             | | Add Response Header                 | add_response_header    | | Bypass Cache                        | bypass_cache_phase     | | Capture Match Groups                | capture_match_groups   | | Deliver                             | deliver                | | Deny (403 Forbidden)                | deny                   | | Enable Gzip                         | enable_gzip            | | Filter Request Cookie               | filter_request_cookie  | | Filter Request Header               | filter_request_header  | | Filter Response Cookie              | filter_response_cookie | | Filter Response Header              | filter_response_header | | Finish Request Phase                | finish_request_phase   | | Forward Cookies                     | forward_cookies        | | Optimize Images                     | optimize_images        | | Redirect HTTP to HTTPS              | redirect_http_to_https | | Redirect To (301 Moved Permanently) | redirect_to_301        | | Redirect To (302 Found)             | redirect_to_302        | | Rewrite Request                     | rewrite_request        | | Run Function                        | run_function           | | Set Cache Policy                    | set_cache_policy       | | Set Origin                          | set_origin             |

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String phase = "phase_example"; // String | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    CreateRulesEngineRequest createRulesEngineRequest = new CreateRulesEngineRequest(); // CreateRulesEngineRequest | 
    try {
      RulesEngineIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost(edgeApplicationId, phase, accept, contentType, createRulesEngineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost");
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
| **phase** | **String**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **createRulesEngineRequest** | [**CreateRulesEngineRequest**](CreateRulesEngineRequest.md)|  | [optional] |

### Return type

[**RulesEngineIdResponse**](RulesEngineIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete**
> edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete(edgeApplicationId, phase, ruleId, accept)

/edge_applications/{edge_application_id}/rules_engine/{phase}/rules

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | The id of the edge application you plan to delete. 
    String phase = "phase_example"; // String | 
    Long ruleId = 56L; // Long | The id of the rule you plan to delete. 
    String accept = "application/json; version=3"; // String | 
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete(edgeApplicationId, phase, ruleId, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete");
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
| **edgeApplicationId** | **Long**| The id of the edge application you plan to delete.  | |
| **phase** | **String**|  | |
| **ruleId** | **Long**| The id of the rule you plan to delete.  | |
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

<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet**
> RulesEngineIdResponse edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet(edgeApplicationId, phase, ruleId, accept)

/edge_applications/{edge_application_id}/rules_engine/{phase}/rules

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | The id of the edge application you want to get. 
    String phase = "phase_example"; // String | 
    Long ruleId = 56L; // Long | The id of the rule you plan to delete. 
    String accept = "application/json; version=3"; // String | 
    try {
      RulesEngineIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet(edgeApplicationId, phase, ruleId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet");
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
| **edgeApplicationId** | **Long**| The id of the edge application you want to get.  | |
| **phase** | **String**|  | |
| **ruleId** | **Long**| The id of the rule you plan to delete.  | |
| **accept** | **String**|  | [optional] |

### Return type

[**RulesEngineIdResponse**](RulesEngineIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch**
> RulesEngineIdResponse edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch(edgeApplicationId, phase, ruleId, accept, contentType, patchRulesEngineRequest)

/edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String phase = "phase_example"; // String | 
    Long ruleId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    PatchRulesEngineRequest patchRulesEngineRequest = new PatchRulesEngineRequest(); // PatchRulesEngineRequest | 
    try {
      RulesEngineIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch(edgeApplicationId, phase, ruleId, accept, contentType, patchRulesEngineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch");
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
| **phase** | **String**|  | |
| **ruleId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **patchRulesEngineRequest** | [**PatchRulesEngineRequest**](PatchRulesEngineRequest.md)|  | [optional] |

### Return type

[**RulesEngineIdResponse**](RulesEngineIdResponse.md)

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

<a id="edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut"></a>
# **edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut**
> RulesEngineIdResponse edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut(edgeApplicationId, phase, ruleId, accept, contentType, updateRulesEngineRequest)

/edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id:

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsRulesEngineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsRulesEngineApi apiInstance = new EdgeApplicationsRulesEngineApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    String phase = "phase_example"; // String | 
    Long ruleId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    UpdateRulesEngineRequest updateRulesEngineRequest = new UpdateRulesEngineRequest(); // UpdateRulesEngineRequest | 
    try {
      RulesEngineIdResponse result = apiInstance.edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut(edgeApplicationId, phase, ruleId, accept, contentType, updateRulesEngineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsRulesEngineApi#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut");
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
| **phase** | **String**|  | |
| **ruleId** | **Long**|  | |
| **accept** | **String**|  | [optional] |
| **contentType** | **String**| The type of coding used in the Body (application/json). &lt;br&gt;  Example: Content-Type: application/json | [optional] |
| **updateRulesEngineRequest** | [**UpdateRulesEngineRequest**](UpdateRulesEngineRequest.md)|  | [optional] |

### Return type

[**RulesEngineIdResponse**](RulesEngineIdResponse.md)

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

