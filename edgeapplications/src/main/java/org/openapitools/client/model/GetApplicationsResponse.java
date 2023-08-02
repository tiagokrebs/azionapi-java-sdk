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
import org.openapitools.client.model.ApplicationLinks;
import org.openapitools.client.model.ApplicationsResults;

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
 * GetApplicationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-02T19:28:54.244256Z[GMT]")
public class GetApplicationsResponse {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Long totalPages;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Long schemaVersion;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ApplicationLinks links;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<ApplicationsResults> results = new ArrayList<>();

  public GetApplicationsResponse() {
  }

  public GetApplicationsResponse count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public GetApplicationsResponse totalPages(Long totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  public Long getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  public GetApplicationsResponse schemaVersion(Long schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Get schemaVersion
   * @return schemaVersion
  **/
  @javax.annotation.Nonnull
  public Long getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Long schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public GetApplicationsResponse links(ApplicationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  public ApplicationLinks getLinks() {
    return links;
  }


  public void setLinks(ApplicationLinks links) {
    this.links = links;
  }


  public GetApplicationsResponse results(List<ApplicationsResults> results) {
    
    this.results = results;
    return this;
  }

  public GetApplicationsResponse addResultsItem(ApplicationsResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  public List<ApplicationsResults> getResults() {
    return results;
  }


  public void setResults(List<ApplicationsResults> results) {
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
    GetApplicationsResponse getApplicationsResponse = (GetApplicationsResponse) o;
    return Objects.equals(this.count, getApplicationsResponse.count) &&
        Objects.equals(this.totalPages, getApplicationsResponse.totalPages) &&
        Objects.equals(this.schemaVersion, getApplicationsResponse.schemaVersion) &&
        Objects.equals(this.links, getApplicationsResponse.links) &&
        Objects.equals(this.results, getApplicationsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, totalPages, schemaVersion, links, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetApplicationsResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("total_pages");
    openapiFields.add("schema_version");
    openapiFields.add("links");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("total_pages");
    openapiRequiredFields.add("schema_version");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("results");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetApplicationsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetApplicationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetApplicationsResponse is not found in the empty JSON string", GetApplicationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetApplicationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetApplicationsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetApplicationsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `links`
      ApplicationLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        ApplicationsResults.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetApplicationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetApplicationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetApplicationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetApplicationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetApplicationsResponse>() {
           @Override
           public void write(JsonWriter out, GetApplicationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetApplicationsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetApplicationsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetApplicationsResponse
  * @throws IOException if the JSON string is invalid with respect to GetApplicationsResponse
  */
  public static GetApplicationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetApplicationsResponse.class);
  }

 /**
  * Convert an instance of GetApplicationsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

