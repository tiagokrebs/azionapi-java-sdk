# RetrieveDigitalCertificateListApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDigitalCertificates**](RetrieveDigitalCertificateListApi.md#listDigitalCertificates) | **GET** /digital_certificates | List all existing digital certificates and CSRs registered to your account |


<a id="listDigitalCertificates"></a>
# **listDigitalCertificates**
> DC200List listDigitalCertificates(orderBy, sort, name, search)

List all existing digital certificates and CSRs registered to your account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RetrieveDigitalCertificateListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RetrieveDigitalCertificateListApi apiInstance = new RetrieveDigitalCertificateListApi(defaultClient);
    String orderBy = "name"; // String | Response field to order by, current options are \"name\" or \"id\"
    String sort = "asc"; // String | Sorting direction
    String name = "name_example"; // String | Searches certificate for name
    String search = "search_example"; // String | Searches for string in certificate name
    try {
      DC200List result = apiInstance.listDigitalCertificates(orderBy, sort, name, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrieveDigitalCertificateListApi#listDigitalCertificates");
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
| **orderBy** | **String**| Response field to order by, current options are \&quot;name\&quot; or \&quot;id\&quot; | [optional] [default to id] [enum: name, id] |
| **sort** | **String**| Sorting direction | [optional] [default to asc] [enum: asc, desc] |
| **name** | **String**| Searches certificate for name | [optional] |
| **search** | **String**| Searches for string in certificate name | [optional] |

### Return type

[**DC200List**](DC200List.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **406** | Not acceptable |  -  |

