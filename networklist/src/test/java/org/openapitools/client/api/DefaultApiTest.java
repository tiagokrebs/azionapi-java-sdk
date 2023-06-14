/*
 * Azion API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BadRequestResponse;
import org.openapitools.client.model.CreateNetworkListsRequest;
import org.openapitools.client.model.ErrorModel;
import org.openapitools.client.model.ListNetworkListsResponse;
import org.openapitools.client.model.NetworkListsResponse;
import org.openapitools.client.model.UpdateNetworkListsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * List all user Network Lists
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkListsGetTest() throws ApiException {
        Integer page = null;
        ListNetworkListsResponse response = api.networkListsGet(page);
        // TODO: test validations
    }

    /**
     * Create a Network Lists
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkListsPostTest() throws ApiException {
        CreateNetworkListsRequest createNetworkListsRequest = null;
        api.networkListsPost(createNetworkListsRequest);
        // TODO: test validations
    }

    /**
     * Retrieve a Network Lists set by uuid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkListsUuidGetTest() throws ApiException {
        String uuid = null;
        NetworkListsResponse response = api.networkListsUuidGet(uuid);
        // TODO: test validations
    }

    /**
     * Overwrite some Network Lists attributes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void networkListsUuidPutTest() throws ApiException {
        String uuid = null;
        UpdateNetworkListsRequest updateNetworkListsRequest = null;
        ListNetworkListsResponse response = api.networkListsUuidPut(uuid, updateNetworkListsRequest);
        // TODO: test validations
    }

}
