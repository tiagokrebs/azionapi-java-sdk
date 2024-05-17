/*
 * Domain API
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DomainEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-17T17:14:08.327853Z[GMT]", comments = "Generator version: 7.5.0")
public class DomainEntity {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CNAMES = "cnames";
  @SerializedName(SERIALIZED_NAME_CNAMES)
  private List<String> cnames = new ArrayList<>();

  public static final String SERIALIZED_NAME_CNAME_ACCESS_ONLY = "cname_access_only";
  @SerializedName(SERIALIZED_NAME_CNAME_ACCESS_ONLY)
  private Boolean cnameAccessOnly;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EDGE_APPLICATION_ID = "edge_application_id";
  @SerializedName(SERIALIZED_NAME_EDGE_APPLICATION_ID)
  private Long edgeApplicationId;

  public static final String SERIALIZED_NAME_DIGITAL_CERTIFICATE_ID = "digital_certificate_id";
  @SerializedName(SERIALIZED_NAME_DIGITAL_CERTIFICATE_ID)
  private String digitalCertificateId;

  /**
   * Gets or Sets environment
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    PRODUCTION("production"),
    
    PREVIEW("preview");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnvironmentEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  public static final String SERIALIZED_NAME_IS_MTLS_ENABLED = "is_mtls_enabled";
  @SerializedName(SERIALIZED_NAME_IS_MTLS_ENABLED)
  private Boolean isMtlsEnabled;

  public static final String SERIALIZED_NAME_MTLS_TRUSTED_CA_CERTIFICATE_ID = "mtls_trusted_ca_certificate_id";
  @SerializedName(SERIALIZED_NAME_MTLS_TRUSTED_CA_CERTIFICATE_ID)
  private Long mtlsTrustedCaCertificateId;

  public static final String SERIALIZED_NAME_EDGE_FIREWALL_ID = "edge_firewall_id";
  @SerializedName(SERIALIZED_NAME_EDGE_FIREWALL_ID)
  private Long edgeFirewallId;

  /**
   * Gets or Sets mtlsVerification
   */
  @JsonAdapter(MtlsVerificationEnum.Adapter.class)
  public enum MtlsVerificationEnum {
    ENFORCE("enforce"),
    
    PERMISSIVE("permissive");

    private String value;

    MtlsVerificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MtlsVerificationEnum fromValue(String value) {
      for (MtlsVerificationEnum b : MtlsVerificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MtlsVerificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MtlsVerificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MtlsVerificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MtlsVerificationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MtlsVerificationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MTLS_VERIFICATION = "mtls_verification";
  @SerializedName(SERIALIZED_NAME_MTLS_VERIFICATION)
  private MtlsVerificationEnum mtlsVerification;

  public static final String SERIALIZED_NAME_CRL_LIST = "crl_list";
  @SerializedName(SERIALIZED_NAME_CRL_LIST)
  private List<Long> crlList;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public DomainEntity() {
  }

  public DomainEntity name(String name) {
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


  public DomainEntity cnames(List<String> cnames) {
    this.cnames = cnames;
    return this;
  }

  public DomainEntity addCnamesItem(String cnamesItem) {
    if (this.cnames == null) {
      this.cnames = new ArrayList<>();
    }
    this.cnames.add(cnamesItem);
    return this;
  }

   /**
   * Get cnames
   * @return cnames
  **/
  @javax.annotation.Nullable
  public List<String> getCnames() {
    return cnames;
  }

  public void setCnames(List<String> cnames) {
    this.cnames = cnames;
  }


  public DomainEntity cnameAccessOnly(Boolean cnameAccessOnly) {
    this.cnameAccessOnly = cnameAccessOnly;
    return this;
  }

   /**
   * Get cnameAccessOnly
   * @return cnameAccessOnly
  **/
  @javax.annotation.Nullable
  public Boolean getCnameAccessOnly() {
    return cnameAccessOnly;
  }

  public void setCnameAccessOnly(Boolean cnameAccessOnly) {
    this.cnameAccessOnly = cnameAccessOnly;
  }


  public DomainEntity isActive(Boolean isActive) {
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


  public DomainEntity edgeApplicationId(Long edgeApplicationId) {
    this.edgeApplicationId = edgeApplicationId;
    return this;
  }

   /**
   * Get edgeApplicationId
   * minimum: 1
   * maximum: -8446744073709551616
   * @return edgeApplicationId
  **/
  @javax.annotation.Nullable
  public Long getEdgeApplicationId() {
    return edgeApplicationId;
  }

  public void setEdgeApplicationId(Long edgeApplicationId) {
    this.edgeApplicationId = edgeApplicationId;
  }


  public DomainEntity digitalCertificateId(String digitalCertificateId) {
    this.digitalCertificateId = digitalCertificateId;
    return this;
  }

   /**
   * Get digitalCertificateId
   * @return digitalCertificateId
  **/
  @javax.annotation.Nullable
  public String getDigitalCertificateId() {
    return digitalCertificateId;
  }

  public void setDigitalCertificateId(String digitalCertificateId) {
    this.digitalCertificateId = digitalCertificateId;
  }


  public DomainEntity environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public DomainEntity isMtlsEnabled(Boolean isMtlsEnabled) {
    this.isMtlsEnabled = isMtlsEnabled;
    return this;
  }

   /**
   * Get isMtlsEnabled
   * @return isMtlsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsMtlsEnabled() {
    return isMtlsEnabled;
  }

  public void setIsMtlsEnabled(Boolean isMtlsEnabled) {
    this.isMtlsEnabled = isMtlsEnabled;
  }


  public DomainEntity mtlsTrustedCaCertificateId(Long mtlsTrustedCaCertificateId) {
    this.mtlsTrustedCaCertificateId = mtlsTrustedCaCertificateId;
    return this;
  }

   /**
   * Get mtlsTrustedCaCertificateId
   * @return mtlsTrustedCaCertificateId
  **/
  @javax.annotation.Nullable
  public Long getMtlsTrustedCaCertificateId() {
    return mtlsTrustedCaCertificateId;
  }

  public void setMtlsTrustedCaCertificateId(Long mtlsTrustedCaCertificateId) {
    this.mtlsTrustedCaCertificateId = mtlsTrustedCaCertificateId;
  }


  public DomainEntity edgeFirewallId(Long edgeFirewallId) {
    this.edgeFirewallId = edgeFirewallId;
    return this;
  }

   /**
   * Get edgeFirewallId
   * @return edgeFirewallId
  **/
  @javax.annotation.Nullable
  public Long getEdgeFirewallId() {
    return edgeFirewallId;
  }

  public void setEdgeFirewallId(Long edgeFirewallId) {
    this.edgeFirewallId = edgeFirewallId;
  }


  public DomainEntity mtlsVerification(MtlsVerificationEnum mtlsVerification) {
    this.mtlsVerification = mtlsVerification;
    return this;
  }

   /**
   * Get mtlsVerification
   * @return mtlsVerification
  **/
  @javax.annotation.Nullable
  public MtlsVerificationEnum getMtlsVerification() {
    return mtlsVerification;
  }

  public void setMtlsVerification(MtlsVerificationEnum mtlsVerification) {
    this.mtlsVerification = mtlsVerification;
  }


  public DomainEntity crlList(List<Long> crlList) {
    this.crlList = crlList;
    return this;
  }

  public DomainEntity addCrlListItem(Long crlListItem) {
    if (this.crlList == null) {
      this.crlList = new ArrayList<>();
    }
    this.crlList.add(crlListItem);
    return this;
  }

   /**
   * Get crlList
   * @return crlList
  **/
  @javax.annotation.Nullable
  public List<Long> getCrlList() {
    return crlList;
  }

  public void setCrlList(List<Long> crlList) {
    this.crlList = crlList;
  }


  public DomainEntity id(Long id) {
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


  public DomainEntity domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEntity domainEntity = (DomainEntity) o;
    return Objects.equals(this.name, domainEntity.name) &&
        Objects.equals(this.cnames, domainEntity.cnames) &&
        Objects.equals(this.cnameAccessOnly, domainEntity.cnameAccessOnly) &&
        Objects.equals(this.isActive, domainEntity.isActive) &&
        Objects.equals(this.edgeApplicationId, domainEntity.edgeApplicationId) &&
        Objects.equals(this.digitalCertificateId, domainEntity.digitalCertificateId) &&
        Objects.equals(this.environment, domainEntity.environment) &&
        Objects.equals(this.isMtlsEnabled, domainEntity.isMtlsEnabled) &&
        Objects.equals(this.mtlsTrustedCaCertificateId, domainEntity.mtlsTrustedCaCertificateId) &&
        Objects.equals(this.edgeFirewallId, domainEntity.edgeFirewallId) &&
        Objects.equals(this.mtlsVerification, domainEntity.mtlsVerification) &&
        Objects.equals(this.crlList, domainEntity.crlList) &&
        Objects.equals(this.id, domainEntity.id) &&
        Objects.equals(this.domainName, domainEntity.domainName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cnames, cnameAccessOnly, isActive, edgeApplicationId, digitalCertificateId, environment, isMtlsEnabled, mtlsTrustedCaCertificateId, edgeFirewallId, mtlsVerification, crlList, id, domainName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEntity {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cnames: ").append(toIndentedString(cnames)).append("\n");
    sb.append("    cnameAccessOnly: ").append(toIndentedString(cnameAccessOnly)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    edgeApplicationId: ").append(toIndentedString(edgeApplicationId)).append("\n");
    sb.append("    digitalCertificateId: ").append(toIndentedString(digitalCertificateId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    isMtlsEnabled: ").append(toIndentedString(isMtlsEnabled)).append("\n");
    sb.append("    mtlsTrustedCaCertificateId: ").append(toIndentedString(mtlsTrustedCaCertificateId)).append("\n");
    sb.append("    edgeFirewallId: ").append(toIndentedString(edgeFirewallId)).append("\n");
    sb.append("    mtlsVerification: ").append(toIndentedString(mtlsVerification)).append("\n");
    sb.append("    crlList: ").append(toIndentedString(crlList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
    openapiFields.add("cnames");
    openapiFields.add("cname_access_only");
    openapiFields.add("is_active");
    openapiFields.add("edge_application_id");
    openapiFields.add("digital_certificate_id");
    openapiFields.add("environment");
    openapiFields.add("is_mtls_enabled");
    openapiFields.add("mtls_trusted_ca_certificate_id");
    openapiFields.add("edge_firewall_id");
    openapiFields.add("mtls_verification");
    openapiFields.add("crl_list");
    openapiFields.add("id");
    openapiFields.add("domain_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DomainEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainEntity is not found in the empty JSON string", DomainEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DomainEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DomainEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cnames") != null && !jsonObj.get("cnames").isJsonNull() && !jsonObj.get("cnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnames` to be an array in the JSON string but got `%s`", jsonObj.get("cnames").toString()));
      }
      if ((jsonObj.get("digital_certificate_id") != null && !jsonObj.get("digital_certificate_id").isJsonNull()) && !jsonObj.get("digital_certificate_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digital_certificate_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digital_certificate_id").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        EnvironmentEnum.validateJsonElement(jsonObj.get("environment"));
      }
      if ((jsonObj.get("mtls_verification") != null && !jsonObj.get("mtls_verification").isJsonNull()) && !jsonObj.get("mtls_verification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mtls_verification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mtls_verification").toString()));
      }
      // validate the optional field `mtls_verification`
      if (jsonObj.get("mtls_verification") != null && !jsonObj.get("mtls_verification").isJsonNull()) {
        MtlsVerificationEnum.validateJsonElement(jsonObj.get("mtls_verification"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("crl_list") != null && !jsonObj.get("crl_list").isJsonNull() && !jsonObj.get("crl_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `crl_list` to be an array in the JSON string but got `%s`", jsonObj.get("crl_list").toString()));
      }
      if ((jsonObj.get("domain_name") != null && !jsonObj.get("domain_name").isJsonNull()) && !jsonObj.get("domain_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainEntity>() {
           @Override
           public void write(JsonWriter out, DomainEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DomainEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DomainEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DomainEntity
  * @throws IOException if the JSON string is invalid with respect to DomainEntity
  */
  public static DomainEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainEntity.class);
  }

 /**
  * Convert an instance of DomainEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

