# openapi-java-client

Edge Application API
- API version: 2.0.0
  - Build date: 2024-08-12T18:12:04.014507Z[GMT]
  - Generator version: 7.7.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EdgeApplicationsCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azionapi.net");
    
    // Configure API key authorization: tokenAuth
    ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    tokenAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenAuth.setApiKeyPrefix("Token");

    EdgeApplicationsCacheSettingsApi apiInstance = new EdgeApplicationsCacheSettingsApi(defaultClient);
    Long edgeApplicationId = 56L; // Long | 
    Long cacheSettingsId = 56L; // Long | 
    String accept = "application/json; version=3"; // String | 
    String contentType = "application/json"; // String | The type of coding used in the Body (application/json). <br>  Example: Content-Type: application/json
    try {
      apiInstance.edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete(edgeApplicationId, cacheSettingsId, accept, contentType);
    } catch (ApiException e) {
      System.err.println("Exception when calling EdgeApplicationsCacheSettingsApi#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.azionapi.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdDelete) | **DELETE** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdGet) | **GET** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPatch) | **PATCH** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/:cache_settings_id:
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsCacheSettingsIdPut) | **PUT** /edge_applications/{edge_application_id}/cache_settings/{cache_settings_id} | /edge_applications/:edge_application_id:/cache_settings/ca
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsGet**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsGet) | **GET** /edge_applications/{edge_application_id}/cache_settings | /edge_applications/{edge_application_id}/cache_settings
*EdgeApplicationsCacheSettingsApi* | [**edgeApplicationsEdgeApplicationIdCacheSettingsPost**](docs/EdgeApplicationsCacheSettingsApi.md#edgeApplicationsEdgeApplicationIdCacheSettingsPost) | **POST** /edge_applications/{edge_application_id}/cache_settings | /edge_applications/:edge_application_id:/cache_settings
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdDelete) | **DELETE** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id}
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdGet) | **GET** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id}
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPatch) | **PATCH** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id}
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsDeviceGroupIdPut) | **PUT** /edge_applications/{edge_application_id}/device_groups/{device_group_id} | /edge_applications/{edge_application_id}/device_groups/{device_group_id}
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsGet**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsGet) | **GET** /edge_applications/{edge_application_id}/device_groups | /edge_applications/{edge_application_id}/device_groups
*EdgeApplicationsDeviceGroupsApi* | [**edgeApplicationsEdgeApplicationIdDeviceGroupsPost**](docs/EdgeApplicationsDeviceGroupsApi.md#edgeApplicationsEdgeApplicationIdDeviceGroupsPost) | **POST** /edge_applications/{edge_application_id}/device_groups | /edge_applications/{edge_application_id}/device_groups
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdDelete) | **DELETE** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdGet) | **GET** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPatch) | **PATCH** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesFunctionsInstancesIdPut) | **PUT** /edge_applications/{edge_application_id}/functions_instances/{functions_instances_id} | /edge_applications/:edge_application_id:/functions_instances/:functions_instances_id:
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesGet**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesGet) | **GET** /edge_applications/{edge_application_id}/functions_instances | /edge_applications/:edge_application_id:/functions_instances
*EdgeApplicationsEdgeFunctionsInstancesApi* | [**edgeApplicationsEdgeApplicationIdFunctionsInstancesPost**](docs/EdgeApplicationsEdgeFunctionsInstancesApi.md#edgeApplicationsEdgeApplicationIdFunctionsInstancesPost) | **POST** /edge_applications/{edge_application_id}/functions_instances | edge_application/:edge_application_id:/functions_instances
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsGet**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsGet) | **GET** /edge_applications | /edge_applications
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsIdDelete**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdDelete) | **DELETE** /edge_applications/{id} | /edge_applications/:id
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsIdGet**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdGet) | **GET** /edge_applications/{id} | /edge_applications/:id
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsIdPatch**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdPatch) | **PATCH** /edge_applications/{id} | /edge_applications/:id
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsIdPut**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsIdPut) | **PUT** /edge_applications/{id} | /edge_applications/:id
*EdgeApplicationsMainSettingsApi* | [**edgeApplicationsPost**](docs/EdgeApplicationsMainSettingsApi.md#edgeApplicationsPost) | **POST** /edge_applications | /edge_applications
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsGet**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsGet) | **GET** /edge_applications/{edge_application_id}/origins | /edge_applications/{edge_application_id}/origins
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyDelete) | **DELETE** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_id}
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyGet) | **GET** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_key}
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPatch) | **PATCH** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/:edge_application_id:/origins/:origin_id:
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsOriginKeyPut) | **PUT** /edge_applications/{edge_application_id}/origins/{origin_key} | /edge_applications/{edge_application_id}/origins/{origin_id}
*EdgeApplicationsOriginsApi* | [**edgeApplicationsEdgeApplicationIdOriginsPost**](docs/EdgeApplicationsOriginsApi.md#edgeApplicationsEdgeApplicationIdOriginsPost) | **POST** /edge_applications/{edge_application_id}/origins | /edge_applications/{edge_application_id}/origins
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesGet) | **GET** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesPost) | **POST** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdDelete) | **DELETE** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdGet) | **GET** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/{edge_application_id}/rules_engine/{phase}/rules
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPatch) | **PATCH** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id:
*EdgeApplicationsRulesEngineApi* | [**edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut**](docs/EdgeApplicationsRulesEngineApi.md#edgeApplicationsEdgeApplicationIdRulesEnginePhaseRulesRuleIdPut) | **PUT** /edge_applications/{edge_application_id}/rules_engine/{phase}/rules/{rule_id} | /edge_applications/:edge_application_id:/rules_engine/:phase:/rules/:rule_id:


## Documentation for Models

 - [ApplicationCacheCreateRequest](docs/ApplicationCacheCreateRequest.md)
 - [ApplicationCacheCreateResponse](docs/ApplicationCacheCreateResponse.md)
 - [ApplicationCacheCreateResults](docs/ApplicationCacheCreateResults.md)
 - [ApplicationCacheGetOneResponse](docs/ApplicationCacheGetOneResponse.md)
 - [ApplicationCacheGetResponse](docs/ApplicationCacheGetResponse.md)
 - [ApplicationCachePatchRequest](docs/ApplicationCachePatchRequest.md)
 - [ApplicationCachePatchResponse](docs/ApplicationCachePatchResponse.md)
 - [ApplicationCachePutRequest](docs/ApplicationCachePutRequest.md)
 - [ApplicationCachePutResponse](docs/ApplicationCachePutResponse.md)
 - [ApplicationCacheResponseDetails](docs/ApplicationCacheResponseDetails.md)
 - [ApplicationCacheResults](docs/ApplicationCacheResults.md)
 - [ApplicationCreateInstanceRequest](docs/ApplicationCreateInstanceRequest.md)
 - [ApplicationInstanceResults](docs/ApplicationInstanceResults.md)
 - [ApplicationInstancesGetOneResponse](docs/ApplicationInstancesGetOneResponse.md)
 - [ApplicationInstancesGetResponse](docs/ApplicationInstancesGetResponse.md)
 - [ApplicationInstancesResults](docs/ApplicationInstancesResults.md)
 - [ApplicationLinks](docs/ApplicationLinks.md)
 - [ApplicationOrigins](docs/ApplicationOrigins.md)
 - [ApplicationPutInstanceRequest](docs/ApplicationPutInstanceRequest.md)
 - [ApplicationPutRequest](docs/ApplicationPutRequest.md)
 - [ApplicationPutResult](docs/ApplicationPutResult.md)
 - [ApplicationResults](docs/ApplicationResults.md)
 - [ApplicationResultsCreate](docs/ApplicationResultsCreate.md)
 - [ApplicationUpdateInstanceRequest](docs/ApplicationUpdateInstanceRequest.md)
 - [ApplicationUpdateRequest](docs/ApplicationUpdateRequest.md)
 - [ApplicationUpdateResponse](docs/ApplicationUpdateResponse.md)
 - [ApplicationUpdateResults](docs/ApplicationUpdateResults.md)
 - [ApplicationsResults](docs/ApplicationsResults.md)
 - [CreateApplicationRequest](docs/CreateApplicationRequest.md)
 - [CreateApplicationResult](docs/CreateApplicationResult.md)
 - [CreateDeviceGroupsRequest](docs/CreateDeviceGroupsRequest.md)
 - [CreateOriginsRequest](docs/CreateOriginsRequest.md)
 - [CreateOriginsRequestAddresses](docs/CreateOriginsRequestAddresses.md)
 - [CreateRulesEngineRequest](docs/CreateRulesEngineRequest.md)
 - [DeviceGroupsIdResponse](docs/DeviceGroupsIdResponse.md)
 - [DeviceGroupsResponse](docs/DeviceGroupsResponse.md)
 - [DeviceGroupsResponseLinks](docs/DeviceGroupsResponseLinks.md)
 - [DeviceGroupsResultResponse](docs/DeviceGroupsResultResponse.md)
 - [GetApplicationResponse](docs/GetApplicationResponse.md)
 - [GetApplicationsResponse](docs/GetApplicationsResponse.md)
 - [OriginsIdResponse](docs/OriginsIdResponse.md)
 - [OriginsResponse](docs/OriginsResponse.md)
 - [OriginsResponseLinks](docs/OriginsResponseLinks.md)
 - [OriginsResultResponse](docs/OriginsResultResponse.md)
 - [OriginsResultResponseAddresses](docs/OriginsResultResponseAddresses.md)
 - [PatchDeviceGroupsRequest](docs/PatchDeviceGroupsRequest.md)
 - [PatchOriginsRequest](docs/PatchOriginsRequest.md)
 - [PatchRulesEngineRequest](docs/PatchRulesEngineRequest.md)
 - [RulesEngineBehaviorEntry](docs/RulesEngineBehaviorEntry.md)
 - [RulesEngineBehaviorObject](docs/RulesEngineBehaviorObject.md)
 - [RulesEngineBehaviorObjectTarget](docs/RulesEngineBehaviorObjectTarget.md)
 - [RulesEngineBehaviorString](docs/RulesEngineBehaviorString.md)
 - [RulesEngineCriteria](docs/RulesEngineCriteria.md)
 - [RulesEngineIdResponse](docs/RulesEngineIdResponse.md)
 - [RulesEngineResponse](docs/RulesEngineResponse.md)
 - [RulesEngineResultResponse](docs/RulesEngineResultResponse.md)
 - [UpdateDeviceGroupsRequest](docs/UpdateDeviceGroupsRequest.md)
 - [UpdateOriginsRequest](docs/UpdateOriginsRequest.md)
 - [UpdateRulesEngineRequest](docs/UpdateRulesEngineRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="tokenAuth"></a>
### tokenAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



