# DataStreamingApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDataStreaming**](DataStreamingApi.md#createNewDataStreaming) | **POST** /data_streaming/streamings | Create a new data streaming |
| [**deleteDataStreamingById**](DataStreamingApi.md#deleteDataStreamingById) | **DELETE** /data_streaming/streamings/{data_streaming_id} | Delete data streaming |
| [**editDataStreamingById**](DataStreamingApi.md#editDataStreamingById) | **PATCH** /data_streaming/streamings/{data_streaming_id} | Edit data streaming |
| [**listDataStreamingById**](DataStreamingApi.md#listDataStreamingById) | **GET** /data_streaming/streamings/{data_streaming_id} | Get expecific data streaming by Data Streaming ID |
| [**listDataStreamings**](DataStreamingApi.md#listDataStreamings) | **GET** /data_streaming/streamings | List all exist data streamings |
| [**overwriteDataStreamingById**](DataStreamingApi.md#overwriteDataStreamingById) | **PUT** /data_streaming/streamings/{data_streaming_id} | Overwrite data streaming |


<a id="createNewDataStreaming"></a>
# **createNewDataStreaming**
> CreateNewDataStreaming201Response createNewDataStreaming(createNewDataStreamingRequest)

Create a new data streaming



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    CreateNewDataStreamingRequest createNewDataStreamingRequest = new CreateNewDataStreamingRequest(); // CreateNewDataStreamingRequest | 
    try {
      CreateNewDataStreaming201Response result = apiInstance.createNewDataStreaming(createNewDataStreamingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#createNewDataStreaming");
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
| **createNewDataStreamingRequest** | [**CreateNewDataStreamingRequest**](CreateNewDataStreamingRequest.md)|  | |

### Return type

[**CreateNewDataStreaming201Response**](CreateNewDataStreaming201Response.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteDataStreamingById"></a>
# **deleteDataStreamingById**
> deleteDataStreamingById(dataStreamingId)

Delete data streaming

Use the DELETE method to remove a data streaming from your account. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    Integer dataStreamingId = 56; // Integer | 
    try {
      apiInstance.deleteDataStreamingById(dataStreamingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#deleteDataStreamingById");
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
| **dataStreamingId** | **Integer**|  | |

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
| **204** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="editDataStreamingById"></a>
# **editDataStreamingById**
> CreateNewDataStreaming201Response editDataStreamingById(dataStreamingId, createNewDataStreamingRequest)

Edit data streaming

Use the PATCH method to change only select settings of your data streaming. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    Integer dataStreamingId = 56; // Integer | 
    CreateNewDataStreamingRequest createNewDataStreamingRequest = new CreateNewDataStreamingRequest(); // CreateNewDataStreamingRequest | 
    try {
      CreateNewDataStreaming201Response result = apiInstance.editDataStreamingById(dataStreamingId, createNewDataStreamingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#editDataStreamingById");
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
| **dataStreamingId** | **Integer**|  | |
| **createNewDataStreamingRequest** | [**CreateNewDataStreamingRequest**](CreateNewDataStreamingRequest.md)|  | |

### Return type

[**CreateNewDataStreaming201Response**](CreateNewDataStreaming201Response.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="listDataStreamingById"></a>
# **listDataStreamingById**
> DataStreamingsById listDataStreamingById(dataStreamingId)

Get expecific data streaming by Data Streaming ID

Use the GET method and add the data streaming&#39;s ID to the URI of the request to get more data on a specific data streaming.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    Integer dataStreamingId = 56; // Integer | 
    try {
      DataStreamingsById result = apiInstance.listDataStreamingById(dataStreamingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#listDataStreamingById");
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
| **dataStreamingId** | **Integer**|  | |

### Return type

[**DataStreamingsById**](DataStreamingsById.md)

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

<a id="listDataStreamings"></a>
# **listDataStreamings**
> DataStreamingResponseWithResults listDataStreamings()

List all exist data streamings

Use the GET method to list all data streamings, both active and inactive, and its properties.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    try {
      DataStreamingResponseWithResults result = apiInstance.listDataStreamings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#listDataStreamings");
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

[**DataStreamingResponseWithResults**](DataStreamingResponseWithResults.md)

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

<a id="overwriteDataStreamingById"></a>
# **overwriteDataStreamingById**
> CreateNewDataStreaming201Response overwriteDataStreamingById(dataStreamingId, createNewDataStreamingRequest)

Overwrite data streaming

Use the PUT method to overwrite the data streaming. Although  you can change a single property using the PUT method, you must pass all fields for the request to be completed. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataStreamingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DataStreamingApi apiInstance = new DataStreamingApi(defaultClient);
    Integer dataStreamingId = 56; // Integer | 
    CreateNewDataStreamingRequest createNewDataStreamingRequest = new CreateNewDataStreamingRequest(); // CreateNewDataStreamingRequest | 
    try {
      CreateNewDataStreaming201Response result = apiInstance.overwriteDataStreamingById(dataStreamingId, createNewDataStreamingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStreamingApi#overwriteDataStreamingById");
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
| **dataStreamingId** | **Integer**|  | |
| **createNewDataStreamingRequest** | [**CreateNewDataStreamingRequest**](CreateNewDataStreamingRequest.md)|  | |

### Return type

[**CreateNewDataStreaming201Response**](CreateNewDataStreaming201Response.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
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
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

