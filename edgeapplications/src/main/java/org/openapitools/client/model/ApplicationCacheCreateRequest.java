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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ApplicationCacheCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T17:54:30.941695Z[GMT]")
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

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_L2_CACHING_ENABLED = "l2_caching_enabled";
  @SerializedName(SERIALIZED_NAME_L2_CACHING_ENABLED)
  private Boolean l2CachingEnabled;

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


  public ApplicationCacheCreateRequest userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
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
        Objects.equals(this.userEmail, applicationCacheCreateRequest.userEmail) &&
        Objects.equals(this.l2CachingEnabled, applicationCacheCreateRequest.l2CachingEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, browserCacheSettings, browserCacheSettingsMaximumTtl, cdnCacheSettings, cdnCacheSettingsMaximumTtl, cacheByQueryString, queryStringFields, enableQueryStringSort, cacheByCookies, cookieNames, userEmail, l2CachingEnabled);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
    openapiFields.add("user_email");
    openapiFields.add("l2_caching_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationCacheCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationCacheCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationCacheCreateRequest is not found in the empty JSON string", ApplicationCacheCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationCacheCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationCacheCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationCacheCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
      if (jsonObj.get("query_string_fields") != null && !jsonObj.get("query_string_fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_string_fields` to be an array in the JSON string but got `%s`", jsonObj.get("query_string_fields").toString()));
      }
      if ((jsonObj.get("cache_by_cookies") != null && !jsonObj.get("cache_by_cookies").isJsonNull()) && !jsonObj.get("cache_by_cookies").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_by_cookies` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_by_cookies").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cookie_names") != null && !jsonObj.get("cookie_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_names` to be an array in the JSON string but got `%s`", jsonObj.get("cookie_names").toString()));
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

