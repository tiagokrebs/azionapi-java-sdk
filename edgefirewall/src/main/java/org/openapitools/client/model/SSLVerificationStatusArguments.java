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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SSLVerificationStatusArguments
 */
@JsonAdapter(SSLVerificationStatusArguments.Adapter.class)
public enum SSLVerificationStatusArguments {
  
  SUCCESS("SUCCESS"),
  
  CERTIFICATE_VERIFICATION_ERROR("CERTIFICATE_VERIFICATION_ERROR"),
  
  MISSING_CLIENT_CERTIFICATE("MISSING_CLIENT_CERTIFICATE");

  private String value;

  SSLVerificationStatusArguments(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SSLVerificationStatusArguments fromValue(String value) {
    for (SSLVerificationStatusArguments b : SSLVerificationStatusArguments.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SSLVerificationStatusArguments> {
    @Override
    public void write(final JsonWriter jsonWriter, final SSLVerificationStatusArguments enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SSLVerificationStatusArguments read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SSLVerificationStatusArguments.fromValue(value);
    }
  }
}

