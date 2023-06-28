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
import org.openapitools.client.model.CreateOriginsRequestAddresses;

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
 * CreateOriginsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T18:27:45.238194Z[GMT]")
public class CreateOriginsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGIN_TYPE = "origin_type";
  @SerializedName(SERIALIZED_NAME_ORIGIN_TYPE)
  private String originType;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<CreateOriginsRequestAddresses> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY = "origin_protocol_policy";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY)
  private String originProtocolPolicy;

  public static final String SERIALIZED_NAME_HOST_HEADER = "host_header";
  @SerializedName(SERIALIZED_NAME_HOST_HEADER)
  private String hostHeader;

  public static final String SERIALIZED_NAME_ORIGIN_PATH = "origin_path";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PATH)
  private String originPath;

  public static final String SERIALIZED_NAME_HMAC_AUTHENTICATION = "hmac_authentication";
  @SerializedName(SERIALIZED_NAME_HMAC_AUTHENTICATION)
  private Boolean hmacAuthentication;

  public static final String SERIALIZED_NAME_HMAC_REGION_NAME = "hmac_region_name";
  @SerializedName(SERIALIZED_NAME_HMAC_REGION_NAME)
  private String hmacRegionName;

  public static final String SERIALIZED_NAME_HMAC_ACCESS_KEY = "hmac_access_key";
  @SerializedName(SERIALIZED_NAME_HMAC_ACCESS_KEY)
  private String hmacAccessKey;

  public static final String SERIALIZED_NAME_HMAC_SECRET_KEY = "hmac_secret_key";
  @SerializedName(SERIALIZED_NAME_HMAC_SECRET_KEY)
  private String hmacSecretKey;

  public CreateOriginsRequest() {
  }

  public CreateOriginsRequest name(String name) {
    
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


  public CreateOriginsRequest originType(String originType) {
    
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @javax.annotation.Nullable
  public String getOriginType() {
    return originType;
  }


  public void setOriginType(String originType) {
    this.originType = originType;
  }


  public CreateOriginsRequest addresses(List<CreateOriginsRequestAddresses> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CreateOriginsRequest addAddressesItem(CreateOriginsRequestAddresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  public List<CreateOriginsRequestAddresses> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<CreateOriginsRequestAddresses> addresses) {
    this.addresses = addresses;
  }


  public CreateOriginsRequest originProtocolPolicy(String originProtocolPolicy) {
    
    this.originProtocolPolicy = originProtocolPolicy;
    return this;
  }

   /**
   * Get originProtocolPolicy
   * @return originProtocolPolicy
  **/
  @javax.annotation.Nullable
  public String getOriginProtocolPolicy() {
    return originProtocolPolicy;
  }


  public void setOriginProtocolPolicy(String originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
  }


  public CreateOriginsRequest hostHeader(String hostHeader) {
    
    this.hostHeader = hostHeader;
    return this;
  }

   /**
   * Get hostHeader
   * @return hostHeader
  **/
  @javax.annotation.Nonnull
  public String getHostHeader() {
    return hostHeader;
  }


  public void setHostHeader(String hostHeader) {
    this.hostHeader = hostHeader;
  }


  public CreateOriginsRequest originPath(String originPath) {
    
    this.originPath = originPath;
    return this;
  }

   /**
   * Get originPath
   * @return originPath
  **/
  @javax.annotation.Nullable
  public String getOriginPath() {
    return originPath;
  }


  public void setOriginPath(String originPath) {
    this.originPath = originPath;
  }


  public CreateOriginsRequest hmacAuthentication(Boolean hmacAuthentication) {
    
    this.hmacAuthentication = hmacAuthentication;
    return this;
  }

   /**
   * Get hmacAuthentication
   * @return hmacAuthentication
  **/
  @javax.annotation.Nullable
  public Boolean getHmacAuthentication() {
    return hmacAuthentication;
  }


  public void setHmacAuthentication(Boolean hmacAuthentication) {
    this.hmacAuthentication = hmacAuthentication;
  }


  public CreateOriginsRequest hmacRegionName(String hmacRegionName) {
    
    this.hmacRegionName = hmacRegionName;
    return this;
  }

   /**
   * Get hmacRegionName
   * @return hmacRegionName
  **/
  @javax.annotation.Nullable
  public String getHmacRegionName() {
    return hmacRegionName;
  }


  public void setHmacRegionName(String hmacRegionName) {
    this.hmacRegionName = hmacRegionName;
  }


  public CreateOriginsRequest hmacAccessKey(String hmacAccessKey) {
    
    this.hmacAccessKey = hmacAccessKey;
    return this;
  }

   /**
   * Get hmacAccessKey
   * @return hmacAccessKey
  **/
  @javax.annotation.Nullable
  public String getHmacAccessKey() {
    return hmacAccessKey;
  }


  public void setHmacAccessKey(String hmacAccessKey) {
    this.hmacAccessKey = hmacAccessKey;
  }


  public CreateOriginsRequest hmacSecretKey(String hmacSecretKey) {
    
    this.hmacSecretKey = hmacSecretKey;
    return this;
  }

   /**
   * Get hmacSecretKey
   * @return hmacSecretKey
  **/
  @javax.annotation.Nullable
  public String getHmacSecretKey() {
    return hmacSecretKey;
  }


  public void setHmacSecretKey(String hmacSecretKey) {
    this.hmacSecretKey = hmacSecretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOriginsRequest createOriginsRequest = (CreateOriginsRequest) o;
    return Objects.equals(this.name, createOriginsRequest.name) &&
        Objects.equals(this.originType, createOriginsRequest.originType) &&
        Objects.equals(this.addresses, createOriginsRequest.addresses) &&
        Objects.equals(this.originProtocolPolicy, createOriginsRequest.originProtocolPolicy) &&
        Objects.equals(this.hostHeader, createOriginsRequest.hostHeader) &&
        Objects.equals(this.originPath, createOriginsRequest.originPath) &&
        Objects.equals(this.hmacAuthentication, createOriginsRequest.hmacAuthentication) &&
        Objects.equals(this.hmacRegionName, createOriginsRequest.hmacRegionName) &&
        Objects.equals(this.hmacAccessKey, createOriginsRequest.hmacAccessKey) &&
        Objects.equals(this.hmacSecretKey, createOriginsRequest.hmacSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originType, addresses, originProtocolPolicy, hostHeader, originPath, hmacAuthentication, hmacRegionName, hmacAccessKey, hmacSecretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOriginsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    originProtocolPolicy: ").append(toIndentedString(originProtocolPolicy)).append("\n");
    sb.append("    hostHeader: ").append(toIndentedString(hostHeader)).append("\n");
    sb.append("    originPath: ").append(toIndentedString(originPath)).append("\n");
    sb.append("    hmacAuthentication: ").append(toIndentedString(hmacAuthentication)).append("\n");
    sb.append("    hmacRegionName: ").append(toIndentedString(hmacRegionName)).append("\n");
    sb.append("    hmacAccessKey: ").append(toIndentedString(hmacAccessKey)).append("\n");
    sb.append("    hmacSecretKey: ").append(toIndentedString(hmacSecretKey)).append("\n");
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
    openapiFields.add("origin_type");
    openapiFields.add("addresses");
    openapiFields.add("origin_protocol_policy");
    openapiFields.add("host_header");
    openapiFields.add("origin_path");
    openapiFields.add("hmac_authentication");
    openapiFields.add("hmac_region_name");
    openapiFields.add("hmac_access_key");
    openapiFields.add("hmac_secret_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("host_header");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateOriginsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateOriginsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateOriginsRequest is not found in the empty JSON string", CreateOriginsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateOriginsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateOriginsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOriginsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("origin_type") != null && !jsonObj.get("origin_type").isJsonNull()) && !jsonObj.get("origin_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        CreateOriginsRequestAddresses.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("origin_protocol_policy") != null && !jsonObj.get("origin_protocol_policy").isJsonNull()) && !jsonObj.get("origin_protocol_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_protocol_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_protocol_policy").toString()));
      }
      if (!jsonObj.get("host_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_header").toString()));
      }
      if ((jsonObj.get("origin_path") != null && !jsonObj.get("origin_path").isJsonNull()) && !jsonObj.get("origin_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_path").toString()));
      }
      if ((jsonObj.get("hmac_region_name") != null && !jsonObj.get("hmac_region_name").isJsonNull()) && !jsonObj.get("hmac_region_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_region_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_region_name").toString()));
      }
      if ((jsonObj.get("hmac_access_key") != null && !jsonObj.get("hmac_access_key").isJsonNull()) && !jsonObj.get("hmac_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_access_key").toString()));
      }
      if ((jsonObj.get("hmac_secret_key") != null && !jsonObj.get("hmac_secret_key").isJsonNull()) && !jsonObj.get("hmac_secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_secret_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOriginsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOriginsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOriginsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOriginsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOriginsRequest>() {
           @Override
           public void write(JsonWriter out, CreateOriginsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOriginsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOriginsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOriginsRequest
  * @throws IOException if the JSON string is invalid with respect to CreateOriginsRequest
  */
  public static CreateOriginsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOriginsRequest.class);
  }

 /**
  * Convert an instance of CreateOriginsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

