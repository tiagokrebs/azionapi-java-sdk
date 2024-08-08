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
 * ApplicationCacheResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T19:34:26.205567Z[GMT]", comments = "Generator version: 7.7.0")
public class ApplicationCacheResults {
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
  private List<Integer> deviceGroup = new ArrayList<>();

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

  public ApplicationCacheResults() {
  }

  public ApplicationCacheResults id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public ApplicationCacheResults name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ApplicationCacheResults browserCacheSettings(String browserCacheSettings) {
    this.browserCacheSettings = browserCacheSettings;
    return this;
  }

  /**
   * Get browserCacheSettings
   * @return browserCacheSettings
   */
  @javax.annotation.Nonnull
  public String getBrowserCacheSettings() {
    return browserCacheSettings;
  }

  public void setBrowserCacheSettings(String browserCacheSettings) {
    this.browserCacheSettings = browserCacheSettings;
  }


  public ApplicationCacheResults browserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
    return this;
  }

  /**
   * Get browserCacheSettingsMaximumTtl
   * @return browserCacheSettingsMaximumTtl
   */
  @javax.annotation.Nonnull
  public Long getBrowserCacheSettingsMaximumTtl() {
    return browserCacheSettingsMaximumTtl;
  }

  public void setBrowserCacheSettingsMaximumTtl(Long browserCacheSettingsMaximumTtl) {
    this.browserCacheSettingsMaximumTtl = browserCacheSettingsMaximumTtl;
  }


  public ApplicationCacheResults cdnCacheSettings(String cdnCacheSettings) {
    this.cdnCacheSettings = cdnCacheSettings;
    return this;
  }

  /**
   * Get cdnCacheSettings
   * @return cdnCacheSettings
   */
  @javax.annotation.Nonnull
  public String getCdnCacheSettings() {
    return cdnCacheSettings;
  }

  public void setCdnCacheSettings(String cdnCacheSettings) {
    this.cdnCacheSettings = cdnCacheSettings;
  }


  public ApplicationCacheResults cdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
    return this;
  }

  /**
   * Get cdnCacheSettingsMaximumTtl
   * @return cdnCacheSettingsMaximumTtl
   */
  @javax.annotation.Nonnull
  public Long getCdnCacheSettingsMaximumTtl() {
    return cdnCacheSettingsMaximumTtl;
  }

  public void setCdnCacheSettingsMaximumTtl(Long cdnCacheSettingsMaximumTtl) {
    this.cdnCacheSettingsMaximumTtl = cdnCacheSettingsMaximumTtl;
  }


  public ApplicationCacheResults cacheByQueryString(String cacheByQueryString) {
    this.cacheByQueryString = cacheByQueryString;
    return this;
  }

  /**
   * Get cacheByQueryString
   * @return cacheByQueryString
   */
  @javax.annotation.Nonnull
  public String getCacheByQueryString() {
    return cacheByQueryString;
  }

  public void setCacheByQueryString(String cacheByQueryString) {
    this.cacheByQueryString = cacheByQueryString;
  }


  public ApplicationCacheResults queryStringFields(List<String> queryStringFields) {
    this.queryStringFields = queryStringFields;
    return this;
  }

  public ApplicationCacheResults addQueryStringFieldsItem(String queryStringFieldsItem) {
    if (this.queryStringFields == null) {
      this.queryStringFields = new ArrayList<>();
    }
    this.queryStringFields.add(queryStringFieldsItem);
    return this;
  }

  /**
   * Get queryStringFields
   * @return queryStringFields
   */
  @javax.annotation.Nullable
  public List<String> getQueryStringFields() {
    return queryStringFields;
  }

  public void setQueryStringFields(List<String> queryStringFields) {
    this.queryStringFields = queryStringFields;
  }


  public ApplicationCacheResults enableQueryStringSort(Boolean enableQueryStringSort) {
    this.enableQueryStringSort = enableQueryStringSort;
    return this;
  }

  /**
   * Get enableQueryStringSort
   * @return enableQueryStringSort
   */
  @javax.annotation.Nonnull
  public Boolean getEnableQueryStringSort() {
    return enableQueryStringSort;
  }

  public void setEnableQueryStringSort(Boolean enableQueryStringSort) {
    this.enableQueryStringSort = enableQueryStringSort;
  }


  public ApplicationCacheResults cacheByCookies(String cacheByCookies) {
    this.cacheByCookies = cacheByCookies;
    return this;
  }

  /**
   * Get cacheByCookies
   * @return cacheByCookies
   */
  @javax.annotation.Nonnull
  public String getCacheByCookies() {
    return cacheByCookies;
  }

  public void setCacheByCookies(String cacheByCookies) {
    this.cacheByCookies = cacheByCookies;
  }


  public ApplicationCacheResults cookieNames(List<String> cookieNames) {
    this.cookieNames = cookieNames;
    return this;
  }

  public ApplicationCacheResults addCookieNamesItem(String cookieNamesItem) {
    if (this.cookieNames == null) {
      this.cookieNames = new ArrayList<>();
    }
    this.cookieNames.add(cookieNamesItem);
    return this;
  }

  /**
   * Get cookieNames
   * @return cookieNames
   */
  @javax.annotation.Nullable
  public List<String> getCookieNames() {
    return cookieNames;
  }

  public void setCookieNames(List<String> cookieNames) {
    this.cookieNames = cookieNames;
  }


  public ApplicationCacheResults adaptiveDeliveryAction(String adaptiveDeliveryAction) {
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
    return this;
  }

  /**
   * Get adaptiveDeliveryAction
   * @return adaptiveDeliveryAction
   */
  @javax.annotation.Nonnull
  public String getAdaptiveDeliveryAction() {
    return adaptiveDeliveryAction;
  }

  public void setAdaptiveDeliveryAction(String adaptiveDeliveryAction) {
    this.adaptiveDeliveryAction = adaptiveDeliveryAction;
  }


  public ApplicationCacheResults deviceGroup(List<Integer> deviceGroup) {
    this.deviceGroup = deviceGroup;
    return this;
  }

  public ApplicationCacheResults addDeviceGroupItem(Integer deviceGroupItem) {
    if (this.deviceGroup == null) {
      this.deviceGroup = new ArrayList<>();
    }
    this.deviceGroup.add(deviceGroupItem);
    return this;
  }

  /**
   * Get deviceGroup
   * @return deviceGroup
   */
  @javax.annotation.Nonnull
  public List<Integer> getDeviceGroup() {
    return deviceGroup;
  }

  public void setDeviceGroup(List<Integer> deviceGroup) {
    this.deviceGroup = deviceGroup;
  }


  public ApplicationCacheResults enableCachingForPost(Boolean enableCachingForPost) {
    this.enableCachingForPost = enableCachingForPost;
    return this;
  }

  /**
   * Get enableCachingForPost
   * @return enableCachingForPost
   */
  @javax.annotation.Nonnull
  public Boolean getEnableCachingForPost() {
    return enableCachingForPost;
  }

  public void setEnableCachingForPost(Boolean enableCachingForPost) {
    this.enableCachingForPost = enableCachingForPost;
  }


  public ApplicationCacheResults l2CachingEnabled(Boolean l2CachingEnabled) {
    this.l2CachingEnabled = l2CachingEnabled;
    return this;
  }

  /**
   * Get l2CachingEnabled
   * @return l2CachingEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getL2CachingEnabled() {
    return l2CachingEnabled;
  }

  public void setL2CachingEnabled(Boolean l2CachingEnabled) {
    this.l2CachingEnabled = l2CachingEnabled;
  }


  public ApplicationCacheResults isSliceConfigurationEnabled(Boolean isSliceConfigurationEnabled) {
    this.isSliceConfigurationEnabled = isSliceConfigurationEnabled;
    return this;
  }

  /**
   * Get isSliceConfigurationEnabled
   * @return isSliceConfigurationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsSliceConfigurationEnabled() {
    return isSliceConfigurationEnabled;
  }

  public void setIsSliceConfigurationEnabled(Boolean isSliceConfigurationEnabled) {
    this.isSliceConfigurationEnabled = isSliceConfigurationEnabled;
  }


  public ApplicationCacheResults isSliceEdgeCachingEnabled(Boolean isSliceEdgeCachingEnabled) {
    this.isSliceEdgeCachingEnabled = isSliceEdgeCachingEnabled;
    return this;
  }

  /**
   * Get isSliceEdgeCachingEnabled
   * @return isSliceEdgeCachingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsSliceEdgeCachingEnabled() {
    return isSliceEdgeCachingEnabled;
  }

  public void setIsSliceEdgeCachingEnabled(Boolean isSliceEdgeCachingEnabled) {
    this.isSliceEdgeCachingEnabled = isSliceEdgeCachingEnabled;
  }


  public ApplicationCacheResults isSliceL2CachingEnabled(Boolean isSliceL2CachingEnabled) {
    this.isSliceL2CachingEnabled = isSliceL2CachingEnabled;
    return this;
  }

  /**
   * Get isSliceL2CachingEnabled
   * @return isSliceL2CachingEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsSliceL2CachingEnabled() {
    return isSliceL2CachingEnabled;
  }

  public void setIsSliceL2CachingEnabled(Boolean isSliceL2CachingEnabled) {
    this.isSliceL2CachingEnabled = isSliceL2CachingEnabled;
  }


  public ApplicationCacheResults sliceConfigurationRange(Long sliceConfigurationRange) {
    this.sliceConfigurationRange = sliceConfigurationRange;
    return this;
  }

  /**
   * Get sliceConfigurationRange
   * @return sliceConfigurationRange
   */
  @javax.annotation.Nullable
  public Long getSliceConfigurationRange() {
    return sliceConfigurationRange;
  }

  public void setSliceConfigurationRange(Long sliceConfigurationRange) {
    this.sliceConfigurationRange = sliceConfigurationRange;
  }


  public ApplicationCacheResults enableCachingForOptions(Boolean enableCachingForOptions) {
    this.enableCachingForOptions = enableCachingForOptions;
    return this;
  }

  /**
   * Get enableCachingForOptions
   * @return enableCachingForOptions
   */
  @javax.annotation.Nonnull
  public Boolean getEnableCachingForOptions() {
    return enableCachingForOptions;
  }

  public void setEnableCachingForOptions(Boolean enableCachingForOptions) {
    this.enableCachingForOptions = enableCachingForOptions;
  }


  public ApplicationCacheResults enableStaleCache(Boolean enableStaleCache) {
    this.enableStaleCache = enableStaleCache;
    return this;
  }

  /**
   * Get enableStaleCache
   * @return enableStaleCache
   */
  @javax.annotation.Nonnull
  public Boolean getEnableStaleCache() {
    return enableStaleCache;
  }

  public void setEnableStaleCache(Boolean enableStaleCache) {
    this.enableStaleCache = enableStaleCache;
  }


  public ApplicationCacheResults l2Region(String l2Region) {
    this.l2Region = l2Region;
    return this;
  }

  /**
   * Get l2Region
   * @return l2Region
   */
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
    ApplicationCacheResults applicationCacheResults = (ApplicationCacheResults) o;
    return Objects.equals(this.id, applicationCacheResults.id) &&
        Objects.equals(this.name, applicationCacheResults.name) &&
        Objects.equals(this.browserCacheSettings, applicationCacheResults.browserCacheSettings) &&
        Objects.equals(this.browserCacheSettingsMaximumTtl, applicationCacheResults.browserCacheSettingsMaximumTtl) &&
        Objects.equals(this.cdnCacheSettings, applicationCacheResults.cdnCacheSettings) &&
        Objects.equals(this.cdnCacheSettingsMaximumTtl, applicationCacheResults.cdnCacheSettingsMaximumTtl) &&
        Objects.equals(this.cacheByQueryString, applicationCacheResults.cacheByQueryString) &&
        Objects.equals(this.queryStringFields, applicationCacheResults.queryStringFields) &&
        Objects.equals(this.enableQueryStringSort, applicationCacheResults.enableQueryStringSort) &&
        Objects.equals(this.cacheByCookies, applicationCacheResults.cacheByCookies) &&
        Objects.equals(this.cookieNames, applicationCacheResults.cookieNames) &&
        Objects.equals(this.adaptiveDeliveryAction, applicationCacheResults.adaptiveDeliveryAction) &&
        Objects.equals(this.deviceGroup, applicationCacheResults.deviceGroup) &&
        Objects.equals(this.enableCachingForPost, applicationCacheResults.enableCachingForPost) &&
        Objects.equals(this.l2CachingEnabled, applicationCacheResults.l2CachingEnabled) &&
        Objects.equals(this.isSliceConfigurationEnabled, applicationCacheResults.isSliceConfigurationEnabled) &&
        Objects.equals(this.isSliceEdgeCachingEnabled, applicationCacheResults.isSliceEdgeCachingEnabled) &&
        Objects.equals(this.isSliceL2CachingEnabled, applicationCacheResults.isSliceL2CachingEnabled) &&
        Objects.equals(this.sliceConfigurationRange, applicationCacheResults.sliceConfigurationRange) &&
        Objects.equals(this.enableCachingForOptions, applicationCacheResults.enableCachingForOptions) &&
        Objects.equals(this.enableStaleCache, applicationCacheResults.enableStaleCache) &&
        Objects.equals(this.l2Region, applicationCacheResults.l2Region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, browserCacheSettings, browserCacheSettingsMaximumTtl, cdnCacheSettings, cdnCacheSettingsMaximumTtl, cacheByQueryString, queryStringFields, enableQueryStringSort, cacheByCookies, cookieNames, adaptiveDeliveryAction, deviceGroup, enableCachingForPost, l2CachingEnabled, isSliceConfigurationEnabled, isSliceEdgeCachingEnabled, isSliceL2CachingEnabled, sliceConfigurationRange, enableCachingForOptions, enableStaleCache, l2Region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCacheResults {\n");
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
    openapiFields.add("is_slice_configuration_enabled");
    openapiFields.add("is_slice_edge_caching_enabled");
    openapiFields.add("is_slice_l2_caching_enabled");
    openapiFields.add("slice_configuration_range");
    openapiFields.add("enable_caching_for_options");
    openapiFields.add("enable_stale_cache");
    openapiFields.add("l2_region");

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
    openapiRequiredFields.add("enable_caching_for_options");
    openapiRequiredFields.add("enable_stale_cache");
    openapiRequiredFields.add("l2_region");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApplicationCacheResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplicationCacheResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationCacheResults is not found in the empty JSON string", ApplicationCacheResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplicationCacheResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationCacheResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationCacheResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("l2_region") != null && !jsonObj.get("l2_region").isJsonNull()) && !jsonObj.get("l2_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `l2_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("l2_region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationCacheResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationCacheResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationCacheResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationCacheResults.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationCacheResults>() {
           @Override
           public void write(JsonWriter out, ApplicationCacheResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationCacheResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApplicationCacheResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplicationCacheResults
   * @throws IOException if the JSON string is invalid with respect to ApplicationCacheResults
   */
  public static ApplicationCacheResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationCacheResults.class);
  }

  /**
   * Convert an instance of ApplicationCacheResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

