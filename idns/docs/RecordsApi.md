# RecordsApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteZoneRecord**](RecordsApi.md#deleteZoneRecord) | **DELETE** /intelligent_dns/{zone_id}/records/{record_id} | Remove an Intelligent DNS zone record |
| [**getZoneRecords**](RecordsApi.md#getZoneRecords) | **GET** /intelligent_dns/{zone_id}/records | Get a collection of Intelligent DNS zone records |
| [**postZoneRecord**](RecordsApi.md#postZoneRecord) | **POST** /intelligent_dns/{zone_id}/records | Create a new Intelligent DNS zone record |
| [**putZoneRecord**](RecordsApi.md#putZoneRecord) | **PUT** /intelligent_dns/{zone_id}/records/{record_id} | Update an Intelligent DNS zone record |


<a id="deleteZoneRecord"></a>
# **deleteZoneRecord**
> String deleteZoneRecord(zoneId, recordId)

Remove an Intelligent DNS zone record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    Integer recordId = 56; // Integer | The zone record id
    try {
      String result = apiInstance.deleteZoneRecord(zoneId, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#deleteZoneRecord");
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
| **zoneId** | **Integer**| The hosted zone id | |
| **recordId** | **Integer**| The zone record id | |

### Return type

**String**

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Record removed |  -  |
| **404** | Record not found |  -  |

<a id="getZoneRecords"></a>
# **getZoneRecords**
> GetRecordsResponse getZoneRecords(zoneId)

Get a collection of Intelligent DNS zone records

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    try {
      GetRecordsResponse result = apiInstance.getZoneRecords(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#getZoneRecords");
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
| **zoneId** | **Integer**| The hosted zone id | |

### Return type

[**GetRecordsResponse**](GetRecordsResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Zones collection retrieved |  -  |
| **400** | Error |  -  |

<a id="postZoneRecord"></a>
# **postZoneRecord**
> PostOrPutRecordResponse postZoneRecord(zoneId, recordPostOrPut)

Create a new Intelligent DNS zone record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    RecordPostOrPut recordPostOrPut = new RecordPostOrPut(); // RecordPostOrPut | 
    try {
      PostOrPutRecordResponse result = apiInstance.postZoneRecord(zoneId, recordPostOrPut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#postZoneRecord");
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
| **zoneId** | **Integer**| The hosted zone id | |
| **recordPostOrPut** | [**RecordPostOrPut**](RecordPostOrPut.md)|  | [optional] |

### Return type

[**PostOrPutRecordResponse**](PostOrPutRecordResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Record added |  -  |
| **400** | Error |  -  |

<a id="putZoneRecord"></a>
# **putZoneRecord**
> PostOrPutRecordResponse putZoneRecord(zoneId, recordId, recordPostOrPut)

Update an Intelligent DNS zone record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    RecordsApi apiInstance = new RecordsApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    Integer recordId = 56; // Integer | The zone record id
    RecordPostOrPut recordPostOrPut = new RecordPostOrPut(); // RecordPostOrPut | 
    try {
      PostOrPutRecordResponse result = apiInstance.putZoneRecord(zoneId, recordId, recordPostOrPut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordsApi#putZoneRecord");
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
| **zoneId** | **Integer**| The hosted zone id | |
| **recordId** | **Integer**| The zone record id | |
| **recordPostOrPut** | [**RecordPostOrPut**](RecordPostOrPut.md)|  | [optional] |

### Return type

[**PostOrPutRecordResponse**](PostOrPutRecordResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Record updated |  -  |
| **400** | Record update error |  -  |

