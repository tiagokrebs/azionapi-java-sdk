/*
 * Edge Application API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ApplicationCacheCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-06T16:49:01.374097Z[GMT]")
public class ApplicationCacheCreateRequest {
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
  private List<String> queryStringFields;

  public static final String SERIALIZED_NAME_ENABLE_QUERY_STRING_SORT = "enable_query_string_sort";
  @SerializedName(SERIALIZED_NAME_ENABLE_QUERY_STRING_SORT)
  private Boolean enableQueryStringSort;

  public static final String SERIALIZED_NAME_CACHE_BY_COOKIES = "cache_by_cookies";
  @SerializedName(SERIALIZED_NAME_CACHE_BY_COOKIES)
  private String cacheByCookies;

  public static final String SERIALIZED_NAME_COOKIE_NAMES = "cookie_names";
  @SerializedName(SERIALIZED_NAME_COOKIE_NAMES)
  private List<String> cookieNames;

  public static final String SERIALIZED_NAME_ADAPTIVE_DELIVERY_ACTION = "adaptive_delivery_action";
  @SerializedName(SERIALIZED_NAME_ADAPTIVE_DELIVERY_ACTION)
  private String adaptiveDeliveryAction;

  public static final String SERIALIZED_NAME_DEVICE_GROUP = "device_group";
  @SerializedName(SERIALIZED_NAME_DEVICE_GROUP)
  private List<Integer> deviceGroup;

  public static final String SERIALIZED_NAME_ENABLE_CACHING_FOR_POST = "enable_caching_for_post";
  @SerializedName(SERIALIZED_NAME_ENABLE_CACHING_FOR_POST)
  private Boolean enableCachingForPost;

  public static final String SERIALIZED_NAME_L2_CACHING_ENABLED = "l2_caching_enabled";
  @SerializedName(SERIALIZED_NAME_L2_CACHING_ENABLED)
  private Boolean l2CachingEnabled;

  public static final String SERIALIZED_NAME_IS_SLICE_CONFIGURATION_ENABLED = "is_slice_configuration_enabled";
  @SerializedName(SERIALIZED_NAME_IS_SLICE_CONFIGURATION_ENABLED)
  private Boolean isSliceConfigurationEnabled;

  public static final String SERIALIZED_NAME_IS_SLICE_EDGE_CACHING_ENABLED = "is_slice_edge_caching_enabled";
  @SerializedName(SERIALIZED_NAME_IS_SLICE_EDGE_CACHING_ENABLED)
  private Boolean isSliceEdgeCachingEnabled;

  public static final String SERIALIZED_NAME_IS_SLICE_L2_CACHING_ENABLED = "is_slice_l2_caching_enabled";
  @SerializedName(SERIALIZED_NAME_IS_SLICE_L2_CACHING_ENABLED)
  private Boolean isSliceL2CachingEnabled;

  public static final String SERIALIZED_NAME_SLICE_CONFIGURATION_RANGE = "slice_configuration_range";
  @SerializedName(SERIALIZED_NAME_SLICE_CONFIGURATION_RANGE)
  private Long sliceConfigurationRange;

  public static final String SERIALIZED_NAME_ENABLE_CACHING_FOR_OPTIONS = "enable_caching_for_options";
  @SerializedName(SERIALIZED_NAME_ENABLE_CACHING_FOR_OPTIONS)
  private Boolean enableCachingForOptions;

  public static final String SERIALIZED_NAME_ENABLE_STALE_CACHE = "enable_stale_cache";
  @SerializedName(SERIALIZED_NAME_ENABLE_STALE_CACHE)
  private Boolean enableStaleCache;

  public static final String SERIALIZED_NAME_L2_REGION = "l2_region";
  @SerializedName(SERIALIZED_NAME_L2_REGION)
  private String l2Region;

  public ApplicationCacheCreateRequest() {
  }

  public ApplicationCacheCreateRequest name(String name) {
    
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


  public ApplicationCacheCreateRequest browserCacheSettings(String browserCacheSettings) {
    
    this.browserCacheSettings = browserCacheSettings;
    return this;
  }

   /**
   * Get browserCacheSettings
   * @return browserCacheSettings
  **/
  @javax.annotation.Nullable
  public String getBrowserCacheSettings() {
    return browserCacheSettings;
  }


  public void setBrowserCacheSettings(String browserCacheSettings) {
    this.browserCacheSettings = browserCacheSettings;
  }


  public ApplicationCacheCreateRequest browserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
    return this;
  }

   /**
   * Get browserCacheSettingsMaximumTtl
   * @return browserCacheSettingsMaximumTtl
  **/
  @javax.annotation.Nullable
  public Long getBrowserCacheSettingsMaximumTtl() {
    return browserCacheSettingsMaximumTtl;
  }


  public void setBrowserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
  }


  public ApplicationCacheCreateRequest cdnCacheSettings(String cdnCacheSettings) {
    
    this.cdnCacheSettings = cdnCacheSettings;
    return this;
  }

   /**
   * Get cdnCacheSettings
   * @return cdnCacheSettings
  **/
  @javax.annotation.Nullable
  public String getCdnCacheSettings() {
    return cdnCacheSettings;
  }


  public void setCdnCacheSettings(String cdnCacheSettings) {
    this.cdnCacheSettings = cdnCacheSettings;
  }


  public ApplicationCacheCreateRequest cdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
    return this;
  }

   /**
   * Get cdnCacheSettingsMaximumTtl
   * @return cdnCacheSettingsMaximumTtl
  **/
  @javax.annotation.Nullable
  public Long getCdnCacheSettingsMaximumTtl() {
    return cdnCacheSettingsMaximumTtl;
  }


  public void setCdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
  }


  public ApplicationCacheCreateRequest cacheByQueryString(String cacheByQueryString) {
    
    this.cacheByQueryString = cacheByQueryString;
    return this;
  }

   /**
   * Get cacheByQueryString
   * @return cacheByQueryString
  **/
  @javax.annotation.Nullable
  public String getCacheByQueryString() {
    return cacheByQueryString;
  }


  public void setCacheByQueryString(String cacheByQueryString) {
    this.cacheByQueryString = cacheByQueryString;
  }


  public ApplicationCacheCreateRequest queryStringFields(List<String> queryStringFields) {
    
    this.queryStringFields = queryStringFields;
    return this;
  }

  public ApplicationCacheCreateRequest addQueryStringFieldsItem(String queryStringFieldsItem) {
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
  @javax.annotation.Nullable
  public List<String> getQueryStringFields() {
    return queryStringFields;
  }


  public void setQueryStringFields(List<String> queryStringFields) {
    this.queryStringFields = queryStringFields;
  }


  public ApplicationCacheCreateRequest enableQueryStringSort(Boolean enableQueryStringSort) {
    
    this.enableQueryStringSort = enableQueryStringSort;
    return this;
  }

   /**
   * Get enableQueryStringSort
   * @return enableQueryStringSort
  **/
  @javax.annotation.Nullable
  public Boolean getEnableQueryStringSort() {
    return enableQueryStringSort;
  }


  public void setEnableQueryStringSort(Boolean enableQueryStringSort) {
    this.enableQueryStringSort = enableQueryStringSort;
  }


  public ApplicationCacheCreateRequest cacheByCookies(String cacheByCookies) {
    
    this.cacheByCookies = cacheByCookies;
    return this;
  }

   /**
   * Get cacheByCookies
   * @return cacheByCookies
  **/
  @javax.annotation.Nullable
  public String getCacheByCookies() {
    return cacheByCookies;
  }


  public void setCacheByCookies(String cacheByCookies) {
    this.cacheByCookies = cacheByCookies;
  }


  public ApplicationCacheCreateRequest cookieNames(List<String> cookieNames) {
    
    this.cookieNames = cookieNames;
    return this;
  }

  public ApplicationCacheCreateRequest addCookieNamesItem(String cookieNamesItem) {
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
  @javax.annotation.Nullable
  public List<String> getCookieNames() {
    return cookieNames;
  }


  public void setCookieNames(List<String> cookieNames) {
    this.cookieNames = cookieNames;
  }


  public ApplicationCacheCreateRequest adaptiveDeliveryAction(String adaptiveDeliveryAction) {
    
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
    return this;
  }

   /**
   * Get adaptiveDeliveryAction
   * @return adaptiveDeliveryAction
  **/
  @javax.annotation.Nullable
  public String getAdaptiveDeliveryAction() {
    return adaptiveDeliveryAction;
  }


  public void setAdaptiveDeliveryAction(String adaptiveDeliveryAction) {
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
  }


  public ApplicationCacheCreateRequest deviceGroup(List<Integer> deviceGroup) {
    
    this.deviceGroup = deviceGroup;
    return this;
  }

  public ApplicationCacheCreateRequest addDeviceGroupItem(Integer deviceGroupItem) {
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
  @javax.annotation.Nullable
  public List<Integer> getDeviceGroup() {
    return deviceGroup;
  }


  public void setDeviceGroup(List<Integer> deviceGroup) {
    this.deviceGroup = deviceGroup;
  }


  public ApplicationCacheCreateRequest enableCachingForPost(Boolean enableCachingForPost) {
    
    this.enableCachingForPost = enableCachingForPost;
    return this;
  }

   /**
   * Get enableCachingForPost
   * @return enableCachingForPost
  **/
  @javax.annotation.Nullable
  public Boolean getEnableCachingForPost() {
    return enableCachingForPost;
  }


  public void setEnableCachingForPost(Boolean enableCachingForPost) {
    this.enableCachingForPost = enableCachingForPost;
  }


  public ApplicationCacheCreateRequest l2CachingEnabled(Boolean l2CachingEnabled) {
    
    this.l2CachingEnabled = l2CachingEnabled;
    return this;
  }

   /**
   * Get l2CachingEnabled
   * @return l2CachingEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getL2CachingEnabled() {
    return l2CachingEnabled;
  }


  public void setL2CachingEnabled(Boolean l2CachingEnabled) {
    this.l2CachingEnabled = l2CachingEnabled;
  }


  public ApplicationCacheCreateRequest isSliceConfigurationEnabled(Boolean isSliceConfigurationEnabled) {
    
    this.isSliceConfigurationEnabled = isSliceConfigurationEnabled;
    return this;
  }

   /**
   * Get isSliceConfigurationEnabled
   * @return isSliceConfigurationEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsSliceConfigurationEnabled() {
    return isSliceConfigurationEnabled;
  }


  public void setIsSliceConfigurationEnabled(Boolean isSliceConfigurationEnabled) {
    this.isSliceConfigurationEnabled = isSliceConfigurationEnabled;
  }


  public ApplicationCacheCreateRequest isSliceEdgeCachingEnabled(Boolean isSliceEdgeCachingEnabled) {
    
    this.isSliceEdgeCachingEnabled = isSliceEdgeCachingEnabled;
    return this;
  }

   /**
   * Get isSliceEdgeCachingEnabled
   * @return isSliceEdgeCachingEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsSliceEdgeCachingEnabled() {
    return isSliceEdgeCachingEnabled;
  }


  public void setIsSliceEdgeCachingEnabled(Boolean isSliceEdgeCachingEnabled) {
    this.isSliceEdgeCachingEnabled = isSliceEdgeCachingEnabled;
  }


  public ApplicationCacheCreateRequest isSliceL2CachingEnabled(Boolean isSliceL2CachingEnabled) {
    
    this.isSliceL2CachingEnabled = isSliceL2CachingEnabled;
    return this;
  }

   /**
   * Get isSliceL2CachingEnabled
   * @return isSliceL2CachingEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsSliceL2CachingEnabled() {
    return isSliceL2CachingEnabled;
  }


  public void setIsSliceL2CachingEnabled(Boolean isSliceL2CachingEnabled) {
    this.isSliceL2CachingEnabled = isSliceL2CachingEnabled;
  }


  public ApplicationCacheCreateRequest sliceConfigurationRange(Long sliceConfigurationRange) {
    
    this.sliceConfigurationRange = sliceConfigurationRange;
    return this;
  }

   /**
   * Get sliceConfigurationRange
   * @return sliceConfigurationRange
  **/
  @javax.annotation.Nullable
  public Long getSliceConfigurationRange() {
    return sliceConfigurationRange;
  }


  public void setSliceConfigurationRange(Long sliceConfigurationRange) {
    this.sliceConfigurationRange = sliceConfigurationRange;
  }


  public ApplicationCacheCreateRequest enableCachingForOptions(Boolean enableCachingForOptions) {
    
    this.enableCachingForOptions = enableCachingForOptions;
    return this;
  }

   /**
   * Get enableCachingForOptions
   * @return enableCachingForOptions
  **/
  @javax.annotation.Nullable
  public Boolean getEnableCachingForOptions() {
    return enableCachingForOptions;
  }


  public void setEnableCachingForOptions(Boolean enableCachingForOptions) {
    this.enableCachingForOptions = enableCachingForOptions;
  }


  public ApplicationCacheCreateRequest enableStaleCache(Boolean enableStaleCache) {
    
    this.enableStaleCache = enableStaleCache;
    return this;
  }

   /**
   * Get enableStaleCache
   * @return enableStaleCache
  **/
  @javax.annotation.Nullable
  public Boolean getEnableStaleCache() {
    return enableStaleCache;
  }


  public void setEnableStaleCache(Boolean enableStaleCache) {
    this.enableStaleCache = enableStaleCache;
  }


  public ApplicationCacheCreateRequest l2Region(String l2Region) {
    
    this.l2Region = l2Region;
    return this;
  }

   /**
   * Get l2Region
   * @return l2Region
  **/
  @javax.annotation.Nullable
  public String getL2Region() {
    return l2Region;
  }


  public void setL2Region(String l2Region) {
    this.l2Region = l2Region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCacheCreateRequest applicationCacheCreateRequest = (ApplicationCacheCreateRequest) o;
    return Objects.equals(this.name, applicationCacheCreateRequest.name) &&
        Objects.equals(this.browserCacheSettings, applicationCacheCreateRequest.browserCacheSettings) &&
        Objects.equals(this.browserCacheSettingsMaximumTtl, applicationCacheCreateRequest.browserCacheSettingsMaximumTtl) &&
        Objects.equals(this.cdnCacheSettings, applicationCacheCreateRequest.cdnCacheSettings) &&
        Objects.equals(this.cdnCacheSettingsMaximumTtl, applicationCacheCreateRequest.cdnCacheSettingsMaximumTtl) &&
        Objects.equals(this.cacheByQueryString, applicationCacheCreateRequest.cacheByQueryString) &&
        Objects.equals(this.queryStringFields, applicationCacheCreateRequest.queryStringFields) &&
        Objects.equals(this.enableQueryStringSort, applicationCacheCreateRequest.enableQueryStringSort) &&
        Objects.equals(this.cacheByCookies, applicationCacheCreateRequest.cacheByCookies) &&
        Objects.equals(this.cookieNames, applicationCacheCreateRequest.cookieNames) &&
        Objects.equals(this.adaptiveDeliveryAction, applicationCacheCreateRequest.adaptiveDeliveryAction) &&
        Objects.equals(this.deviceGroup, applicationCacheCreateRequest.deviceGroup) &&
        Objects.equals(this.enableCachingForPost, applicationCacheCreateRequest.enableCachingForPost) &&
        Objects.equals(this.l2CachingEnabled, applicationCacheCreateRequest.l2CachingEnabled) &&
        Objects.equals(this.isSliceConfigurationEnabled, applicationCacheCreateRequest.isSliceConfigurationEnabled) &&
        Objects.equals(this.isSliceEdgeCachingEnabled, applicationCacheCreateRequest.isSliceEdgeCachingEnabled) &&
        Objects.equals(this.isSliceL2CachingEnabled, applicationCacheCreateRequest.isSliceL2CachingEnabled) &&
        Objects.equals(this.sliceConfigurationRange, applicationCacheCreateRequest.sliceConfigurationRange) &&
        Objects.equals(this.enableCachingForOptions, applicationCacheCreateRequest.enableCachingForOptions) &&
        Objects.equals(this.enableStaleCache, applicationCacheCreateRequest.enableStaleCache) &&
        Objects.equals(this.l2Region, applicationCacheCreateRequest.l2Region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, browserCacheSettings, browserCacheSettingsMaximumTtl, cdnCacheSettings, cdnCacheSettingsMaximumTtl, cacheByQueryString, queryStringFields, enableQueryStringSort, cacheByCookies, cookieNames, adaptiveDeliveryAction, deviceGroup, enableCachingForPost, l2CachingEnabled, isSliceConfigurationEnabled, isSliceEdgeCachingEnabled, isSliceL2CachingEnabled, sliceConfigurationRange, enableCachingForOptions, enableStaleCache, l2Region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCacheCreateRequest {\n");
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
    sb.append("    isSliceConfigurationEnabled: ").append(toIndentedString(isSliceConfigurationEnabled)).append("\n");
    sb.append("    isSliceEdgeCachingEnabled: ").append(toIndentedString(isSliceEdgeCachingEnabled)).append("\n");
    sb.append("    isSliceL2CachingEnabled: ").append(toIndentedString(isSliceL2CachingEnabled)).append("\n");
    sb.append("    sliceConfigurationRange: ").append(toIndentedString(sliceConfigurationRange)).append("\n");
    sb.append("    enableCachingForOptions: ").append(toIndentedString(enableCachingForOptions)).append("\n");
    sb.append("    enableStaleCache: ").append(toIndentedString(enableStaleCache)).append("\n");
    sb.append("    l2Region: ").append(toIndentedString(l2Region)).append("\n");
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
    openapiFields.add("is_slice_configuration_enabled");
    openapiFields.add("is_slice_edge_caching_enabled");
    openapiFields.add("is_slice_l2_caching_enabled");
    openapiFields.add("slice_configuration_range");
    openapiFields.add("enable_caching_for_options");
    openapiFields.add("enable_stale_cache");
    openapiFields.add("l2_region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApplicationCacheCreateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplicationCacheCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationCacheCreateRequest is not found in the empty JSON string", ApplicationCacheCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplicationCacheCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationCacheCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationCacheCreateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("browser_cache_settings") != null && !jsonObj.get("browser_cache_settings").isJsonNull()) && !jsonObj.get("browser_cache_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `browser_cache_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("browser_cache_settings").toString()));
      }
      if ((jsonObj.get("cdn_cache_settings") != null && !jsonObj.get("cdn_cache_settings").isJsonNull()) && !jsonObj.get("cdn_cache_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cdn_cache_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cdn_cache_settings").toString()));
      }
      if ((jsonObj.get("cache_by_query_string") != null && !jsonObj.get("cache_by_query_string").isJsonNull()) && !jsonObj.get("cache_by_query_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_by_query_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_by_query_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("query_string_fields") != null && !jsonObj.get("query_string_fields").isJsonNull() && !jsonObj.get("query_string_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_string_fields` to be an array in the JSON string but got `%s`", jsonObj.get("query_string_fields").toString()));
      }
      if ((jsonObj.get("cache_by_cookies") != null && !jsonObj.get("cache_by_cookies").isJsonNull()) && !jsonObj.get("cache_by_cookies").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_by_cookies` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_by_cookies").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cookie_names") != null && !jsonObj.get("cookie_names").isJsonNull() && !jsonObj.get("cookie_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_names` to be an array in the JSON string but got `%s`", jsonObj.get("cookie_names").toString()));
      }
      if ((jsonObj.get("adaptive_delivery_action") != null && !jsonObj.get("adaptive_delivery_action").isJsonNull()) && !jsonObj.get("adaptive_delivery_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adaptive_delivery_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adaptive_delivery_action").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("device_group") != null && !jsonObj.get("device_group").isJsonNull() && !jsonObj.get("device_group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_group` to be an array in the JSON string but got `%s`", jsonObj.get("device_group").toString()));
      }
      if ((jsonObj.get("l2_region") != null && !jsonObj.get("l2_region").isJsonNull()) && !jsonObj.get("l2_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `l2_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("l2_region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationCacheCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationCacheCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationCacheCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationCacheCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationCacheCreateRequest>() {
           @Override
           public void write(JsonWriter out, ApplicationCacheCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationCacheCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationCacheCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationCacheCreateRequest
  * @throws IOException if the JSON string is invalid with respect to ApplicationCacheCreateRequest
  */
  public static ApplicationCacheCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationCacheCreateRequest.class);
  }

 /**
  * Convert an instance of ApplicationCacheCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

