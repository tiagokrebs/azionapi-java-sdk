# RetrieveDigitalCertificateByIdApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCertificate**](RetrieveDigitalCertificateByIdApi.md#getCertificate) | **GET** /digital_certificates/{digital_certificate_id} | Get more data on a specific digital certificate or CSR. |


<a id="getCertificate"></a>
# **getCertificate**
> DC200 getCertificate(digitalCertificateId)

Get more data on a specific digital certificate or CSR.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveDigitalCertificateByIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RetrieveDigitalCertificateByIdApi apiInstance = new RetrieveDigitalCertificateByIdApi(defaultClient);
    Long digitalCertificateId = 56L; // Long | ID of certificate
    try {
      DC200 result = apiInstance.getCertificate(digitalCertificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrieveDigitalCertificateByIdApi#getCertificate");
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
| **digitalCertificateId** | **Long**| ID of certificate | |

### Return type

[**DC200**](DC200.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized operation |  -  |
| **403** | Forbidden operation |  -  |
| **404** | Data not found |  -  |
| **406** | Not Acceptable |  -  |

