/*
 * Edge Application
 * ## Welcome to the Azion API!  With the following APIs you can check, remove or update existing settings, besides creating new ones.  * * *  ## Overview  The Azion API is a RESTful API, based on HTTPS requests, that allows you to integrate your systems with our platform, simply, quickly, and securely.  Here you will find instructions on how our API works and what functionality is available.  This documentation is being constantly updated. Make sure you verify if there are any updates or changes before you perform any development in your application, even if you are familiar with our API.  * * *  Both HTTPS requests and responses must be in JavaScript Object Notation (JSON) format. All HTTPS requests and responses must follow these conventions.  **Base URL**  The base URL of the API, which must be used, is:  [**https://api.azionapi.net/_**](https://api.azionapi.net/)  **HTTP Methods**  Each HTTP method defines the type of operation that will be run.  | HTTP Method | CRUD | Whole Collection (e.g. /items) | Specific Item (e.g. /items/:item_id) | | --- | --- | --- | --- | | GET | Read | It retrieves the list of items in a Collection. | It retrieves a specific item in a Collection. | | POST | Create | It creates a new item in the Collection. | \\- | | PUT | Update/Replace | It replaces a whole Collection with a new one. | It replaces an item in a Collection with a new one. | | PATCH | Update/Modify | It partially updates a Collection. | It partially updates an item in a Collection | | DELETE | Delete | It deletes a whole Collection. | It deletes an item in a Collection. |  * * *  **Status Codes**  The HTTP return code defines the status – successful or not – after the requested operation is run.  | Status Code | Meaning | | --- | --- | | 200 OK | General Status for a successful operation. | | 201 CREATED | Successfully created a collection or item, by means of POST or PUT. | | 204 NO CONTENT | Successful operation, but without any content to be return to the Body. Generally used for DELETE or PUT operations. | | 207 MULTI-STATUS | A batch of operations were triggered by a single request, which resulted in different return codes when it was run, for some of the operations. The codes are displayed in the “status” field, in the body of the response, for each sub-batch of operations for whichever are applicable. | | 400 BAD REQUEST | Request error, such as invalid parameters, missing mandatory parameters or others. | | 401 UNAUTHORIZED | Error caused by a missing HTTP Authentication header. | | 403 FORBIDDEN | User does not have the permissions to run the requested operation. | | 404 NOT FOUND | The requested resource does not exist. | | 405 METHOD NOT ALLOWED | The requested method is not applicable with the URL. | | 406 NOT ACCEPTABLE | Accept header missing from the HTTP request or the header contains formatting or the version is not supported by the API. | | 409 CONFLICT | Conflict generated in running the request, such as a request to create an already existing record. | | 429 TOO MANY REQUESTS | The request was temporarily rejected, due to exceeding the limit on operations. Wait for the time defined in the X-Ratelimit-Reset header and try again. | | 500 INTERNAL SERVER ERROR | Unintentional error, due to an unidentified failure in the request process. | | \\--- |  | | **HTTP Headers** |  |  All requests must be generated with the HTTP header specifying the desired code format for responses and the API version used. The current version of the API is 3 and the format is application/json.  ``` Accept: application/json; version=3  ```  * * *  **Rate Limit**  The limit of operations that can be run via the API is defined by 3 HTTP response headers:  *   **X-ratelimit-limit:** number of operations allowed in one time-frame; *   **X-ratelimit-remaining:** number of operations still available in one time-frame; *   **X-ratelimit-reset:** is the date and time, in IOS 8601 format, which represents the point in the future when the time-frame will be closed and when the limits will, therefore, be reset.       Example of HTTP response headers and a request:  ``` Date: Thu, 02 Nov 2017 12:30:28 GMT X-ratelimit-remaining: 199 X-ratelimit-limit: 200 X-ratelimit-reset: 2017-11-02T12:31:28.675446  ```  In the example provided, 200 operations are allowed within a 1-minute time frame. Of those, there are 199 still available, because one has already been run. The total limit will be reset after 1 minute.  When the X-ratelimit-limit is reached, or in other words, when the X-ratelimit-remaining reaches zero, the API will give the error, HTTP 429 TOO MANY REQUESTS. If your application receives this error, you will need to wait until the time defined in X-ratelimit-reset has passed, to make another request.  *   **X-ratelimit-limit by product**       The *X-ratelimit limit* variations by product are the following:  *   **Real-Time Metrics:** 20 requests per minute. *   **Real-Time Purge:** 200 requests per minute; except for the Wildcard, which is 2000 a day.       > The rate-limit values are based on the client_id.  * * *  **Optional Parameters**  In this version, it is possible to include some optional parameters as part of the GET method, which can help and modify the form in which your data will be returned.  You can combine these parameters to get the result you want.  They are:  | Parameter | Description | Accepted values: | | --- | --- | --- | | order_by | Identifies which field the return should be sorted by. The default ordering is ascending. | Depends on the fields available from the endpoint structure | | sort | Defines which ordering to be used: ascending or descending. | asc  <br>  <br>desc | | page | Identifies which page should be returned, if the return is paginated. The default value is 1. | Page number. | | page_size | Identifies how many items should be returned per page. The default value is 10. | Desired number of items. |  * * *  **Request Exemple**  You can use one parameter, or a combination. See the example below, which uses all of them in the same request.  ``` GET /domains?order_by=name&page_size=20&sort=desc&page=3 Accept: application/json; version=3 Authorization: token 2909f3932069047f4736dc87e72baaddd19c9f75  ```  * * *  # Authentication  Authentication and authorization of operations via Azion API is done through Tokens.  The first step is to create the Token through authenticating a user registered in [Real-Time Manager](https://sso.azion.com/login).  * * *  ## Encoding Username and Password in Base64  Only token creation and cancelling operations are performed through Basic Authentication, that is, with a username and password. You can create and cancel the token through the API itself, but for that you need to encode your username and password in base64.  Base64 encoding can be done from the command line on a Unix terminal:  ``` $ echo 'user@domain:password'|base64 dXNlckBkb21haW46cGFzc3dvcmQK  ```  If you do not have a Unix terminal available, you can use the free online service at [https://www.base64encode.org/](https://www.base64encode.org/)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ApplicationCacheCreateResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-09T21:49:05.053927Z[GMT]")
public class ApplicationCacheCreateResults {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BROWSER_CACHE_SETTINGS = "browser_cache_settings";
  @SerializedName(SERIALIZED_NAME_BROWSER_CACHE_SETTINGS)
  private String browserCacheSettings;

  public static final String SERIALIZED_NAME_BROWSER_CACHE_SETTINGS_MAXIMUM_TTL = "browser_cache_settings_maximum_ttl";
  @SerializedName(SERIALIZED_NAME_BROWSER_CACHE_SETTINGS_MAXIMUM_TTL)
  private Long browserCacheSettingsMaximumTtl;

  public static final String SERIALIZED_NAME_CDN_CACHE_SETTINGS = "cdn_cache_settings";
  @SerializedName(SERIALIZED_NAME_CDN_CACHE_SETTINGS)
  private String cdnCacheSettings;

  public static final String SERIALIZED_NAME_CDN_CACHE_SETTINGS_MAXIMUM_TTL = "cdn_cache_settings_maximum_ttl";
  @SerializedName(SERIALIZED_NAME_CDN_CACHE_SETTINGS_MAXIMUM_TTL)
  private Long cdnCacheSettingsMaximumTtl;

  public static final String SERIALIZED_NAME_CACHE_BY_QUERY_STRING = "cache_by_query_string";
  @SerializedName(SERIALIZED_NAME_CACHE_BY_QUERY_STRING)
  private String cacheByQueryString;

  public static final String SERIALIZED_NAME_QUERY_STRING_FIELDS = "query_string_fields";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING_FIELDS)
  private List<String> queryStringFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLE_QUERY_STRING_SORT = "enable_query_string_sort";
  @SerializedName(SERIALIZED_NAME_ENABLE_QUERY_STRING_SORT)
  private Boolean enableQueryStringSort;

  public static final String SERIALIZED_NAME_CACHE_BY_COOKIES = "cache_by_cookies";
  @SerializedName(SERIALIZED_NAME_CACHE_BY_COOKIES)
  private String cacheByCookies;

  public static final String SERIALIZED_NAME_COOKIE_NAMES = "cookie_names";
  @SerializedName(SERIALIZED_NAME_COOKIE_NAMES)
  private List<String> cookieNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADAPTIVE_DELIVERY_ACTION = "adaptive_delivery_action";
  @SerializedName(SERIALIZED_NAME_ADAPTIVE_DELIVERY_ACTION)
  private String adaptiveDeliveryAction;

  public static final String SERIALIZED_NAME_DEVICE_GROUP = "device_group";
  @SerializedName(SERIALIZED_NAME_DEVICE_GROUP)
  private List<String> deviceGroup = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLE_CACHING_FOR_POST = "enable_caching_for_post";
  @SerializedName(SERIALIZED_NAME_ENABLE_CACHING_FOR_POST)
  private Boolean enableCachingForPost;

  public static final String SERIALIZED_NAME_L2_CACHING_ENABLED = "l2_caching_enabled";
  @SerializedName(SERIALIZED_NAME_L2_CACHING_ENABLED)
  private Boolean l2CachingEnabled;

  public ApplicationCacheCreateResults() {
  }

  public ApplicationCacheCreateResults id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ApplicationCacheCreateResults name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationCacheCreateResults browserCacheSettings(String browserCacheSettings) {
    
    this.browserCacheSettings = browserCacheSettings;
    return this;
  }

   /**
   * Get browserCacheSettings
   * @return browserCacheSettings
  **/
  @javax.annotation.Nonnull
  public String getBrowserCacheSettings() {
    return browserCacheSettings;
  }


  public void setBrowserCacheSettings(String browserCacheSettings) {
    this.browserCacheSettings = browserCacheSettings;
  }


  public ApplicationCacheCreateResults browserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
    return this;
  }

   /**
   * Get browserCacheSettingsMaximumTtl
   * @return browserCacheSettingsMaximumTtl
  **/
  @javax.annotation.Nonnull
  public Long getBrowserCacheSettingsMaximumTtl() {
    return browserCacheSettingsMaximumTtl;
  }


  public void setBrowserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
  }


  public ApplicationCacheCreateResults cdnCacheSettings(String cdnCacheSettings) {
    
    this.cdnCacheSettings = cdnCacheSettings;
    return this;
  }

   /**
   * Get cdnCacheSettings
   * @return cdnCacheSettings
  **/
  @javax.annotation.Nonnull
  public String getCdnCacheSettings() {
    return cdnCacheSettings;
  }


  public void setCdnCacheSettings(String cdnCacheSettings) {
    this.cdnCacheSettings = cdnCacheSettings;
  }


  public ApplicationCacheCreateResults cdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
    return this;
  }

   /**
   * Get cdnCacheSettingsMaximumTtl
   * @return cdnCacheSettingsMaximumTtl
  **/
  @javax.annotation.Nonnull
  public Long getCdnCacheSettingsMaximumTtl() {
    return cdnCacheSettingsMaximumTtl;
  }


  public void setCdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
  }


  public ApplicationCacheCreateResults cacheByQueryString(String cacheByQueryString) {
    
    this.cacheByQueryString = cacheByQueryString;
    return this;
  }

   /**
   * Get cacheByQueryString
   * @return cacheByQueryString
  **/
  @javax.annotation.Nonnull
  public String getCacheByQueryString() {
    return cacheByQueryString;
  }


  public void setCacheByQueryString(String cacheByQueryString) {
    this.cacheByQueryString = cacheByQueryString;
  }


  public ApplicationCacheCreateResults queryStringFields(List<String> queryStringFields) {
    
    this.queryStringFields = queryStringFields;
    return this;
  }

  public ApplicationCacheCreateResults addQueryStringFieldsItem(String queryStringFieldsItem) {
    if (this.queryStringFields == null) {
      this.queryStringFields = new ArrayList<>();
    }
    this.queryStringFields.add(queryStringFieldsItem);
    return this;
  }

   /**
   * Get queryStringFields
   * @return queryStringFields
  **/
  @javax.annotation.Nonnull
  public List<String> getQueryStringFields() {
    return queryStringFields;
  }


  public void setQueryStringFields(List<String> queryStringFields) {
    this.queryStringFields = queryStringFields;
  }


  public ApplicationCacheCreateResults enableQueryStringSort(Boolean enableQueryStringSort) {
    
    this.enableQueryStringSort = enableQueryStringSort;
    return this;
  }

   /**
   * Get enableQueryStringSort
   * @return enableQueryStringSort
  **/
  @javax.annotation.Nonnull
  public Boolean getEnableQueryStringSort() {
    return enableQueryStringSort;
  }


  public void setEnableQueryStringSort(Boolean enableQueryStringSort) {
    this.enableQueryStringSort = enableQueryStringSort;
  }


  public ApplicationCacheCreateResults cacheByCookies(String cacheByCookies) {
    
    this.cacheByCookies = cacheByCookies;
    return this;
  }

   /**
   * Get cacheByCookies
   * @return cacheByCookies
  **/
  @javax.annotation.Nonnull
  public String getCacheByCookies() {
    return cacheByCookies;
  }


  public void setCacheByCookies(String cacheByCookies) {
    this.cacheByCookies = cacheByCookies;
  }


  public ApplicationCacheCreateResults cookieNames(List<String> cookieNames) {
    
    this.cookieNames = cookieNames;
    return this;
  }

  public ApplicationCacheCreateResults addCookieNamesItem(String cookieNamesItem) {
    if (this.cookieNames == null) {
      this.cookieNames = new ArrayList<>();
    }
    this.cookieNames.add(cookieNamesItem);
    return this;
  }

   /**
   * Get cookieNames
   * @return cookieNames
  **/
  @javax.annotation.Nonnull
  public List<String> getCookieNames() {
    return cookieNames;
  }


  public void setCookieNames(List<String> cookieNames) {
    this.cookieNames = cookieNames;
  }


  public ApplicationCacheCreateResults adaptiveDeliveryAction(String adaptiveDeliveryAction) {
    
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
    return this;
  }

   /**
   * Get adaptiveDeliveryAction
   * @return adaptiveDeliveryAction
  **/
  @javax.annotation.Nonnull
  public String getAdaptiveDeliveryAction() {
    return adaptiveDeliveryAction;
  }


  public void setAdaptiveDeliveryAction(String adaptiveDeliveryAction) {
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
  }


  public ApplicationCacheCreateResults deviceGroup(List<String> deviceGroup) {
    
    this.deviceGroup = deviceGroup;
    return this;
  }

  public ApplicationCacheCreateResults addDeviceGroupItem(String deviceGroupItem) {
    if (this.deviceGroup == null) {
      this.deviceGroup = new ArrayList<>();
    }
    this.deviceGroup.add(deviceGroupItem);
    return this;
  }

   /**
   * Get deviceGroup
   * @return deviceGroup
  **/
  @javax.annotation.Nonnull
  public List<String> getDeviceGroup() {
    return deviceGroup;
  }


  public void setDeviceGroup(List<String> deviceGroup) {
    this.deviceGroup = deviceGroup;
  }


  public ApplicationCacheCreateResults enableCachingForPost(Boolean enableCachingForPost) {
    
    this.enableCachingForPost = enableCachingForPost;
    return this;
  }

   /**
   * Get enableCachingForPost
   * @return enableCachingForPost
  **/
  @javax.annotation.Nonnull
  public Boolean getEnableCachingForPost() {
    return enableCachingForPost;
  }


  public void setEnableCachingForPost(Boolean enableCachingForPost) {
    this.enableCachingForPost = enableCachingForPost;
  }


  public ApplicationCacheCreateResults l2CachingEnabled(Boolean l2CachingEnabled) {
    
    this.l2CachingEnabled = l2CachingEnabled;
    return this;
  }

   /**
   * Get l2CachingEnabled
   * @return l2CachingEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getL2CachingEnabled() {
    return l2CachingEnabled;
  }


  public void setL2CachingEnabled(Boolean l2CachingEnabled) {
    this.l2CachingEnabled = l2CachingEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCacheCreateResults applicationCacheCreateResults = (ApplicationCacheCreateResults) o;
    return Objects.equals(this.id, applicationCacheCreateResults.id) &&
        Objects.equals(this.name, applicationCacheCreateResults.name) &&
        Objects.equals(this.browserCacheSettings, applicationCacheCreateResults.browserCacheSettings) &&
        Objects.equals(this.browserCacheSettingsMaximumTtl, applicationCacheCreateResults.browserCacheSettingsMaximumTtl) &&
        Objects.equals(this.cdnCacheSettings, applicationCacheCreateResults.cdnCacheSettings) &&
        Objects.equals(this.cdnCacheSettingsMaximumTtl, applicationCacheCreateResults.cdnCacheSettingsMaximumTtl) &&
        Objects.equals(this.cacheByQueryString, applicationCacheCreateResults.cacheByQueryString) &&
        Objects.equals(this.queryStringFields, applicationCacheCreateResults.queryStringFields) &&
        Objects.equals(this.enableQueryStringSort, applicationCacheCreateResults.enableQueryStringSort) &&
        Objects.equals(this.cacheByCookies, applicationCacheCreateResults.cacheByCookies) &&
        Objects.equals(this.cookieNames, applicationCacheCreateResults.cookieNames) &&
        Objects.equals(this.adaptiveDeliveryAction, applicationCacheCreateResults.adaptiveDeliveryAction) &&
        Objects.equals(this.deviceGroup, applicationCacheCreateResults.deviceGroup) &&
        Objects.equals(this.enableCachingForPost, applicationCacheCreateResults.enableCachingForPost) &&
        Objects.equals(this.l2CachingEnabled, applicationCacheCreateResults.l2CachingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, browserCacheSettings, browserCacheSettingsMaximumTtl, cdnCacheSettings, cdnCacheSettingsMaximumTtl, cacheByQueryString, queryStringFields, enableQueryStringSort, cacheByCookies, cookieNames, adaptiveDeliveryAction, deviceGroup, enableCachingForPost, l2CachingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCacheCreateResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    browserCacheSettings: ").append(toIndentedString(browserCacheSettings)).append("\n");
    sb.append("    browserCacheSettingsMaximumTtl: ").append(toIndentedString(browserCacheSettingsMaximumTtl)).append("\n");
    sb.append("    cdnCacheSettings: ").append(toIndentedString(cdnCacheSettings)).append("\n");
    sb.append("    cdnCacheSettingsMaximumTtl: ").append(toIndentedString(cdnCacheSettingsMaximumTtl)).append("\n");
    sb.append("    cacheByQueryString: ").append(toIndentedString(cacheByQueryString)).append("\n");
    sb.append("    queryStringFields: ").append(toIndentedString(queryStringFields)).append("\n");
    sb.append("    enableQueryStringSort: ").append(toIndentedString(enableQueryStringSort)).append("\n");
    sb.append("    cacheByCookies: ").append(toIndentedString(cacheByCookies)).append("\n");
    sb.append("    cookieNames: ").append(toIndentedString(cookieNames)).append("\n");
    sb.append("    adaptiveDeliveryAction: ").append(toIndentedString(adaptiveDeliveryAction)).append("\n");
    sb.append("    deviceGroup: ").append(toIndentedString(deviceGroup)).append("\n");
    sb.append("    enableCachingForPost: ").append(toIndentedString(enableCachingForPost)).append("\n");
    sb.append("    l2CachingEnabled: ").append(toIndentedString(l2CachingEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("browser_cache_settings");
    openapiFields.add("browser_cache_settings_maximum_ttl");
    openapiFields.add("cdn_cache_settings");
    openapiFields.add("cdn_cache_settings_maximum_ttl");
    openapiFields.add("cache_by_query_string");
    openapiFields.add("query_string_fields");
    openapiFields.add("enable_query_string_sort");
    openapiFields.add("cache_by_cookies");
    openapiFields.add("cookie_names");
    openapiFields.add("adaptive_delivery_action");
    openapiFields.add("device_group");
    openapiFields.add("enable_caching_for_post");
    openapiFields.add("l2_caching_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("browser_cache_settings");
    openapiRequiredFields.add("browser_cache_settings_maximum_ttl");
    openapiRequiredFields.add("cdn_cache_settings");
    openapiRequiredFields.add("cdn_cache_settings_maximum_ttl");
    openapiRequiredFields.add("cache_by_query_string");
    openapiRequiredFields.add("query_string_fields");
    openapiRequiredFields.add("enable_query_string_sort");
    openapiRequiredFields.add("cache_by_cookies");
    openapiRequiredFields.add("cookie_names");
    openapiRequiredFields.add("adaptive_delivery_action");
    openapiRequiredFields.add("device_group");
    openapiRequiredFields.add("enable_caching_for_post");
    openapiRequiredFields.add("l2_caching_enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationCacheCreateResults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationCacheCreateResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationCacheCreateResults is not found in the empty JSON string", ApplicationCacheCreateResults.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationCacheCreateResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationCacheCreateResults` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationCacheCreateResults.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("browser_cache_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_cache_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_cache_settings").toString()));
      }
      if (!jsonObj.get("cdn_cache_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cdn_cache_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cdn_cache_settings").toString()));
      }
      if (!jsonObj.get("cache_by_query_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_by_query_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_by_query_string").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("query_string_fields") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("query_string_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_string_fields` to be an array in the JSON string but got `%s`", jsonObj.get("query_string_fields").toString()));
      }
      if (!jsonObj.get("cache_by_cookies").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_by_cookies` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_by_cookies").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("cookie_names") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("cookie_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_names` to be an array in the JSON string but got `%s`", jsonObj.get("cookie_names").toString()));
      }
      if (!jsonObj.get("adaptive_delivery_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adaptive_delivery_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adaptive_delivery_action").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("device_group") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("device_group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_group` to be an array in the JSON string but got `%s`", jsonObj.get("device_group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationCacheCreateResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationCacheCreateResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationCacheCreateResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationCacheCreateResults.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationCacheCreateResults>() {
           @Override
           public void write(JsonWriter out, ApplicationCacheCreateResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationCacheCreateResults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationCacheCreateResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationCacheCreateResults
  * @throws IOException if the JSON string is invalid with respect to ApplicationCacheCreateResults
  */
  public static ApplicationCacheCreateResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationCacheCreateResults.class);
  }

 /**
  * Convert an instance of ApplicationCacheCreateResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

