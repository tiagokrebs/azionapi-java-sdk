# OverwriteDigitalCertificateApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**overwriteDigitalCertificate**](OverwriteDigitalCertificateApi.md#overwriteDigitalCertificate) | **PUT** /digital_certificates/{digital_certificate_id} | Overwrite a digital certificate with another complete digital certificate |


<a id="overwriteDigitalCertificate"></a>
# **overwriteDigitalCertificate**
> DC200 overwriteDigitalCertificate(digitalCertificateId, createCertificateRequest)

Overwrite a digital certificate with another complete digital certificate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OverwriteDigitalCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    OverwriteDigitalCertificateApi apiInstance = new OverwriteDigitalCertificateApi(defaultClient);
    Integer digitalCertificateId = 56; // Integer | ID of certificate to overwrite
    CreateCertificateRequest createCertificateRequest = new CreateCertificateRequest(); // CreateCertificateRequest | 
    try {
      DC200 result = apiInstance.overwriteDigitalCertificate(digitalCertificateId, createCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OverwriteDigitalCertificateApi#overwriteDigitalCertificate");
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
| **digitalCertificateId** | **Integer**| ID of certificate to overwrite | |
| **createCertificateRequest** | [**CreateCertificateRequest**](CreateCertificateRequest.md)|  | |

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
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

