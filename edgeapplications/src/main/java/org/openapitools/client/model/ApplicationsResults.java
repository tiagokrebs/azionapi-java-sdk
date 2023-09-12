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
import org.openapitools.client.model.ApplicationOrigins;

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
 * ApplicationsResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T14:42:28.109450Z[GMT]")
public class ApplicationsResults {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEBUG_RULES = "debug_rules";
  @SerializedName(SERIALIZED_NAME_DEBUG_RULES)
  private Boolean debugRules;

  public static final String SERIALIZED_NAME_LAST_EDITOR = "last_editor";
  @SerializedName(SERIALIZED_NAME_LAST_EDITOR)
  private String lastEditor;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ORIGINS = "origins";
  @SerializedName(SERIALIZED_NAME_ORIGINS)
  private List<ApplicationOrigins> origins = new ArrayList<>();

  public ApplicationsResults() {
  }

  public ApplicationsResults id(Long id) {
    
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


  public ApplicationsResults name(String name) {
    
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


  public ApplicationsResults debugRules(Boolean debugRules) {
    
    this.debugRules = debugRules;
    return this;
  }

   /**
   * Get debugRules
   * @return debugRules
  **/
  @javax.annotation.Nonnull
  public Boolean getDebugRules() {
    return debugRules;
  }


  public void setDebugRules(Boolean debugRules) {
    this.debugRules = debugRules;
  }


  public ApplicationsResults lastEditor(String lastEditor) {
    
    this.lastEditor = lastEditor;
    return this;
  }

   /**
   * Get lastEditor
   * @return lastEditor
  **/
  @javax.annotation.Nonnull
  public String getLastEditor() {
    return lastEditor;
  }


  public void setLastEditor(String lastEditor) {
    this.lastEditor = lastEditor;
  }


  public ApplicationsResults lastModified(String lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nonnull
  public String getLastModified() {
    return lastModified;
  }


  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public ApplicationsResults active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ApplicationsResults origins(List<ApplicationOrigins> origins) {
    
    this.origins = origins;
    return this;
  }

  public ApplicationsResults addOriginsItem(ApplicationOrigins originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<>();
    }
    this.origins.add(originsItem);
    return this;
  }

   /**
   * Get origins
   * @return origins
  **/
  @javax.annotation.Nonnull
  public List<ApplicationOrigins> getOrigins() {
    return origins;
  }


  public void setOrigins(List<ApplicationOrigins> origins) {
    this.origins = origins;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsResults applicationsResults = (ApplicationsResults) o;
    return Objects.equals(this.id, applicationsResults.id) &&
        Objects.equals(this.name, applicationsResults.name) &&
        Objects.equals(this.debugRules, applicationsResults.debugRules) &&
        Objects.equals(this.lastEditor, applicationsResults.lastEditor) &&
        Objects.equals(this.lastModified, applicationsResults.lastModified) &&
        Objects.equals(this.active, applicationsResults.active) &&
        Objects.equals(this.origins, applicationsResults.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, debugRules, lastEditor, lastModified, active, origins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    debugRules: ").append(toIndentedString(debugRules)).append("\n");
    sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
    openapiFields.add("debug_rules");
    openapiFields.add("last_editor");
    openapiFields.add("last_modified");
    openapiFields.add("active");
    openapiFields.add("origins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("debug_rules");
    openapiRequiredFields.add("last_editor");
    openapiRequiredFields.add("last_modified");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("origins");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApplicationsResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplicationsResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationsResults is not found in the empty JSON string", ApplicationsResults.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationsResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationsResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationsResults.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("last_editor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_editor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_editor").toString()));
      }
      if (!jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `origins` to be an array in the JSON string but got `%s`", jsonObj.get("origins").toString()));
      }

      JsonArray jsonArrayorigins = jsonObj.getAsJsonArray("origins");
      // validate the required field `origins` (array)
      for (int i = 0; i < jsonArrayorigins.size(); i++) {
        ApplicationOrigins.validateJsonElement(jsonArrayorigins.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationsResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationsResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationsResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationsResults.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationsResults>() {
           @Override
           public void write(JsonWriter out, ApplicationsResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationsResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationsResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationsResults
  * @throws IOException if the JSON string is invalid with respect to ApplicationsResults
  */
  public static ApplicationsResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationsResults.class);
  }

 /**
  * Convert an instance of ApplicationsResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

