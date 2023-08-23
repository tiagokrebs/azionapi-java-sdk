# DataStreamingDomainApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDataStreaming**](DataStreamingDomainApi.md#listDataStreaming) | **GET** /data_streaming/domains | List all domains used on data streaming |


<a id="listDataStreaming"></a>
# **listDataStreaming**
> DataStreamingsDomainResponse listDataStreaming(name, streamingId, selected)

List all domains used on data streaming

Use the GET method to list all available domains that can be used on Data Streaming operations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingDomainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingDomainApi apiInstance = new DataStreamingDomainApi(defaultClient);
    String name = "name_example"; // String | Domain's name in data streaming
    Long streamingId = 56L; // Long | 
    Boolean selected = true; // Boolean | 
    try {
      DataStreamingsDomainResponse result = apiInstance.listDataStreaming(name, streamingId, selected);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingDomainApi#listDataStreaming");
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
| **name** | **String**| Domain&#39;s name in data streaming | [optional] |
| **streamingId** | **Long**|  | [optional] |
| **selected** | **Boolean**|  | [optional] |

### Return type

[**DataStreamingsDomainResponse**](DataStreamingsDomainResponse.md)

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
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

