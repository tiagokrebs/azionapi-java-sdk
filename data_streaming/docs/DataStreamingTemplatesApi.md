# DataStreamingTemplatesApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataStramingTemplateById**](DataStreamingTemplatesApi.md#getDataStramingTemplateById) | **GET** /data_streaming/templates/{template_id} | Get an global Template info by template ID |
| [**listDataStreamingTemplates**](DataStreamingTemplatesApi.md#listDataStreamingTemplates) | **GET** /data_streaming/templates | List all global Templates that can be used on Data Streaming operations |


<a id="getDataStramingTemplateById"></a>
# **getDataStramingTemplateById**
> TemplateResultById getDataStramingTemplateById(templateId)

Get an global Template info by template ID

Use the GET method and add the data streaming&#39;s ID to the URI of the request to get more data on a specific data streaming global template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingTemplatesApi apiInstance = new DataStreamingTemplatesApi(defaultClient);
    Integer templateId = 56; // Integer | 
    try {
      TemplateResultById result = apiInstance.getDataStramingTemplateById(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingTemplatesApi#getDataStramingTemplateById");
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
| **templateId** | **Integer**|  | |

### Return type

[**TemplateResultById**](TemplateResultById.md)

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
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="listDataStreamingTemplates"></a>
# **listDataStreamingTemplates**
> TemplateResults listDataStreamingTemplates()

List all global Templates that can be used on Data Streaming operations

Use the GET method to list all global templates that can be used on Data Streaming operations.  **Note:** Customized templates won&#39;t be listed. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingTemplatesApi apiInstance = new DataStreamingTemplatesApi(defaultClient);
    try {
      TemplateResults result = apiInstance.listDataStreamingTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingTemplatesApi#listDataStreamingTemplates");
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

[**TemplateResults**](TemplateResults.md)

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

