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
import java.util.Arrays;

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
 * CreateDeviceGroupsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T15:03:44.471951Z[GMT]")
public class CreateDeviceGroupsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private String addresses;

  public CreateDeviceGroupsRequest() {
  }

  public CreateDeviceGroupsRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateDeviceGroupsRequest userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nonnull
  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public CreateDeviceGroupsRequest addresses(String addresses) {
    
    this.addresses = addresses;
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  public String getAddresses() {
    return addresses;
  }


  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDeviceGroupsRequest createDeviceGroupsRequest = (CreateDeviceGroupsRequest) o;
    return Objects.equals(this.name, createDeviceGroupsRequest.name) &&
        Objects.equals(this.userAgent, createDeviceGroupsRequest.userAgent) &&
        Objects.equals(this.addresses, createDeviceGroupsRequest.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userAgent, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDeviceGroupsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
    openapiFields.add("user_agent");
    openapiFields.add("addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_agent");
    openapiRequiredFields.add("addresses");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDeviceGroupsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDeviceGroupsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDeviceGroupsRequest is not found in the empty JSON string", CreateDeviceGroupsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDeviceGroupsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDeviceGroupsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDeviceGroupsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_agent").toString()));
      }
      if (!jsonObj.get("addresses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDeviceGroupsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDeviceGroupsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDeviceGroupsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDeviceGroupsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDeviceGroupsRequest>() {
           @Override
           public void write(JsonWriter out, CreateDeviceGroupsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDeviceGroupsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDeviceGroupsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDeviceGroupsRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDeviceGroupsRequest
  */
  public static CreateDeviceGroupsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDeviceGroupsRequest.class);
  }

 /**
  * Convert an instance of CreateDeviceGroupsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

