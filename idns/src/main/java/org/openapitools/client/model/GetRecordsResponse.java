/*
 * Intelligent DNS API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import org.openapitools.client.model.GetRecordsResponseResults;
import org.openapitools.client.model.GetZonesResponseLinks;

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
 * Object returned by get zone record
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T18:57:15.513698Z[GMT]")
public class GetRecordsResponse {
  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Integer schemaVersion;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private GetZonesResponseLinks links;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private GetRecordsResponseResults results;

  public GetRecordsResponse() {
  }

  public GetRecordsResponse schemaVersion(Integer schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The schema version
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  public Integer getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public GetRecordsResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of records
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public GetRecordsResponse totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * The total pages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public GetRecordsResponse links(GetZonesResponseLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public GetZonesResponseLinks getLinks() {
    return links;
  }


  public void setLinks(GetZonesResponseLinks links) {
    this.links = links;
  }


  public GetRecordsResponse results(GetRecordsResponseResults results) {
    
    this.results = results;
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public GetRecordsResponseResults getResults() {
    return results;
  }


  public void setResults(GetRecordsResponseResults results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecordsResponse getRecordsResponse = (GetRecordsResponse) o;
    return Objects.equals(this.schemaVersion, getRecordsResponse.schemaVersion) &&
        Objects.equals(this.count, getRecordsResponse.count) &&
        Objects.equals(this.totalPages, getRecordsResponse.totalPages) &&
        Objects.equals(this.links, getRecordsResponse.links) &&
        Objects.equals(this.results, getRecordsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaVersion, count, totalPages, links, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecordsResponse {\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("schema_version");
    openapiFields.add("count");
    openapiFields.add("total_pages");
    openapiFields.add("links");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetRecordsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetRecordsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecordsResponse is not found in the empty JSON string", GetRecordsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetRecordsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecordsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        GetZonesResponseLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
      }
      // validate the optional field `results`
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        GetRecordsResponseResults.validateJsonObject(jsonObj.getAsJsonObject("results"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecordsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecordsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecordsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecordsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecordsResponse>() {
           @Override
           public void write(JsonWriter out, GetRecordsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecordsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetRecordsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetRecordsResponse
  * @throws IOException if the JSON string is invalid with respect to GetRecordsResponse
  */
  public static GetRecordsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecordsResponse.class);
  }

 /**
  * Convert an instance of GetRecordsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

