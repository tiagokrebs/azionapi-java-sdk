/*
 * Edge Firewall API
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
 * UpdateEdgeFirewallRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-04T16:25:33.360615Z[GMT]")
public class UpdateEdgeFirewallRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<Long> domains;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EDGE_FUNCTIONS_ENABLED = "edge_functions_enabled";
  @SerializedName(SERIALIZED_NAME_EDGE_FUNCTIONS_ENABLED)
  private Boolean edgeFunctionsEnabled;

  public static final String SERIALIZED_NAME_NETWORK_PROTECTION_ENABLED = "network_protection_enabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_PROTECTION_ENABLED)
  private Boolean networkProtectionEnabled;

  public static final String SERIALIZED_NAME_WAF_ENABLED = "waf_enabled";
  @SerializedName(SERIALIZED_NAME_WAF_ENABLED)
  private Boolean wafEnabled;

  public UpdateEdgeFirewallRequest() {
  }

  public UpdateEdgeFirewallRequest name(String name) {
    
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


  public UpdateEdgeFirewallRequest domains(List<Long> domains) {
    
    this.domains = domains;
    return this;
  }

  public UpdateEdgeFirewallRequest addDomainsItem(Long domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nullable
  public List<Long> getDomains() {
    return domains;
  }


  public void setDomains(List<Long> domains) {
    this.domains = domains;
  }


  public UpdateEdgeFirewallRequest isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public UpdateEdgeFirewallRequest edgeFunctionsEnabled(Boolean edgeFunctionsEnabled) {
    
    this.edgeFunctionsEnabled = edgeFunctionsEnabled;
    return this;
  }

   /**
   * Get edgeFunctionsEnabled
   * @return edgeFunctionsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getEdgeFunctionsEnabled() {
    return edgeFunctionsEnabled;
  }


  public void setEdgeFunctionsEnabled(Boolean edgeFunctionsEnabled) {
    this.edgeFunctionsEnabled = edgeFunctionsEnabled;
  }


  public UpdateEdgeFirewallRequest networkProtectionEnabled(Boolean networkProtectionEnabled) {
    
    this.networkProtectionEnabled = networkProtectionEnabled;
    return this;
  }

   /**
   * Get networkProtectionEnabled
   * @return networkProtectionEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkProtectionEnabled() {
    return networkProtectionEnabled;
  }


  public void setNetworkProtectionEnabled(Boolean networkProtectionEnabled) {
    this.networkProtectionEnabled = networkProtectionEnabled;
  }


  public UpdateEdgeFirewallRequest wafEnabled(Boolean wafEnabled) {
    
    this.wafEnabled = wafEnabled;
    return this;
  }

   /**
   * Get wafEnabled
   * @return wafEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getWafEnabled() {
    return wafEnabled;
  }


  public void setWafEnabled(Boolean wafEnabled) {
    this.wafEnabled = wafEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEdgeFirewallRequest updateEdgeFirewallRequest = (UpdateEdgeFirewallRequest) o;
    return Objects.equals(this.name, updateEdgeFirewallRequest.name) &&
        Objects.equals(this.domains, updateEdgeFirewallRequest.domains) &&
        Objects.equals(this.isActive, updateEdgeFirewallRequest.isActive) &&
        Objects.equals(this.edgeFunctionsEnabled, updateEdgeFirewallRequest.edgeFunctionsEnabled) &&
        Objects.equals(this.networkProtectionEnabled, updateEdgeFirewallRequest.networkProtectionEnabled) &&
        Objects.equals(this.wafEnabled, updateEdgeFirewallRequest.wafEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, domains, isActive, edgeFunctionsEnabled, networkProtectionEnabled, wafEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEdgeFirewallRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    edgeFunctionsEnabled: ").append(toIndentedString(edgeFunctionsEnabled)).append("\n");
    sb.append("    networkProtectionEnabled: ").append(toIndentedString(networkProtectionEnabled)).append("\n");
    sb.append("    wafEnabled: ").append(toIndentedString(wafEnabled)).append("\n");
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
    openapiFields.add("domains");
    openapiFields.add("is_active");
    openapiFields.add("edge_functions_enabled");
    openapiFields.add("network_protection_enabled");
    openapiFields.add("waf_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateEdgeFirewallRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateEdgeFirewallRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEdgeFirewallRequest is not found in the empty JSON string", UpdateEdgeFirewallRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateEdgeFirewallRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEdgeFirewallRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domains") != null && !jsonObj.get("domains").isJsonNull() && !jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateEdgeFirewallRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEdgeFirewallRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEdgeFirewallRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEdgeFirewallRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEdgeFirewallRequest>() {
           @Override
           public void write(JsonWriter out, UpdateEdgeFirewallRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEdgeFirewallRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateEdgeFirewallRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateEdgeFirewallRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateEdgeFirewallRequest
  */
  public static UpdateEdgeFirewallRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEdgeFirewallRequest.class);
  }

 /**
  * Convert an instance of UpdateEdgeFirewallRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

