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
 * OriginsResultResponseAddresses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-12T18:12:04.014507Z[GMT]", comments = "Generator version: 7.7.0")
public class OriginsResultResponseAddresses {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Long weight;

  public static final String SERIALIZED_NAME_SERVER_ROLE = "server_role";
  @SerializedName(SERIALIZED_NAME_SERVER_ROLE)
  private String serverRole;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public OriginsResultResponseAddresses() {
  }

  public OriginsResultResponseAddresses address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public OriginsResultResponseAddresses weight(Long weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * minimum: 1
   * maximum: 100
   * @return weight
   */
  @javax.annotation.Nonnull
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }


  public OriginsResultResponseAddresses serverRole(String serverRole) {
    this.serverRole = serverRole;
    return this;
  }

  /**
   * Get serverRole
   * @return serverRole
   */
  @javax.annotation.Nonnull
  public String getServerRole() {
    return serverRole;
  }

  public void setServerRole(String serverRole) {
    this.serverRole = serverRole;
  }


  public OriginsResultResponseAddresses isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nonnull
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginsResultResponseAddresses originsResultResponseAddresses = (OriginsResultResponseAddresses) o;
    return Objects.equals(this.address, originsResultResponseAddresses.address) &&
        Objects.equals(this.weight, originsResultResponseAddresses.weight) &&
        Objects.equals(this.serverRole, originsResultResponseAddresses.serverRole) &&
        Objects.equals(this.isActive, originsResultResponseAddresses.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, weight, serverRole, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginsResultResponseAddresses {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    serverRole: ").append(toIndentedString(serverRole)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("weight");
    openapiFields.add("server_role");
    openapiFields.add("is_active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("weight");
    openapiRequiredFields.add("server_role");
    openapiRequiredFields.add("is_active");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginsResultResponseAddresses
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginsResultResponseAddresses.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginsResultResponseAddresses is not found in the empty JSON string", OriginsResultResponseAddresses.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginsResultResponseAddresses.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginsResultResponseAddresses` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginsResultResponseAddresses.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("server_role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginsResultResponseAddresses.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginsResultResponseAddresses' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginsResultResponseAddresses> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginsResultResponseAddresses.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginsResultResponseAddresses>() {
           @Override
           public void write(JsonWriter out, OriginsResultResponseAddresses value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginsResultResponseAddresses read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginsResultResponseAddresses given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginsResultResponseAddresses
   * @throws IOException if the JSON string is invalid with respect to OriginsResultResponseAddresses
   */
  public static OriginsResultResponseAddresses fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginsResultResponseAddresses.class);
  }

  /**
   * Convert an instance of OriginsResultResponseAddresses to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

