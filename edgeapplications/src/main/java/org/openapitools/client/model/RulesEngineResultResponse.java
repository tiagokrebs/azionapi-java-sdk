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
import org.openapitools.client.model.RulesEngineCriteria;
import org.openapitools.client.model.RulesEngineResultResponseBehaviors;

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
 * RulesEngineResultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T17:49:22.152078Z[GMT]")
public class RulesEngineResultResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<RulesEngineResultResponseBehaviors> behaviors;

  public static final String SERIALIZED_NAME_CRITERIA = "criteria";
  @SerializedName(SERIALIZED_NAME_CRITERIA)
  private List<List<RulesEngineCriteria>> criteria = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Long order;

  public RulesEngineResultResponse() {
  }

  public RulesEngineResultResponse id(Long id) {
    
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


  public RulesEngineResultResponse name(String name) {
    
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


  public RulesEngineResultResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RulesEngineResultResponse phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nonnull
  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public RulesEngineResultResponse behaviors(List<RulesEngineResultResponseBehaviors> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public RulesEngineResultResponse addBehaviorsItem(RulesEngineResultResponseBehaviors behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * Get behaviors
   * @return behaviors
  **/
  @javax.annotation.Nullable
  public List<RulesEngineResultResponseBehaviors> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<RulesEngineResultResponseBehaviors> behaviors) {
    this.behaviors = behaviors;
  }


  public RulesEngineResultResponse criteria(List<List<RulesEngineCriteria>> criteria) {
    
    this.criteria = criteria;
    return this;
  }

  public RulesEngineResultResponse addCriteriaItem(List<RulesEngineCriteria> criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @javax.annotation.Nonnull
  public List<List<RulesEngineCriteria>> getCriteria() {
    return criteria;
  }


  public void setCriteria(List<List<RulesEngineCriteria>> criteria) {
    this.criteria = criteria;
  }


  public RulesEngineResultResponse isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nonnull
  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public RulesEngineResultResponse order(Long order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull
  public Long getOrder() {
    return order;
  }


  public void setOrder(Long order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesEngineResultResponse rulesEngineResultResponse = (RulesEngineResultResponse) o;
    return Objects.equals(this.id, rulesEngineResultResponse.id) &&
        Objects.equals(this.name, rulesEngineResultResponse.name) &&
        Objects.equals(this.description, rulesEngineResultResponse.description) &&
        Objects.equals(this.phase, rulesEngineResultResponse.phase) &&
        Objects.equals(this.behaviors, rulesEngineResultResponse.behaviors) &&
        Objects.equals(this.criteria, rulesEngineResultResponse.criteria) &&
        Objects.equals(this.isActive, rulesEngineResultResponse.isActive) &&
        Objects.equals(this.order, rulesEngineResultResponse.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, phase, behaviors, criteria, isActive, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesEngineResultResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("phase");
    openapiFields.add("behaviors");
    openapiFields.add("criteria");
    openapiFields.add("is_active");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phase");
    openapiRequiredFields.add("criteria");
    openapiRequiredFields.add("is_active");
    openapiRequiredFields.add("order");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RulesEngineResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RulesEngineResultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulesEngineResultResponse is not found in the empty JSON string", RulesEngineResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RulesEngineResultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulesEngineResultResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RulesEngineResultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if (jsonObj.get("behaviors") != null && !jsonObj.get("behaviors").isJsonNull()) {
        JsonArray jsonArraybehaviors = jsonObj.getAsJsonArray("behaviors");
        if (jsonArraybehaviors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("behaviors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `behaviors` to be an array in the JSON string but got `%s`", jsonObj.get("behaviors").toString()));
          }

          // validate the optional field `behaviors` (array)
          for (int i = 0; i < jsonArraybehaviors.size(); i++) {
            RulesEngineResultResponseBehaviors.validateJsonObject(jsonArraybehaviors.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("criteria") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("criteria").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `criteria` to be an array in the JSON string but got `%s`", jsonObj.get("criteria").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulesEngineResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulesEngineResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulesEngineResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulesEngineResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RulesEngineResultResponse>() {
           @Override
           public void write(JsonWriter out, RulesEngineResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulesEngineResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulesEngineResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulesEngineResultResponse
  * @throws IOException if the JSON string is invalid with respect to RulesEngineResultResponse
  */
  public static RulesEngineResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulesEngineResultResponse.class);
  }

 /**
  * Convert an instance of RulesEngineResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

