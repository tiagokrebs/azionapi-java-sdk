# ZonesApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteZone**](ZonesApi.md#deleteZone) | **DELETE** /intelligent_dns/{zone_id} | Remove an Intelligent DNS hosted zone |
| [**getZone**](ZonesApi.md#getZone) | **GET** /intelligent_dns/{zone_id} | Get an Intelligent DNS hosted zone |
| [**getZones**](ZonesApi.md#getZones) | **GET** /intelligent_dns | Get a collection of Intelligent DNS zones |
| [**postZone**](ZonesApi.md#postZone) | **POST** /intelligent_dns | Add a new Intelligent DNS zone |
| [**putZone**](ZonesApi.md#putZone) | **PUT** /intelligent_dns/{zone_id} | Update an Intelligent DNS hosted zone |


<a id="deleteZone"></a>
# **deleteZone**
> String deleteZone(zoneId)

Remove an Intelligent DNS hosted zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    try {
      String result = apiInstance.deleteZone(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#deleteZone");
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

**String**

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Zone removed |  -  |
| **404** | Zone not found |  -  |

<a id="getZone"></a>
# **getZone**
> GetZoneResponse getZone(zoneId)

Get an Intelligent DNS hosted zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    try {
      GetZoneResponse result = apiInstance.getZone(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#getZone");
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

[**GetZoneResponse**](GetZoneResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Zone retrieved |  -  |
| **404** | Zone not found |  -  |

<a id="getZones"></a>
# **getZones**
> GetZonesResponse getZones()

Get a collection of Intelligent DNS zones

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    try {
      GetZonesResponse result = apiInstance.getZones();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#getZones");
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

[**GetZonesResponse**](GetZonesResponse.md)

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

<a id="postZone"></a>
# **postZone**
> PostOrPutZoneResponse postZone(zone)

Add a new Intelligent DNS zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    Zone zone = new Zone(); // Zone | 
    try {
      PostOrPutZoneResponse result = apiInstance.postZone(zone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#postZone");
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
| **zone** | [**Zone**](Zone.md)|  | [optional] |

### Return type

[**PostOrPutZoneResponse**](PostOrPutZoneResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Zone added |  -  |
| **400** | Error |  -  |

<a id="putZone"></a>
# **putZone**
> PostOrPutZoneResponse putZone(zoneId, zone)

Update an Intelligent DNS hosted zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZonesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    ZonesApi apiInstance = new ZonesApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    Zone zone = new Zone(); // Zone | 
    try {
      PostOrPutZoneResponse result = apiInstance.putZone(zoneId, zone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesApi#putZone");
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
| **zone** | [**Zone**](Zone.md)|  | [optional] |

### Return type

[**PostOrPutZoneResponse**](PostOrPutZoneResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Zone updated |  -  |
| **400** | Zone update error |  -  |

