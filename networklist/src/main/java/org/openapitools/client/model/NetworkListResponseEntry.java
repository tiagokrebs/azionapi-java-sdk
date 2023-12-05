/*
 * Network Lists API
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
 * NetworkListResponseEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T14:32:28.421334Z[GMT]")
public class NetworkListResponseEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_LAST_EDITOR = "last_editor";
  @SerializedName(SERIALIZED_NAME_LAST_EDITOR)
  private String lastEditor;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "last_modified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_LIST_TYPE = "list_type";
  @SerializedName(SERIALIZED_NAME_LIST_TYPE)
  private String listType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ITEMS_VALUES = "items_values";
  @SerializedName(SERIALIZED_NAME_ITEMS_VALUES)
  private List<String> itemsValues;

  public NetworkListResponseEntry() {
  }

  public NetworkListResponseEntry id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public NetworkListResponseEntry lastEditor(String lastEditor) {
    
    this.lastEditor = lastEditor;
    return this;
  }

   /**
   * Get lastEditor
   * @return lastEditor
  **/
  @javax.annotation.Nullable
  public String getLastEditor() {
    return lastEditor;
  }


  public void setLastEditor(String lastEditor) {
    this.lastEditor = lastEditor;
  }


  public NetworkListResponseEntry lastModified(String lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  public String getLastModified() {
    return lastModified;
  }


  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public NetworkListResponseEntry listType(String listType) {
    
    this.listType = listType;
    return this;
  }

   /**
   * Get listType
   * @return listType
  **/
  @javax.annotation.Nullable
  public String getListType() {
    return listType;
  }


  public void setListType(String listType) {
    this.listType = listType;
  }


  public NetworkListResponseEntry name(String name) {
    
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


  public NetworkListResponseEntry itemsValues(List<String> itemsValues) {
    
    this.itemsValues = itemsValues;
    return this;
  }

  public NetworkListResponseEntry addItemsValuesItem(String itemsValuesItem) {
    if (this.itemsValues == null) {
      this.itemsValues = new ArrayList<>();
    }
    this.itemsValues.add(itemsValuesItem);
    return this;
  }

   /**
   * Get itemsValues
   * @return itemsValues
  **/
  @javax.annotation.Nullable
  public List<String> getItemsValues() {
    return itemsValues;
  }


  public void setItemsValues(List<String> itemsValues) {
    this.itemsValues = itemsValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkListResponseEntry networkListResponseEntry = (NetworkListResponseEntry) o;
    return Objects.equals(this.id, networkListResponseEntry.id) &&
        Objects.equals(this.lastEditor, networkListResponseEntry.lastEditor) &&
        Objects.equals(this.lastModified, networkListResponseEntry.lastModified) &&
        Objects.equals(this.listType, networkListResponseEntry.listType) &&
        Objects.equals(this.name, networkListResponseEntry.name) &&
        Objects.equals(this.itemsValues, networkListResponseEntry.itemsValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastEditor, lastModified, listType, name, itemsValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkListResponseEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEditor: ").append(toIndentedString(lastEditor)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemsValues: ").append(toIndentedString(itemsValues)).append("\n");
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
    openapiFields.add("last_editor");
    openapiFields.add("last_modified");
    openapiFields.add("list_type");
    openapiFields.add("name");
    openapiFields.add("items_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetworkListResponseEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkListResponseEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkListResponseEntry is not found in the empty JSON string", NetworkListResponseEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkListResponseEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkListResponseEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("last_editor") != null && !jsonObj.get("last_editor").isJsonNull()) && !jsonObj.get("last_editor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_editor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_editor").toString()));
      }
      if ((jsonObj.get("last_modified") != null && !jsonObj.get("last_modified").isJsonNull()) && !jsonObj.get("last_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_modified").toString()));
      }
      if ((jsonObj.get("list_type") != null && !jsonObj.get("list_type").isJsonNull()) && !jsonObj.get("list_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("items_values") != null && !jsonObj.get("items_values").isJsonNull() && !jsonObj.get("items_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items_values` to be an array in the JSON string but got `%s`", jsonObj.get("items_values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkListResponseEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkListResponseEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkListResponseEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkListResponseEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkListResponseEntry>() {
           @Override
           public void write(JsonWriter out, NetworkListResponseEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkListResponseEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkListResponseEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkListResponseEntry
  * @throws IOException if the JSON string is invalid with respect to NetworkListResponseEntry
  */
  public static NetworkListResponseEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkListResponseEntry.class);
  }

 /**
  * Convert an instance of NetworkListResponseEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

