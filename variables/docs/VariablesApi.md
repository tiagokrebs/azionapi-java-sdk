# VariablesApi

All URIs are relative to *https://api.azionapi.net/variables*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiVariablesCreate**](VariablesApi.md#apiVariablesCreate) | **POST** /variables | /variables |
| [**apiVariablesDestroy**](VariablesApi.md#apiVariablesDestroy) | **DELETE** /variables/{uuid} | /variables/:uuid |
| [**apiVariablesList**](VariablesApi.md#apiVariablesList) | **GET** /variables | /variables |
| [**apiVariablesRetrieve**](VariablesApi.md#apiVariablesRetrieve) | **GET** /variables/{uuid} | /variables/:uuid |
| [**apiVariablesUpdate**](VariablesApi.md#apiVariablesUpdate) | **PUT** /variables/{uuid} | /variables/:uuid |


<a id="apiVariablesCreate"></a>
# **apiVariablesCreate**
> VariableGet apiVariablesCreate(variableCreate)

/variables

Create a new Variable. &lt;br&gt;&lt;ul&gt;&lt;li&gt;If the attribute \&quot;secret\&quot; is informed with value \&quot;true\&quot; in request payload the Variable value will be secret and no longer viewable after creation.&lt;/li&gt;&lt;li&gt;If the attribute \&quot;secret\&quot; is not informed the Variable value will be considered as not secret by default.&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net/variables");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    VariableCreate variableCreate = new VariableCreate(); // VariableCreate | 
    try {
      VariableGet result = apiInstance.apiVariablesCreate(variableCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#apiVariablesCreate");
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
| **variableCreate** | [**VariableCreate**](VariableCreate.md)|  | |

### Return type

[**VariableGet**](VariableGet.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiVariablesDestroy"></a>
# **apiVariablesDestroy**
> apiVariablesDestroy(uuid)

/variables/:uuid

Delete a Variable by it&#39;s UUID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net/variables");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      apiInstance.apiVariablesDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#apiVariablesDestroy");
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
| **204** | No response body |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiVariablesList"></a>
# **apiVariablesList**
> List&lt;Variable&gt; apiVariablesList()

/variables

List all user&#39;s Variables.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net/variables");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    try {
      List<Variable> result = apiInstance.apiVariablesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#apiVariablesList");
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

[**List&lt;Variable&gt;**](Variable.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Not Found |  -  |

<a id="apiVariablesRetrieve"></a>
# **apiVariablesRetrieve**
> Variable apiVariablesRetrieve(uuid)

/variables/:uuid

Retrieve all data for a Variable by it&#39;s UUID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net/variables");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    try {
      Variable result = apiInstance.apiVariablesRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#apiVariablesRetrieve");
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

[**Variable**](Variable.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiVariablesUpdate"></a>
# **apiVariablesUpdate**
> VariableGet apiVariablesUpdate(uuid, variableCreate)

/variables/:uuid

Update variable attributes by it&#39;s UUID. Keep the Variable UUID but overwrite all editable attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net/variables");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    VariableCreate variableCreate = new VariableCreate(); // VariableCreate | 
    try {
      VariableGet result = apiInstance.apiVariablesUpdate(uuid, variableCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#apiVariablesUpdate");
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
| **variableCreate** | [**VariableCreate**](VariableCreate.md)|  | |

### Return type

[**VariableGet**](VariableGet.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

