# PersonalTokenApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPersonalToken**](PersonalTokenApi.md#getPersonalToken) | **GET** /iam/personal_tokens/{personalTokenId} | Get a personal token info |
| [**listPersonalToken**](PersonalTokenApi.md#listPersonalToken) | **GET** /iam/personal_tokens | List all existing personal token |


<a id="getPersonalToken"></a>
# **getPersonalToken**
> PersonalTokenResponseGet getPersonalToken(personalTokenId)

Get a personal token info

Get a personal token info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersonalTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PersonalTokenApi apiInstance = new PersonalTokenApi(defaultClient);
    UUID personalTokenId = UUID.randomUUID(); // UUID | 
    try {
      PersonalTokenResponseGet result = apiInstance.getPersonalToken(personalTokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonalTokenApi#getPersonalToken");
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
| **personalTokenId** | **UUID**|  | |

### Return type

[**PersonalTokenResponseGet**](PersonalTokenResponseGet.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit |  -  |
| **500** | Internal Server Error |  -  |

<a id="listPersonalToken"></a>
# **listPersonalToken**
> PersonalTokenResponseWithResults listPersonalToken()

List all existing personal token

List all existing personal token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersonalTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    PersonalTokenApi apiInstance = new PersonalTokenApi(defaultClient);
    try {
      PersonalTokenResponseWithResults result = apiInstance.listPersonalToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonalTokenApi#listPersonalToken");
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

[**PersonalTokenResponseWithResults**](PersonalTokenResponseWithResults.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Rate Limit |  -  |
| **500** | Internal Server Error |  -  |

