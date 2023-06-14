/*
 * Edge Application
 * ## Welcome to the Azion API!  With the following APIs you can check, remove or update existing settings, besides creating new ones.  * * *  ## Overview  The Azion API is a RESTful API, based on HTTPS requests, that allows you to integrate your systems with our platform, simply, quickly, and securely.  Here you will find instructions on how our API works and what functionality is available.  This documentation is being constantly updated. Make sure you verify if there are any updates or changes before you perform any development in your application, even if you are familiar with our API.  * * *  Both HTTPS requests and responses must be in JavaScript Object Notation (JSON) format. All HTTPS requests and responses must follow these conventions.  **Base URL**  The base URL of the API, which must be used, is:  [**https://api.azionapi.net/_**](https://api.azionapi.net/)  **HTTP Methods**  Each HTTP method defines the type of operation that will be run.  | HTTP Method | CRUD | Whole Collection (e.g. /items) | Specific Item (e.g. /items/:item_id) | | --- | --- | --- | --- | | GET | Read | It retrieves the list of items in a Collection. | It retrieves a specific item in a Collection. | | POST | Create | It creates a new item in the Collection. | \\- | | PUT | Update/Replace | It replaces a whole Collection with a new one. | It replaces an item in a Collection with a new one. | | PATCH | Update/Modify | It partially updates a Collection. | It partially updates an item in a Collection | | DELETE | Delete | It deletes a whole Collection. | It deletes an item in a Collection. |  * * *  **Status Codes**  The HTTP return code defines the status – successful or not – after the requested operation is run.  | Status Code | Meaning | | --- | --- | | 200 OK | General Status for a successful operation. | | 201 CREATED | Successfully created a collection or item, by means of POST or PUT. | | 204 NO CONTENT | Successful operation, but without any content to be return to the Body. Generally used for DELETE or PUT operations. | | 207 MULTI-STATUS | A batch of operations were triggered by a single request, which resulted in different return codes when it was run, for some of the operations. The codes are displayed in the “status” field, in the body of the response, for each sub-batch of operations for whichever are applicable. | | 400 BAD REQUEST | Request error, such as invalid parameters, missing mandatory parameters or others. | | 401 UNAUTHORIZED | Error caused by a missing HTTP Authentication header. | | 403 FORBIDDEN | User does not have the permissions to run the requested operation. | | 404 NOT FOUND | The requested resource does not exist. | | 405 METHOD NOT ALLOWED | The requested method is not applicable with the URL. | | 406 NOT ACCEPTABLE | Accept header missing from the HTTP request or the header contains formatting or the version is not supported by the API. | | 409 CONFLICT | Conflict generated in running the request, such as a request to create an already existing record. | | 429 TOO MANY REQUESTS | The request was temporarily rejected, due to exceeding the limit on operations. Wait for the time defined in the X-Ratelimit-Reset header and try again. | | 500 INTERNAL SERVER ERROR | Unintentional error, due to an unidentified failure in the request process. | | \\--- |  | | **HTTP Headers** |  |  All requests must be generated with the HTTP header specifying the desired code format for responses and the API version used. The current version of the API is 3 and the format is application/json.  ``` Accept: application/json; version=3  ```  * * *  **Rate Limit**  The limit of operations that can be run via the API is defined by 3 HTTP response headers:  *   **X-ratelimit-limit:** number of operations allowed in one time-frame; *   **X-ratelimit-remaining:** number of operations still available in one time-frame; *   **X-ratelimit-reset:** is the date and time, in IOS 8601 format, which represents the point in the future when the time-frame will be closed and when the limits will, therefore, be reset.       Example of HTTP response headers and a request:  ``` Date: Thu, 02 Nov 2017 12:30:28 GMT X-ratelimit-remaining: 199 X-ratelimit-limit: 200 X-ratelimit-reset: 2017-11-02T12:31:28.675446  ```  In the example provided, 200 operations are allowed within a 1-minute time frame. Of those, there are 199 still available, because one has already been run. The total limit will be reset after 1 minute.  When the X-ratelimit-limit is reached, or in other words, when the X-ratelimit-remaining reaches zero, the API will give the error, HTTP 429 TOO MANY REQUESTS. If your application receives this error, you will need to wait until the time defined in X-ratelimit-reset has passed, to make another request.  *   **X-ratelimit-limit by product**       The *X-ratelimit limit* variations by product are the following:  *   **Real-Time Metrics:** 20 requests per minute. *   **Real-Time Purge:** 200 requests per minute; except for the Wildcard, which is 2000 a day.       > The rate-limit values are based on the client_id.  * * *  **Optional Parameters**  In this version, it is possible to include some optional parameters as part of the GET method, which can help and modify the form in which your data will be returned.  You can combine these parameters to get the result you want.  They are:  | Parameter | Description | Accepted values: | | --- | --- | --- | | order_by | Identifies which field the return should be sorted by. The default ordering is ascending. | Depends on the fields available from the endpoint structure | | sort | Defines which ordering to be used: ascending or descending. | asc  <br>  <br>desc | | page | Identifies which page should be returned, if the return is paginated. The default value is 1. | Page number. | | page_size | Identifies how many items should be returned per page. The default value is 10. | Desired number of items. |  * * *  **Request Exemple**  You can use one parameter, or a combination. See the example below, which uses all of them in the same request.  ``` GET /domains?order_by=name&page_size=20&sort=desc&page=3 Accept: application/json; version=3 Authorization: token 2909f3932069047f4736dc87e72baaddd19c9f75  ```  * * *  # Authentication  Authentication and authorization of operations via Azion API is done through Tokens.  The first step is to create the Token through authenticating a user registered in [Real-Time Manager](https://sso.azion.com/login).  * * *  ## Encoding Username and Password in Base64  Only token creation and cancelling operations are performed through Basic Authentication, that is, with a username and password. You can create and cancel the token through the API itself, but for that you need to encode your username and password in base64.  Base64 encoding can be done from the command line on a Unix terminal:  ``` $ echo 'user@domain:password'|base64 dXNlckBkb21haW46cGFzc3dvcmQK  ```  If you do not have a Unix terminal available, you can use the free online service at [https://www.base64encode.org/](https://www.base64encode.org/)
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
import org.openapitools.client.model.OriginsResultResponseAddresses;

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
 * OriginsResultResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-14T16:41:48.212222Z[GMT]")
public class OriginsResultResponse {
  public static final String SERIALIZED_NAME_ORIGIN_ID = "origin_id";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ID)
  private Long originId;

  public static final String SERIALIZED_NAME_ORIGIN_KEY = "origin_key";
  @SerializedName(SERIALIZED_NAME_ORIGIN_KEY)
  private String originKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGIN_TYPE = "origin_type";
  @SerializedName(SERIALIZED_NAME_ORIGIN_TYPE)
  private String originType;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<OriginsResultResponseAddresses> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY = "origin_protocol_policy";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PROTOCOL_POLICY)
  private String originProtocolPolicy;

  public static final String SERIALIZED_NAME_IS_ORIGIN_REDIRECTION_ENABLED = "is_origin_redirection_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ORIGIN_REDIRECTION_ENABLED)
  private Boolean isOriginRedirectionEnabled;

  public static final String SERIALIZED_NAME_HOST_HEADER = "host_header";
  @SerializedName(SERIALIZED_NAME_HOST_HEADER)
  private String hostHeader;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_ORIGIN_PATH = "origin_path";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PATH)
  private String originPath;

  public static final String SERIALIZED_NAME_CONNECTION_TIMEOUT = "connection_timeout";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TIMEOUT)
  private Long connectionTimeout;

  public static final String SERIALIZED_NAME_TIMEOUT_BETWEEN_BYTES = "timeout_between_bytes";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_BETWEEN_BYTES)
  private Long timeoutBetweenBytes;

  public static final String SERIALIZED_NAME_HMAC_AUTHENTICATION = "hmac_authentication";
  @SerializedName(SERIALIZED_NAME_HMAC_AUTHENTICATION)
  private Boolean hmacAuthentication;

  public static final String SERIALIZED_NAME_HMAC_REGION_NAME = "hmac_region_name";
  @SerializedName(SERIALIZED_NAME_HMAC_REGION_NAME)
  private String hmacRegionName;

  public static final String SERIALIZED_NAME_HMAC_ACCESS_KEY = "hmac_access_key";
  @SerializedName(SERIALIZED_NAME_HMAC_ACCESS_KEY)
  private String hmacAccessKey;

  public static final String SERIALIZED_NAME_HMAC_SECRET_KEY = "hmac_secret_key";
  @SerializedName(SERIALIZED_NAME_HMAC_SECRET_KEY)
  private String hmacSecretKey;

  public OriginsResultResponse() {
  }

  public OriginsResultResponse originId(Long originId) {
    
    this.originId = originId;
    return this;
  }

   /**
   * Get originId
   * @return originId
  **/
  @javax.annotation.Nonnull
  public Long getOriginId() {
    return originId;
  }


  public void setOriginId(Long originId) {
    this.originId = originId;
  }


  public OriginsResultResponse originKey(String originKey) {
    
    this.originKey = originKey;
    return this;
  }

   /**
   * Get originKey
   * @return originKey
  **/
  @javax.annotation.Nonnull
  public String getOriginKey() {
    return originKey;
  }


  public void setOriginKey(String originKey) {
    this.originKey = originKey;
  }


  public OriginsResultResponse name(String name) {
    
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


  public OriginsResultResponse originType(String originType) {
    
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @javax.annotation.Nonnull
  public String getOriginType() {
    return originType;
  }


  public void setOriginType(String originType) {
    this.originType = originType;
  }


  public OriginsResultResponse addresses(List<OriginsResultResponseAddresses> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public OriginsResultResponse addAddressesItem(OriginsResultResponseAddresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  public List<OriginsResultResponseAddresses> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<OriginsResultResponseAddresses> addresses) {
    this.addresses = addresses;
  }


  public OriginsResultResponse originProtocolPolicy(String originProtocolPolicy) {
    
    this.originProtocolPolicy = originProtocolPolicy;
    return this;
  }

   /**
   * Get originProtocolPolicy
   * @return originProtocolPolicy
  **/
  @javax.annotation.Nonnull
  public String getOriginProtocolPolicy() {
    return originProtocolPolicy;
  }


  public void setOriginProtocolPolicy(String originProtocolPolicy) {
    this.originProtocolPolicy = originProtocolPolicy;
  }


  public OriginsResultResponse isOriginRedirectionEnabled(Boolean isOriginRedirectionEnabled) {
    
    this.isOriginRedirectionEnabled = isOriginRedirectionEnabled;
    return this;
  }

   /**
   * Get isOriginRedirectionEnabled
   * @return isOriginRedirectionEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getIsOriginRedirectionEnabled() {
    return isOriginRedirectionEnabled;
  }


  public void setIsOriginRedirectionEnabled(Boolean isOriginRedirectionEnabled) {
    this.isOriginRedirectionEnabled = isOriginRedirectionEnabled;
  }


  public OriginsResultResponse hostHeader(String hostHeader) {
    
    this.hostHeader = hostHeader;
    return this;
  }

   /**
   * Get hostHeader
   * @return hostHeader
  **/
  @javax.annotation.Nonnull
  public String getHostHeader() {
    return hostHeader;
  }


  public void setHostHeader(String hostHeader) {
    this.hostHeader = hostHeader;
  }


  public OriginsResultResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public OriginsResultResponse originPath(String originPath) {
    
    this.originPath = originPath;
    return this;
  }

   /**
   * Get originPath
   * @return originPath
  **/
  @javax.annotation.Nonnull
  public String getOriginPath() {
    return originPath;
  }


  public void setOriginPath(String originPath) {
    this.originPath = originPath;
  }


  public OriginsResultResponse connectionTimeout(Long connectionTimeout) {
    
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @javax.annotation.Nonnull
  public Long getConnectionTimeout() {
    return connectionTimeout;
  }


  public void setConnectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }


  public OriginsResultResponse timeoutBetweenBytes(Long timeoutBetweenBytes) {
    
    this.timeoutBetweenBytes = timeoutBetweenBytes;
    return this;
  }

   /**
   * Get timeoutBetweenBytes
   * @return timeoutBetweenBytes
  **/
  @javax.annotation.Nonnull
  public Long getTimeoutBetweenBytes() {
    return timeoutBetweenBytes;
  }


  public void setTimeoutBetweenBytes(Long timeoutBetweenBytes) {
    this.timeoutBetweenBytes = timeoutBetweenBytes;
  }


  public OriginsResultResponse hmacAuthentication(Boolean hmacAuthentication) {
    
    this.hmacAuthentication = hmacAuthentication;
    return this;
  }

   /**
   * Get hmacAuthentication
   * @return hmacAuthentication
  **/
  @javax.annotation.Nonnull
  public Boolean getHmacAuthentication() {
    return hmacAuthentication;
  }


  public void setHmacAuthentication(Boolean hmacAuthentication) {
    this.hmacAuthentication = hmacAuthentication;
  }


  public OriginsResultResponse hmacRegionName(String hmacRegionName) {
    
    this.hmacRegionName = hmacRegionName;
    return this;
  }

   /**
   * Get hmacRegionName
   * @return hmacRegionName
  **/
  @javax.annotation.Nonnull
  public String getHmacRegionName() {
    return hmacRegionName;
  }


  public void setHmacRegionName(String hmacRegionName) {
    this.hmacRegionName = hmacRegionName;
  }


  public OriginsResultResponse hmacAccessKey(String hmacAccessKey) {
    
    this.hmacAccessKey = hmacAccessKey;
    return this;
  }

   /**
   * Get hmacAccessKey
   * @return hmacAccessKey
  **/
  @javax.annotation.Nonnull
  public String getHmacAccessKey() {
    return hmacAccessKey;
  }


  public void setHmacAccessKey(String hmacAccessKey) {
    this.hmacAccessKey = hmacAccessKey;
  }


  public OriginsResultResponse hmacSecretKey(String hmacSecretKey) {
    
    this.hmacSecretKey = hmacSecretKey;
    return this;
  }

   /**
   * Get hmacSecretKey
   * @return hmacSecretKey
  **/
  @javax.annotation.Nonnull
  public String getHmacSecretKey() {
    return hmacSecretKey;
  }


  public void setHmacSecretKey(String hmacSecretKey) {
    this.hmacSecretKey = hmacSecretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginsResultResponse originsResultResponse = (OriginsResultResponse) o;
    return Objects.equals(this.originId, originsResultResponse.originId) &&
        Objects.equals(this.originKey, originsResultResponse.originKey) &&
        Objects.equals(this.name, originsResultResponse.name) &&
        Objects.equals(this.originType, originsResultResponse.originType) &&
        Objects.equals(this.addresses, originsResultResponse.addresses) &&
        Objects.equals(this.originProtocolPolicy, originsResultResponse.originProtocolPolicy) &&
        Objects.equals(this.isOriginRedirectionEnabled, originsResultResponse.isOriginRedirectionEnabled) &&
        Objects.equals(this.hostHeader, originsResultResponse.hostHeader) &&
        Objects.equals(this.method, originsResultResponse.method) &&
        Objects.equals(this.originPath, originsResultResponse.originPath) &&
        Objects.equals(this.connectionTimeout, originsResultResponse.connectionTimeout) &&
        Objects.equals(this.timeoutBetweenBytes, originsResultResponse.timeoutBetweenBytes) &&
        Objects.equals(this.hmacAuthentication, originsResultResponse.hmacAuthentication) &&
        Objects.equals(this.hmacRegionName, originsResultResponse.hmacRegionName) &&
        Objects.equals(this.hmacAccessKey, originsResultResponse.hmacAccessKey) &&
        Objects.equals(this.hmacSecretKey, originsResultResponse.hmacSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originId, originKey, name, originType, addresses, originProtocolPolicy, isOriginRedirectionEnabled, hostHeader, method, originPath, connectionTimeout, timeoutBetweenBytes, hmacAuthentication, hmacRegionName, hmacAccessKey, hmacSecretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginsResultResponse {\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    originKey: ").append(toIndentedString(originKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    originProtocolPolicy: ").append(toIndentedString(originProtocolPolicy)).append("\n");
    sb.append("    isOriginRedirectionEnabled: ").append(toIndentedString(isOriginRedirectionEnabled)).append("\n");
    sb.append("    hostHeader: ").append(toIndentedString(hostHeader)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    originPath: ").append(toIndentedString(originPath)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    timeoutBetweenBytes: ").append(toIndentedString(timeoutBetweenBytes)).append("\n");
    sb.append("    hmacAuthentication: ").append(toIndentedString(hmacAuthentication)).append("\n");
    sb.append("    hmacRegionName: ").append(toIndentedString(hmacRegionName)).append("\n");
    sb.append("    hmacAccessKey: ").append(toIndentedString(hmacAccessKey)).append("\n");
    sb.append("    hmacSecretKey: ").append(toIndentedString(hmacSecretKey)).append("\n");
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
    openapiFields.add("origin_id");
    openapiFields.add("origin_key");
    openapiFields.add("name");
    openapiFields.add("origin_type");
    openapiFields.add("addresses");
    openapiFields.add("origin_protocol_policy");
    openapiFields.add("is_origin_redirection_enabled");
    openapiFields.add("host_header");
    openapiFields.add("method");
    openapiFields.add("origin_path");
    openapiFields.add("connection_timeout");
    openapiFields.add("timeout_between_bytes");
    openapiFields.add("hmac_authentication");
    openapiFields.add("hmac_region_name");
    openapiFields.add("hmac_access_key");
    openapiFields.add("hmac_secret_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("origin_id");
    openapiRequiredFields.add("origin_key");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("origin_type");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("origin_protocol_policy");
    openapiRequiredFields.add("is_origin_redirection_enabled");
    openapiRequiredFields.add("host_header");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("origin_path");
    openapiRequiredFields.add("connection_timeout");
    openapiRequiredFields.add("timeout_between_bytes");
    openapiRequiredFields.add("hmac_authentication");
    openapiRequiredFields.add("hmac_region_name");
    openapiRequiredFields.add("hmac_access_key");
    openapiRequiredFields.add("hmac_secret_key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OriginsResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OriginsResultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginsResultResponse is not found in the empty JSON string", OriginsResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OriginsResultResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginsResultResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OriginsResultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("origin_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("origin_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        OriginsResultResponseAddresses.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("origin_protocol_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_protocol_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_protocol_policy").toString()));
      }
      if (!jsonObj.get("host_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_header").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("origin_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_path").toString()));
      }
      if (!jsonObj.get("hmac_region_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_region_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_region_name").toString()));
      }
      if (!jsonObj.get("hmac_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_access_key").toString()));
      }
      if (!jsonObj.get("hmac_secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hmac_secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmac_secret_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginsResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginsResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginsResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginsResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginsResultResponse>() {
           @Override
           public void write(JsonWriter out, OriginsResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginsResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OriginsResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OriginsResultResponse
  * @throws IOException if the JSON string is invalid with respect to OriginsResultResponse
  */
  public static OriginsResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginsResultResponse.class);
  }

 /**
  * Convert an instance of OriginsResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

