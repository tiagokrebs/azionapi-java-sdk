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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CreateCustomDataStreamingResponse;
import org.openapitools.client.model.CreateDataStreamingResponse;
import org.openapitools.client.model.PostCustomDataStreamingResponse;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-22T12:30:18.138783Z[GMT]")
public class CreateNewDataStreaming201Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateNewDataStreaming201Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateNewDataStreaming201Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateNewDataStreaming201Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateCustomDataStreamingResponse> adapterCreateCustomDataStreamingResponse = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomDataStreamingResponse.class));
            final TypeAdapter<CreateDataStreamingResponse> adapterCreateDataStreamingResponse = gson.getDelegateAdapter(this, TypeToken.get(CreateDataStreamingResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateNewDataStreaming201Response>() {
                @Override
                public void write(JsonWriter out, CreateNewDataStreaming201Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateCustomDataStreamingResponse`
                    if (value.getActualInstance() instanceof CreateCustomDataStreamingResponse) {
                        JsonObject obj = adapterCreateCustomDataStreamingResponse.toJsonTree((CreateCustomDataStreamingResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CreateDataStreamingResponse`
                    if (value.getActualInstance() instanceof CreateDataStreamingResponse) {
                        JsonObject obj = adapterCreateDataStreamingResponse.toJsonTree((CreateDataStreamingResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateCustomDataStreamingResponse, CreateDataStreamingResponse");
                }

                @Override
                public CreateNewDataStreaming201Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateCustomDataStreamingResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateCustomDataStreamingResponse.validateJsonObject(jsonObject);
                        actualAdapter = adapterCreateCustomDataStreamingResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateCustomDataStreamingResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateCustomDataStreamingResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateCustomDataStreamingResponse'", e);
                    }

                    // deserialize CreateDataStreamingResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateDataStreamingResponse.validateJsonObject(jsonObject);
                        actualAdapter = adapterCreateDataStreamingResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateDataStreamingResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateDataStreamingResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateDataStreamingResponse'", e);
                    }

                    if (match == 1) {
                        CreateNewDataStreaming201Response ret = new CreateNewDataStreaming201Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateNewDataStreaming201Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateNewDataStreaming201Response() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateNewDataStreaming201Response(CreateCustomDataStreamingResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateNewDataStreaming201Response(CreateDataStreamingResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateCustomDataStreamingResponse", new GenericType<CreateCustomDataStreamingResponse>() {
        });
        schemas.put("CreateDataStreamingResponse", new GenericType<CreateDataStreamingResponse>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateNewDataStreaming201Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateCustomDataStreamingResponse, CreateDataStreamingResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateCustomDataStreamingResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateDataStreamingResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateCustomDataStreamingResponse, CreateDataStreamingResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateCustomDataStreamingResponse, CreateDataStreamingResponse
     *
     * @return The actual instance (CreateCustomDataStreamingResponse, CreateDataStreamingResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateCustomDataStreamingResponse`. If the actual instance is not `CreateCustomDataStreamingResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCustomDataStreamingResponse`
     * @throws ClassCastException if the instance is not `CreateCustomDataStreamingResponse`
     */
    public CreateCustomDataStreamingResponse getCreateCustomDataStreamingResponse() throws ClassCastException {
        return (CreateCustomDataStreamingResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDataStreamingResponse`. If the actual instance is not `CreateDataStreamingResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDataStreamingResponse`
     * @throws ClassCastException if the instance is not `CreateDataStreamingResponse`
     */
    public CreateDataStreamingResponse getCreateDataStreamingResponse() throws ClassCastException {
        return (CreateDataStreamingResponse)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateNewDataStreaming201Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateCustomDataStreamingResponse
    try {
      CreateCustomDataStreamingResponse.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateCustomDataStreamingResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateDataStreamingResponse
    try {
      CreateDataStreamingResponse.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateDataStreamingResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateNewDataStreaming201Response with oneOf schemas: CreateCustomDataStreamingResponse, CreateDataStreamingResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateNewDataStreaming201Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateNewDataStreaming201Response
  * @throws IOException if the JSON string is invalid with respect to CreateNewDataStreaming201Response
  */
  public static CreateNewDataStreaming201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateNewDataStreaming201Response.class);
  }

 /**
  * Convert an instance of CreateNewDataStreaming201Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

