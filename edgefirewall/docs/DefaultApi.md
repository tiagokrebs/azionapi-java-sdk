# DefaultApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**edgeFirewallEdgeFirewallIdRulesEngineGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEngineGet) | **GET** /edge_firewall/{edge_firewall_id}/rules_engine | List all rule sets. |
| [**edgeFirewallEdgeFirewallIdRulesEnginePost**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEnginePost) | **POST** /edge_firewall/{edge_firewall_id}/rules_engine | Create rule set. |
| [**edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete) | **DELETE** /edge_firewall/{edge_firewall_id}/rules_engine/{rule_set_id} | Delete rule set. |
| [**edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet) | **GET** /edge_firewall/{edge_firewall_id}/rules_engine/{rule_set_id} | Retrieve rule set by ID. |
| [**edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch) | **PATCH** /edge_firewall/{edge_firewall_id}/rules_engine/{rule_set_id} | Edit rule set. |
| [**edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut**](DefaultApi.md#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut) | **PUT** /edge_firewall/{edge_firewall_id}/rules_engine/{rule_set_id} | Overwrite rule set |
| [**edgeFirewallGet**](DefaultApi.md#edgeFirewallGet) | **GET** /edge_firewall | List all user edge firewall |
| [**edgeFirewallPost**](DefaultApi.md#edgeFirewallPost) | **POST** /edge_firewall | Create a edge firewall |
| [**edgeFirewallUuidDelete**](DefaultApi.md#edgeFirewallUuidDelete) | **DELETE** /edge_firewall/{uuid} | Delete an edge firewall by uuid |
| [**edgeFirewallUuidGet**](DefaultApi.md#edgeFirewallUuidGet) | **GET** /edge_firewall/{uuid} | Retrieve an edge firewall set by uuid |
| [**edgeFirewallUuidPatch**](DefaultApi.md#edgeFirewallUuidPatch) | **PATCH** /edge_firewall/{uuid} | Update some edge firewall attributes, like \&quot;active\&quot; |
| [**edgeFirewallUuidPut**](DefaultApi.md#edgeFirewallUuidPut) | **PUT** /edge_firewall/{uuid} | Overwrite some edge firewall attributes, like \&quot;active\&quot; |


<a id="edgeFirewallEdgeFirewallIdRulesEngineGet"></a>
# **edgeFirewallEdgeFirewallIdRulesEngineGet**
> RuleSetResponseAll edgeFirewallEdgeFirewallIdRulesEngineGet(edgeFirewallId, page, pageSize, sort, orderBy)

List all rule sets.

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
      RuleSetResponseAll result = apiInstance.edgeFirewallEdgeFirewallIdRulesEngineGet(edgeFirewallId, page, pageSize, sort, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEngineGet");
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

[**RuleSetResponseAll**](RuleSetResponseAll.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all rule sets. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdRulesEnginePost"></a>
# **edgeFirewallEdgeFirewallIdRulesEnginePost**
> RuleSetResponse edgeFirewallEdgeFirewallIdRulesEnginePost(edgeFirewallId, createRuleSetRequest)

Create rule set.

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
    CreateRuleSetRequest createRuleSetRequest = new CreateRuleSetRequest(); // CreateRuleSetRequest | 
    try {
      RuleSetResponse result = apiInstance.edgeFirewallEdgeFirewallIdRulesEnginePost(edgeFirewallId, createRuleSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEnginePost");
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
| **createRuleSetRequest** | [**CreateRuleSetRequest**](CreateRuleSetRequest.md)|  | [optional] |

### Return type

[**RuleSetResponse**](RuleSetResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create rule set. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete"></a>
# **edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete**
> edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete(edgeFirewallId, ruleSetId)

Delete rule set.

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
    Long ruleSetId = 56L; // Long | 
    try {
      apiInstance.edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete(edgeFirewallId, ruleSetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdDelete");
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
| **ruleSetId** | **Long**|  | |

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
| **204** | Delete rule set. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet"></a>
# **edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet**
> RuleSetResult edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet(edgeFirewallId, ruleSetId, orderBy, sort, page, pageSize)

Retrieve rule set by ID.

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
    Long ruleSetId = 56L; // Long | 
    String orderBy = "orderBy_example"; // String | 
    String sort = "ASC"; // String | 
    Long page = 1L; // Long | 
    Long pageSize = 10L; // Long | 
    try {
      RuleSetResult result = apiInstance.edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet(edgeFirewallId, ruleSetId, orderBy, sort, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdGet");
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
| **ruleSetId** | **Long**|  | |
| **orderBy** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] [enum: ASC, DESC] |
| **page** | **Long**|  | [optional] [default to 1] |
| **pageSize** | **Long**|  | [optional] [default to 10] |

### Return type

[**RuleSetResult**](RuleSetResult.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve rule set by ID. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch"></a>
# **edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch**
> RuleSetResult edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch(edgeFirewallId, ruleSetId, createRuleSetRequest)

Edit rule set.

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
    Long ruleSetId = 56L; // Long | 
    CreateRuleSetRequest createRuleSetRequest = new CreateRuleSetRequest(); // CreateRuleSetRequest | 
    try {
      RuleSetResult result = apiInstance.edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch(edgeFirewallId, ruleSetId, createRuleSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPatch");
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
| **ruleSetId** | **Long**|  | |
| **createRuleSetRequest** | [**CreateRuleSetRequest**](CreateRuleSetRequest.md)|  | [optional] |

### Return type

[**RuleSetResult**](RuleSetResult.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit rule set. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut"></a>
# **edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut**
> RuleSetResult edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut(edgeFirewallId, ruleSetId, createRuleSetRequest)

Overwrite rule set

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
    Long ruleSetId = 56L; // Long | 
    CreateRuleSetRequest createRuleSetRequest = new CreateRuleSetRequest(); // CreateRuleSetRequest | 
    try {
      RuleSetResult result = apiInstance.edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut(edgeFirewallId, ruleSetId, createRuleSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallEdgeFirewallIdRulesEngineRuleSetIdPut");
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
| **ruleSetId** | **Long**|  | |
| **createRuleSetRequest** | [**CreateRuleSetRequest**](CreateRuleSetRequest.md)|  | [optional] |

### Return type

[**RuleSetResult**](RuleSetResult.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Overwrite rule set. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallGet"></a>
# **edgeFirewallGet**
> ListEdgeFirewallResponse edgeFirewallGet(page, pageSize, sort, orderBy)

List all user edge firewall

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
    Long page = 56L; // Long | 
    Long pageSize = 56L; // Long | 
    String sort = "sort_example"; // String | 
    String orderBy = "orderBy_example"; // String | 
    try {
      ListEdgeFirewallResponse result = apiInstance.edgeFirewallGet(page, pageSize, sort, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallGet");
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

[**ListEdgeFirewallResponse**](ListEdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of edge firewalls |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="edgeFirewallPost"></a>
# **edgeFirewallPost**
> EdgeFirewallResponse edgeFirewallPost(createEdgeFirewallRequest)

Create a edge firewall

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
    CreateEdgeFirewallRequest createEdgeFirewallRequest = new CreateEdgeFirewallRequest(); // CreateEdgeFirewallRequest | 
    try {
      EdgeFirewallResponse result = apiInstance.edgeFirewallPost(createEdgeFirewallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallPost");
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
| **createEdgeFirewallRequest** | [**CreateEdgeFirewallRequest**](CreateEdgeFirewallRequest.md)|  | |

### Return type

[**EdgeFirewallResponse**](EdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Edge firewall created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallUuidDelete"></a>
# **edgeFirewallUuidDelete**
> edgeFirewallUuidDelete(uuid)

Delete an edge firewall by uuid

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
      apiInstance.edgeFirewallUuidDelete(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidDelete");
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
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="edgeFirewallUuidGet"></a>
# **edgeFirewallUuidGet**
> EdgeFirewallResponse edgeFirewallUuidGet(uuid)

Retrieve an edge firewall set by uuid

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
      EdgeFirewallResponse result = apiInstance.edgeFirewallUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidGet");
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

[**EdgeFirewallResponse**](EdgeFirewallResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An edge firewall object |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="edgeFirewallUuidPatch"></a>
# **edgeFirewallUuidPatch**
> EdgeFirewallResponse edgeFirewallUuidPatch(uuid, updateEdgeFirewallRequest)

Update some edge firewall attributes, like \&quot;active\&quot;

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
    UpdateEdgeFirewallRequest updateEdgeFirewallRequest = new UpdateEdgeFirewallRequest(); // UpdateEdgeFirewallRequest | 
    try {
      EdgeFirewallResponse result = apiInstance.edgeFirewallUuidPatch(uuid, updateEdgeFirewallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidPatch");
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
| **updateEdgeFirewallRequest** | [**UpdateEdgeFirewallRequest**](UpdateEdgeFirewallRequest.md)|  | |

### Return type

[**EdgeFirewallResponse**](EdgeFirewallResponse.md)

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
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="edgeFirewallUuidPut"></a>
# **edgeFirewallUuidPut**
> EdgeFirewallResponse edgeFirewallUuidPut(uuid, updateEdgeFirewallRequest)

Overwrite some edge firewall attributes, like \&quot;active\&quot;

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
    UpdateEdgeFirewallRequest updateEdgeFirewallRequest = new UpdateEdgeFirewallRequest(); // UpdateEdgeFirewallRequest | 
    try {
      EdgeFirewallResponse result = apiInstance.edgeFirewallUuidPut(uuid, updateEdgeFirewallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#edgeFirewallUuidPut");
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
| **updateEdgeFirewallRequest** | [**UpdateEdgeFirewallRequest**](UpdateEdgeFirewallRequest.md)|  | |

### Return type

[**EdgeFirewallResponse**](EdgeFirewallResponse.md)

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
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |

