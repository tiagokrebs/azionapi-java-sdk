/*
 * Domain
 * ## Welcome to the Azion API!  With the following APIs you can check, remove or update existing settings, besides creating new ones.  * * *  ## Overview  The Azion API is a RESTful API, based on HTTPS requests, that allows you to integrate your systems with our platform, simply, quickly, and securely.  Here you will find instructions on how our API works and what functionality is available.  This documentation is being constantly updated. Make sure you verify if there are any updates or changes before you perform any development in your application, even if you are familiar with our API.  * * *  Both HTTPS requests and responses must be in JavaScript Object Notation (JSON) format. All HTTPS requests and responses must follow these conventions.  **Base URL**  The base URL of the API, which must be used, is:  [**https://api.azionapi.net/_**](https://api.azionapi.net/)  **HTTP Methods**  Each HTTP method defines the type of operation that will be run.  | HTTP Method | CRUD | Whole Collection (e.g. /items) | Specific Item (e.g. /items/:item_id) | | --- | --- | --- | --- | | GET | Read | It retrieves the list of items in a Collection. | It retrieves a specific item in a Collection. | | POST | Create | It creates a new item in the Collection. | \\- | | PUT | Update/Replace | It replaces a whole Collection with a new one. | It replaces an item in a Collection with a new one. | | PATCH | Update/Modify | It partially updates a Collection. | It partially updates an item in a Collection | | DELETE | Delete | It deletes a whole Collection. | It deletes an item in a Collection. |  * * *  **Status Codes**  The HTTP return code defines the status – successful or not – after the requested operation is run.  | Status Code | Meaning | | --- | --- | | 200 OK | General Status for a successful operation. | | 201 CREATED | Successfully created a collection or item, by means of POST or PUT. | | 204 NO CONTENT | Successful operation, but without any content to be return to the Body. Generally used for DELETE or PUT operations. | | 207 MULTI-STATUS | A batch of operations were triggered by a single request, which resulted in different return codes when it was run, for some of the operations. The codes are displayed in the “status” field, in the body of the response, for each sub-batch of operations for whichever are applicable. | | 400 BAD REQUEST | Request error, such as invalid parameters, missing mandatory parameters or others. | | 401 UNAUTHORIZED | Error caused by a missing HTTP Authentication header. | | 403 FORBIDDEN | User does not have the permissions to run the requested operation. | | 404 NOT FOUND | The requested resource does not exist. | | 405 METHOD NOT ALLOWED | The requested method is not applicable with the URL. | | 406 NOT ACCEPTABLE | Accept header missing from the HTTP request or the header contains formatting or the version is not supported by the API. | | 409 CONFLICT | Conflict generated in running the request, such as a request to create an already existing record. | | 429 TOO MANY REQUESTS | The request was temporarily rejected, due to exceeding the limit on operations. Wait for the time defined in the X-Ratelimit-Reset header and try again. | | 500 INTERNAL SERVER ERROR | Unintentional error, due to an unidentified failure in the request process. | | \\--- |  | | **HTTP Headers** |  |  All requests must be generated with the HTTP header specifying the desired code format for responses and the API version used. The current version of the API is 3 and the format is application/json.  ``` Accept: application/json; version=3  ```  * * *  **Rate Limit**  The limit of operations that can be run via the API is defined by 3 HTTP response headers:  *   **X-ratelimit-limit:** number of operations allowed in one time-frame; *   **X-ratelimit-remaining:** number of operations still available in one time-frame; *   **X-ratelimit-reset:** is the date and time, in IOS 8601 format, which represents the point in the future when the time-frame will be closed and when the limits will, therefore, be reset.       Example of HTTP response headers and a request:  ``` Date: Thu, 02 Nov 2017 12:30:28 GMT X-ratelimit-remaining: 199 X-ratelimit-limit: 200 X-ratelimit-reset: 2017-11-02T12:31:28.675446  ```  In the example provided, 200 operations are allowed within a 1-minute time frame. Of those, there are 199 still available, because one has already been run. The total limit will be reset after 1 minute.  When the X-ratelimit-limit is reached, or in other words, when the X-ratelimit-remaining reaches zero, the API will give the error, HTTP 429 TOO MANY REQUESTS. If your application receives this error, you will need to wait until the time defined in X-ratelimit-reset has passed, to make another request.  *   **X-ratelimit-limit by product**       The *X-ratelimit limit* variations by product are the following:  *   **Real-Time Metrics:** 20 requests per minute. *   **Real-Time Purge:** 200 requests per minute; except for the Wildcard, which is 2000 a day.       > The rate-limit values are based on the client_id.  * * *  **Optional Parameters**  In this version, it is possible to include some optional parameters as part of the GET method, which can help and modify the form in which your data will be returned.  You can combine these parameters to get the result you want.  They are:  | Parameter | Description | Accepted values: | | --- | --- | --- | | order_by | Identifies which field the return should be sorted by. The default ordering is ascending. | Depends on the fields available from the endpoint structure | | sort | Defines which ordering to be used: ascending or descending. | asc  <br>  <br>desc | | page | Identifies which page should be returned, if the return is paginated. The default value is 1. | Page number. | | page_size | Identifies how many items should be returned per page. The default value is 10. | Desired number of items. |  * * *  **Request Exemple**  You can use one parameter, or a combination. See the example below, which uses all of them in the same request.  ``` GET /domains?order_by=name&page_size=20&sort=desc&page=3 Accept: application/json; version=3 Authorization: token 2909f3932069047f4736dc87e72baaddd19c9f75  ```  * * *  # Authentication  Authentication and authorization of operations via Azion API is done through Tokens.  The first step is to create the Token through authenticating a user registered in [Real-Time Manager](https://sso.azion.com/login).  * * *  ## Encoding Username and Password in Base64  Only token creation and cancelling operations are performed through Basic Authentication, that is, with a username and password. You can create and cancel the token through the API itself, but for that you need to encode your username and password in base64.  Base64 encoding can be done from the command line on a Unix terminal:  ``` $ echo 'user@domain:password'|base64 dXNlckBkb21haW46cGFzc3dvcmQK  ```
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
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateDomainRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-09T21:49:02.039120Z[GMT]")
public class CreateDomainRequest {
  public static final String SERIALIZED_NAME_CNAMES = "cnames";
  @SerializedName(SERIALIZED_NAME_CNAMES)
  private List<String> cnames = new ArrayList<>();

  public static final String SERIALIZED_NAME_CNAME_ACCESS_ONLY = "cname_access_only";
  @SerializedName(SERIALIZED_NAME_CNAME_ACCESS_ONLY)
  private Boolean cnameAccessOnly;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EDGE_APPLICATION_ID = "edge_application_id";
  @SerializedName(SERIALIZED_NAME_EDGE_APPLICATION_ID)
  private Long edgeApplicationId;

  public static final String SERIALIZED_NAME_DIGITAL_CERTIFICATE_ID = "digital_certificate_id";
  @SerializedName(SERIALIZED_NAME_DIGITAL_CERTIFICATE_ID)
  private Long digitalCertificateId;

  public CreateDomainRequest() {
  }

  public CreateDomainRequest cnames(List<String> cnames) {
    
    this.cnames = cnames;
    return this;
  }

  public CreateDomainRequest addCnamesItem(String cnamesItem) {
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
  @javax.annotation.Nonnull
  public List<String> getCnames() {
    return cnames;
  }


  public void setCnames(List<String> cnames) {
    this.cnames = cnames;
  }


  public CreateDomainRequest cnameAccessOnly(Boolean cnameAccessOnly) {
    
    this.cnameAccessOnly = cnameAccessOnly;
    return this;
  }

   /**
   * Get cnameAccessOnly
   * @return cnameAccessOnly
  **/
  @javax.annotation.Nonnull
  public Boolean getCnameAccessOnly() {
    return cnameAccessOnly;
  }


  public void setCnameAccessOnly(Boolean cnameAccessOnly) {
    this.cnameAccessOnly = cnameAccessOnly;
  }


  public CreateDomainRequest name(String name) {
    
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


  public CreateDomainRequest isActive(Boolean isActive) {
    
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


  public CreateDomainRequest edgeApplicationId(Long edgeApplicationId) {
    
    this.edgeApplicationId = edgeApplicationId;
    return this;
  }

   /**
   * Get edgeApplicationId
   * @return edgeApplicationId
  **/
  @javax.annotation.Nonnull
  public Long getEdgeApplicationId() {
    return edgeApplicationId;
  }


  public void setEdgeApplicationId(Long edgeApplicationId) {
    this.edgeApplicationId = edgeApplicationId;
  }


  public CreateDomainRequest digitalCertificateId(Long digitalCertificateId) {
    
    this.digitalCertificateId = digitalCertificateId;
    return this;
  }

   /**
   * Get digitalCertificateId
   * @return digitalCertificateId
  **/
  @javax.annotation.Nullable
  public Long getDigitalCertificateId() {
    return digitalCertificateId;
  }


  public void setDigitalCertificateId(Long digitalCertificateId) {
    this.digitalCertificateId = digitalCertificateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDomainRequest createDomainRequest = (CreateDomainRequest) o;
    return Objects.equals(this.cnames, createDomainRequest.cnames) &&
        Objects.equals(this.cnameAccessOnly, createDomainRequest.cnameAccessOnly) &&
        Objects.equals(this.name, createDomainRequest.name) &&
        Objects.equals(this.isActive, createDomainRequest.isActive) &&
        Objects.equals(this.edgeApplicationId, createDomainRequest.edgeApplicationId) &&
        Objects.equals(this.digitalCertificateId, createDomainRequest.digitalCertificateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnames, cnameAccessOnly, name, isActive, edgeApplicationId, digitalCertificateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDomainRequest {\n");
    sb.append("    cnames: ").append(toIndentedString(cnames)).append("\n");
    sb.append("    cnameAccessOnly: ").append(toIndentedString(cnameAccessOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    edgeApplicationId: ").append(toIndentedString(edgeApplicationId)).append("\n");
    sb.append("    digitalCertificateId: ").append(toIndentedString(digitalCertificateId)).append("\n");
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
    openapiFields.add("cnames");
    openapiFields.add("cname_access_only");
    openapiFields.add("name");
    openapiFields.add("is_active");
    openapiFields.add("edge_application_id");
    openapiFields.add("digital_certificate_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cnames");
    openapiRequiredFields.add("cname_access_only");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("is_active");
    openapiRequiredFields.add("edge_application_id");
    openapiRequiredFields.add("digital_certificate_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateDomainRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateDomainRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDomainRequest is not found in the empty JSON string", CreateDomainRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateDomainRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDomainRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDomainRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("cnames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("cnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnames` to be an array in the JSON string but got `%s`", jsonObj.get("cnames").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDomainRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDomainRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDomainRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDomainRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDomainRequest>() {
           @Override
           public void write(JsonWriter out, CreateDomainRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDomainRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDomainRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDomainRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDomainRequest
  */
  public static CreateDomainRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDomainRequest.class);
  }

 /**
  * Convert an instance of CreateDomainRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

