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
import org.openapitools.client.model.OriginsResultResponse;

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
 * OriginsIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-08T19:34:26.205567Z[GMT]", comments = "Generator version: 7.7.0")
public class OriginsIdResponse {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private OriginsResultResponse results;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Long schemaVersion;

  public OriginsIdResponse() {
  }

  public OriginsIdResponse results(OriginsResultResponse results) {
    this.results = results;
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @javax.annotation.Nonnull
  public OriginsResultResponse getResults() {
    return results;
  }

  public void setResults(OriginsResultResponse results) {
    this.results = results;
  }


  public OriginsIdResponse schemaVersion(Long schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Get schemaVersion
   * @return schemaVersion
   */
  @javax.annotation.Nonnull
  public Long getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(Long schemaVersion) {
    this.schemaVersion = schemaVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginsIdResponse originsIdResponse = (OriginsIdResponse) o;
    return Objects.equals(this.results, originsIdResponse.results) &&
        Objects.equals(this.schemaVersion, originsIdResponse.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginsIdResponse {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("schema_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("schema_version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OriginsIdResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginsIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginsIdResponse is not found in the empty JSON string", OriginsIdResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginsIdResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginsIdResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginsIdResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `results`
      OriginsResultResponse.validateJsonElement(jsonObj.get("results"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginsIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginsIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginsIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginsIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginsIdResponse>() {
           @Override
           public void write(JsonWriter out, OriginsIdResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginsIdResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OriginsIdResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OriginsIdResponse
   * @throws IOException if the JSON string is invalid with respect to OriginsIdResponse
   */
  public static OriginsIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginsIdResponse.class);
  }

  /**
   * Convert an instance of OriginsIdResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

