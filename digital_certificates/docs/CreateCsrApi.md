# CreateCsrApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCSR**](CreateCsrApi.md#createCSR) | **POST** /digital_certificates/csr | Create an encrypted Certificate Request with Azion, which can then be sent for signing to a CA |


<a id="createCSR"></a>
# **createCSR**
> DC200 createCSR(createCSRRequest)

Create an encrypted Certificate Request with Azion, which can then be sent for signing to a CA

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateCsrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    CreateCsrApi apiInstance = new CreateCsrApi(defaultClient);
    CreateCSRRequest createCSRRequest = new CreateCSRRequest(); // CreateCSRRequest | 
    try {
      DC200 result = apiInstance.createCSR(createCSRRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateCsrApi#createCSR");
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
| **createCSRRequest** | [**CreateCSRRequest**](CreateCSRRequest.md)|  | |

### Return type

[**DC200**](DC200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Successful operation |  -  |
| **403** | Forbidden |  -  |

