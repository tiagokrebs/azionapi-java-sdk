# WafApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewWAFRuleset**](WafApi.md#createNewWAFRuleset) | **POST** /waf/rulesets | Create a new WAF Rule Set in an account. |
| [**deleteWAFRuleset**](WafApi.md#deleteWAFRuleset) | **DELETE** /waf/rulesets/{waf_rule_set_id} | Remove an WAF Rule Set from an account. Warning: this action cannot be undone. |
| [**getWAFDomains**](WafApi.md#getWAFDomains) | **GET** /waf/{wafId}/domains | List all domains attached to a Web Application Firewall (WAF) in an account. |
| [**getWAFEvents**](WafApi.md#getWAFEvents) | **GET** /waf/{wafId}/waf_events | Find WAF log events |
| [**getWAFRuleset**](WafApi.md#getWAFRuleset) | **GET** /waf/rulesets/{waf_rule_set_id} | List a specific Rule Set associated to a Web Application Firewall (WAF) in an account. |
| [**listAllWAF**](WafApi.md#listAllWAF) | **GET** /waf | List all Web Application Firewalls (WAFs) created in an account |
| [**listAllWAFRulesets**](WafApi.md#listAllWAFRulesets) | **GET** /waf/rulesets | list all Rule Sets associated to a Web Application Firewall (WAF) in an account. |
| [**updateWAFRuleset**](WafApi.md#updateWAFRuleset) | **PATCH** /waf/rulesets/{waf_rule_set_id} | Change only select settings of a WAF Rule Set |


<a id="createNewWAFRuleset"></a>
# **createNewWAFRuleset**
> SingleWAF createNewWAFRuleset(createNewWAFRulesetRequest)

Create a new WAF Rule Set in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    CreateNewWAFRulesetRequest createNewWAFRulesetRequest = new CreateNewWAFRulesetRequest(); // CreateNewWAFRulesetRequest | 
    try {
      SingleWAF result = apiInstance.createNewWAFRuleset(createNewWAFRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#createNewWAFRuleset");
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
| **createNewWAFRulesetRequest** | [**CreateNewWAFRulesetRequest**](CreateNewWAFRulesetRequest.md)|  | [optional] |

### Return type

[**SingleWAF**](SingleWAF.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json; version=3
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **201** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteWAFRuleset"></a>
# **deleteWAFRuleset**
> deleteWAFRuleset(wafRuleSetId)

Remove an WAF Rule Set from an account. Warning: this action cannot be undone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    String wafRuleSetId = "wafRuleSetId_example"; // String | 
    try {
      apiInstance.deleteWAFRuleset(wafRuleSetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#deleteWAFRuleset");
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
| **wafRuleSetId** | **String**|  | |

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
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getWAFDomains"></a>
# **getWAFDomains**
> WAFDomains200 getWAFDomains(wafId, name)

List all domains attached to a Web Application Firewall (WAF) in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long wafId = 56L; // Long | ID of WAF to return
    String name = "name_example"; // String | searches WAF for name
    try {
      WAFDomains200 result = apiInstance.getWAFDomains(wafId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#getWAFDomains");
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
| **wafId** | **Long**| ID of WAF to return | |
| **name** | **String**| searches WAF for name | [optional] |

### Return type

[**WAFDomains200**](WAFDomains200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **404** | data not found |  -  |

<a id="getWAFEvents"></a>
# **getWAFEvents**
> WAFEvents200 getWAFEvents(wafId, hourRange, domainsIds, networkListId)

Find WAF log events

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long wafId = 56L; // Long | ID of WAF to return
    Long hourRange = 56L; // Long | Last log hours since now (it must be a integer number ranging between 1 and 72)
    String domainsIds = "domainsIds_example"; // String | Multiple domain's id (they must be separated by comma like 1233,1234)
    Long networkListId = 56L; // Long | Id of a network list
    try {
      WAFEvents200 result = apiInstance.getWAFEvents(wafId, hourRange, domainsIds, networkListId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#getWAFEvents");
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
| **wafId** | **Long**| ID of WAF to return | |
| **hourRange** | **Long**| Last log hours since now (it must be a integer number ranging between 1 and 72) | |
| **domainsIds** | **String**| Multiple domain&#39;s id (they must be separated by comma like 1233,1234) | |
| **networkListId** | **Long**| Id of a network list | [optional] |

### Return type

[**WAFEvents200**](WAFEvents200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | unauthorized operation |  -  |
| **404** | data not found |  -  |
| **500** | Internal server error |  -  |

<a id="getWAFRuleset"></a>
# **getWAFRuleset**
> WAFSingle200 getWAFRuleset(wafRuleSetId)

List a specific Rule Set associated to a Web Application Firewall (WAF) in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long wafRuleSetId = 56L; // Long | ID of WAF Ruleset to return
    try {
      WAFSingle200 result = apiInstance.getWAFRuleset(wafRuleSetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#getWAFRuleset");
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
| **wafRuleSetId** | **Long**| ID of WAF Ruleset to return | |

### Return type

[**WAFSingle200**](WAFSingle200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **404** | data not found |  -  |

<a id="listAllWAF"></a>
# **listAllWAF**
> WAFList200 listAllWAF(page, pageSize)

List all Web Application Firewalls (WAFs) created in an account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    Long page = 1L; // Long | Identifies which page should be returned, if the return is paginated.
    Long pageSize = 10L; // Long | Identifies how many items should be returned per page.
    try {
      WAFList200 result = apiInstance.listAllWAF(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#listAllWAF");
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
| **page** | **Long**| Identifies which page should be returned, if the return is paginated. | [optional] [default to 1] |
| **pageSize** | **Long**| Identifies how many items should be returned per page. | [optional] [default to 10] |

### Return type

[**WAFList200**](WAFList200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **404** | data not found |  -  |

<a id="listAllWAFRulesets"></a>
# **listAllWAFRulesets**
> WAFList200 listAllWAFRulesets(orderBy, sort, page, pageSize)

list all Rule Sets associated to a Web Application Firewall (WAF) in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    String orderBy = "id"; // String | Identifies which property the return should be sorted by.
    String sort = "asc"; // String | Defines whether objects are shown in ascending or descending order depending on the value set in order_by.
    Long page = 1L; // Long | Identifies which page should be returned, if the return is paginated.
    Long pageSize = 10L; // Long | Identifies how many items should be returned per page.
    try {
      WAFList200 result = apiInstance.listAllWAFRulesets(orderBy, sort, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#listAllWAFRulesets");
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
| **orderBy** | **String**| Identifies which property the return should be sorted by. | [optional] [default to name] [enum: id, name, mode, active, sql_injection, sql_injection_sensitivity, remote_file_inclusion, remote_file_inclusion_sensitivity, directory_traversal, directory_traversal_sensitivity, cross_site_scripting, cross_site_scripting_sensitivity, evading_tricks, evading_tricks_sensitivity, file_upload, file_upload_sensitivity, unwanted_access, unwanted_access_sensitivity, identified_attack, identified_attack_sensitivity] |
| **sort** | **String**| Defines whether objects are shown in ascending or descending order depending on the value set in order_by. | [optional] [default to asc] [enum: asc, desc] |
| **page** | **Long**| Identifies which page should be returned, if the return is paginated. | [optional] [default to 1] |
| **pageSize** | **Long**| Identifies how many items should be returned per page. | [optional] [default to 10] |

### Return type

[**WAFList200**](WAFList200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Bad request |  -  |
| **404** | data not found |  -  |

<a id="updateWAFRuleset"></a>
# **updateWAFRuleset**
> SingleWAF updateWAFRuleset(wafRuleSetId, singleWAF)

Change only select settings of a WAF Rule Set

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    WafApi apiInstance = new WafApi(defaultClient);
    String wafRuleSetId = "wafRuleSetId_example"; // String | 
    SingleWAF singleWAF = new SingleWAF(); // SingleWAF | 
    try {
      SingleWAF result = apiInstance.updateWAFRuleset(wafRuleSetId, singleWAF);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafApi#updateWAFRuleset");
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
| **wafRuleSetId** | **String**|  | |
| **singleWAF** | [**SingleWAF**](SingleWAF.md)|  | [optional] |

### Return type

[**SingleWAF**](SingleWAF.md)

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
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

