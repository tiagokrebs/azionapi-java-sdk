# UpdateDigitalCertificateApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateDigitalCertificate**](UpdateDigitalCertificateApi.md#updateDigitalCertificate) | **PATCH** /digital_certificates/{digital_certificate_id} | Change only select settings of your digital certificate or CSR. |


<a id="updateDigitalCertificate"></a>
# **updateDigitalCertificate**
> DC200 updateDigitalCertificate(digitalCertificateId, updateDigitalCertificateRequest)

Change only select settings of your digital certificate or CSR.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UpdateDigitalCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    UpdateDigitalCertificateApi apiInstance = new UpdateDigitalCertificateApi(defaultClient);
    Integer digitalCertificateId = 56; // Integer | ID of certificate to update
    UpdateDigitalCertificateRequest updateDigitalCertificateRequest = new UpdateDigitalCertificateRequest(); // UpdateDigitalCertificateRequest | 
    try {
      DC200 result = apiInstance.updateDigitalCertificate(digitalCertificateId, updateDigitalCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpdateDigitalCertificateApi#updateDigitalCertificate");
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
| **digitalCertificateId** | **Integer**| ID of certificate to update | |
| **updateDigitalCertificateRequest** | [**UpdateDigitalCertificateRequest**](UpdateDigitalCertificateRequest.md)|  | |

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

