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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.TemplateResultById;
import org.openapitools.client.model.TemplateResults;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataStreamingTemplatesApi
 */
@Disabled
public class DataStreamingTemplatesApiTest {

    private final DataStreamingTemplatesApi api = new DataStreamingTemplatesApi();

    /**
     * Get an global Template info by template ID
     *
     * Use the GET method and add the data streaming&#39;s ID to the URI of the request to get more data on a specific data streaming global template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataStramingTemplateByIdTest() throws ApiException {
        Integer templateId = null;
        TemplateResultById response = api.getDataStramingTemplateById(templateId);
        // TODO: test validations
    }

    /**
     * List all global Templates that can be used on Data Streaming operations
     *
     * Use the GET method to list all global templates that can be used on Data Streaming operations.  **Note:** Customized templates won&#39;t be listed. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDataStreamingTemplatesTest() throws ApiException {
        TemplateResults response = api.listDataStreamingTemplates();
        // TODO: test validations
    }

}
