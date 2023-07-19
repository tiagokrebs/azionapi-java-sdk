# DeleteDigitalCertificateApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**removeDigitalCertificates**](DeleteDigitalCertificateApi.md#removeDigitalCertificates) | **DELETE** /digital_certificates/{digital_certificate_id} | Remove a digital certificate or CSR from your account |


<a id="removeDigitalCertificates"></a>
# **removeDigitalCertificates**
> removeDigitalCertificates(digitalCertificateId)

Remove a digital certificate or CSR from your account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeleteDigitalCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DeleteDigitalCertificateApi apiInstance = new DeleteDigitalCertificateApi(defaultClient);
    Integer digitalCertificateId = 56; // Integer | ID of certificate to delete
    try {
      apiInstance.removeDigitalCertificates(digitalCertificateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeleteDigitalCertificateApi#removeDigitalCertificates");
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
| **digitalCertificateId** | **Integer**| ID of certificate to delete | |

### Return type

null (empty response body)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Forbidden |  -  |

