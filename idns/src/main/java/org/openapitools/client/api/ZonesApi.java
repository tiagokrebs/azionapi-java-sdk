/*
 * Intelligent DNS
 * Azion Intelligent DNS API
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ErrorsResponse;
import org.openapitools.client.model.GetZoneResponse;
import org.openapitools.client.model.GetZonesResponse;
import org.openapitools.client.model.PostOrPutZoneResponse;
import org.openapitools.client.model.Zone;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ZonesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZonesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZonesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for deleteZone
     * @param zoneId The hosted zone id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Zone removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteZoneCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteZoneValidateBeforeCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling deleteZone(Async)");
        }

        return deleteZoneCall(zoneId, _callback);

    }

    /**
     * Remove an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Zone removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public String deleteZone(Integer zoneId) throws ApiException {
        ApiResponse<String> localVarResp = deleteZoneWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Remove an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Zone removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> deleteZoneWithHttpInfo(Integer zoneId) throws ApiException {
        okhttp3.Call localVarCall = deleteZoneValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove an Intelligent DNS hosted zone (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Zone removed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteZoneAsync(Integer zoneId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteZoneValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getZone
     * @param zoneId The hosted zone id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone retrieved </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZoneValidateBeforeCall(Integer zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling getZone(Async)");
        }

        return getZoneCall(zoneId, _callback);

    }

    /**
     * Get an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @return GetZoneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone retrieved </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public GetZoneResponse getZone(Integer zoneId) throws ApiException {
        ApiResponse<GetZoneResponse> localVarResp = getZoneWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Get an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @return ApiResponse&lt;GetZoneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone retrieved </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetZoneResponse> getZoneWithHttpInfo(Integer zoneId) throws ApiException {
        okhttp3.Call localVarCall = getZoneValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<GetZoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an Intelligent DNS hosted zone (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone retrieved </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Zone not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZoneAsync(Integer zoneId, final ApiCallback<GetZoneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZoneValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<GetZoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getZones
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/intelligent_dns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZonesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getZonesCall(_callback);

    }

    /**
     * Get a collection of Intelligent DNS zones
     * 
     * @return GetZonesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetZonesResponse getZones() throws ApiException {
        ApiResponse<GetZonesResponse> localVarResp = getZonesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get a collection of Intelligent DNS zones
     * 
     * @return ApiResponse&lt;GetZonesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetZonesResponse> getZonesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getZonesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetZonesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a collection of Intelligent DNS zones (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zones collection retrieved </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesAsync(final ApiCallback<GetZonesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZonesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetZonesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postZone
     * @param zone  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZoneCall(Zone zone, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = zone;

        // create path and map variables
        String localVarPath = "/intelligent_dns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postZoneValidateBeforeCall(Zone zone, final ApiCallback _callback) throws ApiException {
        return postZoneCall(zone, _callback);

    }

    /**
     * Add a new Intelligent DNS zone
     * 
     * @param zone  (optional)
     * @return PostOrPutZoneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public PostOrPutZoneResponse postZone(Zone zone) throws ApiException {
        ApiResponse<PostOrPutZoneResponse> localVarResp = postZoneWithHttpInfo(zone);
        return localVarResp.getData();
    }

    /**
     * Add a new Intelligent DNS zone
     * 
     * @param zone  (optional)
     * @return ApiResponse&lt;PostOrPutZoneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostOrPutZoneResponse> postZoneWithHttpInfo(Zone zone) throws ApiException {
        okhttp3.Call localVarCall = postZoneValidateBeforeCall(zone, null);
        Type localVarReturnType = new TypeToken<PostOrPutZoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add a new Intelligent DNS zone (asynchronously)
     * 
     * @param zone  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone added </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZoneAsync(Zone zone, final ApiCallback<PostOrPutZoneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postZoneValidateBeforeCall(zone, _callback);
        Type localVarReturnType = new TypeToken<PostOrPutZoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putZone
     * @param zoneId The hosted zone id (required)
     * @param zone  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneCall(Integer zoneId, Zone zone, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = zone;

        // create path and map variables
        String localVarPath = "/intelligent_dns/{zone_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; version=3"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "tokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putZoneValidateBeforeCall(Integer zoneId, Zone zone, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling putZone(Async)");
        }

        return putZoneCall(zoneId, zone, _callback);

    }

    /**
     * Update an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @param zone  (optional)
     * @return PostOrPutZoneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
     </table>
     */
    public PostOrPutZoneResponse putZone(Integer zoneId, Zone zone) throws ApiException {
        ApiResponse<PostOrPutZoneResponse> localVarResp = putZoneWithHttpInfo(zoneId, zone);
        return localVarResp.getData();
    }

    /**
     * Update an Intelligent DNS hosted zone
     * 
     * @param zoneId The hosted zone id (required)
     * @param zone  (optional)
     * @return ApiResponse&lt;PostOrPutZoneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostOrPutZoneResponse> putZoneWithHttpInfo(Integer zoneId, Zone zone) throws ApiException {
        okhttp3.Call localVarCall = putZoneValidateBeforeCall(zoneId, zone, null);
        Type localVarReturnType = new TypeToken<PostOrPutZoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update an Intelligent DNS hosted zone (asynchronously)
     * 
     * @param zoneId The hosted zone id (required)
     * @param zone  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Zone updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Zone update error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putZoneAsync(Integer zoneId, Zone zone, final ApiCallback<PostOrPutZoneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = putZoneValidateBeforeCall(zoneId, zone, _callback);
        Type localVarReturnType = new TypeToken<PostOrPutZoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
