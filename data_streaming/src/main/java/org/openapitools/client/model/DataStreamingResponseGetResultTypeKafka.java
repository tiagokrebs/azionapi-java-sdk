/*
 * Data Streaming - OpenAPI
 * The Data Streaming API allows you to manage your existing data streamings and templates. Data Streaming allows you to feed your stream processing, SIEM, and big data platforms with the event logs from your applications on Azion in real time. 
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
import org.openapitools.client.model.DataStreamingEndpointTypeKafka;

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
 * DataStreamingResponseGetResultTypeKafka
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-22T12:30:18.138783Z[GMT]")
public class DataStreamingResponseGetResultTypeKafka {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "data_source";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private String dataSource;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private DataStreamingEndpointTypeKafka endpoint;

  public static final String SERIALIZED_NAME_ALL_DOMAINS = "all_domains";
  @SerializedName(SERIALIZED_NAME_ALL_DOMAINS)
  private Boolean allDomains;

  public DataStreamingResponseGetResultTypeKafka() {
  }

  public DataStreamingResponseGetResultTypeKafka id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DataStreamingResponseGetResultTypeKafka name(String name) {
    
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


  public DataStreamingResponseGetResultTypeKafka templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public DataStreamingResponseGetResultTypeKafka dataSource(String dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  public String getDataSource() {
    return dataSource;
  }


  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }


  public DataStreamingResponseGetResultTypeKafka active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public DataStreamingResponseGetResultTypeKafka endpoint(DataStreamingEndpointTypeKafka endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  public DataStreamingEndpointTypeKafka getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(DataStreamingEndpointTypeKafka endpoint) {
    this.endpoint = endpoint;
  }


  public DataStreamingResponseGetResultTypeKafka allDomains(Boolean allDomains) {
    
    this.allDomains = allDomains;
    return this;
  }

   /**
   * Get allDomains
   * @return allDomains
  **/
  @javax.annotation.Nullable
  public Boolean getAllDomains() {
    return allDomains;
  }


  public void setAllDomains(Boolean allDomains) {
    this.allDomains = allDomains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStreamingResponseGetResultTypeKafka dataStreamingResponseGetResultTypeKafka = (DataStreamingResponseGetResultTypeKafka) o;
    return Objects.equals(this.id, dataStreamingResponseGetResultTypeKafka.id) &&
        Objects.equals(this.name, dataStreamingResponseGetResultTypeKafka.name) &&
        Objects.equals(this.templateId, dataStreamingResponseGetResultTypeKafka.templateId) &&
        Objects.equals(this.dataSource, dataStreamingResponseGetResultTypeKafka.dataSource) &&
        Objects.equals(this.active, dataStreamingResponseGetResultTypeKafka.active) &&
        Objects.equals(this.endpoint, dataStreamingResponseGetResultTypeKafka.endpoint) &&
        Objects.equals(this.allDomains, dataStreamingResponseGetResultTypeKafka.allDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, templateId, dataSource, active, endpoint, allDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStreamingResponseGetResultTypeKafka {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    allDomains: ").append(toIndentedString(allDomains)).append("\n");
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
    openapiFields.add("template_id");
    openapiFields.add("data_source");
    openapiFields.add("active");
    openapiFields.add("endpoint");
    openapiFields.add("all_domains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataStreamingResponseGetResultTypeKafka
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DataStreamingResponseGetResultTypeKafka.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStreamingResponseGetResultTypeKafka is not found in the empty JSON string", DataStreamingResponseGetResultTypeKafka.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataStreamingResponseGetResultTypeKafka.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStreamingResponseGetResultTypeKafka` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("data_source") != null && !jsonObj.get("data_source").isJsonNull()) && !jsonObj.get("data_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source").toString()));
      }
      // validate the optional field `endpoint`
      if (jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) {
        DataStreamingEndpointTypeKafka.validateJsonObject(jsonObj.getAsJsonObject("endpoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStreamingResponseGetResultTypeKafka.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStreamingResponseGetResultTypeKafka' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStreamingResponseGetResultTypeKafka> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStreamingResponseGetResultTypeKafka.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStreamingResponseGetResultTypeKafka>() {
           @Override
           public void write(JsonWriter out, DataStreamingResponseGetResultTypeKafka value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStreamingResponseGetResultTypeKafka read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStreamingResponseGetResultTypeKafka given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStreamingResponseGetResultTypeKafka
  * @throws IOException if the JSON string is invalid with respect to DataStreamingResponseGetResultTypeKafka
  */
  public static DataStreamingResponseGetResultTypeKafka fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStreamingResponseGetResultTypeKafka.class);
  }

 /**
  * Convert an instance of DataStreamingResponseGetResultTypeKafka to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

