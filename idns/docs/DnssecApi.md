# DnssecApi

All URIs are relative to *https://api.azionapi.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getZoneDnsSec**](DnssecApi.md#getZoneDnsSec) | **GET** /intelligent_dns/{zone_id}/dnssec | Retrieve the DNSSEC zone status |
| [**putZoneDnsSec**](DnssecApi.md#putZoneDnsSec) | **PATCH** /intelligent_dns/{zone_id}/dnssec | Update the DNSSEC zone |


<a id="getZoneDnsSec"></a>
# **getZoneDnsSec**
> GetOrPatchDnsSecResponse getZoneDnsSec(zoneId)

Retrieve the DNSSEC zone status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnssecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DnssecApi apiInstance = new DnssecApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    try {
      GetOrPatchDnsSecResponse result = apiInstance.getZoneDnsSec(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnssecApi#getZoneDnsSec");
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

[**GetOrPatchDnsSecResponse**](GetOrPatchDnsSecResponse.md)

### Authorization

[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; version=3

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DNSSEC status retrieved |  -  |
| **400** | Error |  -  |

<a id="putZoneDnsSec"></a>
# **putZoneDnsSec**
> GetOrPatchDnsSecResponse putZoneDnsSec(zoneId, dnsSec)

Update the DNSSEC zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnssecApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    DnssecApi apiInstance = new DnssecApi(defaultClient);
    Integer zoneId = 56; // Integer | The hosted zone id
    DnsSec dnsSec = new DnsSec(); // DnsSec | 
    try {
      GetOrPatchDnsSecResponse result = apiInstance.putZoneDnsSec(zoneId, dnsSec);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnssecApi#putZoneDnsSec");
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
| **dnsSec** | [**DnsSec**](DnsSec.md)|  | [optional] |

### Return type

[**GetOrPatchDnsSecResponse**](GetOrPatchDnsSecResponse.md)

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

